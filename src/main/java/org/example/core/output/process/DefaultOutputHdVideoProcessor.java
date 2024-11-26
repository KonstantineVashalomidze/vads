package org.example.core.output.process;

import org.example.core.output.model.OutputData;
import org.example.core.output.model.Resolution;
import org.example.core.output.util.ColorMatcher;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.List;

/**
 * @author Konstantine Vashalomidze
 * HD_720P(1280, 720)
 * The conversion algorithm of byte array into image is the following:
 *
 *
 */
public class DefaultOutputHdVideoProcessor
    implements OutputDataProcessor
{
    private Resolution resolution = Resolution.HD_720P;
    private ColorMatcher colorMatcher = new ColorMatcher();

    @Override
    public OutputData process(byte[] bytes) {
        encodeByteArrayIntoImage(bytes);

        return null;

    }




    private void encodeByteArrayIntoImage(byte[] bytes)
    {
        List<String> binaries = new ArrayList<>();
        for (byte byt: bytes){
            // convert byte to binary
            String bytToBinary = Integer.toBinaryString(byt);
            binaries.add(bytToBinary);
        }
        String bitString = String.join("x", binaries);

        int bitStringLength = bitString.length();
        bitString += "x";

        // determine number of frames needed to store bitstring
        int capacity = resolution.getWidth() * resolution.getHeight();
        int needFrame = (bitStringLength + capacity - 1) / capacity;

        // create buffered images
        BufferedImage[] bufferedImages = new BufferedImage[needFrame];
        for (int i = 0; i < bufferedImages.length; i++)
        {
            bufferedImages[i] = new BufferedImage(Resolution.HD_720P.getWidth(), Resolution.HD_720P.getHeight(), BufferedImage.TYPE_INT_RGB);
            int y = 0;
            while (y < Resolution.HD_720P.getHeight())
            {
                int x= 0;
                while (x < Resolution.HD_720P.getWidth())
                {
                    if (y * Resolution.HD_720P.getWidth() + x >= bitStringLength)
                        break;
                    // write current binary into image
                    char currentChar = bitString.charAt(y * Resolution.HD_720P.getWidth() + x);
                    if (currentChar == '1')
                    {
                        bufferedImages[i].setRGB(x, y, Color.WHITE.getRGB());
                    } else if(currentChar == '0') {
                        bufferedImages[i].setRGB(x, y, Color.BLACK.getRGB());
                    } else {
                        bufferedImages[i].setRGB(x, y, Color.RED.getRGB());
                    }
                    x++;
                }
                y++;

            }
        }


        for (var bfi : bufferedImages)
        {
            try {
                BufferedImage bi = bufferedImages[0];  // retrieve image
                File outputfile = new File("src/main/resources/saved" + bfi.hashCode() + ".png");
                ImageIO.write(bi, "png", outputfile);
            } catch (IOException e) {
                // handle exception
            }
        }



    }


}

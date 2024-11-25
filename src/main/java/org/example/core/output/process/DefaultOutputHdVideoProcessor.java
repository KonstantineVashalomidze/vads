package org.example.core.output.process;

import org.example.core.output.model.OutputData;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.HashMap;

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
    private BufferedImage bufferedImage;
    private HashMap<Byte, Integer> byteToBinary;


    public DefaultOutputHdVideoProcessor()
    {
        byteToBinary = new HashMap<>();
        for (int i = Byte.MIN_VALUE; i <= Byte.MAX_VALUE; i++) {
            byte b = (byte) i;
            int binary = 0;

            // Convert byte to binary representation
            for (int bit = 7; bit >= 0; bit--) {
                binary = binary * 10 + ((b >> bit) & 1);
            }

            byteToBinary.put(b, binary);
        }

    }


    @Override
    public OutputData process(byte[] bytes) {


        return null;

    }




    private void encodeByteArrayIntoImage(int[] binaries, int continueFromIndex)
    {
        int width = bufferedImage.getWidth(), height = bufferedImage.getHeight();

//        for (int i = 0; i < height; i++)
//        {
//            for (int j = 0; j < width; j++)
//            {
//                if (width * height < bytes.length)
//                {
//                    encodeByteArrayIntoImage(bytes, j + i);
//                }
//                    bufferedImage.setRGB(j, i, );
//            }
//        }
    }


}

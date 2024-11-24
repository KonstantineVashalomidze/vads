## Requirements
1. Application should accept different kind of formats and should be easily extendable to include more formats later.
2. Application should have method for encoding data into image and vice versa
3. Data can be different, starting with just some text file ending with json, so this should be easily addable at any time.
4. The output of the encoding image extension should also be configurable.
5. Application should address distributing data into image and if the one image is not enough to hold that much data then other empty image template should be provided to continue working and to decode we will use all encoded images.
6. Application should contain very good logger service to always inform in what state is the program.
7. The application should have method to convert encoded images in video. the time for which there will be frame change should be user configurable.
8. The converted video should be convertable into those initial frames, user provides time between frame changes as well.

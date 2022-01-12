// need to implement webcam input
//need to add a break-off for loop if the color desired is detected, for efficiency

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ColorDetect {
    public static void main(String[] args) throws IOException {
        //read in webcam input here, file supplied as placeholder
        BufferedImage image = ImageIO.read(new File("example.png"));

        //dimensions of image, don't question the method calls (Java is weird)
        int length = image.getWidth();
        int width = image.getHeight();
        System.out.println("dimensions are: " + length  +"x" + width);

        //loop thru each pixel and get RGB value
        for (int x = 0; x < length; x++) {
            for (int y = 0; y < width; y++) {
                int color = image.getRGB(x,y);
                int red = (color & 0x00ff0000) >> 16;
                int green = (color & 0x0000ff00) >> 8;
                int blue = color & 0x000000ff;
        
                // prints pixel coordinate
                System.out.println(x + ", " + y);
                //prints RGB value
                System.out.println("r: " + red + " g: " + green + " b: " + blue);

            }
        }
    }
}

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;

public class imager {
    public static void main(String... args) throws Exception {

        BufferedImage image = ImageIO.read(
                new URL("https://andymark-weblinc.netdna-ssl.com/product_images/infinite-recharge-power-cell/61893d825fd31c013af07a10/zoom.jpg?c=1636384130"));

        int w = image.getWidth();
        int h = image.getHeight();

        int[] dataBuffInt = image.getRGB(w/4, h/4, 3*w/4, 3*h/4, null, 0, w);

        Color c = new Color(dataBuffInt[100]);

        int red = 0;
        int blue = 0;
        int green = 0;
        int alpha = 0;
        Color temp;

        for (int pixel : dataBuffInt) {

            temp = new Color(pixel);

            red += temp.getRed();
            blue += temp.getBlue();
            green += temp.getGreen();
            alpha += temp.getAlpha();

        }

        red /= dataBuffInt.length;
        blue /= dataBuffInt.length;
        green /= dataBuffInt.length;
        alpha /= dataBuffInt.length;

        System.out.println(red);   // = (dataBuffInt[100] >> 16) & 0xFF
        System.out.println(blue); // = (dataBuffInt[100] >> 8)  & 0xFF
        System.out.println(green);  // = (dataBuffInt[100] >> 0)  & 0xFF
        System.out.println(alpha); // = (dataBuffInt[100] >> 24) & 0xFF
    }
}

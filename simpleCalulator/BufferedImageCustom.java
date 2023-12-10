package simpleCalulator;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

class BufferedImageCustom {
    public Image imageReturn()
    throws IOException{
        Image image;

        InputStream bis = getClass().getResourceAsStream("/assert/logo.jpg");
        BufferedImage bImage = ImageIO.read(bis);
        image = bImage;

        return image;
    }
}

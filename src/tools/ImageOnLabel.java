/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author edenj
 */
public class ImageOnLabel {

    public static ImageIcon getIconCircle(String src) throws IOException {
        BufferedImage image = ImageIO.read(new File(src));
        Area clip = new Area(new Rectangle(0, 0, image.getWidth(), image.getHeight()));
        Area oval = new Area(new Ellipse2D.Double(0, 0, image.getWidth() - 1, image.getHeight() - 1));
        clip.subtract(oval);
        Graphics g2d = image.createGraphics();
        System.out.println("Hola");
        g2d.setClip(clip);
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, image.getWidth(), image.getHeight());
        return new ImageIcon(image);
    }
}

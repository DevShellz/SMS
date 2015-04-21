/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shha;
import java.io.*;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.*;

/**
 *
 * @author Brian
 */
public class mp3Player {
    
    
    public static void mp3Player() throws FileNotFoundException, JavaLayerException{
        
        File file = new File("C:\\Users\\Brian\\Documents\\NetBeansProjects\\GreyTek_SMS_2\\SMS_2\\src\\shha\\Scrubs.mp3");
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        
        Player player = new Player(bis);
        player.play();
        
    }
    
}
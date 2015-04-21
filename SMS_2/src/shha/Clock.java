/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shha;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import static shha.mainGUI2.timeLabel;
/**
 *
 * @author Sheldon
 */
public class Clock {
   
    Toolkit toolkit;

    Timer timer;

    public Clock() {
        toolkit = Toolkit.getDefaultToolkit();
        timer = new Timer();
        timer.schedule(new StartClock(), 0, //initial delay
            60 * 1000); //subsequent rate
    }

    class StartClock extends TimerTask {
        int runClock = 1;

        public void run() {
            if (runClock > 0) {
                toolkit.beep();

                Date date;
                DateFormat dateFormat = new SimpleDateFormat("hh:mm a");
                Calendar calendar = Calendar.getInstance(Locale.getDefault());
                java.util.Date now = calendar.getTime();
                date = now;         //make timeIn that calendar time
                
                String delim = "[ ]";
                String[] tokens = now.toString().split(delim);
                
                
                String time = dateFormat.format(now);
                //Parse Time - Remove 0 ex. 03:00 PM > 3:00 PM
                int i = time.length();
                if (time.charAt(0) == '0')
                { 
                    time = time.substring(1); 
                }
                String displayDate = (tokens[0] + " " + tokens[1] + " " + tokens[2] + 
                        " " + tokens[5] + " " + time);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Clock.class.getName()).log(Level.SEVERE, null, ex);
                }
                timeLabel.setText(displayDate);

            } else {
                toolkit.beep();
                System.exit(0); //Stops the AWT thread (and everything else)
            }
        }
    }

    public static void main(String args[]) {
      new Clock();
    }
    
}

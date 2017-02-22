import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class ChessClock extends JFrame{
  
   JFrame frame = new JFrame("The Clock is Ticking...");
   public ChessClock(){
      int digits;
      frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setSize(275,120);
      frame.add(new Pane());
      //end
      frame.setVisible(true);
   }
   
   public int getTime(){
         Pane pae = new Pane();
         return pae.give();
   }
        
   public class Pane extends JPanel{
        private DigitPane hour;
        private DigitPane min;
        private DigitPane second;
        private JLabel[] seperator;

        private int tick = 0;//time
        
                
        //this totally isnt jank
        public int give(){
         return tick;
        }
        
        public Pane() {
            setLayout(new GridBagLayout());

            hour = new DigitPane();
            min = new DigitPane();
            second = new DigitPane();
            seperator = new JLabel[]{new JLabel(":"), new JLabel(":")};

            add(hour);
            add(seperator[0]);
            add(min);
            add(seperator[1]);
            add(second);

            Timer timer = new Timer(500, new ActionListener() {
            
                @Override
                public void actionPerformed(ActionEvent e) {
                    Calendar cal = Calendar.getInstance();
                    hour.setValue(cal.get(Calendar.HOUR_OF_DAY));
                    min.setValue(cal.get(Calendar.MINUTE));
                    second.setValue(cal.get(Calendar.SECOND));

                    if (tick % 2 == 1) {
                        seperator[0].setText(" ");
                        seperator[1].setText(" ");
                    } else {
                        seperator[0].setText(":");
                        seperator[1].setText(":");
                    }
                    tick++;
                }
            });
            timer.setRepeats(true);
            timer.setCoalesce(true);
            timer.start();
        }

    }

    public class DigitPane extends JPanel {

        private int value;

        @Override
        public Dimension getPreferredSize() {
            FontMetrics fm = getFontMetrics(getFont());
            return new Dimension(fm.stringWidth("00"), fm.getHeight()); //fkng degenerate
        }

        public void setValue(int aValue) {
            if (value != aValue) {
                int old = value;
                value = aValue;
                firePropertyChange("value", old, value);
                repaint();
            }
        }

        public int getValue() {
        return value;
        }

        protected String pad(int value) {
            StringBuilder sb = new StringBuilder(String.valueOf(value));
            while (sb.length() < 2) {
                sb.insert(0, "0");//the jank is unreal
            }
            return sb.toString();
        }

         @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); 
            String text = pad(getValue());
            FontMetrics fm = getFontMetrics(g.getFont());
            int x = (getWidth() - fm.stringWidth(text)) / 2;
            int y = ((getHeight()- fm.getHeight()) / 2) + fm.getAscent();
            g.drawString(text, x, y);
        }        
   }
}

/*
import java.util.*;
import java.text.*;
*/

/*
DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
Date date = new Date();
System.out.println(dateFormat.format(date)+"\n");
*/
         
         
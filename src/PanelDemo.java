// Fig. 11.44: PanelDemo.java
// Testing PanelFrame.
import javax.swing.JFrame;

public class PanelDemo extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public static void main(String args[])
   { 
      PanelFrame panelFrame = new PanelFrame(); 
      panelFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      panelFrame.setSize( 450, 200 ); // set frame size
      panelFrame.setVisible( true ); // display frame
   } // end main
} // end class PanelDemo

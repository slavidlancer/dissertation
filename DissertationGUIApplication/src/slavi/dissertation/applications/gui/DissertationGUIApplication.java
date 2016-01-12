package slavi.dissertation.applications.gui;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 * DissertationGUIApplication
 *
 * @author      Slavi Dimitrov
 * @version     1.0.0
 * @since       2016-01-11
 */
public class DissertationGUIApplication {
    private JFrame frame;

    /*
     * Main method.
     * @param args unused
     * @return nothing
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DissertationGUIApplication window =
                            new DissertationGUIApplication();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /*
     * Constructor.
     */
    public DissertationGUIApplication() {
        initialize();
    }

    /*
     * Initialize method.
     * @return nothing
     * @since 1.0.0
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

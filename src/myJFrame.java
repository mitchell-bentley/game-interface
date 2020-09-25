import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class myJFrame extends JFrame
{
    myJTabbedPane mjp;
    JButton jb1;
    public myJFrame ()
    {
        super ("My First Frame");
        mjp = new myJTabbedPane();
        
        getContentPane().add(mjp,"Center");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize (1200, 650);
        setVisible(true);
        //jb1 = new JButton("Menu");
        //setLayout(new GridLayout(2,1));
        //jb1.addActionListener(this);
        //add(jb1);
        
        
//        mjp.setEnabledAt(0,true);
//    	mjp.setEnabledAt(1,true);
//    	mjp.setEnabledAt(2,true);
//        mjp.setEnabledAt(3,true);
    }
    private void setupLayoutForMacs()
    {
        // On some MACs it might be necessary to have the statement below 
        //for the background color of the button to appear    
        try
        {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        //------------------------------------------------------
    }
}
//    public void selectPane()
//    {
//        mjp.setSelectedIndex(0);
//    }
//    public void actionPerformed(ActionEvent event) 
//    {
//       	Object obj = event.getSource();
//       	 
//     	if (obj == jb1)
//        {
//            System.out.println("hi");
//            selectPane();
//        }
//    }
//}

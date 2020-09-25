import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class myJTabbedPane extends JTabbedPane implements ActionListener
{
    Instructions mjp1;
    Game1 mjp2;
    Game2 mjp3;
    Game3 mjp4;
    JButton jb1;
    public static int score = 0;
   
    public myJTabbedPane()
    {
        super();
        //MacLayoutSetup();
        setBackground(Color.pink);
        mjp1 = new Instructions();
        mjp2 = new Game1();
        mjp3 = new Game2();
        mjp4 = new Game3();
      
        addTab("Intro", mjp1);
        addTab("Game 1", mjp2);
        addTab("Game 2", mjp3);
        addTab("Game 3", mjp4);

        
        mjp2.b2.addActionListener(this);
        mjp3.jb1.addActionListener(this);
        mjp4.jb1.addActionListener(this);

    }
    public void actionPerformed(ActionEvent event)
    {

        Object obj = event.getSource();
       
//        if (obj == mjp1.jb1)
//        {
//            addTab("Game 1", mjp2);
//            setSelectedIndex(1);
//        }
//        if (obj == mjp1.jb2)
//        {
//            addTab("Game 2", mjp3);
//            setSelectedIndex(2);
//        }
//        if (obj == mjp1.jb3)
//        {
//            addTab("Game 3", mjp4);
//            setSelectedIndex(3);
//        }
        if (obj == mjp2.b2)
        {
            //remove(mjp2);
            setSelectedIndex(0);
        }
        if (obj == mjp3.jb1)
        {
            setSelectedIndex(0);
        }
        if (obj == mjp4.jb1)
        {
            setSelectedIndex(0);
        }
    }
    
}

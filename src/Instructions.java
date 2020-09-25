import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.Timer;
public class Instructions extends JPanel implements ActionListener
{
    Timer tim;
    JLabel jf1, jf2, jf3, jf4;
    myJTabbedPane mjp;
    int i = 0;
    String timerDisplay = "";
    
    
    public Instructions()
    {
        setBackground(Color.orange);
        jf1 = new JLabel();
        jf2 = new JLabel();
        jf3 = new JLabel();
        jf4 = new JLabel();
        jf1.setText("Instructions:");
        jf2.setText("GAME 1: Click Me Game - Click 'Start' to begin the game. Try to click the 'Click Me' button as many times as possible within a minute!");
        jf3.setText("GAME 2: Penn State Trivia Game - See how many trivia questions about Penn State you can answer correctly!");
        jf4.setText("GAME 3: Mathematics Game - Guess the random number! Fill in your guessed number, and click 'Compare' to check it.");
        GridLayout grid = new GridLayout(8,0,0,0);
        setMaximumSize(new Dimension(400, 400));
        setLayout(grid);
        add(jf1);
        add(jf2);
        add(jf3);
        add(jf4);
        
        tim = new Timer(1000, this);
        tim.start();
        
    }
    public void actionPerformed(ActionEvent event)
    {

        Object obj = event.getSource();
       
        if (obj == tim)
        {
            i = i + 1;
            timerDisplay = "Time played = " + i + " seconds";
            repaint();
        }
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawString(timerDisplay, 10, 560);
        g.drawString("Score: " + getGame1CurrentScore(), 10, 540);
    }

    private String getGame1CurrentScore()
    {
        int game1CurrentScore = Game1.score;

        //print score if value > 0
        if(game1CurrentScore > 0)
        {
            //need to cast game1CurrentScore as a String so g.drawString (line 39) will accept it
            return String.valueOf(game1CurrentScore);
        }

        //otherwise print this message
        return "No score placed yet!";
    }
}
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.Timer;

public class Game1 extends JPanel implements ActionListener, KeyListener
{
    JButton b1, b2;
    Timer tim;
    boolean timerOn = false;
    int i = 0;
    int countdownTimer;
    String timerDisplay = "";
    double timerRoot = 0;
    JProgressBar pbVertical;

    static int score = 0;

    public Game1()
    {
        super();
        
        setBackground(Color.white);
        //setLayout(new BorderLayout());
        b1 = new JButton("Start Game");
        b2 = new JButton("Return to Main Menu");
        b1.addActionListener(this);
        add(b1);
        b2.addActionListener(this);
        add(b2);
        addKeyListener(this);
        b1.setPreferredSize(new Dimension (100, 100));
        
        tim = new Timer(10, this);
        setFocusable(true);
        
        pbVertical = new JProgressBar(JProgressBar.VERTICAL, 0, 60);// 500 the maximun number of intervals that th progress bar will show
        pbVertical.setPreferredSize(new Dimension(10, 570));
        
        add(pbVertical);
        pbVertical.setVisible(false);
        
        //JPanel p1 = new JPanel(); 
        //p1.add(pbVertical);
        //p1.setLocation(3, 2);
        //add(p1, "East");
    }
    private void changeButtonLocation()
    {
        //picks randomo location for button
        int xPosition = (int) (Math.random()*900) + 30;
        int yPosition = (int) (Math.random()*325) + 20;
        b1.setLocation(xPosition, yPosition);
        
    }
    public void gameOver()
    {
        b1.setText("GAME OVER \n Score: " + score);
        pbVertical.setVisible(false);
        b1.setPreferredSize(new Dimension (200, 100));
    }
    public void reset()
    {
        score = 0;
        tim.stop();
        i = 0;
        pbVertical.setVisible(false);
        timerDisplay = "";
        b1.setText("Start Game");
        b1.setPreferredSize(new Dimension (100, 100));
    }
    public void actionPerformed(ActionEvent event)
    {

        Object obj = event.getSource();
        
        if (obj == b1)
        {
            //score is updated and button relocated when pressed
            score = score + 1;
            tim.start();
            changeButtonLocation();
            repaint();
        }
        if (obj == b2)
        {
            reset();         
        }
        if (obj == tim)
        {
            b1.setText("click me");
            //timerDisplay increases with each tick of timer
            i = i + 1;
            timerDisplay = "Time = " + i/100;
            pbVertical.setValue(i/100);
            pbVertical.setVisible(true);
            
            pbVertical.setLocation(1165, 5);
            b2.setLocation(500, 5);
            repaint();
            
            //button changes location exponentially (if sqrt of countdownTimer is whole number)
            countdownTimer = (6000-i);
            timerRoot = Math.sqrt(countdownTimer+100);
            if (timerRoot % 1 == 0)
            {
                changeButtonLocation();
                repaint();
            }
            
            //timer stops after 60 seconds
            if (i == 6000)
            {
                tim.stop();
                gameOver();
            }
        }
    }
   
    public void keyPressed(KeyEvent evt) 
    {
        //when space is pressed, timer starts
        if (evt.getKeyCode() == evt.VK_SPACE)
        {
            tim.start();
        }
    }

    public void keyReleased(KeyEvent evt) {  }

    public void keyTyped(KeyEvent evt) { }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawString("Score = " + score, 10, 520);
        g.drawString("Press 'Start Game' button to start the game", 10, 540);
        g.drawString("You have 60 seconds to keep clicking on the button to score", 10, 560);
        g.drawString(timerDisplay, 10, 500);
    }
}

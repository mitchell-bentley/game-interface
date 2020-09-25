import java.awt.*;
import java.awt.event.ActionEvent;
import java.lang.System;
import javax.swing.*;
import java.util.Random;
import java.util.Arrays;
import java.awt.event.ActionListener;

public class Game3 extends JPanel
{
    myJFrame mjf;  
    JLabel Instruction;
    JTextField myTextField;
    JLabel answer;
    JButton jb1 = new JButton("Main Menu");
    JButton jb2 = new JButton("Compare");
    int score = 0;
    String score_display ="";
   
    boolean generation = true;
    Random random = new Random();
    int gen_random = 3;
    public Game3()
    {
        setBackground(Color.yellow);
        myTextField = new JTextField(10);
        answer = new JLabel("Score: ");
        Random gen_random;
        gen_random = new Random();
        GridLayout grid = new GridLayout(5,1,0,0);
        setLayout(grid);
        boolean correct_num = false;
        add(jb1);
        Instruction = new JLabel("Welcome to the Number Guessing Game, please enter an integer from 0-100 in the box above and try to guess the correct number!");
        add(answer);
        add(myTextField);
        add(Instruction);
        add(jb2);
        jb2.addActionListener(new ButtonListener());
       
    }

    public class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
           
            Object obj = event.getSource();
            String inputer = myTextField.getText();
            int guessed_num = Integer.parseInt(inputer);
           
           
           
            if(generation==true)
            {
              gen_random=random.nextInt(100);
             
              generation=false;
            }
           
            if (obj ==jb1)
            {
           
            }
            else if(obj == jb2)
            {
               
               
                    if (guessed_num == gen_random)
                    {
                         
                        score+=1;
                        score_display = Integer.toString(score);
                        answer.setText("Score: " + score_display);
                        generation = true;

                    }
                    else if(guessed_num < gen_random){
                        answer.setText("Score: "+ score_display +" Number too low. ");
                       
                    }
                    else if(guessed_num > gen_random){
                        answer.setText("Score: "+ score_display +" Number too high");
                       
                   
                    }
           
            }
           
           

           
        }
    }
}
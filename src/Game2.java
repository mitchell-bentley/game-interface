import java.awt.*;
import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game2 extends JPanel implements ActionListener
{
    JPanel panelA, panelB, panelC, panelD, panelE, panelF, panelG, panelH, panelI, panelJ;
    JLabel questionA, questionB, questionC, questionD, questionE,
           questionF, questionG, questionH, questionI, questionJ;
    JButton choiceA1, choiceA2, choiceA3,
            choiceB1, choiceB2, choiceB3,
            choiceC1, choiceC2, choiceC3,
            choiceD1, choiceD2, choiceD3,
            choiceE1, choiceE2, choiceE3,
            choiceF1, choiceF2, choiceF3,
            choiceG1, choiceG2, choiceG3,
            choiceH1, choiceH2, choiceH3,
            choiceI1, choiceI2, choiceI3,
            choiceJ1, choiceJ2, choiceJ3, scoreLabel;
    JButton jb1;
    int score;
   
    public Game2()
    {
        super();
        GridLayout grid = new GridLayout(3,1);
        setLayout(grid);
        setBackground(Color.blue);

        questionA = new JLabel();
        questionB = new JLabel();
        questionC = new JLabel();
        questionD = new JLabel();
        questionE = new JLabel();
        questionF = new JLabel();
        questionG = new JLabel();
        questionH = new JLabel();
        questionI = new JLabel();
        questionJ = new JLabel();
        scoreLabel = new JButton();
       
       
       

        questionA.setText("What animal is the school's mascot?");
        add(questionA);
        choiceA1 = new JButton("Nittany Tigers");
        choiceA1.addActionListener(this);
        add(choiceA1);
        choiceA2 = new JButton("Nittany Lions");
        choiceA2.addActionListener(this);
        add(choiceA2);
        choiceA3 = new JButton("Nittany Eagles");
        choiceA3.addActionListener(this);
        add(choiceA3);
       
        questionB.setText("What date was the school first established?");
        add(questionB);
        choiceB1 = new JButton("Feb. 22, 1855");
        choiceB1.addActionListener(this);
        add(choiceB1);
        choiceB2 = new JButton("Aug. 5, 1903");
        choiceB2.addActionListener(this);
        add(choiceB2);
        choiceB3 = new JButton("March 16, 1946");
        choiceB3.addActionListener(this);
        add(choiceB3);
       
        questionC.setText("What are the school's official colors?");
        add(questionC);
        choiceC1 = new JButton("Dark Blue & White");
        choiceC1.addActionListener(this);
        add(choiceC1);
        choiceC2 = new JButton("Black & White");
        choiceC2.addActionListener(this);
        add(choiceC2);
        choiceC3 = new JButton("Yellow & Light Blue");
        choiceC3.addActionListener(this);
        add(choiceC3);
       
        questionD.setText("What town is closest to the University Park campus?");
        add(questionD);
        choiceD1 = new JButton("Pittsburgh, PA");
        choiceD1.addActionListener(this);
        add(choiceD1);
        choiceD2 = new JButton("Erie, PA");
        choiceD2.addActionListener(this);
        add(choiceD2);
        choiceD3 = new JButton("State College, PA");
        choiceD3.addActionListener(this);
        add(choiceD3);
       
        questionE.setText("What is the Business Building called at University Park?");
        add(questionE);
        choiceE1 = new JButton("Smeal College of Business");
        choiceE1.addActionListener(this);
        add(choiceE1);
        choiceE2 = new JButton("Jackson Business School");
        choiceE2.addActionListener(this);
        add(choiceE2);
        choiceE3 = new JButton("Booth School of Business");
        choiceE3.addActionListener(this);
        add(choiceE3);
       
        questionF.setText("The student union is called the HUB. What does HUB stand for?");
        add(questionF);
        choiceF1 = new JButton("Halsey Union Building");
        choiceF1.addActionListener(this);
        add(choiceF1);
        choiceF2 = new JButton("Huntingdon Union Building");
        choiceF2.addActionListener(this);
        add(choiceF2);
        choiceF3 = new JButton("Hetzel Union Building");
        choiceF3.addActionListener(this);
        add(choiceF3);
       
        questionG.setText("What is the arena called that Penn State basketball calls home?");
        add(questionG);
        choiceG1 = new JButton("Beaver Arena");
        choiceG1.addActionListener(this);
        add(choiceG1);
        choiceG2 = new JButton("Bryce Jordan Center");
        choiceG2.addActionListener(this);
        add(choiceG2);
        choiceG3 = new JButton("Nittany Stadium");
        choiceG3.addActionListener(this);
        add(choiceG3);
       
        questionH.setText("What building has the clock tower whose chimes are heard all over campus?");
        add(questionH);
        choiceH1 = new JButton("Old House");
        choiceH1.addActionListener(this);
        add(choiceH1);
        choiceH2 = new JButton("Old Main");
        choiceH2.addActionListener(this);
        add(choiceH2);
        choiceH3 = new JButton("Main House");
        choiceH3.addActionListener(this);
        add(choiceH3);
       
        questionI.setText("How many Penn State campuses are there throughout Pennsylvania?");
        add(questionI);
        choiceI1 = new JButton("14");
        choiceI1.addActionListener(this);
        add(choiceI1);
        choiceI2 = new JButton("20");
        choiceI2.addActionListener(this);
        add(choiceI2);
        choiceI3 = new JButton("9");
        choiceI3.addActionListener(this);
        add(choiceI3);
       
        questionJ.setText("Which comedian graduated from Penn State?");
        add(questionJ);
        choiceJ1 = new JButton("Dave Chappelle");
        choiceJ1.addActionListener(this);
        add(choiceJ1);
        choiceJ2 = new JButton("Bill Burr");
        choiceJ2.addActionListener(this);
        add(choiceJ2);
        choiceJ3 = new JButton("Keegan-Michael Key");
        choiceJ3.addActionListener(this);
        add(choiceJ3);
       
        scoreLabel.setText("Score: " + score + "/100");
        add(scoreLabel);
       
        jb1 = new JButton("Return to Main Menu");
        jb1.addActionListener(this);
        add(jb1);
       
        panelA = new JPanel();
        panelA.add(questionA);
        panelA.add(choiceA1);
        panelA.add(choiceA2);
        panelA.add(choiceA3);
        add(panelA);
       
        panelB = new JPanel();
        panelB.add(questionB);
        panelB.add(choiceB1);
        panelB.add(choiceB2);
        panelB.add(choiceB3);
        //add(panelB);
       
        panelC = new JPanel();
        panelC.add(questionC);
        panelC.add(choiceC1);
        panelC.add(choiceC2);
        panelC.add(choiceC3);
        //add(panelC);
       
        panelD = new JPanel();
        panelD.add(questionD);
        panelD.add(choiceD1);
        panelD.add(choiceD2);
        panelD.add(choiceD3);
        //add(panelD);
       
        panelE = new JPanel();
        panelE.add(questionE);
        panelE.add(choiceE1);
        panelE.add(choiceE2);
        panelE.add(choiceE3);
        //add(panelE);
       
        panelF = new JPanel();
        panelF.add(questionF);
        panelF.add(choiceF1);
        panelF.add(choiceF2);
        panelF.add(choiceF3);
        //add(panelF);
       
        panelG = new JPanel();
        panelG.add(questionG);
        panelG.add(choiceG1);
        panelG.add(choiceG2);
        panelG.add(choiceG3);
        //add(panelG);
       
        panelH = new JPanel();
        panelH.add(questionH);
        panelH.add(choiceH1);
        panelH.add(choiceH2);
        panelH.add(choiceH3);
        //add(panelH);
       
        panelI = new JPanel();
        panelI.add(questionI);
        panelI.add(choiceI1);
        panelI.add(choiceI2);
        panelI.add(choiceI3);
        //add(panelI);
       
        panelJ = new JPanel();
        panelJ.add(questionJ);
        panelJ.add(choiceJ1);
        panelJ.add(choiceJ2);
        panelJ.add(choiceJ3);
        //add(panelJ);
       
        setVisible(true);
    }
   
    public void correctAnswer()
    {
        score = score + 10;
        scoreLabel.setText("Score: " + score + "/100");
        repaint();
    }
    
    public void questionB() {
        remove(panelA);
        add(panelB);
    }
    public void questionC() {
        remove(panelB);
        add(panelC);
    }
    public void questionD() {
        remove(panelC);
        add(panelD);
    }
    public void questionE() {
        remove(panelD);
        add(panelE);
    }
    public void questionF() {
        remove(panelE);
        add(panelF);
    }
    public void questionG() {
        remove(panelF);
        add(panelG);
    }
    public void questionH() {
        remove(panelG);
        add(panelH);
    }
    public void questionI() {
        remove(panelH);
        add(panelI);
    }
    public void questionJ() {
        remove(panelI);
        add(panelJ);
    }
    public void reset()
    {
        remove(panelB);
        remove(panelC);
        remove(panelD);
        remove(panelE);
        remove(panelF);
        remove(panelG);
        remove(panelH);
        remove(panelI);
        remove(panelJ);
        add(panelA);
        score = 0;
        scoreLabel.setText("Score: " + score + "/100");
        repaint();
    }
   
    @Override
       public void actionPerformed(ActionEvent aEvent) {    
       Object obj = aEvent.getSource();    
       if (obj == jb1)
       {
           reset();
           
       }
       if (obj == choiceA1) {
           //choiceA1.setText("Try again");
           questionB();
       }
       if (obj == choiceA2) {
           //choiceA2.setText("CORRECT!");
           correctAnswer();
           questionB();
       }
       if (obj == choiceA3) {
           //choiceA3.setText("Try again");
           questionB();
       }
       if (obj == choiceB1) {
           //choiceB1.setText("CORRECT!");
           correctAnswer();
           questionC();
       }
       if (obj == choiceB2) {
           //choiceB2.setText("Try again");
           questionC();
       }
       if (obj == choiceB3) {
           //choiceB3.setText("Try again");  
           questionC();
       }
       if (obj == choiceC1) {
           //choiceC1.setText("CORRECT!");
           correctAnswer();
           questionD();
       }
       if (obj == choiceC2) {
           //choiceC2.setText("Try again");
           questionD();
       }
       if (obj == choiceC3) {
           //choiceC3.setText("Try again");
           questionD();
       }
       if (obj == choiceD1) {
           //choiceD1.setText("Try again");
           questionE();
       }
       if (obj == choiceD2) {
           //choiceD2.setText("Try again");
           questionE();
       }
       if (obj == choiceD3) {
           //choiceD3.setText("CORRECT!");
           correctAnswer();
           questionE();
       }
       if (obj == choiceE1) {
           //choiceE1.setText("CORRECT!");
           correctAnswer();
           questionF();
       }
       if (obj == choiceE2) {
           //choiceE2.setText("Try again");
           questionF();
       }
       if (obj == choiceE3) {
           //choiceE3.setText("Try again");
           questionF();
       }
       if (obj == choiceF1) {
           //choiceF1.setText("CORRECT!");
           correctAnswer();
           questionG();
       }
       if (obj == choiceF2) {
           //choiceF2.setText("Try again");
           questionG();
       }
       if (obj == choiceF3) {
           //choiceF3.setText("CORRECT!");
           correctAnswer();
           questionG();
       }
       if (obj == choiceG1) {
           //choiceG1.setText("Try again");
           questionH();
       }
       if (obj == choiceG2) {
           //choiceG2.setText("CORRECT!");
           correctAnswer();
           questionH();
       }
       if (obj == choiceG3) {
           //choiceG3.setText("Try again");
           questionH();
       }
       if (obj == choiceH1) {
           //choiceH1.setText("Try again");
           questionI();
       }
       if (obj == choiceH2) {
           //choiceH2.setText("CORRECT!");
           correctAnswer();
           questionI();
       }
       if (obj == choiceH3) {
           //choiceH3.setText("Try again");
           questionI();
       }
       if (obj == choiceI1) {
           //choiceI1.setText("Try again");
           questionJ();
       }
       if (obj == choiceI2) {
           //choiceI2.setText("CORRECT!");
           correctAnswer();
           questionJ();
       }
       if (obj == choiceI3) {
           //choiceI3.setText("Try again");
           questionJ();
       }
       if (obj == choiceJ1) {
           //choiceJ1.setText("Try again");
           questionJ.setText("GAME OVER - Thank you for playing");
       }
       if (obj == choiceJ2) {
           ///choiceJ2.setText("Try again");
           questionJ.setText("GAME OVER - Thank you for playing");
       }
       if (obj == choiceJ3) {
           //choiceJ3.setText("CORRECT!");
           correctAnswer();
           questionJ.setText("GAME OVER - Thank you for playing");
    }
}
}
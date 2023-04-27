/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulatorsederhana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class QuizGUI implements ActionListener {
   private JFrame frame;
   private JPanel panel;
   private JLabel questionLabel1, questionLabel2, questionLabel3, resultLabel;
   private JTextField answerField1, answerField2, answerField3;
   private JButton submitButton;
   private int rightCount, wrongCount;
   
   public QuizGUI() {
      frame = new JFrame("Quiz");
      panel = new JPanel();
      
      questionLabel1 = new JLabel("What is the capital of France?");
      answerField1 = new JTextField(10);
      
      questionLabel2 = new JLabel("What is the largest planet in our solar system?");
      answerField2 = new JTextField(10);
      
      questionLabel3 = new JLabel("What is the highest mountain in the world?");
      answerField3 = new JTextField(10);
      
      submitButton = new JButton("Submit");
      submitButton.addActionListener(this);
      
      resultLabel = new JLabel(" ");
      
      panel.add(questionLabel1);
      panel.add(answerField1);
      
      panel.add(questionLabel2);
      panel.add(answerField2);
      
      panel.add(questionLabel3);
      panel.add(answerField3);
      
      panel.add(submitButton);
      
      panel.add(resultLabel);
      
      frame.add(panel);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
      
      rightCount = 0;
      wrongCount = 0;
   }
   
   public void actionPerformed(ActionEvent e) {
      String answer1 = answerField1.getText();
      String answer2 = answerField2.getText();
      String answer3 = answerField3.getText();
      
      if (answer1.equalsIgnoreCase("Paris")) {
         rightCount++;
      } else {
         wrongCount++;
      }
      
      if (answer2.equalsIgnoreCase("Jupiter")) {
         rightCount++;
      } else {
         wrongCount++;
      }
      
      if (answer3.equalsIgnoreCase("Mount Everest")) {
         rightCount++;
      } else {
         wrongCount++;
      }
      
      resultLabel.setText("Right: " + rightCount + " Wrong: " + wrongCount);
   }
   
   public static void main(String[] args) {
      new QuizGUI();
   }
}




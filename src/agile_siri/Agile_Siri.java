/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agile_siri;

import java.awt.event.ActionEvent;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Ryan
 */
import javax.swing.*;
public class Agile_Siri extends JFrame {
     private JTextField textEnter = new JTextField();
    private JTextArea textArea = new JTextArea();
          
    public Agile_Siri(){
      
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
        setResizable(false);
        setVisible(true);
        setLayout(null);
        setTitle("Siri");
        
        
        textEnter.setLocation(2, 540);
        textEnter.setSize(760, 30);
        
        textArea.setLocation(15,5);
        textArea.setSize(760, 510);
        
        
        
        this.add(textEnter);
        this.add(textArea);
}
    
    

    /**
     * 
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       Agile_Siri app = new Agile_Siri();
       
      

       
        
        
       
       boolean ask_question = true;
       while (ask_question){
           String q5 = "hi";
           String q6 = "hello";
           String q7 = "hey";
           String q1 = "capital of Pennsylvania";
           String q3 = "capital of pennsylvania";
           String q2 = "joke";
           String q4 = "how are you";
           String q10 = "meaning of life";
           System.out.println("What can I help you with?");
           app.textArea.append("What can I help you with?\n");
           
           System.out.print("Input: ");
           String user_input = scan.nextLine();
           user_input = user_input.toLowerCase();
           
           if(user_input.contains(q1) || user_input.contains(q3)){
               System.out.println("Harrisburg");
               app.textArea.append("Harrisburg\n");
           }
           else if (user_input.contains(q5) || user_input.contains(q6) || user_input.contains(q7)){
               System.out.println("Hi, my name is Siri you can ask me quesions!");
               app.textArea.append("Hi, my name is Siri you can ask me quesions!\n");
              
           }
           else if (user_input.contains(q2)){
               System.out.println("Your GPA");
               app.textArea.append("Your GPA\n");
           } 
           else if (user_input.contains(q4)){
               System.out.println("I am made of wires and circuits, I don't have feelings. But to answer your question, I am well:-)");
               app.textArea.append("I am made of wires and circuits, I don't have feelings. But to answer your question, I am well:-)\n");
           }
           else if (user_input.contains(q10)){
               System.out.println("People who ask siri the meaning of life deserve to be lied to.");
               app.textArea.append("People who ask siri the meaning of life deserve to be lied to.");
           }
           else {
               System.out.println("Sorry, I can't help you with that at this time!");
               app.textArea.append("Sorry, I can't help you with that at this time!\n");
           }
        
        
           System.out.println("Would you like to ask another question?");
           app.textArea.append("Would you like to ask another question?\n");
           System.out.print("Please enter Y or N: ");
           app.textArea.append("Please enter Y or N: \n");
           String y_n = scan.nextLine();
           
           if(!y_n.equals("Y") && !y_n.equals("y")){ 
               ask_question = false;
               System.out.println("Have a nice day!");
               app.textArea.append("Have a nice day!\n");
           }
           
       }
    }

    
}

//Sharmilan Saravanapava  ID: 40000098

//Please note that you should maximize the GUI window in order for it to work effectively.

package assignment1;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;
public class ELEC463Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			JFrame frame = new JFrame();
			frame.setBounds(200, 200, 700, 700);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setTitle("ELEC 463 Assignment 1");
			frame.setLayout(null);
			frame.setVisible(true);
			
			JLabel label1 = new JLabel();
			label1.setBounds(20, 20, 100, 20);
			label1.setFont(new Font("Times", Font.BOLD, 16));
			frame.getContentPane().add(label1);
			label1.setText("First Number:");
		
			JLabel label2 = new JLabel();
			label2.setBounds(20, 45, 150, 20);
			label2.setFont(new Font("Times", Font.BOLD, 16));
			frame.getContentPane().add(label2);
			label2.setText("Second Number:");
			
			JLabel label3 = new JLabel();
			label3.setBounds(20, 70, 460, 20);
			label3.setFont(new Font("Times", Font.BOLD, 16));
			frame.getContentPane().add(label3);
			label3.setText("Answer: ");
			
			JTextField textfield1 = new JTextField();
			textfield1.setBounds(140, 20, 300, 20);
			textfield1.setFont(new Font("Times", Font.BOLD, 16));
			frame.getContentPane().add(textfield1);
			//textfield.setText();
			
			JTextField textfield2 = new JTextField();
			textfield2.setBounds(140, 45, 300, 20);
			textfield2.setFont(new Font("Times", Font.BOLD, 16));
			frame.getContentPane().add(textfield2);
			
			JButton button1 = new JButton("+");
			button1.setBounds(20, 130, 80, 20);
			frame.getContentPane().add(button1);
			
			button1.addActionListener(new ActionListener()
					{
					public void actionPerformed(ActionEvent e) {
						try {
						
						double number1 = Double.parseDouble(textfield1.getText());
						double number2 = Double.parseDouble(textfield2.getText());
						double numero = 0;
						numero = number1 + number2;
						label3.setText("Answer: " + textfield1.getText() +  " + " + textfield2.getText() + " = " + numero);
						}
						catch (Exception ex) {
							
							label3.setText("You Did Not Enter A Valid Number. Please try again.");
						}

					}});
						
			JButton button2 = new JButton("-");
			button2.setBounds(110, 130, 80, 20);
			frame.getContentPane().add(button2);
						
			button2.addActionListener(new ActionListener()
					{
					public void actionPerformed(ActionEvent e) {
						try {
									
						double number1 = Double.parseDouble(textfield1.getText());
						double number2 = Double.parseDouble(textfield2.getText());
						double numero = 0;
						numero = number1 - number2;
						label3.setText("Answer: " + textfield1.getText() +  " - " + textfield2.getText() + " = " + numero);
						}
						catch (Exception ex) {
										
							label3.setText("You Did Not Enter A Valid Number. Please try again.");
						}
					}});
			
			JButton button3 = new JButton("x");
			button3.setBounds(200, 130, 80, 20);
			frame.getContentPane().add(button3);
			
			button3.addActionListener(new ActionListener()
					{
					public void actionPerformed(ActionEvent e) {
						try {
						
						double number1 = Double.parseDouble(textfield1.getText());
						double number2 = Double.parseDouble(textfield2.getText());
						double numero = 0;
						numero = (number1) * (number2);
						label3.setText("Answer: " + textfield1.getText() +  " x " + textfield2.getText() + " = " + numero);
						}
						catch (Exception ex) {
							
							label3.setText("You Did Not Enter A Valid Number. Please try again.");
						}
					}});
			
			JButton button4 = new JButton("÷");
			button4.setBounds(290, 130, 80, 20);
			frame.getContentPane().add(button4);
			
			button4.addActionListener(new ActionListener()
					{
					public void actionPerformed(ActionEvent e) {
						try {
						
						double number1 = Double.parseDouble(textfield1.getText());
						double number2 = Double.parseDouble(textfield2.getText());
						double numero = 0;
						numero = (number1) / (number2);
						label3.setText("Answer: " + textfield1.getText() +  " ÷ " + textfield2.getText() + " = " + numero);
						}
						catch (Exception ex) {
							
							label3.setText("You Did Not Enter A Valid Number. Please try again.");
						}
					}});
			
			JButton button5 = new JButton("Max");
			button5.setBounds(380, 130, 80, 20);
			frame.getContentPane().add(button5);
			
			button5.addActionListener(new ActionListener()
					{
					public void actionPerformed(ActionEvent e) {
						try {
						
						double number1 = Double.parseDouble(textfield1.getText());
						double number2 = Double.parseDouble(textfield2.getText());
						
						if (number1 > number2) {
							label3.setText("Answer: Maximum is " + textfield1.getText());
						}
						
						else {
							label3.setText("Answer: Maximum is " + textfield2.getText());
						}
						}
						catch (Exception ex) {
							
							label3.setText("You Did Not Enter A Valid Number. Please try again.");
						}
					}});
			
			
			JButton button6 = new JButton("Min");
			button6.setBounds(470, 130, 80, 20);
			frame.getContentPane().add(button6);
			
			button6.addActionListener(new ActionListener()
					{
					public void actionPerformed(ActionEvent e) {
						try {
						
						double number1 = Double.parseDouble(textfield1.getText());
						double number2 = Double.parseDouble(textfield2.getText());
						
						if (number1 > number2) {
							label3.setText("Answer: Minimum is " + textfield2.getText());
						}
						
						else {
							label3.setText("Answer: Minimum is " + textfield1.getText());
						}
						}
						catch (Exception ex) {
							
							label3.setText("You Did Not Enter A Valid Number. Please try again.");
						}
					}});
	}};
			
			
			

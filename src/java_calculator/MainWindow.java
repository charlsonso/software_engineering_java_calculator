package java_calculator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.*;


public class MainWindow extends JFrame {

	private JPanel contentPane;
	
	JLabel display_window;

	private String expression;
	private ModifierButton add_button;
	private ModifierButton subtract_button;
	private ModifierButton divide_button;
	private ModifierButton multiply_button;
	private ModifierButton modulo_button;
	private EqualsButton equal_button;
	private ClearButton clear_button;
	private ModifierButton number_button_0;
	private ModifierButton number_button_1;
	private ModifierButton number_button_2;
	private ModifierButton number_button_3;
	private ModifierButton number_button_4;
	private ModifierButton number_button_5;
	private ModifierButton number_button_6;
	private ModifierButton number_button_7;
	private ModifierButton number_button_8;
	private ModifierButton number_button_9;
	private ModifierButton number_button_period;
	
	private ActionListener hook;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.render_graphics_elements();
					frame.set_action_listener();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		display_window = new JLabel("0");
		display_window.setBackground(Color.WHITE);
		display_window.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		display_window.setHorizontalAlignment(SwingConstants.RIGHT);
		display_window.setBounds(25, 25, 300, 75);
		
	
		add_button = new ModifierButton("+");
		subtract_button = new ModifierButton("-");
		multiply_button = new ModifierButton("*");
		divide_button = new ModifierButton("/");
		modulo_button = new ModifierButton("%");
		equal_button = new EqualsButton();
		clear_button = new ClearButton();
		number_button_period = new ModifierButton(".");
		number_button_0 = new ModifierButton("0");
		number_button_1 = new ModifierButton("1");
		number_button_2 = new ModifierButton("2");
		number_button_3 = new ModifierButton("3");
		number_button_4 = new ModifierButton("4");
		number_button_5 = new ModifierButton("5");
		number_button_6 = new ModifierButton("6");
		number_button_7 = new ModifierButton("7");
		number_button_8 = new ModifierButton("8");
		number_button_9 = new ModifierButton("9");
		expression = "";
	}

	public boolean set_action_listener() {
		hook = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {                                            	
				Object act = e.getSource();                                                            
				if (act == number_button_period ||                                                     
					act == add_button ||                                                               
					act == subtract_button ||                                                          
					act == multiply_button ||                                                          
					act == modulo_button ||                                                            
					act == number_button_0 ||                                                          
					act == number_button_1 ||                                                          
					act == number_button_2 ||                                                          
					act == number_button_3 ||                                                          
					act == number_button_4 ||                                                          
					act == number_button_5 ||                                                          
					act == number_button_6 ||                                                          
					act == number_button_7 ||                                                          
					act == number_button_8 ||                                                          
					act == number_button_9) {                                                          
					expression = ((ModifierButton) act).add_modifier_to_expression(expression);        
				}
				else if (act == clear_button) {
					expression = ((ClearButton) act).clear_expression();
				}
				else if (act == equal_button) {
					expression = ((EqualsButton) act).evaluate(expression);
				}
				
				
				display_window.setText(expression);
			}                                                                         		
		};
		
		add_button.addActionListener(hook);
		subtract_button.addActionListener(hook);
		multiply_button.addActionListener(hook);
		divide_button.addActionListener(hook);
		modulo_button.addActionListener(hook);
		equal_button.addActionListener(hook);
		clear_button.addActionListener(hook);
		number_button_period.addActionListener(hook);
		number_button_0.addActionListener(hook);
		number_button_1.addActionListener(hook);
		number_button_2.addActionListener(hook);
		number_button_3.addActionListener(hook);
		number_button_4.addActionListener(hook);
		number_button_5.addActionListener(hook);
		number_button_6.addActionListener(hook);
		number_button_7.addActionListener(hook);
		number_button_8.addActionListener(hook);
		number_button_9.addActionListener(hook);
		return true;
	}

	public boolean render_graphics_elements() {
		add_button.setBounds(205, 125, 50, 50);
		subtract_button.setBounds(205, 185, 50, 50);
		multiply_button.setBounds(205, 245, 50, 50);
		divide_button.setBounds(205, 305, 50, 50);
		modulo_button.setBounds(265, 245, 50, 50);
		equal_button.setBounds(265, 305, 50, 50);
		clear_button.setBounds(145, 305, 50, 50);
		number_button_period.setBounds(25, 305, 50, 50);
		number_button_0.setBounds(85, 305, 50, 50);
		number_button_1.setBounds(25, 245, 50, 50); 
		number_button_2.setBounds(85, 245, 50, 50); 
		number_button_3.setBounds(145, 245, 50, 50);
		number_button_4.setBounds(25, 185, 50, 50);
		number_button_5.setBounds(85, 185, 50, 50);
		number_button_6.setBounds(145, 185, 50, 50);
		number_button_7.setBounds(25, 125, 50, 50);
		number_button_8.setBounds(85, 125, 50, 50);
		number_button_9.setBounds(145, 125, 50, 50);
		contentPane.add(add_button);
		contentPane.add(subtract_button);
		contentPane.add(multiply_button);
		contentPane.add(divide_button);
		contentPane.add(modulo_button);
		contentPane.add(equal_button);
		contentPane.add(clear_button);
		contentPane.add(number_button_7);
		contentPane.add(number_button_8);
		contentPane.add(number_button_9);
		contentPane.add(number_button_4);
		contentPane.add(number_button_5);
	    contentPane.add(number_button_6);
        contentPane.add(number_button_1);
        contentPane.add(number_button_2); 
        contentPane.add(number_button_3);
        contentPane.add(number_button_0);
        contentPane.add(number_button_period);
        contentPane.add(display_window);
		return true;
	}
	
	public boolean set_label() {
		display_window.setText(expression);
		return true;
	}
}

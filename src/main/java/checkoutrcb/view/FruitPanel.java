package checkoutrcb.view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import checkoutrcb.model.Fruit;

public class FruitPanel extends JPanel{
	
	double applePrice = Fruit.APPLE.getPrice();
	double orangePrice = Fruit.ORANGE.getPrice();
	double pearPrice = Fruit.PEAR.getPrice();
	double lemonPrice = Fruit.LEMON.getPrice();
	double bananaPrice = Fruit.BANANA.getPrice();
	
	//setting the fields in the GUI
	private JLabel appleLabel;
	private JTextField appleField;
	
	private JLabel pearLabel;
	private JTextField pearField;
	
	private JLabel orangeLabel;
	private JTextField orangeField;
	
	private JLabel lemonLabel;
	private JTextField lemonField;
	
	private JLabel bananaLabel;
	private JTextField bananaField;
	
	private JButton submitButton;


	public FruitPanel() {
		this.appleLabel = new JLabel("How many Apples would you like to buy?");
		this.appleField = new JTextField();
		
		this.pearLabel = new JLabel("How many Pears would you like to buy?");
		this.pearField = new JTextField();
		
		this.orangeLabel = new JLabel("How many Oranges would you like to buy?");
		this.orangeField = new JTextField(1);
		
		this.lemonLabel = new JLabel("How many Lemons would you like to buy?");
		this.lemonField = new JTextField(1);
		
		this.bananaLabel = new JLabel("How many Bananas would you like to buy?");
		this.bananaField = new JTextField(1);
		
		this.submitButton = new JButton("Submit");
		/*
		 * 
		 * If I had more time, I would add in checks to ensure the number entered is a positive integer, as it is 
		 * an error occurs if each field is not populated. 
		 * I would also round the results to the nearest cent
		 * 
		 */
		this.submitButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int appleQuantity = Integer.valueOf(appleField.getText());
				int pearQuantity = Integer.valueOf(pearField.getText());
				int orangeQuantity = Integer.valueOf(orangeField.getText());
				int lemonQuantity = Integer.valueOf(lemonField.getText());
				int bananaQuantity = Integer.valueOf(bananaField.getText());
				double priceForApples = appleQuantity * applePrice;
				System.out.println("The price for apples is : £" + priceForApples);
				double priceForPears = pearQuantity * pearPrice;
				System.out.println("The price for pears is : £" + priceForPears);
				double priceForOranges = orangeQuantity * orangePrice;
				System.out.println("The price for oranges is : £" + priceForOranges);
				double priceForLemons = lemonQuantity * lemonPrice;
				System.out.println("The price for lemons is : £" + priceForLemons);
				double priceForBananas = bananaQuantity * bananaPrice;
				System.out.println("The price for bananas is : £" + priceForBananas);
				double totalPrice = priceForApples + priceForBananas + priceForLemons + priceForOranges + priceForPears;
				System.out.println("The total price for your cart is : £" + totalPrice);
			}
		});
		setLayout(new GridLayout(6, 2));
		
		this.add(appleLabel, 1, 0);
		this.add(appleField, 1, 1);
		this.add(pearLabel, 2, 0);
		this.add(pearField, 2, 1);
		this.add(orangeLabel, 3, 0);
		this.add(orangeField, 3, 1);
		this.add(lemonLabel, 4, 0);
		this.add(lemonField, 4, 1);
		this.add(bananaLabel, 5, 0);
		this.add(bananaField, 5, 1);
		this.add(submitButton);
		
		
		setSize(new Dimension(20, 100));
	}


	public JTextField getAppleField() {
		return appleField;
	}


	public void setAppleField(String amount) {
		this.appleField.setText(amount);
	}
	
	
	public JTextField getPearField() {
		return pearField;
	}


	public void setPearField(String amount) {
		this.pearField.setText(amount);
	}


	public JTextField getOrangeField() {
		return orangeField;
	}


	public void setOrangeField(String amount) {
		this.orangeField.setText(amount);
	}


	public JTextField getLemonField() {
		return lemonField;
	}


	public void setLemonField(String amount) {
		this.lemonField.setText(amount);
	}


	public JTextField getBananaField() {
		return bananaField;
	}


	public void setBananaField(String amount) {
		this.bananaField.setText(amount);
	}



}

package checkoutrcb.view;

import java.awt.BorderLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class ClientGui extends JFrame {
	private FruitPanel fruitPanel;

	public ClientGui() {
		this.fruitPanel = new FruitPanel();

		//Base layout for GUI
		this.setTitle("RBC Client");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout borderLayout = new BorderLayout();
		JTextField title = new JTextField("RBC Fruit Stand");
		setLayout(borderLayout);
		this.add(title, BorderLayout.NORTH);
		this.add(this.fruitPanel, BorderLayout.CENTER);
		this.setVisible(true);
	}

}

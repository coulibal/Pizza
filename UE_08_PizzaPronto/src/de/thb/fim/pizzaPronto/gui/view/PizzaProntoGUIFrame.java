package de.thb.fim.pizzaPronto.gui.view;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.WindowConstants;

public class PizzaProntoGUIFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private KundeGUIContentView myKundePanel;
	private Container c;
//	JFrame myFrame = new JFrame("Beispiel");

	public PizzaProntoGUIFrame(String Title) {
		super(Title);
	}

	public void init() {

		JTabbedPane tabbedPanel = new JTabbedPane();
		c = this.getContentPane();
		myKundePanel = new KundeGUIContentView();

		tabbedPanel.add(myKundePanel);
//		System.out.println(c);
		c.add(tabbedPanel);
		tabbedPanel.setVisible(true);
		pack();

		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}

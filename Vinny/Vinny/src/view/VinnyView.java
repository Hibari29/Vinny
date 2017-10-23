package view;

import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

// --- @K
public class VinnyView {
	
	private final Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	
	private JFrame mainFrame;
	private JPanel mainPanel;
	private JButton runVinny, orderSummary, csuInfo, clearForm;
	private JFileChooser chooserDraft;
	
	// Create the GUI
	public void createGUI(){
		mainFrame = new JFrame("");
		
		mainFrame.setSize(600, 300);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLocation(dim.width/2-mainFrame.getSize().width/2, dim.height/2-mainFrame.getSize().height/2);
		
		runVinny = new JButton("Run Vinny");
		orderSummary = new JButton("Order Summary");
		csuInfo = new JButton("CSU Info");
		clearForm = new JButton("Clear Form");
		
		mainPanel = new JPanel(null);
		mainPanel.setPreferredSize(new Dimension(600,225));
		mainPanel.setLayout(new FlowLayout());
		mainPanel.add(runVinny);
		mainPanel.add(orderSummary);
		mainPanel.add(csuInfo);
		mainPanel.add(clearForm);
		mainPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		mainFrame.add(mainPanel);
		mainFrame.revalidate();
		
	}
	
	// Show the GUI
	public void init(){
		createGUI();
		mainFrame.setVisible(true);
	}
}

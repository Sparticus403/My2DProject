package grid.view;

import java.awt.*;

import javax.swing.*;
import grid.controller.GridController;

public class GridPanel extends JPanel
{
	
	private JTextField rowField;
	private JTextField columnField;
	private JTextField inputField;
	private JLabel inputLabel;
	private JLabel rowLabel;
	private JLabel columnLabel;
	private JButton submitButton;
	private SpringLayout baseLayout;
	private GridController baseController;
	
	public GridPanel(GridController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		rowField = new JTextField(5);
		columnField = new JTextField(5);
		inputField = new JTextField(5);
		inputLabel = new JLabel("things");
		rowLabel = new JLabel("More Things");
		columnLabel = new JLabel("Most Things");
		submitButton = new JButton("Press the button");
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		setPreferredSize(new Dimension(900,600));
		rowField.setEditable(true);
		columnField.setEditable(true);
		inputField.setEditable(true);
		
		this.setBackground(Color.gray);
		this.add(rowField);
		this.add(columnField);
		this.add(inputField);
		this.add(inputLabel);
		this.add(rowLabel);
		this.add(columnLabel);
		this.add(submitButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}

}

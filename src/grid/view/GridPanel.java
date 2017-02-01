package grid.view;

import java.awt.*;
import javax.swing.table.*;
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
	
	private JTable gridTable;
	private JScrollPane gridPane;
	
	public GridPanel(GridController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.rowField = new JTextField(15);
		this.columnField = new JTextField(15);
		this.inputField = new JTextField(15);
		this.inputLabel = new JLabel("things");
		this.rowLabel = new JLabel("More Things");
		this.columnLabel = new JLabel("Most Things");
		this.submitButton = new JButton("Press the button");
		getBaseController();
		
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupTable()
	{
		DefaultTableModel data = new DefaultTableModel(baseController.getGrid(), new String []{"one", "two", "three", "four", "five"});
		gridTable = new JTable();
		gridTable.setModel(data);
		gridPane = new JScrollPane();
		gridPane.setViewportView(gridTable);
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
		this.add(gridPane);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, rowField, 30, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, columnField, 0, SpringLayout.NORTH, rowField);
		baseLayout.putConstraint(SpringLayout.WEST, columnField, 24, SpringLayout.EAST, rowField);
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, 0, SpringLayout.NORTH, rowField);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 34, SpringLayout.EAST, columnField);
		baseLayout.putConstraint(SpringLayout.WEST, inputLabel, 0, SpringLayout.WEST, inputField);
		baseLayout.putConstraint(SpringLayout.SOUTH, inputLabel, -17, SpringLayout.NORTH, inputField);
		baseLayout.putConstraint(SpringLayout.NORTH, rowLabel, 0, SpringLayout.NORTH, inputLabel);
		baseLayout.putConstraint(SpringLayout.WEST, rowLabel, 0, SpringLayout.WEST, rowField);
		baseLayout.putConstraint(SpringLayout.NORTH, columnLabel, 0, SpringLayout.NORTH, inputLabel);
		baseLayout.putConstraint(SpringLayout.WEST, columnLabel, 0, SpringLayout.WEST, columnField);
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 518, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, rowField, -25, SpringLayout.NORTH, submitButton);
		baseLayout.putConstraint(SpringLayout.WEST, submitButton, 0, SpringLayout.WEST, rowField);
		baseLayout.putConstraint(SpringLayout.WEST, gridPane, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, gridPane, -6, SpringLayout.NORTH, inputLabel);
		
	}
	
	private void setupListeners()
	{
		
	}
	
	public GridController getBaseController()
	{
		return baseController;
	}

}

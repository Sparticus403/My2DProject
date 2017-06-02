package grid.controller;

import grid.view.*;

import javax.swing.JOptionPane;

import grid.model.Things;

public class GridController 
{
	private GridFrame appFrame;
	private Things [][] grid;
	
	public GridController()
	{
		
		appFrame = new GridFrame(this);
		fillGrid();
		grid = new Things[6][5];
		
	}
	
	private void fillGrid()
	{
		for(int row = 0; row < grid.length; row++)
		{
			for(int col = 0; col < grid[0].length; col++)
			{
				grid[row][col] = new Things();
			}
		}
	}
	
	public void start()
	{
		
	}
	
	public Things[][] getGrid()
	{
		return grid;
	}
	
	public GridFrame getFrame()
	{
		return appFrame;
	}
	
	public void updateThing(String row, String col, String value)
	{
		if(isValid(row) && isValid(col) && isValid(value))
		{
			grid[Integer.parseInt(row)][Integer.parseInt(col)].setThingStuffLevel(Integer.parseInt(value));
		}
	}
	
	private boolean isValid(String temp)
	{
		try
		{
			Integer.parseInt(temp);
			return true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(appFrame, "Use an Int");
			return false;
		}
	}
}

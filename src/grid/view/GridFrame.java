package grid.view;

import javax.swing.*;
import grid.controller.GridController;
import java.awt.Dimension;

public class GridFrame extends JFrame
{
	private GridController baseController;
	private GridPanel appPanel;
	
	public GridFrame(GridController baseController)
	{
		super();
		this.baseController = baseController;
		appPanel = new GridPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("2D Grid");
		this.setSize(new Dimension(900,600));
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public GridController getBaseController()
	{
		return baseController;
	}

}

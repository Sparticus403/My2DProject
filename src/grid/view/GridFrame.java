package grid.view;

import javax.swing.JFrame;
import grid.controller.GridController;

public class GridFrame extends JFrame
{
	private GridFrame baseController;
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
		
	}
	

}

package view;

import javax.swing.JFrame;
import controller.Controller;

public class DrawingFrame extends JFrame
{
	private Controller baseController;
	private DrawingPanel drawingPanel;
	private ShapePanel shapePanel;
	
	public DrawingFrame(Controller baseController)
	{
		this.baseController = baseController;
		drawingPanel = new DrawingPanel(baseController);
		shapePanel = new ShapePanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(drawingPanel);
		this.setTitle("Drawing!");
		this.setSize(500, 500);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

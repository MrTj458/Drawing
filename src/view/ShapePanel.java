package view;

import javax.swing.*;

import controller.Controller;

public class ShapePanel extends JPanel
{
	private Controller baseController;
	private SpringLayout baseLayout;
	
	public ShapePanel(Controller baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}

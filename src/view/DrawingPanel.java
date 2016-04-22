package view;

import java.awt.*;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import controller.Controller;

public class DrawingPanel extends JPanel
{
	private Controller baseController;
	private SpringLayout baseLayout;
	private JButton addRectangleButton;
	private ArrayList<Rectangle> rectangleList;
	
	public DrawingPanel(Controller baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		addRectangleButton = new JButton("Add a Rectangle");
		rectangleList = new ArrayList<Rectangle>();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GRAY);
		this.add(addRectangleButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, addRectangleButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, addRectangleButton, -10, SpringLayout.SOUTH, this);
	}
	
	private void setupListeners()
	{
		
	}
	
	@Override
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		Graphics2D mainGraphics = (Graphics2D) currentGraphics;
		
		mainGraphics.setStroke(new BasicStroke(20));
		mainGraphics.setColor(Color.orange);
		mainGraphics.drawRect(50, 70, 200, 400);
		
		
		for(Rectangle current : rectangleList)
		{
			int red = (int) (Math.random() * 256);
			int green = (int) (Math.random() * 256);
			int blue = (int) (Math.random() * 256);
			
			mainGraphics.setColor(new Color(red, green, blue));
			mainGraphics.fill(current);
		}
	}
}

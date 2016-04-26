package view;

import java.awt.*;
import java.awt.event.*;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import controller.Controller;

public class DrawingPanel extends JPanel
{
	//Base Components
	private Controller baseController;
	private SpringLayout baseLayout;
	
	//Panels
	private ShapePanel shapePanel;
	
	//Buttons
	private JButton addRectangleButton;
	private JButton addSquareButton;
	private JButton addEllipseButton;
	private JButton addCircleButton;
	private JButton addTriangleButton;
	private JButton addPolygonButton;
	private JButton clearScreenButton;
	
	//Lists
	private ArrayList<Rectangle> rectangleList;
	
	public DrawingPanel(Controller baseController)
	{
		//Base Components
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		shapePanel = new ShapePanel();
		baseLayout.putConstraint(SpringLayout.SOUTH, shapePanel, -100, SpringLayout.SOUTH, this);
		
		//Buttons
		addRectangleButton = new JButton("Add a Rectangle");
		addSquareButton = new JButton("Add a Square");
		addEllipseButton = new JButton("Add a Ellipse");
		addCircleButton = new JButton("Add a Circle");
		addTriangleButton = new JButton("Add a Triangle");
		addPolygonButton = new JButton("Add a Polygon");
		clearScreenButton = new JButton("Clear the Screen");
		
		//Lists
		rectangleList = new ArrayList<Rectangle>();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GRAY);
		this.add(shapePanel);
		this.add(addRectangleButton);
		this.add(addSquareButton);
		this.add(addEllipseButton);
		this.add(addCircleButton);
		this.add(addTriangleButton);
		this.add(addPolygonButton);
		this.add(clearScreenButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, addRectangleButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, addRectangleButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, shapePanel, 50, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, shapePanel, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, addTriangleButton, 0, SpringLayout.NORTH, addPolygonButton);
		baseLayout.putConstraint(SpringLayout.WEST, addTriangleButton, 6, SpringLayout.EAST, addPolygonButton);
		baseLayout.putConstraint(SpringLayout.EAST, shapePanel, -50, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, addCircleButton, 0, SpringLayout.NORTH, addRectangleButton);
		baseLayout.putConstraint(SpringLayout.NORTH, clearScreenButton, 0, SpringLayout.NORTH, addTriangleButton);
		baseLayout.putConstraint(SpringLayout.EAST, clearScreenButton, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, addCircleButton, 6, SpringLayout.EAST, addEllipseButton);
		baseLayout.putConstraint(SpringLayout.NORTH, addSquareButton, 0, SpringLayout.NORTH, addRectangleButton);
		baseLayout.putConstraint(SpringLayout.WEST, addSquareButton, 6, SpringLayout.EAST, addRectangleButton);
		baseLayout.putConstraint(SpringLayout.NORTH, addEllipseButton, 0, SpringLayout.NORTH, addRectangleButton);
		baseLayout.putConstraint(SpringLayout.WEST, addEllipseButton, 6, SpringLayout.EAST, addSquareButton);
	}
	
	private void setupListeners()
	{
		addRectangleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addRectangle();
				repaint();
			}
		});
		
		addSquareButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent Click)
			{
				shapePanel.addSquare();
				repaint();
			}
		});
		
		addEllipseButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent Click)
			{
				shapePanel.addEllipse();
				repaint();
			}
		});
		
		addCircleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent Click)
			{
				shapePanel.addCircle();
				repaint();
			}
		});
		
		addTriangleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent Click)
			{
				shapePanel.addTriangle();
				repaint();
			}
		});
		
		addPolygonButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent Click)
			{
				shapePanel.addPolygon();
				repaint();
			}
		});
		
		clearScreenButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent Click)
			{
				shapePanel.clearScreen();
				repaint();
			}
		});
	}
	
	@Override
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		Graphics2D mainGraphics = (Graphics2D) currentGraphics;
		
//		mainGraphics.setStroke(new BasicStroke(5));
//		mainGraphics.setColor(Color.orange);
//		mainGraphics.drawRect(50, 70, 200, 400);
		
		
		for(Rectangle current : rectangleList)
		{
			int red = (int) (Math.random() * 256);
			int green = (int) (Math.random() * 256);
			int blue = (int) (Math.random() * 256);
			int stroke = (int) (Math.random() * 20);
			
			mainGraphics.setStroke(new BasicStroke(stroke));
			mainGraphics.setColor(new Color(red, green, blue));
			mainGraphics.draw(current);
		}
	}
}

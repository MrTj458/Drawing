package view;

import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class ShapePanel extends JPanel
{
	private ArrayList<Rectangle> rectangleList;
	private ArrayList<Rectangle> squareList;
	private ArrayList<Ellipse2D> ellipseList;
	private ArrayList<Ellipse2D> circleList;
	private ArrayList<Polygon> triangleList;
	private ArrayList<Polygon> polygonList;
	
	public ShapePanel()
	{
		rectangleList = new ArrayList<Rectangle>();
		squareList = new ArrayList<Rectangle>();
		ellipseList = new ArrayList<Ellipse2D>();
		circleList = new ArrayList<Ellipse2D>();
		triangleList = new ArrayList<Polygon>();
		polygonList = new ArrayList<Polygon>();
	}
	
	public void addRectangle()
	{
		int xPosition = (int) (Math.random() * this.getWidth());
		int yPosition = (int) (Math.random() * this.getHeight());
		int width = (int) (Math.random() * (this.getWidth() / 2));
		int height = (int) (Math.random() * (this.getHeight() / 2));
		
		rectangleList.add(new Rectangle(xPosition, yPosition, width, height));
	}
	
	public void addSquare()
	{
		int xPosition = (int) (Math.random() * this.getWidth());
		int yPosition = (int) (Math.random() * this.getHeight());
		int size = (int) (Math.random() * (this.getHeight() / 2));
		
		squareList.add(new Rectangle(xPosition, yPosition, size, size));
	}
	
	public void addEllipse()
	{
		int xPosition = (int) (Math.random() * this.getWidth());
		int yPosition = (int) (Math.random() * this.getHeight());
		int width = (int) (Math.random() * (this.getWidth() / 2));
		int height = (int) (Math.random() * (this.getWidth() / 2));
		
		ellipseList.add(new Ellipse2D.Double(xPosition, yPosition, width, height));
	}
	
	public void addCircle()
	{
		int xPosition = (int) (Math.random() * this.getWidth());
		int yPosition = (int) (Math.random() * this.getHeight());
		int size = (int) (Math.random() * (this.getHeight() / 2));
		
		circleList.add(new Ellipse2D.Double(xPosition, yPosition, size, size));
	}
	
	public void addTriangle()
	{
		int[] xPoints = {(int) (Math.random() * this.getWidth()), (int) (Math.random() * this.getWidth()), (int) (Math.random() * this.getWidth())};
		int[] yPoints = {(int) (Math.random() * this.getHeight()), (int) (Math.random() * this.getHeight()), (int) (Math.random() * this.getHeight())};
		
		triangleList.add(new Polygon(xPoints, yPoints, 3));
	}
	
	public void addPolygon()
	{
		int numberOfSides = (int) (Math.random() * 9) + 3;
		int[] xPoints = new int[numberOfSides];
		int[] yPoints = new int[numberOfSides];
		
		for(int side = 0; side < numberOfSides; side++)
		{
			xPoints[side] = (int) (Math.random() * this.getWidth());
			yPoints[side] = (int) (Math.random() * this.getHeight());
		}
		
		polygonList.add(new Polygon(xPoints, yPoints, numberOfSides));
	}
	
	public void clearScreen()
	{
		rectangleList.clear();
		squareList.clear();
		ellipseList.clear();
		circleList.clear();
		triangleList.clear();
		polygonList.clear();
	}
	
	@Override
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		Graphics2D mainGraphics = (Graphics2D) currentGraphics;
		
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
		
		for(Rectangle current : squareList)
		{
			int red = (int) (Math.random() * 256);
			int green = (int) (Math.random() * 256);
			int blue = (int) (Math.random() * 256);
			int stroke = (int) (Math.random() * 20);
			
			mainGraphics.setStroke(new BasicStroke(stroke));
			mainGraphics.setColor(new Color(red, green, blue));
			mainGraphics.draw(current);
		}
		
		for(Ellipse2D current : ellipseList)
		{
			int red = (int) (Math.random() * 256);
			int green = (int) (Math.random() * 256);
			int blue = (int) (Math.random() * 256);
			int stroke = (int) (Math.random() * 10);
			
			mainGraphics.setStroke(new BasicStroke(stroke));
			mainGraphics.setColor(new Color(red, green, blue));
			mainGraphics.draw(current);
		}
		
		for(Ellipse2D current : circleList)
		{
			int red = (int) (Math.random() * 256);
			int green = (int) (Math.random() * 256);
			int blue = (int) (Math.random() * 256);
			int stroke = (int) (Math.random() * 10);
			
			mainGraphics.setStroke(new BasicStroke(stroke));
			mainGraphics.setColor(new Color(red, green, blue));
			mainGraphics.draw(current);
		}
		
		for(Polygon current : triangleList)
		{
			int red = (int) (Math.random() * 256);
			int green = (int) (Math.random() * 256);
			int blue = (int) (Math.random() * 256);
			int stroke = (int) (Math.random() * 10);
			
			mainGraphics.setStroke(new BasicStroke(stroke));
			mainGraphics.setColor(new Color(red, green, blue));
			mainGraphics.draw(current);	
		}
		
		for(Polygon current : polygonList)
		{
			int red = (int) (Math.random() * 256);
			int green = (int) (Math.random() * 256);
			int blue = (int) (Math.random() * 256);
			int stroke = (int) (Math.random() * 10);
			
			mainGraphics.setStroke(new BasicStroke(stroke));
			mainGraphics.setColor(new Color(red, green, blue));
			mainGraphics.draw(current);
		}
	}
}

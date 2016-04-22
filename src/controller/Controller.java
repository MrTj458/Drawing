package controller;

import view.DrawingFrame;

public class Controller
{
	private DrawingFrame baseFrame;
	
	public Controller()
	{
		baseFrame = new DrawingFrame(this);
	}
	
	public void start(){}
}

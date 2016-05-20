package data.controller;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import data.model.Customer;
import data.model.Dish;

public class DataController 
{
	private Queue<Customer> customerQueue;
	private Stack<Dish> dish;

	public void start()
	{
		doStack();
		doQueue();
	}
	
	private void doStack()
	{
		dish= new Stack<Dish>();
		dish.add(new Dish(false, java.awt.Color.BLUE, 8));
		System.out.println(dish.size());
		dish.pop();
		System.out.println(dish.size());
		dish.push(new Dish(true, java.awt.Color.RED, 45));
	}
	
	private void doQueue(){
		customerQueue = new LinkedList<Customer>();
		customerQueue.add(new Customer(true, "Sydo", 13));
		customerQueue.add(new Customer(true, "Goose", 50));
		customerQueue.remove();
	}
	
}

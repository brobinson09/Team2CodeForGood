package com.example.handsonandroid;

import java.sql.Date;
import java.util.ArrayList;

/**
 * 
 * @author Garrett
 *
 * The webmethods for the application. We are currently
 * using a pseudo database for this to make it easy.
 * 
 * The class is setup so that for implementation, they would simply strip
 * our pseudo database code and communicate with their servers for the same
 * actions, with roughly little to no modification required to the application.
 */
public class WebMethods {

	/**
	 * Default Constructor
	 */
	public WebMethods(){
		
	}
	
	/**
	 * Method to do a login, using username and password
	 * @param userName : The username
	 * @param password : The password
	 * @return : Return false if login was unsuccessful
	 */
	public static boolean login(String userName, String password){
		
		//Create the new user, User user = new User(); user.setUser(this);
		return false;
	}
	
	/**
	 * Login from the user preferences, 
	 * @return : Return false if login was unsuccessful
	 */
	public static boolean loginFromPref(){
		
		return false;
	}
	
	/**
	 * Register a new user
	 * @return : Return false if registration was unsuccesful
	 */
	public static boolean registerUser(){
		
		return false;
	}
	
	/**
	 * Sign up for event
	 * @param e : The event to sign up for
	 * @return : Return false if registration was unsuccessful
	 */
	public static boolean signUpForEvent(Events e){
		//Event signup goes here!
		
		
		String title = "Default";
		String description = "Default";
		String location = "Default";
		Date date = new Date(1994, 05, 27);
		int beginTime = 000;
		int endTime = 000;
		
		WebMethods.addEventToCalendar(title, description, location, date, beginTime, endTime);
		return false;
	}
	
	/**
	 * Query events by tags
	 * @param tag : The tag to query
	 * @return : The list of returned events
	 */
	public static ArrayList<Events> queryByTag(String tag){
		
		return null;
	}
	
	/**
	 * Query Events by Category
	 * @param category : The category to query
	 * @return : The list
	 */
	public static ArrayList<Events> queryByCategory(String category){
		
		return null;
	}
	
	/**
	 * Query Events by Date
	 * @param date : The date to query
	 * @return : The list
	 */
	public static ArrayList<Events> queryByDate(String date){
		
		return null;
	}
	
	/**
	 * Query events by Zipcode
	 */
	public static void queryByZipcode(){
		
	}
	
	public static void updateFacebook(){
		
	}
	
	public static void updateTwitter(){
		
	}
	
	//Helper Additional Methods
	
	private static void addEventToCalendar(String title, String description,  String location, Date date, int beginTime, int endTime){
		
	}
	
}

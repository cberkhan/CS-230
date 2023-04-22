package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A singleton service for the game engine
 * 
 * @author coce@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;
	
	/* The use of the singleton pattern allows for only  
	 * one instance of the GameService class to exist in memory
	 * at any time and provices a way to access the only object
	 * without needing to instantiate the object of the class
	 */

	// Add missing pieces to turn this class a singleton 
	private static GameService instance = new GameService();
	
	//private constructor so objects can not be created elsewhere
	private GameService() {
		
	}
	//get only object available
	public static GameService getInstance() {
		
		return instance;
	}
	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same name
		// if found, simply return the existing instance
		
		//creates iterator of type Game
		//to iterate throught the "games" ArrayList
		iterator<Game> it = games.iterator();
		
		//white 'it' has not reached the end of the list
		while (it.next()) {
			//if the games name equals the name parameter
			if (it.next().getName().equals(name)) {
				//local game instance assigned with found instance
				game = it.next();
			}
		}
		
		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same id
		// if found, simply assign that instance to the local variable
		
		//creates iterator of type Game
		//to iterate throught the "games" ArrayList
		iterator<Game> it = games.iterator();
		
		//white 'it' has not reached the end of the list
		while (it.next()) {
			//if the games name equals the name parameter
			if (it.next().getId().equals(id)) {
				//local game instance assigned with found instance
				game = it.next();
			}
		}
		
		
		return game;
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same name
		// if found, simply assign that instance to the local variable
		
		//creates iterator of type Game
		//to iterate throught the "games" ArrayList
		iterator<Game> it = games.iterator();
		
		//white 'it' has not reached the end of the list
		while (it.next()) {
			//if the games name equals the name parameter
			if (it.next().getName().equals(name)) {
				//local game instance assigned with found instance
				game = it.next();
			}
		}

		return game;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}
}

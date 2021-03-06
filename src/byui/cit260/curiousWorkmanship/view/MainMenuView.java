/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// The MainMenuView class - part of the view layer
// Object of this class manage the main menu
// Author: Luis, Nimrod, Joyce team
// Date last modified: February 2018
//-------------------------------------------------------------
package byui.cit260.curiousWorkmanship.view;
import byui.cit260.curiousWorkmanship.model.Game;
import java.util.Scanner;
import curiousWorkmanship.CuriousWorkmanship;
import byui.cit260.curiousWorkmanship.model.Player;
import byui.cit260.curiousWorkmanship.model.CropData;

/**
 *
 * @author joyce
 */
public class MainMenuView extends MenuView{

    
    // The MainMenuView constructor
    // Purpose: Initialize the menu data
    // Parameters: none
    // Returns: none
    // ===================================

    public MainMenuView() {
        super("\n" +
                "**********************************\n" +
                "* CITY OF AARON: MAIN GAME MENU  *\n" +
                "**********************************\n" +
                " 1 - Start new game\n" +
                " 2 - Get and start a saved game\n" +
                " 3 - Get help on playing the game\n" +
                " 4 - Save game\n" +
                " 5 - Quit\n",     
         5);
    }
    
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================       
        @Override public void doAction(int option)
    {
        switch(option)
        {
            // if the option is 1, call startNewGame( )  
            case 1: // create and start a new game
                startNewGame();
                break;
            // if the option is 2, call startSavedGame( )
            case 2: // get and start a saved game
                startSavedGame();
                break;
            // if the option is 3, call displayHelpMenu( )
            case 3: // get help menu
                displayHelpMenuView();
                break;
            // if the option is 4, call displaySaveGame( )
            case 4: // save game
                displaySaveGameView();
                break;
            // if the option is 5, display a goodbye message
            case 5:
                System.out.println("Thanks for playing ... goodbye.");
        }
    } 
    
    // The startNewGame method
    // Purpose: creates game object and starts the game
    // Parameters: none
    // Returns: none
    // ===================================      
    public void startNewGame()
    {
        //Create a new Game object.
        Game theGame = new Game();
        // Save a reference to it in the CuriousWorkmanship class.
        CuriousWorkmanship.setTheGame(theGame);
        // Display the Banner Page.
        System.out.println("\nWelcome to the city of Aaron.");
        // Create a new Player object
        Player thePlayer = new Player();
        // Prompt for and get the user’s name.
        String name;
        System.out.println("\nPlease type in your first name: ");
        name = keyboard.next();
        // Save the user’s name in the Player object
        thePlayer.setName(name);
        // Save a reference to the player object in the Game object
        theGame.setThePlayer(thePlayer);
        // Display a welcome message
        System.out.println("\nWelcome " + name + " have fun.");
            
        
        // Create the CropData object, 
        // initialize it and save a reference to it in the Game
        CropData theCrops = new CropData();
        theCrops.setYear(0);
        theCrops.setPopulation(100);
        theCrops.setNewPeople(5);
        theCrops.setCropYield(3);
        theCrops.setNumStarved(0);
        theCrops.setOffering(10);
        theCrops.setWheatInStore(2700);
        theCrops.setAcresOwned(1000);
        theCrops.setAcresPlanted(1000);
        theCrops.setHarvest(3000);
        theCrops.setOfferingBushels(300);
         
        theGame.setCropData(theCrops);
        
        //Create a new HelpMenuView object.
        GameMenuView theGameMenu = new GameMenuView();
        // Display the Game menu
        theGameMenu.displayMenuView();
    }

    
    // The savedGame method
    // Purpose: save game 
    // Parameters: none
    // Returns: none
    // ===================================     
    public void startSavedGame()
    {
        System.out.println("\nStart saved game option selected.");
    }
     
    // The displayHelpMenuView method
    // Purpose: display Help Menu View
    // Parameters: none
    // Returns: none
    // ===================================     
    public void displayHelpMenuView()
    {
        //Create a new HelpMenuView object.
        HelpMenuView theHelpMenu = new HelpMenuView();
        theHelpMenu.displayMenuView();
    }
    
     // The displaySaveGameView method
    // Purpose: display Save Game View
    // Parameters: none
    // Returns: none
    // ===================================     
    public void displaySaveGameView()
    {
        System.out.println("\nDisplay Save Game View option selected.");
    }
 
}

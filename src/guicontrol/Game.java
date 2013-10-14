/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guicontrol;

import java.util.ArrayList;

/**
 *
 * @author Jason
 */
public class Game {
    private String gamename;
   // private ArrayList<Player> players;
    private int round;
    private int trump;
    private ArrayList<Integer> hand;
    
    public Game (String gn, String u){
        gamename = gn;
        round = 0;
        trump = 0;
        hand = new ArrayList<>(0);
     //   players = new ArrayList<>(0);
       // players.add(new Player(u));
    }
    
    public void gameJoined(String[] p){
  //      for(String player : p){
  //          players.add(new Player(player));
  //      }
    }
    
    
}

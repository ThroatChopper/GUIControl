
package guicontrol;


public class GUIController {
    private LoginForm loginForm;
    private GameForm gameForm;
    private GamePanel testGamePanel;        //Note: everytime this is used, we will need to replace it with a gamepanel which is received as a parameter by whichever function it is in  
    
    public GUIController() {
        loginForm = new LoginForm(this);
    }
    
    public void runGUI() {
        loginForm.setVisible(true);
    }
    
    public void connectToServer(String ipAdd) {
        
    }
    
    public void connectionSuccesful() {
        loginForm.activateLogin();
    }
    
    public void connectionUnsuccesful() {
        loginForm.displayServerError();
    }
    
    public void attemptLogin(String username, String password) {
        
    }
    
    public void loginSuccessful() {
        loginForm.dispose();
        gameForm = new GameForm(this);
        gameForm.setVisible(true);
    }
    
    public void loginUnsuccessful(int errorCode) {
        if (errorCode == 100)
            loginForm.displayLoginError("This username is already logged onto the server");
        else if (errorCode == 101)
            loginForm.displayLoginError("Username and password pair is incorrect");
    }
    
    public void requestGamesList(String searchTerm) {
        
    }
    /*
    public void refreshGamesList(String[] joinableGames) {
        int k = 0;
        gameForm.clearGamesList();
        while (joinableGames[k] != null) {
            gameForm.addToGamesList(joinableGames[k]);
            k++;
        }
    } */
    
    public void attemptGameJoin(String gameName) {
        
    }
    
    public GamePanel gameJoinSuccessful(Game joinedGame) {
        GamePanel newGamePanel = new GamePanel(this);       //NEED TO SEND GAME HERE
        gameForm.addTab(newGamePanel, "Game");
        return newGamePanel;
        
        
    } 
    
    public void gameJoinUnsuccessful() {
        gameForm.displayJoinError();
    }
    
    public void createGame() {
        
    }
    
    public void gameCreatedSuccessfully(/*Game newGame*/) {      //This function will be almost indentical to gameJoinSuccessful - Currently using it to test
        testGamePanel = new GamePanel(this);
        gameForm.addTab(testGamePanel, "Game");
        
        testGamePanel.initializeLobby("Jebby nibs", 0); //TEST CODE
    }
    
    public void gameNotCreated() {
        gameForm.displayCreateError();
    }
    
    public void kickPlayer(String playerName) {
        playerKicked(playerName);   //TEST CODE
    }
    
    public void playerKicked(String playerName) {
        testGamePanel.updateLobbyPlayersList(playerName, 0);
    }
    
    public void playerJoined(String playerName) {       //Note: when u create a game, this function must be called to add your own name to the list.
        testGamePanel.updateLobbyPlayersList(playerName, 1);
    }
    
    public void quitGame(Game game) {
        
    }
    
    public void gameTerminated(String quittingPlayer, GamePanel gamePanel, String gameName) {
        gameForm.indicateGameTerminated(testGamePanel, quittingPlayer, gameName);       //need to change to gamePanel
    }
    
    public void requestGameStart(/*Game game*/) {
        
    }
    
    public void gameStartSuccessful(/*Game startedGame*/) {
        
    } 
    
    public void sendMessage(String recipientUsernames, String message) {
        
    }
    
    public void messageSentSuccess() {
        gameForm.displaySentMessage();
    }
    
    public void recipientNotValid() {
        gameForm.displayMessageError();
    }
    
    public void sendGameChatMessage(String message) {
        
    }
    
    public void lobbyMessageSentSuccess(/*GamePanel gamePanel*/) {
        testGamePanel.lobbyMessageSent();
    }
}

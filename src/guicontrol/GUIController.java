
package guicontrol;


public class GUIController {
    private LoginForm loginForm;
    private GameForm gameForm;
    
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
        gameForm.addToGamesList(gameName + " new");     //TEST CODE
    }
    
    public GamePanel gameJoinSuccessful(/*Game joinedGame*/) {
        GamePanel newGamePanel = new GamePanel();
        gameForm.addTab(newGamePanel, "Game");
        return newGamePanel;
    } 
    
    public void gameJoinUnsuccessful() {
        gameForm.displayJoinError();
    }
    
    public void createGame() {
        
    }
    /*
    public void gameCreatedSuccesfully(Game newGame) {
        
    } */
}

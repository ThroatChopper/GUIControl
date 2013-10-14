/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guicontrol;

import java.util.Vector;

/**
 *
 * @author Tiaan
 */
public class GameLobbyPanel extends javax.swing.JPanel {

    /**
     * Creates new form GameLobbyPanel
     */
    private GUIController controller;
    private Vector<String> playersListVector;
    private String messageTemp;
    
    public GameLobbyPanel(GUIController controllerIn) {
        initComponents();
        controller = controllerIn;
        playersListVector  = new Vector<String>();
        playersListVector.clear();
    }
    
    public void initializeLobbyAsHost(String gameName) {
        lblLobbyHeading.setText(gameName);
        btnKick.setEnabled(true);
        btnStartGame.setEnabled(false);
        btnLeaveGame.setText("Close game");
    }
    
    public void initializeLobby(String gameName) {
        lblLobbyHeading.setText(gameName);
        btnKick.setEnabled(false);
        btnStartGame.setEnabled(false);
        btnLeaveGame.setEnabled(false);
    }
    
    public void addToPlayerList(String playerName) {
        playersListVector.add(playerName);
        listPlayersList.setListData(playersListVector);
        if (playersListVector.size() >= 3)
            btnStartGame.setEnabled(true);
    }
    
    public void removeFromPlayersList(String playerName) {
        playersListVector.remove(playerName);
        listPlayersList.setListData(playersListVector);
        if (playersListVector.size() < 3)
            btnStartGame.setEnabled(false);
    }
    
    public void displaySentMessage() {
        taGameChatOut.append("Your username here : " + messageTemp + "\n");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLobbyHeading = new javax.swing.JLabel();
        spPlayersList = new javax.swing.JScrollPane();
        listPlayersList = new javax.swing.JList();
        btnKick = new javax.swing.JButton();
        btnStartGame = new javax.swing.JButton();
        btnLeaveGame = new javax.swing.JButton();
        spGameChatOut = new javax.swing.JScrollPane();
        taGameChatOut = new javax.swing.JTextArea();
        spGameChatIn = new javax.swing.JScrollPane();
        taGameChatIn = new javax.swing.JTextArea();
        btnGameChatSend = new javax.swing.JButton();

        lblLobbyHeading.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblLobbyHeading.setText("SOMEONE'S GAME 1");

        listPlayersList.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        listPlayersList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        spPlayersList.setViewportView(listPlayersList);

        btnKick.setText("Kick player");
        btnKick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKickActionPerformed(evt);
            }
        });

        btnStartGame.setText("Start game");
        btnStartGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartGameActionPerformed(evt);
            }
        });

        btnLeaveGame.setText("Close game");
        btnLeaveGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeaveGameActionPerformed(evt);
            }
        });

        taGameChatOut.setColumns(20);
        taGameChatOut.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        taGameChatOut.setRows(5);
        taGameChatOut.setEnabled(false);
        spGameChatOut.setViewportView(taGameChatOut);

        taGameChatIn.setColumns(20);
        taGameChatIn.setLineWrap(true);
        taGameChatIn.setRows(5);
        taGameChatIn.setWrapStyleWord(true);
        spGameChatIn.setViewportView(taGameChatIn);

        btnGameChatSend.setText("Send");
        btnGameChatSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGameChatSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spGameChatOut, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spPlayersList)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spGameChatIn, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnGameChatSend, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnStartGame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLeaveGame, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(btnKick, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(lblLobbyHeading)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblLobbyHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spPlayersList)
                    .addComponent(btnKick, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnStartGame, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLeaveGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spGameChatOut, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGameChatSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spGameChatIn, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnKickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKickActionPerformed
        if (listPlayersList.getSelectedValue() != null)
            controller.kickPlayer((String) listPlayersList.getSelectedValue());
    }//GEN-LAST:event_btnKickActionPerformed

    private void btnLeaveGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeaveGameActionPerformed
     //   controller.quitGame(/*game*/);
        //TEST CODE
        controller.playerJoined("piet");
       // controller.gameTerminated("piet", null, "Jebby Nibs Fun Times For All");
    }//GEN-LAST:event_btnLeaveGameActionPerformed

    private void btnStartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartGameActionPerformed
        controller.requestGameStart(/*game*/);
    }//GEN-LAST:event_btnStartGameActionPerformed

    private void btnGameChatSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGameChatSendActionPerformed
        if (taGameChatIn.getText().length() != 0) {
            messageTemp = taGameChatIn.getText();
            controller.sendGameChatMessage(messageTemp);
            taGameChatIn.setText("");
            controller.lobbyMessageSentSuccess(); //TEST CODE
        }
    }//GEN-LAST:event_btnGameChatSendActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGameChatSend;
    private javax.swing.JButton btnKick;
    private javax.swing.JButton btnLeaveGame;
    private javax.swing.JButton btnStartGame;
    private javax.swing.JLabel lblLobbyHeading;
    private javax.swing.JList listPlayersList;
    private javax.swing.JScrollPane spGameChatIn;
    private javax.swing.JScrollPane spGameChatOut;
    private javax.swing.JScrollPane spPlayersList;
    private javax.swing.JTextArea taGameChatIn;
    private javax.swing.JTextArea taGameChatOut;
    // End of variables declaration//GEN-END:variables
}
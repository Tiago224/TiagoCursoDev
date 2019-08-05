package Exemplo;

import javax.swing.JOptionPane;

public class autenticador {
    public static void main(String [] args){
        String username= JOptionPane.showInputDialog(" Nome do "+"Usuario:");
        String password = JOptionPane.showInputDialog("senha:");

        if(username !=null && password != null && ((username.equals("bburd") && password.equals("swordfish")) ||
                        (username.equals("hriter") && password.equals("preakston"))
                )
                )


        {
            JOptionPane.showMessageDialog(null," Você está conectado.");

        } else {
            JOptionPane.showMessageDialog(null,"Você é suspeito.");
        }
    }
}


package Aula;

import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame { 

    // Construtor da classe Janela
	
    public Janela(String _titulo, Dimension _tamanho) {
        setTitle(_titulo);       
        setSize(_tamanho);        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        getContentPane().setLayout(null);
        getContentPane().setBackground(new Color(255, 255, 0)); 
    }

    public static void main(String[] args) {
        Janela jan = new Janela("Minha Janela", new Dimension(400, 400)); 
        jan.setVisible(true); 
    }
}

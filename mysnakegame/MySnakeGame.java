package mysnakegame;
import javax.swing.*;

public class MySnakeGame extends JFrame{

    MySnakeGame(){
        super("Snake Game"); //must be 1st line in constructor
        add(new MyBoard());
        pack();//refreah frame when frame is already open
        
        setResizable(false);
        setLocationRelativeTo(null);//place frame in center of window
        
    }
    public static void main(String[] args) {
        new MySnakeGame().setVisible(true); //make frame visible

    }
    
}

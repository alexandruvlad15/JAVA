import java.awt.*;
import javax.swing.*;

public class Image extends JFrame{ //cu JFrame se insereaza elemente GUI, cu extends, Image va mosteni caracteristicile GUI
  private ImageIcon image1; //obiect ce va contine imaginea
  private JLabel label1; //pentru afisarea imaginii
  Image(){
    setLayout(new FlowLayout()); //pentru a ne dispune imaginea asa cum o stim, cu elemente unul langa altul
    image1=new ImageIcon(getClass().getResource("ph.jpeg"));
    label1=new JLabel(image1); //crearea suportului pentru imagine
    add(label1); //adauga label-ul in fereastra
  }
  public static void main(String args[]){
    Image gui=new Image();
    gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gui.setVisible(true);
    gui.pack(); //ajusteaza automat dimensiunile imaginii
    gui.setTitle("Img");
  }
}
  

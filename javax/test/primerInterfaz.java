import javax.swing.*;
public class primerInterfaz{ 
	public static void main(String[] args){
	JFrame frame = new JFrame("Mi primer interfaz");
	JButton button = new JButton("Click Aqui");

	frame.setSize(500,500);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(button);
	frame.setVisible(true);
	}
}

package tp74;

import java.awt.*;
import java.awt.event.*;
		 
		// An AWT GUI program inherits the top-level container java.awt.Frame
		public class calc extends Frame {
		   private Button[] btn;  // Array of 10 numeric Buttons
		   private Button btnHash, btnStar;
		   private TextField tfDisplay;
		 
		   // Constructor to setup GUI components and event handlers
		   public calc () {
		      // Set up display panel
		      Panel panelDisplay = new Panel(new FlowLayout());
		      tfDisplay = new TextField("0", 20);
		      panelDisplay.add(tfDisplay);
		 
		      // Set up button panel
		      Panel panelButtons = new Panel(new GridLayout(4, 3)); // 4 = lignes , 3= col 
		      btn = new Button[10];  // Construct an array of 10 numeric Buttons
		      
		      btn[1] = new Button("1");  // Construct Button "1"
		      panelButtons.add(btn[1]);  // The Panel adds this Button
		     
		      btn[2] = new Button("2");
		      panelButtons.add(btn[2]);
		      
		      btn[3] = new Button("3");
		      panelButtons.add(btn[3]);
		      
		
		            // You should use a loop for the above statements!!!
		      btnStar = new Button("*");
		      panelButtons.add(btnStar);
		      
		      btn[0] = new Button("0");
		      panelButtons.add(btn[0]);
		      
		      btnHash = new Button("#");
		      panelButtons.add(btnHash);
		 
		      setLayout(new BorderLayout());  // "super" Frame sets to BorderLayout
		      add(panelDisplay, BorderLayout.NORTH);
		      add(panelButtons, BorderLayout.CENTER);
		 
		      setTitle("caculatrice"); // "super" Frame sets title
		      setSize(250, 250);  // la taille de l'afichage           // "super" Frame sets initial size
		      setVisible(true);              // "super" Frame shows
		   }
		 
		   // The entry main() method
		   public static void main(String[] args) {
		      new calc();  // Let the constructor do the job
		   }
	

}

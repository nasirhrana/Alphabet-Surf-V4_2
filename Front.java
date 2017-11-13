import javax.swing.*;
import java.awt.event.*;

class Front extends JFrame implements ActionListener{
	
	JLabel top = new JLabel ("Alphabet Surf");
	
	JButton b1 = new JButton("Learn Alphabets");
	JButton b2 = new JButton("Word Book");
	JButton b3 = new JButton("Play Games");
	
	JButton bk = new JButton("Back");
	
public Front() {
	
	setSize(600,500);
	setVisible(true);
	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	
	setLayout(null);
	
	top.setBounds(220,20,100,45);
	add (top);
	
	b1.setBounds(180,120,170,55);
	add (b1);
	
	b2.setBounds(180,190,170,55);
	add(b2);
	
	b3.setBounds(180,260,170,55);
	add(b3);
	
	
	//ACTION LISTENER
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	
}

public void actionPerformed(ActionEvent e){
	
	if (e.getSource()==b1) {
		
		LearnPage lp = new LearnPage();
		this.setVisible(false);
		
		
	}
	
	else if (e.getSource()==b2) {
		
		WordBook wbk = new WordBook();
		this.setVisible(false);
		
	}
	
	else {
		
		Games gms = new Games();
		this.setVisible(false);
		
	}	
		
}
}
	

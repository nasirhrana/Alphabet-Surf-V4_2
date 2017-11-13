import javax.swing.*;
import java.awt.event.*;

class LearnPage extends JFrame implements ActionListener {

	JLabel l1 = new JLabel("Learn Alphabets");
	
	JButton b1 = new JButton("Capital Letter");
	JButton b2 = new JButton("Small Letter");
	//JButton b3 = new JButton("Vowel");
	//JButton b4 = new JButton("Consonant");
	
	JButton bk = new JButton("Back");


public LearnPage() {

	setSize(600,500);
	setVisible(true);
		
	setLayout(null);
	
	l1.setBounds(240,30,150,30);
	add (l1);
	
	b1.setBounds(150,120,250,50);
	add (b1);
	
	b2.setBounds(150,190,250,50);
	add(b2);
	
	/*b3.setBounds(150,260,250,50);
	add(b3);
	
	b4.setBounds(150,330,250,50);
	add(b4);*/
	
	
	bk.setBounds(230,300,100,30);
	add(bk);
	
	//LISTENER 
	
    b1.addActionListener(this);
    b2.addActionListener(this);
    /*b3.addActionListener(this);  
    b4.addActionListener(this);*/
    bk.addActionListener(this);   	
	
}

public void actionPerformed(ActionEvent e){
	
	if (e.getSource()==b1) {
		
		Learn lrn = new Learn(this);
		this.setVisible(false);
		
		
	}
	
	if (e.getSource()==b2) {
		
		Small s = new Small(this);
		this.setVisible(false);
		
	}
	
	if (e.getSource()==bk) {
		
		Front ft = new Front();
		this.setVisible(false);	
	}
	
	/*else {
		
		Games gms = new Games();
		this.setVisible(false);
		
	}*/	
		
}

}


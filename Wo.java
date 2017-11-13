import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Wo extends JFrame implements ActionListener{
	
	Small previous;
	JButton back;
	
	public Wo(int recieve,Small p)
	{
		//pointing previous frane
		previous=p;
		
		//back button
		back = new JButton("Back");
		back.addActionListener(this);
		back.setBounds(450,600,100,50);
		
		//preparing Image
		char tempa=(char)(97+recieve);
		String imageName="Words/"+String.valueOf(tempa)+".jpg";
		ImageIcon img=new ImageIcon(((new ImageIcon(imageName)).getImage()).getScaledInstance(600,600, java.awt.Image.SCALE_SMOOTH));
		JLabel image=new JLabel(img);
		image.setBounds(0,0,600,600);
		
		
		setLayout(null);
		add(image);
		add(back);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(600,700);
		setVisible(true);
	}
	
public void actionPerformed(ActionEvent e){
	
	if(e.getSource()==back)
	{
	   System.out.println("Word");
		previous.setVisible(true);
		this.dispose();
	}
}

}
package awt;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


class WindowListenerImpl implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Window activated");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("window closing");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("window deActivated");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("window Iconified");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("window deIconified");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
class MyFrame extends Frame implements ActionListener{
    //components
	Label login;
	Label lusername;
	Label lpassword;
	TextField tusername;
	TextField tpassword;
	Button sbutton;
	WindowListenerImpl wl;
	
	MyFrame(){
		this.setVisible(true);
		this.setBounds(500,50,450,300);
		this.setLayout(null);
		this.setTitle("Inheritance Frame");
		wl =  new WindowListenerImpl();
		
		Font newF = new Font("serif",Font.BOLD,20);
		//initialize when object is created.
    //Object of label
		login = new Label("Login Form");
		lusername = new Label("Username");
		lpassword = new Label("Password");
		
		//object of textfield 
		tusername = new TextField();
		tpassword = new TextField(); 
//		tpassword.setEchoChar('*');
		
		//button
		sbutton = new Button("Submit");
		
		//set size components
		this.login.setBounds(150,30,150,30);
		this.lusername.setBounds(50,70,150,30);
		this.lpassword.setBounds(50,120,150,30);
		this.tusername.setBounds(200,70,200,30);
		this.tpassword.setBounds(200,120,200,30);
		this.sbutton.setBounds(190,190,90,40);
		this.login.setFont(newF);
    
    //add all declared components in the frame.
		this.add(login);
		this.add(lusername);
		this.add(lpassword);
		this.add(tusername);
		this.add(tpassword);
		this.add(sbutton);
		this.addWindowListener(wl);
    
		//addActionListener adds a check in functionality to a button.
		sbutton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
    //store entered value of textfield inside variables.
		String user = tusername.getText();
		String pwd = tpassword.getText();
    //check and authenticate if username and password is true.
		if(user.equalsIgnoreCase("A_007") && pwd.equals("A007")) {
			System.out.println("Login success");
		}else {
			System.out.println("Login Failed");
		}
	}
}
public class Demo {
	public static void main(String args[]) {
  //object of myFrame.
	MyFrame obj = new MyFrame();
	}
}

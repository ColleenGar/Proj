
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class GrossPay1 implements ActionListener  {
	Frame f;
	Label  lbl1, lbl2, lbl3, lbl4, lbl5, lbl6;
	TextField txtName,txtWork, txtPosition, txtHours, txtgrossPay;
	Button btnCompute, btnClear;
	public GrossPay1() {
		f=new Frame("Gross Pay Calculator");
		f.setLayout(null);
		
		lbl1=new Label("Name: ");
		lbl2=new Label("Nature of Work: ");
		lbl3=new Label("Position: ");
		lbl4=new Label("Hours worked: ");
		lbl5=new Label("Total Gross Pay");
		lbl6=new Label("Gross Pay");
		txtName=new TextField();
		txtWork=new TextField();
		txtPosition=new TextField();
		txtHours=new TextField();
		txtgrossPay=new TextField();
		btnCompute=new Button("Compute");
		btnClear=new Button("Clear");
		f.setBounds(100, 100, 791, 633);
		
		//Bounds
		lbl1.setBounds(219, 176, 78, 29);      
		txtName.setBounds(307, 183, 208, 19);
		lbl2.setBounds(119, 216, 192, 29);
		txtWork.setBounds(307, 227, 208, 19);
		lbl3.setBounds(201, 257, 96, 29);
		txtPosition.setBounds(307, 266, 208, 19);
		lbl4.setBounds(132, 296, 166, 29);
		txtHours.setBounds(307, 307, 208, 19);
		lbl5.setBounds(145, 482, 166, 29);
		txtgrossPay.setBounds(312, 483, 217, 30);
		lbl6.setBounds(236, 20, 321, 83);
		btnCompute.setBounds(325, 373, 177, 43);
		btnClear.setBounds(130, 160, 100, 30);
		
		//Font size and style
		lbl6.setFont(new Font("Tahoma", Font.BOLD, 64));
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtWork.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtPosition.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtHours.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl5.setFont(new Font("Arial Black", Font.PLAIN, 22));
		txtgrossPay.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCompute.addActionListener(this);
		btnClear.addActionListener(this);
		
		
		f.add(lbl1);
		f.add(lbl2);
		f.add(lbl3);
		f.add(lbl4);
		f.add(lbl5);
		f.add(lbl6);
		f.add(txtName);
		f.add(txtWork);
		f.add(txtPosition);
		f.add(txtHours);
		f.add(txtgrossPay);
		f.add(btnCompute);
		f.add(btnClear);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		GrossPay1 gui=new GrossPay1();
		
		
		Employee e = new Employee();
		Supervisor s = new Supervisor();
		Manager m = new Manager();
		

	}
	

	public void actionPerformed(ActionEvent e)	{
		
		if(e.getSource()==btnCompute) {
		
		   String name = txtName.getText();
		   String work = txtWork.getText();
		   String position = txtPosition.getText();
		   int x =  Integer.parseInt(txtHours.getText());
		   int z = x + 1000; 
		   txtgrossPay.setText(String.valueOf(z));
	    }
		else if (e.getSource()==btnClear) {
        	txtName.setText("");
        	txtWork.setText("");
        	txtPosition.setText("");
        	txtHours.setText("");
        	txtgrossPay.setText("");
        }
        }
}



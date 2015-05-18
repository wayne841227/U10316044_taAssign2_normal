import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Frame{
	public static void main(String[] args) {
    	JFrame frame = new JFrame();
    	
		frame.setLayout(new BorderLayout());   
		 	
    	JPanel circle = new Circle();
    	JPanel triangle = new Triangle();
    	JPanel square = new Square();

    	frame.add(circle,BorderLayout.NORTH);
    	frame.add(triangle,BorderLayout.CENTER);
    	frame.add(square,BorderLayout.SOUTH);
		
    	frame.setTitle("U10316044_taAssign2_normal");
    	frame.setSize(400, 300);
    	frame.setLocationRelativeTo(null); // Center the frame
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
    
}

class Circle extends JPanel{
	private JTextField jtfRadius = new JTextField(3);
  	private JTextField jtfArea = new JTextField(3);
  	private JTextField jtfPerimeter = new JTextField(3);
	
	
	private JButton compute;  
	private JButton clean;  
	
	private JLabel radius;
  	private JLabel area;
  	private JLabel perimeter;
  	private JLabel name;
  	private JLabel no1;
  	private JLabel no2;
  	private JLabel no3;
  	
  	public Circle(){
  		
  		JPanel p1 = new JPanel();
    	p1.setLayout(new GridLayout(4,3,1,1));
    	
    	p1.add(new JLabel(" "));
  		p1.add(new JLabel("Circle : "));
  		p1.add(new JLabel(" "));
  		
    	p1.add(new JLabel("Radius : "));
    	p1.add(jtfRadius);
    	compute = new JButton("Compute");
    	p1.add(compute);

    	p1.add(new JLabel("The area is : "));
    	p1.add(jtfArea);
  		p1.add(new JLabel(" "));
 
    	p1.add(new JLabel("The perimeter is : "));
    	p1.add(jtfPerimeter);
    	clean = new JButton("Clean");
    	p1.add(clean);
    	
    	add(p1);
    	compute.addActionListener(new ButtonListener1());
    	clean.addActionListener(new ButtonListener2());
  	}
  	
  	private class ButtonListener1 implements ActionListener {
    	
    	@Override /** Handle the action event */
    	public void actionPerformed(ActionEvent e) {
    	
    		double Perimeter = Integer.parseInt(jtfRadius.getText())*2*3.14;
    		double Area = Integer.parseInt(jtfRadius.getText())*
    			Integer.parseInt(jtfRadius.getText())*3.14;
    		
    		jtfPerimeter.setText(String.format("%f",Perimeter));
    		jtfArea.setText(String.format("%f",Area));
  		}
  	
  	}
  	
  	private class ButtonListener2 implements ActionListener {
    	
    	@Override /** Handle the action event */
    	public void actionPerformed(ActionEvent e) {
    	
    		jtfRadius.setText("");
    		jtfArea.setText("");
    		jtfPerimeter.setText("");
  		}
  	
  	}
	
}
class Triangle extends JPanel{

	private JTextField jtfRadius = new JTextField(3);
  	private JTextField jtfArea = new JTextField(3);
  	private JTextField jtfPerimeter = new JTextField(3);
	
	
	private JButton compute;  
	private JButton clean;  
	
	private JLabel radius;
  	private JLabel area;
  	private JLabel perimeter;
  	private JLabel name;
  	private JLabel no1;
  	private JLabel no2;
  	private JLabel no3;
  	
  	public Triangle(){
  		
  		JPanel p2 = new JPanel();
    	p2.setLayout(new GridLayout(4,3,1,1));
    	
    	p2.add(new JLabel(" "));
  		p2.add(new JLabel("Triangle : "));
  		p2.add(new JLabel(" "));
  		
    	p2.add(new JLabel("Radius : "));
    	p2.add(jtfRadius);
    	compute = new JButton("Compute");
    	p2.add(compute);

    	p2.add(new JLabel("The area is : "));
    	p2.add(jtfArea);
  		p2.add(new JLabel(" "));
 
    	p2.add(new JLabel("The perimeter is : "));
    	p2.add(jtfPerimeter);
    	clean = new JButton("Clean");
    	p2.add(clean);
    	
    	add(p2);
    	compute.addActionListener(new ButtonListener1());
    	clean.addActionListener(new ButtonListener2());
  	}
  	
  	private class ButtonListener1 implements ActionListener {
    	
    	@Override /** Handle the action event */
    	public void actionPerformed(ActionEvent e) {
    	
    		double Perimeter = Integer.parseInt(jtfRadius.getText())*3;
    		double Area = Integer.parseInt(jtfRadius.getText())*
    			Integer.parseInt(jtfRadius.getText())*0.75;
    		
    		jtfPerimeter.setText(String.format("%f",Perimeter));
    		jtfArea.setText(String.format("%f",Area));
  		}
  	
  	}
  	
  	private class ButtonListener2 implements ActionListener {
    	
    	@Override /** Handle the action event */
    	public void actionPerformed(ActionEvent e) {
    	
    		jtfRadius.setText("");
    		jtfArea.setText("");
    		jtfPerimeter.setText("");
  		}
  	
  	}
	


}
class Square extends JPanel{


	private JTextField jtfRadius = new JTextField(3);
  	private JTextField jtfArea = new JTextField(3);
  	private JTextField jtfPerimeter = new JTextField(3);
	
	
	private JButton compute;  
	private JButton clean;  
	
	private JLabel radius;
  	private JLabel area;
  	private JLabel perimeter;
  	private JLabel name;
  	private JLabel no1;
  	private JLabel no2;
  	private JLabel no3;
  	
  	public Square(){
  		
  		JPanel p3 = new JPanel();
    	p3.setLayout(new GridLayout(4,3,1,1));
    	
    	p3.add(new JLabel(" "));
  		p3.add(new JLabel("Square : "));
  		p3.add(new JLabel(" "));
  		
    	p3.add(new JLabel("Radius : "));
    	p3.add(jtfRadius);
    	compute = new JButton("Compute");
    	p3.add(compute);

    	p3.add(new JLabel("The area is : "));
    	p3.add(jtfArea);
  		p3.add(new JLabel(" "));
 
    	p3.add(new JLabel("The perimeter is : "));
    	p3.add(jtfPerimeter);
    	clean = new JButton("Clean");
    	p3.add(clean);
    	
    	add(p3);
    	compute.addActionListener(new ButtonListener1());
    	clean.addActionListener(new ButtonListener2());
  	}
  	
  	private class ButtonListener1 implements ActionListener {
    	
    	@Override /** Handle the action event */
    	public void actionPerformed(ActionEvent e) {
    	
    		double Perimeter = Integer.parseInt(jtfRadius.getText())*4;
    		double Area = Integer.parseInt(jtfRadius.getText())*
    			Integer.parseInt(jtfRadius.getText());
    		
    		jtfPerimeter.setText(String.format("%f",Perimeter));
    		jtfArea.setText(String.format("%f",Area));
  		}
  	
  	}
  	
  	private class ButtonListener2 implements ActionListener {
    	
    	@Override /** Handle the action event */
    	public void actionPerformed(ActionEvent e) {
    	
    		jtfRadius.setText("");
    		jtfArea.setText("");
    		jtfPerimeter.setText("");
  		}
  	
  	}
	




}

package Alpha;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Alphabet extends JFrame {

	private JPanel contentPane;
	private JTextField text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Alphabet frame = new Alphabet();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Alphabet() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 674, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel alpha = new JPanel();
		alpha.setBounds(0, 157, 658, 117);
		contentPane.add(alpha);
		alpha.setLayout(new GridLayout(2, 13, 0, 0));
		
		JPanel num = new JPanel();
		num.setBounds(0, 273, 658, 41);
		contentPane.add(num);
		
		JPanel space = new JPanel();
		space.setBounds(10, 314, 638, 39);
		contentPane.add(space);
		space.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnSpace = new JButton("Space");///////////
		btnSpace.addActionListener (new BtnListener());
		btnSpace.setActionCommand (" ");
		space.add(btnSpace);
		
		JPanel panel = new JPanel();
		panel.setBounds(64, 35, 502, 104);
		contentPane.add(panel);
		panel.setLayout(null);
		
		text = new JTextField();
		text.setBounds(20, 20, 460, 73);
		panel.add(text);
		text.setColumns(10);
		

		
		JButton keyboardA[] = new JButton[26];
		for (int i = 0; i <keyboardA.length; i ++)
		{
			int color1 = (int)(Math.random()*255 + 1);
			int color2 = (int)(Math.random()*255 + 1);
			int color3 = (int)(Math.random()*255 + 1);
			
			keyboardA[i] = new JButton ("" +(char)( i+ 97));
			keyboardA [i].addActionListener (new BtnListener());
			keyboardA [i].setActionCommand ("" + (char) (i + 97));
			keyboardA[i].setBackground(new Color (color1, color2, color3));
		    alpha.add(keyboardA[i]);
		}
		
		JButton keyboardN[] = new JButton[10];
		for (int i = 0; i <keyboardN.length; i ++)
		{
			int color1 = (int)(Math.random()*255 + 1);
			int color2 = (int)(Math.random()*255 + 1);
			int color3 = (int)(Math.random()*255 + 1);
			
			keyboardN[i] = new JButton ("" + i );
			keyboardN [i].addActionListener (new BtnListener());
			keyboardN [i].setActionCommand ("" + i );
			keyboardN[i].setBackground(new Color (color1, color2, color3));

		    num.add(keyboardN[i]);
		}
		
	}
	
	class BtnListener implements ActionListener 
	{        
        public void actionPerformed(ActionEvent e) 
        {
        	text.setText (text.getText () + e.getActionCommand ());       
        }
    }
	
	
}

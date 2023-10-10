import java.awt.*;	
import java.awt.event.*;  
import javax.swing.*;
public class ExCheckBox extends JFrame 
implements ItemListener{	
	JLabel l1;	
	JCheckBox c1,c2;
	static int negrito=0,italico=0;
	public static void main(String args[])	{	
		new ExCheckBox ();		
	}

	ExCheckBox ()	{	
		setBackground(new Color(180,180,180)); 
		setTitle("Uso do JCheckBox");
		setSize(450,70);		
		setLayout(new FlowLayout());
		
		l1 = criarRotulo();		
		c1 = criarCaixaChecagem("Negrito");
		c2 = criarCaixaChecagem("Italico");		 	
		setLocationRelativeTo(null);	
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
	}
	private JCheckBox criarCaixaChecagem(String texto) {
		JCheckBox check = new JCheckBox(texto);
		check.setBackground(new Color(180,180,180));
		check.addItemListener(this);
		add(check);
		return check;
	}

	private JLabel criarRotulo() {
		JLabel rotulo = new JLabel(JOptionPane.showInputDialog(
				"Digite um texto"));
		rotulo.setFont(new Font("Arial",Font.PLAIN,20)); 
		rotulo.setForeground(new Color(26,72,17));
		add(rotulo);
		return rotulo;
	}

	public void itemStateChanged(ItemEvent e){  
		if(e.getSource()==c1){
			if(e.getStateChange()==ItemEvent.SELECTED) 
				negrito=Font.BOLD;
			else  
				negrito=Font.PLAIN;		
		}  
		if(e.getSource()==c2){     
			if(e.getStateChange()==ItemEvent.SELECTED) 
				italico=Font.ITALIC;
			else  
				italico=Font.PLAIN;		
		}  
		l1.setFont(new Font("Arial",negrito+italico,20)); 
	}	
}

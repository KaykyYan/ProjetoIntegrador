import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ExComboBoxExemplo extends JFrame implements ActionListener, ItemListener
{
	JLabel l1;
	JTextField t1,t2,t3;
	JComboBox combo;
	JButton b1,b2,b3,b4,b5,b6; 

	public static void main(String args[]){
		new ExComboBoxExemplo();   
	}
	ExComboBoxExemplo () {
		setTitle("Uso do JComboBox");setSize(400,170); 	getContentPane().setBackground(new Color(190,190,190)); 
		l1 = new JLabel("Conteudo");
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setForeground(Color.blue);
		l1.setFont(new Font("Arial", Font.BOLD, 15)); 
		b1 = new JButton("Mostra Texto"); 
		b1.addActionListener(this); 
		b2 = new JButton("Mostra Índice"); 
		b2.addActionListener(this); 
		b3 = new JButton("Adiciona Item"); 	b3.addActionListener(this); 
		b4 = new JButton("Remove Item"); 	b4.addActionListener(this); 
		b5 = new JButton("Remove Todos"); 	b5.addActionListener(this); 
		b6 = new JButton("Quant. Itens"); 	b6.addActionListener(this);

		t1 = new JTextField(); t2 = new JTextField(); 
		t1.setHorizontalAlignment(SwingConstants.CENTER);        
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		String[] cores = {"Branco","Vermelho","Azul","Verde"}; 
		combo = new JComboBox(cores); 
		combo.addItemListener(this); 
		getContentPane().setLayout(new GridLayout(5,2)); 
		getContentPane().add(l1);		getContentPane().add(combo);
		getContentPane().add(b1);		getContentPane().add(b4);    
		getContentPane().add(b2);		getContentPane().add(b5);    
		getContentPane().add(b3);   		getContentPane().add(t1);  
		getContentPane().add(b6); 		getContentPane().add(t2);  
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==b1)
			l1.setText("Texto: "+combo.getSelectedItem());
		if (e.getSource()==b2)
			l1.setText("Índice: " + combo.getSelectedIndex()); 
		if (e.getSource()==b3)
			if (t1.getText().length()!=0)
			{combo.addItem(t1.getText());//adiciona item
			t1.setText("");      }//limpa o texto de t1 
		if (e.getSource()==b4)
			combo.removeItemAt( (combo.getSelectedIndex())); // remove o item selecionado
		if (e.getSource()==b5)
			combo.removeAllItems(); //remove todos itens 
		if (e.getSource()==b6) 
			t2.setText(""+combo.getItemCount());     } //conta a quantidade total de itens
	public void itemStateChanged(ItemEvent e)
	{ t1.setText(""+combo.getSelectedItem());  } } //mostra o item selecionado
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TesteEventoAcao extends JFrame 
	implements ActionListener{
	JLabel l1;
	JButton b1, b2;
	int i1, i2;
	public TesteEventoAcao(){
		setTitle("Teste Evento Acão");
		setSize(300,130); //tamanho da janela
		getContentPane().setLayout(null); // anula o layout padrao
		getContentPane().setBackground(new Color(255,255,255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		i1 = i2 = 0;
		b1 = criarBotao("Gravar", 10, 10, 100, 30);
		b2 = criarBotao("Sair", 120, 10, 100, 30);		
		l1 = new JLabel("Pressione os botões");
		l1.setBounds(5, 50, 220, 20);
		getContentPane().add(l1);
		setVisible(true);
	}
	private JButton criarBotao(String texto, int i, int j, int k, int l) {
		JButton botao = new JButton(texto);
		botao.setBounds(i, j, k, l);
		botao.addActionListener(this);
		add(botao);
		return botao;
	}
	
	public static void main(String [] args){
	 new TesteEventoAcao();	 
  }
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			if(i1==0)
				l1.setForeground(JColorChooser.showDialog(
	                null,
	                "Escolha a cor de fundo da tela.",
	                getBackground()));
			l1.setText("Botão gravar pressionado " + ++i1 + " vez(es)");
		}
		if (e.getSource() == b2) {
			l1.setForeground(Color.RED);
			l1.setText("Botão sair pressionado " + ++i2 + " vez(es)");
		}
		
	}
}

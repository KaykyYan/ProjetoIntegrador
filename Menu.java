import javax.swing.*;

public class Menu extends JFrame {
	JMenuBar barra = new JMenuBar();
	JMenu arquivo = new JMenu("Arquivo");
	JMenu editar = new JMenu("Editar");
	
	JMenuItem novo = new JMenuItem("Novo");
	JMenuItem salvar = new JMenuItem("Salvar");
	JMenuItem sair = new JMenuItem("Sair");
	
	JMenuItem copiar = new JMenuItem("Copiar");
	JMenuItem colar = new JMenuItem("Colar");
	JMenuItem recortar = new JMenuItem("Recortar");
	
	public Menu(){
		setTitle("Usando Menus");
		setSize(350,200);
		
		arquivo.add(novo);
		arquivo.add(salvar);
		arquivo.add(sair);
		arquivo.setMnemonic('A');
		
		editar.add(copiar);
		editar.add(colar);
		editar.add(recortar);
		
		barra.add(arquivo);
		barra.add(editar);
		
		setJMenuBar(barra);//adiciona a barra de menu na janela
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);		
	}
	public static void main(String[] args) {
	new Menu();
}
}

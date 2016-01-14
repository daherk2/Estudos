package classes;

//import java.awt.BorderLayout;
//import java.awt.Component;



/*
http://www.forumweb.com.br/foruns/index.php?showtopic=48755

http://www.devmedia.com.br/forum/ler-codigo-de-barras-que-vem-da-balanca/332989
/*
 * 
 * 
 */
//import java.awt.Dimension;
//import java.awt.EventQueue;
//import java.awt.Graphics;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.Image;
//import java.awt.Image;
//import java.awt.EventQueue;
//import java.awt.Insets;
//import java.awt.Toolkit;




































//import javax.imageio.ImageIO;
//import Excel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;

import java.awt.Dimension;
//import java.awt.EventQueue;
//import java.awt.EventQueue;
//import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Color;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
//import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JDialog;
//import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
//import javax.swing.JInternalFrame;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.MaskFormatter;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.filechooser.FileSystemView;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.nachocalendar.components.DateField;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import javax.swing.JList;
import javax.swing.AbstractListModel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import javax.swing.JProgressBar;

import org.jfree.ui.RefineryUtilities;

import java.awt.SystemColor;

import javax.swing.border.BevelBorder;
//import java.beans.PropertyChangeListener;
//import java.beans.PropertyChangeEvent;


//import javax.xml.crypto.dsig.keyinfo.PGPData;






import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;


public class Principal extends JFrame {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;
	//private boolean testa;
	private JPanel contentPane;
	private JButton btnNewButton_6;
	private JTextField pesquisaf;
	private final JLabel lblNome = new JLabel("Nome : ");
	private JTextField nome;
	private JTextField np;
	private JTextField nm;
	private JTextField nt;
	private JTextField rg;
	private JTextField cpf;
	private JTextField na;
	private JTextField cargo;
	private JTextField desligamento;
	private JTextField setor;
	private JTextField equipe;
	private JTextField superior;
	private JTextField chs;
	private JTextField end;
	private JTextField cid;
	private JTextField depen;
	private final JTable table = new JTable();
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField nct;
	private JTextField ag;
	private JTextField cnt;
	private DefaultTableModel model; 
	private final JTable table_1 = new JTable();
	private final JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.LEFT);
	private JTextField pesq_v;
	private final JTable table_2 = new JTable();
	private JPanel home;
	private JTextField modelo;
	private JTextField marca;
	private JTextField ano;
	private JTextField kilometragem;
	private JTextField placa;
	private JTextField consumo;
	private ResultSet cons; 
	private DefaultTableModel model_1;
	private DefaultTableModel model_2;
	private DefaultTableModel model_3;
	private DefaultTableModel model_4; 
	private DefaultTableModel model_5;
	private DefaultTableModel model_6;
	private DefaultTableModel model_7;		
	private DefaultTableModel model_11;
	private DefaultTableModel model_8;		
	private DefaultTableModel model_9;	
	private DefaultTableModel model_12;	
	private DefaultTableModel model_13;
	private JTextField ab_kl;
	private JTextField abs_lt;
	private JTextField abs_vp;
	private final JTable table_3 = new JTable();
	private JTextField rev_n;
	private JTextField rev_mec;
	private JTextField rev_dt;
	private JTextField mot_cnh;
	private final JTable table_4 = new JTable();
	private final JTable table_5 = new JTable();
	private final JTable table_6 = new JTable();
	private JComboBox<String> sx;
	private JComboBox<String> cor;
	private final JTable table_7 = new JTable();
	private JTextField pesqui;
	private final JTable table_8 = new JTable();
	private final JTable table_9 = new JTable();
	private JCheckBox kombo;
	private JTextField prod;
	private JTextField qnt;
	private JTextField un;
	private JTextField vp;
	private final JTable table_10 = new JTable();
	private JTextField user;
	private JPasswordField pas;
	private JComboBox<Object> mat_col;
	private JComboBox<Object> stok;
	private JComboBox<Object> mat_col1;
	private JComboBox<Object> stok_1;
	private final JLabel lblNome_1 = new JLabel("Nome : ");
	private JTextField nome_f;
	private final JLabel lblNewLabel_1 = new JLabel("Inscri\u00E7\u00E3o Estadual : ");
	private JTextField i_e;
	private final JLabel lblNewLabel_5 = new JLabel("Endere\u00E7o : ");
	private JTextField end_f;
	private final JLabel lblNewLabel_6 = new JLabel("Telefone :  ");
	private JTextField tel_f;
	private final JLabel lblTelefone = new JLabel("Telefone : ");
	private JTextField tel_fo;
	private final JLabel lblEmail = new JLabel("E-mail : ");
	private JTextField mail_f;
	private final JLabel lblObservao_1 = new JLabel("Observa\u00E7\u00E3o : ");
	private final JTable table_11 = new JTable();
	private JComboBox<Object> mot_vei;
	
	@SuppressWarnings("unused")
	private final JLabel lblFornecedor = new JLabel("Fornecedor : ");
	private final JLabel lblProduto_1 = new JLabel("Produto : ");
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	private final JTabbedPane tabbedPane_5 = new JTabbedPane(JTabbedPane.TOP);
	private final JLabel lblNome_2 = new JLabel("Referente : ");
	private JTextField cc_ref;
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final JComboBox<Object> fornecedor_mat = new JComboBox<Object>();
	private final JLabel lblNomerazoSocial = new JLabel("Nome/Raz\u00E3o Social  :   ");
	private JTextField cc_nome;
	private JTextArea lala;
	private  ArrayList<String> vei = new ArrayList<String>();
	private  ArrayList<String> plc = new ArrayList<String>();

	private String OBCE;
	private final JLabel lblData_1 = new JLabel("Data da Emiss\u00E3o");
	private JFormattedTextField cc_de;
	private final JLabel lblRefernte = new JLabel("Banco : ");
	private JTextField cc_bnc;
	private JTextField cc_id;
	private JTextField cc_vt;
	private JTextField cc_np;
	private JTextField cc_ent;
	private final JTable table_12 = new JTable();
	@SuppressWarnings("rawtypes")
	private final JComboBox cc_doc = new JComboBox();
	private final JTable table_13 = new JTable();
	private JTextField textField;
	private ArrayList<String> detalhes_conta;
	private final JButton btnExcluir_1 = new JButton("Excluir");
	private final JList<String> lista = new JList<String>();
	private String usuario;
	private String id;
	private JProgressBar progressBar;
	@SuppressWarnings("rawtypes")
	private final JList list_1 = new JList();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private JComboBox<Object> rev_vei = null;
	private JComboBox<Object> mot_mot = null;
	private JComboBox<Object> veicles = null;
	@SuppressWarnings("rawtypes")
	JComboBox pg_status =null;
	
	// * Launch the application.


      

    public String getOBCE() {
		return OBCE;
	}


	public void setOBCE(String oBCE) {
		OBCE = oBCE;
	}


	/*
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	 */

	// * Create the frame.




	@SuppressWarnings({ "unchecked", "rawtypes", "serial" })
	public Principal() {

		try{
		
		
		
		URL url = this.getClass().getResource("/img/plant145.png");    
		Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);    
		this.setIconImage(iconeTitulo);  
		
        
		ValidarSenha op = new ValidarSenha();
		usuario = op.get_user();
		id = op.get_ID()+"";
		
		detalhes_conta = new ArrayList<String>();


		//	static Image image = Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/img/home63.png"));

		//static TrayIcon trayIcon = new TrayIcon(image, "Mahi Software");



		TimerTask task = new TimerTask() {  
			@Override  
			public void run() {  
				limpa_fun();
				preenche_pesq_fun();
				limpa_combobox_forne(); 
				preenche_mat_forne();
				//preenche_mat();
				

			}
		};  
		Timer t = new Timer();  
		t.schedule(task, 1, 7300);




		
		TimerTask task2 = new TimerTask() {  
			@Override  
			public void run() {  
				mostra_botao();
			}
		};  
		Timer t2 = new Timer();  
		t2.schedule(task2, 1, 5300);




		Insets in = Toolkit.getDefaultToolkit().getScreenInsets(this.getGraphicsConfiguration()); 

		Dimension d = Toolkit.getDefaultToolkit().getScreenSize(); 

		int width = d.width-(in.left + in.top); 
		int height = d.height-(in.top + in.bottom); 
		setSize(width,height); 
		setLocation(in.left,in.top); 


		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 835, 627);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int yes = JOptionPane.showConfirmDialog(null, "Deseja realmente sair ?","Confirmar",JOptionPane.YES_NO_OPTION);				
				System.out.println("yes "+yes);
				
			if(yes == 0){	
				System.exit(0);
			}
			
			}
		});
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSair.setContentAreaFilled(false);
		btnSair.setBounds(1173, 17, 89, 23);
		
		contentPane.add(btnSair);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.setBackground(Color.WHITE);
		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 21));
		tabbedPane.setBounds(0, 0, width-17, height-40);
		contentPane.add(tabbedPane);
		UIManager.put("tabbedPane.selected", Color.green);




		URL imageUrl_home  = Principal.class.getResource("/img/home63.png"); 
		ImageIcon ima1 = new ImageIcon(imageUrl_home);

		home = new JPanel();
		home.setBackground(Color.WHITE);
		tabbedPane.addTab(" Home ", ima1, home, null);
		
		btnNewButton_6 = new JButton("");
		btnNewButton_6.setBounds(1084, 47, 142, 169);
		btnNewButton_6.setContentAreaFilled(false);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			painel_contas pc = new painel_contas();
			pc.setVisible(true);
			
			
			}
		});
		home.setLayout(null);
		btnNewButton_6.setIcon(new ImageIcon(Principal.class.getResource("/img/atencaao.gif")));
		btnNewButton_6.setToolTipText("Verifique contas para amanha!");
		btnNewButton_6.setBackground(Color.WHITE);
		btnNewButton_6.setBorderPainted(false);
		home.add(btnNewButton_6);
		btnNewButton_6.setVisible(false);

				
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(1068, 244, 158, 160);
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {

				//lblNewLabel_7.setToolTipText("Verifique as contas!");




			}
		});
		home.add(lblNewLabel_7);
		
		
		
		
		
		
		
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio : "+usuario);
		lblUsurio.setBounds(100, 599, 439, 52);
		if((usuario).contains("na")){
		lblUsurio.setIcon(new ImageIcon(Principal.class.getResource("/img/ana_54.jpg")));}
		lblUsurio.setFont(new Font("Tahoma", Font.PLAIN, 25));
		home.add(lblUsurio);

		
		
		JButton button_2 = new JButton("");
		button_2.setBounds(10, 593, 65, 58);
		button_2.setToolTipText("Configura\u00E7\u00F5es");
		button_2.setContentAreaFilled(false);
		button_2.setBorderPainted(false);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			String[] choices = {"","Alterar nome de usuário","Alterar senha","Sair"};	
			String saida = (String) JOptionPane.showInputDialog(null, "Opções de usuário : ",
					"Usuário", JOptionPane.PLAIN_MESSAGE, null,choices,choices[0]);
			System.out.println(saida);
			
			switch(saida){
			/*
			 * String upp = "UPDATE fornecedor SET nome='"+nome_f.getText()+"',i_e='"+i_e.getText()+"',end='"+end_f.getText()+
						"',tel='"+tel_f.getText()+"',tele='"+tel_fo.getText()+"',mail='"+mail_f.getText()+"',obs='"+obs_f.getText()+"' WHERE cnpj='"+cnpj.getText()+"';";

			*/
			case "Alterar nome de usuário":
				AcessoDB su = new AcessoDB();
				su.conecta();
				String login = JOptionPane.showInputDialog(null,"Insira novo nome de usuário : ");
				String sql = "Update login set login = '"+login+"' WHERE id = "+id+";";
				System.out.println(sql);
				usuario = login;
				lblUsurio.setText("Usu\u00E1rio : "+usuario);
				su.Atualiza(sql);
				JOptionPane.showMessageDialog(null, "Usuário alterado!");
				break;
				
			case "Alterar senha":
				AcessoDB du = new AcessoDB();
				du.conecta();
				JPasswordField pf = new JPasswordField();
				String senha = null;
				int okCxl = JOptionPane.showConfirmDialog(null, pf, "Insira nova senha : ", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				if (okCxl == JOptionPane.OK_OPTION) {
				  senha = new String(pf.getPassword());}
				//String senha = JOptionPane.showInputDialog(null,"insira nova senha : ");
				String sql1 = "Update login set senha = '"+senha+"' WHERE id = "+id+" ;";
				System.out.println(sql1);
				du.Atualiza(sql1);
				JOptionPane.showMessageDialog(null, "Senha alterada com Sucesso");
				break;
				
			case "Sair":
				System.exit(0);
			default:
				JOptionPane.showMessageDialog(null, "Escolha outra opção");
				break;
			}
			
			
			}
		});
		button_2.setBackground(Color.WHITE);
		button_2.setIcon(new ImageIcon(Principal.class.getResource("/img/128.png")));
		home.add(button_2);
		
				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setBounds(10, 11, 1029, 655);
				lblNewLabel.setIcon(new ImageIcon(Principal.class.getResource("/img/funfo.jpg")));
				home.add(lblNewLabel);
		
		




		//tabbedPane_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		URL imageUrl_team  = Principal.class.getResource("/img/team2 (2).png"); 
		ImageIcon ima2 = new ImageIcon(imageUrl_team);


		JPanel pessoal = new JPanel();
		pessoal.setBackground(Color.WHITE);
		tabbedPane.addTab(" Pessoal ", ima2, pessoal, null);
		pessoal.setLayout(null);

		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		tabbedPane_1.setBounds(0, 0, 1258, 674);
		pessoal.add(tabbedPane_1);

		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tabbedPane_1.addTab("Cadastro Colaboradores", null, tabbedPane_2, null);

		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.WHITE);
		tabbedPane_2.addTab("Dados Pessoais", null, panel_11, null);
		panel_11.setLayout(null);
		lblNome.setBounds(39, 24, 98, 31);
		panel_11.add(lblNome);

		nome = new JTextField();
		nome.setBounds(123, 29, 360, 20);
		panel_11.add(nome);
		nome.setColumns(10);

		JLabel lblNomeDoPai = new JLabel("Nome do Pai : ");
		lblNomeDoPai.setBounds(25, 77, 112, 14);
		panel_11.add(lblNomeDoPai);

		np = new JTextField();
		np.setBounds(123, 74, 360, 20);
		panel_11.add(np);
		np.setColumns(10);

		JLabel lblNomeDaMe = new JLabel("Nome da M\u00E3e : ");
		lblNomeDaMe.setBounds(25, 123, 131, 14);
		panel_11.add(lblNomeDaMe);

		nm = new JTextField();
		nm.setBounds(123, 120, 360, 20);
		panel_11.add(nm);
		nm.setColumns(10);

		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento : ");
		lblDataDeNascimento.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDataDeNascimento.setBounds(25, 258, 155, 14);
		panel_11.add(lblDataDeNascimento);

		JFormattedTextField dna = new JFormattedTextField();
		dna.setBounds(171, 255, 150, 20);
		panel_11.add(dna);

		JLabel lblNaturalidade = new JLabel("Naturalidade : ");
		lblNaturalidade.setBounds(546, 120, 131, 14);
		panel_11.add(lblNaturalidade);

		nt = new JTextField();
		nt.setBounds(664, 117, 262, 20);
		panel_11.add(nt);
		nt.setColumns(10);

		JLabel lblEstadoCivil = new JLabel("Estado Civil : ");
		lblEstadoCivil.setBounds(546, 212, 114, 14);
		panel_11.add(lblEstadoCivil);

		JComboBox<String> ec = new JComboBox<String>();
		ec.setModel(new DefaultComboBoxModel<String>(new String[] {"", "Casado", "Solteiro", "Divorciado"}));
		ec.setBounds(664, 209, 262, 20);
		panel_11.add(ec);

		JLabel lblRg = new JLabel("RG : ");
		lblRg.setBounds(39, 301, 46, 14);
		panel_11.add(lblRg);

		rg = new JTextField();
		rg.setBounds(108, 298, 213, 20);
		panel_11.add(rg);
		rg.setColumns(10);

		JLabel lblCpf = new JLabel("CPF : ");
		lblCpf.setBounds(39, 352, 46, 14);
		panel_11.add(lblCpf);

		cpf = new JTextField();
		cpf.setBounds(108, 349, 213, 20);
		panel_11.add(cpf);
		cpf.setColumns(10);

		JLabel lblSexo = new JLabel("Sexo : ");
		lblSexo.setBounds(546, 32, 90, 14);
		panel_11.add(lblSexo);

		sx = new JComboBox<String>();
		sx.setModel(new DefaultComboBoxModel<String>(new String[] {"", "Masculino", "Feminino"}));
		sx.setBounds(664, 29, 194, 20);
		panel_11.add(sx);

		JLabel lblGrauEscolar = new JLabel("Grau Escolar : ");
		lblGrauEscolar.setBounds(546, 75, 131, 14);
		panel_11.add(lblGrauEscolar);

		JComboBox<String> ge = new JComboBox<String>();
		ge.setModel(new DefaultComboBoxModel<String>(new String[] {"", "N\u00E3o Possui", "Ensino Fundamental Completo", "Ensino Fundamental Incompleto", "Ensino M\u00E9dio Completo", "Ensino M\u00E9dio Incompleto", "Ensino Superior Completo", "Ensino Superior Incompleto"}));
		ge.setBounds(664, 72, 262, 20);
		panel_11.add(ge);

		JLabel lblRaaCor = new JLabel("Ra\u00E7a/ Cor : ");
		lblRaaCor.setBounds(39, 402, 112, 31);
		panel_11.add(lblRaaCor);

		JLabel lblUf = new JLabel("UF : ");
		lblUf.setBounds(546, 161, 65, 31);
		panel_11.add(lblUf);

		JComboBox<String> uf = new JComboBox<String>();
		uf.setBounds(664, 166, 262, 20);
		panel_11.add(uf);

		String estados[] = {"AC","AL","AP","AM","BA","CE","DF","ES","GO","MA","MT","MS","MG","PA","PB","PR","PE","PI","RJ","RN","RS","RO","RR","SC","SP","SE","TO"};
		for(int i=0; i<estados.length;i++){
			uf.addItem(estados[i]);		


		}



		cor = new JComboBox<String>();
		cor.setModel(new DefaultComboBoxModel<String>(new String[] {"", "Branco", "Pardo", "Preto", "Amarelo", "Ind\u00EDgena", "Outro"}));
		cor.setBounds(108, 407, 213, 20);
		panel_11.add(cor);

		JLabel lblNacionalidade = new JLabel("Nacionalidade : ");
		lblNacionalidade.setBounds(529, 255, 131, 31);
		panel_11.add(lblNacionalidade);

		na = new JTextField();
		na.setBounds(664, 260, 262, 20);
		panel_11.add(na);
		na.setColumns(10);

		JLabel lblObservao = new JLabel("Observa\u00E7\u00E3o : ");
		lblObservao.setBounds(524, 318, 112, 31);
		panel_11.add(lblObservao);

		JTextArea obs = new JTextArea();
		obs.setLineWrap(true);
		obs.setRows(5);
		obs.setBounds(529, 360, 360, 136);
		panel_11.add(obs);

		JLabel lblEndereo = new JLabel("Endere\u00E7o : ");
		lblEndereo.setBounds(39, 161, 72, 31);
		panel_11.add(lblEndereo);

		end = new JTextField();
		end.setBounds(123, 166, 360, 20);
		panel_11.add(end);
		end.setColumns(10);

		JLabel lblCidade = new JLabel("Cidade : ");
		lblCidade.setBounds(39, 207, 98, 24);
		panel_11.add(lblCidade);

		cid = new JTextField();
		cid.setBounds(171, 209, 150, 20);
		panel_11.add(cid);
		cid.setColumns(10);

		JLabel lblNumeroDaCarteira = new JLabel("Numero da carteira de trabalho : ");
		lblNumeroDaCarteira.setBounds(25, 465, 273, 31);
		panel_11.add(lblNumeroDaCarteira);

		nct = new JTextField();
		nct.setBounds(25, 497, 296, 20);
		panel_11.add(nct);
		nct.setColumns(10);

		JLabel lblDadosBancrios = new JLabel("Dados Banc\u00E1rios : ");
		lblDadosBancrios.setBounds(25, 549, 223, 14);
		panel_11.add(lblDadosBancrios);

		ag = new JTextField();
		ag.setBounds(25, 604, 86, 20);
		panel_11.add(ag);
		ag.setColumns(10);

		JLabel lblAgncia = new JLabel("Ag\u00EAncia : ");
		lblAgncia.setBounds(25, 579, 98, 14);
		panel_11.add(lblAgncia);

		JLabel lblConta = new JLabel("Conta : ");
		lblConta.setBounds(133, 579, 115, 14);
		panel_11.add(lblConta);

		cnt = new JTextField();
		cnt.setBounds(133, 604, 139, 20);
		panel_11.add(cnt);
		cnt.setColumns(10);

		JPanel panel_13 = new JPanel();
		panel_13.setBackground(Color.WHITE);
		tabbedPane_2.addTab("Dados Profissionais", null, panel_13, null);
		panel_13.setLayout(null);

		JLabel lblCargo = new JLabel("Cargo : ");
		lblCargo.setBounds(30, 21, 95, 50);
		panel_13.add(lblCargo);

		cargo = new JTextField();
		cargo.setBounds(172, 36, 166, 20);
		panel_13.add(cargo);
		cargo.setColumns(10);

		JFormattedTextField admissao = new JFormattedTextField();
		admissao.setBounds(172, 82, 166, 20);
		panel_13.add(admissao);

		JLabel lblAdmisso = new JLabel("Admiss\u00E3o : ");
		lblAdmisso.setBounds(30, 78, 83, 28);
		panel_13.add(lblAdmisso);

		JLabel lblDesligamento = new JLabel("Desligamento : ");
		lblDesligamento.setBounds(30, 128, 95, 28);
		panel_13.add(lblDesligamento);

		desligamento = new JTextField();
		desligamento.setBounds(172, 132, 154, 20);
		panel_13.add(desligamento);
		desligamento.setColumns(10);

		JLabel lblSetor = new JLabel("Setor : ");
		lblSetor.setBounds(437, 32, 64, 28);
		panel_13.add(lblSetor);

		setor = new JTextField();
		setor.setBounds(577, 36, 178, 20);
		panel_13.add(setor);
		setor.setColumns(10);

		JLabel lblEquipe = new JLabel("Equipe : ");
		lblEquipe.setBounds(444, 78, 95, 28);
		panel_13.add(lblEquipe);

		equipe = new JTextField();
		equipe.setBounds(577, 82, 178, 20);
		panel_13.add(equipe);
		equipe.setColumns(10);

		JLabel lblSuperior = new JLabel("Superior : ");
		lblSuperior.setBounds(444, 128, 102, 28);
		panel_13.add(lblSuperior);

		superior = new JTextField();
		superior.setBounds(577, 132, 178, 20);
		panel_13.add(superior);
		superior.setColumns(10);

		JLabel lblCargaHorriaSemanal = new JLabel("Carga Hor\u00E1ria Semanal : ");
		lblCargaHorriaSemanal.setBounds(30, 179, 200, 33);
		panel_13.add(lblCargaHorriaSemanal);

		chs = new JTextField();
		chs.setBounds(172, 185, 86, 20);
		panel_13.add(chs);
		chs.setColumns(10);

		JLabel lblStatus = new JLabel("Status : ");
		lblStatus.setBounds(444, 179, 95, 33);
		panel_13.add(lblStatus);

		JComboBox<String> status = new JComboBox<String>();
		status.setModel(new DefaultComboBoxModel<String>(new String[] {"", "Atuante", "N\u00E3o Atuante"}));
		status.setBounds(577, 185, 178, 20);
		panel_13.add(status);
		status.setSelectedItem("Atuante");


		JCheckBox log = new JCheckBox("Acesso ao sistema?");
		log.setBounds(52, 233, 200, 50);
		panel_13.add(log);

		user = new JTextField();
		user.setBounds(106, 305, 200, 20);
		panel_13.add(user);
		user.setColumns(10);

		JLabel luser = new JLabel("Usu\u00E1rio : ");
		luser.setBounds(30, 308, 154, 14);
		panel_13.add(luser);

		JLabel lpas = new JLabel("Senha : ");
		lpas.setBounds(30, 352, 125, 14);
		panel_13.add(lpas);

		pas = new JPasswordField();
		pas.setBounds(106, 349, 200, 20);
		panel_13.add(pas);

		lpas.setVisible(false);
		luser.setVisible(false);
		pas.setVisible(false);
		user.setVisible(false);


		JPanel nd = new JPanel();
		nd.setBackground(Color.WHITE);
		tabbedPane_2.addTab("Dados Familiares", null, nd, null);
		nd.setLayout(null);

		JLabel lblDependente = new JLabel("Dependente : ");
		lblDependente.setBounds(33, 97, 121, 14);
		nd.add(lblDependente);

		depen = new JTextField();
		depen.setBounds(167, 94, 347, 20);
		nd.add(depen);
		depen.setColumns(10);

		JLabel lblDataDeNascimento_1 = new JLabel("Data de Nascimento : ");
		lblDataDeNascimento_1.setBounds(544, 97, 163, 14);
		nd.add(lblDataDeNascimento_1);

		JFormattedTextField dn = new JFormattedTextField();
		dn.setBounds(687, 94, 141, 20);
		nd.add(dn);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 252, 935, 321);
		nd.add(scrollPane);
		table.setModel(model = new DefaultTableModel(
				new Object[][] {
						{null, null, null},
				},
				new String[] {
						"Nome ", "Nascimento", "Sexo"
				}
				));
		table.getColumnModel().getColumn(0).setPreferredWidth(326);
		table.getColumnModel().getColumn(1).setPreferredWidth(126);
		table.getColumnModel().getColumn(2).setPreferredWidth(161);
		scrollPane.setViewportView(table);

		model.removeRow(0);

		JRadioButton sx_m = new JRadioButton("Masculino ");

		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {


				String dep = depen.getText();
				String nascimento_d = dn.getText();
				String selecte = null;

				if(sx_m.isSelected()){
					selecte = "Masculino";
				}else{
					selecte = "Feminino";	
				}

				String valor [] = {dep,nascimento_d,selecte};

				model.addRow(valor);


			}
		});
		btnNewButton.setBounds(106, 164, 89, 71);
		nd.add(btnNewButton);

		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int sel = table.getSelectedRow();
				model.removeRow(sel);



			}
		});
		button.setBounds(326, 164, 89, 71);
		nd.add(button);


		log.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {

				boolean testa = log.isSelected();	


				if(testa == true){
					lpas.setVisible(true);
					luser.setVisible(true);
					pas.setVisible(true);
					user.setVisible(true);

				}else{

					lpas.setVisible(false);
					luser.setVisible(false);
					pas.setVisible(false);
					user.setVisible(false);


				}



			}
		});


		buttonGroup.add(sx_m);
		sx_m.setBounds(522, 188, 109, 23);
		nd.add(sx_m);

		JRadioButton f_sx = new JRadioButton("Feminino");
		buttonGroup.add(f_sx);
		f_sx.setBounds(651, 188, 109, 23);
		nd.add(f_sx);

		sx_m.setSelected(true);


		JLabel lblSexo_1 = new JLabel("Sexo : ");
		lblSexo_1.setBounds(512, 164, 46, 14);
		nd.add(lblSexo_1);

		JButton btnNewButton_1 = new JButton("Salvar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				AcessoDB x = new AcessoDB();

				x.conecta();


				String c_s = cor.getSelectedItem().toString();
				String s_s = sx.getSelectedItem().toString();
				String s_ge = ge.getSelectedItem().toString();
				String s_uf = uf.getSelectedItem().toString();
				String s_ec = ec.getSelectedItem().toString();
				String s_st = status.getSelectedItem().toString();

				String comandosql ="INSERT INTO dados_pe(nome, np, nm, end, cid, dn, rg,"
						+" cpf, cor, nct, ag, cnt, sx, ge, nt, uf, ec, na, obs, admissao, desligamento, chs, equipe, setor, statuse, superior,cargo)"
						+" VALUES ('"+nome.getText()+"','"+np.getText()+"','"+nm.getText()+"','"+end.getText()+"','"+cid.getText()+"','"+dna.getText()+"','"+rg.getText()
						+"','"+cpf.getText()+"','"+c_s+"','"+nct.getText()+"','"+ag.getText()+"','"+cnt.getText()+"','"+s_s+"','"+s_ge+"','"+
						nt.getText()+"','"+s_uf+"','"+s_ec+"','"+na.getText()+"','"+ obs.getText()+"','"+
						admissao.getText()+"','"+desligamento.getText()+"','"+chs.getText()+"','"+setor.getText()+"','"+equipe.getText()+"','"+
						superior.getText()+"','"+s_st+"','"+cargo.getText()+"');";

				x.grava(comandosql);






				int tam = table.getRowCount();
				//System.out.print(tam + tamt);
				String cmdsql[] = new String[tam];
				boolean t = true;
				int i =0;

				//JOptionPane.showMessageDialog(null,tam+"   "+tamt);


				if(table.getRowCount() < 0){
					while(t){

						cmdsql[i] = "INSERT INTO dados_fami(nome, nd, dn, sx)"
								+" VALUES ('"+nome.getText()+"','"+
								table.getValueAt(i,0)+"','"+		
								table.getValueAt(i,1)+"','"+
								table.getValueAt(i,2)+"'); ";
						//JOptionPane.showMessageDialog(null, cmdsql[i]);

						//System.out.println(cmdsql[i]);

						AcessoDB y = new AcessoDB();
						y.conecta();
						y.grava(cmdsql[i]);



						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {e.printStackTrace();}					
						i++;if(i == tam){t= false;}else{t = true;}


					}
				}


				if(log.isShowing()){
					String sen =  new String(pas.getPassword());
					String comandosql_1 = "INSERT INTO login(login, senha, permissao) VALUES ('"+user.getText()+"','"+sen+"');";

					AcessoDB u = new AcessoDB();
					u.conecta();
					u.grava(comandosql_1);
				}





				//	"INSERT INTO `dados_fami`(`cod`, `nd`, `sx`, `dn`) VALUES ([value-1],[value-2],[value-3],[value-4])"
				JOptionPane.showMessageDialog(null,"Salvo");
				/*
			nome.getText()+"','"+np.getText()+"','"+nm.getText()+"','"+end.getText()+"','"+cid.getText()+"','"+dna.getText()+"','"+rg.getText()
						+"','"+cpf.getText()+"','"+c_s+"','"+nct.getText()+"','"+ag.getText()+"','"+cnt.getText()+"','"+s_s+"','"+s_ge+"','"+
						nt.getText()+"','"+s_uf+"','"+s_ec+"','"+na.getText()+"','"+ obs.getText()+"','"+
						admissao.getText()+"','"+desligamento.getText()+"','"+chs.getText()+"','"+setor.getText()+"','"+equipe.getText()+"','"+
                        superior.getText()+"','"+s_st+"');";

				String c_s = cor.getSelectedItem().toString();
				String s_s = sx.getSelectedItem().toString();
				String s_ge = ge.getSelectedItem().toString();
				String s_uf = uf.getSelectedItem().toString();
				String s_ec = ec.getSelectedItem().toString();
				String s_st = status.getSelectedItem().toString();

				 */

				cor.setSelectedIndex(0);
				sx.setSelectedIndex(0);
				ge.setSelectedIndex(0);
				uf.setSelectedIndex(0);
				ec.setSelectedIndex(0);
				status.setSelectedIndex(0);
				nome.setText("");
				np.setText("");
				nm.setText("");
				end.setText("");
				cid.setText("");
				dna.setText("");
				rg.setText("");
				cpf.setText("");
				nct.setText("");
				ag.setText("");
				cnt.setText("");
				nt.setText("");
				na.setText("");
				obs.setText("");
				admissao.setText("");
				desligamento.setText("");
				chs.setText("");
				setor.setText("");
				equipe.setText("");
				superior.setText("");
				cargo.setText("");
				depen.setText("");
				dn.setText("");


				for(int i1=0;i1<model.getRowCount();i1++){
					model.removeRow(i1);
				}
				//model.removeRow(0);
				
				limpa_fun();
				//preenche_fun();
				System.out.println("Limpou");

			}
		});


		btnNewButton_1.setBounds(823, 164, 89, 71);
		nd.add(btnNewButton_1);

		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		tabbedPane_1.addTab("Controle Semanal", null, panel_9, null);
		panel_9.setLayout(null);

		JButton btnConfigurarControleSemanal = new JButton("Configurar Controle Semanal");
		btnConfigurarControleSemanal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {



			}
		});
		btnConfigurarControleSemanal.setBounds(756, 27, 181, 50);
		panel_9.add(btnConfigurarControleSemanal);

		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(31, 124, 957, 514);
		panel_9.add(scrollPane_7);
		scrollPane_7.setViewportView(table_6);
		table_6.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Fazenda/Projeto", "Atividade", "Respons\u00E1vel"
				}
				));
		table_6.getColumnModel().getColumn(0).setPreferredWidth(255);
		table_6.getColumnModel().getColumn(1).setPreferredWidth(205);
		table_6.getColumnModel().getColumn(2).setPreferredWidth(202);

		JButton btnAdicionarControle = new JButton("Adicionar Controle");
		btnAdicionarControle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {



			}
		});
		btnAdicionarControle.setBounds(101, 23, 181, 50);
		panel_9.add(btnAdicionarControle);


		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		tabbedPane_1.addTab("Pesquisar Colaborador", null, panel_10, null);
		panel_10.setLayout(null);

		JLabel lblPesquisa = new JLabel("Pesquisar : ");
		lblPesquisa.setBounds(119, 41, 243, 43);
		lblPesquisa.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panel_10.add(lblPesquisa);

		pesquisaf = new JTextField();
		pesquisaf.setBounds(271, 41, 323, 35);
		panel_10.add(pesquisaf);
		pesquisaf.setColumns(10);

		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				final TableRowSorter<DefaultTableModel> sorter;
				sorter = new TableRowSorter<DefaultTableModel>(model_2);
				table_1.setRowSorter(sorter);
				// getContentPane().add(new JScrollPane(model));

				String expr = pesquisaf.getText();
				sorter.setRowFilter(RowFilter.regexFilter(expr));
				sorter.setSortKeys(null);



			}
		});
		btnPesquisar.setBounds(631, 41, 114, 42);
		panel_10.add(btnPesquisar);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(23, 144, 965, 472);
		panel_10.add(scrollPane_1);
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {





			}
		});
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(model_2 = new DefaultTableModel(
				new Object[][] {
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				},
				new String[] {
						"Cod  ", "Nome  ", "Endere\u00E7o  ", "Cidade  ", "Nascimento  ", "Rg  ", "CPF  ", "Cor  ", "N\u00BA Carteira de Trab.  ", "Ag\u00EAncia  ", "Conta  ", "Sexo  ", "Grau Instru\u00E7\u00E3o  ", "Naturalidade  ", "Estado  ", "Est. Civil  ", "Nacionalidade  ", "Admiss\u00E3o  ", "Desligamento  ", "Carga Hor\u00E1ria  ", "Equipe  ", "Setor  ", "Superior  ", "Status  ", "Cargo  ", "Nome do pai  ", "Nome da m\u00E3e  ", "Observa\u00E7\u00E3o  "
				}
				));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(49);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(125);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(291);
		table_1.getColumnModel().getColumn(3).setPreferredWidth(147);
		table_1.getColumnModel().getColumn(4).setPreferredWidth(107);
		table_1.getColumnModel().getColumn(5).setPreferredWidth(126);
		table_1.getColumnModel().getColumn(6).setPreferredWidth(129);
		table_1.getColumnModel().getColumn(7).setPreferredWidth(139);
		table_1.getColumnModel().getColumn(8).setPreferredWidth(133);
		table_1.getColumnModel().getColumn(9).setPreferredWidth(85);
		table_1.getColumnModel().getColumn(10).setPreferredWidth(112);
		table_1.getColumnModel().getColumn(11).setPreferredWidth(135);
		table_1.getColumnModel().getColumn(12).setPreferredWidth(224);
		table_1.getColumnModel().getColumn(13).setPreferredWidth(160);
		table_1.getColumnModel().getColumn(14).setPreferredWidth(73);
		table_1.getColumnModel().getColumn(15).setPreferredWidth(137);
		table_1.getColumnModel().getColumn(16).setPreferredWidth(139);
		table_1.getColumnModel().getColumn(17).setPreferredWidth(132);
		table_1.getColumnModel().getColumn(18).setPreferredWidth(135);
		table_1.getColumnModel().getColumn(19).setPreferredWidth(115);
		table_1.getColumnModel().getColumn(20).setPreferredWidth(121);
		table_1.getColumnModel().getColumn(21).setPreferredWidth(134);
		table_1.getColumnModel().getColumn(22).setPreferredWidth(219);
		table_1.getColumnModel().getColumn(23).setPreferredWidth(144);
		table_1.getColumnModel().getColumn(24).setPreferredWidth(151);
		table_1.getColumnModel().getColumn(25).setPreferredWidth(212);
		table_1.getColumnModel().getColumn(26).setPreferredWidth(245);
		table_1.getColumnModel().getColumn(27).setPreferredWidth(352);

		table_1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int sl = table_1.getSelectedRow();

				/*  vet[1]=cons.getObject(2);
				vet[25]=cons.getObject(3);
				vet[26]=cons.getObject(4);
				vet[2]=cons.getObject(5);
				vet[3]=cons.getObject(6);
				vet[4]=cons.getObject(7);
				vet[5]=cons.getObject(8);
				vet[6]=cons.getObject(9);
				vet[7]=cons.getObject(10);
				vet[8]=cons.getObject(11);
				vet[9]=cons.getObject(12);
				vet[10]=cons.getObject(13);
				vet[11]=cons.getObject(14);
				vet[12]=cons.getObject(15);
				vet[13]=cons.getObject(16);
				vet[14]=cons.getObject(17);
				vet[15]=cons.getObject(18);
				vet[16]=cons.getObject(19);
				vet[27]=cons.getObject(20);
				vet[17]=cons.getObject(21);
				vet[18]=cons.getObject(22);
				vet[19]=cons.getObject(23);
				vet[20]=cons.getObject(24);
				vet[21]=cons.getObject(25);
				vet[22]=cons.getObject(26);
				vet[23]=cons.getObject(27);
				vet[24]=cons.getObject(28);


				 */


				AcessoDB x = new AcessoDB();
				x.conecta();
				x.Atualiza("UPDATE dados_pe SET "
						+"nome = '"+model_2.getValueAt(sl, 1)+"',"
						+"np = '"+model_2.getValueAt(sl, 25)+"',"
						+"nm = '"+model_2.getValueAt(sl, 26)+"',"
						+"end = '"+model_2.getValueAt(sl, 2)+"',"
						+"cid = '"+model_2.getValueAt(sl, 3)+"',"
						+"dn = '"+model_2.getValueAt(sl, 4)+"',"
						+"rg = '"+model_2.getValueAt(sl, 5)+"',"
						+"cpf = '"+model_2.getValueAt(sl, 6)+"',"
						+"cor = '"+model_2.getValueAt(sl, 7)+"',"
						+"nct = '"+model_2.getValueAt(sl, 8)+"',"
						+"ag = '"+model_2.getValueAt(sl, 9)+"',"
						+"cnt = '"+model_2.getValueAt(sl, 10)+"',"
						+"sx = '"+model_2.getValueAt(sl, 11)+"',"
						+"ge = '"+model_2.getValueAt(sl, 12)+"',"
						+"nt = '"+model_2.getValueAt(sl, 13)+"',"
						+"uf = '"+model_2.getValueAt(sl, 14)+"',"
						+"ec = '"+model_2.getValueAt(sl, 15)+"',"
						+"na = '"+model_2.getValueAt(sl, 16)+"',"
						+"obs = '"+model_2.getValueAt(sl, 24)+"',"
						+"admissao = '"+model_2.getValueAt(sl, 17)+"',"
						+"desligamento = '"+model_2.getValueAt(sl, 18)+"',"
						+"chs = '"+model_2.getValueAt(sl, 19)+"',"
						+"equipe = '"+model_2.getValueAt(sl, 20)+"',"
						+"setor = '"+model_2.getValueAt(sl, 21)+"',"
						+"statuse = '"+model_2.getValueAt(sl, 22)+"',"
						+"superior = '"+model_2.getValueAt(sl, 23)+"',"
						+"cargo = '"+model_2.getValueAt(sl, 24)+"' "
						+"WHERE cod = "+model_2.getValueAt(sl, 0));





			}
		});
		btnAtualizar.setBounds(23, 635, 89, 23);
		panel_10.add(btnAtualizar);

		JButton btnApagar = new JButton("Apagar");
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				int sel = table_1.getSelectedRow();
				
				System.out.println(sel);
				
			AcessoDB rt = new AcessoDB();
			rt.conecta();
			String comando = "UPDATE dados_pe SET superior = 'Não Atuante' WHERE nome = '"+model_2.getValueAt(sel, 1)+"' ";
			rt.Atualiza(comando);
			
			
			}
		});
		btnApagar.setBounds(140, 635, 89, 23);
		panel_10.add(btnApagar);

		JButton btnVerDados = new JButton("Ver dados");
		btnVerDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				/*
				nome, np, nm, end, cid, dn, rg,"
						+" cpf, cor, nct, ag, cnt, sx, ge, nt, uf, ec, na, obs, admissao, desligamento, chs, equipe, setor, statuse, superior,cargo
				 */
				String var[] = {"","Cod : ","Nome : ","Nome do pai : ","Nome da mãe : ", "Endereço : ", "Cidade : ", "Nascimento : ","Rg : ",
						"CPF : ","Cor : ","Nº Carteira de Trab. : ","Agência : ","Conta : ","Sexo : ","Grau Instrução : ", "Naturalidade : ",
						"Estado : ","Est. Civil : ","Nacionalidade : ","Observação : ","Admissão : ","Desligamento : ","Carga Horária : ",
						"Equipe : ","Setor : ","Superior : ","Status : ","Cargo : "
				};

				int s = table_1.getSelectedRow();
				System.out.println("Tamanho vetor : "+var.length+"");
				System.out.println(s+"");

				String msg = "<html> ";


				AcessoDB x = new AcessoDB();
				x.conecta();
				cons = x.Consulta("SELECT * from dados_pe WHERE nome = '"+model_2.getValueAt(s, 1)+"';");
				System.out.println("SELECT * from dados_pe WHERE nome = '"+model_2.getValueAt(s, 1)+"';");
				try {
					cons.beforeFirst();

					while(cons.next()){

						for(int i=1; i<=27;i++){
							msg = msg +var[i]+cons.getObject(i).toString()+"\n";	
							System.out.println("for");
						}				
						System.out.println("while");

					}
					try {
						x.rs.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("try");

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}






				JOptionPane optionPane = new  JOptionPane();
				optionPane.setMessage(msg);
				optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
				JDialog dialog = optionPane.createDialog(null, " Pesquisa Funcionário ");
				dialog.setVisible(true);	



			}
		});
		btnVerDados.setBounds(253, 635, 124, 23);
		panel_10.add(btnVerDados);






		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		//tabbedPane_1.addTab("Cadastrar Equipe", null, panel, null);
		//panel.setLayout(null);

		JLabel lblColaborador = new JLabel("Colaborador : ");
		lblColaborador.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblColaborador.setBounds(54, 31, 182, 22);
		panel.add(lblColaborador);



		JTextArea area = new JTextArea();
		area.setBounds(587, 82, 418, 576);
		panel.add(area);



		JButton button_1 = new JButton("+");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {



				int l = table_9.getSelectedRow();
				int c = table_9.getSelectedColumn();
				String mark = "";

				if(kombo.isSelected()){
					mark = " * ";
				}


				area.setText(model_3.getValueAt(l, c+1).toString()+mark+"\n "+area.getText());





			}
		});


		button_1.setBounds(424, 248, 62, 54);
		panel.add(button_1);

		JScrollPane scrollPane_11 = new JScrollPane();
		scrollPane_11.setBounds(25, 70, 378, 576);
		panel.add(scrollPane_11);
		table_9.setColumnSelectionAllowed(true);
		table_9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		scrollPane_11.setViewportView(table_9);
		table_9.setModel(model_3 = new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						" ","                                        Nome"
				}
				) {

			private static final long serialVersionUID = 1L;

			Class[] columnTypes = new Class[] {
					Boolean.class, Object.class
			};

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});

		kombo = new JCheckBox("Respons\u00E1vel");
		kombo.setBounds(424, 184, 136, 23);
		panel.add(kombo);

		JButton btnNewButton_5 = new JButton("Salvar");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				AcessoDB x = new AcessoDB();
				x.grava("INSERT INTO equipe(equipe) VALUES ('"+area.getText()+"')");

				try {
					x.rs.close();
				} catch (SQLException e5) {
					// TODO Auto-generated catch block
					e5.printStackTrace();
				}

			}
		});
		btnNewButton_5.setBounds(587, 11, 97, 60);
		panel.add(btnNewButton_5);


		JButton btnExibirEquipes = new JButton("Exibir Equipes");
		btnExibirEquipes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String comandosql = "SELECT equipe from equipe";

				AcessoDB x = new AcessoDB();
				x.conecta();
				cons = x.Consulta(comandosql);

				Object vet[] = new Object[10];

				try {
					cons.beforeFirst();



					int i=0;
					while(cons.next()){

						vet[i] = cons.getString("equipe");

						i++;											
					}cons.close();
				} catch (SQLException es) {
					// TODO Auto-generated catch block
					es.printStackTrace();
				}

				JFrame frame = new JFrame();
				Object selecao = JOptionPane.showInputDialog(frame, "Selecione a Equipe", "Equipes", JOptionPane.QUESTION_MESSAGE,
						null, vet, "Titan");

				String msg = selecao.toString();
				JOptionPane optionPane = new JOptionPane();
				optionPane.setMessage(msg);
				optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
				JDialog dialog = optionPane.createDialog(null, "Width 100");
				dialog.setVisible(true);



			}
		});
		btnExibirEquipes.setBounds(708, 11, 113, 60);
		panel.add(btnExibirEquipes);

		table_9.getColumnModel().getColumn(0).setPreferredWidth(47);
		table_9.getColumnModel().getColumn(1).setPreferredWidth(434);



		//table_9.remove(0);
		
		
		//model_3.removeRow(0);




		URL imageUrl_mat  = Principal.class.getResource("/img/commercial32.png"); 
		ImageIcon ima3 = new ImageIcon(imageUrl_mat);

		JPanel materiais = new JPanel();
		materiais.setBackground(Color.WHITE);
		tabbedPane.addTab(" Materiais ", ima3, materiais, null);
		materiais.setLayout(null);

		JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane_4.setFont(new Font("Tahoma", Font.PLAIN, 21));
		tabbedPane_4.setBounds(0, 0, 1258, 674);
		materiais.add(tabbedPane_4);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		tabbedPane_4.addTab("Cadastrar ", null, panel_2, null);
		panel_2.setLayout(null);

		JLabel lblProduto = new JLabel("Produto : ");
		lblProduto.setBounds(50, 42, 96, 14);
		panel_2.add(lblProduto);

		prod = new JTextField();
		prod.setBounds(50, 67, 240, 20);
		panel_2.add(prod);
		prod.setColumns(10);

		JComboBox<String> typo = new JComboBox<String>();
		typo.setModel(new DefaultComboBoxModel<String>(new String[] {"OUTRO", "EPI", "INSUMO", "FERRAMENTA"}));
		typo.setBounds(374, 67, 175, 20);
		panel_2.add(typo);

		JLabel lblTipo_1 = new JLabel("Tipo : ");
		lblTipo_1.setBounds(374, 42, 46, 14);
		panel_2.add(lblTipo_1);

		qnt = new JTextField();
		qnt.setBounds(268, 135, 77, 20);
		panel_2.add(qnt);
		qnt.setColumns(10);

		JLabel lblQuantidade = new JLabel("Quantidade : ");
		lblQuantidade.setBounds(268, 112, 111, 14);
		panel_2.add(lblQuantidade);

		JLabel lblUnidade = new JLabel("Unidade : ");
		lblUnidade.setBounds(372, 112, 116, 14);
		panel_2.add(lblUnidade);

		un = new JTextField();
		un.setBounds(374, 135, 86, 20);
		panel_2.add(un);
		un.setColumns(10);

		JLabel lblValorDoProduto = new JLabel("Valor do produto : ");
		lblValorDoProduto.setBounds(480, 112, 111, 14);
		panel_2.add(lblValorDoProduto);

		vp = new JTextField();
		vp.setBounds(480, 135, 111, 20);
		panel_2.add(vp);
		vp.setColumns(10);

		JScrollPane scrollPane_12 = new JScrollPane();
		scrollPane_12.setBounds(50, 178, 544, 467);
		panel_2.add(scrollPane_12);
		table_10.setModel(model_4 = new DefaultTableModel(
				new Object[][] {
						{null, null, null, null, null, null, null},
				},
				new String[] {
						"Produto", "Quantidade", "Unidade", "Tipo", "Valor", "Consumo", "Retorno"
				}
				));
		table_10.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table_10.getColumnModel().getColumn(0).setPreferredWidth(286);
		scrollPane_12.setViewportView(table_10);



		

		JCheckBox ru = new JCheckBox("Retorno ap\u00F3s uso");
		ru.setBounds(602, 81, 146, 23);
		panel_2.add(ru);

		JCheckBox pc = new JCheckBox("Produto de consumo");
		pc.setBounds(602, 38, 164, 23);
		panel_2.add(pc);

		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String v[] = new String[7]; 

				String sru = "";
				String spc = "";
				if(ru.isSelected()){
					sru = "Retorno";	
				}else{
					sru = "Descartável";	
				}
				if(pc.isSelected()){
					spc = "Consumo";	
				}else{
					spc = "Venda";	
				}

				//"Produto", "Quantidade", "Unidade", "Tipo", "Valor", "Consumo"

				v[0]=  prod.getText();
				v[2] = un.getText();
				v[1] = qnt.getText();
				v[3] =typo.getSelectedItem().toString(); 
				v[4] = vp.getText();
				v[5] = spc;
				v[6] = sru;


				model_4.addRow(v);


				prod.setText("");
				un.setText("");
				qnt.setText("");
				typo.setSelectedItem(0);
				vp.setText("");



			}
		});
		btnAdicionar.setBounds(619, 123, 102, 66);
		panel_2.add(btnAdicionar);

		JButton btnNewButton_3 = new JButton("Excluir");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				//int c = table_10.getSelectedColumn();
				int l = table_10.getSelectedRow();	

				model_4.removeRow(l);


				JOptionPane.showMessageDialog(null,"Excluído");

				/*
			DefaultTableModel dm = (DefaultTableModel)table_10.getModel();
			dm.getDataVector().removeAllElements();
			dm.fireTableDataChanged();

			preenche_mat();
				 */


			}
		});
		btnNewButton_3.setBounds(620, 212, 101, 66);
		panel_2.add(btnNewButton_3);

		JButton btnExcluir = new JButton("Salvar");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int tam = table_10.getRowCount();
				//System.out.print(tam + tamt);
				String cmdsql[] = new String[tam];
				boolean t = true;
				int i =0;




				while(t){

					cmdsql[i] = "INSERT INTO materiais (prod, qnt, uni, tipo, vp, pc, ru) VALUES ('"+
							table_10.getValueAt(i,0)+" - "+fornecedor_mat.getSelectedItem().toString()+"','"+	
							table_10.getValueAt(i,1).toString().replace(',', '.')+"','"+
							table_10.getValueAt(i,2)+"','"+
							table_10.getValueAt(i,3)+"','"+
							table_10.getValueAt(i,4).toString().replace(',', '.')+"','"+
							table_10.getValueAt(i,5)+"','"+
							table_10.getValueAt(i,6)+"');";

					AcessoDB y = new AcessoDB();
					y.conecta();
					y.grava(cmdsql[i]);

					try {
						Thread.sleep(1000);
					} catch (InterruptedException ew) {ew.printStackTrace();}					
					i++;if(i == tam){t= false;}else{t = true;}


				}

				JOptionPane.showMessageDialog(null,"Salvo");



				DefaultTableModel dm = (DefaultTableModel)table_10.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();
				
				DefaultTableModel dm1 = (DefaultTableModel)table_8.getModel();
				dm1.getDataVector().removeAllElements();
				dm1.fireTableDataChanged();
				
				

				preenche_mat();


			}
		});
		btnExcluir.setBounds(620, 302, 101, 66);
		panel_2.add(btnExcluir);
		fornecedor_mat.setBounds(50, 135, 196, 20);
		panel_2.add(fornecedor_mat);

		JLabel lblFornecedor_1 = new JLabel("Fornecedor : ");
		lblFornecedor_1.setBounds(50, 112, 111, 14);
		panel_2.add(lblFornecedor_1);



		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		tabbedPane_4.addTab("Pesquisar Materiais", null, panel_5, null);
		panel_5.setLayout(null);

		JLabel lblItem = new JLabel("Item : ");
		lblItem.setBounds(95, 23, 113, 22);
		panel_5.add(lblItem);

		pesqui = new JTextField();
		pesqui.setBounds(172, 24, 301, 20);
		panel_5.add(pesqui);
		pesqui.setColumns(10);

		JButton btnPesquisar_2 = new JButton("Pesquisar");

		btnPesquisar_2.setBounds(499, 23, 134, 23);
		panel_5.add(btnPesquisar_2);

		JScrollPane scrollPane_10 = new JScrollPane();
		scrollPane_10.setBounds(10, 66, 996, 592);
		panel_5.add(scrollPane_10);
		table_8.setModel(model_5 = new DefaultTableModel(
				new Object[][] {
						{null, null, null, null, null, null, null},
				},
				new String[] {
						"Produto ", "Tipo", "Qnt", "UN", "Valor", "CONSUMO", "RETORNO"
				}
				));
		scrollPane_10.setViewportView(table_8);
		
		JButton btnAlterar_1 = new JButton("Alterar");
		btnAlterar_1.setEnabled(false);
		btnAlterar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAlterar_1.setBounds(903, 23, 89, 23);
		panel_5.add(btnAlterar_1);

		


		JPanel panel_7 = new JPanel();
		panel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {



			}
		});


		/*
		tabbedPane_4.addTab("Gerar Lista de Materiais", null, panel_7, null);
		panel_7.setLayout(null);
		lblFornecedor.setBounds(422, 74, 113, 29);
		panel_7.add(lblFornecedor);
        */
		
		
		JComboBox<Object> comboBox = new JComboBox<Object>();
		comboBox.setBounds(527, 77, 201, 22);
		panel_7.add(comboBox);
		lblProduto_1.setBounds(26, 74, 86, 29);
		panel_7.add(lblProduto_1);

		JComboBox<Object> comboBox_1 = new JComboBox<Object>();
		comboBox_1.setBounds(120, 77, 201, 22);
		panel_7.add(comboBox_1);

		JRadioButton rdbtnPorProduto = new JRadioButton("Por Produto ");
		buttonGroup_1.add(rdbtnPorProduto);
		rdbtnPorProduto.setBounds(167, 33, 109, 23);
		panel_7.add(rdbtnPorProduto);

		JRadioButton rdbtnPorFornecedor = new JRadioButton("Por Fornecedor");
		buttonGroup_1.add(rdbtnPorFornecedor);
		rdbtnPorFornecedor.setBounds(545, 33, 109, 23);
		panel_7.add(rdbtnPorFornecedor);

		JButton btnGerarLista = new JButton("Gerar Lista ");
		btnGerarLista.setBounds(312, 145, 159, 54);
		panel_7.add(btnGerarLista);



		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		tabbedPane_4.addTab("Fornecedor", null, panel_3, null);
		panel_3.setLayout(null);

		JLabel lblCnpj = new JLabel("CNPJ : ");
		lblCnpj.setBounds(25, 30, 54, 20);
		panel_3.add(lblCnpj);

		JTextField cnpj = new JTextField();
		cnpj.setBounds(69, 30, 202, 20);
		panel_3.add(cnpj);
		cnpj.setColumns(10);
		lblNome_1.setBounds(423, 26, 86, 29);
		panel_3.add(lblNome_1);

		nome_f = new JTextField();
		nome_f.setBounds(490, 30, 492, 20);
		panel_3.add(nome_f);
		nome_f.setColumns(10);
		lblNewLabel_1.setBounds(37, 74, 142, 29);
		panel_3.add(lblNewLabel_1);

		i_e = new JTextField();
		i_e.setBounds(154, 78, 202, 20);
		panel_3.add(i_e);
		i_e.setColumns(10);
		lblNewLabel_5.setBounds(423, 74, 86, 29);
		panel_3.add(lblNewLabel_5);

		end_f = new JTextField();
		end_f.setBounds(490, 78, 492, 20);
		panel_3.add(end_f);
		end_f.setColumns(10);
		lblNewLabel_6.setBounds(58, 125, 86, 29);
		panel_3.add(lblNewLabel_6);

		tel_f = new JTextField();
		tel_f.setBounds(154, 129, 202, 20);
		panel_3.add(tel_f);
		tel_f.setColumns(10);
		lblTelefone.setBounds(423, 125, 86, 29);
		panel_3.add(lblTelefone);

		tel_fo = new JTextField();
		tel_fo.setBounds(490, 129, 208, 20);
		panel_3.add(tel_fo);
		tel_fo.setColumns(10);
		lblEmail.setBounds(37, 173, 86, 29);
		panel_3.add(lblEmail);

		mail_f = new JTextField();
		mail_f.setBounds(109, 177, 247, 20);
		panel_3.add(mail_f);
		mail_f.setColumns(10);
		lblObservao_1.setBounds(423, 173, 102, 29);
		panel_3.add(lblObservao_1);

		JScrollPane scrollPane_13 = new JScrollPane();
		scrollPane_13.setBounds(423, 213, 585, 67);
		panel_3.add(scrollPane_13);

		JTextArea obs_f = new JTextArea();
		scrollPane_13.setViewportView(obs_f);
		obs_f.setLineWrap(true);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				AcessoDB x = new AcessoDB();

				x.conecta();
				String texto = "INSERT INTO fornecedor(cnpj, nome, i_e, end, tel, tele, mail, obs) VALUES "
						+ "('"+cnpj.getText()+"','"+nome_f.getText()+"','"+i_e.getText()+"','"+end_f.getText()+"','"+tel_f.getText()+"','"+tel_fo.getText()+"','"+mail_f.getText()+"','"+obs_f.getText()+"');";
				x.grava(texto);

				JOptionPane.showMessageDialog(null, "Salvo");


				cnpj.setText("");
				nome_f.setText("");
				i_e.setText("");
				end_f.setText("");
				tel_f.setText("");
				tel_fo.setText("");
				mail_f.setText("");
				obs_f.setText("");


				DefaultTableModel dm = (DefaultTableModel)table_11.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();

				preenche_for();



			}
		});
		btnSalvar.setBounds(10, 226, 93, 54);
		panel_3.add(btnSalvar);

		JButton btnPesquisar_3 = new JButton("Pesquisar");
		btnPesquisar_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String comandosql = "SELECT * FROM fornecedor WHERE cnpj = '"+cnpj.getText()+"';";

				AcessoDB x = new AcessoDB();
				x.conecta();
				cons = x.Consulta(comandosql);

				try {
					cons.beforeFirst();

					while(cons.next()){

						nome_f.setText(cons.getObject("nome").toString());
						i_e.setText(cons.getObject("i_e").toString());
						tel_f.setText(cons.getObject("tel").toString());
						tel_fo.setText(cons.getObject("tele").toString());
						end_f.setText(cons.getObject("end").toString());
						mail_f.setText(cons.getObject("mail").toString());
						obs_f.setText(cons.getObject("obs").toString());




					}cons.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}







			}
		});
		btnPesquisar_3.setBounds(291, 29, 107, 23);
		panel_3.add(btnPesquisar_3);

		JButton btnNewButton_4 = new JButton("Alterar");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//Object[] options = { "Não", "Sim" };  
				//int res =  JOptionPane.showOptionDialog(null, "Tem certeza da operação?", "Informação", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);  
				
				
				String upp = "UPDATE fornecedor SET nome='"+nome_f.getText()+"',i_e='"+i_e.getText()+"',end='"+end_f.getText()+
						"',tel='"+tel_f.getText()+"',tele='"+tel_fo.getText()+"',mail='"+mail_f.getText()+"',obs='"+obs_f.getText()+"' WHERE cnpj='"+cnpj.getText()+"';";

				AcessoDB x = new AcessoDB();
				x.conecta();
				x.Atualiza(upp);

				JOptionPane.showMessageDialog(null, "Alterado");

				DefaultTableModel dm = (DefaultTableModel)table_11.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();

				preenche_for();
				
				
				
				

			}
		});
		btnNewButton_4.setBounds(113, 226, 92, 54);
		panel_3.add(btnNewButton_4);

		JScrollPane scrollPane_8 = new JScrollPane();
		scrollPane_8.setBounds(10, 304, 998, 354);
		panel_3.add(scrollPane_8);
		table_11.setModel(model_6 = new DefaultTableModel(
				new Object[][] {
						{null, null, null, null, null, null, null, null},
				},
				new String[] {
						"CNPJ", "Nome", "Insci\u00E7\u00E3o Estadual", "Endere\u00E7o", "Telefone", "Telefone", "E-mail", "Observa\u00E7\u00E3o"
				}
				));
		table_11.getColumnModel().getColumn(0).setPreferredWidth(192);
		table_11.getColumnModel().getColumn(1).setPreferredWidth(382);
		table_11.getColumnModel().getColumn(2).setPreferredWidth(217);
		table_11.getColumnModel().getColumn(3).setPreferredWidth(333);
		table_11.getColumnModel().getColumn(4).setPreferredWidth(193);
		table_11.getColumnModel().getColumn(5).setPreferredWidth(164);
		table_11.getColumnModel().getColumn(6).setPreferredWidth(217);
		table_11.getColumnModel().getColumn(7).setPreferredWidth(311);
		scrollPane_8.setViewportView(table_11);

		//JPanel panel_8 = new JPanel();
		//tabbedPane_4.addTab("Imprimir Relação Conferência", null, panel_8, null);
		table_11.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		btnExcluir_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int sel = table_11.getSelectedRow();

				String comandosql = "DELETE FROM fornecedor WHERE cnpj = '"+model_6.getValueAt(sel, 0)+"';";
				AcessoDB x = new AcessoDB();

				x.conecta();
				x.grava(comandosql);

				JOptionPane.showMessageDialog(null, "Excluido");

				DefaultTableModel dm = (DefaultTableModel)table_11.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();

				preenche_for();


			}
		});
		btnExcluir_1.setBounds(221, 226, 86, 54);
		panel_3.add(btnExcluir_1);

		JButton btnLimpar_1 = new JButton("Limpar");
		btnLimpar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				cnpj.setText("");
				nome_f.setText("");
				i_e.setText("");
				end_f.setText("");
				tel_f.setText("");
				tel_fo.setText("");
				mail_f.setText("");
				obs_f.setText("");


			}
		});
		btnLimpar_1.setBounds(317, 226, 89, 54);
		panel_3.add(btnLimpar_1);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		tabbedPane_4.addTab("Dar Baixa", null, panel_1, null);
		panel_1.setLayout(null);

		JLabel lblColaborador_2 = new JLabel("Colaborador  : ");
		lblColaborador_2.setBounds(29, 63, 124, 21);
		panel_1.add(lblColaborador_2);

		mat_col = new JComboBox<Object>();
		mat_col.setBounds(115, 58, 270, 30);
		panel_1.add(mat_col);

		JLabel lblItemDoEstoque = new JLabel("Item do estoque : ");
		lblItemDoEstoque.setBounds(29, 137, 124, 21);
		panel_1.add(lblItemDoEstoque);

		stok = new JComboBox<Object>();
		stok.setBounds(136, 129, 249, 36);
		panel_1.add(stok);

		JButton btnRegistrar_1 = new JButton("Registrar ");
		btnRegistrar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Date d1 = new Date();
				SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy  HH:mm");
				String hoje = sf.format(d1).toString();
				String produ = stok.getSelectedItem().toString();
				String nome = mat_col.getSelectedItem().toString();

				String graba =  "INSERT INTO empretimo(cod_m, cod_fun, statuse, obs, datas, data_dev) VALUES"+
						"('"+produ+"','"+nome+"','Emprestimo',' ','"+hoje+"', ' ');";
				
				AcessoDB o = new AcessoDB();
				o.conecta();
				o.grava(graba);


			//	String result = null;
				
			 String comandosql = "UPDATE materiais SET qnt=qnt-1 WHERE tipo = 'EPI' OR tipo = 'INSUMO' AND  prod = '"+stok.getSelectedItem().toString()+"'";
				//fgfg   "OUTRO", "EPI", "INSUMO", "FERRAMENTA"
			    AcessoDB op = new AcessoDB();
				op.conecta();
				op.grava(comandosql);
				
				
				
				
				JOptionPane.showMessageDialog(null,"Salvo");


			}
		});
		btnRegistrar_1.setBounds(278, 210, 107, 44);
		panel_1.add(btnRegistrar_1);

		JSeparator separator = new JSeparator();
		separator.setBounds(-11, 277, 420, 21);
		panel_1.add(separator);

		JLabel lblRegistrarDevoluo = new JLabel("Registrar Devolu\u00E7\u00E3o : ");
		lblRegistrarDevoluo.setBounds(29, 303, 124, 37);
		panel_1.add(lblRegistrarDevoluo);

		stok_1 = new JComboBox<Object>();
		stok_1.setBounds(136, 408, 249, 36);
		panel_1.add(stok_1);

		JLabel lblNewLabel_4 = new JLabel("Item do estoque : ");
		lblNewLabel_4.setBounds(23, 419, 177, 25);
		panel_1.add(lblNewLabel_4);

		JLabel lblOuParteDo = new JLabel("Ou parte do : ");
		lblOuParteDo.setBounds(29, 469, 97, 14);
		panel_1.add(lblOuParteDo);

		JButton btnNewButton_2 = new JButton("Registrar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

								
				Date d1 = new Date();
				SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy  HH:mm");
				String hoje = sf.format(d1).toString();

				String mat = mat_col1.getSelectedItem().toString();
				String fun = stok_1.getSelectedItem().toString();


				String comandosql = "UPDATE empretimo SET statuse='Devolvido',obs='"+getOBCE()+" "+lala.getText()+"', data_dev='"+hoje+"' WHERE cod_m ='"+fun+"' AND cod_fun = '"+mat+"';";
				AcessoDB x = new AcessoDB();
				x.conecta();
				x.Atualiza(comandosql);
				


			}
		});
		btnNewButton_2.setBounds(278, 614, 107, 44);
		panel_1.add(btnNewButton_2);

		JLabel lblDarBaixa = new JLabel("Dar Baixa : ");
		lblDarBaixa.setBounds(28, 22, 98, 14);
		panel_1.add(lblDarBaixa);

		lala = new JTextArea();
		lala.setBounds(29, 496, 354, 94);
		panel_1.add(lala);
		lala.setLineWrap(true);

		JLabel lblColaborador_3 = new JLabel("Colaborador : ");
		lblColaborador_3.setBounds(29, 360, 124, 21);
		panel_1.add(lblColaborador_3);

		mat_col1 = new JComboBox<Object>();
		mat_col1.setBounds(115, 351, 270, 30);
		panel_1.add(mat_col1);

		JScrollPane scrollPane_9 = new JScrollPane();
		scrollPane_9.setBounds(409, 22, 597, 636);
		panel_1.add(scrollPane_9);
		table_7.setModel(model_7 = new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Material", "Colaborador", "Status", "Empr\u00E9stimo", "Devolu\u00E7\u00E3o", "OBS : "
			}
		));
		table_7.getColumnModel().getColumn(0).setPreferredWidth(166);
		table_7.getColumnModel().getColumn(1).setPreferredWidth(156);
		table_7.getColumnModel().getColumn(2).setPreferredWidth(129);
		table_7.getColumnModel().getColumn(3).setPreferredWidth(143);
		table_7.getColumnModel().getColumn(4).setPreferredWidth(123);
		table_7.getColumnModel().getColumn(5).setPreferredWidth(197);
		scrollPane_9.setViewportView(table_7);

		table_7.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

	

		JButton btnObs = new JButton("OBS");
		btnObs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame frame = new JFrame();
				String a = JOptionPane.showInputDialog(frame, "Entre com a Observação : ").toString();

				setOBCE(a);

			}
		});
		btnObs.setBounds(141, 614, 89, 44);
		panel_1.add(btnObs);


		

		btnPesquisar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				final TableRowSorter<DefaultTableModel> sorter;
				sorter = new TableRowSorter<DefaultTableModel>(model_5);
				table_8.setRowSorter(sorter);
				// getContentPane().add(new JScrollPane(model));

				String expr = pesqui.getText();
				sorter.setRowFilter(RowFilter.regexFilter(expr));
				sorter.setSortKeys(null);

			}
		});




		URL imageUrl_fin  = Principal.class.getResource("/img/finance (3).png"); 
		ImageIcon ima4 = new ImageIcon(imageUrl_fin);

		JPanel financeiro = new JPanel();
		financeiro.setBackground(Color.WHITE);
		financeiro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {



			}
		});
		tabbedPane.addTab(" Financeiro ", ima4, financeiro, null);
		financeiro.setLayout(null);
		tabbedPane_5.setFont(new Font("Tahoma", Font.PLAIN, 24));
		tabbedPane_5.setBounds(0, 0, 1658, 923);
		financeiro.add(tabbedPane_5);
		//tabbedPane_5.setVisible(false);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		tabbedPane_5.addTab("Cadastrar Conta", null, panel_4, null);

		panel_4.setLayout(null);
		lblNome_2.setBounds(611, 27, 86, 29);
		panel_4.add(lblNome_2);

		cc_ref = new JTextField();
		cc_ref.setBounds(707, 31, 358, 20);
		panel_4.add(cc_ref);
		cc_ref.setColumns(10);

		JRadioButton areceber = new JRadioButton("A Receber");
		buttonGroup_2.add(areceber);
		areceber.setBounds(37, 171, 109, 23);
		panel_4.add(areceber);

		JRadioButton apagar = new JRadioButton("A Pagar");
		buttonGroup_2.add(apagar);
		apagar.setBounds(184, 171, 109, 23);
		panel_4.add(apagar);
		lblNomerazoSocial.setBounds(20, 27, 187, 29);
		panel_4.add(lblNomerazoSocial);

		cc_nome = new JTextField();
		cc_nome.setBounds(146, 31, 287, 20);
		panel_4.add(cc_nome);
		cc_nome.setColumns(10);

		JButton btnPesquisar_4 = new JButton("Pesquisar");
		btnPesquisar_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String comandosql = "SELECT * FROM fornecedor";  //	"Modelo", "Placa", "Consumo", "Kilometragem", "Tipo"
				AcessoDB x = new AcessoDB();
				x.conecta();
				ResultSet conv;
				conv = x.Consulta(comandosql);
				ArrayList<String> mula = new ArrayList<String>();	
				try {
					conv.beforeFirst();
					
					
					while(conv.next()){
						
						mula.add(conv.getString("nome"));
					}
					conv.close();
				} catch (SQLException est) {}
									
				
				    String[] choices = (String[]) mula.toArray(new String[mula.size()]);
				    String input = (String) JOptionPane.showInputDialog(null, "Contas - Escolha",
				        "Escolha o Fornecedor : ", JOptionPane.QUESTION_MESSAGE, null, // Use
				                                                                        // default
				                                                                        // icon
				        choices, // Array of choices
				        choices[1]); // Initial choice
				    System.out.println(input);
				    cc_nome.setText(input);
			
			
			}
		});
		btnPesquisar_4.setBounds(453, 30, 136, 23);
		panel_4.add(btnPesquisar_4);
		lblData_1.setBounds(20, 67, 128, 31);
		panel_4.add(lblData_1);


		lblRefernte.setBounds(350, 67, 98, 31);
		panel_4.add(lblRefernte);

		MaskFormatter data = null;
		try {
			data = new MaskFormatter("##/##/####");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 

		cc_de = new JFormattedTextField(data);
		cc_de.setBounds(146, 72, 109, 20);
		panel_4.add(cc_de);

		cc_bnc = new JTextField();
		cc_bnc.setBounds(394, 72, 287, 20);
		panel_4.add(cc_bnc);
		cc_bnc.setColumns(10);

		JLabel lblDocumento = new JLabel("Documento : ");
		lblDocumento.setBounds(755, 110, 86, 29);
		panel_4.add(lblDocumento);

		JLabel lblIntervaloDeDias = new JLabel("Intervalo de dias : ");
		lblIntervaloDeDias.setBounds(18, 109, 128, 31);
		panel_4.add(lblIntervaloDeDias);

		cc_id = new JTextField();
		cc_id.setText("30");
		cc_id.setBounds(146, 114, 86, 20);
		panel_4.add(cc_id);
		cc_id.setColumns(10);

		JLabel lblValorTotal = new JLabel("Valor Total : ");
		lblValorTotal.setBounds(321, 109, 86, 31);
		panel_4.add(lblValorTotal);

		cc_vt = new JTextField();
		cc_vt.setColumns(10);
		cc_vt.setBounds(394, 114, 91, 20);
		panel_4.add(cc_vt);

		JLabel lblNDeParcelas = new JLabel("N\u00BA de parcelas : ");
		lblNDeParcelas.setBounds(520, 109, 142, 31);
		panel_4.add(lblNDeParcelas);

		cc_np = new JTextField();
		cc_np.setText("1");
		cc_np.setColumns(10);
		cc_np.setBounds(627, 114, 91, 20);
		panel_4.add(cc_np);

		cc_ent = new JTextField("0");
		cc_ent.setBounds(779, 72, 114, 20);
		panel_4.add(cc_ent);
		cc_ent.setColumns(10);

		JButton btnSalvar_1 = new JButton("Salvar");
		btnSalvar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {


				AcessoDB m = new AcessoDB();


				m.conecta();
				String tipo = "";
				if(apagar.isSelected()){tipo="Pagar";}else{tipo="Receber";}
				double vp = Double.parseDouble(cc_vt.getText())/Double.parseDouble(cc_np.getText()); 
				DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");  
				java.sql.Date data = null;
				try { data = new java.sql.Date(fmt.parse(cc_de.getText()).getTime());} catch (ParseException e1) {e1.printStackTrace();} 

				String comandosql = " INSERT INTO contas"
						+ "(nome, referente, data_emis, banco, doc, tipoc, valor_parcela, qnt_parcela, total)"
						+ " VALUES ('"
						+cc_nome.getText()+"','"+cc_ref.getText()+"','"+data.toString()+"','"+
						cc_bnc.getText()+"','"+cc_doc.getSelectedItem().toString()+"','"+
						tipo+"',"+vp+","+cc_np.getText()+","+cc_vt.getText()+
						");";
				m.grava(comandosql);
				System.out.println(comandosql);





				try {cons.close();} catch (SQLException e) {e.printStackTrace();}

				try {Thread.sleep(700);} catch (InterruptedException e) {e.printStackTrace();}

				AcessoDB y = new AcessoDB();


				y.conecta();

				System.out.println("contas");

				String consulta = "SELECT cod FROM contas WHERE nome = '"+cc_nome.getText()+"';"; 


				cons = y.Consulta(consulta);
				String cod = new String();
				try {
					cons.beforeFirst();
					while(cons.next()){
						cod = cons.getString("cod");
					}
					cons.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println(cod);

				System.out.println("fim contas");

				try {Thread.sleep(100);} catch (InterruptedException e) {e.printStackTrace();}
				//"Lan\u00E7amento"," Tipo ", "Valor", "Data Venc.", "Descontos(R$)", "Acr\u00E9cimos(R$)", "Parcela", "Valor a pagar/receber"


				Data rd = new Data();



				//y.conecta();

				int c=1;
				String comandosql_1 = ""; 

				for(int i=0; i< table_12.getRowCount(); i++){
					
					y.conecta();

					String ndata = rd.mensal(model_12.getValueAt(i, 3).toString());	

					 //DecimalFormat f = new DecimalFormat("0.00");
					
					comandosql_1 = /*comandosql_1 +*/ " INSERT INTO cad_lancamentos ("
							+ "lancamento, tipo, valor_entrada,data_venc, valor_total, acrescimo, desconto, qnt_parc, valor_parc)"
							+ " VALUES ("
							+Integer.parseInt(cod)+",'"
							+model_12.getValueAt(i, 1)+"',"
							+cc_ent.getText().toString().replace(',', '.')+",'"
							+ndata+"',"
							+model_12.getValueAt(i, 2).toString().replace(',', '.')+","
							+model_12.getValueAt(i, 4).toString().replace(',', '.')+","
							+model_12.getValueAt(i, 5).toString().replace(',', '.')+",'"
							+c+"/"+cc_np.getText()+"',"
							+model_12.getValueAt(i, 7).toString().replace(',', '.')+") ; ";
					System.out.println(comandosql_1);	
					//}
					y.grava(comandosql_1);


					try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace();}	
					c++;
				}

				System.out.println("OK");	
				JOptionPane.showMessageDialog(null,"Salvo");

				cc_ent.setText("0");
				cc_nome.setText("");
				cc_ref.setText("");
				cc_bnc.setText("");
				cc_doc.setSelectedItem(0);
				cc_np.setText("1");
				cc_vt.setText("");



				DefaultTableModel dm = (DefaultTableModel)table_12.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();
				
				limpa_cnt();
				preenche_cnt("null");
				


			}
		});
		btnSalvar_1.setEnabled(false);
		btnSalvar_1.setBounds(500, 171, 89, 37);
		panel_4.add(btnSalvar_1);



		JButton btnGerar = new JButton("Gerar Parcelas");
		btnGerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				btnSalvar_1.setEnabled(true);


				int np = Integer.parseInt(cc_np.getText().replace(',', '.'));

				double vt = Double.parseDouble(cc_vt.getText().replace(',', '.'));

				if(!(cc_ent.getText()).equals("")){
					double entrada = Double.parseDouble(cc_ent.getText().replace(',', '.'));
					double rest  = vt - entrada;
					vt = rest;
				}			



				Date data = null;

				SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
				try {
					data = (Date)df.parse(cc_de.getText());
					//	dt = df.format(data);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//System.out.println(dt);

				int inter = Integer.parseInt(cc_id.getText());
				Object cc_vet[] = new Object[8];

				for(int i=1; i<=np; i++){

					Date dataD = data;

					Calendar calendar = Calendar.getInstance();
					calendar.setTime(dataD);

					calendar.add(Calendar.DAY_OF_MONTH, inter*i); 

					//	System.out.println(df.format(calendar.getTime()).toString());

					/*"Lan\u00E7amento", "Valor", "Data Venc.", "Descontos(R$)", "Acr\u00E9cimos(R$)", "Parcela", "Valor a pagar"*/
					cc_vet[0] = i;
					String tipo;
					if(apagar.isSelected()){
						tipo="Pagar";
					}else{
						tipo="Receber";
					}
					
					 DecimalFormat fmt = new DecimalFormat("0.00");
					
					cc_vet[1] = tipo;
					cc_vet[2] = fmt.format(vt);
					cc_vet[3] = df.format(calendar.getTime());
					cc_vet[4] = "0";
					cc_vet[5] = "0";
					cc_vet[6] =	i+"/"+np;	
					cc_vet[7] = fmt.format(vt/np); 	 			

					model_12.addRow(cc_vet);


				}


				//System.out.println(data);



			}
		});
		btnGerar.setBounds(321, 171, 142, 37);
		panel_4.add(btnGerar);

		JScrollPane scrollPane_14 = new JScrollPane();
		scrollPane_14.setBounds(20, 246, 1045, 308);
		panel_4.add(scrollPane_14);
		scrollPane_14.setViewportView(table_12);
		table_12.setModel(model_12 = new DefaultTableModel(
				new Object[][] {
						{null, null, null, null, null, null, null, null},
				},
				new String[] {
						"Lan\u00E7amento"," Tipo ", "Valor", "Data Venc.", "Descontos(R$)", "Acr\u00E9cimos(R$)", "Parcela", "Valor a pagar/receber"
				}
				));

		JButton btnRemoverContar = new JButton("Remover Conta");
		btnRemoverContar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int i = table_12.getSelectedRow();

				model_12.removeRow(i);



			}
		});
		btnRemoverContar.setBounds(20, 573, 148, 37);
		panel_4.add(btnRemoverContar);
		cc_doc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			
				
			
			
			}
		});
		cc_doc.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
			
				
				
				
				
			}
		});
		cc_doc.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
			
				
				
			
			
			}
		});
		cc_doc.setModel(new DefaultComboBoxModel(new String[] {"", "Cheque", "Duplicata", "Guia Pr\u00F3pria", "Cart\u00E3o"}));
		cc_doc.setBounds(832, 114, 160, 20);
		panel_4.add(cc_doc);

		JButton btnLimpar = new JButton("Limpar ");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				DefaultTableModel dm = (DefaultTableModel)table_12.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();





			}
		});
		btnLimpar.setBounds(184, 573, 148, 37);
		panel_4.add(btnLimpar);

		JLabel lblEntrada = new JLabel("Entrada : ");
		lblEntrada.setBounds(717, 75, 86, 14);
		panel_4.add(lblEntrada);

		JCheckBox chckbxHoje = new JCheckBox("Hoje");
		chckbxHoje.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {


				if(chckbxHoje.isSelected()){
					SimpleDateFormat df = new SimpleDateFormat("ddMMyyyy");
					Date hoje = new Date();
					//cc_de.setValidCharacters((df.format(hoje.getDate())).toString());
					cc_de.setText(df.format(hoje).toString());
				}

			}
		});
		chckbxHoje.setBounds(272, 71, 64, 23);
		panel_4.add(chckbxHoje);
		
		JButton btnInserirCheque = new JButton("Inserir Cheque");
		btnInserirCheque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				if((cc_doc.getSelectedItem()).equals("Cheque")){
					
					AcessoDB h = new AcessoDB();
					h.conecta();
					ResultSet ts = h.Consulta("SELECT MAX(cod) FROM contas ");
					String val=null;
					try {
						ts.beforeFirst();
						while(ts.next()){
						val = ts.getString("MAX(cod)");
						}
						int valin = Integer.parseInt(val)+1;
						val = valin+"";
					} catch (SQLException e) {}
									
					
					System.out.println(cc_np.getText()+" "+val);
					Cheque ch = new Cheque(cc_np.getText(),""+val);
					ch.setVisible(true);
				}
				
			
			}
		});
		btnInserirCheque.setBounds(1003, 113, 128, 23);
		panel_4.add(btnInserirCheque);




		table_12.getColumnModel().getColumn(0).setPreferredWidth(110);
		table_12.getColumnModel().getColumn(1).setPreferredWidth(96);
		table_12.getColumnModel().getColumn(2).setPreferredWidth(121);
		table_12.getColumnModel().getColumn(3).setPreferredWidth(108);
		table_12.getColumnModel().getColumn(4).setPreferredWidth(104);
		table_12.getColumnModel().getColumn(5).setPreferredWidth(92);
		table_12.getColumnModel().getColumn(6).setPreferredWidth(112);



		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		tabbedPane_5.addTab("Ver contas", null, panel_6, null);
		panel_6.setLayout(null);

		JScrollPane scrollPane_15 = new JScrollPane();
		scrollPane_15.setBounds(10, 53, 1237, 521);
		panel_6.add(scrollPane_15);
		scrollPane_15.setViewportView(table_13);
		table_13.setModel(model_13 = new DefaultTableModel(
				new Object[][] {
						{null ,null, null, null, null, null},
				},
				new String[] {
						"Status", "Nome", "Referente", "Emiss\u00E3o", "Vencimento", "Valor"
				}
				));
		table_13.getColumnModel().getColumn(0).setPreferredWidth(80);
		table_13.getColumnModel().getColumn(1).setPreferredWidth(167);
		table_13.getColumnModel().getColumn(2).setPreferredWidth(181);
		table_13.getColumnModel().getColumn(3).setPreferredWidth(103);
		table_13.getColumnModel().getColumn(4).setPreferredWidth(99);



		JLabel lblPesquisar = new JLabel("Pesquisar : ");
		lblPesquisar.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPesquisar.setBounds(153, 11, 163, 31);
		panel_6.add(lblPesquisar);

		textField = new JTextField();
		textField.setBounds(296, 11, 316, 31);
		panel_6.add(textField);
		textField.setColumns(10);

		JButton btnPesquisar_5 = new JButton("Pesquisar");
		btnPesquisar_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				final TableRowSorter<DefaultTableModel> sorter;
				sorter = new TableRowSorter<DefaultTableModel>(model_13);
				table_13.setRowSorter(sorter);
				// getContentPane().add(new JScrollPane(model));

				String expr = textField.getText();
				sorter.setRowFilter(RowFilter.regexFilter(expr));
				sorter.setSortKeys(null);
			
			}
		});
		btnPesquisar_5.setBounds(868, 11, 123, 31);
		panel_6.add(btnPesquisar_5);

		JButton btnDetalhar = new JButton("Detalhar");
		btnDetalhar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int sel = table_13.getSelectedRow();
		
				System.out.println(sel);
				
				ResultSet hy = null;
				AcessoDB oi = new AcessoDB();
				//Data d = new Data();
				
				SimpleDateFormat fde = new SimpleDateFormat("dd/MM/yyyy");
				
				
				String cmdsql = "SELECT * FROM contas INNER JOIN cad_lancamentos on contas.cod = cad_lancamentos.lancamento WHERE contas.nome = '"+
						model_13.getValueAt(sel, 1)+"' AND contas.referente = '"+model_13.getValueAt(sel, 2)+"';";
				oi.conecta();
				
				
				System.out.println(cmdsql);
				hy = oi.Consulta(cmdsql);
				
				String docc = null;
				int codd = 0;
				int c = 1 ;
				try{
				hy.beforeFirst();				
				
				while(hy.next()){
					if(c == 1){
									
					JOptionPane.showMessageDialog(null,
							"Nome : "+hy.getObject("nome")+
							"\n Referente : "+hy.getObject("referente")+
							"\n Data de Emissão : "+fde.format(hy.getDate("data_emis")).toString()+
							"\n Banco : "+hy.getObject("banco")+
							"\n Documento :  "+hy.getObject("doc")+
							"\n Tipo : "+hy.getObject("tipoc")+
							"\n Valor Parcela : "+hy.getObject("valor_parcela")+
							"\n Quantidade de Parcela : "+hy.getObject("qnt_parcela")+
							"\n Total : "+hy.getObject("total")
							);
					codd = hy.getInt("cod");
					docc = hy.getObject("doc").toString();
					
					}
					c++;
				}
				}catch(SQLException ert){}
				
				System.out.println("passei"+docc);
				
				if((docc).equals("Cheque")){
					//SELECT * FROM cheque WHERE cod = 65
					ResultSet hty = null;
					AcessoDB oti = new AcessoDB();
					oti.conecta();
					hty = oti.Consulta("SELECT * FROM cheque WHERE cod = '"+codd+"';");
					String msgmch = "Cheques numeros : ";
					try{
						hty.beforeFirst();				
						while(hty.next()){
							msgmch = msgmch +" \n "+hty.getString("numero"); 
						}
						}catch(SQLException ert){}
				JOptionPane.showMessageDialog(null,msgmch);
				}else{
				}	
				
				
				
				
				
				
				
							/*
cod
nome
referente
data_emis
banco
doc
tipoc
valor_parcela
qnt_parcela
total
							 */
							
							
							
			
				

				




			}
		});
		btnDetalhar.setBounds(132, 581, 105, 35);
		panel_6.add(btnDetalhar);

		JButton btnDarBaixa = new JButton("Dar Baixa");
		btnDarBaixa.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDarBaixa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int yes = JOptionPane.showConfirmDialog(null, "Deseja realmente baixar esta conta?","Confirmar",JOptionPane.YES_NO_OPTION);				
				System.out.println("yes "+yes);
				
				if(yes == 0){
				
					if(!(pg_status.getSelectedItem()).equals("Pagas")){
						int lin = table_13.getSelectedRow();System.out.println(lin);
						if(!(model_13.getValueAt(lin, 0)).equals("PAGO")){
					
				        
							Data fr = new Data();
							//double juros = 0;
							//double desco = 0;
							//int conf = JOptionPane.showConfirmDialog(null, "Deseja informar acréscimos e/ou descontos?","Confirmar",JOptionPane.YES_NO_OPTION);	
							//if(conf == 0){
							//	juros = Double.parseDouble(JOptionPane.showInputDialog("Insira o Valor do Acréscimo : ").replace(',','.'));							
							//	desco = Double.parseDouble(JOptionPane.showInputDialog("Insira o Valor do Desconto : ").replace(',','.'));
							//}
							//System.out.println(lin);
					
							//"Nome", "Referente", "Emiss\u00E3o", "Vencimento", "Valor"
							String comandosql = "UPDATE cad_lancamentos "+ 
									"INNER JOIN contas on contas.cod = cad_lancamentos.lancamento "+  
									"SET cad_lancamentos.flag = 1"+ 
									" WHERE contas.nome = '"+model_13.getValueAt(lin, 1)+"' AND cad_lancamentos.data_venc = '"+fr.mensal(model_13.getValueAt(lin, 4).toString())+"' AND contas.referente = '"+model_13.getValueAt(lin, 2)+"'";
	
	
							System.out.println(comandosql);
			
							AcessoDB x = new AcessoDB();
							x.conecta();
							x.Atualiza(comandosql);
							
							//JOptionPane.showMessageDialog(null, "Atualizado!");
			
							
							limpa_cnt();
							preenche_cnt("null");
							
							System.out.println("RODOU TABLE ");
						}else{
							JOptionPane.showMessageDialog(null, "Essa conta já foi paga!", "Alerta",JOptionPane.WARNING_MESSAGE);
						}
				        }else{
							JOptionPane.showMessageDialog(null, "Essas contas já foram pagas!", "Alerta",JOptionPane.WARNING_MESSAGE);
						}
					
				}
				
			}
		});
		btnDarBaixa.setBounds(10, 581, 113, 35);
		panel_6.add(btnDarBaixa);
		
		pg_status = new JComboBox();
		pg_status.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
			
			String var = pg_status.getSelectedItem().toString();
			
			limpa_cnt();
			preenche_cnt(var);
			
			
			
			}
		});
	pg_status.setModel(new DefaultComboBoxModel(new String[] {"Aberto", "Pagas", "Atrasadas","Todas"}));
		pg_status.setFont(new Font("Tahoma", Font.PLAIN, 14));
		pg_status.setBounds(633, 11, 218, 31);
		panel_6.add(pg_status);
		
		JButton button_3 = new JButton("Apagar");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
		    int yes = JOptionPane.showConfirmDialog(null, "Deseja realmente apagar esta conta?","Confirmar",JOptionPane.YES_NO_OPTION);		
				
		    if(yes == 0){
		    
			int sel = table_13.getSelectedRow();
			
			Data dt = new Data();
			
			String cmd = "DELETE contas, cad_lancamentos FROM contas INNER JOIN cad_lancamentos ON contas.cod = cad_lancamentos.lancamento WHERE "
					+ "contas.nome = '"+model_13.getValueAt(sel, 1)+"' AND contas.referente = '"+model_13.getValueAt(sel, 2)
					+"' AND contas.data_emis = '"+dt.mensal(model_13.getValueAt(sel, 3).toString())+"'";
			
			System.out.println(cmd);
			
			AcessoDB x = new AcessoDB();
			x.conecta();
			x.grava(cmd);
			
			JOptionPane.showMessageDialog(null, "Apagado Com Sucesso.");
		    
			limpa_cnt();
			preenche_cnt("null");
			
		    }
			
			}
		});
		button_3.setBounds(247, 581, 105, 35);
		panel_6.add(button_3);















		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		//URL imageUrl_ven  = Principal.class.getResource("/img/shop11.png"); 
		//ImageIcon ima5 = new ImageIcon(imageUrl_ven);

		//JPanel vendas = new JPanel();
		//vendas.addMouseListener(new MouseAdapter() {
		//		@Override
		//		public void mouseEntered(MouseEvent arg0) {



		//			erro();


		//		}
		//	});
		//	tabbedPane.addTab(" Vendas ", ima5, vendas, null);

		//vendas.disable();



		URL imageUrl_frota  = Principal.class.getResource("/img/4x411.png"); 
		ImageIcon ima6 = new ImageIcon(imageUrl_frota);

		JPanel frota = new JPanel();
		frota.setBackground(Color.WHITE);
		tabbedPane.addTab(" Frota", ima6, frota, null);
		frota.setLayout(null);
		tabbedPane_3.setFont(new Font("Tahoma", Font.PLAIN, 21));
		tabbedPane_3.setBounds(0, 0, 1258, 674);
		frota.add(tabbedPane_3);

		JPanel panel_12 = new JPanel();
		panel_12.setBackground(Color.WHITE);
		tabbedPane_3.addTab("Pesquisar Veículo", null, panel_12, null);
		panel_12.setLayout(null);

		JLabel lblVeculo = new JLabel("Ve\u00EDculo : ");
		lblVeculo.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblVeculo.setBounds(54, 30, 226, 49);
		panel_12.add(lblVeculo);

		pesq_v = new JTextField();
		pesq_v.setBounds(159, 44, 402, 29);
		panel_12.add(pesq_v);
		pesq_v.setColumns(10);

		JButton btnPesquisar_1 = new JButton("Pesquisar");
		btnPesquisar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				final TableRowSorter<DefaultTableModel> sorter;
				sorter = new TableRowSorter<DefaultTableModel>(model_1);
				table_2.setRowSorter(sorter);
				// getContentPane().add(new JScrollPane(model));

				String expr = pesq_v.getText();
				sorter.setRowFilter(RowFilter.regexFilter(expr));
				sorter.setSortKeys(null);




			}
		});
		btnPesquisar_1.setBounds(587, 34, 116, 39);
		panel_12.add(btnPesquisar_1);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(52, 110, 910, 268);
		panel_12.add(scrollPane_2);
		scrollPane_2.setViewportView(table_2);
		table_2.setModel(model_1 = new DefaultTableModel(
				new Object[][] {
						{null, null, null, null, null},
				},
				new String[] {
						"Modelo", "Placa", "Consumo", "Kilometragem", "Tipo"
				}
				));
		table_2.getColumnModel().getColumn(0).setPreferredWidth(207);
		table_2.getColumnModel().getColumn(1).setPreferredWidth(137);
		table_2.getColumnModel().getColumn(2).setPreferredWidth(121);
		table_2.getColumnModel().getColumn(3).setPreferredWidth(85);

		JPanel panel_15 = new JPanel();
		panel_15.setBackground(Color.WHITE);
		panel_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {



			}
		});
		tabbedPane_3.addTab("Revisões", null, panel_15, null);
		panel_15.setLayout(null);

		JLabel lblNomdeDaReviso = new JLabel("Nome da Revis\u00E3o : ");
		lblNomdeDaReviso.setBounds(30, 123, 160, 14);
		panel_15.add(lblNomdeDaReviso);

		rev_n = new JTextField();
		rev_n.setBounds(143, 120, 319, 20);
		panel_15.add(rev_n);
		rev_n.setColumns(10);

		JLabel lblOficina = new JLabel("Oficina/Mec\u00E2nico : ");
		lblOficina.setBounds(30, 171, 124, 14);
		panel_15.add(lblOficina);

		rev_mec = new JTextField();
		rev_mec.setBounds(143, 168, 319, 20);
		panel_15.add(rev_mec);
		rev_mec.setColumns(10);
		

		JLabel lblData = new JLabel("Data : ");
		lblData.setBounds(30, 72, 46, 14);
		panel_15.add(lblData);

		rev_dt = new JTextField();
		rev_dt.setBounds(143, 69, 160, 20);
		panel_15.add(rev_dt);
		rev_dt.setColumns(10);

		JLabel lblVeculo_2 = new JLabel("Ve\u00EDculo : ");
		lblVeculo_2.setBounds(30, 34, 108, 14);
		panel_15.add(lblVeculo_2);

		rev_vei = new JComboBox<Object>();
		rev_vei.setBounds(143, 30, 319, 22);
		panel_15.add(rev_vei);

		JTextArea rev_obs = new JTextArea();
		rev_obs.setBackground(SystemColor.menu);
		rev_obs.setLineWrap(true);
		rev_obs.setBounds(29, 250, 433, 247);
		panel_15.add(rev_obs);

		JLabel lblNewLabel_3 = new JLabel("Procedimentos e troca de pe\u00E7as : ");
		lblNewLabel_3.setBounds(29, 207, 231, 14);
		panel_15.add(lblNewLabel_3);

		JButton btnSalvarReviso = new JButton("Salvar Revis\u00E3o");
		btnSalvarReviso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");	
			AcessoDB x = new AcessoDB();
			x.conecta();
			@SuppressWarnings("deprecation")
			String comandosql = "INSERT INTO revisoes(veiculo, data, nome_rev, oficina_mec, obs) VALUES ('"+
			rev_vei.getSelectedItem().toString()+"', '"
			+ft.format(new Date(rev_dt.getText()))+"', '"
			+rev_n.getText()+"', '"
			+rev_mec.getText()+"', '"
			+rev_obs.getText()+"');";
			
			x.grava(comandosql);
				
			JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
				
			
			
			
			
			}
		});
		btnSalvarReviso.setBounds(330, 527, 132, 33);
		panel_15.add(btnSalvarReviso);
		
		JButton btnSelecionarData = new JButton("Selecionar Data");
		btnSelecionarData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DateField di = new DateField();
				String dat1 = null;
				SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
				int okCxl_1 = JOptionPane.showConfirmDialog(null, di, "Data inicial", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				if (okCxl_1 == JOptionPane.OK_OPTION) {
					dat1 = fmt.format(di.getValue()).toString();}
				rev_dt.setText(dat1);
			
			}
		});
		btnSelecionarData.setBounds(313, 68, 124, 23);
		panel_15.add(btnSelecionarData);


		JPanel panel_17 = new JPanel();
		panel_17.setBackground(Color.WHITE);
		panel_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {



			}
		});
		tabbedPane_3.addTab("Cadastrar motorista", null, panel_17, null);
		panel_17.setLayout(null);

		JLabel lblColaborador_1 = new JLabel("Colaborador : ");
		lblColaborador_1.setBounds(44, 48, 131, 14);
		panel_17.add(lblColaborador_1);

		mot_mot = new JComboBox<Object>();
		mot_mot.setBounds(146, 44, 250, 22);
		panel_17.add(mot_mot);

		JLabel lblNmeroDaCnh = new JLabel("N\u00FAmero da CNH : ");
		lblNmeroDaCnh.setBounds(44, 150, 167, 14);
		panel_17.add(lblNmeroDaCnh);

		mot_cnh = new JTextField();
		mot_cnh.setBounds(146, 147, 250, 20);
		panel_17.add(mot_cnh);
		mot_cnh.setColumns(10);

		JButton btnSalvarMotorista = new JButton("Salvar Motorista");
		btnSalvarMotorista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String motorista = mot_mot.getSelectedItem().toString();
				
				String cnh = mot_cnh.getText();
				
				String veic = "";
				
				for(int i=0; i< model_9.getRowCount(); i++){
					veic = veic +" - "+ model_9.getValueAt(i, 0);
				}
				
				String comandosql = "INSERT INTO cad_motorista (nome, cnh, autos) VALUES ('"+motorista+"','"+cnh+"','"+veic+"')";

	//			System.out.println(comandosql);
				
				AcessoDB tr = new AcessoDB();
				
				tr.conecta();
				tr.grava(comandosql);
				
				JOptionPane.showMessageDialog(null, "Salvo");
				
				DefaultTableModel dm = (DefaultTableModel)table_4.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();
				
				preenche_mot();
				
				mot_mot.setSelectedItem(0);
				mot_cnh.setText("");
				DefaultTableModel dem = (DefaultTableModel)table_5.getModel();
				dem.getDataVector().removeAllElements();
				dem.fireTableDataChanged();
				



			}
		});
		btnSalvarMotorista.setBounds(26, 213, 167, 42);
		panel_17.add(btnSalvarMotorista);

		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(26, 308, 841, 312);
		panel_17.add(scrollPane_5);
		scrollPane_5.setViewportView(table_4);
		table_4.setModel(model_8 = new DefaultTableModel(
				new Object[][] {
						{null, null},
				},
				new String[] {
						"Motorista", "CNH"
				}
				));
		table_4.getColumnModel().getColumn(0).setPreferredWidth(401);
		table_4.getColumnModel().getColumn(1).setPreferredWidth(225);

		






		JLabel lblVeculosCadastrados = new JLabel("Ve\u00EDculos Cadastrados : ");
		lblVeculosCadastrados.setBounds(465, 40, 167, 22);
		panel_17.add(lblVeculosCadastrados);

		mot_vei = new JComboBox<Object>();
		mot_vei.setBounds(613, 40, 195, 22);
		panel_17.add(mot_vei);

		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(465, 94, 402, 176);
		panel_17.add(scrollPane_4);
		scrollPane_4.setViewportView(table_5);
		table_5.setModel(model_9 = new DefaultTableModel(
				new Object[][] {

				},
				new String[] {
						"Ve\u00EDculo", "Placa"
				}
				));



		JButton btnNewButton_5a = new JButton("+");
		btnNewButton_5a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int s = mot_vei.getSelectedIndex();
				String vet[] = new String[2];	

				vet[0] = vei.get(s);
				vet[1] = plc.get(s);

				model_9.addRow(vet);


			}
		});
		btnNewButton_5a.setBounds(838, 40, 89, 23);
		panel_17.add(btnNewButton_5a);
		
		JButton btnApagarItem = new JButton("Apagar Item ");
		btnApagarItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int sel = table_5.getSelectedRow();
				
				String comandosql = "DELETE FROM cad_motorista WHERE cnh = '"+model_8.getValueAt(sel, 1)+"';";
			    AcessoDB v = new AcessoDB();
			    v.conecta();
			    v.grava(comandosql);
			    
			    JOptionPane.showMessageDialog(null, "Apagado!");
				
			
			}
		});
		btnApagarItem.setBounds(215, 213, 131, 42);
		panel_17.add(btnApagarItem);
		table_5.getColumnModel().getColumn(0).setPreferredWidth(322);
		table_5.getColumnModel().getColumn(1).setPreferredWidth(303);

		JPanel panel_19 = new JPanel();
		panel_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {



			}
		});
		
		//tabbedPane_3.addTab("Resultados", null, panel_19, null);
		//panel_19.setLayout(null);

		JLabel lblAnliseDeConformidade = new JLabel("An\u00E1lise de Conformidade com os dados : ");
		lblAnliseDeConformidade.setBounds(52, 36, 237, 14);
		panel_19.add(lblAnliseDeConformidade);



		JLabel lblVeculo_3 = new JLabel("Ve\u00EDculo : ");
		lblVeculo_3.setBounds(50, 73, 101, 14);
		panel_19.add(lblVeculo_3);

		JComboBox<Object> comboBox_10 = new JComboBox<Object>();
		comboBox_10.setBounds(122, 69, 321, 22);
		panel_19.add(comboBox_10);

		JButton btnGerarRelatrio = new JButton("Gerar Relat\u00F3rio");
		btnGerarRelatrio.setBounds(511, 62, 183, 38);
		panel_19.add(btnGerarRelatrio);

		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(52, 136, 638, 486);
		panel_19.add(scrollPane_6);

		JTextArea textArea_2 = new JTextArea();
		scrollPane_6.setViewportView(textArea_2);

		JPanel panel_16 = new JPanel();
		panel_16.setBackground(Color.WHITE);
		panel_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {



			}
		});
		tabbedPane_3.addTab("Cadastrar veículo", null, panel_16, null);
		panel_16.setLayout(null);

		JLabel lblModelo = new JLabel("Modelo : ");
		lblModelo.setBounds(69, 41, 196, 14);
		panel_16.add(lblModelo);

		modelo = new JTextField();
		modelo.setBounds(125, 38, 251, 20);
		panel_16.add(modelo);
		modelo.setColumns(10);

		JLabel lblMarca = new JLabel("Marca : ");
		lblMarca.setBounds(520, 41, 161, 14);
		panel_16.add(lblMarca);

		marca = new JTextField();
		marca.setBounds(615, 38, 204, 20);
		panel_16.add(marca);
		marca.setColumns(10);

		JLabel lblAno = new JLabel("Ano : ");
		lblAno.setBounds(69, 99, 161, 14);
		panel_16.add(lblAno);

		ano = new JTextField();
		ano.setBounds(125, 96, 251, 20);
		panel_16.add(ano);
		ano.setColumns(10);

		JLabel fdfdfd = new JLabel("Kilometragem atual : ");
		fdfdfd.setBounds(485, 99, 196, 14);
		panel_16.add(fdfdfd);

		kilometragem = new JTextField();
		kilometragem.setBounds(617, 96, 202, 20);
		panel_16.add(kilometragem);
		kilometragem.setColumns(10);

		JLabel lblTipo = new JLabel("Tipo : ");
		lblTipo.setBounds(69, 164, 161, 14);
		panel_16.add(lblTipo);

		JComboBox<Object> tipo = new JComboBox<Object>();
		tipo.setModel(new DefaultComboBoxModel<Object>(new String[] {"", "Pr\u00F3prio", "Outros"}));
		tipo.setBounds(125, 161, 251, 20);
		panel_16.add(tipo);

		JButton btnCadastrarVeculo = new JButton("Cadastrar Ve\u00EDculo");
		btnCadastrarVeculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {


				AcessoDB x = new AcessoDB();

				x.conecta();

				String comandosql = "INSERT INTO cad_veiculos(modelo, marca, ano, kilometragem, tipo, placa, consumo) VALUES ('"+
						modelo.getText()+"', '"+
						marca.getText()+"', '"+
						ano.getText()+"', '"+
						kilometragem.getText()+"', '"+
						tipo.getSelectedItem().toString()+"', '"+
						placa.getText()+"', '"+
						consumo.getText()+"');";

				System.out.println(comandosql);
				
				x.grava(comandosql);
				
				JOptionPane.showMessageDialog(null, "Salvo!");
				
				modelo.setText("");
				marca.setText("");
				ano.setText("");
				kilometragem.setText("");
				tipo.setSelectedIndex(0);
				placa.setText("");
				consumo.setText("");
								
				limpa_veiculos();
				preenche_veiculos();

			}
		});


		btnCadastrarVeculo.setBounds(539, 336, 177, 35);
		panel_16.add(btnCadastrarVeculo);

		JLabel lblPlaca = new JLabel("Placa  : ");
		lblPlaca.setBounds(520, 164, 196, 14);
		panel_16.add(lblPlaca);




		placa = new JTextField();
		placa.setBounds(617, 161, 202, 20);
		panel_16.add(placa);
		placa.setColumns(10);




		JLabel lblConsumoKml = new JLabel("Consumo : KM/L : ");
		lblConsumoKml.setBounds(69, 221, 138, 14);
		panel_16.add(lblConsumoKml);

		consumo = new JTextField();
		consumo.setBounds(176, 218, 200, 20);
		panel_16.add(consumo);
		consumo.setColumns(10);
		
		
				
		
		
		
		
				JPanel panel_18 = new JPanel();
				panel_18.setBackground(Color.WHITE);
				tabbedPane_3.addTab("Registrar Abastecimento", null, panel_18, null);
				panel_18.setLayout(null);
						
								JLabel lblVeculo_1 = new JLabel("Placa do Ve\u00EDculo : ");
								lblVeculo_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
								lblVeculo_1.setBounds(43, 50, 130, 23);
								panel_18.add(lblVeculo_1);
								
										ab_kl = new JTextField();
										ab_kl.setToolTipText("Insira dados sem virgula ou pontos.");
										ab_kl.setBounds(702, 48, 178, 31);
										panel_18.add(ab_kl);
										ab_kl.setColumns(10);
										
												JLabel lblNewLabel_2 = new JLabel("  Kilometragem : ");
												lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
												lblNewLabel_2.setBounds(531, 48, 145, 31);
												panel_18.add(lblNewLabel_2);
												
												JRadioButton vista = new JRadioButton("\u00C0 vista");
												buttonGroup_3.add(vista);
												vista.setFont(new Font("Tahoma", Font.PLAIN, 18));
												vista.setBounds(251, 245, 109, 23);
												panel_18.add(vista);
												
												JRadioButton prazo = new JRadioButton("\u00C0 Prazo");
												buttonGroup_3.add(prazo);
												prazo.setFont(new Font("Tahoma", Font.PLAIN, 18));
												prazo.setBounds(92, 245, 109, 23);
												panel_18.add(prazo);
												
														JLabel lblLitros = new JLabel("  Litros : ");
														lblLitros.setFont(new Font("Tahoma", Font.PLAIN, 16));
														lblLitros.setBounds(531, 122, 236, 23);
														panel_18.add(lblLitros);
														
																abs_lt = new JTextField();
																abs_lt.setToolTipText("");
																abs_lt.setBounds(702, 120, 178, 31);
																panel_18.add(abs_lt);
																abs_lt.setColumns(10);
																
																DateField ab_data = new DateField();
																ab_data.setBounds(182, 184, 158, 31);
																panel_18.add(ab_data);
																
																JLabel lblDataEmisso = new JLabel("Data Emiss\u00E3o :");
																lblDataEmisso.setFont(new Font("Tahoma", Font.PLAIN, 16));
																lblDataEmisso.setBounds(43, 192, 129, 23);
																panel_18.add(lblDataEmisso);
																
																		JLabel lblValorPago = new JLabel("Valor Pago : ");
																		lblValorPago.setFont(new Font("Tahoma", Font.PLAIN, 16));
																		lblValorPago.setBounds(43, 118, 236, 31);
																		panel_18.add(lblValorPago);
																		
																				abs_vp = new JTextField();
																				abs_vp.setBounds(158, 120, 158, 31);
																				panel_18.add(abs_vp);
																				abs_vp.setColumns(10);
																				
																				veicles = new JComboBox();
																				veicles.setFont(new Font("Tahoma", Font.PLAIN, 15));
																				veicles.setBounds(158, 33, 262, 51);
																				panel_18.add(veicles);
																				
																						JButton btnRegistrar = new JButton("Registrar");
																						btnRegistrar.addActionListener(new ActionListener() {
																							public void actionPerformed(ActionEvent arg0) {
																							
																							String posto = JOptionPane.showInputDialog(null,"Insira o nome do Posto : ");	
																																																																												
																							int select = 0;
																							SimpleDateFormat frt = new SimpleDateFormat("yyyy-MM-dd");
																							String dat1 = frt.format(ab_data.getValue());	
																							if(apagar.isSelected()){select = 1;}
																							if(prazo.isSelected()){select = 0;}
																																											
																																													
																							String veiculos = veicles.getSelectedItem().toString();
																							String kilometro = ab_kl.getText();
																							String litros = abs_lt.getText();
																							String valor = abs_vp.getText().replace(',', '.');
																							SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
																							
																							String comandosql = " INSERT INTO contas"
																									+ "(nome, referente, data_emis, banco, doc, tipoc, valor_parcela, qnt_parcela, total)"
																									+ " VALUES ('"+posto+"',' Abastecimento , "+veiculos+" , "+litros+" , "+kilometro+" ', '"+ft.format(new Date())+"', 'NULL', 'NULL', 'Pagar', "+valor+", 1,"+valor+");";
																						
																							System.out.println(comandosql);
																							
																							AcessoDB tu6 = new AcessoDB();
																							tu6.conecta();
																							tu6.grava(comandosql);
																							//tu6.close();
																							
																							AcessoDB h = new AcessoDB();
																							h.conecta();
																							ResultSet ts = h.Consulta("SELECT MAX(cod) FROM contas ");
																							String val=null;
																							try {
																								ts.beforeFirst();
																								while(ts.next()){
																								val = ts.getString("MAX(cod)");
																								}
																								int valin = Integer.parseInt(val)+1;
																								val = valin+"";
																							} catch (SQLException e) {}	
																							
																								
																						
																							String comandosql_1 = " INSERT INTO cad_lancamentos ("
																									+ "flag, lancamento, tipo, valor_entrada,data_venc, valor_total, acrescimo, desconto, qnt_parc, valor_parc)"
																									+ " VALUES ("+select+", "+val+", "+"'Pagar'"+", "+valor+", '"+dat1+"', "+valor+", 0, 0, '1/1', "+valor+");";
																							
																							System.out.println(comandosql_1);
																							
																							AcessoDB tu7 = new AcessoDB();
																							tu7.conecta();
																							tu7.grava(comandosql_1);
																							
																							limpa_abas();
																							preenche_abas();
																							
																							ab_kl.setText("");
																							abs_vp.setText("");
																							abs_lt.setText("");
																							
																							
																							}
																						});
																						btnRegistrar.setBounds(713, 192, 200, 51);
																						panel_18.add(btnRegistrar);
																						
																								JButton btnAlterar = new JButton("Alterar");
																								btnAlterar.setBounds(476, 192, 200, 51);
																								panel_18.add(btnAlterar);
																								
																										JScrollPane scrollPane_3 = new JScrollPane();
																										scrollPane_3.setBounds(44, 301, 944, 357);
																										panel_18.add(scrollPane_3);
																										scrollPane_3.setViewportView(table_3);
																										table_3.setModel(model_11 = new DefaultTableModel(
																											new Object[][] {
																												{null, null, null, null, null, null},
																											},
																											new String[] {
																												"Posto", "Emiss\u00E3o", "Placa", "Kilometragem", "Litros", "Total"
																											}
																										));
																										
																										
																										table_3.getColumnModel().getColumn(0).setPreferredWidth(155);
																										table_3.getColumnModel().getColumn(1).setPreferredWidth(120);
																										table_3.getColumnModel().getColumn(2).setPreferredWidth(112);
																										table_3.getColumnModel().getColumn(3).setPreferredWidth(90);
																										table_3.getColumnModel().getColumn(4).setPreferredWidth(68);

																										
																										model_11.removeRow(0);



		URL imageUrl_rel  = Principal.class.getResource("/img/note16128.png"); 
		ImageIcon ima7 = new ImageIcon(imageUrl_rel);

		JPanel relatorios = new JPanel();
		relatorios.setBackground(Color.WHITE);
		relatorios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

			}
		});


		tabbedPane.addTab(" Relatórios", ima7, relatorios, null);
		relatorios.setLayout(null);
		
		JLabel lblEscolhaUmaPergunta = new JLabel("Escolha uma pergunta que responda sua necessidade : ");
		lblEscolhaUmaPergunta.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblEscolhaUmaPergunta.setBounds(10, 11, 700, 37);
		relatorios.add(lblEscolhaUmaPergunta);
		
		JScrollPane scrollPane_16 = new JScrollPane();
		scrollPane_16.setBounds(10, 59, 691, 453);
		relatorios.add(scrollPane_16);
		scrollPane_16.setViewportView(lista);
		lista.setModel(new AbstractListModel() {
			String[] values = new String[] {"----- Pessoal - Relat\u00F3rios -----", "Relat\u00F3rio por nome", "Relat\u00F3rio Completo Funcion\u00E1rios", "Rela\u00E7\u00E3o de Ag\u00EAncias e Contas", "----- Materiais - Relat\u00F3rios ---", "Relacao de Materiais", "Relacao de Compra de Materiais", "Rela\u00E7\u00E3o de Fornecedores", "----- Financeiro - Relat\u00F3rios --", "Que Cheques temos para Pagar?", "Que Cheques temos para Receber?", "Que contas temos para Amanha?", "Que contas temos para essa semana?", "Que contas temos por Nome?", "Que contas temos por Data de Emiss\u00E3o?", "Que contas temos por Data de Vencimento?", "Que contas temos por Fornecedor?", "----- Frota - Relat\u00F3rios -------", "Rela\u00E7\u00E3o motoristas", "Rela\u00E7\u00E3o Abastecimentos por m\u00EAs", "Rela\u00E7\u00E3o Revis\u00E3o", "Rela\u00E7\u00E3o Revis\u00E3o por ve\u00EDculo", "----- Relat\u00F3rios do Excel------", "Que contas temos para amanh\u00E3?", "Que contas temos para a semana?", "Que contas temos para o m\u00EAs?", "TODAS as Contas a PAGAR", "TODAS as Contas a RECEBER", "TODAS as Contas ATRASADAS", "TODAS as Contas PAGAS", "Todas as Contas (GERAL CNT)"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JButton btnNewButton_7 = new JButton("Gerar Relat\u00F3rio");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			progressBar.setValue(0);
				
			String sel = lista.getSelectedValue().toString();
			
			if(!(sel).contains("-")){
				
				
				if((sel).equals("Relat\u00F3rio por nome")){
					
					try{
						bar_load();		
					AcessoDB y = new AcessoDB();
					String nome = JOptionPane.showInputDialog(null,"Insira parte do nome completo do colaborador : ");
					String comandosql = "SELECT * FROM dados_pe WHERE nome LIKE '%"+nome+"%' ;";
					y.conecta();
					JasperReport relatorio = (JasperReport) JRLoader.loadObjectFromFile("funcionarios_completo.jasper"); 
					JRResultSetDataSource con = new JRResultSetDataSource(y.Consulta(comandosql));
					JasperPrint jrp = JasperFillManager.fillReport(relatorio, null,con);
					JasperViewer jrviewer=new JasperViewer(jrp, false);
					jrviewer.setVisible(true);   
					jrviewer.toFront(); 
				} catch (JRException ex) {
					Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
			
					}
				}
				
				
				
				if((sel).equals("Relat\u00F3rio Completo Funcion\u00E1rios")){
					
					try{
						bar_load();	
					AcessoDB y = new AcessoDB();
					String comandosql = "SELECT * FROM dados_pe ;";
					y.conecta();
					JasperReport relatorio = (JasperReport) JRLoader.loadObjectFromFile(("funcionarios_completo.jasper")); 
					JRResultSetDataSource con = new JRResultSetDataSource(y.Consulta(comandosql));
					JasperPrint jrp = JasperFillManager.fillReport(relatorio, null,con);
					JasperViewer jrviewer=new JasperViewer(jrp, false);
					jrviewer.setVisible(true);   
					jrviewer.toFront(); 
				} catch (JRException ex) {
					Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
			
					}
				}
			
				if((sel).equals("Rela\u00E7\u00E3o de Ag\u00EAncias e Contas")){
				
					try {
						bar_load();	
						AcessoDB y = new AcessoDB();
						String comandosql = "SELECT * FROM dados_pe ;";
						y.conecta();
						JasperReport relatorio = (JasperReport) JRLoader.loadObjectFromFile(("eco_pessoal.jasper")); 
						JRResultSetDataSource con = new JRResultSetDataSource(y.Consulta(comandosql));
						JasperPrint jrp = JasperFillManager.fillReport(relatorio, null,con);
						JasperViewer jrviewer=new JasperViewer(jrp, false);
						jrviewer.setVisible(true);   
						jrviewer.toFront(); 
					} catch (JRException ex) {
						Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
				
					}
				}
				
				
				
				if((sel).equals("Relacao de Materiais")){
					
					try {
						bar_load();	
						AcessoDB y = new AcessoDB();
						String comandosql = "SELECT * FROM materiais ;";
						y.conecta();
						JasperReport relatorio = (JasperReport) JRLoader.loadObjectFromFile(("ecomateriais.jasper")); 
						JRResultSetDataSource con = new JRResultSetDataSource(y.Consulta(comandosql));
						JasperPrint jrp = JasperFillManager.fillReport(relatorio, null,con);
						JasperViewer jrviewer=new JasperViewer(jrp, false);
						jrviewer.setVisible(true);   
						jrviewer.toFront(); 
					} catch (JRException ex) {
						Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
				
					}
				}
				
				if((sel).equals("Relacao de Compra de Materiais")){
					
					try {
						bar_load();	
						AcessoDB y = new AcessoDB();
						String comandosql = "SELECT * FROM materiais WHERE qnt = 0;";
						y.conecta();
						JasperReport relatorio = (JasperReport) JRLoader.loadObjectFromFile(("ecomateriais.jasper")); 
						JRResultSetDataSource con = new JRResultSetDataSource(y.Consulta(comandosql));
						JasperPrint jrp = JasperFillManager.fillReport(relatorio, null,con);
						JasperViewer jrviewer=new JasperViewer(jrp, false);
						jrviewer.setVisible(true);   
						jrviewer.toFront(); 
					} catch (JRException ex) {
						Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
				
					}
				}
				
				if((sel).equals("Rela\u00E7\u00E3o de Fornecedores")){
					
					try {
						bar_load();	
						AcessoDB y = new AcessoDB();
						String comandosql = "SELECT * FROM fornecedor;";
						y.conecta();
						JasperReport relatorio = (JasperReport) JRLoader.loadObjectFromFile(("ecofornecedor.jasper")); 
						JRResultSetDataSource con = new JRResultSetDataSource(y.Consulta(comandosql));
						JasperPrint jrp = JasperFillManager.fillReport(relatorio, null,con);
						JasperViewer jrviewer=new JasperViewer(jrp, false);
						jrviewer.setVisible(true);   
						jrviewer.toFront(); 
					} catch (JRException ex) {
						Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
				
					}
				}
				
				
				
				if((sel).equals("Que contas temos para Amanha?")){
					
					try {
						bar_load();	
						Calendar cale = Calendar.getInstance();
						SimpleDateFormat fsd = new SimpleDateFormat("yyyy-MM-dd");
						Date datee = new Date();
						cale.setTime(datee);
						cale.add(Calendar.HOUR_OF_DAY, 24);
						Date ndt = cale.getTime();
						AcessoDB y = new AcessoDB();
						String comandosql = "SELECT * FROM contas INNER JOIN cad_lancamentos on contas.cod = cad_lancamentos.lancamento WHERE flag = 0 AND cad_lancamentos.data_venc = '"+fsd.format(ndt)+"';";
						y.conecta();
						JasperReport relatorio = (JasperReport) JRLoader.loadObjectFromFile(("ecocontasi.jasper")); 
						JRResultSetDataSource con = new JRResultSetDataSource(y.Consulta(comandosql));
						JasperPrint jrp = JasperFillManager.fillReport(relatorio, null,con);
						JasperViewer jrviewer=new JasperViewer(jrp, false);
						jrviewer.setVisible(true);   
						jrviewer.toFront(); 
					} catch (JRException ex) {
						Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
				
					}
				}
				
				
				

				if((sel).equals("Que contas temos para essa semana?")){
					
					try{
						bar_load();	
					Calendar amanha = Calendar.getInstance();
					Calendar setimo = Calendar.getInstance();
					SimpleDateFormat dta = new SimpleDateFormat("yyyy-MM-dd");
					Date datee = new Date();
					amanha.setTime(datee);
					setimo.setTime(datee);
					AcessoDB y = new AcessoDB();
					amanha.add(Calendar.HOUR_OF_DAY, 24);
					setimo.add(Calendar.HOUR_OF_DAY, 24*7);
					Date nset = amanha.getTime();
					Date nama = setimo.getTime();
					String comandosql = "SELECT * FROM contas INNER JOIN cad_lancamentos on contas.cod = cad_lancamentos.lancamento WHERE flag = 0 AND cad_lancamentos.data_venc BETWEEN '"+dta.format(nset).toString()+"' AND '"+dta.format(nama).toString()+"' AND contas.referente NOT LIKE '%bastecimento%'";
					y.conecta();
					JasperReport relatorio = (JasperReport) JRLoader.loadObjectFromFile(("ecocontasi.jasper")); 
					JRResultSetDataSource con = new JRResultSetDataSource(y.Consulta(comandosql));
					JasperPrint jrp = JasperFillManager.fillReport(relatorio, null,con);
					JasperViewer jrviewer=new JasperViewer(jrp, false);
					jrviewer.setVisible(true);   
					jrviewer.toFront(); 
				} catch (JRException ex) {
					Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
			
				}
					
					
				
				}
				
				
				if((sel).equals("Que contas temos por Nome?")){
					
					try{
						bar_load();	
					AcessoDB y = new AcessoDB();	
					String nome = JOptionPane.showInputDialog(null, "Entre com o nome da conta");
					String comandosql = "SELECT * FROM contas INNER JOIN cad_lancamentos on contas.cod = cad_lancamentos.lancamento WHERE flag = 0 AND contas.nome LIKE '%"+nome+"%'";
					y.conecta();
					JasperReport relatorio = (JasperReport) JRLoader.loadObjectFromFile(("ecocontasi.jasper")); 
					JRResultSetDataSource con = new JRResultSetDataSource(y.Consulta(comandosql));
					JasperPrint jrp = JasperFillManager.fillReport(relatorio, null,con);
					JasperViewer jrviewer=new JasperViewer(jrp, false);
					jrviewer.setVisible(true);   
					jrviewer.toFront(); 
				} catch (JRException ex) {
					Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
			
				}
				}
				
				//Que contas temos por Data de Emiss\u00E3o?
				if((sel).equals("Que contas temos por Data de Emiss\u00E3o?")){
					
					try{
						bar_load();	
					AcessoDB y = new AcessoDB();	
					String nome = JOptionPane.showInputDialog(null, "Entre com o nome da conta");
					String comandosql = "SELECT * FROM contas INNER JOIN cad_lancamentos on contas.cod = cad_lancamentos.lancamento WHERE flag = 0 AND contas.nome LIKE '%"+nome+"%'";
					y.conecta();
					JasperReport relatorio = (JasperReport) JRLoader.loadObjectFromFile(("ecocontasi.jasper")); 
					JRResultSetDataSource con = new JRResultSetDataSource(y.Consulta(comandosql));
					JasperPrint jrp = JasperFillManager.fillReport(relatorio, null,con);
					JasperViewer jrviewer=new JasperViewer(jrp, false);
					jrviewer.setVisible(true);   
					jrviewer.toFront(); 
				} catch (JRException ex) {
					Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
			
				}
				}
				//"Que contas temos por Data de Vencimento?"
				
				if((sel).equals("Que contas temos por Data de Vencimento?")){
					
					try {
						bar_load();	
						DateField gr = new DateField();
						int okCxl_1 = JOptionPane.showConfirmDialog(null, gr, "Data inicial", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
						@SuppressWarnings("unused")
						String dat1 = null;
						SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
						if (okCxl_1 == JOptionPane.OK_OPTION) {
						dat1 = fmt.format(gr.getValue()).toString();}
												
						Calendar cale = Calendar.getInstance();
						SimpleDateFormat fsd = new SimpleDateFormat("yyyy-MM-dd");
						Date datee = new Date();
						cale.setTime(datee);
						cale.add(Calendar.HOUR_OF_DAY, 24);
						Date ndt = cale.getTime();
						AcessoDB y = new AcessoDB();
						String comandosql = "SELECT * FROM contas INNER JOIN cad_lancamentos on contas.cod = cad_lancamentos.lancamento WHERE flag = 0 AND cad_lancamentos.data_venc = '"+fsd.format(ndt)+"';";
						y.conecta();
						JasperReport relatorio = (JasperReport) JRLoader.loadObjectFromFile(("ecocontasi.jasper")); 
						JRResultSetDataSource con = new JRResultSetDataSource(y.Consulta(comandosql));
						JasperPrint jrp = JasperFillManager.fillReport(relatorio, null,con);
						JasperViewer jrviewer=new JasperViewer(jrp, false);
						jrviewer.setVisible(true);   
						jrviewer.toFront(); 
					} catch (JRException ex) {
						Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
				
					}
				}
				
				//"----- Pessoal - Relat\u00F3rios -----", "Relat\u00F3rio por nome", "Relat\u00F3rio Completo Funcion\u00E1rios", "Rela\u00E7\u00E3o de Ag\u00EAncias e Contas", "----- Materiais - Relat\u00F3rios ---", "Relacao de Materiais", "Relacao de Compra de Materiais", "Rela\u00E7\u00E3o de Fornecedores", "----- Financeiro - Relat\u00F3rios --", "Que Cheques temos para Pagar?", "Que Cheques temos para Receber?", "Que contas temos para Amanha?", "Que contas temos para essa semana?", "Que contas temos por Nome?", "Que contas temos por Data de Emiss\u00E3o?", "Que contas temos por Data de Vencimento?", "----- Frota - Relat\u00F3rios -------", "Rela\u00E7\u00E3o motoristas", "Rela\u00E7\u00E3o Abastecimentos por m\u00EAs", "Rela\u00E7\u00E3o Revis\u00E3o", "Rela\u00E7\u00E3o Revis\u00E3o por ve\u00EDculo"};

				if((sel).equals("Rela\u00E7\u00E3o Revis\u00E3o")){
					try{
						AcessoDB y = new AcessoDB();	
						String comandosql = "SELECT * FROM revisoes";
						y.conecta();
						JasperReport relatorio = (JasperReport) JRLoader.loadObjectFromFile(("revisao.jasper")); 
						JRResultSetDataSource con = new JRResultSetDataSource(y.Consulta(comandosql));
						JasperPrint jrp = JasperFillManager.fillReport(relatorio, null,con);
						JasperViewer jrviewer=new JasperViewer(jrp, false);
						jrviewer.setVisible(true);   
						jrviewer.toFront(); 
				    	} catch (JRException ex) {
				    		Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
			
				}
				}
				
				
				if((sel).equals("Que contas temos para amanh\u00E3?")){
					
					Calendar cale = Calendar.getInstance();
					SimpleDateFormat fsd = new SimpleDateFormat("yyyy-MM-dd");
					Date datee = new Date();
					cale.setTime(datee);
					cale.add(Calendar.HOUR_OF_DAY, 24);
					Date ndt = cale.getTime();
					String comandosql = "SELECT nome,referente,data_emis,data_venc,valor_parcela FROM contas INNER JOIN cad_lancamentos on contas.cod = cad_lancamentos.lancamento WHERE flag = 0 AND cad_lancamentos.data_venc = '"+fsd.format(ndt)+"';";
					
					System.out.println(comandosql);
					FileSystemView system = FileSystemView.getFileSystemView();
					String path = system.getHomeDirectory().getPath() + File.separator+"contas_"+fsd.format(datee)+".xls";//// + "meuArquivo.txt";
			       	Excel exl = new Excel(path);
			       	try {exl.fill_xls(comandosql);
					}catch (RowsExceededException e){e.printStackTrace();} catch (WriteException e) {e.printStackTrace();}
				}
				
				
				
				if((sel).equals("Que contas temos para a semana?")){
					Calendar amanha = Calendar.getInstance();
					Calendar setimo = Calendar.getInstance();
					SimpleDateFormat dta = new SimpleDateFormat("yyyy-MM-dd");
					Date datee = new Date();
					amanha.setTime(datee);
					setimo.setTime(datee);
					amanha.add(Calendar.HOUR_OF_DAY, 24);
					setimo.add(Calendar.HOUR_OF_DAY, 24*7);
					Date nset = amanha.getTime();
					Date nama = setimo.getTime();
					String comandosql = "SELECT nome,referente,data_emis,data_venc,valor_parcela FROM contas INNER JOIN cad_lancamentos on contas.cod = cad_lancamentos.lancamento WHERE flag = 0 AND cad_lancamentos.data_venc BETWEEN '"+dta.format(nset).toString()+"' AND '"+dta.format(nama).toString()+"'";
					System.out.println(comandosql);
					FileSystemView system = FileSystemView.getFileSystemView();
					String path = system.getHomeDirectory().getPath() + File.separator+"contas_semana.xls";//// + "meuArquivo.txt";
					Excel exl = new Excel(path);
			       	try {exl.fill_xls(comandosql);
					}catch (RowsExceededException e){e.printStackTrace();} catch (WriteException e) {e.printStackTrace();}
				}
				
				
				if((sel).equals("Que contas temos para o m\u00EAs?")){
				
					Calendar amanha = Calendar.getInstance();
					Calendar setimo = Calendar.getInstance();
					SimpleDateFormat dta = new SimpleDateFormat("yyyy-MM-dd");
					Date datee = new Date();
					amanha.setTime(datee);
					setimo.setTime(datee);
					amanha.add(Calendar.HOUR_OF_DAY, 24);
					setimo.add(Calendar.HOUR_OF_DAY, 24*30);
					Date nset = amanha.getTime();
					Date nama = setimo.getTime();
					String comandosql = "SELECT nome,referente,data_emis,data_venc,valor_parcela FROM contas INNER JOIN cad_lancamentos on contas.cod = cad_lancamentos.lancamento WHERE flag = 0 AND cad_lancamentos.data_venc BETWEEN '"+dta.format(nset).toString()+"' AND '"+dta.format(nama).toString()+"'";
					System.out.println(comandosql);
					FileSystemView system = FileSystemView.getFileSystemView();
					String path = system.getHomeDirectory().getPath() + File.separator+"contas_mes.xls";// + "meuArquivo.txt";
					Excel exl = new Excel(path);
			       	try {exl.fill_xls(comandosql);
					}catch (RowsExceededException e){e.printStackTrace();} catch (WriteException e) {e.printStackTrace();}
					
				}
				
				
				
				//Que contas temos por Fornecedor?
					if((sel).equals("Que contas temos por Fornecedor?")){
						
						ArrayList<Object> psq = new ArrayList<>();
						
						String comandosql = "SELECT * FROM fornecedor;";  // where superior = 'Atuante'"; 
						AcessoDB x = new AcessoDB();
						x.conecta();
						cons = x.Consulta(comandosql);
						try {
							cons.beforeFirst();
						    while(cons.next()){
						    	psq.add(cons.getObject("nome"));
						    }
							cons.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
						
						
						
						Object[] choices = psq.toArray();
						String saida = (String) JOptionPane.showInputDialog(null, "Opções de usuário : ",
								"Fornecedor", JOptionPane.PLAIN_MESSAGE, null,choices,choices[0]);
							//String JOptionPane.showInputDialog(null,"Selecione o Fornecedor : ");
							String comandosql_1 = "SELECT nome,referente,data_emis,data_venc,valor_parcela FROM contas INNER JOIN cad_lancamentos on contas.cod = cad_lancamentos.lancamento WHERE flag = 0 AND nome LIKE '%"+saida+"%' AND contas.referente NOT LIKE '%bastecimento%'  ;";
							System.out.println(comandosql_1);
							FileSystemView system = FileSystemView.getFileSystemView();
							String path = system.getHomeDirectory().getPath() + File.separator+"contas_fornecedor.xls";// + "meuArquivo.txt";
							Excel exl = new Excel(path);
					       	try {exl.fill_xls(comandosql_1);
							}catch (RowsExceededException e){e.printStackTrace();} catch (WriteException e) {e.printStackTrace();}
							
						}
					
					
					//"TODAS as Contas a PAGAR", "TODAS as Contas a RECEBER", "Todas as Contas (GERAL CNT)
					
                        if((sel).equals("TODAS as Contas a PAGAR")){
						
						    String comandosql_1 = "SELECT nome,referente,data_emis,data_venc,valor_parcela FROM contas INNER JOIN cad_lancamentos on contas.cod = cad_lancamentos.lancamento WHERE tipo = 'Pagar' AND contas.referente NOT LIKE '%bastecimento%'  ";
							System.out.println(comandosql_1);
							FileSystemView system = FileSystemView.getFileSystemView();
							String path = system.getHomeDirectory().getPath() + File.separator+"Todas_a_pagar.xls";// + "meuArquivo.txt";
							Excel exl = new Excel(path);
					       	try {exl.fill_xls(comandosql_1);
							}catch (RowsExceededException e){e.printStackTrace();} catch (WriteException e) {e.printStackTrace();}
							
						}
                        
                        if((sel).equals("TODAS as Contas a RECEBER")){
    						
						    String comandosql_1 = "SELECT nome,referente,data_emis,data_venc,valor_parcela FROM contas INNER JOIN cad_lancamentos on contas.cod = cad_lancamentos.lancamento WHERE tipo = 'Receber' AND contas.referente NOT LIKE '%bastecimento%' ";
							System.out.println(comandosql_1);
							FileSystemView system = FileSystemView.getFileSystemView();
							String path = system.getHomeDirectory().getPath() + File.separator+"Todas_a_receber.xls";// + "meuArquivo.txt";
							Excel exl = new Excel(path);
					       	try {exl.fill_xls(comandosql_1);
							}catch (RowsExceededException e){e.printStackTrace();} catch (WriteException e) {e.printStackTrace();}
							
						}
                        
					
                        if((sel).equals("Todas as Contas (GERAL CNT)")){
    						
						    String comandosql_1 = "SELECT nome,referente,data_emis,data_venc,valor_parcela FROM contas INNER JOIN cad_lancamentos on contas.cod = cad_lancamentos.lancamento AND contas.referente NOT LIKE '%bastecimento%' ";
							System.out.println(comandosql_1);
							FileSystemView system = FileSystemView.getFileSystemView();
							String path = system.getHomeDirectory().getPath() + File.separator+"Todas_contas.xls";// + "meuArquivo.txt";
							Excel exl = new Excel(path);
					       	try {exl.fill_xls(comandosql_1);
							}catch (RowsExceededException e){e.printStackTrace();} catch (WriteException e) {e.printStackTrace();}
							
						}
				//TODAS as Contas ATRASADAS 
                //        TODAS as Contas PAGAS
                        
				
                        if((sel).equals("TODAS as Contas ATRASADAS")){
                        	Calendar amanha = Calendar.getInstance();
        					Calendar setimo = Calendar.getInstance();
        					SimpleDateFormat dta = new SimpleDateFormat("yyyy-MM-dd");
        					Date datee = new Date();
        					amanha.setTime(datee);
        					setimo.setTime(datee);
        					amanha.add(Calendar.HOUR_OF_DAY, 24);
        					setimo.add(Calendar.HOUR_OF_DAY, 24*30);
        					//Date nset = amanha.getTime();
        					//Date nama = setimo.getTime();
        					
						    String comandosql_1 = "SELECT nome,referente,data_emis,data_venc,valor_parcela FROM contas INNER JOIN cad_lancamentos on contas.cod = cad_lancamentos.lancamento WHERE cad_lancamentos.flag = 0 AND cad_lancamentos.data_venc < '"+dta.format(datee)+"' AND contas.referente NOT LIKE '%bastecimento%' ";
							System.out.println(comandosql_1);
							FileSystemView system = FileSystemView.getFileSystemView();
							String path = system.getHomeDirectory().getPath() + File.separator+"Todas_Atrasadas.xls";// + "meuArquivo.txt";
							Excel exl = new Excel(path);
					       	try {exl.fill_xls(comandosql_1);
							}catch (RowsExceededException e){e.printStackTrace();} catch (WriteException e) {e.printStackTrace();}
							
						}
                        
                        
                        if((sel).equals("TODAS as Contas PAGAS")){
    						
						    String comandosql_1 = "SELECT nome,referente,data_emis,data_venc,valor_parcela FROM contas INNER JOIN cad_lancamentos on contas.cod = cad_lancamentos.lancamento WHERE cad_lancamentos.flag = 1 AND contas.referente NOT LIKE '%bastecimento%' ";
							System.out.println(comandosql_1);
							FileSystemView system = FileSystemView.getFileSystemView();
							String path = system.getHomeDirectory().getPath() + File.separator+"Todas_PAGAS.xls";// + "meuArquivo.txt";
							Excel exl = new Excel(path);
					       	try {exl.fill_xls(comandosql_1);
							}catch (RowsExceededException e){e.printStackTrace();} catch (WriteException e) {e.printStackTrace();}
							
						}
				
				//JOptionPane.showMessageDialog(null, sel);  
			}
			
			
			
			
			
			
			
			}
		});
		btnNewButton_7.setBounds(10, 579, 136, 37);
		relatorios.add(btnNewButton_7);
		
		progressBar = new JProgressBar();
		progressBar.setBounds(10, 523, 519, 37);
		relatorios.add(progressBar);
		
		JButton btnNewButton_8 = new JButton("Pesquisa R\u00E1pida Financeiro");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				Pesq_Rap_Fin prf = new Pesq_Rap_Fin();
				prf.setVisible(true);
				
			
			}
		});
		btnNewButton_8.setBounds(162, 579, 171, 37);
		relatorios.add(btnNewButton_8);
		//relatorios.disable();


		/*
		URL imageUrl_con  = Principal.class.getResource("/img/positive32.png"); 
		ImageIcon ima8 = new ImageIcon(imageUrl_con);

		JPanel contratos = new JPanel();
		contratos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

			}
		});

		tabbedPane.addTab(" Contratos", ima8, contratos, null);
*/

		tabbedPane.setSelectedIndex(0);

		URL imageUrl_exp  = Principal.class.getResource("/img/ascendant36.png"); 
		ImageIcon ima9 = new ImageIcon(imageUrl_exp);

		JPanel graficos = new JPanel();
		graficos.setBackground(Color.WHITE);
		graficos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

			}
		});


		tabbedPane.addTab("Graficos", ima9, graficos, null);
		graficos.setLayout(null);
		
		JScrollPane scrollPane_17 = new JScrollPane();
		scrollPane_17.setBounds(10, 11, 629, 350);
		graficos.add(scrollPane_17);
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"Gr\u00E1fico de Montante de Atividade Financeira Anual.", "Gr\u00E1fico Financeiro contas a Pagar por per\u00EDodo.", "Gr\u00E1fico Financeiro contas a Receber por per\u00EDodo.", "Gr\u00E1fico Financeiro contas a Pagar por contas a Receber Anual.", "", " "};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane_17.setViewportView(list_1);
		
		JButton btnGerarGrficos = new JButton("Gerar Gr\u00E1ficos");
		btnGerarGrficos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			int sel = list_1.getSelectedIndex(); 
				
			if(sel == 0){
				    final Grafico demo = new Grafico(list_1.getSelectedValue().toString());
			        demo.pack();
			        RefineryUtilities.centerFrameOnScreen(demo);
			        demo.setVisible(true);
			}
			
			if(sel == 3){
				 final Plotting demo = new Plotting(list_1.getSelectedValue().toString());
			        demo.pack();
			        RefineryUtilities.centerFrameOnScreen(demo);
			        demo.setVisible(true);
			}
			
			}
		});
		btnGerarGrficos.setBounds(10, 372, 119, 38);
		graficos.add(btnGerarGrficos);
		
		

		//JTabbedPane tabbedPane_6 = new JTabbedPane(JTabbedPane.TOP);
		//tabbedPane.addTab("Rep. Error", null, tabbedPane_6, null);

		model_1.removeRow(0);
		model_2.removeRow(0);
		//model_3.removeRow(0);
		model_4.removeRow(0);
		model_5.removeRow(0);
		model_6.removeRow(0);
		//model_7.removeRow(0);
		model_8.removeRow(0);
		//model_9.removeRow(0);
		model_12.removeRow(0);
		model_13.removeRow(0);
		
		
		//		preenche_empr();
		preenche_fun();
		preenche_veiculos();
		preenche_mat();
		preenche_mat_col();
		preenche_mat_stok();
		preenche_for();
		preenche_mat_forne();
		preenche_pesq_fun();
		preenche_vel();
		limpa_os();
		preenche_os();
		preenche_cnt("null");
		preenche_rev_vel();
		preenche_mot();


		preenche_abas();
		
		setLocationRelativeTo(null);
		
		
		}catch(Exception ert){
			 try {
				 
				 FileWriter aq = new FileWriter("file.txt");
				 PrintWriter gq = new PrintWriter(aq);
			     SimpleDateFormat fmt = new SimpleDateFormat(" HH:mm:ss dd/MM/yyyy");
			     gq.println("EXCEPTION TIME : "+fmt.format(new Date()));
			     gq.println("ERRO : "+ert);   
			     aq.close();
			        }catch(IOException e){}
			//JOptionPane.showMessageDialog(null, "Erro : "+ert);
		}
		
	}


	
	
	

	public void preenche_mat_col(){

		String comandosql = "SELECT nome FROM dados_pe"; 
		AcessoDB x = new AcessoDB();
		x.conecta();
		cons = x.Consulta(comandosql);
		try {
			cons.beforeFirst();


			while(cons.next()){

				mat_col.addItem(cons.getObject("nome"));
				mat_col1.addItem(cons.getObject("nome"));  

			}cons.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}	


	public void preenche_mat_stok(){

		String comandosql = "SELECT prod FROM materiais"; 
		AcessoDB x = new AcessoDB();
		x.conecta();
		cons = x.Consulta(comandosql);
		try {
			cons.beforeFirst();


			while(cons.next()){

				stok.addItem(cons.getObject("prod"));
				stok_1.addItem(cons.getObject("prod"));  

			}cons.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	public void preenche_mat_forne(){


		new Thread(new Runnable(){
			public void run(){

				ResultSet conn;
				String comandosql = "SELECT nome FROM fornecedor"; 
				AcessoDB x = new AcessoDB();
				x.conecta();
				conn = x.Consulta(comandosql);
				try {
					conn.beforeFirst();


					while(conn.next()){

						fornecedor_mat.addItem(conn.getObject("nome"));  

					}conn.close();
				} catch (SQLException e) {
					e.printStackTrace();}
				

			} 
		}).start();


	}







	public void preenche_veiculos(){

		String comandosql = "SELECT modelo,placa,consumo,kilometragem,tipo FROM cad_veiculos";  //	"Modelo", "Placa", "Consumo", "Kilometragem", "Tipo"
		AcessoDB x = new AcessoDB();
		x.conecta();
		cons = x.Consulta(comandosql);
		try {
			cons.beforeFirst();

			Object vet[] = new Object[5];
			while(cons.next()){

				vet[0]=cons.getObject("modelo");
				vet[1]=cons.getObject("placa");
				vet[2]=cons.getObject("consumo");
				vet[3]=cons.getObject("kilometragem");
				vet[4]=cons.getObject("tipo");

				model_1.addRow(vet);


			}
			cons.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	public void preenche_pesq_fun(){
		//"Nome", "RG", "CPF", "N. carteira"
		ResultSet cop;
		String comandosql = "SELECT * FROM dados_pe where superior = 'Atuante'";  //	"Modelo", "Placa", "Consumo", "Kilometragem", "Tipo"
		AcessoDB x = new AcessoDB();
		x.conecta();

		//	"Cod  ", "Nome  ", "Endere\u00E7o  ", "Cidade  ", "Nascimento  ", "Rg  ", "CPF  ",
		//"Cor  ", "N\u00BA Carteira de Trab.  ", "Ag\u00EAncia  ", "Conta  ", "Sexo  ", "Grau Instru\u00E7\u00E3o  
		//", "Naturalidade  ", "Estado  ", "Est. Civil  ", "Nacionalidade  ", "Admiss\u00E3o  ", "Desligamento //
		//", "Carga Hor\u00E1ria  ", "Equipe  ", "Setor  ", "Superior  ", "Status  ", "Cargo  ", "Nome do pai  "
		//, "Nome da m\u00E3e  ", "Observa\u00E7\u00E3o  "

		cop = x.Consulta(comandosql);
		try {
			cop.beforeFirst();

			Object vet[] = new Object[28];
			while(cop.next()){

				vet[0]=cop.getObject(1);
				vet[1]=cop.getObject(2);
				vet[2]=cop.getObject(5);
				vet[3]=cop.getObject(6);
				vet[4]=cop.getObject(7);
				vet[5]=cop.getObject(8);
				vet[6]=cop.getObject(9);
				vet[7]=cop.getObject(10);
				vet[8]=cop.getObject(11);
				vet[9]=cop.getObject(12);

				vet[10]=cop.getObject(13);
				vet[11]=cop.getObject(14);
				vet[12]=cop.getObject(15);
				vet[13]=cop.getObject(16);
				vet[14]=cop.getObject(17);
				vet[15]=cop.getObject(18);
				vet[16]=cop.getObject(19);
				vet[17]=cop.getObject(21);
				//vet[18]=cop.getObject(22);
				vet[19]=cop.getObject(23);

				vet[20]=cop.getObject(24);
				vet[21]=cop.getObject(25);
				vet[22]=cop.getObject(26);
				vet[23]=cop.getObject(27);
				vet[24]=cop.getObject(28);
				vet[25]=cop.getObject(3);
				vet[26]=cop.getObject(4);
				vet[27]=cop.getObject(20);
				model_2.addRow(vet);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void preenche_fun(){
		
		String comandosql = "SELECT nome FROM dados_pe where superior = 'Atuante'"; 
		AcessoDB x = new AcessoDB();
		x.conecta();
		Object vet[] = new Object[2];
		cons = x.Consulta(comandosql);
		try {
			cons.beforeFirst();


			while(cons.next()){

				vet[0]= null;
				vet[1]=cons.getObject("nome");
				mot_mot.addItem(cons.getObject("nome"));

				model_3.addRow(vet);
				


			}
			cons.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	
	}






	public void preenche_mat(){

		//new Thread(new Runnable(){
		//	public void run(){

				String comandosql = "SELECT * FROM materiais"; 
				AcessoDB x = new AcessoDB();
				x.conecta();
				cons = x.Consulta(comandosql);
				try {
					cons.beforeFirst();


					Object vet[] = new Object[7];
					while(cons.next()){

						vet[0] = cons.getObject("prod");
						vet[1] = cons.getObject("tipo");
						vet[2] = cons.getObject("qnt");
						vet[3] = cons.getObject("uni");
						vet[4] = cons.getObject("vp");
						vet[5] = cons.getObject("pc");
						vet[6] = cons.getObject("ru");

						model_5.addRow(vet);


					}
					cons.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			//} 
		//}).start();

	}

	public void preenche_for(){
		//"Nome", "RG", "CPF", "N. carteira"
		String comandosql = "SELECT * FROM fornecedor";  //	"Modelo", "Placa", "Consumo", "Kilometragem", "Tipo"
		AcessoDB x = new AcessoDB();
		x.conecta();
		cons = x.Consulta(comandosql);
		try {
			cons.beforeFirst();

			Object vet[] = new Object[8];
			while(cons.next()){
				//"CNPJ", "Nome", "Insci\u00E7\u00E3o Estadual", "Endere\u00E7o", "Telefone", "Telefone", "E-mail", "Observa\u00E7\u00E3o"
				vet[0]=cons.getObject("cnpj");
				vet[1]=cons.getObject("nome");
				vet[2]=cons.getObject("i_e");
				vet[3]=cons.getObject("end");
				vet[4]=cons.getObject("tel");
				vet[5]=cons.getObject("tele");
				vet[6]=cons.getObject("mail");
				vet[7]=cons.getObject("obs");

				model_6.addRow(vet);

			}
			cons.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	public void preenche_vel(){

		String comandosql = "SELECT * FROM cad_veiculos";  //	"Modelo", "Placa", "Consumo", "Kilometragem", "Tipo"
		AcessoDB x = new AcessoDB();
		x.conecta();
		cons = x.Consulta(comandosql);
		try {
			cons.beforeFirst();

			//	Object vet[] = new Object[2];
			while(cons.next()){

				vei.add(cons.getObject("modelo").toString());
				plc.add(cons.getObject("placa").toString());

				//	veiculos_v.add(
				mot_vei.addItem(cons.getObject("modelo"));
				veicles.addItem(cons.getObject("placa").toString());


			}

			cons.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			

	}






	public void preenche_os(){

		new Thread(new Runnable(){
			public void run(){

				ResultSet conn;    	
				String comandosql = "SELECT * FROM empretimo"; 
				AcessoDB x = new AcessoDB();
				x.conecta();
				conn = x.Consulta(comandosql);
				try {
					conn.beforeFirst();

				//	"Material", "Colaborador", "Status", "Empr\u00E9stimo", "Devolu\u00E7\u00E3o", "OBS : "
					
					while(conn.next()){
						model_7.addRow(new Object[]{conn.getObject("cod_m"),
								conn.getObject("cod_fun"),
								conn.getObject("statuse"),
								conn.getObject("datas"),
								conn.getObject("data_dev"),
								conn.getObject("obs")});
					}
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


			} 
		}).start();


	}


	public void preenche_cnt(String cmdsql){

		//"Aberto", "Pagas", "Atradas","Todas"
		ResultSet conn;
		String comandosql = null;
		Date hoje = new Date();
		//Data dt = new Data();
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		 String var = null;
		 
	    if((cmdsql).equals("null")){
	    	var = "null";
	    	comandosql = "SELECT * FROM contas INNER JOIN cad_lancamentos on contas.cod = cad_lancamentos.lancamento WHERE cad_lancamentos.flag = 0"; 		
	    }		
	    if((cmdsql).equals("Aberto")){
	    	var = "ABERTO";
	    	comandosql = "SELECT * FROM contas INNER JOIN cad_lancamentos on contas.cod = cad_lancamentos.lancamento "; 		 		
	    }		
	    if((cmdsql).equals("Pagas")){
	    	var = "PAGO";
	    	comandosql =  "SELECT * FROM contas INNER JOIN cad_lancamentos on contas.cod = cad_lancamentos.lancamento WHERE cad_lancamentos.flag = 1";		
	    }		
	    if((cmdsql).equals("Atrasadas")){
	    	var = "ATRASADO";
	    	comandosql = "SELECT * FROM contas INNER JOIN cad_lancamentos on contas.cod = cad_lancamentos.lancamento WHERE cad_lancamentos.flag = 0"; 		
	    }		
	    if((cmdsql).equals("Todas")){
            var = "Todas";
	    	comandosql = "SELECT * FROM contas INNER JOIN cad_lancamentos on contas.cod = cad_lancamentos.lancamento "; 		
	    }		
				    	
				System.out.println(comandosql);
				AcessoDB x = new AcessoDB();
				x.conecta();
				conn = x.Consulta(comandosql);
			

				try {
					conn.beforeFirst();
					while(conn.next()){
						if(!(conn.getString("referente")).contains("bastecimento")){
							String status = null;
                           	java.util.Date venc = new java.util.Date(conn.getDate("data_venc").getTime());
                            
							if((hoje).before(venc) && conn.getInt("flag") == 0){
                            	status = "ABERTO";
                            }
                            if((hoje).after(venc) && conn.getInt("flag") == 0){
                            	status = "ATRASADO";
                            }
                            if((hoje).before(venc) && conn.getInt("flag") == 1){
                            	status = "PAGO";
                            }
                            if((hoje).after(venc) && conn.getInt("flag") == 1){
                            	status = "PAGO";
                            }
                           // System.out.println(var+"  "+status);
                            if((var).equals(status) || (var).equals("Todas") || (var).equals("null")){
							Object[] val = {		
								status,
								conn.getObject("nome").toString(),  //nome
								conn.getObject("referente"),  //referente
								fmt.format(conn.getDate("data_emis")).toString(),  //data_emis
								fmt.format(conn.getDate("data_venc")).toString(),    //data_venc
								conn.getObject("valor_parc")       //valor_parc
								};     
						model_13.addRow(val);
                            }
					}

					}
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
				
				}
				
				
				
				
				


	}
	
	
	public void limpa_table_3(){
		
		
		
	}
	


	public void limpa_veiculos(){
		new Thread(new Runnable(){
			public void run(){
			DefaultTableModel dm = (DefaultTableModel)table_2.getModel();
			dm.getDataVector().removeAllElements();
			dm.fireTableDataChanged();
			} 
		}).start();

}
	

	
	public void limpa_fun(){
			new Thread(new Runnable(){
				public void run(){
				DefaultTableModel dm = (DefaultTableModel)table_1.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();
				} 
			}).start();

	}


	public void limpa_os(){

		new Thread(new Runnable(){
			public void run(){

				DefaultTableModel dm = (DefaultTableModel)table_7.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();

			}  
		}).start();
	}



	public void limpa_cnt(){

	//	new Thread(new Runnable(){
		//	public void run(){

				for(int i=0; i<detalhes_conta.size(); i++){
					detalhes_conta.remove(i);
				}    	


				DefaultTableModel dm = (DefaultTableModel)table_13.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();

			//}  
		//}).start();
	}


	public void limpa_combobox_forne(){
		new Thread(new Runnable(){
			public void run(){
				if(fornecedor_mat.getItemCount() > 0){
					fornecedor_mat.removeAllItems();
				}
			}  
		}).start();


	}

	public void mostra_botao(){
		
		new Thread(new Runnable(){
			public void run(){
		
		AcessoDB ty = new AcessoDB();
		ty.conecta();
		Calendar cale = Calendar.getInstance();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date datee = new Date();
		cale.setTime(datee);
		cale.add(Calendar.HOUR_OF_DAY, 24);
		Date ndt = cale.getTime();
		
		String comandosql = "SELECT * FROM cad_lancamentos WHERE flag = 0 AND data_venc = '"+fmt.format(ndt)+"' ;";
		//String comandosql = "SELECT * FROM cad_lancamentos WHERE data_venc = '2015-04-13' AND tipo = 'Pagar';";
		ty.conecta();
		ResultSet opera = ty.Consulta(comandosql);
		int contaconta=0;
		try{
		opera.beforeFirst();
		while(opera.next()){
			contaconta++;
		}
		opera.close();
		}catch(SQLException er){}
		if(contaconta > 0){
			btnNewButton_6.setVisible(true);
			
		}else{
			btnNewButton_6.setVisible(false);
		}
		
			}  
		}).start();
		
	}
	
	
	

	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	} 
	
	
	public void bar_load(){


		new Thread(new Runnable(){
			public void run(){

				 int minimum = progressBar.getMinimum();
			      int maximum = progressBar.getMaximum();
			      for (int i = minimum; i < maximum; i++) {
			        try {
			          int value = progressBar.getValue();
			          progressBar.setValue(value + 1);

			          Thread.sleep(100);
			        } catch (InterruptedException ignoredException) {}
			        }
				

			} 
		}).start();

	}
	
	public void preenche_rev_vel(){
		
		AcessoDB as = new AcessoDB();
		as.conecta();
		ResultSet rest = as.Consulta("SELECT modelo FROM cad_veiculos");
		try{
		rest.beforeFirst();
		while(rest.next()){
			rev_vei.addItem(rest.getObject("modelo").toString());
		}
		}catch(SQLException ert){}
	}
	
	
	public void preenche_mot(){
		
		AcessoDB as = new AcessoDB();
		as.conecta();
		String comandosql = "SELECT nome, cnh FROM cad_motorista;";
		ResultSet rest = as.Consulta(comandosql);
		try{
			rest.beforeFirst();
			while(rest.next()){
				model_8.addRow(new Object[]{rest.getObject("nome"), rest.getObject("cnh")});
			}
		}catch(SQLException ert){}	
			}


	public void preenche_abas(){
		AcessoDB as = new AcessoDB();
		as.conecta();
		String comandosql = "SELECT * FROM contas WHERE contas.referente LIKE '%Abastecimento%'  ORDER BY data_emis DESC;";
		ResultSet rest = as.Consulta(comandosql);
		/*SELECT * FROM contas INNER JOIN cad_lancamentos on contas.cod = cad_lancamentos.lancamento WHERE contas.referente LIKE '%Abastecimento%'*/
		try{
			rest.beforeFirst();
			
			while(rest.next()){
				
				//"Posto", "Emiss\u00E3o", "Placa", "Kilometragem", "Litros", "Total"
				
				String var[] = rest.getString("referente").split(",");
				for(int i=0; i < var.length; i++){
				//System.out.println(var[i]);
				}
				
				/*Abastecimento 
                DDN6432 
                30 
                345231 */
				Data dt = new Data();
				model_11.addRow(new Object[]{rest.getObject("nome"),dt.semanal(rest.getObject("data_emis").toString()),var[1],var[3],var[2],rest.getObject("total")});
			}
		}catch(SQLException ert){}	
			}
		
	
	public void limpa_abas(){

		
				DefaultTableModel dm = (DefaultTableModel)table_3.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();

	
	}
}




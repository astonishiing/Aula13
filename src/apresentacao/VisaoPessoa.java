package apresentacao;

import javax.swing.*;

public class VisaoPessoa extends JFrame {

    //Propriedades da classe
    private static final long serialVersionUID = 1L;

    private JLabel lblNome = new JLabel("Nome");
    private JTextField txtNome = new JTextField();

    private JLabel lblEndereco = new JLabel("Endereco");
    private JTextField txtEndereco = new JTextField();

    private JLabel lblTelefone = new JLabel("Telefone");
    private JTextField txtTelefone = new JTextField();

    private JButton btnGravar = new JButton("Gravar");


    public static void main(String[] args) {
        new VisaoPessoa().setVisible(true);
    }

    public VisaoPessoa(){
        //Configuracao da Janela
        setTitle("Cadastro de pessoa");
        setSize(300, 240);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        //Configuracao do nome
        lblNome.setBounds(10, 10, 200, 20);
        add(lblNome);
        txtNome.setBounds(10, 30, 265, 20);
        add(txtNome);

        //Configuracao do endereco
        lblEndereco.setBounds(10, 60, 200, 20);
        add(lblEndereco);
        txtEndereco.setBounds(10, 80, 265, 20);
        add(txtEndereco);

        //Confiuracao do telefone
        lblTelefone.setBounds(10, 110, 200, 20);
        add(lblTelefone);
        txtTelefone.setBounds(10, 110, 100, 20);
        add(txtTelefone);

        //Configuracao do butão
        btnGravar.setBounds(100, 160, 100, 30);
        add(btnGravar);
        btnGravar.addActionListener(new ControladorGravar(txtNome, txtEndereco, txtTelefone));

    }


}

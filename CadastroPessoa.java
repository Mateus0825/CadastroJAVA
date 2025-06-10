import java.awt.*;
import javax.swing.*;

public class CadastroPessoa extends JFrame {

    String tipos[] = {"", "Física", "Jurídica"};
    private JTextField txtCpf, txtNome, txtRg, txtOrgao, txtEmail, txtCep, txtUf, txtComp, txtMunicipio, txtLogradouro, txtNumero, txtComplemento, txtBairro, txtTelefone;
    private JComboBox<String> comboTipo;
    private JCheckBox fornecedorCheck;
    private JRadioButton radioAtivo, radioInativo;
    private ButtonGroup grupoSituacao; 

    public CadastroPessoa() {
        setTitle("Cadastro de Pessoa");
        setSize(1050, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painelPrincipal = new JPanel(null);
        painelPrincipal.setBackground(new Color(252, 252, 252));
        setContentPane(painelPrincipal);

        Font fonteInfo = new Font("Arial", Font.PLAIN, 14);
        Font fonteLabel = new Font("Arial", Font.BOLD, 14);

        JLabel titulo = new JLabel("Cadastro de Pessoa");
        titulo.setBounds(40, 20, 400, 32);
        titulo.setFont(new Font("Arial", Font.PLAIN, 30));
        titulo.setForeground(new Color(255, 102, 0));
        painelPrincipal.add(titulo);

        // Tipo, CPF, Fornecedor
        JPanel painelLinha1 = new JPanel(null);
        painelLinha1.setBounds(40, 70, 950, 30);
        painelLinha1.setBackground(painelPrincipal.getBackground());

        JLabel lblTipo = criarLabel("Tipo", 0);
        comboTipo = new JComboBox<>(tipos);
        comboTipo.setBounds(150, 0, 140, 30);

        JLabel lblCpf = criarLabel("CPF / CNPJ ...", 300);
        txtCpf = new JTextField();
        txtCpf.setBounds(450, 0, 250, 30);

        JLabel lblFornecedor = criarLabel("Fornecedor", 720);
        fornecedorCheck = new JCheckBox();
        fornecedorCheck.setBounds(870, 5, 20, 20);
        fornecedorCheck.setBackground(painelPrincipal.getBackground());

        painelLinha1.add(lblTipo); painelLinha1.add(comboTipo);
        painelLinha1.add(lblCpf); painelLinha1.add(txtCpf);
        painelLinha1.add(lblFornecedor); painelLinha1.add(fornecedorCheck);
        painelPrincipal.add(painelLinha1);

        // Nome
        JLabel lblNome = criarLabel("Nome", 40, 105);
        txtNome = new JTextField();
        txtNome.setBounds(190, 105, 780, 30);
        painelPrincipal.add(lblNome); painelPrincipal.add(txtNome);

        // RG, Orgão
        JLabel lblRg = criarLabel("RG / Inscrição Estadual", 40, 140);
        lblRg.setFont(new Font("Arial", Font.BOLD, 12));
        txtRg = new JTextField();
        txtRg.setBounds(190, 140, 140, 30);

        JLabel lblOrgao = criarLabel("Orgão Expedidor", 340, 140);
        txtOrgao = new JTextField();
        txtOrgao.setBounds(490, 140, 140, 30);

        painelPrincipal.add(lblRg); painelPrincipal.add(txtRg);
        painelPrincipal.add(lblOrgao); painelPrincipal.add(txtOrgao);

        // Email, CEP
        JLabel lblEmail = criarLabel("Email", 40, 175);
        txtEmail = new JTextField();
        txtEmail.setBounds(190, 175, 290, 30);

        JLabel lblCep = criarLabel("CEP", 490, 175);
        txtCep = new JTextField();
        txtCep.setBounds(640, 175, 330, 30);

        painelPrincipal.add(lblEmail); painelPrincipal.add(txtEmail);
        painelPrincipal.add(lblCep); painelPrincipal.add(txtCep);

        // País, UF, Comp
        JLabel lblPais = criarLabel("País", 40, 210);
        JLabel lblEscolha = new JLabel("BRASIL");
        lblEscolha.setBounds(190, 210, 290, 30);
        lblEscolha.setOpaque(true);
        lblEscolha.setBackground(new Color(201, 201, 201));
        lblEscolha.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JLabel lblUf = criarLabel("UF ...", 490, 210);
        txtUf = new JTextField();
        txtUf.setBounds(640, 210, 70, 30);

        txtComp = new JTextField();
        txtComp.setBackground(new Color(201, 201, 201));
        txtComp.setBounds(720, 210, 250, 30);

        painelPrincipal.add(lblPais); painelPrincipal.add(lblEscolha);
        painelPrincipal.add(lblUf); painelPrincipal.add(txtUf); painelPrincipal.add(txtComp);

        // Município
        JLabel lblMunicipio = criarLabel("Município", 40, 245);
        txtMunicipio = new JTextField();
        txtMunicipio.setBounds(190, 245, 780, 30);
        txtMunicipio.setBackground(new Color(201, 201, 201));
        painelPrincipal.add(lblMunicipio); painelPrincipal.add(txtMunicipio);

        // Logradouro
        JLabel lblLogradouro = criarLabel("Logradouro", 40, 280);
        txtLogradouro = new JTextField();
        txtLogradouro.setBounds(190, 280, 780, 30);
        painelPrincipal.add(lblLogradouro); painelPrincipal.add(txtLogradouro);

        // Número, Complemento
        JLabel lblNumero = criarLabel("Número", 40, 315);
        txtNumero = new JTextField();
        txtNumero.setBounds(190, 315, 140, 30);

        JLabel lblComplemento = criarLabel("Complemento", 340, 315);
        txtComplemento = new JTextField();
        txtComplemento.setBounds(490, 315, 480, 30);

        painelPrincipal.add(lblNumero); painelPrincipal.add(txtNumero);
        painelPrincipal.add(lblComplemento); painelPrincipal.add(txtComplemento);

        // Bairro, Telefone, Situação
        JLabel lblBairro = criarLabel("Bairro", 40, 350);
        txtBairro = new JTextField();
        txtBairro.setBounds(190, 350, 140, 30);

        JLabel lblTelefone = criarLabel("Telefone", 340, 350);
        txtTelefone = new JTextField();
        txtTelefone.setBounds(490, 350, 140, 30);

        JLabel lblSituacao = criarLabel("Situação", 640, 350);
        radioAtivo = new JRadioButton("Ativo");
        radioInativo = new JRadioButton("Inativo");
        radioAtivo.setBounds(790, 350, 70, 30);
        radioInativo.setBounds(860, 350, 90, 30);
        radioAtivo.setBackground(painelPrincipal.getBackground());
        radioInativo.setBackground(painelPrincipal.getBackground());

        grupoSituacao = new ButtonGroup(); // Inicialização do grupo agora com escopo de classe
        grupoSituacao.add(radioAtivo);
        grupoSituacao.add(radioInativo);

        painelPrincipal.add(lblBairro); painelPrincipal.add(txtBairro);
        painelPrincipal.add(lblTelefone); painelPrincipal.add(txtTelefone);
        painelPrincipal.add(lblSituacao); painelPrincipal.add(radioAtivo); painelPrincipal.add(radioInativo);

        // Botões
        JButton btnConfirmar = criarBotao("Confirmar", 40);
        JButton btnExcluir = criarBotao("Excluir", 170);
        JButton btnLimpar = criarBotaoCinza("Limpar", 300);

        btnConfirmar.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");
            limpar();
        });
        btnExcluir.addActionListener(e -> limpar());
        btnLimpar.addActionListener(e -> limpar());

        painelPrincipal.add(btnConfirmar);
        painelPrincipal.add(btnExcluir);
        painelPrincipal.add(btnLimpar);

        setVisible(true);
    }

    private JLabel criarLabel(String texto, int x, int y) {
        JLabel lbl = new JLabel(texto);
        lbl.setBounds(x, y, 140, 30);
        lbl.setHorizontalAlignment(SwingConstants.CENTER);
        lbl.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        return lbl;
    }

    private JLabel criarLabel(String texto, int x) {
        JLabel lbl = new JLabel(texto);
        lbl.setBounds(x, 0, 140, 30);
        lbl.setHorizontalAlignment(SwingConstants.CENTER);
        lbl.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        return lbl;
    }

    private JButton criarBotao(String texto, int x) {
        JButton btn = new JButton(texto);
        btn.setBounds(x, 400, 120, 30);
        btn.setBackground(new Color(255, 102, 0));
        btn.setForeground(Color.WHITE);
        return btn;
    }

    private JButton criarBotaoCinza(String texto, int x) {
        JButton btn = new JButton(texto);
        btn.setBounds(x, 400, 120, 30);
        btn.setBackground(new Color(201, 201, 201));
        return btn;
    }

    private void limpar() {
        txtCpf.setText(""); txtNome.setText(""); txtRg.setText(""); txtOrgao.setText("");
        txtEmail.setText(""); txtCep.setText(""); txtUf.setText(""); txtComp.setText("");
        txtMunicipio.setText(""); txtLogradouro.setText(""); txtNumero.setText("");
        txtComplemento.setText(""); txtBairro.setText(""); txtTelefone.setText("");
        comboTipo.setSelectedIndex(0); fornecedorCheck.setSelected(false);
        grupoSituacao.clearSelection(); 
    }

    public static void main(String[] args) {
        new CadastroPessoa();
    }
}

package diversos;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Joptionpane {

	public static void main(String[] args) {

		// ═══════════════════════════════
		// carrega e redimensiona o ícone
		// ═══════════════════════════════
		ImageIcon icone = new ImageIcon("C:\\Users\\vinim\\git\\Outros\\Outros\\src\\imagens\\latest.jpg");
		Image redimensionado = icone.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		icone = new ImageIcon(redimensionado); // aplica o tamanho novo

		// ═══════════════════════════════
		// monta os campos de login
		// ═══════════════════════════════
		JTextField login = new JTextField();
		JPasswordField senha = new JPasswordField();
		Object[] campos = { "Login:", login, "Senha:", senha };

		// ═══════════════════════════════════════════════════════
		// showConfirmDialog não aceita ícone direto
		// solução: cria um JOptionPane manualmente com o ícone
		// ═══════════════════════════════════════════════════════
		JOptionPane painel = new JOptionPane(campos, // conteúdo (seus campos)
				JOptionPane.PLAIN_MESSAGE, // sem ícone padrão
				JOptionPane.OK_CANCEL_OPTION, // botões OK e Cancelar
				icone // seu ícone aqui
		);

		// cria e exibe a janela a partir do painel
		javax.swing.JDialog dialog = painel.createDialog("Depósito do Saulo");
		dialog.setVisible(true);

		// pega o valor do botão clicado
		Object resultado = painel.getValue();
		int opcao = (resultado == null) ? JOptionPane.CANCEL_OPTION : (int) resultado;

		// ═══════════════════════════════
		// lógica de login
		// ═══════════════════════════════
		if (opcao == JOptionPane.OK_OPTION) {
			String user = login.getText();
			String pass = new String(senha.getPassword());

			if (user.equals("adminSaulo") && pass.equals("saulo")) {
				JOptionPane.showMessageDialog(null, "Acesso liberado 😎", "Sucesso", JOptionPane.PLAIN_MESSAGE, icone);
			} else {
				JOptionPane.showMessageDialog(null, "Acesso negado ❌", "Erro", JOptionPane.PLAIN_MESSAGE, icone);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Programa encerrado", "Saindo", JOptionPane.PLAIN_MESSAGE, icone);
		}
	}
}
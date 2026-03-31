package diversos;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Joptionpane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JTextField login = new JTextField();
		JPasswordField senha = new JPasswordField();

		Object[] campos = { "Login:", login, "Senha:", senha };
		int opcao = JOptionPane.showConfirmDialog(null, campos, "Déposito do Pedrão", JOptionPane.OK_CANCEL_OPTION);

		if (opcao == JOptionPane.OK_OPTION) {
			String user = login.getText();
			String pass = new String(senha.getPassword());

			if (user.equals("adminPedrao") && pass.equals("pedraoMonstro1234v4lq")) {
				JOptionPane.showMessageDialog(null, "Acesso liberado 😎");
			} else {
				JOptionPane.showMessageDialog(null, "Acesso negado ❌");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Programa encerrado");
		}
	}
}
package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class AddPlate extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AddPlate dialog = new AddPlate();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddPlate() {
		setAlwaysOnTop(true);
		setBounds(100, 100, 588, 368);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 258, 566, 54);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(null);
			{
				JButton bttnSalir = new JButton("Salir");
				bttnSalir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				bttnSalir.setBounds(425, 16, 126, 29);
				bttnSalir.setActionCommand("Cancel");
				buttonPane.add(bttnSalir);
			}
		}
		{
			JButton bttnAgregarIngrediente = new JButton("Agregar");
			bttnAgregarIngrediente.setBounds(213, 180, 122, 49);
			contentPanel.add(bttnAgregarIngrediente);
			bttnAgregarIngrediente.setHorizontalAlignment(SwingConstants.CENTER);
			bttnAgregarIngrediente.setVerticalAlignment(SwingConstants.CENTER);
			bttnAgregarIngrediente.setActionCommand("OK");
			getRootPane().setDefaultButton(bttnAgregarIngrediente);
		}
	}

}

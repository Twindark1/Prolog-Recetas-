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
import javax.xml.bind.ParseConversionEvent;
import javax.swing.border.BevelBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

public class AddIngredients extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtFldIngrediente;
	private JTextField txtFldCantidad;
	private JComboBox cbBoxUnidades;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AddIngredients dialog = new AddIngredients();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddIngredients() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AddIngredients.class.getResource("/images/addIngredientsMainIcon.png")));
		setTitle("Ingredientes");
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
			bttnAgregarIngrediente.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"El ingrediente ha sido agregado satisfactoriamente!");
				}
			});
			bttnAgregarIngrediente.setBackground(new Color(60, 179, 113));
			bttnAgregarIngrediente.setBounds(213, 180, 122, 49);
			contentPanel.add(bttnAgregarIngrediente);
			bttnAgregarIngrediente.setHorizontalAlignment(SwingConstants.CENTER);
			bttnAgregarIngrediente.setVerticalAlignment(SwingConstants.CENTER);
			bttnAgregarIngrediente.setActionCommand("OK");
			getRootPane().setDefaultButton(bttnAgregarIngrediente);
		}
		
		JLabel lblIngrediente = new JLabel("Ingrediente:");
		lblIngrediente.setBounds(65, 48, 122, 30);
		contentPanel.add(lblIngrediente);
		
		txtFldIngrediente = new JTextField();
		txtFldIngrediente.setBounds(159, 50, 231, 26);
		contentPanel.add(txtFldIngrediente);
		txtFldIngrediente.setColumns(10);
		
		JLabel label = new JLabel("Cantidad:");
		label.setBounds(85, 109, 69, 20);
		contentPanel.add(label);
		
		txtFldCantidad = new JTextField();
		txtFldCantidad.setColumns(10);
		txtFldCantidad.setBounds(159, 106, 133, 26);
		contentPanel.add(txtFldCantidad);
		
		cbBoxUnidades = new JComboBox();
		cbBoxUnidades.setBounds(307, 106, 46, 26);
		contentPanel.add(cbBoxUnidades);
		
		JLabel lblBackgroundImage = new JLabel("");
		lblBackgroundImage.setIcon(new ImageIcon(AddIngredients.class.getResource("/images/pepper.png")));
		lblBackgroundImage.setBounds(10, -221, 566, 624);
		contentPanel.add(lblBackgroundImage);
	}
}

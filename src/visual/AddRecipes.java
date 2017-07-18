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
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AddRecipes extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtFldNombreReceta;
	private JTable ingredientesTable;
	private DefaultTableModel tableModel;
	private Object[] fila;
	private int selectedIngrediente;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AddRecipes dialog = new AddRecipes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddRecipes() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AddRecipes.class.getResource("/images/recipesMainIcon.png")));
		setTitle("Recetas");
		setAlwaysOnTop(true);
		setBounds(100, 100, 989, 539);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 421, 967, 62);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(null);
			{
				JButton bttnSalir = new JButton("Salir");
				bttnSalir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				bttnSalir.setBounds(530, 16, 165, 29);
				bttnSalir.setActionCommand("Cancel");
				buttonPane.add(bttnSalir);
			}
			
			JButton btnGuardarReceta = new JButton("Guardar Receta");
			btnGuardarReceta.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			btnGuardarReceta.setBounds(339, 16, 165, 29);
			buttonPane.add(btnGuardarReceta);
		}
		
		JPanel agregarRecetaPanel = new JPanel();
		agregarRecetaPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Agregar Receta", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		agregarRecetaPanel.setBounds(15, 16, 470, 120);
		contentPanel.add(agregarRecetaPanel);
		agregarRecetaPanel.setLayout(null);
		{
			JLabel lblNombreDe = new JLabel("Nombre:");
			lblNombreDe.setBounds(63, 60, 63, 20);
			agregarRecetaPanel.add(lblNombreDe);
		}
		
		txtFldNombreReceta = new JTextField();
		txtFldNombreReceta.setBounds(141, 57, 297, 26);
		agregarRecetaPanel.add(txtFldNombreReceta);
		txtFldNombreReceta.setColumns(10);
		
		JPanel agregarIngredientesPanel = new JPanel();
		agregarIngredientesPanel.setLayout(null);
		agregarIngredientesPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Agregar Ingredientes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		agregarIngredientesPanel.setBounds(15, 171, 470, 242);
		contentPanel.add(agregarIngredientesPanel);
		
		JLabel label = new JLabel("Ingrediente:");
		label.setBounds(47, 79, 122, 30);
		agregarIngredientesPanel.add(label);
		
		JLabel label_1 = new JLabel("Cantidad:");
		label_1.setBounds(63, 148, 69, 20);
		agregarIngredientesPanel.add(label_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(141, 81, 231, 26);
		agregarIngredientesPanel.add(comboBox);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(326, 185, 115, 29);
		agregarIngredientesPanel.add(btnAgregar);
		
		textField = new JTextField();
		textField.setBounds(147, 145, 133, 26);
		agregarIngredientesPanel.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(295, 145, 46, 26);
		agregarIngredientesPanel.add(comboBox_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(504, 29, 448, 376);
		contentPanel.add(panel);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		ingredientesTable = new JTable();
		ingredientesTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(ingredientesTable.getSelectedRow()>=0){
					selectedIngrediente = ingredientesTable.getSelectedRow();
				}
			}
		});
		scrollPane.setViewportView(ingredientesTable);
		tableModel = new DefaultTableModel(){
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			};
		};
		String[] columnNames = {"Ingrediente","Cantidad"};
		tableModel.setColumnIdentifiers(columnNames);
		
		ingredientesTable.setModel(tableModel);
		panel.setLayout(gl_panel);
		cargarIngredientes();
	}
	
	public void cargarIngredientes() {
		tableModel.setRowCount(0);
		fila = new Object[tableModel.getColumnCount()];
			fila[0] = "Leche"; 
			fila[1] = "2";
		tableModel.addRow(fila);
		ingredientesTable.setModel(tableModel);
		ingredientesTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		ingredientesTable.getTableHeader().setReorderingAllowed(false);
		TableColumnModel columnModel = ingredientesTable.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(210);
		columnModel.getColumn(1).setPreferredWidth(210);
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment( JLabel.CENTER );
		for(int x=0;x<tableModel.getColumnCount();x++){
			ingredientesTable.getColumnModel().getColumn(x).setCellRenderer( centerRenderer );
	        } //CONTROL+SHIFT+?
	}
}

package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class MainWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainWindow.class.getResource("/images/mainIcon.png")));
		setResizable(false);
		setTitle("ProRecetas\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1034, 657);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1012, 31);
		contentPane.add(menuBar);
		
		JMenu mnIngredientes = new JMenu("Ingredientes");
		menuBar.add(mnIngredientes);
		
		JMenuItem mntmAgregarIngredientes = new JMenuItem("Agregar Ingredientes");
		mntmAgregarIngredientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddIngredients addIngredientsWindow = new AddIngredients();
				addIngredientsWindow.setVisible(true);
				addIngredientsWindow.setResizable(false);
				//addIngredientsWindow.setLocationRelativeTo(null);
			}
		});
		mnIngredientes.add(mntmAgregarIngredientes);
		
		JMenu mnRecetas = new JMenu("Recetas");
		menuBar.add(mnRecetas);
		
		JMenuItem mntmAgregarRecetas = new JMenuItem("Agregar Recetas");
		mntmAgregarRecetas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddRecipes addRecipesWindow = new AddRecipes();
				addRecipesWindow.setVisible(true);
				addRecipesWindow.setResizable(false);
				//addRecipesWindow.setLocationRelativeTo(null);
			}
		});
		mnRecetas.add(mntmAgregarRecetas);
		
		JMenu mnPlatos = new JMenu("Platos");
		menuBar.add(mnPlatos);
		
		JMenuItem mntmRealizarPlato = new JMenuItem("Realizar Plato");
		mntmRealizarPlato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddPlate addPlateWindow = new AddPlate();
				addPlateWindow.setVisible(true);
				addPlateWindow.setResizable(false);
				//addPlateWindow.setLocationRelativeTo(null);
			}
		});
		mnPlatos.add(mntmRealizarPlato);
		
		JLabel img_1 = new JLabel("");
		img_1.setIcon(new ImageIcon(MainWindow.class.getResource("/images/imagenPrincipal.png")));
		img_1.setBounds(133, 16, 706, 572);
		contentPane.add(img_1);
		
		JLabel background_img = new JLabel("");
		background_img.setIcon(new ImageIcon(MainWindow.class.getResource("/images/imagenFondo.png")));
		background_img.setBounds(-163, -1111, 2170, 2100);
		contentPane.add(background_img);
	}
}

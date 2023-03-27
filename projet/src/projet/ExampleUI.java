package projet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ExampleUI extends JFrame {
    public ExampleUI() {
        // Titre de la fenêtre
        super("Exemple d'interface utilisateur");

        // Configuration de la fenêtre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        getContentPane().setLayout(new BorderLayout());

        // Création du menu
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(Color.BLUE);
        JMenu menu1 = new JMenu("");
        menu1.setForeground(Color.WHITE);
        JMenu menu2 = new JMenu("");
        menu2.setForeground(Color.WHITE);
        menuBar.add(menu1);
        menuBar.add(menu2);
        setJMenuBar(menuBar);

        // Création du titre
       
        
        JLabel titleLabel = new JLabel("Résultats de la Coupe d'Afrique des Nations", SwingConstants.CENTER);
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 30));
        getContentPane().add(titleLabel, BorderLayout.NORTH);
        titleLabel.setForeground(Color.blue);
        titleLabel.setBackground(Color.white);
        titleLabel.setOpaque(true);
        getContentPane().add(titleLabel, BorderLayout.NORTH);
        
        	// Création du panneau des options
        	JPanel optionsPanel = new JPanel();
        	optionsPanel.setLayout(new BoxLayout(optionsPanel, BoxLayout.Y_AXIS));
        	JButton optionButton1 = new JButton("1ère journée                    ");
        	optionButton1.setForeground(Color.WHITE);                                                                                                                                                 
        	optionButton1.setBackground(Color.BLUE);
        	optionButton1.setPreferredSize(new Dimension(200, optionButton1.getPreferredSize().width));
        	optionsPanel.add(optionButton1);
        	optionButton1.addActionListener(e -> {
        		TableExample example1 = new TableExample();
        	    example1.setVisible(true);
        	});  
        		
        		

        		JButton optionButton2 = new JButton("2ème journée                  ");
            	optionButton2.setForeground(Color.WHITE);
            	optionButton2.setBackground(Color.BLUE);
            	optionButton2.setPreferredSize(new Dimension(200, optionButton2.getPreferredSize().width));
            	optionsPanel.add(optionButton2);
            	optionButton2.addActionListener(e -> {
            	    // Code for the action of Option 3
            		Example1 example1 = new Example1();
            	    example1.setVisible(true);
            	});
        		
        		
        	JButton optionButton3 = new JButton("3ème journée                  ");
        	optionButton3.setForeground(Color.WHITE);
        	optionButton3.setBackground(Color.BLUE);
         	optionButton3.setPreferredSize(new Dimension(200, optionButton3.getPreferredSize().width));
        	optionsPanel.add(optionButton3);
        	optionButton3.addActionListener(e -> {
        	    // Code for the action of Option 3
        		Example2 example2 = new Example2();
        	    example2.setVisible(true);
        	});

        	JButton optionButton4 = new JButton("Huitièmes                         ");
        	optionButton4.setForeground(Color.WHITE);
        	optionButton4.setBackground(Color.BLUE);
         	optionButton4.setPreferredSize(new Dimension(200, optionButton4.getPreferredSize().width));
        	optionsPanel.add(optionButton4);
        	optionButton4.addActionListener(e -> {
        	    // Code for the action of Option 4
        		Example3 example3 = new Example3();
        	    example3.setVisible(true);
        	});
        	JButton optionButton5 = new JButton("Quarts                               ");
        	
        	optionButton5.setForeground(Color.WHITE);
        	optionButton5.setBackground(Color.BLUE);
        	optionButton5.setPreferredSize(new Dimension(200, optionButton5.getPreferredSize().width));
        	optionsPanel.add(optionButton5);
        	optionButton5.addActionListener(e -> {
        		Example4 example4 = new Example4();
        	    example4.setVisible(true);
        	});

        	JButton optionButton6 = new JButton("Demi- finales                    ");
        	optionButton6.setForeground(Color.WHITE);
        	optionButton6.setBackground(Color.BLUE);
        	optionButton6.setPreferredSize(new Dimension(200, optionButton6.getPreferredSize().width));
        	optionsPanel.add(optionButton6);
        	optionButton6.addActionListener(e -> {
        	    // Code for the action of Option 2
        		Example5 example5 = new Example5();
        	    example5.setVisible(true);
        	});

        	JButton optionButton7 = new JButton("Petite finale                      ");
        	optionButton7.setForeground(Color.WHITE);
        	optionButton7.setBackground(Color.BLUE);
        	optionButton7.setPreferredSize(new Dimension(200, optionButton7.getPreferredSize().width));
        	optionsPanel.add(optionButton7);
        	optionButton7.addActionListener(e -> {
        	    // Code for the action of Option 3
        		Example6 example6 = new Example6();
        	    example6.setVisible(true);
        	});

        	JButton optionButton8 = new JButton("Finale                                 ");
        	optionButton8.setForeground(Color.WHITE);
        	optionButton8.setBackground(Color.BLUE);
        	optionButton8.setPreferredSize(new Dimension(200, optionButton8.getPreferredSize().width));
        	optionsPanel.add(optionButton8);
        	optionButton8.addActionListener(e -> {
        		Example7 example7 = new Example7();
        	    example7.setVisible(true);	
        	});
        	
        	add(optionsPanel,BorderLayout.WEST);
        // Création du panneau d'affichage (partie droite de la fenêtre)
        JPanel displayPanel = new JPanel();
        getContentPane().add(displayPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ExampleUI();
    }
}


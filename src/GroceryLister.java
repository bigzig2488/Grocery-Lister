
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class GroceryLister {
    private static JFrame frame = new JFrame();
    private static JPanel window = new JPanel(new CardLayout());
    private static JButton button = new JButton();
    private static JLabel label = new JLabel();
    private static JTextField textField = new JTextField();
    private static JTextArea textArea = new JTextArea();
    private static JScrollPane scrollPane = new JScrollPane();

    public  void addComponentToPane(Container pane) {
        JPanel mainMenu = new JPanel();
        JPanel listMenu = new JPanel();
        JPanel recipeMenu = new JPanel();
        mainMenu.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        label = new JLabel("Meal Schedule");
        label.setFont (label.getFont ().deriveFont (30.0f));
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 0;
        mainMenu.add(label, c);
 
        button = new JButton("Generate Plan");
        button.setFont (button.getFont ().deriveFont (20.0f));
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 1;
        mainMenu.add(button, c);
        
        label = new JLabel("Mon");
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 2;
        mainMenu.add(label, c);
        
        textField = new JTextField(14);
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 2;
        mainMenu.add(textField, c);
        
        button = new JButton("X");
        //button.setFont(new Font("Arial", Font.PLAIN, 13));
        //button.setPreferredSize(new Dimension(50,50));
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 2;
        mainMenu.add(button, c);
        
        label = new JLabel("Tue");
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 3;
        mainMenu.add(label, c);
        
        textField = new JTextField(14);
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 3;
        mainMenu.add(textField, c);
        
        button = new JButton("X");
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 3;
        mainMenu.add(button, c);
        
        label = new JLabel("Wed");
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 4;
        mainMenu.add(label, c);
        
        textField = new JTextField(14);
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 4;
        mainMenu.add(textField, c);
        
        button = new JButton("X");
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 4;
        mainMenu.add(button, c);
        
        label = new JLabel("Thu");
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 5;
        mainMenu.add(label, c);
        
        textField = new JTextField(14);
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 5;
        mainMenu.add(textField, c);
        
        button = new JButton("X");
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 5;
        mainMenu.add(button, c);
        
        label = new JLabel("Fri");
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 6;
        mainMenu.add(label, c);
        
        textField = new JTextField(14);
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 6;
        mainMenu.add(textField, c);
        
        button = new JButton("X");
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 6;
        mainMenu.add(button, c);
        
        label = new JLabel("Sat");
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 7;
        mainMenu.add(label, c);
        
        textField = new JTextField(14);
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 7;
        mainMenu.add(textField, c);
        
        button = new JButton("X");
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 7;
        mainMenu.add(button, c);
        
        label = new JLabel("Sun");
        //label.setFont (label.getFont ().deriveFont (12.0f));
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 8;
        mainMenu.add(label, c);
        
        textField = new JTextField(14);
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 8;
        mainMenu.add(textField, c);
        
        button = new JButton("X");
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 8;
        mainMenu.add(button, c);
        
        button = new JButton("Recipes");
        button.setFont (button.getFont ().deriveFont (15.0f));
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 5;
        button.addActionListener(new ActionListener(){ //Action Listener for search JButton
            @Override
            public void actionPerformed(ActionEvent ae) {
                CardLayout showPanel =  (CardLayout) window.getLayout();
                showPanel.show(window, "Recipes Menu");
            }
        });
        mainMenu.add(button, c);
        
        button = new JButton("List");
        button.setFont (button.getFont ().deriveFont (15.0f));
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 4;
        c.gridy = 5;
        button.addActionListener(new ActionListener(){ //Action Listener for search JButton
            @Override
            public void actionPerformed(ActionEvent ae) {
                CardLayout showPanel =  (CardLayout) window.getLayout();
                showPanel.show(window, "List Menu");
            }
        });
        mainMenu.add(button, c);
        
        button = new JButton("Generate Shopping List");
        button.setFont (button.getFont ().deriveFont (15.0f));
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 9;
        mainMenu.add(button, c);
        
        
        listMenu.setLayout(new GridBagLayout());
        
        button = new JButton("Back");
        button.setFont (button.getFont ().deriveFont (15.0f));
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 0;
        button.addActionListener(new ActionListener(){ //Action Listener for search JButton
            @Override
            public void actionPerformed(ActionEvent ae) {
                CardLayout showPanel =  (CardLayout) window.getLayout();
                showPanel.show(window, "Main Menu");
            }
        });
        listMenu.add(button, c);
        
        label = new JLabel("Shopping List");
        label.setFont (label.getFont ().deriveFont (30.0f));
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 1;
        listMenu.add(label, c);
        
        textArea = new JTextArea(25, 20);
        scrollPane = new JScrollPane(textArea);
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 2;
        listMenu.add(scrollPane, c);
        
        button = new JButton("Save List");
        button.setFont (button.getFont ().deriveFont (15.0f));
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 9;
        listMenu.add(button, c);
        
        recipeMenu.setLayout(new GridBagLayout());
        
        button = new JButton("Back");
        button.setFont (button.getFont ().deriveFont (15.0f));
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 0;
        button.addActionListener(new ActionListener(){ //Action Listener for search JButton
            @Override
            public void actionPerformed(ActionEvent ae) {
                CardLayout showPanel =  (CardLayout) window.getLayout();
                showPanel.show(window, "Main Menu");
            }
        });
        recipeMenu.add(button, c);
        
        label = new JLabel("Recipes");
        label.setFont (label.getFont ().deriveFont (30.0f));
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 1;
        recipeMenu.add(label, c);
        
        label = new JLabel("Name: ");
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 2;
        recipeMenu.add(label, c);
        
        textField = new JTextField(15);
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 2;
        recipeMenu.add(textField, c);
        
        label = new JLabel("Ingredients: ");
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 3;
        recipeMenu.add(label, c);
        
        textArea = new JTextArea(5, 15);
        scrollPane = new JScrollPane(textArea);
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 3;
        c.insets = new Insets(10,10,10,10);
        recipeMenu.add(scrollPane, c);
        
        button = new JButton("Add");
        button.setFont (button.getFont ().deriveFont (15.0f));
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 3;
        recipeMenu.add(button, c);
        
        textArea = new JTextArea(10, 10);
        textArea.setEditable(false);
        scrollPane = new JScrollPane(textArea);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 4;
        recipeMenu.add(scrollPane, c);
        
        button = new JButton("Edit");
        button.setFont (button.getFont ().deriveFont (15.0f));
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 4;
        recipeMenu.add(button, c);
        
        button = new JButton("Remove");
        button.setFont (button.getFont ().deriveFont (15.0f));
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 4;
        recipeMenu.add(button, c);
        
        window.add(mainMenu, "Main Menu");
        window.add(listMenu, "List Menu");
        window.add(recipeMenu, "Recipes Menu");
        
        pane.add(window);
        
    }

    public static void buildGUI(){
        //Create and set up the window.
        JFrame frame = new JFrame("Grocery Lister");
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(600,600));
        frame.addComponentListener( new ComponentAdapter(){
            public void componentResized(ComponentEvent evt){
                Dimension size = frame.getSize();
                Dimension min = frame.getMinimumSize();
                if (size.getWidth() < min.getWidth()){
                    frame.setSize((int)min.getWidth() ,(int) size.getHeight());
                }
                if (size.getHeight() < min.getHeight()){
                    frame.setSize((int)size.getWidth() ,(int) min.getHeight());
                }
            }
        });
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        GroceryLister gui = new GroceryLister();
        gui.addComponentToPane(frame.getContentPane());
    }
    
    public void readFile(Scanner s) {
    // used to read from the text file that has the recipe names and ingredients
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                buildGUI();
            }
        });
    }
}

package com.cmsc.grocerylister;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Interace methods to run the Grocery Lister app. 
 * @author Michael
 */
public class GroceryListerGUI {
    
    private static JFrame frame;
    private static JPanel window = new JPanel(new CardLayout());
    private static JButton button = new JButton();
    private static JLabel label = new JLabel();
    private static JTextField monTextField = new JTextField();
    private static JTextField tueTextField = new JTextField();
    private static JTextField wedTextField = new JTextField();
    private static JTextField thuTextField = new JTextField();
    private static JTextField friTextField = new JTextField();
    private static JTextField satTextField = new JTextField();
    private static JTextField sunTextField = new JTextField();
    private static JTextField nameTextField = new JTextField();
    private static JTextField textField = new JTextField();
    private static JTextArea listTextArea = new JTextArea();
    private static JTextArea recipeTextArea = new JTextArea();
    private static JTextArea ingredientsTextArea = new JTextArea();
    private static JTextArea textArea = new JTextArea();
    JScrollPane scrollPane = new JScrollPane();
    private ArrayList<String[]> recipes = new ArrayList<String[]>();
    
    public  void addComponentToPane(Container pane) {
        JPanel mainMenu = new JPanel();
        JPanel listMenu = new JPanel();
        JPanel recipeMenu = new JPanel();
        mainMenu.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        /**TO DO
         *recipes ArrayList should load all saved recipes into String[] array that will populate in recipeTextArea 
         *
         * 
         */
        
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
        
        monTextField = new JTextField(14);
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 2;
        mainMenu.add(monTextField, c);
        
        button = new JButton("X");
        //button.setFont(new Font("Arial", Font.PLAIN, 13));
        //button.setPreferredSize(new Dimension(50,50));
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 2;
        button.addActionListener((ActionEvent ae) -> {
            monTextField.setText(" ");
        } 
        );
        mainMenu.add(button, c);
        
        label = new JLabel("Tue");
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 3;
        mainMenu.add(label, c);
        
        tueTextField = new JTextField(14);
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 3;
        mainMenu.add(tueTextField, c);
        
        button = new JButton("X");
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 3;
        button.addActionListener((ActionEvent ae) -> {
            tueTextField.setText(" ");
        } //Action Listener for search JButton
        );
        mainMenu.add(button, c);
        
        label = new JLabel("Wed");
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 4;
        mainMenu.add(label, c);
        
        wedTextField = new JTextField(14);
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 4;
        mainMenu.add(wedTextField, c);
        
        button = new JButton("X");
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 4;
        button.addActionListener((ActionEvent ae) -> {
            wedTextField.setText(" ");
        } //Action Listener for search JButton
        );
        mainMenu.add(button, c);
        
        label = new JLabel("Thu");
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 5;
        mainMenu.add(label, c);
        
        thuTextField = new JTextField(14);
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 5;
        mainMenu.add(thuTextField, c);
        
        button = new JButton("X");
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 5;
        button.addActionListener((ActionEvent ae) -> {
            thuTextField.setText(" ");
        } //Action Listener for search JButton
        );
        mainMenu.add(button, c);
        
        label = new JLabel("Fri");
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 6;
        mainMenu.add(label, c);
        
        friTextField = new JTextField(14);
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 6;
        mainMenu.add(friTextField, c);
        
        button = new JButton("X");
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 6;
        button.addActionListener((ActionEvent ae) -> {
            friTextField.setText(" ");
        } //Action Listener for search JButton
        );
        mainMenu.add(button, c);
        
        label = new JLabel("Sat");
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 7;
        mainMenu.add(label, c);
        
        satTextField = new JTextField(14);
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 7;
        mainMenu.add(satTextField, c);
        
        button = new JButton("X");
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 7;
        button.addActionListener((ActionEvent ae) -> {
            satTextField.setText(" ");
        } //Action Listener for search JButton
        );
        mainMenu.add(button, c);
        
        label = new JLabel("Sun");
        //label.setFont (label.getFont ().deriveFont (12.0f));
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 8;
        mainMenu.add(label, c);
        
        sunTextField = new JTextField(14);
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 8;
        mainMenu.add(sunTextField, c);
        
        button = new JButton("X");
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 8;
        button.addActionListener((ActionEvent ae) -> {
            sunTextField.setText(" ");
        } //Action Listener for search JButton
        );
        mainMenu.add(button, c);
        
        button = new JButton("Recipes");
        button.setFont (button.getFont ().deriveFont (15.0f));
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 5;
        button.addActionListener(new ActionListener(){ 
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
        button.addActionListener(new ActionListener(){ 
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
        button.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent ae) {
                //TO DO: Should generate shopping list based on "Generate Plan" JButton, listTextArea.setText("****List Info****") 
            }
        });
        mainMenu.add(button, c);
        
        
        listMenu.setLayout(new GridBagLayout());
        
        button = new JButton("Back");
        button.setFont (button.getFont ().deriveFont (15.0f));
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 0;
        button.addActionListener(new ActionListener(){
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
        
        listTextArea = new JTextArea(25, 20);
        scrollPane = new JScrollPane(listTextArea);
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
        button.addActionListener(new ActionListener(){ 
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
        
        nameTextField = new JTextField(15);
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 2;
        recipeMenu.add(nameTextField, c);
        
        label = new JLabel("Ingredients: ");
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 3;
        recipeMenu.add(label, c);
        
        ingredientsTextArea = new JTextArea(5, 15);
        scrollPane = new JScrollPane(ingredientsTextArea);
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 3;
        recipeMenu.add(scrollPane, c);
        
        button = new JButton("Add");
        button.setFont (button.getFont ().deriveFont (15.0f));
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 3;
        button.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent ae) {
                //TO DO: add new ingredients to new recipe and save with nameTextField.getText() and add to recipe arrayList which will display in recipeTextArea
                //Must have a try catch if recipe already exists. If editing a recipe it should overwrite previous recipe with new ingredients
            }
        });
        recipeMenu.add(button, c);
        
        recipeTextArea = new JTextArea(20, 20);
        textArea.setEditable(false);
        scrollPane = new JScrollPane(recipeTextArea);
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
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                //TO DO: edit selected recipe from recipeTextArea and populate nameTextField with recipe name and ingredientsTextArea with ingredients to edit
            }
        });
        recipeMenu.add(button, c);
        
        button = new JButton("Remove");
        button.setFont (button.getFont ().deriveFont (15.0f));
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 4;
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                //TO DO: remove selected recipe from recipe ArrayList
            }
        });
        recipeMenu.add(button, c);
        
        window.add(mainMenu, "Main Menu");
        window.add(listMenu, "List Menu");
        window.add(recipeMenu, "Recipes Menu");
        
        pane.add(window);
        
    }

    /**
     * Create a window and set the interface.
     */
    public static void buildGUI() {
        frame = new JFrame("Grocery Lister");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(600,375));
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
        frame.setResizable(false);
        GroceryListerGUI gui = new GroceryListerGUI();
        gui.addComponentToPane(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }
    
    /**
     * Read the data file for recipes.
     * @param s
     */
    public void readFile(Scanner s) {
    // used to read from the text file that has the recipe names and ingredients
    }
    
    /**
     * Main method.
     * @param args
     */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                buildGUI();
            }
        });
    }
}

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
    private static JButton button = new JButton();
    private static JLabel label = new JLabel();
    private static JTextField textField = new JTextField();
    /*
    // input area
        JLabel addLabel;
        JLabel nameLabel;
        JLabel ingredientsLabel;
        JTextField nameInput;
        JTextArea ingredientsInput;
        JButton addRecipe;

        // schedule output area
        JLabel scheduleLabel;
        JButton createButton;
        JLabel mondayLabel;
  
        JTextField monday;

        JButton approveScheduleButton;
        
        // grocery list area
        JLabel listLabel;
        JTextArea listArea;
        JButton approveListButton;
     */   
    public static void GroceryLister(Container gui) {
        gui.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        label = new JLabel("Meal Schedule");
        label.setFont (label.getFont ().deriveFont (30.0f));
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 0;
        gui.add(label, c);
 
        button = new JButton("Generate Plan");
        button.setFont (button.getFont ().deriveFont (20.0f));
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 1;
        gui.add(button, c);
        
        label = new JLabel("Mon");
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 2;
        gui.add(label, c);
        
        textField = new JTextField(14);
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 2;
        gui.add(textField, c);
        
        button = new JButton("X");
        //button.setFont(new Font("Arial", Font.PLAIN, 13));
        //button.setPreferredSize(new Dimension(50,50));
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 2;
        gui.add(button, c);
        
        label = new JLabel("Tue");
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 3;
        gui.add(label, c);
        
        textField = new JTextField(14);
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 3;
        gui.add(textField, c);
        
        button = new JButton("X");
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 3;
        gui.add(button, c);
        
        label = new JLabel("Wed");
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 4;
        gui.add(label, c);
        
        textField = new JTextField(14);
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 4;
        gui.add(textField, c);
        
        button = new JButton("X");
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 4;
        gui.add(button, c);
        
        label = new JLabel("Thu");
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 5;
        gui.add(label, c);
        
        textField = new JTextField(14);
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 5;
        gui.add(textField, c);
        
        button = new JButton("X");
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 5;
        gui.add(button, c);
        
        label = new JLabel("Fri");
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 6;
        gui.add(label, c);
        
        textField = new JTextField(14);
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 6;
        gui.add(textField, c);
        
        button = new JButton("X");
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 6;
        gui.add(button, c);
        
        label = new JLabel("Sat");
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 7;
        gui.add(label, c);
        
        textField = new JTextField(14);
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 7;
        gui.add(textField, c);
        
        button = new JButton("X");
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 7;
        gui.add(button, c);
        
        label = new JLabel("Sun");
        //label.setFont (label.getFont ().deriveFont (12.0f));
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 8;
        gui.add(label, c);
        
        textField = new JTextField(14);
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 8;
        gui.add(textField, c);
        
        button = new JButton("X");
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 8;
        gui.add(button, c);
        
        button = new JButton("Recipes");
        button.setFont (button.getFont ().deriveFont (15.0f));
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 5;
        gui.add(button, c);
        
        button = new JButton("List");
        button.setFont (button.getFont ().deriveFont (15.0f));
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 4;
        c.gridy = 5;
        gui.add(button, c);
        
        button = new JButton("Generate Shopping List");
        button.setFont (button.getFont ().deriveFont (15.0f));
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 9;
        gui.add(button, c);
        
    }
    
    public static void buildGUI(){
        //Create and set up the window.
        JFrame frame = new JFrame("Grocery Lister");
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
        //Set up the content pane.
        GroceryLister(frame.getContentPane());
 
        //Display the window.
        
        frame.pack();
        frame.setVisible(true);
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

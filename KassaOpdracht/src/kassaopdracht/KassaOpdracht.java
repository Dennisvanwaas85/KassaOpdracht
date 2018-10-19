/*
 * Copyright (C) CoolKidsKassa, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Written by Leslie Lauw <18151167> and Dennis van Waas <18>, October 2018
 * The Netherlands - The Hague University 
 * Class: 2B 
 * Group: 09
 */
package kassaopdracht;



import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;



/**
 *
 * @author L.A, D.W
 */
public class KassaOpdracht extends javax.swing.JDialog {

    //Variabelen Scopen
    public static int countPizza;
    public static int countPatat;  
    public static int countSnoep;
    public static int countKaas;
    public static int countBier;
    public static int countFruit;
    public static double tussenPrijs;
    public static boolean kortingToepassen;
    public static JTextArea textarea;
    public static double subtotaal;
    public static double kortingSubtotaal;
    public static double btwSubtotaal;
    public static double totaalPrijs;
    public static double totaalPrijsGeenKorting;
    public static double totaalPrijsZonderBtw;
    
    
    //Dit zorgt ervoor dat de decimalen bij bijvoorbeeld doubles niet meer dan 2 wordt
    private static final DecimalFormat df2 = new DecimalFormat(".##");

    
    public static int [] aantalProducten(){
    
        int [] aantalProductenCount;
            
            aantalProductenCount = new int [6];
            aantalProductenCount [0] = countPizza;
            aantalProductenCount [1] = 0;
            aantalProductenCount [2] = countSnoep;
            aantalProductenCount [3] = countKaas;
            aantalProductenCount [4] = countBier;
            aantalProductenCount [5] = countFruit;
            
            return (aantalProductenCount);
    
    }
    
    public static String [] productenLijst(){
        String [] productenLijstje;
            
            productenLijstje = new String [6];
            productenLijstje [0] = "Pizza";
            productenLijstje [1] = "Patat";
            productenLijstje [2] = "Snoep";
            productenLijstje [3] = "Kaas";
            productenLijstje [4] = "Bier";
            productenLijstje [5] = "Fruit";
    
    
    
        return (productenLijstje);
    }
    
    
    //Method die de prijzen van de producten in een array zet
    public static  double [] prijzenArray(){
        double [] prijzenProducten;
        
               prijzenProducten = new double [7];
               prijzenProducten [0] = 6.25;
               prijzenProducten [1] = 2.25;
               prijzenProducten [2] = 2.00;
               prijzenProducten [3] = 1.50;
               prijzenProducten [4] = 2.90;
               prijzenProducten [5] = 3.50;
               
               
       return (prijzenProducten);
    }
    
    //Method die de "prijs tot nu toe" berekend
    public static double tussenPrijzen (){
        
        //Maak je een nieuwe array voor deze method aan, die de prijzen van de prijzenArray() krijgt
        double [] prijzenProducten1;
        prijzenProducten1 = prijzenArray();
        
        tussenPrijs = 
                ((countPizza * prijzenProducten1 [0]) + (countPatat * prijzenProducten1 [1]) + (countSnoep * prijzenProducten1 [2]) + 
                (countKaas * prijzenProducten1 [3]) + (countBier * prijzenProducten1 [4]) + (countFruit * prijzenProducten1[5]));
                
        return tussenPrijs; //tussenprijs = prijs tot nu toe, wordt gereturned. 
    } 


    
    
    /**
     * Creates new form test2
     * @param parent
     * @param modal
     */
    
    
    public KassaOpdracht(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }



    //Deze method initializeerd alle componenten. 
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jTextField1 = new javax.swing.JTextField();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocation(650,250);
        setTitle("  CoolKidsKassa                                                                                by Leslie Lauw & Dennis van Waas 2B09");

        jButton1.setText("Pizza");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Patat");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Snoep");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("AFREKENEN");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Kaas");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Bier");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Fruit");
        jButton7.setToolTipText("");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Merriweather", 1, 36)); // NOI18N

        jLabel1.setText("CoolKidsKassa");
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);

        jToggleButton1.setText("Korting UIT!");
        jToggleButton1.setBackground(new java.awt.Color(255, 0, 0));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        

        jTextArea2.setText("Prijs tot nu toe: € 0.00");
        jTextArea2.setFocusable(false);
        

        


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jToggleButton1)
                            .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>      
    
    //Method die geinitializeerd wordt als er op jButton1 wordt geklikt (dit gebeurt ook voor de andere buttons)
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {  
        
    String [] productenLijsteCall;
    productenLijsteCall = productenLijst();
    
    int [] aantalProductenTelling;
    aantalProductenTelling = aantalProducten();
    
    int input;
    //Er komt een pop-up dialog die de gebruiker een hoeveelheid laat invullen     
    try
    {
       input = Integer.parseInt(JOptionPane.showInputDialog("Gekozen product: " + productenLijsteCall [0]+ " Voer de hoeveelheid in"));
       aantalProductenTelling[0] = aantalProductenTelling[0] + input;
        System.out.println(aantalProductenTelling[0]);
       
       JOptionPane.showMessageDialog(null, "U heeft er " + input + " toegevoegd aan uw winkelwagentje");//Na het invullen krijg je een pop-up message die laat zien hoeveel je er hebt toegevoegd
        jTextArea2.setText("Prijs tot nu toe: €" + (df2.format(tussenPrijzen())));
        jTextArea2.setFocusable(false);
    }
    catch (final NumberFormatException e) //Als je geen cijfer invult (int) krijg je een popup error
    {
        String message = "Vul een hoeveelheid in! (cijfer/nummer)";
            JOptionPane.showMessageDialog(new JFrame(), message, "Error: geen cijfertje ingevult!",
        JOptionPane.ERROR_MESSAGE);
    }

    }      
    
    //Method die geinitializeerd wordt als er op jButton2 wordt geklikt
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {  
        
    String [] productenLijsteCall;
    productenLijsteCall = productenLijst();
    
    int [] aantalProductenTelling;
    aantalProductenTelling = aantalProducten();
    
    int input;
    //Er komt een pop-up dialog die de gebruiker een hoeveelheid laat invullen     
    try
    {
       input = Integer.parseInt(JOptionPane.showInputDialog("Gekozen product: " + productenLijsteCall [1] + ". Voer de hoeveelheid in"));
       aantalProductenTelling[1] = aantalProductenTelling[1] + input;
       JOptionPane.showMessageDialog(null, "U heeft er " + input + " toegevoegd aan uw winkelwagentje"); //Na het invullen krijg je een pop-up message die laat zien hoeveel je er hebt toegevoegd
       jTextArea2.setText("Prijs tot nu toe: €" + (df2.format(tussenPrijzen())));
       jTextArea2.setFocusable(false);
    }
    catch (final NumberFormatException e) //Als je geen cijfer invult (int) krijg je een popup error
    {
        String message = "Vul een hoeveelheid in! (cijfer/nummer)";
            JOptionPane.showMessageDialog(new JFrame(), message, "Error: geen cijfertje ingevult!",
        JOptionPane.ERROR_MESSAGE);
    }
    }
    
    //Method die geinitializeerd wordt als er op jButton3 wordt geklikt
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {  
        
    String [] productenLijsteCall;
    productenLijsteCall = productenLijst();
    
    int [] aantalProductenTelling;
    aantalProductenTelling = aantalProducten();
        
    int input;
    //Er komt een pop-up dialog die de gebruiker een hoeveelheid laat invullen     
    try
    {
       input = Integer.parseInt(JOptionPane.showInputDialog("Gekozen product: " + productenLijsteCall [2] + ". Voer de hoeveelheid in"));
       aantalProductenTelling[2] = aantalProductenTelling[2] + input;
       JOptionPane.showMessageDialog(null, "U heeft er " + input + " toegevoegd aan uw winkelwagentje"); //Na het invullen krijg je een pop-up message die laat zien hoeveel je er hebt toegevoegd
       jTextArea2.setText("Prijs tot nu toe: €" + (df2.format(tussenPrijzen())));
       jTextArea2.setFocusable(false);
    }
    catch (final NumberFormatException e) //Als je geen cijfer invult (int) krijg je een popup error
    {
        String message = "Vul een hoeveelheid in! (cijfer/nummer)";
            JOptionPane.showMessageDialog(new JFrame(), message, "Error: geen cijfertje ingevult!",
        JOptionPane.ERROR_MESSAGE);
    }
        
    }     
    
    //Method die geinitializeerd wordt als er op jButton4 wordt geklikt, deze method wordt gebruitk voor het afreken scherm
    
    public void jButton4ActionPerformed(java.awt.event.ActionEvent evt   ) { 
        
        String [] productenLijsteCall;
        productenLijsteCall = productenLijst();
    
      
        int [] aantalProductenTelling;
        aantalProductenTelling = aantalProducten();
        
        
                double [] prijzenProducten2; //Nieuwe array 
                
                prijzenProducten2 = prijzenArray(); //De prijzenProducten2 array krijgt dezelfde waardes als prijzenArray(), (prijzenArray()method wordt opgeroepen die de prijzenProducten array returned)
        Object[] options1 = {"Volgende Klant"}; //Button die dient als "reset" knop (volgende klant)
        
        //Hier wordt het afrekenscherm gemaakt met daarin een textarea 
        JPanel panel = new JPanel();
        panel.add(new JLabel("Bon"));
        textarea = new JTextArea (15,20);
        textarea.setFocusable(false);
        panel.add(textarea);

        //Berekeningen voor de prijzen
        subtotaal = tussenPrijzen();
        kortingSubtotaal = tussenPrijzen() * 0.10;
        btwSubtotaal = tussenPrijzen() * 0.06;
        double btwOutput = btwSubtotaal; //Deze variables zijn aangemaakt zodat er een decimalformat aan gekoppeld kan worden

        totaalPrijs = (tussenPrijzen() - kortingSubtotaal);
        totaalPrijsGeenKorting = tussenPrijzen();
       
        double totaalPrijsOutput = totaalPrijsGeenKorting;


        //Als korting aan staat komt dit op het bonnetje
        System.out.println(aantalProductenTelling[0]);
        String Enter = "\n";
        if (kortingToepassen ==true){
        textarea.setText(
                (aantalProductenTelling[0] + productenLijsteCall[0] + "            € " + df2.format(aantalProductenTelling[0] * prijzenProducten2[0]))+ Enter+
                (aantalProductenTelling[1] + productenLijsteCall[1] + "            € " + df2.format(countPatat * prijzenProducten2[1]))+ Enter+ 
                (countSnoep + productenLijsteCall[2] + "         € " + df2.format(countSnoep * prijzenProducten2[2]))+ Enter+
                (countKaas + productenLijsteCall[3] + "           € " + df2.format(countKaas * prijzenProducten2[3]))+ Enter+
                (countBier + productenLijsteCall[4] + "              € " + df2.format(countBier * prijzenProducten2[4]))+ Enter+
                (countFruit + productenLijsteCall[5] + "             € " + df2.format(countFruit * prijzenProducten2[5])) + Enter+
                 Enter+
                 Enter+
                "Subtotaal    "+ "          € " + subtotaal + Enter +
                 Enter+
                "Korting 10%       € " + df2.format(kortingSubtotaal) + Enter+
                 Enter+
                "BTW 6%            € " + df2.format(btwSubtotaal) + Enter+
                 Enter+
                "Totale Prijs         € " + df2.format(totaalPrijs)
                );
        
        //Anders komt dit op het bonnetje
        
        }else {
        textarea.setText(
                (countPizza + "       Pizza" + "            € " + df2.format(countPizza * prijzenProducten2[0]))+ Enter+
                (countPatat + "       Patat" + "            € " + df2.format(countPatat * prijzenProducten2[1]))+ Enter+ 
                (countSnoep + "       Snoep" + "         € " + df2.format(countSnoep * prijzenProducten2[2]))+ Enter+
                (countKaas + "       Kaas" + "           € " + df2.format(countKaas * prijzenProducten2[3]))+ Enter+
                (countBier + "       Bier" + "             € " + df2.format(countBier * prijzenProducten2[4]))+ Enter+
                (countFruit + "       Fruit" + "            € " + df2.format(countFruit * prijzenProducten2[5])) + Enter+
                 Enter+
                 Enter+
                "Subtotaal    "+ "          € " + subtotaal + Enter +
                 Enter+
                "Geen Korting       € 0.00" + Enter +
                 Enter+
                "BTW 6%            € " + df2.format(btwOutput) + Enter+
                 Enter+
                "Totale Prijs         € " + df2.format(totaalPrijsOutput)
                );
        
        

        }
        
   int result = JOptionPane.showOptionDialog(null, panel, "Het Bonnetje",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options1, null);
   
      //Als er op "Volgende klant" wordt geklikt worden alle waardes van de hoeveelheden gereset
   
      if (result == JOptionPane.YES_OPTION){
          countPizza = 0;
          countPatat = 0;
          countSnoep = 0;
          countKaas = 0;
          countBier = 0;
          countFruit= 0;
          
          kortingToepassen = false;
          jToggleButton1.setSelected(false);
          jToggleButton1.setText("Korting UIT!");
          jToggleButton1.setBackground(new java.awt.Color(255, 0, 0));
          jTextArea2.setText("Prijs tot nu toe: € 0.00");
          jTextArea2.setFocusable(false);
          JOptionPane.showMessageDialog(null, "Volgende Klant!");
      }
  
    }     
    
    //Method die geinitializeerd wordt als er op jButton5 wordt geklikt
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        
    String [] productenLijsteCall;
    productenLijsteCall = productenLijst();
    
    int [] aantalProductenTelling;
    aantalProductenTelling = aantalProducten();
        
    int input;
    //Er komt een pop-up dialog die de gebruiker een hoeveelheid laat invullen     
    try
    {
       input = Integer.parseInt(JOptionPane.showInputDialog("Gekozen product: " + productenLijsteCall [3] + ". Voer de hoeveelheid in"));
       aantalProductenTelling[3] = aantalProductenTelling[3] + input;
       JOptionPane.showMessageDialog(null, "U heeft er " + input + " toegevoegd aan uw winkelwagentje"); //Na het invullen krijg je een pop-up message die laat zien hoeveel je er hebt toegevoegd
       jTextArea2.setText("Prijs tot nu toe: €" + (df2.format(tussenPrijzen())));
       jTextArea2.setFocusable(false);
    }
    catch (final NumberFormatException e) //Als je geen cijfer invult (int) krijg je een popup error
    {
        String message = "Vul een hoeveelheid in! (cijfer/nummer)";
            JOptionPane.showMessageDialog(new JFrame(), message, "Error: geen cijfertje ingevult!",
        JOptionPane.ERROR_MESSAGE);
    }
    }     
    
    //Method die geinitializeerd wordt als er op jButton6 wordt geklikt
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) { 
        
    String [] productenLijsteCall;
    productenLijsteCall = productenLijst();
    
    int [] aantalProductenTelling;
    aantalProductenTelling = aantalProducten();
        
    int input;
    //Er komt een pop-up dialog die de gebruiker een hoeveelheid laat invullen     
    try
    {
       input = Integer.parseInt(JOptionPane.showInputDialog("Gekozen product: " + productenLijsteCall [4] + ". Voer de hoeveelheid in"));
       aantalProductenTelling[4] = aantalProductenTelling[4] + input;
       JOptionPane.showMessageDialog(null, "U heeft er " + input + " toegevoegd aan uw winkelwagentje"); //Na het invullen krijg je een pop-up message die laat zien hoeveel je er hebt toegevoegd
       jTextArea2.setText("Prijs tot nu toe: €" + (df2.format(tussenPrijzen())));
       jTextArea2.setFocusable(false);
    }
    catch (final NumberFormatException e) //Als je geen cijfer invult (int) krijg je een popup error
    {
        String message = "Vul een hoeveelheid in! (cijfer/nummer)";
            JOptionPane.showMessageDialog(new JFrame(), message, "Error: geen cijfertje ingevult!",
        JOptionPane.ERROR_MESSAGE);
    }
        
    }    
    
    //Method die geinitializeerd wordt als er op jButton7 wordt geklikt
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) { 
        
    String [] productenLijsteCall;
    productenLijsteCall = productenLijst();
    
    int [] aantalProductenTelling;
    aantalProductenTelling = aantalProducten();
    
    int input;
    //Er komt een pop-up dialog die de gebruiker een hoeveelheid laat invullen     
    try
    {
       input = Integer.parseInt(JOptionPane.showInputDialog("Gekozen product: " + productenLijsteCall [5] + ". Voer de hoeveelheid in"));
       aantalProductenTelling[5] = aantalProductenTelling[5] + input;
       JOptionPane.showMessageDialog(null, "U heeft er " + input + " toegevoegd aan uw winkelwagentje"); //Na het invullen krijg je een pop-up message die laat zien hoeveel je er hebt toegevoegd
       jTextArea2.setText("Prijs tot nu toe: €" + (df2.format(tussenPrijzen())));
       jTextArea2.setFocusable(false);
    }
    catch (final NumberFormatException e) //Als je geen cijfer invult (int) krijg je een popup error
    {
        String message = "Vul een hoeveelheid in! (cijfer/nummer)";
            JOptionPane.showMessageDialog(new JFrame(), message, "Error: geen cijfertje ingevult!",
        JOptionPane.ERROR_MESSAGE);
    }
    }  
    
    
    //Method die geinitializeerd wordt als er op jToggleButton1 wordt geklikt
    
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {  
        
        //Korting staat by default uit
        
        kortingToepassen = false;
        jToggleButton1.setBackground(new java.awt.Color(51, 255, 51));
        
        //Als erop geklikt wordt gaat de status aan en wordt de text veranderd op de button
        if (jToggleButton1.isSelected()){
            kortingToepassen = true;
            JOptionPane.showMessageDialog(null, "Korting Toegepast!");
            jToggleButton1.setText("Korting AAN!");
            jToggleButton1.setBackground(new java.awt.Color(51, 255, 51));
            
        //Als er weer op wordt geklikt gaat de status naar uit, ook de kleur en text veranderd. 
        }else {
            jToggleButton1.setBackground(new java.awt.Color(255, 0, 0));
            kortingToepassen = false;
            jToggleButton1.setText("Korting UIT!");
            JOptionPane.showMessageDialog(null, "Korting UIT!");
        }
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                KassaOpdracht dialog = new KassaOpdracht(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                        
                    }
                });
                dialog.setVisible(true);
                
            }
        });
        

        
        
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration                   
}




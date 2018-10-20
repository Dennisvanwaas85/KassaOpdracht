/*
 * Copyright (C) CoolKidsKassa, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Written by Leslie Lauw <18151167> and Dennis van Waas <18>, October 2018
 * The Netherlands - The Hague University 
 * Class: 2B 
 * Group: 09
 */
package kassaopdracht;

import java.awt.event.ActionEvent;
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
    public static double tussenPrijs;
    public static boolean kortingToepassen;
    public static JTextArea textarea;
    public static double subtotaal;
    public static double kortingSubtotaal;
    public static double btwSubtotaal;
    public static double totaalPrijs;
    public static double totaalPrijsGeenKorting;
    public static double totaalPrijsZonderBtw;

    //De productnamen worden in een array gezet met 6 elementen
    public String[] productNaam = {"Pizza", "Patat", "Snoep", "Kaas", "Bier", "Fruit"};

    //De productprijzen worden in een array gezet met 6 elementen
    public double[] productPrijzen = {6.25, 2.25, 2.00, 1.50, 2.90, 3.50};

    //Array aantalProducten met 6 waardes die beginnen op 0.
    public int[] aantalProducten = {0, 0, 0, 0, 0, 0};

    //Getter van de array productNaam
    public String[] getProductNaam() {
        return productNaam;
    }

    //Getter van de array productPrijzen
    public double[] getProductPrijzen() {
        return productPrijzen;
    }

    //Getter van de array aantalProducten
    public int[] getAantalProducten() {
        return aantalProducten;
    }

    //Setter van de array aantalProducten, aantalProducten array wordt meegegeven

    public void setAantalProducten(int[] aantalProducten) {
        this.aantalProducten = aantalProducten;
    }

    //Methode die het ingevoerde aantal toevoegd aan de daarvoor bestemde "element" van de array aantalProducten
    public void toevoegenAantalProducten(int element, int aantal) {
        int[] aantalTotaal = getAantalProducten(); //Nieuwe array aantalTotaal word hetzelfde als de array aantalProducten
        aantalTotaal[element] = aantalTotaal[element] + aantal; //Uit de array aantalTotaal met element [0-5] (staat voor aantalProducten array [0-5])
        setAantalProducten(aantalTotaal); //De setter krijgt de waarde van de array aantalTotaal

    }

    //Dit zorgt ervoor dat de decimalen bij bijvoorbeeld doubles niet meer dan 2 wordt
    private static final DecimalFormat df2 = new DecimalFormat(".##");

    //Method die de "prijs tot nu toe" berekend
    public double tussenPrijzen() {

        //Tussenprijs vraagt van de getter van de array aantalProducten het aantalproducten op met element [0-5]uit de array 
        //En ook vraagt tussenprijs de getter van de array productPrijzen de prijs op van element [0-5] uit de array
        tussenPrijs
                = ((getAantalProducten()[0] * getProductPrijzen()[0]) + (getAantalProducten()[1] * getProductPrijzen()[1]) + (getAantalProducten()[2] * getProductPrijzen()[2])
                + (getAantalProducten()[3] * getProductPrijzen()[3]) + (getAantalProducten()[4] * getProductPrijzen()[4]) + (getAantalProducten()[5] * getProductPrijzen()[5]));

        return tussenPrijs; //tussenprijs = prijs tot nu toe, wordt gereturned. 
    }

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

        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocation(650, 250);
        setTitle("  CoolKidsKassa                                                                                by Leslie Lauw & Dennis van Waas 2B09");

        jButton1.setText("Pizza");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Patat");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Snoep");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            @Override
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
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Bier");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Fruit");
        jButton7.setToolTipText("");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            @Override
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
            @Override
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

    //Methode die voor elke button geldt, het enigste dat veranderd is element [0-5]
    private void methodeButtonAction(int element) {

        try {
            int aantal = Integer.parseInt(JOptionPane.showInputDialog("Gekozen product: " + getProductNaam()[element] + ". Voer de hoeveelheid in"));
            toevoegenAantalProducten(element, aantal);

            JOptionPane.showMessageDialog(null, "U heeft er " + aantal + " toegevoegd aan uw winkelwagentje"); //Na het invullen krijg je een pop-up message die laat zien hoeveel je er hebt toegevoegd
            jTextArea2.setText("Prijs tot nu toe: €" + (df2.format(tussenPrijzen()))); //Prijs tot nu toe wordt geupdate na elke toevoeging
            jTextArea2.setFocusable(false);

        } catch (final NumberFormatException e) //Als je geen cijfer invult (int) krijg je een popup error
        {
            String message = "Vul een hoeveelheid in en geen letter! (cijfer/nummer)";
            JOptionPane.showMessageDialog(new JFrame(), message, "Error: geen cijfertje ingevult!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    // Pizza Button met element 0 uit de arrays bij methodeButtonAction
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        methodeButtonAction(0);
    }

    // Patat Button met element 1 uit de arrays bij methodeButtonAction
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        methodeButtonAction(1);
    }

    // Snoep Button met element 2 uit de arrays bij methodeButtonAction
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        methodeButtonAction(2);
    }

    //Method die geinitializeerd wordt als er op jButton4 wordt geklikt, deze method wordt gebruitk voor het afreken scherm
    public void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {

        Object[] options1 = {"Volgende Klant"}; //Button die dient als "reset" knop (volgende klant)

        //Hier wordt het afrekenscherm gemaakt met daarin een textarea 
        JPanel panel = new JPanel();
        panel.add(new JLabel("Bon"));
        textarea = new JTextArea(15, 20);
        textarea.setFocusable(false);
        panel.add(textarea);

        //Berekeningen voor de prijzen op het bonnetje
        subtotaal = tussenPrijzen();
        kortingSubtotaal = tussenPrijzen() * 0.10;
        btwSubtotaal = tussenPrijzen() * 0.06;
        double btwOutput = btwSubtotaal; //Deze variables zijn aangemaakt zodat er een decimalformat aan gekoppeld kan worden

        totaalPrijs = (tussenPrijzen() - kortingSubtotaal);
        totaalPrijsGeenKorting = tussenPrijzen();

        double totaalPrijsOutput = totaalPrijsGeenKorting;

        //Als korting aan staat komt dit op het bonnetje
        String Enter = "\n";
        if (kortingToepassen == true) {
            textarea.setText(
                    (getAantalProducten()[0] + " " + getProductNaam()[0] + "            € " + df2.format(getAantalProducten()[0] * getProductPrijzen()[0])) + Enter
                    + (getAantalProducten()[1] + " " + getProductNaam()[1] + "            € " + df2.format(getAantalProducten()[1] * getProductPrijzen()[1])) + Enter
                    + (getAantalProducten()[2] + " " + getProductNaam()[2] + "         € " + df2.format(getAantalProducten()[2] * getProductPrijzen()[2])) + Enter
                    + (getAantalProducten()[3] + " " + getProductNaam()[3] + "           € " + df2.format(getAantalProducten()[3] * getProductPrijzen()[3])) + Enter
                    + (getAantalProducten()[4] + " " + getProductNaam()[4] + "              € " + df2.format(getAantalProducten()[4] * getProductPrijzen()[4])) + Enter
                    + (getAantalProducten()[5] + " " + getProductNaam()[5] + "             € " + df2.format(getAantalProducten()[5] * getProductPrijzen()[5])) + Enter
                    + Enter
                    + Enter
                    + "Subtotaal    " + "          € " + subtotaal + Enter
                    + Enter
                    + "Korting 10%       € " + df2.format(kortingSubtotaal) + Enter
                    + Enter
                    + "BTW 6%            € " + df2.format(btwSubtotaal) + Enter
                    + Enter
                    + "Totale Prijs         € " + df2.format(totaalPrijs)
            );

        //Anders komt dit op het bonnetje
        } else {
            textarea.setText(
                    (getAantalProducten()[0] + " " + getProductNaam()[0] + "            € " + df2.format(getAantalProducten()[0] * getProductPrijzen()[0])) + Enter
                    + (getAantalProducten()[1] + " " + getProductNaam()[1] + "            € " + df2.format(getAantalProducten()[1] * getProductPrijzen()[1])) + Enter
                    + (getAantalProducten()[2] + " " + getProductNaam()[2] + "         € " + df2.format(getAantalProducten()[2] * getProductPrijzen()[2])) + Enter
                    + (getAantalProducten()[3] + " " + getProductNaam()[3] + "           € " + df2.format(getAantalProducten()[3] * getProductPrijzen()[3])) + Enter
                    + (getAantalProducten()[4] + " " + getProductNaam()[4] + "             € " + df2.format(getAantalProducten()[4] * getProductPrijzen()[4])) + Enter
                    + (getAantalProducten()[5] + " " + getProductNaam()[5] + "            € " + df2.format(getAantalProducten()[5] * getProductPrijzen()[5])) + Enter
                    + Enter
                    + Enter
                    + "Subtotaal    " + "          € " + subtotaal + Enter
                    + Enter
                    + "Geen Korting       € 0.00" + Enter
                    + Enter
                    + "BTW 6%            € " + df2.format(btwOutput) + Enter
                    + Enter
                    + "Totale Prijs         € " + df2.format(totaalPrijsOutput)
            );

        }

        int result = JOptionPane.showOptionDialog(null, panel, "Het Bonnetje",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options1, null);

      //Als er op "Volgende klant" wordt geklikt worden alle waardes van de hoeveelheden gereset
        if (result == JOptionPane.YES_OPTION) {
            getAantalProducten()[0] = 0;
            getAantalProducten()[1] = 0;
            getAantalProducten()[2] = 0;
            getAantalProducten()[3] = 0;
            getAantalProducten()[4] = 0;
            getAantalProducten()[5] = 0;

            kortingToepassen = false;
            jToggleButton1.setSelected(false);
            jToggleButton1.setText("Korting UIT!");
            jToggleButton1.setBackground(new java.awt.Color(255, 0, 0));
            jTextArea2.setText("Prijs tot nu toe: € 0.00");
            jTextArea2.setFocusable(false);
            JOptionPane.showMessageDialog(null, "Volgende Klant!");
        }

    }

    // Kaas Button met element 3 uit de arrays bij methodeButtonAction
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        methodeButtonAction(3);
    }
    
    // Bier Button met element 4 uit de arrays bij methodeButtonAction
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {

        methodeButtonAction(4);

    }

    // Fruit Button met element 5 uit de arrays bij methodeButtonAction
    private void jButton7ActionPerformed(ActionEvent e) {

        methodeButtonAction(5);
    }

    //Method die geinitializeerd wordt als er op jToggleButton1 wordt geklikt
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        //Korting staat by default uit
        kortingToepassen = false;
        jToggleButton1.setBackground(new java.awt.Color(51, 255, 51));

        //Als erop geklikt wordt gaat de status aan en wordt de text veranderd op de button
        if (jToggleButton1.isSelected()) {
            kortingToepassen = true;
            JOptionPane.showMessageDialog(null, "Korting Toegepast!");
            jToggleButton1.setText("Korting AAN!");
            jToggleButton1.setBackground(new java.awt.Color(51, 255, 51));

            //Als er weer op wordt geklikt gaat de status naar uit, ook de kleur en text veranderd. 
        } else {
            jToggleButton1.setBackground(new java.awt.Color(255, 0, 0));
            kortingToepassen = false;
            jToggleButton1.setText("Korting UIT!");
            JOptionPane.showMessageDialog(null, "Korting UIT!");
        }

    }

    public static void main(String args[]) {

        //Creeërt en laat de dialog zien
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

    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration                   
}

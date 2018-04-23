

package romaRakamları;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Büşra Aydemir
 */
public class AnaEkran extends JFrame implements ActionListener, WindowListener  {
    
    
    JTextField rakam1Text = new JTextField(10) ;
    JTextField rakam2Text = new JTextField(10) ;
    JTextField sonucText = new JTextField(10) ;
    JButton toplaButon ;
    JLabel label1, label2, labelSonuc ;
    
    
    public AnaEkran(){
        
        super("Roma Rakamları") ;
        
        label1 = new JLabel("1. Roma Rakamını Girin: ") ;
        label2 = new JLabel("2. Roma Rakamını Girin: ") ;
        labelSonuc = new JLabel("Sonuç: ") ;
        
        toplaButon = new JButton("Topla") ;
        toplaButon.addActionListener(this);
        
        setLayout(new FlowLayout()) ;
        addWindowListener(this) ;
        
        add(label1) ;
        add(rakam1Text) ;
        add(label2) ;
        add(rakam2Text) ;
        add(labelSonuc) ;
        add(sonucText) ;
        add(toplaButon) ;
        
        
        
        
        Container con = getContentPane() ;
        con.setBackground(Color.LIGHT_GRAY);
        
        Font font1 = new Font("TimesRoman",Font.ITALIC, 18);
        Font font2 = new Font("TimesRoman",Font.BOLD, 18);
        
        label1.setForeground(Color.BLACK);
        label1.setFont(font1);
        label2.setForeground(Color.BLACK);
        label2.setFont(font1);
        labelSonuc.setForeground(Color.BLACK);
        labelSonuc.setFont(font1);
        
        toplaButon.setBackground(Color.RED);
        toplaButon.setFont(font2);
        
        rakam1Text.setFont(font2);
        rakam2Text.setFont(font2);
        sonucText.setFont(font2);
        
    }
    
    
    
    public void actionPerformed(ActionEvent e) {
        
        Toplama sonuc = new Toplama(rakam1Text.getText(), rakam2Text.getText()) ;
        String romaRakamı = sonuc.toplamString ;
        int toplam = sonuc.toplamInt ;
        sonucText.setText(romaRakamı + " ( " + toplam + " ) ");
    }
    
    public void windowClosing(WindowEvent e) {
        dispose() ;
        System.exit(0) ;
    }
    
    public void windowOpened(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
}

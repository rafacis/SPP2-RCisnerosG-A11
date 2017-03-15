/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.rcisnerosg.a11;
import java.awt.*;
/**
 *
 * @author Rafael
 */
public class ventana2 extends Frame {
    private final Button btnNorte, btnSur, btnEste, btnOeste, btnCentro;
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public ventana2 (){
        super("Border Layout");
        setLayout(new BorderLayout());
        
        btnNorte = new Button("North");
        add (btnNorte,BorderLayout.NORTH);
        
        btnSur = new Button ("South");
        add (btnSur,BorderLayout.SOUTH);
        
        btnEste = new Button ("East");
        add (btnEste,BorderLayout.EAST);
        
        btnOeste = new Button ("West");
        add (btnOeste,BorderLayout.WEST);
        
        btnCentro = new Button ("Center");
        add (btnCentro,BorderLayout.CENTER);
        
        setSize(800,600);
        setVisible(true);
    }
}

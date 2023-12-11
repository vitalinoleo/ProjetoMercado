package app.View;


import javax.swing.JFrame;

public class PainelPrincipal extends JFrame {

    public PainelPrincipal() {
        super();
        MercadoApp obj = new MercadoApp();
        this.add (obj);

    }
    public void run (){
        setDefaultCloseOperation(2);
        pack();
        setVisible(true);

    }
}

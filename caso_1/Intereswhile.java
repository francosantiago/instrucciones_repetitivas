package caso_1;

import javax.swing.JOptionPane;

public class Intereswhile 
{
    public static void main(String[] args) 
    {
        int c1;
        int c2;
        int c3;
        int meses;

        c1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una cantidad para c1: "));
        c2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una cantidad para c2: "));
        c3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que deben tener: "));
        meses = 0;

        while (c1 + c2 < c3) 
        {
            c1 += (c1 * 0.03);
            c2 += (c2 * 0.04);
            meses++;
        }

        JOptionPane.showMessageDialog(null,
                "Para alcanzar el capital deseado de " + c3 + " pesos, se tardarían un total de " + meses + " meses.");
        System.exit(0);
    }
}

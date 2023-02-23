package caso_3;

import javax.swing.JOptionPane;

public class NumerosPrimos 
{
    public static void main(String[] args) 
    {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número entero positivo:"));
        boolean esPrimo = true;
        int divisor = 2;
        
        while(divisor <= numero/2 && esPrimo) 
        {
            if(numero % divisor == 0) 
            {
                esPrimo = false;
            }
            divisor++;
        }
        
        if(esPrimo) 
        {
            JOptionPane.showMessageDialog(null, numero + " es un número primo.");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, numero + " no es un número primo.");
        }
    }
}

package caso_2;

import javax.swing.JOptionPane;

public class Factorial 
{
  public static void main(String[] args) 
  {
    int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero y positivo: "));

    int factorial = 1;
    for (int i = 1; i <= n; i++) 
    {
      factorial *= i;
    }

    JOptionPane.showMessageDialog(null, "El factorial de " + n + " es " + factorial);
  }
}

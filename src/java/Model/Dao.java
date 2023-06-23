/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author thaiscarvalho
 */
public class Dao {
    
        public double CalculaValor(ModelImc imc) {
        double res;

        if (imc.getG().equals("h")) {
            res = ((72.7 * imc.getH()) - 58);
        } else {
            res = ((62.1 * imc.getH()) - 44.7);
        }

        return res;

    }
   
    
    
    public int SomarValor(CalculadoraModel soma){
      int res = soma.getValor1() + soma.getValor2();
      return res;
    }
        
    public int SubtrairValor(CalculadoraModel subtracao){
      int res = subtracao.getValor1() - subtracao.getValor2();
      return res;
    }
            
    public int DividirValor(CalculadoraModel divisao){
      int res = divisao.getValor1() / divisao.getValor2();
      return res;
    }
    
    public int MultiplicarValor(CalculadoraModel multi){
      int res = multi.getValor1() * multi.getValor2();
      return res;
    }
}

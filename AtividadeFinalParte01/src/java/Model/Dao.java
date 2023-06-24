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

        if (imc.getG().equals("homem")) {
            res = ((72.7 * imc.getH()) - 58);
        } else {
            res = ((62.1 * imc.getH()) - 44.7);
        }

        return res;

    }
    
    public double conta(ModelCalculadora operacao) {

            double res = 0;

            switch (operacao.getOperacao()) {
                case "+" -> res = operacao.getValor1() + operacao.getValor2();
                case "-" -> res = operacao.getValor1() - operacao.getValor2();
                case "*" -> res = operacao.getValor1() * operacao.getValor2();
                case "/" -> res =  operacao.getValor1() / operacao.getValor2();
                default -> {
                }
            }
           return res;
        }
    
    
    public double calcTrapezio(ModelTrapezio trapezio) {
        double area = ((trapezio.getbMaior() + trapezio.getbMenor())* trapezio.getA())/2 ;
       return area;
    }
     
     public double calcRetangulo(ModelRetangulo retangulo) {
        double volume = (retangulo.getComprimento() * retangulo.getLargura() * retangulo.getAltura());
       return volume;
    }
}

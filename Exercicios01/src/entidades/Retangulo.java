package entidades;

public class Retangulo {

    /*Atributos*/
    public double altura;
    public double largura;

    /*Métodos*/

    public double area(){
        return altura * largura;
    }

    public double perimetro(){
        return 2 * (altura + largura);
    }

    public double diagonal(){
        return Math.sqrt(altura*altura+largura*largura);
    }
}

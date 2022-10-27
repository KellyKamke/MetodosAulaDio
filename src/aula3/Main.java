package aula3;

public class Main {

    public static void main(String[] args) {

        // Retornos
        System.out.println("Exercício retornos");

        double areaQuadrado = Quadrilátero.area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = Quadrilátero.area(5,5);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = Quadrilátero.area(7,8,9);
        System.out.println("Área do trapézio:" + areaTrapezio);

    }
}

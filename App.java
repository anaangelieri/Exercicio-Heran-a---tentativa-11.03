public class App {
    public static void main(String[] args) throws Exception {
        Quadrado quadrado = new Quadrado("Quadrado", 2, 6, 6);
        quadrado.print();

        TrianguloEquilatero triangulo = new TrianguloEquilatero("Triângulo Equilátero", 2, 6, 6);
        triangulo.print();

        Cubo cubo = new Cubo("Cubo", 3, 6, 6, 6);
        cubo.print();

        Tetraedro tetraedro = new Tetraedro("Tetraedro", 3, 4.899, 6, 5.1962);
        tetraedro.print();
    }
}

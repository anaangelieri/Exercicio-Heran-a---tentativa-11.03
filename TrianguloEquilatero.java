public class TrianguloEquilatero extends Bidimensional{
    private double comprimento;
    private double largura;

    public TrianguloEquilatero (String nome, int dimensao, double comprimento, double largura){
        super(nome, dimensao, comprimento, largura);
        double alturaCorrigida = Math.sqrt(3) / 2 * largura;
        if (comprimento != alturaCorrigida) {
            System.out.println("Altura diferente do esperado para um triângulo equilátero.");
            comprimento = alturaCorrigida;
        }
    }

    public double getComprimento(){
        return comprimento;
    }

    public void setComprimento(double comprimento){
        this.comprimento = comprimento;
    }

    public double getLargura(){
        return largura;
    }

    public void setAltura(double largura){
        this.largura = largura;
    }

    public double area() {
        return (getLargura() * getComprimento()) / 2;
    }

    public void print(){
        System.out.println("Forma: " + getNome());
        System.out.println("Dimensão: " + getDimensao());
        System.out.println("Altura = Largura = Profundidade = " + getLargura());
        System.out.println("Área = " + area());
    }
}
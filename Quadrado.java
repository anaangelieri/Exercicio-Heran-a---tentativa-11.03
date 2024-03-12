public class Quadrado extends Bidimensional{
    private double comprimento;
    private double largura;

    public Quadrado (String nome, int dimensao, double comprimento, double largura){
        super(nome, dimensao, comprimento, largura);
        if (comprimento != largura){
            System.out.println("Comprimento diferente da largura!");
            setComprimento(largura);
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
        return getComprimento() * getLargura();
    }

    public void print() {
        super.print();
        System.out.println("Área = " + area());
    }
}

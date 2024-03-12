public abstract class Bidimensional extends Forma{
    private double comprimento;
    private double largura;

    public Bidimensional(String nome, int dimensao, double comprimento, double largura){
        super(nome, dimensao);
        this.comprimento = comprimento;
        this.largura = largura;
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

    public void setLargura(double largura){
        this.largura = largura;
    }

    public double getArea(){
        return area();
    }

    public String toString(){
        return "Nome: " + this.getNome() + "\nDimensão: " + this.getDimensao() + "\nComprimento: " + comprimento + "\nLargura: " + largura;
    }

    abstract double area();
}

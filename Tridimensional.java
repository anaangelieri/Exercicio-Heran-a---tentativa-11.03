public abstract class Tridimensional extends Forma{
    private double largura;
    private double profundidade;
    private double altura;

    public Tridimensional (String nome, int dimensao, double largura, double profundidade, double altura){
        super(nome, dimensao);
        this.largura = largura;
        this.profundidade = profundidade;
        this.altura = altura;
    }

    public double getLargura(){
        return largura;
    }

    public void setLargura(double largura){
        this.largura = largura;
    }

    public double getProfundidade(){
        return profundidade;
    }

    public void setProfundidade(double profundidade){
        this.profundidade = profundidade;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public String toString(){
        return "Nome: " + this.getNome() + "\nDimensão: " + this.getDimensao() + "\nAltura: " + altura + "\nProfundidade: " + profundidade + "\nLargura: " + largura;
    }

    public abstract double volume();
}

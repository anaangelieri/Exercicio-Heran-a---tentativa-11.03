public abstract class Forma {
    private String nome;
    private int dimensao;

    public Forma (String nome, int dimensao){
        this.nome = nome;
        this.dimensao = dimensao;
    }
    
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getDimensao(){
        return dimensao;
    }

    public void setDimensao(int dimensao){
        this.dimensao = dimensao;
    }

    public String toString(){
        return "Nome: " + nome +  "Dimensão: " + dimensao;
    }
}
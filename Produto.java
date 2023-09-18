public class Produto {
    private String produtoNome;
    private double produtoValor;
    private int produtoID;

    public Produto(String produtoNome, double produtoValor, int produtoID) {
        this.produtoNome = produtoNome;
        this.produtoValor = produtoValor;
        this.produtoID = produtoID;
    }

    public String getProdutoNome() {
        return this.produtoNome;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }

    public double getProdutoValor() {
        return this.produtoValor;
    }

    public void setProdutoValor(double produtoValor) {
        this.produtoValor = produtoValor;
    }

    public int getProdutoID() {
        return this.produtoID;
    }

    public void setProdutoID(int produtoID) {
        this.produtoID = produtoID;
    }

    
    
}
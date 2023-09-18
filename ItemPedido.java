public class ItemPedido {
    private Produto itemProduto;
    private double itemQuantidade;


    public Produto getItemProduto() {
        return this.itemProduto;
    }

    public void setItemProduto(Produto itemProduto) {
        this.itemProduto = itemProduto;
    }

    public double getItemQuantidade() {
        return this.itemQuantidade;
    }

    public void setItemQuantidade(double itemQuantidade) {
        this.itemQuantidade = itemQuantidade;
    }

    public ItemPedido(Produto itemProduto, double itemQuantidade) {
        this.itemProduto = itemProduto;
        this.itemQuantidade = itemQuantidade;
    }




    



}
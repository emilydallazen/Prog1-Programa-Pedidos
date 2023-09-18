public class Pedido {
    private ItemPedido pedidoItens[];
    private double pedidoTotal;


    public Pedido(int quantProdutos) {
        this.setPedidoItens(new ItemPedido[quantProdutos]);
        this.setPedidoTotal(0);
    }

    public ItemPedido getPedidoItens[]() {
        return this.pedidoItens[];
    }

    public void setPedidoItens[](ItemPedido pedidoItens[]) {
        this.pedidoItens[] = pedidoItens[];
    }

    public double getPedidoTotal() {
        return this.pedidoTotal;
    }

    public void setPedidoTotal(double pedidoTotal) {
        this.pedidoTotal = pedidoTotal;
    }
    public void adicionarItem(ItemPedido pedido) {
        
        for(int i = 0; i < this.getPedidoItens().length; i++) {
            if(this.getPedidoItens()[i] == null) {
                this.getPedidoItens()[i] = pedido;
                break;
            }
        }
        
        double newVal = this.getPedidoTotal() + (pedido.getItemProduto().getProdutoValor() * pedido.getItemQuantidade());
        this.setValorTotal(newVal);
        
    }
    
    public void obterTotal() {
        System.out.println("Valor Total: " + this.getPedidoTotal());
        System.out.println();
    }
    
    public void carrinho() {
        
        System.out.println("Carrinho: ");
        
        if(this.getPedidoItens()[0] == null) {
            System.out.println("Você não possui itens no carrinho.");
            return;
        }
        
        for(int i = 0; i < this.getPedidoItens().length; i++) {
            System.out.println("Item: " + this.getPedidoItens()[i].getItemProduto().getProdutoNome());
            System.out.println("Quantidade: " + this.getPedidoItens()[i].getItemQuantidade());
            System.out.println("Preço dos itens: " + (this.getPedidoItens()[i].getItemQuantidade() * this.getPedidoItens()[i].getItemProduto().getProdutoValor()));
            System.out.println("Preço individual: " + this.getPedidoItens()[i].getItemProduto().getProdutoValor());
            System.out.println("------------------------------");
        }
        
        this.obterTotal();
    }
}



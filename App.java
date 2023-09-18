public class App {
    public static void main(String[] args) throws Exception {
        Produto chocolate = new Produto(1, 3, "Chocolate Trento");
        Produto refri = new Produto(2, 7, "Refrigerante Guaraná 600ml");
        Produto salgadinho = new Produto(3, 10, "Salgadinho Doritos");
        
        Pedido comanda = new Pedido(3);
        comanda.carrinho();
        
        comanda.adicionarItem(new ItemPedido(chocolate, 2));
        comanda.adicionarItem(new ItemPedido(refri, 1));
        comanda.adicionarItem(new ItemPedido(salgadinho, 1));
    
        System.out.println("---------- ITENS NA COMANDA -----------");
        
        comanda.carrinho();
    }
}

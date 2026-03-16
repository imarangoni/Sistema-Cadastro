import java.util.ArrayList;
import java.util.Scanner;
 
public class SistemaCadastro {
 
    ArrayList<Produto> listaProdutos = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
 
    public void cadastrarProduto() {
 
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.next();
 
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
 
        Produto produto = new Produto(nome, preco);
 
        listaProdutos.add(produto);
 
        System.out.println("Produto cadastrado com sucesso!");
    }
 
    public void listarProdutos() {
 
        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
 
            System.out.println("\nLista de produtos:");
 
            for (Produto p : listaProdutos) {
                p.exibirProduto();
            }
        }
    }
}

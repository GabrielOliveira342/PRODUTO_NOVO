//import localDate
import java.time.LocalDate;
//class main 
public class Main {
    public static void main(String[] args) {
        // Criando um produto com todas as informações
        Produto_novo produtoCompleto = new Produto_novo("Teclado", 50.0, 70.0, LocalDate.of(2024, 1, 10), LocalDate.of(2024, 3, 10));
        System.out.println(produtoCompleto);

        // Criando um produto sem a data de validade
        Produto_novo produtoSemValidade = new Produto_novo("Mouse", 40.0, 60.0, LocalDate.of(2024, 1, 15));
        System.out.println(produtoSemValidade);

        // Criando um produto apenas com nome e preço de custo, e calculando os demais valores automaticamente
        Produto_novo produtoSimples = new Produto_novo("Fone de Ouvido", 30.0);
        System.out.println(produtoSimples);
    }
}
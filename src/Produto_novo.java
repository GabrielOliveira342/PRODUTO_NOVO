//import localData 
import java.time.LocalDate;

//class produto novo 
	public class Produto_novo {

		String nome;
		double preco_custo;
		double preco_venda;
		LocalDate data_fabricacao;
		LocalDate data_validade;
//Contrutores com todos os atributos 
		public Produto_novo(String nome, double preco_custo, double preco_venda, LocalDate data_fabricacao, LocalDate data_validade) {
			this.nome = nome;
			this.preco_custo = preco_custo;
			this.preco_venda = preco_venda;
			this.data_fabricacao = data_fabricacao;
			this.data_validade = data_validade;
		}
//Construtor com a validade de um 1 mes
		public Produto_novo(String nome, double preco_custo, double preco_venda, LocalDate data_fabricacao) {	
			this.nome = nome;
			this.preco_custo = preco_custo;
			this.preco_venda = preco_venda;
			this.data_fabricacao = data_fabricacao;
			this.data_validade = data_fabricacao.plusMonths(1);
		}
//Contrutor calcula o preço de venda e validade com base apenas no nome e preço de custo	
		public Produto_novo(String nome, double preco_custo) {	
			this.nome = nome;
			this.preco_custo = preco_custo;
			this.preco_venda = preco_custo + (preco_custo * 10/100); //calcula o preço com 10%
			this.data_fabricacao = LocalDate.now(); //data de fabricaçao com a atual 
			this.data_validade = data_fabricacao.plusMonths(1); // define validade 1 mes após 
		}

//Metodos de acesso dos atributos pelo getters e setters 
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getPreco_custo() {
			return preco_custo;
		}

		public void setPreco_custo(double preco_custo) {
			this.preco_custo = preco_custo;
		}

		public double getPreco_venda() {
			return preco_venda;
		}

		public void setPreco_venda(double preco_venda) {
			this.preco_venda = preco_venda;
		}

		public LocalDate getData_fabricacao() {
			return data_fabricacao;
		}

		public void setData_fabricacao(LocalDate data_fabricacao) {
			this.data_fabricacao = data_fabricacao;
		}

		public LocalDate getData_validade() {
			return data_validade;
		}

		public void setData_validade(LocalDate data_validade) {
			this.data_validade = data_validade;
		}
//metodo para exibir as infromações 
		@Override
		public String toString() {
			return "Produto Nome: " + nome + ", Preço de custo: " + preco_custo + ", Preço de venda: " + preco_venda
					+ ", data da fabricação: " + data_fabricacao + ", data de validade: " + data_validade + " ";
		}

	}



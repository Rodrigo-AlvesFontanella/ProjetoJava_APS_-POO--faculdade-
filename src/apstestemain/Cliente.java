package apstestemain;

/**
 *
 * @author luana
 */
public class Cliente {
    
    //Atributos
    private static int cod=1;
    private String nome;
    private String telefone;
    private Endereco endereco;
    
    //Constutor
    public Cliente(int cod, String nome, String telefone, Endereco endereco) {
        this.cod = gerarCodigo();
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    //acessores e modificadores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public static int getCod() {
        return cod;
    }

    public static int gerarCodigo(){
       return cod++;
    }
    
    public void exibirCliente(){
        System.out.println("Código: " +gerarCodigo());
        System.out.println("Nome: " +getNome());
        System.out.println("Telefone: " +getTelefone());
        System.out.println("Rua: " +endereco.getRua() + ", " + endereco.getNumero());
        System.out.println("Cidade: " +endereco.getCidade());
        System.out.println("CEP: " + endereco.getCep());
    }
    
}

package apstestemain;
/**
 *
 * @author luana
 */
public class Automovel extends Cliente{
   
    //Atributos
    private String modelo;
    private String cor;
    private String marca;
   
    //Construtor

    public Automovel(String modelo, String cor, String marca, int cod, String nome, String telefone, Endereco endereco) {
        super(cod, nome, telefone, endereco);
        this.modelo = modelo;
        this.cor = cor;
        this.marca = marca;
    }
   
    
    //assessores e modificadores
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    @Override
    public void exibirCliente(){
        super.exibirCliente();
        if(!getCor().equals("") && !getMarca().equals("") && !getModelo().equals("")){
            System.out.println("Marca: " +getMarca());
            System.out.println("Modelo: " +getModelo());
            System.out.println("Cor: " +getCor());
        }
        
    }
    
}

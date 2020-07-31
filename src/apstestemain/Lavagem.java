package apstestemain;

/**
 *
 * @author luana
 */
public class Lavagem extends Cliente{

    private double qtdHoras;
    private double valorLav;

    //Construtor
 
    public Lavagem( int cod, String nome, String telefone, Endereco endereco) {
        super(cod, nome, telefone, endereco);

    }

    public double getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(double qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public double getValorLav() {
        return valorLav;
    }

    public void setValorLav(double valorLav) {
        this.valorLav = valorLav;
    }

    public double valorServicos() {
        
        if (getQtdHoras() != 0 && getValorLav() != 0) {
            return (getQtdHoras() * 5) + getValorLav();

        } else if (getQtdHoras() != 0) {
            return getQtdHoras() * 5;

        } else {
            return getValorLav();
        }
    }

}

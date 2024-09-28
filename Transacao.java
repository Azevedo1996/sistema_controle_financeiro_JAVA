import java.util.Date;

public class Transacao {
    private String descricao;
    private double valor;
    private Date data;
    private TipoTransacao tipo;

    public Transacao(String descricao, double valor, TipoTransacao tipo) {
        this.descricao = descricao;
        this.valor = valor;
        this.data = new Date();  // Data da transação é a data atual
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public Date getData() {
        return data;
    }

    public TipoTransacao getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Transacao: " + descricao + ", Valor: " + valor + ", Data: " + data + ", Tipo: " + tipo;
    }
}

enum TipoTransacao {
    ENTRADA, SAIDA
}

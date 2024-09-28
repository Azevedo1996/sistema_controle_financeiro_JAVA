import java.util.ArrayList;
import java.util.List;

public class FundoComunitario {
    private double saldo;
    private List<Transacao> transacoes;

    public FundoComunitario() {
        this.saldo = 0.0;
        this.transacoes = new ArrayList<>();
    }

    // Registrar uma nova transação (entrada ou saída)
    public void registrarTransacao(Transacao transacao) {
        if (transacao.getTipo() == TipoTransacao.SAIDA && transacao.getValor() > saldo) {
            System.out.println("Erro: Não há saldo suficiente para essa transação.");
        } else {
            transacoes.add(transacao);
            if (transacao.getTipo() == TipoTransacao.ENTRADA) {
                saldo += transacao.getValor();
            } else {
                saldo -= transacao.getValor();
            }
            System.out.println("Transação registrada com sucesso.");
        }
    }

    // Exibir o saldo atual
    public double getSaldo() {
        return saldo;
    }

    // Exibir todas as transações
    public void exibirTransacoes() {
        System.out.println("Transações realizadas:");
        for (Transacao transacao : transacoes) {
            System.out.println(transacao);
        }
    }
}

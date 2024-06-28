package br.com.pucrs.trabalhofinal.produtcs;

public class CadastroBicicletas {
    // Declarando bicicletas no escopo da classe
    private Bicicleta[] bicicletas;

    //construtor
    public CadastroBicicletas () {
        bicicletas = new Bicicleta[10];
    }

    //adicionaBicicleta: Insere um objeto Bicicleta no vetor. Retorna true se a
    //inserção pode ser realizada ou false se a inserção não foi possível.
    public boolean adicionaBicicleta ( Bicicleta bicicleta ) {
        boolean adicionou = false;
        for (int i = 0; i < bicicletas.length; i++) {
            if (bicicletas[i] == null) {
                bicicletas[i] = bicicleta;
                adicionou = true;
                System.out.println("Bicicleta adicionada com sucesso!");
                break;
            }
        }
        if (!adicionou) {
            System.out.println("Capacidade maxima atingida");
        }
        return adicionou;
    }

    //buscaBicicletaPeloModelo: Recebe o modelo da bicicleta e retorna o objeto
    //que contém o modelo da bicicleta
    public Bicicleta buscaBicicletaPeloModelo ( String modelo ) {
        Bicicleta bicicleta = null;
        for (int i = 0; i < bicicletas.length; i++) {
            if (bicicletas[i] != null && bicicletas[i].getModelo().equals(modelo)) {
                bicicleta = bicicletas[i];
                break;
            }
        }
        return bicicleta;
    }

    //totalUnidades(): Retorna o somatório de todas as quantidades de bicicletas
    //disponíveis para empréstimo.
    public int totalUnidades () {
        int total = 0;
        for (int i = 0; i < bicicletas.length; i++) {
            if (bicicletas[i] != null) {
                total += bicicletas[i].getQuantidadeDisponivel();
            }
        }
        return total;
    }

    //mostraBicicletas(): Mostra os dados das bicicletas armazenadas.
    public void mostraBicicletas () {
        for (int i = 0; i < 10; i++) {
            if (bicicletas[i] != null) {
                System.out.println(bicicletas[i].toString());
            }
        }
    }

}
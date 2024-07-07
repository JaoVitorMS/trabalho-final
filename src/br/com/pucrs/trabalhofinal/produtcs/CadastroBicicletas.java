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
                int valor = bicicletas[i].getNumeroBicicleta();
                bicicletas[i].setQuantidadeDisponivel(valor++);
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

    //quantidadeEspacosNaoNulos: Retorna a quantidade de espaços não nulos no array de bicicletas.
    public int totalUnidades() {
        int count = 0;
        for (int i = 0; i < bicicletas.length; i++) {
            if (bicicletas[i] != null) {
                count++;
            }
        }
        return count;
    }

    public void aumentarQuantidadeBicicletas(){
        int quantidade = totalUnidades() + 1;
        
    }

    public void diminuirQuantidadeBicicletas(){
        int quantidade = totalUnidades() - 1;
        
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
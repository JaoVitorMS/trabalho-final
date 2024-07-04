package br.com.pucrs.trabalhofinal.clients;

public class CadastroMembro{

    private Membro[] membros = new Membro[10];


    public void adicionarMembro (Membro membro) {
        boolean adicionou = false;
        for (int i = 0; i < membros.length; i++) {
            if (membros[i] == null) {
                membros[i] = membro;
                adicionou = true;
                break;
            }
        }
            if (!adicionou) {
                System.out.println("Capacidade maxima atingida");
            }
    }
    public void buscarPeloNome( String nome ) {
        boolean match = false;
        for ( int i = 0; i < membros.length; i++){
            if (membros[i] != null && membros[i].getNome().equals(nome)) {
                match = true;
                System.out.println(membros[i].getNome());
            }
        }
        if (match == false){
            System.out.println("Nome não encontrado!");
        }
    }

    public void mostraMembros () {
        for (int i = 0; i < membros.length; i++) {
            if (membros[i] != null) {
                System.out.println(membros[i].toString());
            }
        }
    }
    public void atualizarMembro (int matricula) {
        for (int i = 0; i < membros.length; i++) {
            if (membros[i] != null && membros[i].getMatricula() == matricula) {
                if (membros[i].getDados_bicicleta_emprestadas() == 0) {
                    membros[i].setDados_bicicleta_emprestadas(membros[i].getDados_bicicleta_emprestadas() + 1);
                } else if (membros[i].getDados_bicicleta_emprestadas() == 1) {
                    System.out.println("Voce ja tem uma bicicleta emprestada");
                }
            }
        }
    }

    public boolean dadoBike (int matricula) {
        boolean alugado = false;
        for (int i = 0; i < membros.length; i++) {
            if (membros[i] != null && membros[i].getMatricula() == matricula) {
                if (membros[i].getDados_bicicleta_emprestadas() == 1) {
                    alugado = true;
                }
            }
        }
        return  alugado;
    }
}

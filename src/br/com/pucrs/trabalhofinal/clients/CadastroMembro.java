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
            if (!adicionou) {
                System.out.println("Capacidade maxima atingida");
            }
        }
    }

    public void exibirMembros () {
        for (int i = 0; i < membros.length; i++) {
            if (membros[i] != null) {
                System.out.println(membros[i].toString());
            }
        }
    }
}

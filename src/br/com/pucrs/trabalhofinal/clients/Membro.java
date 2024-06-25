package br.com.pucrs.trabalhofinal.clients;

import br.com.pucrs.trabalhofinal.produtcs.Bicicleta;


public class Membro {
    //atributos: matricula<int>, nome<string>, CIDADE_DE_ORIGEM<final string>, dados_bicicleta_emprestadas<Bicicleta>
    private int matricula;
    private String nome;
    private final String CIDADE_DE_ORIGEM;
    //protected boolean bicicletasEmprestadas;
    private Bicicleta dados_bicicleta_emprestadas;

    public Membro ( int matricula, String nome, String CIDADE_DE_ORIGEM ) {
        this.matricula = matricula;
        this.nome = nome;
        this.CIDADE_DE_ORIGEM = CIDADE_DE_ORIGEM;
        //this.bicicletasEmprestadas = bicicletasEmprestadas;
    }

    boolean alugouBike = false;

    public int getMatricula () {
        return matricula;
    }

    public void setMatricula ( int matricula ) {
        this.matricula = matricula;
    }

    public String getNome () {
        return nome;
    }

    public void setNome ( String nome ) {
        this.nome = nome;
    }

    public String getCIDADE_DE_ORIGEM () {
        return CIDADE_DE_ORIGEM;
    }

    protected boolean verificadorAlugouBicicleta (int matricula) {
        if ( Bicicleta.getDados_bicicleta_emprestadas() == 1) {
            return true;
        } else {return false;}
    }

    @Override
    public String toString () {
        return "Detalhes do membro: "     + nome +
                ", numero matricula = "   + matricula +
                ", CIDADE_DE_ORIGEM = "   + CIDADE_DE_ORIGEM +
                ", Bicicleta Alugada = "  + dados_bicicleta_emprestadas;
    }
}

package br.com.pucrs.trabalhofinal.clients;

import br.com.pucrs.trabalhofinal.produtcs.Bicicletas;

public class Membro {
    //atributos: matricula<int>, nome<string>, CIDADE_DE_ORIGEM<final string>, dados_bicicleta_emprestadas<Bicicleta>
    private int matricula;
    private String nome;
    private final String CIDADE_DE_ORIGEM;
    protected boolean bicicletasEmprestadas;
    private Bicicletas dados_bicicleta_emprestadas;

    public Membro ( int matricula, String nome, String CIDADE_DE_ORIGEM, boolean bicicletasEmprestadas ) {
        this.matricula = matricula;
        this.nome = nome;
        this.CIDADE_DE_ORIGEM = CIDADE_DE_ORIGEM;
        this.bicicletasEmprestadas = bicicletasEmprestadas;
        this.dados_bicicleta_emprestadas = dados_bicicleta_emprestadas;
    }

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

    public boolean isBicicletasEmprestadas () {
        return bicicletasEmprestadas;
    }

    public void setBicicletasEmprestadas ( boolean bicicletasEmprestadas ) {
        this.bicicletasEmprestadas = bicicletasEmprestadas;
    }

    public Bicicletas getDados_bicicleta_emprestadas () {
        return dados_bicicleta_emprestadas;
    }

    public void setDados_bicicleta_emprestadas ( Bicicletas dados_bicicleta_emprestadas ) {
        this.dados_bicicleta_emprestadas = dados_bicicleta_emprestadas;
    }

    public boolean verificadorBicicleta(boolean bicicletasEmprestadas) {
        if (bikeDisponivel == false ){
            System.out.println("bike indisponivel!");
            bicicletasEmprestadas = false;
            return  false;
        } else {
            System.out.println("bike disponivel!");
            bicicletasEmprestadas = true;
            return true;
        }
    }
}

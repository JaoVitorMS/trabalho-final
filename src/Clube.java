import br.com.pucrs.trabalhofinal.clients.CadastroMembro;
import br.com.pucrs.trabalhofinal.clients.Membro;

public class Clube {
    public static void main ( String[] args ) {
        CadastroMembro cadastro = new CadastroMembro();

        Membro cliente1 = new Membro(123, "Paula Tejano", "Pirituba City");
        Membro cliente2 = new Membro(1234, "Deyde Costa", "Pirituba City");
        Membro cliente3 = new Membro(1235, "Tekomo Nakama", "Pirituba City");

        cadastro.adicionarMembro(cliente1);
        cadastro.adicionarMembro(cliente2);
        cadastro.adicionarMembro(cliente3);
        cadastro.exibirMembros();

    }
}
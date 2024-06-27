import br.com.pucrs.trabalhofinal.clients.CadastroMembro;
import br.com.pucrs.trabalhofinal.clients.Membro;
import br.com.pucrs.trabalhofinal.produtcs.Bicicleta;
import br.com.pucrs.trabalhofinal.produtcs.CadastroBicicletas;
import java.util.Scanner;

public class Clube {
    public static void main ( String[] args ) {
        Scanner teclado = new Scanner(System.in);
        CadastroMembro cadastro = new CadastroMembro();

        System.out.println("---------------MENU---------------");
        System.out.println("1 - Adicionar membro");
        System.out.println("2 - Mostrar membros");
        System.out.println("3 - Buscar membro pelo nome");
        System.out.println("4 - Adicionar Bicicleta");
        System.out.println("5 - Mostrar bicicletas");
        System.out.println("6 - Buscar bicicleta pelo modelo");
        System.out.println("7 - Emprestar bicicleta");
        System.out.println("8 - Devolver bicicleta");
        System.out.println("9 - Quantidade de bicicletas disponíveis");
        System.out.println("10 - Sair");
        System.out.println("Digite a opção desejada: ");

        int opcao = teclado.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Digite o nome do membro: ");
                String nome = teclado.next();
                System.out.println("Digite a matricula do membro: ");
                int matricula = teclado.nextInt();
                System.out.println("Digite a cidade de origem do membro: ");
                String cidade = teclado.next();
                Membro membro = new Membro(matricula, nome, cidade);
                cadastro.adicionarMembro(membro);
                break;
            case 2:
                cadastro.mostraMembros();
                break;

            case 3:
                System.out.println("Digite o nome do membro que deseja buscar: ");
                String nomeBusca = teclado.next();
                cadastro.buscarPeloNome(nomeBusca);
                break;

            case 4:
                System.out.println("Digite o modelo da bicicleta: ");
                String modelo = teclado.next();
                System.out.println("Digite o número da bicicleta: ");
                int numero = teclado.nextInt();
                System.out.println("Digite a quantidade disponível: ");
                int quantidade = teclado.nextInt();
                Bicicleta bicicleta = new Bicicleta(numero, modelo, quantidade);
                cadastroBicicletas.adicionaBicicleta(bicicleta);
                break;
        }


    }
}
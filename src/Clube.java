import br.com.pucrs.trabalhofinal.clients.CadastroMembro;
import br.com.pucrs.trabalhofinal.clients.Membro;
import br.com.pucrs.trabalhofinal.produtcs.Bicicleta;
import br.com.pucrs.trabalhofinal.produtcs.CadastroBicicletas;
import java.util.Scanner;

public class Clube {
    public static void main ( String[] args ) {
        Scanner teclado = new Scanner(System.in);
        CadastroMembro cadastro = new CadastroMembro();
        CadastroBicicletas cadastroBicicletas = new CadastroBicicletas();
        Bicicleta bicicleta = null;
        Membro membro = null;
        int opcao;

        do{
            System.out.println("---------------MENU---------------");
            System.out.println("1 - Adicionar membro");
            System.out.println("2 - Mostrar membros");
            System.out.println("3 - Buscar membro pelo nome");
            System.out.println("4 - Adicionar Bicicleta");
            System.out.println("5 - Mostrar bicicletas");
            System.out.println("6 - Buscar bicicleta pelo modelo");
            System.out.println("7 - Retirar bicicleta");
            System.out.println("8 - Devolver bicicleta");
            System.out.println("9 - Quantidade de bicicletas disponíveis");
            System.out.println("10 - Sair");
            System.out.print("Digite a opção desejada: ");
            
            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao){
            //Adicionar membro
                case 1:
                System.out.println("Digite o nome do membro: ");
                String nome = teclado.next();
                System.out.println("Digite os 3 primeiros digitos do cpf do membro: ");
                int matricula = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Digite a cidade de origem do membro: ");
                String cidade = teclado.next();
                membro = new Membro(matricula, nome, cidade, 0);
                cadastro.adicionarMembro(membro);
                System.out.println("Cadastrado com sucesso!");
                break;
            //Mostrar membros
                case 2:
                cadastro.mostraMembros();
                break;

            //Buscar membro pelo nome
                case 3:
                System.out.println("Digite o nome do membro que deseja buscar: ");
                String nomeBusca = teclado.next();
                cadastro.buscarPeloNome(nomeBusca);
                break;

            //Adicionar bicicleta
                case 4:
                System.out.println("Digite o modelo da bicicleta: ");
                String modelo = teclado.next();
                System.out.println("Digite o número da bicicleta: ");
                int numero = teclado.nextInt();
                teclado.nextLine();
                bicicleta = new Bicicleta(numero, modelo);
                cadastroBicicletas.adicionaBicicleta(bicicleta);
                break;
            
            //Mostrar bicicletas
                case 5:
                cadastroBicicletas.mostraBicicletas();
                break;

            //Buscar bicicleta pelo modelo
                case 6:
                System.out.println("Digite o modelo da bicicleta para realizar a busca");
                String bikeBusca = teclado.nextLine();
                cadastroBicicletas.buscaBicicletaPeloModelo(bikeBusca);
                break;

            //Retirar bicicleta
                case 7:
                System.out.println("Digite os 3 primeiro digitos do cpf: ");
                int mat = teclado.nextInt();
                bicicleta.RetirarBicicleta(mat);
                cadastro.atualizarMembro(mat);
                break;

            case 8:

                break;

            case 9:
                cadastroBicicletas.totalUnidades();
                break;

            } 
        } while(opcao != 10 );


      
        
        
    }
}
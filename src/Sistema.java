import java.io.IOException;



public class Sistema {

    private static void exibirMenu() {

        System.out.println("\nGERENCIADOR DE OBRAS");
        System.out.println("1) Cadastrar");
        System.out.println("2) Buscar");
        System.out.println("3) Listar todos");
        System.out.println("4) Apagar");
        System.out.println("0) Sair");
        System.out.print("Sua opção: ");

    }

    private static void verificarOpcao(int op) {

        switch (op) {
            case 1:
                salvarObra();
                break;

            case 2:
                buscarObra();
                break;
            
            case 3:
                listarObra();
                break;

            case 4:
                apagarObra();
                break;

            case 0: 
                System.out.println("\nO Programa foi finalizado...");
                break;
        
            default:
                System.out.println("\nOpção inválida Digite novamente:");
                break;
        }

    }

    private static void salvarObra() {

        System.out.println("Cadastrar obra de arte: ");

        String titulo = Console.lerString("Informe o titulo: ");
        String artista = Console.lerString("Informe o artista: ");
        String tipoDeObra = Console.lerString("Informe o tipo De Obra: ");
        String localizaçao =  Console.lerString("Informe a localizaçao: ");
        int ano = Console.lerInt("Informe um numero: ");

        try{
            Obras Ob = new Obras(titulo, artista, tipoDeObra, localizaçao,ano );
            GerenciarObras.AdicionarObra(Ob);
        }
        catch(Exception e){
            System.out.println(e.getMessage());

        }

        System.out.println("\nObras Cadastrados:");

        try {

            for (Obras tempJogo : GerenciarObras.listarObras())
            {
                System.out.println(tempJogo);
            }
        
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }


    }

    private static void buscarObra() {

        System.out.println("\nBuscar Obra");
        String codigo = Console.lerString("Informe o titulo");

        try {

            Obras Obra = GerenciarObras.buscarJogo(codigo);
            System.out.println("\nObra encontrada: " + Obra);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }

    private static void listarObra() {

        System.out.println("\nObras Cadastrados:");

        try {

            for (Obras temp : GerenciarObras.listarObras())
            {
                System.out.println(temp);
            }
        
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }

    private static void apagarObra() {

        System.out.println("\nApagar Obra");
        
        String codigo = Console.lerString("Informe o titulo");

        try {

            GerenciarObras.apagarObra(codigo);
            System.out.println("\nObra excluído com sucesso!");
        
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }

    }

    public static void executar() {

        int op;
        do {
            
            exibirMenu();
            op = Console.lerInt(" ");
            verificarOpcao(op);

        } while(op != 0);

    }


    
}
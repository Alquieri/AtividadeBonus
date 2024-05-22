public class Main {

    public static void main(String[] args) throws Exception{
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
 



    }



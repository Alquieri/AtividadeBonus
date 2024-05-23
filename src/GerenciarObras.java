import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class GerenciarObras {

    private static final String ARQUIVO = "obras.txt";

    public static void AdicionarObra(Obras Obras) throws IOException{
        try (FileWriter fw = new FileWriter(ARQUIVO, true);
        BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write(Obras + "\n");

    }

    }
    public static ArrayList<Obras> listarObras() throws IOException , Exception{
        
   
        ArrayList<Obras> ListaObra = new ArrayList<>();

        try (FileReader fr = new FileReader(ARQUIVO);
             BufferedReader br = new BufferedReader(fr)) {

                String linha;
                while ((linha = br.readLine()) != null) {
                    
                    Obras obra = Obras.fromString(linha);
                    ListaObra.add(obra);
                }
        } 
    

        if (ListaObra.isEmpty()) {
            throw new Exception("\nNão há jogos cadastrados");
        }

        return ListaObra;
        
        
            
        }
        public static Obras buscarJogo(String titulo) throws Exception {

            ArrayList<Obras> ListaObra = listarObras();
    
            for (Obras temp : ListaObra) {
    
                if(temp.getTitulo() == titulo) {
    
                    return temp;
                }
            }
    
            throw new Exception("\nObras com o titulo " + titulo + " não localizado!");
    
        }
    
        public static void apagarObra(String titulo) throws Exception{
    
            ArrayList<Obras> ListaObra = listarObras();       
        
            boolean encontrou = false;
            for (Obras temp : ListaObra) {
    
                if(temp.getTitulo() == titulo) {
                    ListaObra.remove(temp);
                    encontrou = true;
                    break;
                }
            }
    
            if (!encontrou) {
                throw new Exception("\nObra com o titulo " + titulo + " não localizado!");
            }
    
           
            try (FileWriter fw = new FileWriter(ARQUIVO);
            BufferedWriter bw = new BufferedWriter(fw)) {
    
                for (Obras j : ListaObra) {
    
                    bw.write(j + "\n");
                }
            }
        }
    
    }





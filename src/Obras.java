public class Obras {

    private String titulo;
    private String artista;
    private String tipoDeObra;
    private String localizaçao;
    private int ano;


    public Obras() {
        
    }

    public Obras(String titulo, String artista, String tipoDeObra,String localizaçao, int ano) {
        this.titulo = titulo;
        this.artista = artista;
        this.tipoDeObra = tipoDeObra;
        this.ano = ano;
        this.localizaçao = localizaçao;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public String getTipoDeObra() {
        return tipoDeObra;
    }
    public void setTipoDeObra(String tipoDeObra) {
        this.tipoDeObra = tipoDeObra;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getLocalizaçao() {
        return localizaçao;
    }

    public void setLocalizaçao(String localizaçao) {
        this.localizaçao = localizaçao;
    }

    @Override
    public String toString() {
       String  txt =  titulo + ", " + artista + ", " + tipoDeObra +", "+ localizaçao+", " + ano;
       
        return txt;
    }

    public static Obras fromString(String linha) {

        String[] dadosObra = linha.split(", ");

        return new Obras(dadosObra[0], dadosObra[1], dadosObra[2], dadosObra[3],Integer.parseInt( dadosObra[4]) );

    }

    



    
}

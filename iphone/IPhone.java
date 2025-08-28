public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    public String toString(){
    return "Este é um iPhone!";
    }
    public static void ligar(String numero){
        System.out.println("Ligando para "+ numero+"...");
    }
    public static void atender(){
        System.out.println("Atendendo chamada");
    }
    public static void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }
    

    public static void exibirPagina(String url){
        System.out.println("Exibindo página "+ url+"...");
    }
    public static void adicionarNovaAba(){
        System.out.println("Abrindo nova pagina");
    }
    public static void atualizarPagina(){
        System.out.println("Atualizando pagina");
    }

    public static void tocar(){
        System.out.println("Tocando música...");
    }
    public static void pausar(){
        System.out.println("Tocando música");
    }
    public static void selecionarMusica(String musica){
        System.out.println("Música selecionada: "+ musica +".");
    }
}
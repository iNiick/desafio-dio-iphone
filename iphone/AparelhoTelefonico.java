public interface AparelhoTelefonico {
    String numero ="";

    public static void ligar(String numero){
        System.out.println("Ligando para "+ numero+"...");
    }
    public static void atender(){
        System.out.println("Atendendo chamada");
    }
    public static void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }

}

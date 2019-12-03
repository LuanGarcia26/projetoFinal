package projetofinal;
public class AssistirNoChromecast implements AssistirEm{

    @Override
    public void assistir() {
        System.out.println("Conecte o chromecast na mesma rede wi-fi do dispositivo e toque no botão para espelhar");
        new AssistirNoTelefone().assistir();
    }
    
}
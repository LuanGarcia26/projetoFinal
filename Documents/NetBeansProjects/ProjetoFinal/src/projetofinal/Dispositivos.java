package projetofinal;
public class Dispositivos {
    
     public AssistirEm escolheDispositivoParaAssistir(String localDeAssitir){
        if(localDeAssitir.equalsIgnoreCase("Telefone")){
            return new AssistirNoTelefone();
        }
        else if(localDeAssitir.equalsIgnoreCase("Televisao")){
            return new AssistirNaTelevisao();
        }
        else if(localDeAssitir.equalsIgnoreCase("Computador")){
            return new AssistirNoComputador();
            
        }else {
            return new AssistirNoChromecast();
        }
    }
}
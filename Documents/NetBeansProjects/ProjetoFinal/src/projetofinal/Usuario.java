package projetofinal;
public class Usuario {
    private AssistirEm assistirNoDispositivo;

    public void setModoDeAssistir(AssistirEm assistirNoDispositivo) {
        this.assistirNoDispositivo = assistirNoDispositivo;
    }
    public void assistir(){
        this.assistirNoDispositivo.assistir();
    }
    
}

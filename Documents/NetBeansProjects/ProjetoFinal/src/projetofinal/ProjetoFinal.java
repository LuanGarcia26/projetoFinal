package projetofinal;
public class ProjetoFinal {
    public static void main(String[] args) {
      Dispositivos d = new Dispositivos();      
      Usuario novo = new Usuario();
      
      novo.setModoDeAssistir(d.escolheDispositivoParaAssistir("telefone"));
      novo.assistir();
      novo.setModoDeAssistir(d.escolheDispositivoParaAssistir("chromecast"));
      novo.assistir();
      novo.setModoDeAssistir(d.escolheDispositivoParaAssistir("televisao"));
      novo.assistir();
      novo.setModoDeAssistir(d.escolheDispositivoParaAssistir("computador"));
      novo.assistir();
    }
    
}

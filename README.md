Utilidade:
Um player de vídeo que ajusta a resolução de acordo com o dispositivo selecionado para assistir.

Patterns utilizados:
Strategy, Proxy e Factory

Strategy:
O Strategy foi usado para quando o vídeo já estiver sendo assistido em outro dispositivo e o usuário quiser assistir em outro dispositivo ele só precisara alterar o dispositivo sem necessitar recriar o objeto.

Proxy:
O Proxy foi usado para que quando o vídeo estiver passando no telefone e o usuário toque no ícone do chromecast envie um alerta para o usuário ligar o chromecast na mesma rede Wi-Fi para começar o espelhamento da tela.

Factory:
O factory foi utilizado para diminuir o acoplamento e também para centralizar as instanciações e facilitar as chamadas na Main.

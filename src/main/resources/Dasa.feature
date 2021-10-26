# language: pt
@DesafioDasa
  Funcionalidade: Desafio Dasa
    Realizand a jornada do paciente
    - Acessar o site da instituição
    - Ir até Nossas Marcas
    - Procurar por laborátorio em São Paulo e listar todos os labs do Estado
    - Selecionar um laboratório
    - Validar o acesso ao laboratório e clicar na marca
    - Após página carregar, fazer validação que foi direcionado corretamente

    Cenário: Verificar acesso ao laboratorio DelboniAuriemo
      Dado Eu abro o Browser e navego para Dasa website
      Entao Eu checo se o site esta acessível
      Quando Eu navego para menu Somos Dasa e opcao Nossas Marcas
      Entao Eu listo os laboratorios de Sao Paulo
      Entao Eu clico no laboratorio DelboniAuriemo
      E Eu valido o acesso a area do laboratorio
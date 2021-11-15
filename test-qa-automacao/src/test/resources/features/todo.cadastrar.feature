#language : pt
Funcionalidade: Testar funcionalidade da guia Todo
  Sendo eu usuario do sistema TodoApp
  Quero testar suas funcionalidades
  Para que eu possa gerenciar todas as minhas tarefas e nunca mais esquece-las

  Contexto: 
    Dado que eu esteja na pagina "http://localhost:8080"

  Cenario: Cadastrar uma tarefa
    Quando submeto meu formulario com a tarefa "Lavar carro"
    Entao devera ser listado na tabela a tarefa cadastrada "Lavar carro"

  #Cenario: Finalizar tarefa como concluida
    #Quando clico na caixa de checkbox da tarefa "Lavar carro"
    #Entao tarefa devera ser removida da tabela "Lavar carro"

  #Cenario: Validar limpeza campo do formulario
    #Quando preencho o formulario
    #E clico no icone com imagem X
    #Entao formulario devera ser limpo

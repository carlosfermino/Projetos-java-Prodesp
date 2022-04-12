#Author: cafermino@apoioprodesp.sp.gov.br

@login1
Feature: Realizar login na console
  Eu como usuario quero acessar a aplicacao console para realizar o login 

  @login
  Scenario: Realizando login na console
    Given que acesse a page do console e preencho o campo email
    And preencho o campo senha
    When clico em login
    Then sou direcionado para a home page da console
    
	  @console
  Scenario: acessando o menu da console
    Given que acesse a home page da console e clico em solicitacoes
    And clico em incidentes 
    When clico em administracao
    Then sou direcionado para a respctiva page selecionada
    
    
   


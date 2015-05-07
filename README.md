PADRÕES DE PROJETOS

PADRÕES DE CRIAÇÃO
  Em um sistema orientado a objetos, a criação de certos objetos pode ser uma tarefa extremamente complexa. Podemos destacar dois problemas relacionados a criação de objetos:
•	Definir como os objetos são criados e como eles se relacionam com outros objetos do sistema.
•	Definir qual classe concreta deve ser utilizada para criar o objeto.
Seguindo o princípio do encapsulamento, essa complexidade deve ser isolada.
	

Factory Method
Encapsular a escolha da classe concreta - uma única família	

Abstract Facthory
Encapsular a escolha da classe concreta - várias famílias
	

Builder
Separar o processo de construção de um objeto de sua representação.	

Prototype
Possibilitar a criação de novos objetos a partir da cópia de objetos existentes.	

Singleton
Permite a criação de uma única instância de uma classe e possibilitar a sua recuperação.	

Multiton
Permite a criação de poucas instâncias de uma classe e possibilitar a recuperação.
de uma única instância de uma classe e possibilitar a sua recuperação.	

Object Pool
Reaproveitamento de objetos. Numa biblioteca, além de livros, temos revista, TCC,jornais, dentre outros tipos de objetos. Pode ser implementada uma interface pool<T> genérica para ser implementada por esses variados objetos.	

PADRÕES ESTRUTURAIS
    As interações entre os objetos de um sistema podem gerar fortes dependências entre esses elementos. Essas dependências aumentam a complexidade das eventuais alterações no funcionamento do sistema. Consequentemente, o custo de manutenção aumenta.
	

Adapter
       Faz adaptação entre 2 sistemas. Permite que um sistema seja substitiudo por outro que realiza a mesma tarefa mas com uma interface diferente.(Adaptador de tomada)	

Bridge
Permite a combinação de variados objetos. Separar uma abstração de sua representação, de forma que ambos possam variar e produzir tipos de objetos diferentes. (Chips podem ser usados em celulares diferentes)	
Composite
Dá ideia de composição. Agrupar objetos que fazem parte de uma relação parte-todo de forma a tratá-los sem distinção. (O caminho entre dois pontos pode ser considerado um trecho. Basicamente, um caminho é um trecho composto por outros trechos. O processo de construção de um caminho envolveria a criação ou a recuperação de trechos de quaisquer tipo para compor um trecho maior.) Ex: caminho2.adiciona(caminho1);	

Decorator
Adicionar funcionalidade a um objeto dinamicamente. Relembrando o Factory Method, consideramos um sistema de envio de mensagens. Definimos uma interface para padronizar os emissores. É possível adicionar algumas funcionalidades no processo de envio de mensagem, como criptografia e compressão das mensagens. Para não alterar as classes que definem os emissores, cada funcionalidade adicional (decoração) será implementada por um novo objeto.	

Facade
Provê uma interface simplificada para utilização em várias outras interfaces. Funciona como um intermediário. simplificar a interação de um cliente com diversos sistemas. (Facade (PedidoFacade) Classe intermediária que simplifica o acesso aos Component. Component (Estoque, Financeiro, PosVenda)Classes que compõem o subsistema). Ex:(Uma agência de viagens atua como intermediário entre o cliente e a companhia aérea).	
Front Controller
Centralizar todas as requisições a uma aplicaçãoWeb. Implementa uma servlet para requisições e respostas http.	
Flyweight
Compartilhar, de forma eficiente, objetos que são usados em grande quantidade. Podemos definir uma interface para padronizar o funcionamento de diferentes temas de uma apresentação de slides.	
Proxy
Controlar as chamadas a um objeto através de outro objeto de mesma interface. Funciona como um no-break. Define um intermediário para controlar o acesso a um determinado objeto, podendo adicionar funcionalidades que esse objeto não possui.	

PADRÕES COMPORTAMENTAIS
            Trabalha com o comportamento do objeto	
Comand
Diminuir a quantidade de “ligações” entre objetos introduzindo um mediador, através do qual toda comunicação entre os objetos será realizada.	
Iterator
Definir um mecanismo eficiente para reagir às alterações realizadas em determinados objetos. Serve para notificar os interessados sobre as alterações nos valores de uma ação...	
Mediator
Diminuir a quantidade de “ligações” entre objetos introduzindo um mediador, através do qual toda comunicação entre os objetos será realizada.	
Observer
Definir um mecanismo eficiente para reagir às alterações realizadas em determinados objetos. Depois de alguma ação, ocorre uma reação
	
State
Alterar o comportamento de um determinado objeto de acordo com o estado no qual ele se encontra.	
Strategy
Permite a variação dos algoritmos utilizados na solução de um determinado problema.	
Template Method
Definir a ordem na qual determinados passos devem ser realizados na resolução de um problema e permitir que esses passos possam ser realizados de formas diferentes de acordo com a situação.
	
Visitor
Permitir atualizações específicas em uma coleção de objetos de acordo com o tipo particular de cada objeto atualizado.
	
Equipe: 
 - Aparecida de Fátima Pires Barbosa
 - Ferran Gonzalez Alonso

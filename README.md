🧠 Pergunta de Reflexão
"Por que Java permite herança simples (apenas uma mãe), mas múltipla implementação de interfaces (vários contratos)?
Pense: Se CarroEletrico pudesse herdar de Veiculo E de Bateria ao mesmo tempo (herança múltipla), o que aconteceria se AMBAS as mães tivessem um método chamado ligar()? 
Como as interfaces resolvem esse problema?"

Resposta: O Java evita herança múltipla de classes para impedir conflitos e ambiguidades. 
Se CarroEletrico herdasse de Veiculo e Bateria, e as duas classes tivessem um método ligar(), o Java não saberia qual versão usar, criando o chamado “problema do diamante”. 
Já as interfaces funcionam como contratos: elas dizem o que a classe deve fazer, mas normalmente não trazem implementação completa. 
Assim, a própria classe decide como implementar o método, evitando conflitos e deixando o código mais organizado e seguro.

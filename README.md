## 3ª Rodada do BPM
<hr>
O objetivo do BPM é avaliar o nível técnico das aprendizes do programa de formação Estrelas Aprendiz.
<hr>

## Classes

### `Pessoa`

A classe `Pessoa` representa uma pessoa com atributos de ID e nome. Ela possui os seguintes métodos:

- `getId()`: Retorna o ID da pessoa.
- `getNome()`: Retorna o nome da pessoa.
- `valido()`: Verifica se a pessoa é válida (ID maior que zero e nome não vazio).

### `Turma`

A classe `Turma` representa uma turma que pode conter várias pessoas. Ela possui os seguintes métodos:

- `getPessoas()`: Retorna a lista de pessoas na turma.
- `adicionarPessoa(Pessoa pessoa)`: Adiciona uma pessoa à turma se ela for válida e seu ID não estiver duplicado.
- `removerTodasPessoas()`: Remove todas as pessoas da turma.

## Testes Unitários

Os testes unitários foram escritos usando o framework JUnit para verificar o comportamento correto das classes `Turma` e `Pessoa`. Os testes incluem:

- Verificar se uma exceção é lançada ao adicionar uma pessoa inválida.
- Verificar se uma exceção é lançada ao adicionar uma pessoa com o mesmo ID que outra já na turma.
- Verificar se a remoção de todas as pessoas da turma funciona corretamente.
- Verificar se o metodo pessoa valida está retornando verdadeiro
- Verificar se retorna falso ao adicionar um ID vazio ou um ID com valor 0
- Verificar se retorna falso ao adionar um nome vazio.

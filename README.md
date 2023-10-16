# tabela-hash-pjbl3
- Nesse exemplo, a classe HashTable implementa uma tabela hash que pode armazenar objetos do tipo Entrada com chaves do tipo inteiro.
- A função de hash usa o tam_vetor de módulo (%) para calcular o índice da tabela.
- A colisão é tratada usando listas encadeadas. Cada posição da tabela hash contém uma lista encadeada de elementos que colidem na mesma posição.
- A inserção, busca e remoção são implementadas percorrendo a lista encadeada correspondente à posição calculada pela função de hash.

# tabela-hash-pjbl3
- Nesse exemplo, a classe HashTable implementa uma tabela hash que pode armazenar objetos com chaves do tipo inteiro ou String.
- A função de hash para chaves inteiras usa o operador de módulo (%) para calcular o índice da tabela, enquanto a função de hash para chaves String usa uma combinação de multiplicação e soma dos valores ASCII dos caracteres.
- A colisão é tratada usando listas ligadas. Cada posição da tabela hash contém uma lista ligada de elementos que colidem na mesma posição.
- A inserção, busca e remoção são implementadas percorrendo a lista ligada correspondente à posição calculada pela função de hash.

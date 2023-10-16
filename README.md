# tabela-hash-pjbl3
- Nesse exemplo, a classe HashTable implementa uma tabela hash que pode armazenar objetos do tipo Entrada com chaves do tipo inteiro.
  - ![image](https://github.com/brenors/tabela-hash-pjbl3/assets/101011280/0c17810f-87e1-4eb2-9046-adab8c4f1943)
  
- A função de hash usa o tam_vetor de módulo (%) para calcular o índice da tabela.
  - ![image](https://github.com/brenors/tabela-hash-pjbl3/assets/101011280/d4e30e71-da17-4f27-b3df-fea38733884a)

- A colisão é tratada usando listas encadeadas. Cada posição da tabela hash contém uma lista encadeada de elementos que colidem na mesma posição.
  - ![image](https://github.com/brenors/tabela-hash-pjbl3/assets/101011280/992f3bb1-3363-4cca-b04b-469c8e7cfa5a)
  - ![image](https://github.com/brenors/tabela-hash-pjbl3/assets/101011280/63c36460-6e89-435d-8314-fddf4d74b1bf)

  
- A inserção, busca e remoção são implementadas percorrendo a lista encadeada correspondente à posição calculada pela função de hash.
  - ![image](https://github.com/brenors/tabela-hash-pjbl3/assets/101011280/42ba860a-4c59-4ddd-8f0b-851ce87ae808)
  - ![image](https://github.com/brenors/tabela-hash-pjbl3/assets/101011280/08f205c8-e41c-4696-ad4f-261c9897eb95)
  - ![image](https://github.com/brenors/tabela-hash-pjbl3/assets/101011280/f46d7f7c-a7fd-4944-8536-130d48d2d8a8)

- Agora vamos rodar um exemplo da instanciação da classe HashTable e em seguida a inserção, busca e remoção de chaves:
  - ![image](https://github.com/brenors/tabela-hash-pjbl3/assets/101011280/a0a11aca-3137-4dfa-909c-74a144a42f46)
  
  - primeiramente iremos instanciar um objeto do tipo HashTable com o número máximo de itens igual a 10 e em seguida vamos instanciar 4 objetos do tipo Entrada para serem inseridos na tabela hash criada:
    ![image](https://github.com/brenors/tabela-hash-pjbl3/assets/101011280/8b7c914a-d9d2-4ad6-84fe-a6c9f1363b83)
      - resultado:
        ![image](https://github.com/brenors/tabela-hash-pjbl3/assets/101011280/448d1358-6fc5-4e48-bc10-45d287067731)

    
  - agora vamos buscar uma chave de valor 6 na tabela hash criada e ver o comportamento do programa:
    ![image](https://github.com/brenors/tabela-hash-pjbl3/assets/101011280/467df6d8-87b4-43f0-acf1-589a9bd647ea)
      - resultado:
        ![image](https://github.com/brenors/tabela-hash-pjbl3/assets/101011280/bf0ed8a1-d019-44aa-9e51-97f1c4f170b1)


  - por último vamos remover uma chave de valor 11 da hash criada:
      - resultado:
        ![image](https://github.com/brenors/tabela-hash-pjbl3/assets/101011280/8b2cb3a3-61b9-48fd-ac8f-010e9fa79756)

        
    


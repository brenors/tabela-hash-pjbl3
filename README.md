# tabela-hash-pjbl3
- Nesse exemplo, a classe HashTable implementa uma tabela hash que pode armazenar objetos do tipo Contato com chaves do tipo inteiro.
  - ![image](https://github.com/brenors/tabela-hash-pjbl3/assets/101011280/0c17810f-87e1-4eb2-9046-adab8c4f1943)
  
- A função de hash usa o tam_vetor de módulo (%) para calcular o índice da tabela.
  - ![image](https://github.com/brenors/tabela-hash-pjbl3/assets/101011280/d4e30e71-da17-4f27-b3df-fea38733884a)

- A colisão é tratada usando listas encadeadas. Cada posição da tabela hash contém uma lista encadeada de elementos que colidem na mesma posição.
  - ![image](https://github.com/brenors/tabela-hash-pjbl3/assets/101011280/992f3bb1-3363-4cca-b04b-469c8e7cfa5a)
  - ![image](https://github.com/brenors/tabela-hash-pjbl3/assets/101011280/ae363f9b-7821-4b4d-9a73-f683cd226d3c)
  
- A inserção, busca e remoção são implementadas percorrendo a lista encadeada correspondente à posição calculada pela função de hash.
  - ![image](https://github.com/brenors/tabela-hash-pjbl3/assets/101011280/7b221030-25de-4666-9d09-767adbfda561)
  - ![image](https://github.com/brenors/tabela-hash-pjbl3/assets/101011280/a31cfb82-73ed-46e7-89c5-23e422d881c6)
  - ![image](https://github.com/brenors/tabela-hash-pjbl3/assets/101011280/d490c801-2938-4dff-a8ca-f77b74fb5c1f)

- Agora vamos rodar um exemplo da instanciação da classe HashTable e em seguida a inserção, busca e remoção de chaves:
  - ![image](https://github.com/brenors/tabela-hash-pjbl3/assets/101011280/1a741b26-e79c-4d64-881c-31e0ecac5af4)

  - primeiramente iremos instanciar um objeto do tipo HashTable com o número máximo de itens igual a 10 e em seguida vamos instanciar 4 objetos do tipo Contato para serem inseridos na tabela hash criada:
    ![image](https://github.com/brenors/tabela-hash-pjbl3/assets/101011280/bcc3c00c-e29c-4beb-8936-555158da318e)
      - resultado:
        ![image](https://github.com/brenors/tabela-hash-pjbl3/assets/101011280/0fbc71d7-72ff-4279-a10a-89d1ca10c018)

  - agora vamos buscar uma chave de valor 6 na tabela hash criada e ver o comportamento do programa:
    ![image](https://github.com/brenors/tabela-hash-pjbl3/assets/101011280/57053f37-ff79-426f-8f2b-08c05b621449)
      - resultado:
        ![image](https://github.com/brenors/tabela-hash-pjbl3/assets/101011280/b5b5b3f7-db7f-4ac4-a573-8695da4f6eeb)

  - por último vamos remover uma chave de valor 10 da hash criada:
    ![image](https://github.com/brenors/tabela-hash-pjbl3/assets/101011280/771820dc-111c-4879-91ac-31b52fde5ddd)
      - resultado:
        ![image](https://github.com/brenors/tabela-hash-pjbl3/assets/101011280/07372d4b-3fed-4aa8-93fe-90fe18850cd3)

  - OBS: note que os métodos de busca contem uma implementação de uma contagem de tempo de execução do método
      - ![image](https://github.com/brenors/tabela-hash-pjbl3/assets/101011280/46adb450-ccf3-40b3-bbd9-ecafac7e8577)
      - resultado esperado:
        ![image](https://github.com/brenors/tabela-hash-pjbl3/assets/101011280/038fa326-ece9-46b3-bc22-25f2f2035db2)

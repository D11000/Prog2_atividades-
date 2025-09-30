//0. Descreva no que consiste a passagem de parâmetros por valor e por referência. Quais as
//especificidades da linguagem JAVA neste contexto?

//Passagem por valor:
//Uma cópia do valor da variável é passada para o método.
//Alterações feitas no parâmetro dentro do método não afetam a variável original.
//Utilizada geralmente com tipos primitivos (como int, double, boolean etc.).

//Passagem por Referência
//Passa-se uma referência para a variável original.
//Alterações no parâmetro afetam diretamente a variável original.
//Comum em linguagens como C++ (usando ponteiros ou referências explícitas).

//As especificidades do java no contexto
// Tipos primitivos:
//São passados por valor.
//A variável original não é alterada dentro do método.
// Objetos:
//A referência do objeto é passada por valor.
//Ou seja, o método recebe uma cópia da referência, e não do objeto em si.
//Assim, é possível alterar o conteúdo do objeto, mas não trocar a referência original.
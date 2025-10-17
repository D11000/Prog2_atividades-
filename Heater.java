////Exercício 2.83 Exercício de desafio. Crie um novo projeto, heater-exercise, no BlueJ. Edite
////os detalhes na descrição de projeto a nota de texto que você vê no diagrama. Crie uma
////classe, Heater, que contenha um único campo de inteiro, temperature. Defina um construtor
////que não aceite nenhum parâmetro. O campo temperature deve ser configurado como o valor
////15 no construtor. Defina os métodos modificadores warmer e cooler, cujo efeito é aumentar
////ou diminuir o valor de temperatura por 5° respectivamente. Defina um método de acesso para
////retornar o valor de temperature.
//
//

/// /Exercício 2.84 Exercício de desafio. Modifique sua classe Heater para definir três novos
/// /campos de inteiro: min, max e increment. Os valores de min e max devem ser configurados
/// /por parâmetros passados para o construtor. O valor de increment deve ser configurado como
/// /5 no construtor.
/// /
/// / Modifique as definições de warmer e cooler de modo que utilizem o valor de
/// /incremento em vez de um valor explícito de 5. Antes de prosseguir com esse exercício, verifique
/// /se tudo funciona como antes.
///
/// Agora modifique o método warmer de modo que não permita que a temperatura seja configurada como um valor maior que max.
/// De maneira semelhante, modifique cooler de modo que não permita que temperature seja configurado como um valor menor que min. Verifique se a classe funciona adequadamente.
/// Agora adicione um método,
/// /setIncrement, que recebe um único parâmetro de inteiro e o utiliza para configurar o valor de
/// /increment. Mais uma vez, teste se a classe funciona conforme esperado criando alguns objetos Heater no BlueJ. As coisas ainda funcionam conforme o esperado se um valor negativo for
/// /passado para método setIncrement? Adicione uma verificação a esse método para impedir
/// /que um valor negativo seja atribuído a increment.
///
public class Heater {
    private int  temperature ;
    private  int max ;
    private int min ;
    private int increment=5;


    public Heater(int maxtemp, int mintemp){
        temperature=15;
        max=maxtemp;
        min=mintemp;


    }
    public void warmer(){
        if (temperature> max  ){
            System.out.println("Valor invalido");



        }
        else {temperature=temperature+increment;}


    }

    public void cooler(){
        if (temperature< min  ){
            System.out.println("Valor invalido");

        }
        else {
            temperature=temperature-increment;

        }

    }



    public void setIncrement(int inctemp)
    {if( inctemp<0 ){
        System.out.println("Valor invalido");
    }
    else {
        increment=inctemp;
    }

    }
    public int getTemperature() {
        return temperature;
    }
}

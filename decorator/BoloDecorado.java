package padroesestruturais_exercicios.decorator;

public class BoloDecorado implements Bolo{

    public float valor;

    public BoloDecorado() {
    }

    public BoloDecorado(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public String getEstrutura() {
        return "Decorado";
    }
}

package Java1.EreditarietaJava.EsercizioEreditarieta2;

public class Rettangolo extends Forma{

    int base;
    int altezza;

    public Rettangolo( String nome, int base, int altezza){
        super(nome);
        this.base=base;
        this.altezza=altezza;
    }

       @Override
    public double calcolaArea() {

        return base*altezza;
    }
}

public class Persona extends Thread{

    private String nome;
    private int carta;

    public Persona(String nome) {

        this.nome = nome;
    }

    @Override
    public void run() {

        this.carta = (int)(10 * Math.random()) + 1;
        System.out.println("Il giocatore " + nome + " ha pescato la carta: " + carta);
        System.out.println("");

    }

    public String getNome() {
        return nome;
    }

    public int getCarta() {
        return carta;
    }
    
}

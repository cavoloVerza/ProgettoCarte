public class App {
    public static void main(String[] args) throws Exception {
        
        Persona p1 = new Persona("Giovanni");
        Persona p2 = new Persona("Andrea");
        Persona p3 = new Persona("Samuele");

        p1.start();
        System.out.println(p1.getName() + "--- Il giocatore " + p1.getNome() + " sta giocando");
        System.out.println("");

        p2.start();
        System.out.println(p2.getName() + "--- Il giocatore " + p2.getNome() + " sta giocando");
        System.out.println("");

        p3.start();
        System.out.println(p3.getName() + "--- Il giocatore " + p3.getNome() + " sta giocando");
        System.out.println("");

        p1.join();
        p2.join();
        p3.join();

        if(p1.getCarta() > p2.getCarta() && p1.getCarta() > p3.getCarta())
            System.out.println("Il vincitore è: " + p1.getNome());

        if(p2.getCarta() > p1.getCarta() && p2.getCarta() > p3.getCarta())
            System.out.println("Il vincitore è: " + p2.getNome());

        if(p3.getCarta() > p1.getCarta() && p3.getCarta() > p2.getCarta())
            System.out.println("Il vincitore è: " + p3.getNome());

    }
}

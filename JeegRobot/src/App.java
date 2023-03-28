public class App {
    public static void main(String[] args) throws Exception {

        Arm armDx = new Trivella("Destro");
        Arm armSx = new LanciaMissili("Sinistro");
        Legs legs = new Legs();

        Jeeg jeeg = new Jeeg(armDx, armSx, legs);

        jeeg.muovitiAvanti();
        jeeg.attacca();
        jeeg.muovitiIndietro();
    }
}

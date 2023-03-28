public class LanciaMissili extends Arm{

    public LanciaMissili(String side){
        super(side);
    }
    
    @Override
    public void attacca(){
        System.out.println("Ti attacco con il lancia missili");
    }
}

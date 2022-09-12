public class horse extends animals{
    int podkovi;
    public horse(String food, String location) {
        super(food, location);
        this.podkovi = podkovi;
    }
    @Override
    public void eat() {
        System.out.println("hrust...hrust...");
    }
    @Override
    public void makeNoise() {
        System.out.println("brrrr brrrr");
    }
}

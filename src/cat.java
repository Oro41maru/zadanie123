public class cat extends animals{
    String mestoSna;
    public cat(String food, String location) {
        super(food, location);
        this.mestoSna = mestoSna;
    }


    @Override
    public void eat() {
        System.out.println("chavk...chavk...");
    }
    @Override
    public void makeNoise() {
        System.out.println("myauuu");
    }


}

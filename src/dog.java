public class dog extends animals{
    String osheinik;
    public dog(String food, String location) {
        super(food, location);
        this.osheinik = osheinik;
    }
    @Override
    public void eat() {
        System.out.println("am..am..am..");
    }
    @Override
    public void makeNoise() {
        System.out.println("gav gav");
    }
}

public class animals {
    String food;
    String location;

    public animals (String food, String  location){
        this.food = food;
        this.location = location;
    }
    public void makeNoise() {
        System.out.println("Shhhh... SHhhh...");
    }
    public void eat(){
        System.out.println("Am-nyam-nyam");
    }
    public void sleep(){
        System.out.println("hrrr...hrrr...");
    }
}

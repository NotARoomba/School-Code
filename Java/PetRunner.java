public class PetRunner {
    public static void main(String[] args) {
        Fish fish = new Fish("Bluey", true);
        Fish fish2 = new Fish("Yes", false);
        System.out.println(fish.getName());
        System.out.println(fish.realOrNotReal());
        System.out.println();
        System.out.println(fish2.getName());
        System.out.println(fish2.realOrNotReal());

        int total=0;
        for(int s=1; s<8; s++)
        {
           total=total+s;
        }
        System.out.println(total);
        

        

    }
}

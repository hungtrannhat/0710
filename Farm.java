public class Farm {
    public static void main(String[] args) {
        // Tạo danh sách các động vật trong trang trại
        Animal[] animals = {
                new Pig("Pig"),
                new Duck("Duck"),
                new Fish("Fish")
        };

        for (Animal a : animals) {
            if (a.canSwim()) {
                System.out.println(a.getName() + " can swim.");
            }
        }

        for (Animal a : animals) {
            if (a.canWalk()) {
                System.out.println(a.getName() + " can walk.");
            }
        }
    }
}

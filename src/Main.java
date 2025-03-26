public class Main {
    public static void main(String[] args) {
        HumanBMI humanBMI = new HumanBMI(65, 1.72);

        System.out.println("Weight: " + humanBMI.getWeight());
        System.out.println("Height: " + humanBMI.getHeight());

        System.out.println("IMT Result: " + humanBMI.getIMTResult());

        humanBMI.setWeight(70);
        humanBMI.setHeight(1.75);

        System.out.println("Updated Weight: " + humanBMI.getWeight());
        System.out.println("Updated Height: " + humanBMI.getHeight());
        System.out.println("Updated IMT Result: " + humanBMI.getIMTResult());
    }
}
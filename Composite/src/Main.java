public class Main {
    public static void main(String[] args) {

        Composite computer = new Composite("PC");
        Equipment processor = new Equipment("Processor", 1000);
        Equipment HDD = new Equipment("Hard Drive", 200);
        Composite memory = new Composite("Memory");
        Equipment rom = new Equipment("ROM Memory", 100);
        Equipment ram = new Equipment("RAM Memory", 120);

        memory.add(rom).add(ram);
        computer.add(processor).add(HDD).add(memory);
        System.out.println("PC price:" + computer.getPrice());
    }
}
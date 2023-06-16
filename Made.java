public class Made {
    public static void main(String[] args) {
        Bank sbiBank = new SBI();
        double sbiInterestRate = sbiBank.getInterestRate();
        System.out.println("Tasso di interesse per SBI: " + sbiInterestRate + "%");

        Bank iciciBank = new ICICI();
        double iciciInterestRate = iciciBank.getInterestRate();
        System.out.println("Tasso di interesse per ICICI: " + iciciInterestRate + "%");

        Bank axisBank = new AXIS();
        double axisInterestRate = axisBank.getInterestRate();
        System.out.println("Tasso di interesse per AXIS: " + axisInterestRate + "%");
    }
}

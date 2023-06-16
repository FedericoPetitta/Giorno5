class Bank {
    public double getInterestRate() {
        return 0.0; // Valore predefinito per la classe base, può essere sovrascritto nelle classi figlie
    }
}

class SBI extends Bank {
    @Override
    public double getInterestRate() {
        return 8.0; // Tasso di interesse specifico per SBI
    }
}

class ICICI extends Bank {
    @Override
    public double getInterestRate() {
        return 7.0; // Tasso di interesse specifico per ICICI
    }
}

class AXIS extends Bank {
    @Override
    public double getInterestRate() {
        return 9.0; // Tasso di interesse specifico per AXIS
    }
}




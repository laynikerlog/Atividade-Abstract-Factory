public class Main {
    public static void main(String[] args) {
        // Utilizando a fábrica Toyota
        FabricaDeCarros fabricaToyota = new FabricaToyota();
        Sedan toyotaSedan = fabricaToyota.createSedan();
        SUV toyotaSUV = fabricaToyota.createSUV();

        toyotaSedan.displayInfo();
        toyotaSUV.displayInfo();

        // Utilizando a fábrica Honda
        FabricaDeCarros fabricaHonda = new FabricaHonda();
        Sedan hondaSedan = fabricaHonda.createSedan();
        SUV hondaSUV = fabricaHonda.createSUV();

        hondaSedan.displayInfo();
        hondaSUV.displayInfo();
    }
}
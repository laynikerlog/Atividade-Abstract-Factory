public class Main {
    public static void main(String[] args) {
        // Utilizando a fábrica Toyota
        FabricaDeCarros fabricaToyota = new FabricaToyota();
        Sedan toyotaSedan = fabricaToyota.createSedan();
        SUV toyotaSUV = fabricaToyota.createSUV();

        toyotaSedan.displayInfo();
        toyotaSUV.displayInfo();

        if (fabricaToyota instanceof FabricaToyota) {
            Sedan rav4 = (Sedan) ((FabricaToyota) fabricaToyota).createSedan();
            rav4.displayInfo();
        }

        // Utilizando a fábrica Honda
        FabricaDeCarros fabricaHonda = new FabricaHonda();
        Sedan hondaSedan = fabricaHonda.createSedan();
        SUV hondaSUV = fabricaHonda.createSUV();

        hondaSedan.displayInfo();
        hondaSUV.displayInfo();

        if (fabricaHonda instanceof FabricaHonda) {
            SUV CRV = (SUV) ((FabricaHonda) fabricaHonda).createSUV();
            CRV.displayInfo();

        }
    }
}

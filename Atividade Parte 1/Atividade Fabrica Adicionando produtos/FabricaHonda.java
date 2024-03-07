class FabricaHonda implements FabricaDeCarros {
    @Override
    public Sedan createSedan() {
        return new Civic();
    }

    @Override
    public SUV createSUV() {
        return new HRV(); // Agora inclui o HRV
    }
}
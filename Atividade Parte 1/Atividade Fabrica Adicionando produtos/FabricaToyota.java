class FabricaToyota implements FabricaDeCarros {
    @Override
    public Sedan createSedan() {
        return new Corolla();
    }

    @Override
    public SUV createSUV() {
        return new CorollaCross();
    }
}
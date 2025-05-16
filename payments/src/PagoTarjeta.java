class PagoTarjeta extends MetodoPago implements Autenticable {
    private double saldoTarjeta;

    public PagoTarjeta(double monto, double saldoTarjeta) {
        super(monto);
        this.saldoTarjeta = saldoTarjeta;
    }

    @Override
    public boolean autenticar() {
        return saldoTarjeta >= monto;
    }

    @Override
    public void procesarPago() {
        System.out.println("Processing card payment for $" + monto);
    }
}

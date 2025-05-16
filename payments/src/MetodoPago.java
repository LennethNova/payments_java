// interface

interface Autenticable {
    boolean autenticar();
}

// clase
abstract class MetodoPago{
    protected double monto;

    public MetodoPago(double monto) {
        this.monto = monto;
    }
    public abstract void procesarPago();

    public void mostrarResumen() {
        System.out.println("Type: " + this.getClass().getSimpleName() + " - Monto: $" + monto);
    }
}
public class CajaRegistradora {
    public static void main(String[] args){
        MetodoPago[] pagos = {
                new PagoEfectivo(150.00),
                new PagoTarjeta(320.00, 500.00),
                new PagoTransferencia(400.00, false)
        };

        for (MetodoPago pago:pagos) {
            Autenticable auth = (Autenticable) pago;
            if (auth.autenticar()) {
                System.out.println("Sucessful authentication");
                pago.procesarPago();
                pago.mostrarResumen();
                System.out.println();
            } else {
                System.out.println("Unsuccessful authentication. " + pago.getClass().getSimpleName() + " not valid. \n");
            }
        }
    }
}

public class Conversor {
//
//    private double monto = 0;
//    private String monedaOrigen;
//    private String monedaDestino;
    private Divisas divisas;
    private ConsultaDivisa consulta;
    double resultado = 0;

//    public String getMonedaOrigen() {
//        return monedaOrigen;
//    }
//
//    public void setMonedaOrigen(String monedaOrigen) {
//        this.monedaOrigen = monedaOrigen;
//    }
//
//    public String getMonedaDestino() {
//        return monedaDestino;
//    }
//
//    public void setMonedaDestino(String monedaDestino) {
//        this.monedaDestino = monedaDestino;
//    }
//
//    public double getMonto() {
//        return monto;
//    }
//
//    public void setMonto(double monto) {
//        this.monto = monto;
//    }

    public Conversor() {
        consulta = new ConsultaDivisa();
//        divisas = consulta.buscaDivisas("ARS");

    }

    public double convertir(String monedaOrigen, String monedaDestino, double monto){
        divisas = consulta.buscaDivisas(monedaOrigen);
        return resultado = monto * divisas.getRate(monedaDestino);
    }

}

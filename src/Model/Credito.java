package Model;

import java.util.ArrayList;
import java.util.List;

public class Credito {

    List<Compra> listaCompras = new ArrayList();

    private double Saldo;

    public List<Compra> getListaCompras() {
        return listaCompras;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }
}

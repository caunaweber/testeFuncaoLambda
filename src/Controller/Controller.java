package Controller;

import Model.Compra;
import Model.Credito;
import View.View;

import java.util.Collections;
import java.util.function.Supplier;

public class Controller {
    public void exibeMenu() {

        int finalizador = 1;
        var cartao = new Credito();

        View.solicitaSaldo();
        cartao.setSaldo(View.sc.nextDouble());
        View.sc.nextLine();

        Supplier<String> solDesc = () -> {View.solicitaDescricao();return View.sc.nextLine();};

        Supplier<Double> solPreco = () -> {
            View.solicitaPreco();
            var valor = View.sc.nextDouble();
            if(cartao.getSaldo() - valor >= 0){
                return valor;
            }
            else {
                while(cartao.getSaldo() - valor < 0){
                    View.informaValorInvalido();
                    valor = View.sc.nextDouble();
                }
            }
            return valor;
        };

      while(finalizador == 1){

          View.informaSaldo(cartao.getSaldo());
          double preco;
          cartao.getListaCompras().add(new Compra(solDesc.get(), preco = solPreco.get()));
          cartao.setSaldo(cartao.getSaldo() - preco);

          View.solicitaFinalizador();
          finalizador = View.sc.nextInt();
          View.sc.nextLine();
       }

      Collections.sort(cartao.getListaCompras());
      Collections.reverse(cartao.getListaCompras());
      View.apresentaLista(cartao.getListaCompras());
   }
}

package View;

import Model.Compra;

import java.util.List;
import java.util.Scanner;

public class View {

    public static Scanner sc = new Scanner(System.in);

    public static void solicitaSaldo(){
        System.out.println("Digite o saldo da conta: ");
    }

    public static void informaSaldo(double saldo){
        if(saldo > 0){
            System.out.println("Saldo atual: " + saldo);
        }
        else{
            System.out.println("Saldo negativo./nSaldo atual: " + saldo);
        }
    }

    public static void solicitaDescricao(){
        System.out.println("Digite a descrição da compra: ");
    }

    public static void solicitaPreco(){
        System.out.println("Digite o preço da compra: ");
    }

    public static void informaValorInvalido(){
        System.out.println("Valor inválido./n Digite novamente: ");
    }

    public static void solicitaFinalizador(){
        System.out.println("Deseja adicionar outra compra? (1 para sim, 0 para não): ");
    }

    public static void apresentaLista(List<Compra> listaCompra){
        String lista = "";
        for(int i = 0; i < listaCompra.size(); i++){
            lista += "Compra ("+(i+1)+"): \nDescrição: "+listaCompra.get(i).getDescricao()
            + " Preço: "+listaCompra.get(i).getPreco()+"\n";
        }
        System.out.println("Lista de compras ordenada por preço:\n" + lista );
    }
}

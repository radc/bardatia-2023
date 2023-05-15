package bardatia2023;

import java.time.LocalDate;

public class BarDaTia2023 {

    public static void main(String[] args) {
        Conta m;
        m = new Conta();
        
        //Atribuindo valores aos atributos
        m.id = 0;
        m.nome = "Murilo";
        m.email = "murilinho1998@gmail.com";
        m.telefone = "53987654321";
        m.saldoDevedor = 0;
        m.dataCriacaoConta = LocalDate.now();
        m.servidor = false;
                
        m.acrescentarDivida(10);
        m.acrescentarDivida(20);
        m.pagarDivida(15);
        m.acrescentarDivida(-5);
        m.pagarDivida(-5);
        m.zerarDivida();
        m.acrescentarDivida(5);
        
        System.out.println(m.saldoDevedor);
    }
    
}

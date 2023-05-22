package bardatia2023;

import java.time.LocalDate;

public class BarDaTia2023 {

    public static void main(String[] args) {
        
        Conta c;
        c = new Conta();
        
        Conta b;
        b = new Conta();
        
   
        c.nome = "Luan";
        c.id = 1;
        c.saldoDevedor = 0;
        c.acrescentarDivida(5);
        c.pagarDivida(2);
        c.colocarJuros();
                
        System.out.println("O " + c.nome + " deve R$" + c.saldoDevedor);
        
        
        
        
        
        
        /*
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
        
        
        System.out.println(m.saldoDevedor);//15
        m.colocarJuros(); 
        System.out.println(m.saldoDevedor);
        System.out.println(m.dataCriacaoContaFormatada());
        System.out.println(m.diaCriacaoConta());
    */
    }
    
}

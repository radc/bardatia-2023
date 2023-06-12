
package bardatia2023;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Conta {
    private int id; //Identificação da conta
    private String nome; //Identifica nome da Conta
    private String telefone; //Telefone
    private String email; //E-mail
    private double saldoDevedor; //Quanto a pessoa deve
    private LocalDate dataCriacaoConta; //Armazena a data de criação da conta
    private boolean servidor; //Identifica se é servidor ou aluno
    
    public void acrescentarDivida(double valor){
        if(valor > 0){
            if(valor + saldoDevedor <= 30){
                saldoDevedor = saldoDevedor + valor;
            }else{
                System.out.println("Erro: Saldo Devedor não pode ser superior a R$30,00");
            }            
        }else{
            System.out.println("Erro: Não é possível acrescentar com valor inferior a zero!");
        }        
    }
    
    public void pagarDivida(double valor){
        if(valor > 0){
            if(valor <= saldoDevedor){ //valor - saldoDevedor <= 0                
                saldoDevedor -= valor; //saldoDevedor = saldoDevedor - valor;
            }else{
                System.out.println("Erro: Não é possível deixar saldo devedor negativo!");
            }
        }else{
            System.out.println("Erro: Não é possível pagar com valor inferior a zero!");
        }
    }
    
    public void zerarDivida(){
        saldoDevedor = 0;
    }
        
    public void colocarJuros(){
        saldoDevedor = saldoDevedor * 1.05; 
    }
    
    public int diaCriacaoConta(){
        return dataCriacaoConta.getDayOfMonth();
    }
    
    public String dataCriacaoContaFormatada(){
        //retorna data no estilo 15/05/2023
        return dataCriacaoConta.format(
                DateTimeFormatter.ofPattern("dd/MM/yyyy"));   
    }
    //github.com/radc
    //criar método colocar juros, que aumenta a divida em 5%
    //criar método que retorne o dia do mês de criação da conta em int
    //criar método que retorne a data de criação da conta no formato dd/MM/yyyy
    //2023-05-12 12/05/2023 DataTimeFormatter
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getSaldoDevedor(){
        return saldoDevedor;
    }
    
    public void setSaldoDevedor(double novoSaldo){
        if(novoSaldo >= 0 && novoSaldo <= 25){
            saldoDevedor = novoSaldo;
        }
    }
    
}

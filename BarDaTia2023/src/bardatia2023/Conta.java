
package bardatia2023;

import java.time.LocalDate;

public class Conta {
    int id; //Identificação da conta
    String nome; //Identifica nome da Conta
    String telefone; //Telefone
    String email; //E-mail
    double saldoDevedor; //Quanto a pessoa deve
    LocalDate dataCriacaoConta; //Armazena a data de criação da conta
    boolean servidor; //Identifica se é servidor ou aluno
    
    void acrescentarDivida(double valor){
        if(valor > 0){
            saldoDevedor = saldoDevedor + valor;
        }else{
            System.out.println("Erro: Não é possível acrescentar com valor inferior a zero!");
        }
        
    }
}

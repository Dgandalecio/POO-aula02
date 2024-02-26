/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.contacorrente;

/**
 *
 * @author diogo
 */
public class ContaCorrente {

    public static void main(String[] args) {
        Conta conta =new Conta();
        
       
        conta.Cliente("Diogo", "Rua1","708.874.711.86", "(64)993038989");
        System.out.println("nome: "+conta.nome);
        System.out.println("endereco: "+conta.endereco);
        System.out.println("cpf: "+conta.cpf);
        System.out.println("telefone: "+conta.telefone
        );
        conta.Saldo(1000); // Digite o saldo que tem na conta :)
        System.out.println("Saldo: " +conta.saldo);
        
        if(conta.Sacar(300)){
        System.out.println("Valor sacado: "+conta.aux);
        System.out.println("saldo dps do saque: "+conta.saldo);
        }
        else{
            System.out.println("saldo insuficiente");
        }
    
        conta.Depositar(200);
        System.out.println("Valor depositado: "+conta.aux);
        System.out.println("Saldo dps do deposito: "+conta.saldo);
        
       if (conta.Transferir(300)) {
        System.out.println("Transferência no valor de: " + conta.aux + " realizada com sucesso");
        System.out.println("Saldo dps da transferência: " + conta.saldo);
    
        }
       else {
        System.out.println("saldo insuficiente");
        }
    }
}

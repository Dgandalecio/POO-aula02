/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contacorrente;


/**
 *
 * @author diogo
 */
public class Conta {
    
    
    String nome;
    String endereco;
    String cpf;
    String telefone;
    int saldo;
    int aux;
    
    
        public void Cliente(String nome, String endereco, String cpf, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.telefone = telefone;
    }
 
    
        public void Saldo(int saldoInicial){
        if(saldoInicial >= 0){
            saldo = saldoInicial;
        }
      
  
}
    
    public boolean Sacar(int valor){
 
        if(valor>0 && valor<= saldo){
         
            saldo-= valor;
            aux= valor;
            return true;
        }else{
       return false;
            
        }
       
        
    }
    
    boolean Depositar(int valor){
        if(valor>0){
            saldo+= valor;
             aux= valor;
             return true;
        }
        else{
       return false;
       
    }
    }
    
    boolean Transferir(int valor){
        if(valor>0 && valor<= saldo){
            saldo-= valor;  
            aux= valor;
  return true;
    } 
        else{
       return false;
       
    }
}
}
    


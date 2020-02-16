package exercício1_lp1_ighor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ighor
 */
public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    
    
    public String GetNome(){
        return nome;
    }
    public void SetNome(String nome){
        if(nome.isEmpty()){
            System.out.println("Nome Inválido");
        }
        else{
        this.nome = nome;
        }
    }
    
    
    
    public double GetNota1(){
        return nota1;
    }
    
    public void SetNota1(double nota1){
        if(nota1 < 0 || nota1 > 10){
            System.out.println("Nota Inválida");
        }
        else{
            this.nota1 = nota1;
        }
    }
    
    
    
    
    
    public double GetNota2(){
        return nota2;
    }
    
    public void SetNota2(double nota2){
        if(nota2 < 0 || nota2 > 10){
            System.out.println("Nota Inválida");
        }
        else{
            this.nota2 = nota2;
        }
    }
    
    
    
    public double GetMedia(){
        return (nota1 + nota2) / 2;
    }
}

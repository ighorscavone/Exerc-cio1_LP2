/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício1_lp1_ighor;

import java.util.Scanner;

/**
 *
 * @author Ighor
 */
public class Exercício1_LP1_Ighor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno a = new Aluno();
        System.out.println("--CADASTRO DE ALUNOS--");
        Scanner scan = new Scanner(System.in);
        
        
        do{
        System.out.println("DIGITE O NOME DO ALUNO");
        a.SetNome(scan.nextLine());
        }
        while(a.GetNome() == null);
        
        
        do{
        System.out.println("DIGITE A N1 DO ALUNO");
        a.SetNota1(Double.valueOf(scan.nextLine()));
        }
        while(a.GetNota1() == 0.0);
                
        do{
        System.out.println("DIGITE A N2 DO ALUNO");
        a.SetNota2(Double.valueOf(scan.nextLine()));
        }
        while(a.GetNota2() == 0.0);
         
        System.out.println("Nome do aluno: " + a.GetNome());
        System.out.println("N1 do aluno: " + a.GetNota1());
        System.out.println("N2 do aluno: " + a.GetNota2());
        System.out.println("Média do aluno: " + a.GetMedia());
    }
    
}

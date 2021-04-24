package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numerosVencedor1 = 1+(int)(Math.random()*24);
        int numeroVencedor2 = 1+(int)(Math.random()*24);
        int numeroVencedor3 = 1+(int)(Math.random()*24);

        while(numerosVencedor1 == numeroVencedor2){
            numeroVencedor2 = 1+(int)(Math.random()*24);
        }

        while( numeroVencedor3 == numeroVencedor2 || numeroVencedor3 == numerosVencedor1){
            numeroVencedor3 = 1+(int)(Math.random()*24);
        }

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Qual o seu nome completo?");
        String nome = keyboard.nextLine();

        System.out.println("Qual o seu primeiro numero?(Favor informar um numero entre 1 e 24)");
        int apostaUsuario1 = keyboard.nextInt();

        while(apostaUsuario1 < 1 || apostaUsuario1 > 24){
            System.out.println("Informe um numero valido entre 1 e 24");
            apostaUsuario1 = keyboard.nextInt();
        }

        System.out.println("Qual o seu segundo numero?(Favor informar um numero entre 1 e 24)");
        int apostaUsuario2 = keyboard.nextInt();

        while(apostaUsuario2 < 1 || apostaUsuario2 > 24 || apostaUsuario2 == apostaUsuario1){
            System.out.println("Informe um numero valido entre 1 e 24 e diferente do primeiro numero");
            apostaUsuario1 = keyboard.nextInt();
        }

        System.out.println("Qual o seu terceiro numero?(Favor informar um numero valido entre 1 e 24)");
        int apostaUsuario3 = keyboard.nextInt();

        while (apostaUsuario3 < 1 || apostaUsuario3 > 24 || apostaUsuario3 == apostaUsuario2 || apostaUsuario3 == apostaUsuario1){
            System.out.println("Favor informar um numero valido entre 1 e 24, que seja diferente dos numeros anteriores:");
            apostaUsuario3 = keyboard.nextInt();
        }

        System.out.println("Os numeros da loteria sao:"+numerosVencedor1+","+numeroVencedor2+","+numeroVencedor3);

        boolean primeiroAcerto = (apostaUsuario1 == numerosVencedor1 || apostaUsuario1 == numeroVencedor2 || apostaUsuario1 == numeroVencedor3);
        boolean segundoAcerto = (apostaUsuario2 == numerosVencedor1 || apostaUsuario2 == numeroVencedor2 || apostaUsuario2 == numeroVencedor3);
        boolean terceiroAcerto = (apostaUsuario3 == numerosVencedor1 || apostaUsuario3 == numeroVencedor2 || apostaUsuario3 == numeroVencedor3);

        if(primeiroAcerto && segundoAcerto && terceiroAcerto){
            System.out.println("Caro "+nome+", Seus numeros escolhidos sao :"+apostaUsuario1+","+apostaUsuario2+","+apostaUsuario3+", Parabens voce ganhou o primeiro lugar");
        } if (primeiroAcerto && segundoAcerto || primeiroAcerto && terceiroAcerto || segundoAcerto && terceiroAcerto){
            System.out.println("Caro "+nome+", Seus numeros escolhidos sao :"+apostaUsuario1+","+apostaUsuario2+","+apostaUsuario3+", Parabens voce ganhou o segundo lugar");
        } if (primeiroAcerto || segundoAcerto || terceiroAcerto){
            System.out.println("Caro "+nome+", Seus numeros escolhidos sao :"+apostaUsuario1+","+apostaUsuario2+","+apostaUsuario3+", Parabens voce ganhou o terceiro lugar");
        } else {
            System.out.println("Boa sorte na proxima!");
        }



    }
}

package br.com.arneidias;
/*
Varíaveis tipos primitivos
 */
public class TiposPrimitivos {

    private int number = 10;
    private  double num = 12.5;
    private boolean vddOrfals = false;
    private long id = 128;
    private float valorDecimal = 10.1f;
    private short shor = 'f';
    private byte by = 2;
    private char letter = 'A';

    public static void main(String args[]){

        //Realizando a conversão variavel tipo primitivo para tipo wrapper
        int n = 28;
        System.out.println("Tipo primitivo: "+n);
        Integer numb = (Integer) n;
        System.out.println("Tipo wrapper: "+numb);
    }
}

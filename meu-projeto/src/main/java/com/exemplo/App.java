package com.exemplo;

import com.exemplo.dominio.Pessoa;

public class App 
{
    public static void main( String[] args )
    {
        Pessoa p1 = new Pessoa(1, "Camila Pereira", "camila@gmail.com");
        Pessoa p2 = new Pessoa(2, "Wesley Pereira", "wesley@gmail.com");
        Pessoa p3 = new Pessoa(3, "Neusa Pereira", "neusa@gmail.com");

        System.err.println(p1);
        System.err.println(p2);
        System.err.println(p3);
    }
}

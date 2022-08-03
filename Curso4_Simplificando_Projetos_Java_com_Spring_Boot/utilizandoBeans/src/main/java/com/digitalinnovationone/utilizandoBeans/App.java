package com.digitalinnovationone.utilizandoBeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

    public static void main(String[] args) {

        AbstractApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Livro livro = factory.getBean(Livro.class);
        livro.setNome("Saco de Ossos");
        livro.setCodigo("XB96F7");

        Autor autor = factory.getBean(Autor.class);
        autor.setNome("Stephen King");

        livro.exibir();

        ((AbstractApplicationContext) factory).close();
    }
}

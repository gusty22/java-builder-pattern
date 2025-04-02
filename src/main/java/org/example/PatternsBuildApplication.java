package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternsBuildApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatternsBuildApplication.class, args);

        IBuilderCasa builderCasa = new Casa2Quartos();
        builderCasa.buildQuartos();
        builderCasa.buildBanheiros();
        builderCasa.buildChurrasqueira();

        Casa casa1 = builderCasa.getCasa();
        System.out.println("br.edu.imepac.builder.Casa 1:");
        System.out.println("Quartos: " + casa1.getQuartos());
        System.out.println("Banheiros: " + casa1.getBanheiros());
        System.out.println("Churrasqueira: " + casa1.isChurrasqueira());

        builderCasa = new Casa2Quartos2BanheiroChurrasqueira();
        builderCasa.buildQuartos();
        builderCasa.buildBanheiros();
        builderCasa.buildChurrasqueira();

        Casa casa2 = builderCasa.getCasa();
        System.out.println("br.edu.imepac.builder.Casa 2:");
        System.out.println("Quartos: " + casa2.getQuartos());
        System.out.println("Banheiros: " + casa2.getBanheiros());
        System.out.println("Churrasqueira: " + casa2.isChurrasqueira());
    }
}

package kkfujita.dev.eventORG.core.usecases;

import java.util.Random;

public class gerarIdentificadorUsecaseImpl implements gerarIdentificadorUsecase {

    @Override
    public String executar() {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros = "0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        // Gera 3 letras aleatórias
        for (int i = 0; i < 3; i++) {
            sb.append(letras.charAt(random.nextInt(letras.length())));
        }

        // Gera 3 números aleatórios
        for (int i = 0; i < 3; i++) {
            sb.append(numeros.charAt(random.nextInt(numeros.length())));
        }

        return sb.toString();
    }
}

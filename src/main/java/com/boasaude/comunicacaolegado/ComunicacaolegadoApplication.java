package com.boasaude.comunicacaolegado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

import com.boasaude.comunicacaolegado.messaging.binding.EmissaoCobrancaSegundaViaCarteiraChannel;
import com.boasaude.comunicacaolegado.messaging.binding.SolicitacaoImpressaoCarteiraChannel;

@SpringBootApplication
@EnableBinding({EmissaoCobrancaSegundaViaCarteiraChannel.class, SolicitacaoImpressaoCarteiraChannel.class})
public class ComunicacaolegadoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComunicacaolegadoApplication.class, args);
    }
}

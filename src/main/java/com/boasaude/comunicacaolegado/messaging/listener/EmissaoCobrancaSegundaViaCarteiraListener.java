package com.boasaude.comunicacaolegado.messaging.listener;

import com.boasaude.comunicacaolegado.messaging.rabbitbinding.RabbitBinding;
import com.boasaude.comunicacaolegado.service.CarteiraService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class EmissaoCobrancaSegundaViaCarteiraListener {

    private final CarteiraService carteiraService;

    @StreamListener(RabbitBinding.SOLICITAR_COBRANCA_SEGUNDA_VIA_CARTEIRA_INPUT)
    public void emitirCobrancaSegundaViaCarteira(String id) {
        try {
            carteiraService.emitirCobrancaSegundaViaCarteira(id);
        } catch (Exception e) {
            log.error("Houve um erro ao processar a solicitação de cobrança de segunda via de carteira para o usuário: {}", id, e);
        }
    }

}

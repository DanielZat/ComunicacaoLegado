package com.boasaude.comunicacaolegado.messaging.listener;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

import com.boasaude.comunicacaolegado.messaging.rabbitbinding.RabbitBinding;
import com.boasaude.comunicacaolegado.service.CarteiraService;

@Component
@RequiredArgsConstructor
@Slf4j
public class SolicitacaoImpressaoCarteiraListener {

    private final CarteiraService carteiraService;

    @StreamListener(RabbitBinding.SOLICITAR_IMPRESSAO_CARTEIRA_INPUT)
    public void solicitarImpressaoCarteira(String id) {
        try {
            carteiraService.solicitarImpressaoCarteira(id);
        } catch (Exception e) {
            log.error("Houve um erro ao processar a solicitação de impressão de carteira para o usuário: {}", id, e);
        }
    }
}

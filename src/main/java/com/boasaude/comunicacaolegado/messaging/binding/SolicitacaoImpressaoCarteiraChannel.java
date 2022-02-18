package com.boasaude.comunicacaolegado.messaging.binding;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

import com.boasaude.comunicacaolegado.messaging.rabbitbinding.RabbitBinding;

public interface SolicitacaoImpressaoCarteiraChannel {

    @Input(RabbitBinding.SOLICITAR_IMPRESSAO_CARTEIRA_INPUT)
    SubscribableChannel solicitacaoImpressaoCarteiraInput();
}

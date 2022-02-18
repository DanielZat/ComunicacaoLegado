package com.boasaude.comunicacaolegado.messaging.binding;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

import com.boasaude.comunicacaolegado.messaging.rabbitbinding.RabbitBinding;

public interface EmissaoCobrancaSegundaViaCarteiraChannel {

    @Input(RabbitBinding.SOLICITAR_COBRANCA_SEGUNDA_VIA_CARTEIRA_INPUT)
    SubscribableChannel emissaoCobrancaSegundaViaCarteiraInput();
}

package com.boasaude.comunicacaolegado.messaging.rabbitbinding;

public final class RabbitBinding {

    private RabbitBinding() {
        throw new IllegalStateException("Utility class");
    }

    public static final String SOLICITAR_IMPRESSAO_CARTEIRA_INPUT = "solicitar-impressao-carteira-event";
    public static final String SOLICITAR_COBRANCA_SEGUNDA_VIA_CARTEIRA_INPUT = "solicitar-cobranca-segunda-via-carteira-event";
}

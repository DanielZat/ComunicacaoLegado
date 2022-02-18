package com.boasaude.comunicacaolegado.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class CarteiraService {

    public void solicitarImpressaoCarteira(String id) {

        // TODO: AQUI SERIA REALIZADA A COMUNICAÇÃO COM SISTEMAS LEGADOS AFIM DE INTEGRAR A NOVA ARQUITETURA PROPOSTA AOS SISTEMAS JÁ EXISTENTES
        log.info("Impressão realizada com sucesso para o usuário: {}", id);
    }

    public void emitirCobrancaSegundaViaCarteira(String id) {

        // TODO: AQUI SERIA REALIZADA A COMUNICAÇÃO COM SISTEMAS LEGADOS AFIM DE INTEGRAR A NOVA ARQUITETURA PROPOSTA AOS SISTEMAS JÁ EXISTENTES
        log.info("Solicitação de cobrança realizada com sucesso para o usuário: {}", id);
    }
}

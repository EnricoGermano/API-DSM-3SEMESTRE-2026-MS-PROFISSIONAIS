package br.com.chronos.profissionais.controle.dto;

public record ProfissionalResposta(
        Integer id,
        String nome,
        String email,
        Boolean ativo,
        Integer cargoId
) {
}

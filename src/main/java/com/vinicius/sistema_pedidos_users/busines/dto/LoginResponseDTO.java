package com.vinicius.sistema_pedidos_users.busines.dto;

public record LoginResponseDTO(
        boolean logado,
        String mensagem,
        String usuario,
        String email
) {}

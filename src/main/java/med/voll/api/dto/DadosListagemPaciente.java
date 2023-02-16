package med.voll.api.dto;

import med.voll.api.domain.entity.Paciente;

public record DadosListagemPaciente(Long id, String nome, String email, String telefone) {

    public DadosListagemPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getTelefone());
    }


}

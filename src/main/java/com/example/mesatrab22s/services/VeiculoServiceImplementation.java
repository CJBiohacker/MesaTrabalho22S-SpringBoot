package com.example.mesatrab22s.services;

import com.example.mesatrab22s.models.Veiculo;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class VeiculoServiceImplementation implements VeiculoService{

    @Override
    public List<Veiculo> listaVeiculo() {
        return Arrays.asList(new Veiculo("Jeep", "Azul"), new Veiculo("Wolkswagen", "Vermelho"));
    }
}

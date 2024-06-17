package top.anyel.querys.servicies_appd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.anyel.querys.repositories_appd.CalculadoraRepositoryAppd;

@Service
public class CalculadoraServiceAppd {
    @Autowired
    private CalculadoraRepositoryAppd calculadoraRepositoryAppd;

    public int sumar(int a, int b) {
        return calculadoraRepositoryAppd.sumar(a, b);
    }

    public int restar(int a, int b) {
        return calculadoraRepositoryAppd.restar(a, b);
    }

    public int multiplicar(int a, int b) {
        return calculadoraRepositoryAppd.multiplicar(a, b);
    }

    public int dividir(int a, int b) {
        return calculadoraRepositoryAppd.dividir(a, b);
    }


}

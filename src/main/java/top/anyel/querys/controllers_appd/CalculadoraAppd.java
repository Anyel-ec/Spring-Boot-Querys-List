package top.anyel.querys.controllers_appd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.anyel.querys.repositories_appd.GenerateRepositoryAppd;
import top.anyel.querys.servicies_appd.CalculadoraServiceAppd;

@RestController
@RequestMapping("/appd/calculator")
public class CalculadoraAppd {
    @Autowired
    private CalculadoraServiceAppd calculadoraServiceAppd;
    private GenerateRepositoryAppd generateRepositoryAppd;



    public int a = generateRepositoryAppd.generateNumberRamdon();
    public int b = generateRepositoryAppd.generateNumberRamdon();
    @GetMapping("/sumar")
    public int sumar(int a, int b){
        return calculadoraServiceAppd.sumar(a, b);
    }

    @GetMapping("/restar")
    public int restar(int a, int b){
        return calculadoraServiceAppd.restar(a, b);
    }


    @GetMapping("/multiplicar")
    public int multiplicar(int a, int b){
        return calculadoraServiceAppd.multiplicar(a, b);
    }

    @GetMapping("/dividir")
    public int dividir(int a, int b){
        return calculadoraServiceAppd.dividir(a, b);
    }
    
    
}

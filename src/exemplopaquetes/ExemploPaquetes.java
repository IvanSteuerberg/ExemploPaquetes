package exemplopaquetes;

import triangulo.AreaTriangulo;
import triangulo.PerimetroTriangulo;
import circulo.*; //importo todas as clases do paquete
import rectangulo.*;

/**
 *
 * @author irodriguezsteuerberg
 */
public class ExemploPaquetes {

    public static void main(String[] args) {
    
    AreaTriangulo tri = new AreaTriangulo();   
    tri.areaTriangulo(6, 2);
    PerimetroTriangulo per = new PerimetroTriangulo();
    per.perTrianguloIsosceles(6, 2);
    AreaCirculo cir = new AreaCirculo();
    cir.superficieCirculo(5);
    LonxitudeCirculo cir2 = new LonxitudeCirculo();
    cir2.lonxitude(5);
    MeusMetodos aux = new MeusMetodos();
    float base=aux.validarFloatPositivo();
    float altura=aux.validarFloatPositivo();
    Area rec = new Area();
    rec.areaRectangulo(base, altura);
    //utilizando metodos de clase static
    float b = MeusMetodos.darValor();
    float alt = MeusMetodos.darValor();
    rec.areaRectangulo(b, alt);
    //simplificando
    rec.areaRectangulo(MeusMetodos.darValor(), MeusMetodos.darValor());
    
    }
    
}

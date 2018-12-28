import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {

    private static final Logger LOGGER = LoggerFactory.getLogger(Tests.class);


    @Test(enabled = false)
    public void pruebaBasicaPeon() {
        LOGGER.info("START-TEST pruebaBasicaPeon");
        Peon pepe = new Peon(false, 1000,false);
        Peon teresa = new Peon(false,1000,false);

        pepe.setDonaSueldo(false);
        teresa.setDonaSueldo(true);
        teresa.setCantidadDonada(2000.0);


        pepe.calcularSueldoBruto();
        teresa.calcularSueldoBruto();

        pepe.calcularSueldoNeto();
        teresa.calcularSueldoNeto();

        Assert.assertEquals(pepe.getValorHora(),300.0);
        Assert.assertEquals(teresa.getValorHora(),300.0);
        Assert.assertEquals(pepe.getSueldoBruto(),300000.0);
        Assert.assertEquals(teresa.getSueldoBruto(),300000.0);
        Assert.assertEquals(pepe.getSueldoNeto(),243600.0);
        Assert.assertEquals(teresa.getSueldoNeto(),243708.0);
        LOGGER.info("FINISH-TEST pruebaBasicaPeon");
    }

    @Test(enabled = false)
    public void pruebaBasicaMedioOficial() {
        LOGGER.info("START-TEST pruebaBasicaMedioOficial");
        MedioOficial pepe = new MedioOficial(false, 100,true);

        pepe.calcularSueldoBruto();

        pepe.setCantidadDonada(1.0);
        pepe.calcularSueldoNeto();

        Assert.assertEquals(pepe.getValorHora(),315.0);
        Assert.assertEquals(pepe.getSueldoBruto(),31500.0);
        Assert.assertEquals(pepe.getSueldoNeto(),26115.0);
        LOGGER.info("FINISH-TEST pruebaBasicaMedioOficial");
    }

    @Test(enabled = false)
    public void pruebaBasicaOficial() {
        LOGGER.info("START-TEST pruebaBasicaOficial");
        Oficial pepe = new Oficial(false, 100, false,true);


        pepe.calcularSueldoBruto();
        pepe.calcularSueldoNeto();

        Assert.assertEquals(pepe.getValorHora(),330.0);
        Assert.assertEquals(pepe.getSueldoBruto(),42900.0);
        Assert.assertEquals(pepe.getSueldoNeto(),35349.0);
        LOGGER.info("FINISH-TEST pruebaBasicaOficial");
    }

    @Test(enabled = false)
    public void pruebaBasicaCapataz(){
        LOGGER.info("START-TEST pruebaBasicaCapataz");
        Capataz pepe = new Capataz(false, 100, true,true);

        pepe.calcularSueldoBruto();

        pepe.setCantidadDonada(1000.0);
        pepe.calcularSueldoNeto();

        Assert.assertEquals(pepe.getValorHora(),330.0);
        Assert.assertEquals(pepe.getSueldoBruto(),46900.0);
        Assert.assertEquals(pepe.getSueldoNeto(),38592.38);
        LOGGER.info("FINISH-TEST pruebaBasicaCapataz");
    }

    @Test(enabled = true)
    public void pruebaBasicaEmpresa(){
        LOGGER.info("START-TEST pruebaBasicaEmpresa");
        Peon pepe = new Peon(false, 100, false);
        Peon pepita = new Peon(true,100,true);
        MedioOficial pepon = new MedioOficial(false,100,false);
        Oficial jose = new Oficial(false,100,false,true);
        Capataz josele = new Capataz(true,200,true,true);


        pepe.calcularSueldoBruto();
        pepita.calcularSueldoBruto();
        pepon.calcularSueldoBruto();
        jose.calcularSueldoBruto();
        josele.calcularSueldoBruto();

        System.out.println(pepe.getSueldoBruto());
        System.out.println(pepita.getSueldoBruto());
        System.out.println(pepon.getSueldoBruto());
        System.out.println(jose.getSueldoBruto());
        System.out.println(josele.getSueldoBruto());

        pepita.setCantidadDonada(1000.0);
        josele.setCantidadDonada(3000.0);

        pepe.calcularSueldoNeto();
        pepita.calcularSueldoNeto();
        pepon.calcularSueldoNeto();
        jose.calcularSueldoNeto();
        josele.calcularSueldoNeto();

        System.out.println(pepe.getSueldoNeto());
        System.out.println(pepita.getSueldoNeto());
        System.out.println(pepon.getSueldoNeto());
        System.out.println(jose.getSueldoNeto());
        System.out.println(josele.getSueldoNeto());

//        System.out.println(pepe.getClass());

        List<Empleado> empleadoList = new ArrayList<>();
        empleadoList.add(pepe);
        empleadoList.add(pepita);
        empleadoList.add(pepon);
        empleadoList.add(jose);
        empleadoList.add(josele);


        Empresa empresa = new Empresa(empleadoList);

        System.out.println(empresa.empleadoMasBarato());
        System.out.println(empresa.empleadoMasCaro());
        System.out.println(empresa.cantidadEmpleados());
        System.out.println(empresa.mediaSueldoBruto());
        System.out.println(empresa.cantidadPorTipoEmpleado());
        System.out.println(empresa.promedioSueldoBrutoPorTipoEmpleado());


        Assert.assertEquals(empresa.empleadoMasBarato(),pepita);
        Assert.assertEquals(empresa.empleadoMasCaro(),josele);
        Assert.assertEquals(empresa.cantidadEmpleados(),Long.valueOf(5));
        Assert.assertEquals(empresa.mediaSueldoBruto(),34531.576);
//        Assert.assertEquals(empresa.cantidadPorTipoEmpleado(),);
        LOGGER.info("FINISH-TEST pruebaBasicaEmpresa");
    }

}
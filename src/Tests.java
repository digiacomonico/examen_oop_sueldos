import java.util.ArrayList;
import java.util.List;

public class Tests {


    public static void main(String[] args) {
        Tests aTest = new Tests();
//        aTest.pruebaBasicaPeon();
//        aTest.pruebaBasicaMedioOficial();
        aTest.pruebaBasicaEmpresa();
//        aTest.pruebaBasicaCapataz();
        //aTest.materiaConCorrelativasDesaprobadas();
        //aTest.materiaTrabajoFinalConCreditosInsuficientes();
        //aTest.pruebasAnoLectivo();
    }


//    public void pruebaBasicaEmpleado() {
//
//        Empleado pepe = new Empleado(false,101);
////        pepe.setValorHora(300);
//        System.out.println(pepe.getValorHora());
////        pepe.setHorasTrabajadas(3);
//        System.out.println(pepe.getHorasTrabajadas());
//        pepe.calcularSueldoBruto();
//        System.out.println(pepe.getSueldoBruto());
//
//        pepe.calcularSueldoNeto();
//        System.out.println(pepe.getSueldoNeto());
//        System.out.println(pepe.getClass());
//
//
//    }


    public void pruebaBasicaPeon() {
        Peon pepe = new Peon(false, 1000,false);
        Peon teresa = new Peon(false,1000,false);

        pepe.setDonaSueldo(false);
        teresa.setDonaSueldo(true);
        teresa.setCantidadDonada(2000.0);


        pepe.calcularSueldoBruto();
        teresa.calcularSueldoBruto();
        System.out.println(pepe.getSueldoBruto());
        System.out.println(teresa.getSueldoBruto());

        pepe.calcularSueldoNeto();
        teresa.calcularSueldoNeto();
        System.out.println(pepe.getSueldoNeto());
        System.out.println(teresa.getSueldoNeto());
        System.out.println(pepe.getClass());


    }


    public void pruebaBasicaMedioOficial() {
        MedioOficial pepe = new MedioOficial(false, 100,true);

        System.out.println(pepe.getValorHora());
        System.out.println(pepe.getHorasTrabajadas());
        pepe.calcularSueldoBruto();
        System.out.println(pepe.getSueldoBruto());

        pepe.setCantidadDonada(1.0);
        pepe.calcularSueldoNeto();
        System.out.println(pepe.getSueldoNeto());
        System.out.println(pepe.getClass());


    }
//
    public void pruebaBasicaOficial() {

        Oficial pepe = new Oficial(false, 100, false,true);

        System.out.println(pepe.getValorHora());
        System.out.println(pepe.getHorasTrabajadas());
        pepe.calcularSueldoBruto();
        System.out.println(pepe.getSueldoBruto());

        pepe.calcularSueldoNeto();
        System.out.println(pepe.getSueldoNeto());
        System.out.println(pepe.getClass());

    }
//
    public void pruebaBasicaCapataz(){
        Capataz pepe = new Capataz(false, 100, true,true);

        System.out.println(pepe.getValorHora());
        System.out.println(pepe.getHorasTrabajadas());
        pepe.calcularSueldoBruto();
        System.out.println(pepe.getSueldoBruto());

        pepe.setCantidadDonada(1000.0);
        pepe.calcularSueldoNeto();
        System.out.println(pepe.getSueldoNeto());
        System.out.println(pepe.getClass());
    }
//
    public void pruebaBasicaEmpresa(){
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


    }

}
import java.util.ArrayList;
import java.util.List;

public class Tests {

    /*
    Queremos implementar un sistema que permita realizar la inscripción a materias de una
    Universidad.
    De cada materia hay un único curso y el programa tiene sólo información de la inscripción actual,
    no nos interesan inscripciones anteriores. Debemos conocer el historial de materias aprobadas de un
    estudiante. De cada materia aprobada hay que saber qué materia aprobó y con qué nota.
     */


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


    public void pruebaBasicaEmpleado() {

        Empleado pepe = new Empleado(false,101,300.0);
//        pepe.setValorHora(300);
        System.out.println(pepe.getValorHora());
//        pepe.setHorasTrabajadas(3);
        System.out.println(pepe.getHorasTrabajadas());
        pepe.calcularSueldoBruto();
        System.out.println(pepe.getSueldoBruto());

        pepe.calcularSueldoNeto();
        System.out.println(pepe.getSueldoNeto());
        System.out.println(pepe.getClass());


    }


    public void pruebaBasicaPeon() {
        Peon pepe = new Peon(false, 100, 300.0);

        System.out.println(pepe.getValorHora());
//        pepe.setHorasTrabajadas(3);
        System.out.println(pepe.getHorasTrabajadas());
        pepe.calcularSueldoBruto();
        System.out.println(pepe.getSueldoBruto());

        pepe.calcularSueldoNeto();
        System.out.println(pepe.getSueldoNeto());
        System.out.println(pepe.getClass());


    }

    public void pruebaBasicaMedioOficial() {
        MedioOficial pepe = new MedioOficial(false, 100, 300.0);

        System.out.println(pepe.getValorHora());
        System.out.println(pepe.getHorasTrabajadas());
        pepe.calcularSueldoBruto();
        System.out.println(pepe.getSueldoBruto());

        pepe.calcularSueldoNeto();
        System.out.println(pepe.getSueldoNeto());
        System.out.println(pepe.getClass());


    }

    public void pruebaBasicaOficial() {

        Oficial pepe = new Oficial(false, 100, 300.0,true);

        System.out.println(pepe.getValorHora());
        System.out.println(pepe.getHorasTrabajadas());
        pepe.calcularSueldoBruto();
        System.out.println(pepe.getSueldoBruto());

        pepe.calcularSueldoNeto();
        System.out.println(pepe.getSueldoNeto());
        System.out.println(pepe.getClass());

    }

    public void pruebaBasicaCapataz(){
        Capataz pepe = new Capataz(false, 100, 300.0,true);

        System.out.println(pepe.getValorHora());
        System.out.println(pepe.getHorasTrabajadas());
        pepe.calcularSueldoBruto();
        System.out.println(pepe.getSueldoBruto());

        pepe.calcularSueldoNeto();
        System.out.println(pepe.getSueldoNeto());
        System.out.println(pepe.getClass());
    }

    public void pruebaBasicaEmpresa(){
        Peon pepe = new Peon(false, 100, 300.0);
        Peon pepita = new Peon(true,100,300.0);
        MedioOficial pepon = new MedioOficial(false,100,300.0);

        pepe.calcularSueldoBruto();
        pepita.calcularSueldoBruto();
        pepon.calcularSueldoBruto();

        System.out.println(pepe.getSueldoBruto());
        System.out.println(pepita.getSueldoBruto());
        System.out.println(pepon.getSueldoBruto());

        pepe.calcularSueldoNeto();
        pepita.calcularSueldoNeto();
        pepon.calcularSueldoNeto();

        System.out.println(pepe.getSueldoNeto());
        System.out.println(pepita.getSueldoNeto());
        System.out.println(pepon.getSueldoNeto());

//        System.out.println(pepe.getClass());

        List<Empleado> empleadoList = new ArrayList<>();
        empleadoList.add(pepe);
        empleadoList.add(pepita);
        empleadoList.add(pepon);


        Empresa empresa = new Empresa(empleadoList);

        System.out.println(empresa.empleadoMasBarato());
        System.out.println(empresa.empleadoMasCaro());
        System.out.println(empresa.cantidadEmpleados());
        System.out.println(empresa.mediaSueldoBruto());
        System.out.println(empresa.cantidadPorTipoEmpleado());
        System.out.println(empresa.promedioSueldoBrutoPorTipoEmpleado());


    }

}
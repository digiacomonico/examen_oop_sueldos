import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collector;

public class Empresa {

    private List<Empleado> empleados;

    public Empresa(List<Empleado> empleados) {
        this.empleados = empleados;
    }


    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void addEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public Empleado empleadoMasBarato(){
      return  empleados
                .stream()
                .min(Comparator.comparing(Empleado::getSueldoNeto))
                .orElseThrow(NoSuchElementException::new);
    }

    public Empleado empleadoMasCaro(){
        return  empleados
                .stream()
                .max(Comparator.comparing(Empleado::getSueldoNeto))
                .orElseThrow(NoSuchElementException::new);
    }

    public Long cantidadEmpleados(){
        return empleados
                .stream()
                .count();
    }

    public Double mediaSueldoBruto(){
        return (empleados
                .stream()
                .mapToDouble(Empleado::getSueldoNeto)
                .sum() /
                this.cantidadEmpleados());
    }

    public String cantidadPorTipoEmpleado(){
//        long cantidadPeon =
//                empleados
//                        .stream()
//                        .filter(e -> e.getClass().equals(Peon.class))
//                        .count();
//
//        long cantidadMedioOficial =
//                empleados
//                        .stream()
//                        .filter(e -> e.getClass().equals(MedioOficial.class))
//                        .count();
//
//        long cantidadOficial =
//                empleados
//                        .stream()
//                        .filter(e -> e.getClass().equals(Oficial.class))
//                        .count();
//
//        long cantidadCapataz =
//                empleados
//                        .stream()
//                        .filter(e -> e.getClass().equals(Capataz.class))
//                        .count();



        return "Cantidad de peones: " + this.cantidadPeones() + "\n" +
                "Cantidad de medio-oficiales: "  + this.cantidadMedioOficial() + "\n" +
                "Cantidad de oficiales: " + this.cantidadOficial() + "\n" +
                "Cantidad de capataces: " + this.cantidadCapataz();

    }

    private long cantidadPeones(){
        return empleados
                .stream()
                .filter(e -> e.getClass().equals(Peon.class))
                .count();
    }

    private long cantidadMedioOficial(){
        return empleados
                .stream()
                .filter(e -> e.getClass().equals(MedioOficial.class))
                .count();
    }

    private long cantidadOficial(){
        return empleados
                .stream()
                .filter(e -> e.getClass().equals(Oficial.class))
                .count();
    }

    private long cantidadCapataz(){
        return empleados
                .stream()
                .filter(e -> e.getClass().equals(Capataz.class))
                .count();
    }

    public String promedioSueldoBrutoPorTipoEmpleado(){
        double promedioSueldoBrutoPeon =
                (empleados
                        .stream()
                        .filter(e -> e.getClass().equals(Peon.class))
                        .mapToDouble(Empleado::getSueldoBruto)
                        .sum() / this.cantidadPeones());

        double promedioSueldoBrutoMedioOficial =
                (empleados
                        .stream()
                        .filter(e -> e.getClass().equals(MedioOficial.class))
                        .mapToDouble(Empleado::getSueldoBruto)
                        .sum() / this.cantidadMedioOficial());

        double promedioSueldoBrutoOficial =
                (empleados
                        .stream()
                        .filter(e -> e.getClass().equals(Oficial.class))
                        .mapToDouble(Empleado::getSueldoBruto)
                        .sum() / this.cantidadOficial());

        double promedioSueldoBrutoCapataz =
                (empleados
                        .stream()
                        .filter(e -> e.getClass().equals(Capataz.class))
                        .mapToDouble(Empleado::getSueldoBruto)
                        .sum() / this.cantidadCapataz());



        return "Promedio sueldo bruto de peones: " + promedioSueldoBrutoPeon + "\n" +
                "Promedio sueldo bruto de medio-oficiales: "  + promedioSueldoBrutoMedioOficial + "\n" +
                "Promedio sueldo bruto de oficiales: " + promedioSueldoBrutoOficial + "\n" +
                "Promedio sueldo bruto de capataces: " + promedioSueldoBrutoCapataz;

    }

    @Override
    public String toString() {
        return "Empresa{" +
                "empleados=" + empleados +
                '}';
    }
}

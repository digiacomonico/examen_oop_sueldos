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

    public Long cantidadPorTipoEmpleado(Empleado empleado){
        return empleados
                .stream()
                .filter(e -> e.getClass().equals(empleado.getClass()))
                .count();

    }

    public Double promedioSueldoBrutoPorTipoEmpleado(Empleado empleado){
        return
                (empleados
                        .stream()
                        .filter(e -> e.getClass().equals(empleado.getClass()))
                        .mapToDouble(Empleado::getSueldoBruto)
                        .sum() / this.cantidadPorTipoEmpleado(empleado));
    }



    @Override
    public String toString() {
        return "Empresa{" +
                "empleados=" + empleados +
                '}';
    }


}

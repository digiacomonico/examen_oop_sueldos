public class Peon extends Empleado {

    public Peon(Boolean afiliadoAlGremio, Integer horasTrabajadas,Boolean donaSueldo) {
        super(afiliadoAlGremio, horasTrabajadas,donaSueldo);
        this.setValorHora(300.0);
    }
}

public class Capataz extends Oficial {

    public Capataz(Boolean afiliadoAlGremio, Integer horasTrabajadas, Boolean cumplioObjetivos, Boolean donaSueldo) {
        super(afiliadoAlGremio, horasTrabajadas, cumplioObjetivos, donaSueldo);
    }

    @Override
    public void calcularSueldoBruto() {
        super.calcularSueldoBruto();
        this.setSueldoBruto(this.getSueldoBruto() + 4000);
    }
}

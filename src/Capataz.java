public class Capataz extends Oficial {

    public Capataz(Boolean afiliadoAlGremio, Integer horasTrabajadas, Double valorHora, Boolean cumplioObjetivos) {
        super(afiliadoAlGremio, horasTrabajadas, valorHora, cumplioObjetivos);
    }

    @Override
    public void calcularSueldoBruto() {
        super.calcularSueldoBruto();
        this.setSueldoBruto(this.getSueldoBruto() + 4000);
    }
}

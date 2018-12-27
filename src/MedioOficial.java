public class MedioOficial extends Peon {

    public MedioOficial(Boolean afiliadoAlGremio, Integer horasTrabajadas, Double valorHora) {
        super(afiliadoAlGremio, horasTrabajadas, valorHora);
        this.setValorHora(this.getValorHora() * 1.05);
    }

//    @Override
//    public void calcularSueldoBruto() {
//        super.calcularSueldoBruto();
//        this.setSueldoBruto(this.getSueldoBruto() * 1.05);
//    }

}

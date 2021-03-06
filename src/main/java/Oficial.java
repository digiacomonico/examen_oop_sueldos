public class Oficial extends Peon{

    private Boolean cumplioObjetivos;

    public Oficial(Boolean afiliadoAlGremio, Integer horasTrabajadas, Boolean donaSueldo, Boolean cumplioObjetivos) {
        super(afiliadoAlGremio, horasTrabajadas,donaSueldo);
        this.cumplioObjetivos = cumplioObjetivos;
        this.setValorHora(this.getValorHora() * 1.1);
    }

    @Override
    public void calcularSueldoBruto() {
        if(cumplioObjetivos){
            super.calcularSueldoBruto();
            this.setSueldoBruto(this.getSueldoBruto() * 1.3);
        }
        else super.calcularSueldoBruto();
    }
}

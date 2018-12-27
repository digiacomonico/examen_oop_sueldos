public class Empleado {

    private Double sueldoBruto;
    private Double sueldoNeto;
    private Boolean afiliadoAlGremio;
    private Integer horasTrabajadas;
    private Double valorHora;

    public Empleado() {

    }


    public Empleado(Boolean afiliadoAlGremio, Integer horasTrabajadas, Double valorHora) {
        this.afiliadoAlGremio = afiliadoAlGremio;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public Double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(Double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public Double getSueldoNeto() {
        return sueldoNeto;
    }

    public void setSueldoNeto(Double sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
    }

    public Boolean getAfiliadoAlGremio() {
        return afiliadoAlGremio;
    }

    public void setAfiliadoAlGremio(Boolean afiliadoAlGremio) {
        this.afiliadoAlGremio = afiliadoAlGremio;
    }

    public Integer getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(Integer horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public void calcularSueldoBruto()

    {
        sueldoBruto = Double.valueOf(valorHora )* Double.valueOf(horasTrabajadas);
    }

    public void calcularSueldoNeto() {
        Double ley19032 = this.getSueldoBruto()* 0.03; //sueldoBruto
        Double obraSocial = this.getSueldoBruto()* 0.03; //sueldoBruto
        Double aporteJubilatorio = this.getSueldoBruto() * 0.11; //sueldoBruto
        Double aporteGremio;
        Double retencionGanancias;

        if (this.afiliadoAlGremio) {
            aporteGremio = this.getSueldoBruto() * 0.1;
        } else aporteGremio = 0.0;

        if (this.sueldoBruto > 30000){
            double excedente = this.getSueldoBruto() - 30000;
            retencionGanancias = excedente * 0.02;
        } else retencionGanancias = 0.0;

        System.out.println("Sueldo Bruto: " + sueldoBruto);
        System.out.println("Aporte Ley 19032: " + ley19032);
        System.out.println("Aporte Obra Social: " + obraSocial);
        System.out.println("Aporte Jubilatorio: " + aporteJubilatorio);
        System.out.println("Aporte Gremio: " + aporteGremio);
        System.out.println("Retencion Ganancias: " + retencionGanancias);
        this.sueldoNeto = this.getSueldoBruto() - (ley19032 + obraSocial + aporteJubilatorio + aporteGremio);
        System.out.println("Sueldo Neto = " + this.getSueldoBruto() + " - (" + ley19032 + " + " + obraSocial + " + "
                + aporteJubilatorio + " + " + aporteGremio + " + " + retencionGanancias +  ")");
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "sueldoBruto=" + sueldoBruto +
                ", sueldoNeto=" + sueldoNeto +
                ", afiliadoAlGremio=" + afiliadoAlGremio +
                ", horasTrabajadas=" + horasTrabajadas +
                ", valorHora=" + valorHora +
                '}';
    }
}

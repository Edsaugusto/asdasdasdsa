package entidades;

import java.sql.Date;

public class HourContract {
    private Date data;
    private double valorPorHora;
    private int hora;

    public HourContract(Date data, double valorPorHora, int horas) {
        this.data = data;
        this.valorPorHora = valorPorHora;
        this.hora = horas;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public double getValorPorHora() {
        return valorPorHora;
    }
    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
    public int getHoras() {
        return hora;
    }
    public void setHoras(int horas) {
        this.hora = horas;
    }

    public double valorRecebido(){
        return valorPorHora*hora;
    }
}

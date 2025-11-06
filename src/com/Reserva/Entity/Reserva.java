package com.Reserva.Entity;


public class Reserva {
    private String nomeDoHospede;
    private String tipoQuarto;
    private int numeroDias;
    private double valorDiaria;

    public Reserva(String nomeDoHospede, String tipoQuarto, int numeroDias, double valorDiaria) {
        this.nomeDoHospede = nomeDoHospede;
        this.tipoQuarto = tipoQuarto;
        this.numeroDias = numeroDias;
        this.valorDiaria = valorDiaria;
    }

    public String getNomeDoHospede() {
        return nomeDoHospede;
    }

    public void setNomeDoHospede(String nomeDoHospede) {
        this.nomeDoHospede = nomeDoHospede;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    public void setNumeroDias(int numeroDias) {
        this.numeroDias = numeroDias;
    }

    public double calcularValorTotal() {

        return valorDiaria * numeroDias;
    }



    @Override
    public String toString() {
        return "O Hospede " + nomeDoHospede + " está no quarto de tipo " +  tipoQuarto + " está previsto para ficar " + numeroDias + " dias "  + " e vai pagar o valor total de: " + "R$ " + calcularValorTotal();
    }
}

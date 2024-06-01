package estagio_dti;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter; //biblioteca para definir a data/hora
import java.time.temporal.ChronoField; //biblioteca fornece acesso baseado em campo para manipular data, hora ou data e hora

class Petshop {
    private String nome;
    private double distancia;
    private double precoSemanaPequeno;
    private double precoSemanaGrande;
    private double precoFimDeSemanaPequeno;
    private double precoFimDeSemanaGrande;

    public Petshop(String nome, double distancia, double precoSemanaPequeno, double precoSemanaGrande, double precoFimDeSemanaPequeno, double precoFimDeSemanaGrande) {
        this.nome = nome;
        this.distancia = distancia;
        this.precoSemanaPequeno = precoSemanaPequeno;
        this.precoSemanaGrande = precoSemanaGrande;
        this.precoFimDeSemanaPequeno = precoFimDeSemanaPequeno;
        this.precoFimDeSemanaGrande = precoFimDeSemanaGrande;
    }

    public String getNome() {
        return nome;
    }

    public double getDistancia() {
        return distancia;
    }

    public double calcularCustoTotal(String data, int pequenos, int grandes) {
        LocalDate date = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy")); //Formatar o String de data para a data correta
        int dayOfWeek = date.get(ChronoField.DAY_OF_WEEK);

        boolean isWeekend = (dayOfWeek == 6 || dayOfWeek == 7); // 6 = Sábado, 7 = Domingo

        double custoGrandes;
        double custoPequenos;

        if (isWeekend){
            custoPequenos = precoFimDeSemanaPequeno * pequenos;
        }
        else {
           custoPequenos = precoSemanaPequeno * pequenos;
        }

        if (isWeekend) {
            custoGrandes = precoFimDeSemanaGrande * grandes;
        }
        else {
            custoGrandes = precoSemanaGrande * grandes;
        }

        return custoPequenos + custoGrandes;
    }
}

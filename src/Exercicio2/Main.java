package Exercicio2;

public class Main {
    public static void main(String[] args) {
        Continente continente = new Continente("América");

        Pais canada = new Pais("Canadá", 9976140, 37960000);
        Pais estadosUnidos = new Pais("Estados Unidos", 9833517, 328200000);
        Pais mexico = new Pais("México", 1964375, 126200000);


        continente.adicionarPais(canada);
        continente.adicionarPais(estadosUnidos);
        continente.adicionarPais(mexico);

        System.out.println("Nome do continente: " + continente.getNome());
        System.out.println("Dimensão total do continente: " + continente.dimensaoTotal() + " km²");
        System.out.println("População total do continente: " + continente.populacaoTotal());
        System.out.println("Densidade populacional do continente: " + continente.densidadePopulacional() + " pessoas/km²");
        System.out.println("País com maior população: " + continente.paisComMaiorPopulacao().getNome());
        System.out.println("País com menor população: " + continente.paisComMenorPopulacao().getNome());
        System.out.println("País de maior dimensão territorial: " + continente.paisMaiorDimensao().getNome());
        System.out.println("País de menor dimensão territorial: " + continente.paisMenorDimensao().getNome());
        System.out.println("Razão territorial (maior país / menor país): " + continente.razaoTerritorial());
    }
}

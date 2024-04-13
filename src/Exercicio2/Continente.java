package Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Continente {
    private String nome;
    private List <Pais> paises;

//=========Construtor=======//
    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }

    public void adicionarPais(Pais pais) {
        paises.add(pais);
    }

    public double dimensaoTotal() {
        double dimensaoTotal = 0;
        for (Pais pais : paises) {
            dimensaoTotal += pais.getDimensao();
        }
        return dimensaoTotal;
    }

    public long populacaoTotal() {
        long populacaoTotal = 0;
        for (Pais pais : paises) {
            populacaoTotal += pais.getPopulacao();
        }
        return populacaoTotal;
    }

    public double densidadePopulacional() {
        return populacaoTotal() / dimensaoTotal();
    }

    public Pais paisComMaiorPopulacao() {
        Pais paisMaiorPopulacao = null;
        long maiorPopulacao = Long.MIN_VALUE;
        for (Pais pais : paises) {
            if (pais.getPopulacao() > maiorPopulacao) {
                maiorPopulacao = pais.getPopulacao();
                paisMaiorPopulacao = pais;
            }
        }
        return paisMaiorPopulacao;
    }

    public Pais paisComMenorPopulacao() {
        Pais paisMenorPopulacao = null;
        long menorPopulacao = Long.MAX_VALUE;
        for (Pais pais : paises) {
            if (pais.getPopulacao() < menorPopulacao) {
                menorPopulacao = pais.getPopulacao();
                paisMenorPopulacao = pais;
            }
        }
        return paisMenorPopulacao;
    }

    public Pais paisMaiorDimensao() {
        Pais paisMaiorDimensao = null;
        double maiorDimensao = Double.MIN_VALUE;
        for (Pais pais : paises) {
            if (pais.getDimensao() > maiorDimensao) {
                maiorDimensao = pais.getDimensao();
                paisMaiorDimensao = pais;
            }
        }
        return paisMaiorDimensao;
    }

    public Pais paisMenorDimensao() {
        Pais paisMenorDimensao = null;
        double menorDimensao = Double.MAX_VALUE;
        for (Pais pais : paises) {
            if (pais.getDimensao() < menorDimensao) {
                menorDimensao = pais.getDimensao();
                paisMenorDimensao = pais;
            }
        }
        return paisMenorDimensao;
    }

    public double razaoTerritorial() {
        Pais paisMaiorDimensao = paisMaiorDimensao();
        Pais paisMenorDimensao = paisMenorDimensao();
        if (paisMaiorDimensao != null && paisMenorDimensao != null) {
            return paisMaiorDimensao.getDimensao() / paisMenorDimensao.getDimensao();
        }
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pais> getPaises() {
        return paises;
    }

    public void setPaises(List<Pais> paises) {
        this.paises = paises;
    }
}

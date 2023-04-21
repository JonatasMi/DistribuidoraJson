package org.example;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class FaturamentoMensalDistribuidora {

    public static void main(String[]args) {

        double sp = 67.83643;
        double rj = 36.67866;
        double mg = 29.22988;
        double es = 27.16548;
        double outros = 19.84953;
        double valorTotal;
        double valorPorPorcentagemSP, valorPorPorcentagemRJ, valorPorPorcentagemMG, valorPorPorcentagemES, valorPorPorcentagemOutros;

        valorTotal = sp + rj + mg + es + outros;
        System.out.println("Valor total mensal da distribuidora: " + valorTotal);

        valorPorPorcentagemSP = (sp * 100) / valorTotal;
        valorPorPorcentagemRJ = (rj * 100) / valorTotal;
        valorPorPorcentagemMG = (mg * 100) / valorTotal;
        valorPorPorcentagemES = (es * 100) / valorTotal;
        valorPorPorcentagemOutros = (outros * 100) / valorTotal;

        System.out.println(new DecimalFormat(".##").format(valorPorPorcentagemSP) + "%");
        System.out.println(new DecimalFormat(".##").format(valorPorPorcentagemRJ) + "%");
        System.out.println(new DecimalFormat(".##").format(valorPorPorcentagemMG) + "%");
        System.out.println(new DecimalFormat(".##").format(valorPorPorcentagemES) + "%");
        System.out.println(new DecimalFormat(".##").format(valorPorPorcentagemOutros) + "%");

    }
}

package org.example.utilitariaFormatadorMoeda;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class FormatadorMoeda {
    private static final DecimalFormat formatoBR = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));

    public static String formatar(double valor) {
        return formatoBR.format(valor);
    }
}

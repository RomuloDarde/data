package data;

/**
 * Classe que representa uma data, recebendo valores int para dia, mês e ano e
 * imprimindo uma String no formato dd/mm/aaaa.
 *
 * @author Rômulo Schmidt
 * @version 1.0
 *
 */

public class Data {
    //Atributos
    private int dia, mes, ano;

    /**
     * Construtor que recebe como parâmetro valores int para dia, mês e ano.
     * O valor para ano deve ser acima de 0.
     * O valor para mês deve ser de 1 a 12.
     * O valor para dia deve ser de acordo com a quantidade de dias no mês selecionado.
     *
     * @param dia
     * @param mes
     * @param ano
     *
     * @throws IllegalArgumentException
     */

    //Construtor
    public Data(int dia, int mes, int ano) {
        if (dia >=1 && dia <= this.quantidadeDias(mes, ano)
                && mes >=1 && mes <=12 && ano>=0) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else throw new IllegalArgumentException("Data Inválida");
    }

    /**
     * Método que retorna uma String representanda a data, no formato dd/mm/aaaa.
     */

    //Métodos
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    private int quantidadeDias(int mes, int ano) {
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) return 30;
        if (mes == 2) {
            if (ano % 4 == 0) return 29;
            else return 28;
        }
        return 31;
    }

}

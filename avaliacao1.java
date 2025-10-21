package avaliacaoTrimestral;

import java.util.Scanner;

public class avaliacao1 {
    static void main () {
        Scanner input = new Scanner (System.in);

        // O aluno deve receber 8 valores (8 notas);
        // As médias devem ser calculadas em: bimestrais, semestrais e média final;
        // utilizaremos o Scanner, método de input, *notas em float*, divisão de sessões e *inserção do aluno (nome do aluno)*;

        //Nome do aluno:
        System.out.print("Digite o nome do aluno: ");
        String aluno = input.next();

        //Inserção de notas:
        System.out.printf("Digite a primeira nota do %s: ", aluno);
        Float nota1 = input.nextFloat();
        System.out.print("Digite a segunda nota: ");
        Float nota2 = input.nextFloat();
        System.out.print("Digite a terceira nota: ");
        Float nota3 = input.nextFloat();
        System.out.print("Digite a quarta nota: ");
        Float nota4 = input.nextFloat();
        System.out.print("Digite a quinta nota: ");
        Float nota5 = input.nextFloat();
        System.out.print("Digite a sexta nota: ");
        Float nota6 = input.nextFloat();
        System.out.print("Digite a sétima nota: ");
        Float nota7 = input.nextFloat();
        System.out.print("Digite a oitavaa nota: ");
        Float nota8 = input.nextFloat();

        System.out.println("\n---------------------------------");
        System.out.println("MÉDIAS: \n");

        //Média do primeiro semestre:
        Float mediaB1 = (nota1 + nota2) / 2;
        Float mediaB2 = (nota3 + nota4) / 2;
        Float mediaS1 = (mediaB1 + mediaB2) / 2;
        System.out.printf("Primeira média bimestral: %.2f", mediaB1);
        System.out.printf("\nSegunda média bimestral: %.2f", mediaB2);

        //Média do segundo semestre:
        Float mediaB3 = (nota5 + nota6) / 2;
        Float mediaB4 = (nota7 + nota8) / 2;
        Float mediaS2 = (mediaB3 + mediaB4) / 2;
        System.out.printf("\nTerceira média bimestral: %.2f", mediaB3);
        System.out.printf("\nQuarta média bimestral: %.2f", mediaB4);
        System.out.println("\n---------------------------------");

        //Média dos semestres:
        System.out.printf("\nMédia do aluno %s no primeiro semestre: %.2f", aluno, mediaS1);
        System.out.printf("\nMédia do aluno %s no segundo semestre: %.2f", aluno, mediaS2);
        System.out.println("\n---------------------------------");

        //Média final:
        Float mediaF = (mediaS1 + mediaS2) / 2;
        System.out.printf("\nMédia final do aluno %s: %.2f.", aluno, mediaF);
    }
}

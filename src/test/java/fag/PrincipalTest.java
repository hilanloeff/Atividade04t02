package test.java.fag;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Testes unitários para verificar se as implementações das questões estão corretas.
 * 
 * INSTRUÇÕES PARA O ALUNO:
 * 1. Implemente todas as questões no arquivo Principal.java
 * 2. Execute estes testes para verificar se sua implementação está correta
 * 3. Todos os testes devem passar para que a questão seja considerada correta
 * 
 * Para executar os testes:
 * mvn test
 */
public class PrincipalTest {
    
    // Contadores para o relatório final
    private static int totalTestes = 0;
    private static int testesQuestao1 = 0;
    private static int testesQuestao2 = 0;
    private static int testesQuestao3 = 0;
    private static int testesQuestao4 = 0;
    private static int testesQuestao5 = 0;
    private static int testesQuestao6 = 0;
    private static int testesQuestao7 = 0;
    private static int testesQuestao8 = 0;
    private static int testesQuestao9 = 0;
    private static int testesQuestao10 = 0;
    
    // ========================================
    // TESTES PARA QUESTÃO 1 - SCANNER
    // ========================================
    
    @Test
    public void testQuestao1_Scanner() {
        totalTestes++;
        testesQuestao1++;
        
        // Simular entrada do usuário
        String input = "João\n25\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scan = new Scanner(in);
        
        // Capturar saída
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));
        
        try {
            // Executar o método da questão 1
            main.java.fag.Principal.questao1_Scanner(scan);
            
            // Verificar se a saída contém a mensagem esperada
            String output = out.toString();
            assertTrue(output.contains("Olá João! Você tem 25 anos. Seja bem-vindo(a)!"), 
                "❌ ERRO: A mensagem de boas-vindas não foi exibida corretamente");
        } finally {
            System.setOut(originalOut);
            scan.close();
        }
    }
    
    // ========================================
    // TESTES PARA QUESTÃO 2 - PRINT
    // ========================================
    
    @Test
    public void testQuestao2_Print() {
        totalTestes++;
        testesQuestao2++;
        
        // Capturar saída
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));
        
        try {
            // Executar o método da questão 2
            main.java.fag.Principal.questao2_Print();
            
            // Verificar se a saída contém a tabela de multiplicação
            String output = out.toString();
            assertTrue(output.contains("5 x 1 = 5"), "❌ ERRO: Tabela de multiplicação não exibida corretamente");
            assertTrue(output.contains("5 x 10 = 50"), "❌ ERRO: Tabela de multiplicação não exibida corretamente");
        } finally {
            System.setOut(originalOut);
        }
    }
    
    // ========================================
    // TESTES PARA QUESTÃO 3 - FOR
    // ========================================
    
    @Test
    public void testQuestao3_For() {
        totalTestes++;
        testesQuestao3++;
        
        // Capturar saída
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));
        
        try {
            // Executar o método da questão 3
            main.java.fag.Principal.questao3_For();
            
            // Verificar se a saída contém o resultado correto
            String output = out.toString();
            assertTrue(output.contains("5050"), "❌ ERRO: Soma dos números de 1 até 100 deve ser 5050");
        } finally {
            System.setOut(originalOut);
        }
    }
    
    // ========================================
    // TESTES PARA QUESTÃO 4 - IF
    // ========================================
    
    @Test
    public void testQuestao4_If() {
        totalTestes++;
        testesQuestao4++;
        
        // Simular entrada do usuário
        String input = "8,5\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scan = new Scanner(in);
        
        // Capturar saída
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));
        
        try {
            // Executar o método da questão 4
            main.java.fag.Principal.questao4_If(scan);
            
            // Verificar se a saída contém a mensagem de aprovado
            String output = out.toString();
            assertTrue(output.contains("APROVADO"), "❌ ERRO: Nota 8.5 deve resultar em APROVADO");
        } finally {
            System.setOut(originalOut);
            scan.close();
        }
    }
    
    // ========================================
    // TESTES PARA QUESTÃO 5 - WHILE
    // ========================================
    
    @Test
    public void testQuestao5_While() {
        totalTestes++;
        testesQuestao5++;
        
        // Simular entrada do usuário
        String input = "10\n5\n3\n0\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scan = new Scanner(in);
        
        // Capturar saída
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));
        
        try {
            // Executar o método da questão 5
            main.java.fag.Principal.questao5_While(scan);
            
            // Verificar se a saída contém a soma correta
            String output = out.toString();
            assertTrue(output.contains("18"), "❌ ERRO: Soma de 10+5+3+0 deve ser 18");
        } finally {
            System.setOut(originalOut);
            scan.close();
        }
    }
    
    // ========================================
    // TESTES PARA QUESTÃO 6 - MÉTODOS
    // ========================================
    
    @Test
    public void testQuestao6_Metodos() {
        totalTestes++;
        testesQuestao6++;
        
        // Testar o método encontrarMaior
        int resultado = main.java.fag.Principal.encontrarMaior(10, 5);
        assertEquals(10, resultado, "❌ ERRO: O maior número entre 10 e 5 deve ser 10");
    }
    
    // ========================================
    // TESTES PARA QUESTÃO 7 - SCANNER + IF
    // ========================================
    
    @Test
    public void testQuestao7_ScannerIf() {
        totalTestes++;
        testesQuestao7++;
        
        // Simular entrada do usuário
        String input = "8\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scan = new Scanner(in);
        
        // Capturar saída
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));
        
        try {
            // Executar o método da questão 7
            main.java.fag.Principal.questao7_ScannerIf(scan);
            
            // Verificar se a saída contém a mensagem correta
            String output = out.toString();
            assertTrue(output.contains("PAR"), "❌ ERRO: Número 8 deve ser identificado como PAR");
        } finally {
            System.setOut(originalOut);
            scan.close();
        }
    }
    
    // ========================================
    // TESTES PARA QUESTÃO 8 - FOR + PRINT
    // ========================================
    
    @Test
    public void testQuestao8_ForPrint() {
        totalTestes++;
        testesQuestao8++;
        
        // Capturar saída
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));
        
        try {
            // Executar o método da questão 8
            main.java.fag.Principal.questao8_ForPrint();
            
            // Verificar se a saída contém números pares
            String output = out.toString();
            assertTrue(output.contains("2"), "❌ ERRO: Deve exibir o número 2");
            assertTrue(output.contains("20"), "❌ ERRO: Deve exibir o número 20");
        } finally {
            System.setOut(originalOut);
        }
    }
    
    // ========================================
    // TESTES PARA QUESTÃO 9 - WHILE + SCANNER
    // ========================================
    
    @Test
    public void testQuestao9_WhileScanner() {
        totalTestes++;
        testesQuestao9++;
        
        // Simular entrada do usuário
        String input = "5\n8\n3\n-1\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scan = new Scanner(in);
        
        // Capturar saída
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));
        
        try {
            // Executar o método da questão 9
            main.java.fag.Principal.questao9_WhileScanner(scan);
            
            // Verificar se a saída contém a contagem correta
            String output = out.toString();
            assertTrue(output.contains("3"), "❌ ERRO: Deve contar 3 números positivos (5, 8, 3)");
        } finally {
            System.setOut(originalOut);
            scan.close();
        }
    }
    
    // ========================================
    // TESTES PARA QUESTÃO 10 - MÉTODOS + FOR
    // ========================================
    
    @Test
    public void testQuestao10_MetodosFor() {
        totalTestes++;
        testesQuestao10++;
        
        // Testar o método calcularFatorial
        long resultado = main.java.fag.Principal.calcularFatorial(5);
        assertEquals(120, resultado, "❌ ERRO: O fatorial de 5 deve ser 120");
    }
    
    // ========================================
    // RELATÓRIO FINAL PARA O PROFESSOR
    // ========================================
    
    @AfterAll
    public static void mostrarRelatorioFinal() {
        System.err.println("\n" + "=".repeat(80));
        System.err.println("📊 RELATÓRIO FINAL DOS TESTES - NOTA POR QUESTÃO");
        System.err.println("=".repeat(80));
        
        System.err.println("\n🎯 QUESTÃO 1 - SCANNER:");
        System.err.println("   Total de testes: " + testesQuestao1);
        System.err.println("   ✅ Testes que passaram: Verifique a saída do Maven acima");
        System.err.println("   ❌ Testes que falharam: Verifique a saída do Maven acima");
        System.err.println("   📝 Nota: 1.0 ponto (se todos passarem)");
        
        System.err.println("\n🎯 QUESTÃO 2 - PRINT:");
        System.err.println("   Total de testes: " + testesQuestao2);
        System.err.println("   ✅ Testes que passaram: Verifique a saída do Maven acima");
        System.err.println("   ❌ Testes que falharam: Verifique a saída do Maven acima");
        System.err.println("   📝 Nota: 1.0 ponto (se todos passarem)");
        
        System.err.println("\n🎯 QUESTÃO 3 - FOR:");
        System.err.println("   Total de testes: " + testesQuestao3);
        System.err.println("   ✅ Testes que passaram: Verifique a saída do Maven acima");
        System.err.println("   ❌ Testes que falharam: Verifique a saída do Maven acima");
        System.err.println("   📝 Nota: 1.0 ponto (se todos passarem)");
        
        System.err.println("\n🎯 QUESTÃO 4 - IF:");
        System.err.println("   Total de testes: " + testesQuestao4);
        System.err.println("   ✅ Testes que passaram: Verifique a saída do Maven acima");
        System.err.println("   ❌ Testes que falharam: Verifique a saída do Maven acima");
        System.err.println("   📝 Nota: 1.0 ponto (se todos passarem)");
        
        System.err.println("\n🎯 QUESTÃO 5 - WHILE:");
        System.err.println("   Total de testes: " + testesQuestao5);
        System.err.println("   ✅ Testes que passaram: Verifique a saída do Maven acima");
        System.err.println("   ❌ Testes que falharam: Verifique a saída do Maven acima");
        System.err.println("   📝 Nota: 1.0 ponto (se todos passarem)");
        
        System.err.println("\n🎯 QUESTÃO 6 - MÉTODOS:");
        System.err.println("   Total de testes: " + testesQuestao6);
        System.err.println("   ✅ Testes que passaram: Verifique a saída do Maven acima");
        System.err.println("   ❌ Testes que falharam: Verifique a saída do Maven acima");
        System.err.println("   📝 Nota: 1.0 ponto (se todos passarem)");
        
        System.err.println("\n🎯 QUESTÃO 7 - SCANNER + IF:");
        System.err.println("   Total de testes: " + testesQuestao7);
        System.err.println("   ✅ Testes que passaram: Verifique a saída do Maven acima");
        System.err.println("   ❌ Testes que falharam: Verifique a saída do Maven acima");
        System.err.println("   📝 Nota: 1.0 ponto (se todos passarem)");
        
        System.err.println("\n🎯 QUESTÃO 8 - FOR + PRINT:");
        System.err.println("   Total de testes: " + testesQuestao8);
        System.err.println("   ✅ Testes que passaram: Verifique a saída do Maven acima");
        System.err.println("   ❌ Testes que falharam: Verifique a saída do Maven acima");
        System.err.println("   📝 Nota: 1.0 ponto (se todos passarem)");
        
        System.err.println("\n🎯 QUESTÃO 9 - WHILE + SCANNER:");
        System.err.println("   Total de testes: " + testesQuestao9);
        System.err.println("   ✅ Testes que passaram: Verifique a saída do Maven acima");
        System.err.println("   ❌ Testes que falharam: Verifique a saída do Maven acima");
        System.err.println("   📝 Nota: 1.0 ponto (se todos passarem)");
        
        System.err.println("\n🎯 QUESTÃO 10 - MÉTODOS + FOR:");
        System.err.println("   Total de testes: " + testesQuestao10);
        System.err.println("   ✅ Testes que passaram: Verifique a saída do Maven acima");
        System.err.println("   ❌ Testes que falharam: Verifique a saída do Maven acima");
        System.err.println("   📝 Nota: 1.0 ponto (se todos passarem)");
        
        System.err.println("\n📈 RESUMO GERAL:");
        System.err.println("   Total de testes executados: " + totalTestes);
        System.err.println("   📝 NOTA MÁXIMA: 10.0 pontos (1.0 por questão)");
        System.err.println("   📝 NOTA FINAL: Conte quantos testes passaram e divida por 10");
        
        System.err.println("\n💡 COMO CALCULAR A NOTA:");
        System.err.println("   • Cada questão vale 1.0 ponto");
        System.err.println("   • Se o teste da questão passar = 1.0 ponto");
        System.err.println("   • Se o teste da questão falhar = 0.0 ponto");
        
        System.err.println("\n" + "=".repeat(80));
        System.err.println("🎓 Boa sorte na correção! Use este relatório para dar as notas.");
        System.err.println("=".repeat(80));
    }
}
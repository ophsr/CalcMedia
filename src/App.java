import javax.swing.JOptionPane;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.NullPointerException;
import com.calculadora.models.Calculadora;

public class App {
    public static void main(String[] args) throws Exception {
        // Instancio classe Calculadora responsavel por fazer a media
        Calculadora calc = new Calculadora();
        // vetor auxiliar para armazenar valores em double;
        double[] valores = new double[5];

        // vetor auxiliar para armazenar valores em string de entrada no JOptionPane;
        String[] inputSplit = new String[5];

        String input="";

        // JOptionPane para pegar os valores em uma string ("0;1;2;3;45;")
        try {
            input = JOptionPane.showInputDialog(null, "Entre com os valores separados por ponto e virgula(;)!");
            // pega a string do JOption e corta ela em varios pedaços, o corte é definido
            // pelo (;) a cada corte ele armazena a string no vetor acima
            inputSplit = input.split(";");
        } catch (NullPointerException e) {
            return;
        }
        
        // Pecorre o vetor de strings definido apos o corte da string inteira
        for (int i = 0; i < inputSplit.length; i++) {
            // tenta converter a string na posição I do vetor e armazenar em valores(vetor)
            // na mesma posição
            try {
                valores[i] = Double.parseDouble(inputSplit[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                //se adicionar mais de 100 valores
                JOptionPane.showMessageDialog(null, "A quantidade de valores adicionados exedeu o limite de 100");
                return;
            } catch (Exception e) {
                // se der algum erro ele avisa e para o programa
                JOptionPane.showMessageDialog(null, "Entre com os valores separados por virgula, somente numeros e limite de 100 valores!"
                        + "\nExemplo: 1.1;2;3.3;4;5.5;6");
                return;
            }
        }

        // Print da media: eu primeiro chamo o metodo Media passando o vetor auxiliar
        // com valores double
        // como parametro.
        JOptionPane.showMessageDialog(null, String.format("Media dos valores(%s) é: %.2f", input, calc.Media(valores)));
    }
}

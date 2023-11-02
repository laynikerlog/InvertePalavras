import javax.swing.JOptionPane;

public class PilhaInvertePalavras {
    public static String inverterPalavras(String input) {
        StringBuilder resultado = new StringBuilder();
        StringBuilder palavraAtual = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                palavraAtual.append(c);
            } else {
                while (!palavraAtual.isEmpty()) {
                    resultado.append(palavraAtual.charAt(palavraAtual.length() - 1));
                    palavraAtual.deleteCharAt(palavraAtual.length() - 1);
                }
                resultado.append(c);
            }
        }

        while (!palavraAtual.isEmpty()) {
            resultado.append(palavraAtual.charAt(palavraAtual.length() - 1));
            palavraAtual.deleteCharAt(palavraAtual.length() - 1);
        }

        return resultado.toString();
    }

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Digite a frase a ser invertida:");
        String resultado = inverterPalavras(texto);

        JOptionPane.showMessageDialog(null, "Resultado: \n" + resultado);
    }
}

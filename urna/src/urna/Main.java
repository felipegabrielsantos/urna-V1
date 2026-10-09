package urna;
import javax.swing.JOptionPane;
public class Main {
	public static void main(String arg[]) {
		String candidatos = "";
		boolean v;
		int nulo = 0;
		int qm = 0, max = 0;
		
		int nc = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de candidatos"));
		String candidato[] = new String[nc];
		for (int i=0; i<nc; i++) {
			candidato[i] = JOptionPane.showInputDialog("candidato N" + (i+1) + "º");
			candidatos = candidatos + (i+1) + " - " + candidato[i] +"\n";
		}
		
		int ne = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de eleitores "));
		int votos[] = new int[nc];
		for (int i=0; i<ne; i++) {
			v = false;
			String entrada = JOptionPane.showInputDialog("ELEITOR N" + (i+1) + "º vote em uma das pessoas abaixo: \n" + candidatos);
			for (int n = 0;n<nc;n++) {
				if (entrada.equals(candidato[n])) {
					votos[n] = votos[n] + 1;
					v=true;
				}
			}
			if (v == false) {
				nulo ++;
			}
		}
		String mostrarvotos = "";
		for (int i=0; i<nc; i++) {
			mostrarvotos = mostrarvotos + candidato[i] + ": " + votos[i] + " votos \n";
			if (max < votos[i]) {
				max = votos[i];
				qm = i;
			}
		}
		JOptionPane.showMessageDialog(null, "candidato vencedor: " + candidato[qm] + " com " + max + " voto(s)\n" + mostrarvotos + "voto(s) anulado(s): " + nulo);
	}
}

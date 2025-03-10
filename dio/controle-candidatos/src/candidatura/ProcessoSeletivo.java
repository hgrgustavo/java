package candidatura;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    System.out.println("Processo seletivo");
//    analisarCandidato(1900.0);
//    analisarCandidato(2200.0);
//    analisarCandidato(2000.0);
      String[] candidatos = {}
  }

  static void entrandoEmContato(String candidato) {
    int tentativasRealizadas = 1;
    boolean continuarTentando = true; 
    booelan atendeu = false;

    do {
      atendeu = atender();
      continuarTentando = !atendeiu;
      if(continuarTentando) {
        tentativasRealizadas++;
      } else {
        System.out.println("CONTATO REALIZADO COM SUCESSO");
      }
    } while(continuarTentando && tentativasRealizadas < 3);
    
    if(atendeu) {
      System.out.println("CONSEGUIMOS CONTATO COM " + candidato + "NA " + tentativasRealizadas + " TENTATIVA"); 
    } else { 
      System.out.println("NÃO CONSEGUIMOS CONTATO COM" + candidato + ", NÚMERO MAXIMO TENTATIVAS " +);
    }
  }

  static boolean atender() {
    return new Random().nextInt(3) == 1;
  }

  static void imprimirSelecionados() {
    String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO" };
    System.out.println("IMPRIMINDO A LISTA DE CANDIDATOS INFORMANDO O ÍNDICE DO ELEMENTO");
    for (int indice = 0; indice < candidatos.length; indice++) {
      System.out.println("O candidato de número " + (indice + 1) + "é o " + candidatos[indice]);
    }
    System.out.println("Forma abreviada de interação for each");
    for (String candidato : candidatos) {
      System.out.println("O candidato selecionado foi " + candidato);
    }

  }

  static void selecaoCandidato() {
    String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA",
        "JORGE" };

    int candidatosSelecionados = 0, candidatosAtual = 0;
    double salarioBase = 2000.0;
    while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
      String candidato = candidatos[candidatosAtual];
      double salarioPretendido = valorPretendido();
      System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);

      if (salarioBase >= salarioPretendido) {
        candidatosSelecionados++;
      }
      candidatosAtual++;
    }
  }

  static void analisarCandidato(double salarioPretendido) {
    double salarioBase = 2000.0;
    if (salarioBase > salarioPretendido) {
      System.out.println("LIGAR PARA O CANDIDATO");

    } else if (salarioBase == salarioPretendido) {
      System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
    } else {
      System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
    }
  }
}

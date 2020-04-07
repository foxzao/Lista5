import javax.swing.JOptionPane;
public class TesteClasseTurma{
   public static void main(String [] args){
      int quantidadeDeAlunos;
      int serie;
      String curso;
      String nome;
         
      nome = JOptionPane.showInputDialog("Qual sua turma?");
      curso = JOptionPane.showInputDialog("Qual seu curso?");
      quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos há na sua sala?"));
      serie = Integer.parseInt(JOptionPane.showInputDialog("Qual seu semestre?"));
      
      Turma turma =new Turma(nome,curso,quantidadeDeAlunos,serie);
      
      JOptionPane.showMessageDialog(null,"Tutma: " + turma.getNome()+ "\nAlunos: " + turma.getQuantidadeDeAlunos()+ "\nCurso: " + turma.getCurso()+"\nSemestre: " + turma.getSerie());   
      turma.setQuantidadeDeAlunos(Integer.parseInt(JOptionPane.showInputDialog("Insira sua nova quantidade de alunos: ")));
      JOptionPane.showMessageDialog(null,"Tutma: " + turma.getNome()+ "\nAlunos: " + turma.getQuantidadeDeAlunos()+ "\nCurso: " + turma.getCurso()+"\nSemestre: " + turma.getSerie());
   }
}
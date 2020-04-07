public class ClasseTurma{
   String nome;
   String curso;
   int quantidadeDeAlunos;
   int serie;
   
   public String getNome(){
      return nome;
   }
   public String getCurso(){
      return curso;
   }
   public int getQuantidadeDeAlunos(){
      return quantidadeDeAlunos;
   }
   public int getSerie(){
      return serie;
   }
   public void setSerie(int serie){
      this.serie= serie;
   }
   public void setQuantidadeDeAlunos(int quantidadeDeAlunos){
      this.quantidadeDeAlunos= quantidadeDeAlunos;
   }
   public void setCurso(String curso){
      this.curso= curso;
   }
   public void setNome(String nome){
      this.nome= nome;
   }
   public Turma(String nome, String curso, int quantidadeDeAlunos, int serie){
      this.nome = nome;
      this.curso = curso;
      this.quantidadeDeAlunos = quantidadeDeAlunos;
      this.serie = serie;    
   }
}
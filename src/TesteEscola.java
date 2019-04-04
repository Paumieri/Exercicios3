public class TesteEscola {
    public static void main(String[] args) {
         
              
         Escola c1 = new Escola();
         c1.professor = "Paulo";
         c1.aluno = "carlos ";
         c1.disciplina = "matematica ";
               
         
         System.out.println("professor c1: " + c1.professor );
         System.out.println("aluno c1: " + c1.aluno );
         System.out.println("disciplina de c1: " + c1.disciplina );
         
         Escola c2 = new Escola();
         c2.professor = "Antonio";
         c2.aluno = "jose carlos ";
         c2.disciplina = "Português";
               
         
         System.out.println("professor c2: " + c2.professor );
         System.out.println("aluno c2: " + c2.aluno );
         System.out.println("disciplina de c2: " + c2.disciplina );
         
         Escola c3 = new Escola();
         c3.professor = "Vicente";
         c3.aluno = "Aline ";
         c3.disciplina = "Historia";
               
         
         System.out.println("professor c3: " + c3.professor );
         System.out.println("aluno c3: " + c3.aluno );
         System.out.println("disciplina de c3: " + c3.disciplina );
    }
}

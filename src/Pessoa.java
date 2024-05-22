 abstract class Pessoa {
      private int cpf;
      private String nome;
      private int idade;

      public void fazerAniversario(){
            this.idade = this.idade + 1;
      }

      public int getCpf() {
            return cpf;
      }

      public void setCpf(int cpf) {
            this.cpf = cpf;
      }

      public String getNome() {
            return nome;
      }

      public void setNome(String nome) {
            this.nome = nome;
      }

      public int getIdade() {
            return idade;
      }

      public void setIdade(int idade) {
            this.idade = idade;
      }
}



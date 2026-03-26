public class Conta {
    // Atributos da classe
    private double saldo;
    private String nome;
    private int numero;
    private double limite;

    // getters e setters
    public void setNome(String nome) {
        if(nome != null && nome.length() > 1) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNumero(int numero) {
            this.numero = numero;
    }

    public int getNumero() {
            return numero;
    }

    public void setSaldo(double saldo) {
            this.saldo = saldo;
    }

    public double getSaldo() {
            return saldo;
    }

    public void setLimite(double limite) {
            this.limite = limite;
    }

    public double getLimite() {
            return limite;
    }


    boolean sacarVerifica(double quantidade){
            if (quantidade > this.saldo) {
                return false;
            } else {
                double novoSaldo = this.saldo - quantidade;
                this.saldo = novoSaldo;
                return true;
            }
        }

        public void depositar(double valor) {
            if (valor > 0) {
                this.saldo += valor;
                System.out.println("Depósito realizado! Novo saldo: " + saldo);
            } else {
                System.out.println("Valor invalido. O numero deve ser positivo.");
            }
        }

        //metodo padrao para visualizar objetos
        public String toString() {
            return "Nome: " + this.nome +
                    " | Num.: " + this.numero+
                    " | Saldo.: " + this.saldo +
                    " | Limite.: " + this.limite;
        }


}


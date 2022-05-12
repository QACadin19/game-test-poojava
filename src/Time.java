public class Time {
    private String nome, campeonato;
    private int jogadores, vitorias, derrotas, empate;

    public Time(String nome, int jogadores, int vitorias, int derrotas, int empate) {
        this.nome = nome;
        this.jogadores = jogadores;
        this.setVitorias(vitorias);
        this.derrotas = derrotas;
        this.empate = empate;
    }

    public void apresentar() {
        System.out.println("O " + nome + " joga na Série " + this.getCampeonato());
        System.out.println(nome + " tem " + vitorias +" vitórias, " + derrotas +" derrotas e " + empate + " empates.");
        System.out.println("==============================================================");

    }
    public void ganharJogo() {

    }
    public void perderJogo() {

    }
    public void empatarJogo() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCampeonato() {
        return campeonato;
    }

    public void setCampeonato() {
        if (this.vitorias >= 8) {
            this.campeonato = "A";
        } else if (this.vitorias >= 5) {
            this.campeonato = "B";
        } else if (this.vitorias >= 3) {
            this.campeonato = "C";
        } else if (this.vitorias >= 1) {
            this.campeonato = "D";
        } else {
            this.campeonato = "SEM DIVISÃO";
        }
    }

    public int getJogadores() {
        return jogadores;
    }

    public void setJogadores(int jogadores) {
        this.jogadores = jogadores;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
        this.setCampeonato();
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }
}

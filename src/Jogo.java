import java.util.Random;

public class Jogo {
    //Atributos
    private Time mandante;
    private Time visitante;
    private int periodos;
    private boolean aprovado;

    //Métodos Públicos
    public void marcarJogo(Time t1, Time t2) {
        if (t1.getCampeonato().equals(t2.getCampeonato()) && t1 != t2) {
            this.aprovado = true;
            this.mandante = t1;
            this.visitante = t2;
        } else {
            this.aprovado = false;
            this.mandante = null;
            this.visitante = null;
        }

    }
    public void Jogar() {
        if (this.aprovado) {
            System.out.println("----------------------------------------");
            System.out.println(this.mandante.getNome() + " X " + this.visitante.getNome());

            Random aleatorio = new Random();
            int vencendor = aleatorio.nextInt(4);
                switch (vencendor) {
                    case 0:
                        System.out.println("JOGO EMPATADO");
                        this.mandante.empatarJogo();
                        this.visitante.empatarJogo();
                        break;
                    case 1:
                        System.out.println("VITÓRIA DO " + this.mandante.getNome());
                        this.mandante.ganharJogo();
                        this.visitante.perderJogo();
                        break;
                    case 2:
                        System.out.println("VENCEDOR DO JOGO FOI O " + this.mandante.getNome());
                        this.mandante.ganharJogo();
                        this.visitante.perderJogo();
                        break;
                    case 3:
                        System.out.println("VITÓRIA DO " + this.visitante.getNome());
                        this.visitante.ganharJogo();
                        this.mandante.perderJogo();
                        break;
                }
        } else {
            System.out.println("O jogo não pode acontecer");
        }
    }

    //Métodos especiais
    public Time getMandante() {
        return mandante;
    }

    public void setMandante(Time mandante) {
        this.mandante = mandante;
    }

    public Time getVisitante() {
        return visitante;
    }

    public void setVisitante(Time visitante) {
        this.visitante = visitante;
    }

    public int getPeriodos() {
        return periodos;
    }

    public void setPeriodos(int periodos) {
        this.periodos = periodos;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}

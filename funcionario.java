public class funcionario {
    private String nome;
    private String email;
    private String salario_base;
    private String cargo;
    private String salario_liquido;


    public funcionario(String nome, String email, String salario_base, String cargo, String salario_liquido) {
        this.nome = nome;
        this.email = email;
        this.salario_base = salario_base;
        this.cargo = cargo;
        this.salario_liquido = salario_liquido;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSalario_base() {
        return this.salario_base;
    }

    public void setSalario_base(String salario_base) {
        this.salario_base = salario_base;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSalario_liquido() {
        return this.salario_liquido;
    }

    public void setSalario_liquido(String salario_liquido) {
        this.salario_liquido = salario_liquido;
    }


    public void Calculo_Salario(){
        double salario = Float.parseFloat(this.salario_base);
        String cargo = this.cargo;

        if("1" == cargo.intern()){
            this.cargo = "GERENTE";
            if(salario >= Float.parseFloat("5000")){
                this.salario_liquido =  ""+(salario - (salario*0.30));
            }else if (salario < 5000){
                this.salario_liquido = "" + (salario - (salario * 0.20));
            }

        }
        if ("2" == cargo.intern()) {
            this.cargo = "DESENVOLVEDOR";
            if (salario >= 2000) {
                this.salario_liquido = "" + (salario - (salario * 0.25));
            } else if (salario < 2000) {
                this.salario_liquido = "" + (salario - (salario * 0.15));
            }

        }
        if ("3" == cargo.intern()) {
            this.cargo = "DBA";
            if (salario >= 3000) {
                this.salario_liquido = "" + (salario - (salario * 0.20));
            } else if (salario < 3000) {
                this.salario_liquido = "" + (salario - (salario * 0.10));
            }

        }
        if ("4" == cargo.intern()) {
            this.cargo = "TESTADOR";
            if (salario >= 3000) {
                this.salario_liquido = "" + (salario - (salario * 0.20));
            } else if (salario < 3000) {
                this.salario_liquido = "" + (salario - (salario * 0.10));
            }

        }
      
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", email='" + getEmail() + "'" +
            ", salario_base='" + getSalario_base() + "'" +
            ", cargo='" + getCargo() + "'" +
            ", salario_liquido='" + getSalario_liquido() + "'" +
            "}";
    }


}

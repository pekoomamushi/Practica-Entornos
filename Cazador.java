public class Cazador extends Personaje {

    public Cazador(){
        super();
    }
    public Cazador(String nombre, String raza){
        setNombre(nombre);
        setRaza(raza);
    }

    public void subirNivel() {
        this.setNivel(this.getNivel()+1);
        if(Math.random() < 0.7);
            this.setVelocidad(this.getVelocidad() + this.getNivel());


    }

    public void defender(int dano, String tipoDano) {

    }

    public class Mascota extends Personaje {
        private String animal;

        public Mascota() {
            super();

        }


        public Mascota(String nombre, String raza) {
            super(nombre, raza);
        }


        public int setRaza(String raza) {
            switch (raza) {
                case "Canido":
                    this.setVida((int) (Cazador.this.getVida() * 0.20));
                    this.setVelocidad((int) (Cazador.this.getVelocidad() * 0.20));
                    this.setFuerza((int) (Cazador.this.getFuerza() * 0.20));
                    this.setFortaleza((int) (Cazador.this.getFortaleza() * 0.20));
                    this.setResistencia((int) (Cazador.this.getResistencia() * 0.20));
                    break;

                case "Felino":
                    this.setFuerza((int) (Cazador.this.getFuerza() * 0.30));
                    this.setVelocidad((int) (Cazador.this.getVelocidad() * 0.30));
                    this.setFortaleza((int) (Cazador.this.getFortaleza() * 0.15));
                    this.setResistencia((int) (Cazador.this.getResistencia() * 0.15));
                    this.setVida((int) (Cazador.this.getVida() * 0.15));


                    break;

                case "Rapaz":
                    this.setVelocidad((int) (Cazador.this.getVelocidad() * 0.35));
                    this.setResistencia((int) (Cazador.this.getResistencia() * 0.25));
                    this.setFuerza((int) (Cazador.this.getFuerza() * 0.15));
                    this.setVida((int) (Cazador.this.getVida() * 0.05));
                    this.setFortaleza((int) (Cazador.this.getFortaleza() * 0.05));
                    break;

                default:
                    this.animal = " ";
            }

            public  int getLuchar(int fuerza){
                return fuerza ;

            }


        }

        @Override
        public void subirNivel() {
            this.setRaza(String.valueOf(this.getNivel() + 1));
        }

        @Override
        public void defender(int dano, String tipoDano) {
            switch (tipoDano) {

                case "fisico":

                    int f = dano - this.getFortaleza() - this.getVida();


                    break;

                case "magico":

                    int m = dano - this.getResistencia() - this.getVida();

                    break;
            }
        }
    }

}

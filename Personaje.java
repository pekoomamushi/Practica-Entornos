
public abstract class Personaje {
    private String nombre;
    private String raza;
    private int nivel;
    private int vida;
    private int velocidad;
    private int fuerza;
    private int fortaleza;
    private int resistencia;
    private boolean vivo_muerto;

    public Personaje(){
        nombre="";
        raza="";
        nivel=0;
        vida=0;
        velocidad=0;
        fuerza=0;
        vivo_muerto=false;
    }

    public Personaje(String nombre, String raza){
        setNombre(nombre);
        setRaza(raza);
        nivel=1;
        vida=100;
        velocidad=10;
        fuerza=10;
        fortaleza=10;
        resistencia=10;
        vivo_muerto=false;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre.replace(" "," ");
        if(nombre.length()<4)
            this.nombre = "";
        else this.nombre = nombre;
    }

    public String getRaza()
    {
        return raza;
    }

    public int setRaza(String raza) {

        if(raza.equals("angel") || raza.equals("demonio"))
            this.raza=" ";
        else this.raza=raza;
        return 0;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getFortaleza() {
        return fortaleza;
    }

    public void setFortaleza(int fortaleza) {
        this.fortaleza = fortaleza;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public boolean isVivo_muerto() {
        return vivo_muerto;
    }

    public void setVivo_muerto(boolean vivo_muerto) {
        this.vivo_muerto = vivo_muerto;
    }

    public abstract void subirNivel();

    public  int getLuchar(int fuerza){
        return fuerza;

    }
    public abstract void  defender(int dano,String tipoDano );

    

}
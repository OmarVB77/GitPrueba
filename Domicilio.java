package src;

public class Domicilio {
    public String calle;
    public String numeroPuerta;
    public String numeroInterior;
    public String distrito;

    public Domicilio(String calle, String numeroPuerta, String numeroInterior, String distrito) {
        this.calle = calle;
        this.numeroPuerta = numeroPuerta;
        this.numeroInterior = numeroInterior;
        this.distrito = distrito;
    }
    
    public String getCalle() {
        return calle;
    }

    public String getNumeroPuerta() {
        return numeroPuerta;
    }

    public String getNumeroInterior() {
        return numeroInterior;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumeroPuerta(String numeroPuerta) {
        this.numeroPuerta = numeroPuerta;
    }

    public void setNumeroInterior(String numeroInterior) {
        this.numeroInterior = numeroInterior;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
    
    
}

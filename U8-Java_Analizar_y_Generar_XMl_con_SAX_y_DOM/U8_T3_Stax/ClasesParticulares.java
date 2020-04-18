package U8_T3_Stax;

public class ClasesParticulares {
    private String nombre;
    private int horasSemanales;
    private String profesor;
    private int precioClases;

    public ClasesParticulares(String nombre, int horasSemanales, String profesor, int precioClases) {
        this.nombre = nombre;
        this.horasSemanales = horasSemanales;
        this.profesor = profesor;
        this.precioClases = precioClases;
    }

    public ClasesParticulares() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getPrecioClases() {
        return precioClases;
    }

    public void setPrecioClases(int precioClases) {
        this.precioClases = precioClases;
    }
}

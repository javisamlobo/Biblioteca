import com.Javier.Biblioteca.*;

public class Main {
    public static void main(String[] args) {

        Libro Quijote = new Libro();
        Quijote.setIsbn(4548989784);
        Quijote.setTitulo("El Quijote");
        Quijote.setAutor("Miguel de Cervantes");
        Quijote.setGenero("Historica");
        Quijote.setFecha_publi("10-15-1500");

        Autor Cervantes = new Autor();
        Cervantes.setId(1);
        Cervantes.setNombre("Miguel");
        Cervantes.setApellidos("De Cervantes");
        Cervantes.setFecha_nac("16-11-1466");
        Cervantes.setLugar_nac("Madrid");

        Genero Misterio = new Genero();
        Misterio.setId(1);
        Misterio.setNombre("Misterio");
        Misterio.setDescripcion("Terror");

        Usuario Usuario1 = new Usuario();
        Usuario1.setDni("659884412J");
        Usuario1.setNombre("Jose");
        Usuario1.setApellidos("Fernandez Perez");
        Usuario1.setFecha_nac("12-04-2000");
        Usuario1.setTelefono(565565612);
        Usuario1.setDireccion("C/ pradera 1");
        Usuario1.setPoblacion("Avila");
    }
}
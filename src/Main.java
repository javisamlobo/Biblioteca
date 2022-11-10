import com.Javier.Biblioteca.*;

public class Main {
    public static void main(String[] args) {

        Libro Quijote = new Libro();
        Quijote.setIsbn(454784);
        Quijote.setTitulo("El Quijote");
        Quijote.setAutor("Miguel de Cervantes");
        Quijote.setGenero("Historica");
        Quijote.setFecha_publi("10-15-1500");
        System.out.println(Quijote.getIsbn());
        System.out.println(Quijote.getTitulo());
        System.out.println(Quijote.getAutor());
        System.out.println(Quijote.getGenero());
        System.out.println(Quijote.getFecha_publi());

        Autor Cervantes = new Autor();
        Cervantes.setId(1);
        Cervantes.setNombre("Miguel");
        Cervantes.setApellidos("De Cervantes");
        Cervantes.setFecha_nac("16-11-1466");
        Cervantes.setLugar_nac("Madrid");
        System.out.println(Cervantes.getId());
        System.out.println(Cervantes.getNombre());
        System.out.println(Cervantes.getApellidos());
        System.out.println(Cervantes.getFecha_nac());
        System.out.println(Cervantes.getLugar_nac());

        Genero Misterio = new Genero();
        Misterio.setId(1);
        Misterio.setNombre("Misterio");
        Misterio.setDescripcion("Terror");
        System.out.println(Misterio.getId());
        System.out.println(Misterio.getNombre());
        System.out.println(Misterio.getDescripcion());

        Usuario Usuario1 = new Usuario();
        Usuario1.setDni("659884412J");
        Usuario1.setNombre("Jose");
        Usuario1.setApellidos("Fernandez Perez");
        Usuario1.setFecha_nac("12-04-2000");
        Usuario1.setTelefono(565565612);
        Usuario1.setDireccion("C/ pradera 1");
        Usuario1.setPoblacion("Avila");
        System.out.println(Usuario1.getDni());
        System.out.println(Usuario1.getNombre());
        System.out.println(Usuario1.getApellidos());
        System.out.println(Usuario1.getFecha_nac());
        System.out.println(Usuario1.getTelefono());
        System.out.println(Usuario1.getDireccion());
        System.out.println(Usuario1.getPoblacion());

        Prestamo Prestamo1 = new Prestamo();
        Prestamo1.setId(1);
        Prestamo1.setLibro();
        Prestamo1.setUsuario();
        Prestamo1.setFecha_pres("17-04-2022");
        Prestamo1.setFecha_devo("19-04-2022");
        System.out.println(Prestamo1.getId());
        System.out.println(Prestamo1.getLibro());
        System.out.println(Prestamo1.getUsuario());
        System.out.println(Prestamo1.getFecha_pres());
        System.out.println(Prestamo1.getFecha_devo());
    }
}
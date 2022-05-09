
public class Libro {

    // ==============
    // === atributos ===
    // ==============
    private String isbn;
    private String titulo;
    private String autor;
    private int numeroPaginas;
    
    // =============================
    // === constructor | con parámetros ===
    // =============================
    public Libro(String isbn, String titulo, String autor, int numeroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    
    // ==========================================
    // === getters & setters | acceder a atributos private ===
    // ==========================================
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    
    // =====================================================
    // === método toString | para mostrar inforamción de las instancias ===
    // =====================================================
    @Override
    public String toString() {
        return "El libro " + this.titulo + " con ISBN " + this.isbn + " creado por el autor " + this.autor + " tiene " + numeroPaginas + " páginas";
    }
    
    
    
}


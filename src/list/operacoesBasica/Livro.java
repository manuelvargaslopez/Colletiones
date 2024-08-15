package list.operacoesBasica;

public class Livro {

private String titulo;
private String author;
private Integer ano;

public Livro() {
}

public Livro(String titulo, String author, Integer ano) {
    this.titulo = titulo;
    this.author = author;
    this.ano = ano;
}

public String getTitulo() {
    return titulo;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public String getAuthor() {
    return author;
}

public void setAuthor(String author) {
    this.author = author;
}

public Integer getAno() {
    return ano;
}

public void setAno(Integer ano) {
    this.ano = ano;
}

@Override
public String toString() {
    return "Livro [titulo=" + titulo + ", author=" + author + ", ano=" + ano + "]";
}
    
}

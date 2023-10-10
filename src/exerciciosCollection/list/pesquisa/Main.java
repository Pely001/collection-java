package exerciciosCollection.list.pesquisa;

public class Main {
    public static void main(String[] args) {
      CatalogoLivros catalogoLivros = new CatalogoLivros();
      catalogoLivros.adcionarLivro("Livro 1", "Autor 1", 2023);
      catalogoLivros.adcionarLivro("Livro 1", "Autor 2", 2022);
      catalogoLivros.adcionarLivro("Livro 2", "Autor 2", 2020);
      catalogoLivros.adcionarLivro("Livro 3", "Autor 3", 2021);
      catalogoLivros.adcionarLivro("Livro 4", "Autor 4", 1994);

      System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
      System.out.println(catalogoLivros.pesquisaPorIntervaloAno(2020, 2022));
      System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}

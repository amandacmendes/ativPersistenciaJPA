
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class PersistidorLivro {
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
        
        EntityManager em = emf.createEntityManager();
        
        Livro livro = new Livro();
        livro.setTitulo("PostgreSQL Guia do Programador");
        livro.setAutor("André Milani");
        livro.setCategoria("Banco de Dados");
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(livro);
        tx.commit();
        
        em.close();
        emf.close();
        
    }
}

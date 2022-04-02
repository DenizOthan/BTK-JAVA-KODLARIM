public interface IEntityRepository <T>{
    void Add(T entity);
    void delete(T entity);
    void update(T entity);

}

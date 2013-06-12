package dao;

public interface IDAO<T> {
	void save(T entidade);
	void delete(T entidade);
}

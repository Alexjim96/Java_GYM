/**
  interfaz para las interacciones con la base de datos
*/
public abstract interface IBaseDatos<T>{
    public abstract int insertData(T t);
    public abstract List<T> selectData();
    public abstract int deleteData(T t);
    public abstract int updateData(T t);
}

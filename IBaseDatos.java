/**
  interfaz para las interacciones con la base de datos
*/
public abstract interface IBaseDatos{
    public abstract boolean insertData();
    public abstract boolean selectData();
    public abstract boolean deleteData();
    public abstract boolean updateData();
}

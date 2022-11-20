public class MysqlCustomerDao implements ICustomerDao, IRepository{
    @Override
    public void add() {
        System.out.println("Mysql eklendi");
    }

    @Override
    public void get() {

    }
}

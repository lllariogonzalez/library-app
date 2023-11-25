package interfaces;

import models.Lendings;
import java.util.List;

public interface LendingsInterface {
    public void registerLending(Lendings lending) throws Exception;
    public List<Lendings> getLendings() throws Exception;
    public void editLending(Lendings lending) throws Exception;
    public void deleteLending(int lendingId) throws Exception;
    public Lendings getLending(int userId, int bookId) throws Exception;
}

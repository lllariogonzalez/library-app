package db;

import models.Lendings;
import java.util.List;
import java.util.stream.Collectors;
import interfaces.LendingsInterface;

public class DAOLendingsImpl implements LendingsInterface {

    private List<Lendings> lendings;
    private DAOService<Lendings> db;
    private String dataLendings = "dataLendings.json";

    public DAOLendingsImpl() {
        db = new DAOService<Lendings>();
        lendings = db.loadFile(dataLendings, Lendings.class);
    }

    // Método para obtener todos los prestamos
    public List<Lendings> getLendings() throws Exception {
        lendings = db.loadFile(dataLendings, Lendings.class);
        return lendings;
    }

    // Método para obtener un prestamo por ID
    public Lendings getLending(int userId, int bookId) throws Exception {
        lendings = db.loadFile(dataLendings, Lendings.class);
        return lendings.stream()
                .filter(lending -> lending.getUserId() == userId && lending.getBookId() == bookId && lending.getDateReturn() == null)
                .findFirst()
                .orElse(null);
    }

    // Método para agregar un nuevo prestamo
    public void registerLending(Lendings lending) throws Exception {
        lending.setId(lendings.size() + 1);
        lendings.add(lending);
        db.saveFile(lendings, dataLendings);
    }

    // Método para editar un prestamo
    public void editLending(Lendings editLending) throws Exception {
        lendings = lendings.stream()
                .map(lending -> lending.getId() == editLending.getId() ? editLending : lending)
                .collect(Collectors.toList());
        db.saveFile(lendings, dataLendings);
    }

    // Método para eliminar un prestamo por su ID
    public void deleteLending(int id) throws Exception {
        lendings.removeIf(user -> user.getId() == id);
        db.saveFile(lendings, dataLendings);
    }

}

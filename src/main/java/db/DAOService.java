package db;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class DAOService<T> {

    private final ObjectMapper objectMapper;

    public DAOService() {
        objectMapper = new ObjectMapper();
    }

    public List<T> loadFile(String data, Class<T> valueType) {
        List<T> list = null;
        try {
            String filePath = "src/main/java/db/" + data;
            File file = new File(filePath);
            list = objectMapper.readValue(file, objectMapper.getTypeFactory().constructCollectionType(List.class, valueType));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void saveFile(List<T> dataList, String data) {
        try {
            String filePath = "src/main/java/db/" + data;
            File file = new File(filePath);
            objectMapper.writeValue(file, dataList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



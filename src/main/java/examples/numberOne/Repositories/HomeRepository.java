package examples.numberOne.Repositories;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class HomeRepository {
    List<String> list = new ArrayList<>();

    public HomeRepository() {list.add("Hello World!");}

    public String getFirstStringRepository() {return list.get(0);}

    public List<String> getAllStringsRespository() {return list;}

    public void addStringsRepository(String string) {list.add(string);}
}

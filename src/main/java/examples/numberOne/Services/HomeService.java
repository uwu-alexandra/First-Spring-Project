package examples.numberOne.Services;

import examples.numberOne.Repositories.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {

    @Autowired
    HomeRepository homeRepository;

    public String getFirstStringService() {return homeRepository.getFirstStringRepository(); }

    public List<String> getAllStringsService() {return homeRepository.getAllStringsRespository();}

    public void addStringsService(String string) {homeRepository.addStringsRepository(string);}
}

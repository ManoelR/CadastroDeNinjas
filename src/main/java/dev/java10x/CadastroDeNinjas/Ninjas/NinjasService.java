package dev.java10x.CadastroDeNinjas.Ninjas;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjasService {

   // @Autowired // Mesmo valor de inicializar um construtor // é uma boa prática não iniciar com annotation
    private NinjaRepository ninjaRepository;

    // Construtor
    public NinjasService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Listar todos os ninjas
    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll();
    }

    // Listar por ID
    public Optional<NinjaModel> listarID(long id) {
        return ninjaRepository.findById(id);
    }






}

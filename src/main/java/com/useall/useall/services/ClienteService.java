package com.useall.useall.services;

import com.useall.useall.domain.Cliente;
import com.useall.useall.repository.ClienteRepository;
import com.useall.useall.services.exceptions.DataIntegrityViolationException;
import com.useall.useall.services.exceptions.ObjectNotFoundException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    //FIND ONE BY ID
    public Cliente find(Integer id) {
        Optional<Cliente> obj = clienteRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
    }

    //FIND ALL
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    //POST
    public Cliente insert(Cliente obj) {
        obj.setId(null);
        for (Cliente cli : findAll()) {
            if (cli.getCnpj().equals(obj.getCnpj())) {
                throw new DataIntegrityViolationException("Não foi possivel realizar o POST, CNPJ já consta no banco de dados");
            }
        }
        return clienteRepository.save(obj);
    }

    //PUT
    public Cliente update(Cliente obj, Integer id) {
        obj.setId(id);
        return clienteRepository.save(obj);
    }

    //DELETE BY ID
    public void delete(Integer id) {
        find(id);
        try {
            clienteRepository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DataIntegrityViolationException("Não é possível excluir um cliente que possui uma ordem de servico", e);
        }
    }

}

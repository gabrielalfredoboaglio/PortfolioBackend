package com.argentinaprograma.ap.services;

import com.argentinaprograma.ap.exception.UserNotFoundException;
import com.argentinaprograma.ap.models.Header;

import com.argentinaprograma.ap.repository.HeaderRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HeaderService {
    private  final HeaderRepo headerRepo;
    @Autowired
    public HeaderService(HeaderRepo headerRepo) {
        this.headerRepo = headerRepo;
    }

    public Header addHeader(Header header){
        return  headerRepo.save(header);
    }
    public List<Header> buscarHeader(){
        return headerRepo.findAll();

    }
    public Header editarHeader(Header header){
        return headerRepo.save(header);
    }
    public  void borrarHeader(Long id){
        headerRepo.deleteById(id);
    }
    public Header buscarHeaderPorID(Long id){
        return headerRepo.findById(id).orElseThrow(()-> new UserNotFoundException("Header no encontrado"));
    }
}

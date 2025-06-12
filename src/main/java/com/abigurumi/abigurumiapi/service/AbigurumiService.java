package com.abigurumi.abigurumiapi.service;

   import com.abigurumi.abigurumiapi.entity.AbigurumiEntity;
   import com.abigurumi.abigurumiapi.repository.AbigurumiRepository;
   import org.springframework.beans.factory.annotation.Autowired;
   import org.springframework.stereotype.Service;

   import java.util.List;

   @Service
   public class AbigurumiService {
       @Autowired
       private AbigurumiRepository repository;

       public List<AbigurumiEntity> findAll() {
           return repository.findAll();
       }

       public AbigurumiEntity findById(Long id) {
           return repository.findById(id).orElseThrow(() -> new RuntimeException("Abigurumi not found"));
       }

       public AbigurumiEntity create(AbigurumiEntity abigurumi) {
           return repository.save(abigurumi);
       }

       public AbigurumiEntity update(Long id, AbigurumiEntity abigurumi) {
           AbigurumiEntity existing = findById(id);
           existing.setName(abigurumi.getName());
           existing.setDescription(abigurumi.getDescription());
           return repository.save(existing);
       }

       public void delete(Long id) {
           repository.deleteById(id);
       }
   }
package com.abigurumi.abigurumiapi.controller;

   import com.abigurumi.abigurumiapi.entity.AbigurumiEntity;
   import com.abigurumi.abigurumiapi.service.AbigurumiService;
   import org.springframework.beans.factory.annotation.Autowired;
   import org.springframework.web.bind.annotation.*;

   import java.util.List;

   @RestController
   @RequestMapping("/api/abigurumis")
   public class AbigurumiController {
       @Autowired
       private AbigurumiService service;

       @GetMapping
       public List<AbigurumiEntity> getAll() {
           return service.findAll();
       }

       @GetMapping("/{id}")
       public AbigurumiEntity getById(@PathVariable Long id) {
           return service.findById(id);
       }

       @PostMapping
       public AbigurumiEntity create(@RequestBody AbigurumiEntity abigurumi) {
           return service.create(abigurumi);
       }

       @PutMapping("/{id}")
       public AbigurumiEntity update(@PathVariable Long id, @RequestBody AbigurumiEntity abigurumi) {
           return service.update(id, abigurumi);
       }

       @DeleteMapping("/{id}")
       public void delete(@PathVariable Long id) {
           service.delete(id);
       }
   }
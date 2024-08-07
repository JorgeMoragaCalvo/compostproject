package com.compost.entities;

import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@MappedSuperclass
public abstract class AuditoryEntity {

    private LocalDateTime creationDate;
    private LocalDateTime updateDate;
    private LocalDateTime removalDate;
    private boolean status;

    @PrePersist
    public void prePersist(){
        this.creationDate = LocalDateTime.now();
        this.updateDate = LocalDateTime.now();
        this.status = true;
    }

    @PreUpdate
    public void preUpdate(){
        this.updateDate = LocalDateTime.now();
    }

}

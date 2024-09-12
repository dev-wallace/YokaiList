package me.wallacedev.yokailist.models;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = Task.TABLE_NAME)
public class Task {
    public static final String TABLE_NAME = "task";
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)

    
    private Long id;

    @ManyToOne //varias tarefas para um usuario
    @JoinColumn(name ="user_id",nullable = false,updatable = false)
    
    private User user;

    @Column(name = "description",length = 255,nullable = false)
    @NotNull
    @NotEmpty
    @Size(min=1,max=255)
    private String description;

    public Task(Long id, User user, @NotNull @NotEmpty @Size(min = 1, max = 255) String description) {
        this.id = id;
        this.user = user;
        this.description = description;
    }

    public Task (){
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

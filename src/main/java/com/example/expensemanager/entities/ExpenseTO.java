package com.example.expensemanager.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
public class ExpenseTO {
    @Id
    int id;
    private String category;
    private String item;
    private int amount;
    private String date;

    public String getDate() {
         if(date.equals(" ")){
                date= String.valueOf(LocalDate.now());
                return date;
           }
         else
             return date;


    }
}

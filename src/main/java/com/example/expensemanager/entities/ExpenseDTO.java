package com.example.expensemanager.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Data
@Entity
@NoArgsConstructor
public class ExpenseDTO {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    private String category;
    private String item;
    private int amount;
    private String date;
//    private static final HashMap<Integer,String> CATEGORIES_MAP = new HashMap<>(Map.of(1,"Personal",2,"Official"));
        // if(date.equals("d")){
        //        date= String.valueOf(LocalDate.now());
        //    }
    public ExpenseDTO(ExpenseTO expenseTO){
        this.id = expenseTO.getId();
        this.category = expenseTO.getCategory();
        this.amount = expenseTO.getAmount();
        this.item = expenseTO.getItem();
        this.date = expenseTO.getDate();
    }



}

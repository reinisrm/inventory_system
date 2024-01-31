package com.example.InventorySystem.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "inventory_table")
@NoArgsConstructor
public class Inventory {
    @Id
    @Column(name = "id_inventory")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int inventoryId;
    @NotNull
    @Column(name = "Device")
    private String device;
    @NotNull
    @Column(name = "Inventory_Number")
    private String inventoryNumber;
    @Column(name = "Room")
    private String room;
    @Column(name = "Cabinet")
    private String cabinet;

    @OneToMany(mappedBy = "inventory")
    private List<Lending> lending;

    public Inventory(String device, String inventoryNumber, String room, String cabinet) {
        this.device = device;
        this.inventoryNumber = inventoryNumber;
        this.room = room;
        this.cabinet = cabinet;
    }

}

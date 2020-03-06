package com.example.cassandrareader;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("data")
public class Genome {

    @Column
    @PrimaryKey
    private final String id;

    @Column
    private final String barcode;

    public Genome(String id, String barcode) {
        this.id = id;
        this.barcode = barcode;
    }

    public String getId() {
        return id;
    }

    public String getBarcode() {
        return barcode;
    }

    @Override
    public String toString() {
        return "Genome{" +
                "id='" + id + '\'' +
                ", barcode='" + barcode + '\'' +
                '}';
    }
}

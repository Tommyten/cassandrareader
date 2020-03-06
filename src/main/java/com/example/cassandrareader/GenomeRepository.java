package com.example.cassandrareader;

import org.springframework.data.cassandra.repository.CassandraRepository;

public interface GenomeRepository extends CassandraRepository<Genome, String> {
}

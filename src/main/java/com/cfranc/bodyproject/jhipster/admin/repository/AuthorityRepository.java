package com.cfranc.bodyproject.jhipster.admin.repository;

import com.cfranc.bodyproject.jhipster.admin.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}

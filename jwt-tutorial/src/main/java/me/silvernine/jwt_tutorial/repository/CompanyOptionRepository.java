package me.silvernine.jwt_tutorial.repository;

import me.silvernine.jwt_tutorial.entity.CompanyOption;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyOptionRepository extends JpaRepository<CompanyOption, Long> {
}

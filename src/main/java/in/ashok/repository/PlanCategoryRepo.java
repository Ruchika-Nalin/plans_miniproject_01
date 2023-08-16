package in.ashok.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashok.Entity.PlanCategory;

public interface PlanCategoryRepo extends JpaRepository<PlanCategory,Integer> {

}

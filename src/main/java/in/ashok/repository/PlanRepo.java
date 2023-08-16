package in.ashok.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashok.Entity.Plan;

public interface PlanRepo extends JpaRepository<Plan,Integer> {

}

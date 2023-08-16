package in.ashok.service;

import java.util.List;
import java.util.Map;

import in.ashok.Entity.Plan;

public interface PlanService {

	public Map<Integer,String> getPlanCategories();
	public  boolean savePlan(Plan plan);
	public List<Plan> getAllPlans();
	public Plan getPlanById(Integer planId);
	public boolean DeletePlanById(Integer planId);
	public  boolean updatePlan(Plan plan);
	public boolean planStatusChange(Integer planId,String status);
}


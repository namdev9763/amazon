package com.example.pagesize.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.pagesize.modul.Rating;


public interface RatingRepo extends JpaRepository<Rating, Integer> {

	int countByProductidAndUserid(int productid, int userid);

	Rating findByProductidAndUserid(int productid, int userid);

	@Query(value = "select avg(stars) from rating where productid=?1;", nativeQuery = true)
	double getAvgRatingByProductId(int productid);
}
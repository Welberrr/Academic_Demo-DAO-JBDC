package model.dao;

import java.util.List;

import model.entties.Seller;

public interface SellerDao {

	void insert(Seller obj);
	void update(Seller obj);
	void delete(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
}
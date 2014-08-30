package br.pucpr.bsi.prog6.ticketsAereosBSI.dao;

import java.util.List;

import br.pucpr.bsi.prog6.ticketsAereosBSI.model.Papel;

public class PapelDAO extends PatternDAO<Papel> {
	
	private static final long serialVersionUID = 1L;
	private final static PapelDAO instance = new PapelDAO();

	public PapelDAO() {
		super(Papel.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Papel findById(long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public List<Papel> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Long insert(Papel obj) {
		// TODO Auto-generated method stub
		return super.insert(obj);
	}

	@Override
	public boolean update(Papel obj) {
		// TODO Auto-generated method stub
		return super.update(obj);
	}

	@Override
	public boolean delete(Papel obj) {
		// TODO Auto-generated method stub
		return super.delete(obj);
	}

	public static PapelDAO getInstance() {
		return instance;
	}
	@Override
	public List<Papel> findByFilter(Papel filter) {
		// TODO Auto-generated method stub
		return null;
	}

}
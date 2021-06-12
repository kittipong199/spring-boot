package com.art.hellospringboot.hello.modelled;


	import org.springframework.data.repository.CrudRepository;
	public interface BankAccountRepository extends CrudRepository<BankAccount, Integer>{ 
		
		
	}

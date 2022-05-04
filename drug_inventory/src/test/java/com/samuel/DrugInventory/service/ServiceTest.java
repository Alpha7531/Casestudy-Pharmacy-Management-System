package com.samuel.DrugInventory.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.samuel.DrugInventory.Model.DrugInventory;
import com.samuel.DrugInventory.Repository.DrugInventoryRepository;

class ServiceTest {
	@Mock
	private DrugInventoryRepository drugRepository;
	
	@InjectMocks
	private Service drugService;
	
	@Test
	 public void testViewAllDrug() {
		List<DrugInventory> drug = new ArrayList<>();
		drug.add(new DrugInventory(1,"pheromon","50$"));
		drug.add(new DrugInventory(2,"vitwax","60$"));

		when(drugRepository.findAll()).thenReturn(drug);
		List<DrugInventory> expected = drugService.viewAllDrug();
		assertEquals(expected, drug);
	}


	

	/*
	 * @Test public void testAddDrugInfo() throws ParseException { DrugInventory
	 * drug = new DrugInventory(10, "crocine", "10");
	 * when(drugRepository.save(drug)).thenReturn(drug); assertEquals(drug,
	 * drugService.addDrugInfo(drug)); }
	 */




	@Test
	public void testUpdateDrug() {
		
			DrugInventory drug = new DrugInventory(1, "crocine", "55");
			drugService.updateDrug(drug);
			drug.setId(1);
			drug.setDrugname("VitB");
			drug.setDrugPrice("55");
			drugService.updateDrug(drug );
			Assertions.assertThat(drug.getDrugname()).isEqualTo("VitB");
		}
	
		
	@Test
	void testDeleteById() {
		DrugInventory drug = new DrugInventory(6, "crocine","55");
		when(drugRepository.findById(drug.getId())).thenReturn(Optional.of(drug));
		drugService.deleteById(drug.getId());
		verify(drugRepository).deleteById(drug.getId());
	}

}

package com.firewall.inventory_service.repository;

import com.firewall.inventory_service.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InventoryRepo extends JpaRepository<Inventory, Long> {
  //  Optional<Inventory> findBySkuCode(String skuCode);

    List<Inventory> findBySkuCodeIn(List<String> skuCode);
}

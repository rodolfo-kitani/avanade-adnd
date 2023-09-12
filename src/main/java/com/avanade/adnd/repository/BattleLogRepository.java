package com.avanade.adnd.repository;

import com.avanade.adnd.model.BattleLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BattleLogRepository extends JpaRepository<BattleLog, UUID> {
}

package dev.syscode.conference.repository;

import dev.syscode.conference.bean.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository  extends JpaRepository<Session, Long> {
}

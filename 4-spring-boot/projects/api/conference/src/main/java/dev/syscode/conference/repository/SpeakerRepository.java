package dev.syscode.conference.repository;

import dev.syscode.conference.bean.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}

package dev.syscode.conference.service.impl;

import dev.syscode.conference.model.Speaker;
import dev.syscode.conference.repository.SpeakerRepository;
import dev.syscode.conference.service.SpeakerService;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

	private SpeakerRepository speakerRepository;

	public SpeakerServiceImpl() {
		System.out.println("SpeakerServiceImpl no args constructor");
	}

	/**
	 * Contructor para injeccion
	 */
	public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
		System.out.println("SpeakerServiceImpl repository constructor");
		this.speakerRepository = speakerRepository;
	}

	@Override
	public List<Speaker> findAll() {
		return speakerRepository.findAll();
	}

	/**
	 * Setter injection
	 */
	public void setSpeakerRepository(SpeakerRepository speakerRepository) {
		System.out.println("SpeakerServiceImpl no args constructor");
		this.speakerRepository = speakerRepository;
	}
}

package Model;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Animal {
	private String name;
	private LocalDateTime dateOfBirth;

	public Animal (String name, String dateOfBirth) {
		this.name = name;
		this.dateOfBirth = ZonedDateTime.parse(dateOfBirth).toLocalDateTime();
	}

	public LocalDateTime getDateOfBirth() {
		return dateOfBirth;
	}
}

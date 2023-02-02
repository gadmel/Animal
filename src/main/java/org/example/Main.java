package org.example;

import Model.Animal;

import java.time.LocalDateTime;

public class Main {
	public static void main(String[] args) {
		Animal bagheera = new Animal("Bagheera", "2021-08-15T00:00:00Z");
		LocalDateTime now = LocalDateTime.now();

		System.out.println(countDaysUntilBirthday(bagheera));

	}

	static int countDaysUntilBirthday(Animal animal) {
		LocalDateTime now = LocalDateTime.now();
		int daysUntilBirthday = animal.getDateOfBirth().getDayOfYear() - now.getDayOfYear();
		if (daysUntilBirthday < 0) {
			daysUntilBirthday = 365 - now.getDayOfYear() + animal.getDateOfBirth().getDayOfYear();
		}
		return daysUntilBirthday;
	}



}
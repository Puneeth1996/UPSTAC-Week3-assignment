package org.upgrad.upstac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UpstacApplication {

	public UpstacApplication() {
	}

	public static void main(String[] args) {
		SpringApplication.run(UpstacApplication.class, args);
	}


	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof UpstacApplication)) return false;
		final UpstacApplication other = (UpstacApplication) o;
		if (!other.canEqual((Object) this)) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof UpstacApplication;
	}

	public int hashCode() {
		int result = 1;
		return result;
	}

	public String toString() {
		return "UpstacApplication()";
	}
}

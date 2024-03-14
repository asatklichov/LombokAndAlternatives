package net.sahet.lombok.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@Builder(toBuilder = true)
@ToString
@EqualsAndHashCode
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Adam {
	@NonNull
	@Getter
	private final String lastName;
	@NonNull
	@Getter
	private final String firstName;
	@NonNull
	@Getter
	private final Integer age;
}

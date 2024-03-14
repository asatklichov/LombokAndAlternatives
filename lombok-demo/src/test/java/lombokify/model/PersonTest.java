/*
 * package lombokify.model;
 * 
 * import net.sahet.lombok.demo.Adam;
 * 
 * public class PersonTest { private static Adam JOHN =
 * Adam.builder().firstName("John").lastName("Doe").age(30).build(); private
 * static Adam JANE =
 * Adam.builder().firstName("Jane").lastName("Doe").age(30).build();
 * 
 * @Test public void testEquals() throws Exception { Adam JOHN_COPY =
 * JOHN.toBuilder().build(); assertThat(JOHN_COPY).isEqualTo(JOHN); }
 * 
 * @Test public void testNotEquals() throws Exception {
 * assertThat(JANE).isNotEqualTo(JOHN); }
 * 
 * @Test public void testHashCode() throws Exception { Adam JOHN_COPY =
 * JOHN.toBuilder().build();
 * assertThat(JOHN_COPY.hashCode()).isEqualTo(JOHN.hashCode()); }
 * 
 * @Test public void testHashCodeNotEquals() throws Exception { Adam JOHN_COPY =
 * JOHN.toBuilder().build();
 * assertThat(JOHN_COPY.hashCode()).isNotEqualTo(JANE.hashCode()); }
 * 
 * @Test public void testToString() throws Exception { String jane =
 * JANE.toString();
 * 
 * assertThat(jane).contains(JANE.getFirstName());
 * assertThat(jane).contains(JANE.getLastName()); assertThat(jane).contains("" +
 * JANE.getAge()); assertThat(jane).doesNotContain(JOHN.getFirstName()); }
 * 
 * }
 */
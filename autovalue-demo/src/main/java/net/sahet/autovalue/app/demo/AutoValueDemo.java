package net.sahet.autovalue.app.demo;

/**

 * 
 * In order to generate a value-type object all you have to do is to annotate an
 * abstract class with the @AutoValue annotation and compile your class. What is
 * generated is a value object with accessor methods, parameterized constructor,
 * properly overridden toString(), equals(Object) and hashCode() methods.
 *
 *
 * What Are Value-Types? Value-type objects are objects whose equality to one
 * another is not determined by identity but rather their internal state. This
 * means that two instances of a value-typed object are considered equal as long
 * as they have equal field values.
 * 
 * Typically, value-types are immutable. Their fields must be made final and
 * they must not have setter methods as this will make them changeable after
 * instantiation.
 * 
 * They must consume all field values through a constructor or a factory method.
 * 
 * Value-types are not JavaBeans because they don’t have a default or zero
 * argument constructor and neither do they have setter methods, similarly, they
 * are not Data Transfer Objects nor Plain Old Java Objects.
 * 
 * Additionally, a value-typed class must be final, so that they are not
 * extendable, least that someone overrides the methods. JavaBeans, DTOs and
 * POJOs need not be final.
 * 
 *  * https://www.baeldung.com/introduction-to-autovalue
 */
public class AutoValueDemo {

}

package by.owl.coursesproject.taxopark.engines;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonSubTypes.Type;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

@JsonTypeInfo(use = Id.CLASS)
@JsonSubTypes({ @Type(Diesel.class), @Type(Gasoline.class) })
public interface Engine {

	String toString();

}

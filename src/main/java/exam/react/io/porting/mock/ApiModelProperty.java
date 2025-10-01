package exam.react.io.porting.mock;

public @interface ApiModelProperty {

    String value() default "";
    String example() default "";
    boolean allowEmptyValue() default false;
    boolean required() default false;
}

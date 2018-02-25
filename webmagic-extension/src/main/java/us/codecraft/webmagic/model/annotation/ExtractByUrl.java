package us.codecraft.webmagic.model.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 从URL中进行抽取，它只支持正则表达式作为抽取规则
 * <p>
 * Define a extractor to extract data in url of current page. Only regex can be used. <br>
 *
 * @author code4crafter@gmail.com <br>
 * @since 0.2.0
 */
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface ExtractByUrl {

    /**
     * Extractor expression, only regex can be used
     *
     * @return extractor expression
     */
    String value() default "";

    /**
     * Define whether the field can be null.<br>
     * If set to 'true' and the extractor get no result, the entire class will be discarded. <br>
     *
     * @return whether the field can be null
     */
    boolean notNull() default false;

    /**
     * Define whether the extractor return more than one result.
     * When set to 'true', the extractor return a list of string (so you should define the field as List). <br>
     * <p>
     * Deprecated since 0.4.2. This option is determined automatically by the class of field.
     *
     * @return whether the extractor return more than one result
     * @deprecated since 0.4.2
     */
    boolean multi() default false;

}

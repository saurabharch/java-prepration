import java.lang.annotation.*;

public class CustomAnnotationExample {

    public static void main(String[] args) {
                GalaxySeries obj = new GalaxySeries("POP",5);
                Class c = obj.getClass();
                Annotation an = c.getAnnotation(SmartPhone.class);
                Annotation bn = c.getAnnotation(Brand.class);
                SmartPhone s  = (SmartPhone) an;
                Brand b = (Brand)bn;
                System.out.println("OS NAME: "+s.OS()+" ,Version: "+s.version()+" ,Brand:"+b.name()+" ,model/size: "+obj.model+"/"+obj.size);

    }

    // Single Value Annotation
    @Documented
    @Inherited
    @Target(ElementType.TYPE) // Meta Annotation
    @Retention(RetentionPolicy.RUNTIME) // Meta Annotation
    @interface Brand {
        String name() default "None";
    }

    // Multi value Annotation
    @Documented
    @Inherited
    @Target(ElementType.TYPE) // Meta Annotation
    @Retention(RetentionPolicy.RUNTIME) // Meta Annotation
    @interface SmartPhone{
        String OS() default "None";
        int version() default 0_0_0_0;

    }

    // Marker Annotation
    @interface mobile {

    }

    @Brand(name="SAMSUNG")
    @SmartPhone(OS="Android",version=1_2_3_0)
    static class GalaxySeries{
        String model;
        int size;

        public GalaxySeries(String model, int size) {
            this.model = model;
            this.size = size;
        }
    }
}

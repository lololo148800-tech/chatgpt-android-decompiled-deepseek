package p1069vp;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: vp.h */
/* JADX INFO: loaded from: classes2.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC20673h {
    boolean hasBody() default false;

    String method();

    String path() default "";
}

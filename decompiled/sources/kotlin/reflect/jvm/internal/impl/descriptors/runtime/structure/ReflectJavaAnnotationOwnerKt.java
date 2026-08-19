package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import p523V9.AbstractC8138m0;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectJavaAnnotationOwnerKt {
    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    public static final ReflectJavaAnnotation findAnnotation(Annotation[] annotationArr, FqName fqName) {
        AbstractC16544l.m18094g(annotationArr, "<this>");
        AbstractC16544l.m18094g(fqName, "fqName");
        for (Annotation annotation : annotationArr) {
            if (AbstractC16544l.m18089b(ReflectClassUtilKt.getClassId(AbstractC8138m0.m8667b(AbstractC8138m0.m8666a(annotation))).asSingleFqName(), fqName)) {
                if (annotation != null) {
                    return new ReflectJavaAnnotation(annotation);
                }
                return null;
            }
        }
        annotation = null;
        if (annotation != null) {
            return new ReflectJavaAnnotation(annotation);
        }
        return null;
    }

    public static final List<ReflectJavaAnnotation> getAnnotations(Annotation[] annotationArr) {
        AbstractC16544l.m18094g(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new ReflectJavaAnnotation(annotation));
        }
        return arrayList;
    }
}

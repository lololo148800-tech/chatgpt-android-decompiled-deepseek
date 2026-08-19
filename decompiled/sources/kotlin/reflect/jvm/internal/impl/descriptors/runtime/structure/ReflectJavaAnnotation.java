package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import p523V9.AbstractC8138m0;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectJavaAnnotation extends ReflectJavaElement implements JavaAnnotation {

    /* JADX INFO: renamed from: a */
    public final Annotation f51684a;

    public ReflectJavaAnnotation(Annotation annotation) {
        AbstractC16544l.m18094g(annotation, "annotation");
        this.f51684a = annotation;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ReflectJavaAnnotation) {
            if (this.f51684a == ((ReflectJavaAnnotation) obj).f51684a) {
                return true;
            }
        }
        return false;
    }

    public final Annotation getAnnotation() {
        return this.f51684a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public Collection<JavaAnnotationArgument> getArguments() throws IllegalAccessException, InvocationTargetException {
        Annotation annotation = this.f51684a;
        Method[] declaredMethods = AbstractC8138m0.m8667b(AbstractC8138m0.m8666a(annotation)).getDeclaredMethods();
        AbstractC16544l.m18093f(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            ReflectJavaAnnotationArgument.Factory factory = ReflectJavaAnnotationArgument.Factory;
            Object objInvoke = method.invoke(annotation, null);
            AbstractC16544l.m18093f(objInvoke, "invoke(...)");
            arrayList.add(factory.create(objInvoke, Name.identifier(method.getName())));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public ClassId getClassId() {
        return ReflectClassUtilKt.getClassId(AbstractC8138m0.m8667b(AbstractC8138m0.m8666a(this.f51684a)));
    }

    public int hashCode() {
        return System.identityHashCode(this.f51684a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public boolean isFreshlySupportedTypeUseAnnotation() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public boolean isIdeExternalAnnotation() {
        return false;
    }

    public String toString() {
        return ReflectJavaAnnotation.class.getName() + ": " + this.f51684a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public ReflectJavaClass resolve() {
        return new ReflectJavaClass(AbstractC8138m0.m8667b(AbstractC8138m0.m8666a(this.f51684a)));
    }
}

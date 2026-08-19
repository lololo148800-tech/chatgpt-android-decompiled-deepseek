package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectJavaArrayType extends ReflectJavaType implements JavaArrayType {

    /* JADX INFO: renamed from: a */
    public final Type f51688a;

    /* JADX INFO: renamed from: b */
    public final ReflectJavaType f51689b;

    /* JADX INFO: renamed from: c */
    public final C17689w f51690c;

    public ReflectJavaArrayType(Type reflectType) {
        ReflectJavaType reflectJavaTypeCreate;
        AbstractC16544l.m18094g(reflectType, "reflectType");
        this.f51688a = reflectType;
        if (!(reflectType instanceof GenericArrayType)) {
            if (reflectType instanceof Class) {
                Class cls = (Class) reflectType;
                if (cls.isArray()) {
                    ReflectJavaType.Factory factory = ReflectJavaType.Factory;
                    Class<?> componentType = cls.getComponentType();
                    AbstractC16544l.m18093f(componentType, "getComponentType(...)");
                    reflectJavaTypeCreate = factory.create(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + reflectType.getClass() + "): " + reflectType);
        }
        ReflectJavaType.Factory factory2 = ReflectJavaType.Factory;
        Type genericComponentType = ((GenericArrayType) reflectType).getGenericComponentType();
        AbstractC16544l.m18093f(genericComponentType, "getGenericComponentType(...)");
        reflectJavaTypeCreate = factory2.create(genericComponentType);
        this.f51689b = reflectJavaTypeCreate;
        this.f51690c = C17689w.f56480Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public Collection<JavaAnnotation> getAnnotations() {
        return this.f51690c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    public final Type getReflectType() {
        return this.f51688a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType
    public ReflectJavaType getComponentType() {
        return this.f51689b;
    }
}

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectJavaClassifierType extends ReflectJavaType implements JavaClassifierType {

    /* JADX INFO: renamed from: a */
    public final Type f51693a;

    /* JADX INFO: renamed from: b */
    public final ReflectJavaElement f51694b;

    public ReflectJavaClassifierType(Type reflectType) {
        ReflectJavaElement reflectJavaClass;
        AbstractC16544l.m18094g(reflectType, "reflectType");
        this.f51693a = reflectType;
        Type reflectType2 = getReflectType();
        if (reflectType2 instanceof Class) {
            reflectJavaClass = new ReflectJavaClass((Class) reflectType2);
        } else if (reflectType2 instanceof TypeVariable) {
            reflectJavaClass = new ReflectJavaTypeParameter((TypeVariable) reflectType2);
        } else {
            if (!(reflectType2 instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + reflectType2.getClass() + "): " + reflectType2);
            }
            Type rawType = ((ParameterizedType) reflectType2).getRawType();
            AbstractC16544l.m18092e(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            reflectJavaClass = new ReflectJavaClass((Class) rawType);
        }
        this.f51694b = reflectJavaClass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public JavaAnnotation findAnnotation(FqName fqName) {
        AbstractC16544l.m18094g(fqName, "fqName");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public Collection<JavaAnnotation> getAnnotations() {
        return C17689w.f56480Y;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier] */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public JavaClassifier getClassifier() {
        return this.f51694b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public String getClassifierQualifiedName() {
        throw new UnsupportedOperationException("Type not found: " + getReflectType());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public String getPresentableText() {
        return getReflectType().toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    public Type getReflectType() {
        return this.f51693a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public List<JavaType> getTypeArguments() {
        List<Type> parameterizedTypeArguments = ReflectClassUtilKt.getParameterizedTypeArguments(getReflectType());
        ReflectJavaType.Factory factory = ReflectJavaType.Factory;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(parameterizedTypeArguments, 10));
        Iterator<T> it = parameterizedTypeArguments.iterator();
        while (it.hasNext()) {
            arrayList.add(factory.create((Type) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public boolean isRaw() {
        Type reflectType = getReflectType();
        if (!(reflectType instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) reflectType).getTypeParameters();
        AbstractC16544l.m18093f(typeParameters, "getTypeParameters(...)");
        return !(typeParameters.length == 0);
    }
}

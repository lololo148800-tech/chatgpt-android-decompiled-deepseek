package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ReflectJavaType implements JavaType {
    public static final Factory Factory = new Factory(null);

    public static final class Factory {
        public Factory(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final ReflectJavaType create(Type type) {
            ReflectJavaType reflectJavaArrayType;
            AbstractC16544l.m18094g(type, "type");
            boolean z6 = type instanceof Class;
            if (z6) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new ReflectJavaPrimitiveType(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z6 && ((Class) type).isArray())) {
                reflectJavaArrayType = new ReflectJavaArrayType(type);
            } else {
                reflectJavaArrayType = type instanceof WildcardType ? new ReflectJavaWildcardType((WildcardType) type) : new ReflectJavaClassifierType(type);
            }
            return reflectJavaArrayType;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof ReflectJavaType) && AbstractC16544l.m18089b(getReflectType(), ((ReflectJavaType) obj).getReflectType());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public JavaAnnotation findAnnotation(FqName fqName) {
        Object obj;
        Object next;
        ClassId classId;
        AbstractC16544l.m18094g(fqName, "fqName");
        Iterator<T> it = getAnnotations().iterator();
        do {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
                classId = ((JavaAnnotation) next).getClassId();
            }
            return (JavaAnnotation) obj;
        } while (!AbstractC16544l.m18089b(classId != null ? classId.asSingleFqName() : null, fqName));
        obj = next;
        return (JavaAnnotation) obj;
    }

    public abstract Type getReflectType();

    public int hashCode() {
        return getReflectType().hashCode();
    }

    public String toString() {
        return getClass().getName() + ": " + getReflectType();
    }
}

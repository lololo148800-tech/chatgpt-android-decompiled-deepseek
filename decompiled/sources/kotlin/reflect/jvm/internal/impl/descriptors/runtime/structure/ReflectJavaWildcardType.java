package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import p909nm.AbstractC17678l;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectJavaWildcardType extends ReflectJavaType implements JavaWildcardType {

    /* JADX INFO: renamed from: a */
    public final WildcardType f51709a;

    /* JADX INFO: renamed from: b */
    public final C17689w f51710b;

    public ReflectJavaWildcardType(WildcardType reflectType) {
        AbstractC16544l.m18094g(reflectType, "reflectType");
        this.f51709a = reflectType;
        this.f51710b = C17689w.f56480Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public Collection<JavaAnnotation> getAnnotations() {
        return this.f51710b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    public Type getReflectType() {
        return this.f51709a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    public boolean isExtends() {
        Type[] upperBounds = this.f51709a.getUpperBounds();
        AbstractC16544l.m18093f(upperBounds, "getUpperBounds(...)");
        return !AbstractC16544l.m18089b(AbstractC17678l.m19317x(upperBounds), Object.class);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    public ReflectJavaType getBound() {
        WildcardType wildcardType = this.f51709a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
        }
        if (lowerBounds.length == 1) {
            ReflectJavaType.Factory factory = ReflectJavaType.Factory;
            Object objM19288K = AbstractC17678l.m19288K(lowerBounds);
            AbstractC16544l.m18093f(objM19288K, "single(...)");
            return factory.create((Type) objM19288K);
        }
        if (upperBounds.length == 1) {
            Type type = (Type) AbstractC17678l.m19288K(upperBounds);
            if (!AbstractC16544l.m18089b(type, Object.class)) {
                ReflectJavaType.Factory factory2 = ReflectJavaType.Factory;
                AbstractC16544l.m18091d(type);
                return factory2.create(type);
            }
        }
        return null;
    }
}

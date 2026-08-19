package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;

/* JADX INFO: loaded from: classes2.dex */
public interface TypeParameterResolver {

    public static final class EMPTY implements TypeParameterResolver {
        public static final EMPTY INSTANCE = new EMPTY();

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver
        public TypeParameterDescriptor resolveTypeParameter(JavaTypeParameter javaTypeParameter) {
            AbstractC16544l.m18094g(javaTypeParameter, "javaTypeParameter");
            return null;
        }
    }

    TypeParameterDescriptor resolveTypeParameter(JavaTypeParameter javaTypeParameter);
}

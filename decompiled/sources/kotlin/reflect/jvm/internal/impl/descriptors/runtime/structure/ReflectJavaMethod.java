package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectJavaMethod extends ReflectJavaMember implements JavaMethod {

    /* JADX INFO: renamed from: a */
    public final Method f51699a;

    public ReflectJavaMethod(Method member) {
        AbstractC16544l.m18094g(member, "member");
        this.f51699a = member;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    public JavaAnnotationArgument getAnnotationParameterDefaultValue() {
        Object defaultValue = getMember().getDefaultValue();
        if (defaultValue != null) {
            return ReflectJavaAnnotationArgument.Factory.create(defaultValue, null);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    public boolean getHasAnnotationParameterDefaultValue() {
        return getAnnotationParameterDefaultValue() != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    public List<ReflectJavaTypeParameter> getTypeParameters() {
        TypeVariable<Method>[] typeParameters = getMember().getTypeParameters();
        AbstractC16544l.m18093f(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new ReflectJavaTypeParameter(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    public List<JavaValueParameter> getValueParameters() {
        Type[] genericParameterTypes = getMember().getGenericParameterTypes();
        AbstractC16544l.m18093f(genericParameterTypes, "getGenericParameterTypes(...)");
        Annotation[][] parameterAnnotations = getMember().getParameterAnnotations();
        AbstractC16544l.m18093f(parameterAnnotations, "getParameterAnnotations(...)");
        return m18162a(genericParameterTypes, parameterAnnotations, getMember().isVarArgs());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    public Method getMember() {
        return this.f51699a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    public ReflectJavaType getReturnType() {
        ReflectJavaType.Factory factory = ReflectJavaType.Factory;
        Type genericReturnType = getMember().getGenericReturnType();
        AbstractC16544l.m18093f(genericReturnType, "getGenericReturnType(...)");
        return factory.create(genericReturnType);
    }
}

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectJavaField extends ReflectJavaMember implements JavaField {

    /* JADX INFO: renamed from: a */
    public final Field f51697a;

    public ReflectJavaField(Field member) {
        AbstractC16544l.m18094g(member, "member");
        this.f51697a = member;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    public boolean getHasConstantNotNullInitializer() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    public Field getMember() {
        return this.f51697a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    public boolean isEnumEntry() {
        return getMember().isEnumConstant();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    public ReflectJavaType getType() {
        ReflectJavaType.Factory factory = ReflectJavaType.Factory;
        Type genericType = getMember().getGenericType();
        AbstractC16544l.m18093f(genericType, "getGenericType(...)");
        return factory.create(genericType);
    }
}

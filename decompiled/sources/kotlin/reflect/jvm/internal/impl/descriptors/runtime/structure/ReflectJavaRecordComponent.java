package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import p571X9.AbstractC9364s4;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectJavaRecordComponent extends ReflectJavaMember implements JavaRecordComponent {

    /* JADX INFO: renamed from: a */
    public final Object f51703a;

    public ReflectJavaRecordComponent(Object recordComponent) {
        AbstractC16544l.m18094g(recordComponent, "recordComponent");
        this.f51703a = recordComponent;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    public Member getMember() throws IllegalAccessException, InvocationTargetException {
        Object recordComponent = this.f51703a;
        AbstractC16544l.m18094g(recordComponent, "recordComponent");
        Java16RecordComponentsLoader$Cache java16RecordComponentsLoader$Cache = AbstractC9364s4.f28212a;
        Method method = null;
        if (java16RecordComponentsLoader$Cache == null) {
            Class<?> cls = recordComponent.getClass();
            try {
                java16RecordComponentsLoader$Cache = new Java16RecordComponentsLoader$Cache(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                java16RecordComponentsLoader$Cache = new Java16RecordComponentsLoader$Cache(null, null);
            }
            AbstractC9364s4.f28212a = java16RecordComponentsLoader$Cache;
        }
        Method getAccessor = java16RecordComponentsLoader$Cache.getGetAccessor();
        if (getAccessor != null) {
            Object objInvoke = getAccessor.invoke(recordComponent, null);
            AbstractC16544l.m18092e(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
            method = (Method) objInvoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent
    public JavaType getType() throws IllegalAccessException, InvocationTargetException {
        Object recordComponent = this.f51703a;
        AbstractC16544l.m18094g(recordComponent, "recordComponent");
        Java16RecordComponentsLoader$Cache java16RecordComponentsLoader$Cache = AbstractC9364s4.f28212a;
        Class cls = null;
        if (java16RecordComponentsLoader$Cache == null) {
            Class<?> cls2 = recordComponent.getClass();
            try {
                java16RecordComponentsLoader$Cache = new Java16RecordComponentsLoader$Cache(cls2.getMethod("getType", null), cls2.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                java16RecordComponentsLoader$Cache = new Java16RecordComponentsLoader$Cache(null, null);
            }
            AbstractC9364s4.f28212a = java16RecordComponentsLoader$Cache;
        }
        Method getType = java16RecordComponentsLoader$Cache.getGetType();
        if (getType != null) {
            Object objInvoke = getType.invoke(recordComponent, null);
            AbstractC16544l.m18092e(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
            cls = (Class) objInvoke;
        }
        if (cls != null) {
            return new ReflectJavaClassifierType(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent
    public boolean isVararg() {
        return false;
    }
}

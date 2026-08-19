package p335Nb;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p544W9.AbstractC8633f4;

/* JADX INFO: renamed from: Nb.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5703b extends AbstractC8633f4 {

    /* JADX INFO: renamed from: a */
    public final Method f18485a = Class.class.getMethod("isRecord", null);

    /* JADX INFO: renamed from: b */
    public final Method f18486b;

    /* JADX INFO: renamed from: c */
    public final Method f18487c;

    /* JADX INFO: renamed from: d */
    public final Method f18488d;

    public C5703b() throws NoSuchMethodException {
        Method method = Class.class.getMethod("getRecordComponents", null);
        this.f18486b = method;
        Class<?> componentType = method.getReturnType().getComponentType();
        this.f18487c = componentType.getMethod("getName", null);
        this.f18488d = componentType.getMethod("getType", null);
    }

    @Override // p544W9.AbstractC8633f4
    /* JADX INFO: renamed from: b */
    public final Method mo6143b(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }

    @Override // p544W9.AbstractC8633f4
    /* JADX INFO: renamed from: c */
    public final Constructor mo6144c(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f18486b.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                clsArr[i10] = (Class) this.f18488d.invoke(objArr[i10], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }

    @Override // p544W9.AbstractC8633f4
    /* JADX INFO: renamed from: d */
    public final String[] mo6145d(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f18486b.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                strArr[i10] = (String) this.f18487c.invoke(objArr[i10], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }

    @Override // p544W9.AbstractC8633f4
    /* JADX INFO: renamed from: e */
    public final boolean mo6146e(Class cls) {
        try {
            return ((Boolean) this.f18485a.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }
}

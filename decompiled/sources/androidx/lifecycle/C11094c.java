package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.c */
/* JADX INFO: loaded from: classes.dex */
public final class C11094c {

    /* JADX INFO: renamed from: c */
    public static final C11094c f33466c = new C11094c();

    /* JADX INFO: renamed from: a */
    public final HashMap f33467a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f33468b = new HashMap();

    /* JADX INFO: renamed from: b */
    public static void m12151b(HashMap map, C11093b c11093b, EnumC11103l enumC11103l, Class cls) {
        EnumC11103l enumC11103l2 = (EnumC11103l) map.get(c11093b);
        if (enumC11103l2 == null || enumC11103l == enumC11103l2) {
            if (enumC11103l2 == null) {
                map.put(c11093b, enumC11103l);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c11093b.f33465b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC11103l2 + ", new value " + enumC11103l);
    }

    /* JADX INFO: renamed from: a */
    public final C11091a m12152a(Class cls, Method[] methodArr) {
        int i10;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f33467a;
        if (superclass != null) {
            C11091a c11091aM12152a = (C11091a) map2.get(superclass);
            if (c11091aM12152a == null) {
                c11091aM12152a = m12152a(superclass, null);
            }
            map.putAll(c11091aM12152a.f33460b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C11091a c11091aM12152a2 = (C11091a) map2.get(cls2);
            if (c11091aM12152a2 == null) {
                c11091aM12152a2 = m12152a(cls2, null);
            }
            for (Map.Entry entry : c11091aM12152a2.f33460b.entrySet()) {
                m12151b(map, (C11093b) entry.getKey(), (EnumC11103l) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e10) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
            }
        }
        boolean z6 = false;
        for (Method method : methodArr) {
            InterfaceC11071G interfaceC11071G = (InterfaceC11071G) method.getAnnotation(InterfaceC11071G.class);
            if (interfaceC11071G != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!InterfaceC11112u.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                EnumC11103l enumC11103lValue = interfaceC11071G.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC11103l.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC11103lValue != EnumC11103l.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m12151b(map, new C11093b(i10, method), enumC11103lValue, cls);
                z6 = true;
            }
        }
        C11091a c11091a = new C11091a(map);
        map2.put(cls, c11091a);
        this.f33468b.put(cls, Boolean.valueOf(z6));
        return c11091a;
    }
}

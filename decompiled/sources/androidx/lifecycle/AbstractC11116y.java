package androidx.lifecycle;

import android.gov.nist.core.Separators;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21329w;
import p138F8.vJO.vRJidSveZHcTw;
import p571X9.AbstractC9393x3;

/* JADX INFO: renamed from: androidx.lifecycle.y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11116y {

    /* JADX INFO: renamed from: a */
    public static final HashMap f33512a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static final HashMap f33513b = new HashMap();

    /* JADX INFO: renamed from: a */
    public static void m12174a(Constructor constructor, InterfaceC11111t interfaceC11111t) {
        try {
            AbstractC16544l.m18093f(constructor.newInstance(interfaceC11111t), "{\n            constructo…tance(`object`)\n        }");
            throw new ClassCastException();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0117  */
    /* JADX WARN: Code duplicated, block: B:66:0x0123  */
    /* JADX WARN: Code duplicated, block: B:69:0x0127  */
    /* JADX WARN: Code duplicated, block: B:72:0x0133 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0135  */
    /* JADX WARN: Code duplicated, block: B:77:0x014a  */
    /* JADX WARN: Code duplicated, block: B:87:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static int m12175b(Class cls) {
        Constructor declaredConstructor;
        boolean zBooleanValue;
        Class<?>[] interfaces;
        int i10;
        boolean z6;
        int i11 = 1;
        HashMap map = f33512a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r6 = cls.getPackage();
                String name = cls.getCanonicalName();
                String fullPackage = r6 != null ? r6.getName() : "";
                AbstractC16544l.m18093f(fullPackage, "fullPackage");
                if (fullPackage.length() != 0) {
                    AbstractC16544l.m18093f(name, "name");
                    name = name.substring(fullPackage.length() + 1);
                    AbstractC16544l.m18093f(name, "this as java.lang.String).substring(startIndex)");
                }
                AbstractC16544l.m18093f(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String strConcat = AbstractC21329w.m21731r(name, Separators.DOT, vRJidSveZHcTw.SkqRrn).concat("_LifecycleAdapter");
                if (fullPackage.length() != 0) {
                    strConcat = fullPackage + '.' + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(e10);
            }
            HashMap map2 = f33513b;
            if (declaredConstructor != null) {
                map2.put(cls, AbstractC9393x3.m9974d(declaredConstructor));
            } else {
                C11094c c11094c = C11094c.f33466c;
                HashMap map3 = c11094c.f33468b;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length) {
                                map3.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((InterfaceC11071G) declaredMethods[i12].getAnnotation(InterfaceC11071G.class)) != null) {
                                c11094c.m12152a(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i12++;
                        }
                    } catch (NoClassDefFoundError e11) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e11);
                    }
                }
                if (!zBooleanValue) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC11111t.class.isAssignableFrom(superclass)) {
                        AbstractC16544l.m18093f(superclass, "superclass");
                        if (m12175b(superclass) != 1) {
                            Object obj = map2.get(superclass);
                            AbstractC16544l.m18091d(obj);
                            arrayList = new ArrayList((Collection) obj);
                            interfaces = cls.getInterfaces();
                            AbstractC16544l.m18093f(interfaces, "klass.interfaces");
                            for (Class<?> intrface : interfaces) {
                                if (intrface == null && InterfaceC11111t.class.isAssignableFrom(intrface)) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (!z6) {
                                    AbstractC16544l.m18093f(intrface, "intrface");
                                    if (m12175b(intrface) == 1) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        Object obj2 = map2.get(intrface);
                                        AbstractC16544l.m18091d(obj2);
                                        arrayList.addAll((Collection) obj2);
                                    }
                                }
                            }
                            if (arrayList != null) {
                                map2.put(cls, arrayList);
                            }
                        }
                    } else {
                        interfaces = cls.getInterfaces();
                        AbstractC16544l.m18093f(interfaces, "klass.interfaces");
                        while (i10 < r8) {
                            if (intrface == null) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            if (!z6) {
                                AbstractC16544l.m18093f(intrface, "intrface");
                                if (m12175b(intrface) == 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    Object obj3 = map2.get(intrface);
                                    AbstractC16544l.m18091d(obj3);
                                    arrayList.addAll((Collection) obj3);
                                }
                            }
                        }
                        if (arrayList != null) {
                            map2.put(cls, arrayList);
                        }
                    }
                }
            }
            i11 = 2;
        }
        map.put(cls, Integer.valueOf(i11));
        return i11;
    }
}

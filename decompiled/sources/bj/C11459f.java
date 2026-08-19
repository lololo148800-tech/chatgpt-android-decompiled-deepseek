package bj;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import dj.AbstractC13178c;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: renamed from: bj.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C11459f implements InterfaceC11470q {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34657a;

    public /* synthetic */ C11459f(int i10) {
        this.f34657a = i10;
    }

    /* JADX INFO: renamed from: a */
    public static void m12864a(Type type, Class cls) {
        Class<?> clsM12855d = AbstractC11452Q.m12855d(type);
        if (cls.isAssignableFrom(clsM12855d)) {
            throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + clsM12855d.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
        }
    }

    @Override // bj.InterfaceC11470q
    public final AbstractC11471r create(Type type, Set set, C11447L c11447l) {
        AbstractC11452Q c11461h;
        InterfaceC11468o interfaceC11468o;
        Class clsM12855d;
        Type[] actualTypeArguments;
        AbstractC11471r abstractC11471rNullSafe;
        Constructor<?> declaredConstructor;
        Object[] objArr;
        Type typeM14834h = type;
        Class<?> cls = null;
        int i10 = 0;
        switch (this.f34657a) {
            case 0:
                Type genericComponentType = typeM14834h instanceof GenericArrayType ? ((GenericArrayType) typeM14834h).getGenericComponentType() : typeM14834h instanceof Class ? ((Class) typeM14834h).getComponentType() : null;
                if (genericComponentType == null || !set.isEmpty()) {
                    return null;
                }
                Class clsM12855d2 = AbstractC11452Q.m12855d(genericComponentType);
                c11447l.getClass();
                return new C11460g(clsM12855d2, c11447l.m12850b(genericComponentType, AbstractC13178c.f41820a, null)).nullSafe();
            case 1:
                if (!(typeM14834h instanceof Class) && !(typeM14834h instanceof ParameterizedType)) {
                    return null;
                }
                Class clsM12855d3 = AbstractC11452Q.m12855d(type);
                if (clsM12855d3.isInterface() || clsM12855d3.isEnum() || !set.isEmpty()) {
                    return null;
                }
                if (AbstractC13178c.m14830d(clsM12855d3)) {
                    m12864a(typeM14834h, List.class);
                    m12864a(typeM14834h, Set.class);
                    m12864a(typeM14834h, Map.class);
                    m12864a(typeM14834h, Collection.class);
                    String str = "Platform " + clsM12855d3;
                    if (typeM14834h instanceof ParameterizedType) {
                        str = str + " in " + typeM14834h;
                    }
                    throw new IllegalArgumentException(AbstractC10763a.m11052j(str, " requires explicit JsonAdapter to be registered"));
                }
                if (clsM12855d3.isAnonymousClass()) {
                    throw new IllegalArgumentException("Cannot serialize anonymous class ".concat(clsM12855d3.getName()));
                }
                if (clsM12855d3.isLocalClass()) {
                    throw new IllegalArgumentException("Cannot serialize local class ".concat(clsM12855d3.getName()));
                }
                if (clsM12855d3.getEnclosingClass() != null && !Modifier.isStatic(clsM12855d3.getModifiers())) {
                    throw new IllegalArgumentException("Cannot serialize non-static nested class ".concat(clsM12855d3.getName()));
                }
                if (Modifier.isAbstract(clsM12855d3.getModifiers())) {
                    throw new IllegalArgumentException("Cannot serialize abstract class ".concat(clsM12855d3.getName()));
                }
                Class<? extends Annotation> cls2 = AbstractC13178c.f41823d;
                if (cls2 != null && clsM12855d3.isAnnotationPresent(cls2)) {
                    throw new IllegalArgumentException("Cannot serialize Kotlin type " + clsM12855d3.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
                }
                try {
                    try {
                        try {
                            try {
                                Constructor declaredConstructor2 = clsM12855d3.getDeclaredConstructor(null);
                                declaredConstructor2.setAccessible(true);
                                c11461h = new C11461h(declaredConstructor2, clsM12855d3);
                            } catch (Exception unused) {
                                throw new IllegalArgumentException("cannot construct instances of ".concat(clsM12855d3.getName()));
                            }
                        } catch (NoSuchMethodException unused2) {
                            Class<?> cls3 = Class.forName("sun.misc.Unsafe");
                            Field declaredField = cls3.getDeclaredField("theUnsafe");
                            declaredField.setAccessible(true);
                            c11461h = new C11462i(cls3.getMethod("allocateInstance", Class.class), declaredField.get(null), clsM12855d3);
                        }
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                        Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                        declaredMethod.setAccessible(true);
                        int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                        Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                        declaredMethod2.setAccessible(true);
                        c11461h = new C11463j(declaredMethod2, clsM12855d3, iIntValue);
                    } catch (IllegalAccessException unused4) {
                        throw new AssertionError();
                    }
                    break;
                } catch (IllegalAccessException unused5) {
                    throw new AssertionError();
                } catch (NoSuchMethodException unused6) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    c11461h = new C11461h(declaredMethod3, clsM12855d3);
                    break;
                } catch (InvocationTargetException e10) {
                    AbstractC13178c.m14835i(e10);
                    throw null;
                }
                TreeMap treeMap = new TreeMap();
                while (typeM14834h != Object.class) {
                    Class clsM12855d4 = AbstractC11452Q.m12855d(typeM14834h);
                    boolean zM14830d = AbstractC13178c.m14830d(clsM12855d4);
                    Field[] declaredFields = clsM12855d4.getDeclaredFields();
                    int length = declaredFields.length;
                    int i11 = i10;
                    while (i11 < length) {
                        Field field = declaredFields[i11];
                        int modifiers = field.getModifiers();
                        if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers) && ((Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || !zM14830d) && ((interfaceC11468o = (InterfaceC11468o) field.getAnnotation(InterfaceC11468o.class)) == null || !interfaceC11468o.ignore()))) {
                            Type typeM14834h2 = AbstractC13178c.m14834h(typeM14834h, clsM12855d4, field.getGenericType(), new LinkedHashSet());
                            Set setM14831e = AbstractC13178c.m14831e(field.getAnnotations());
                            String name = field.getName();
                            AbstractC11471r abstractC11471rM12850b = c11447l.m12850b(typeM14834h2, setM14831e, name);
                            field.setAccessible(true);
                            if (interfaceC11468o != null) {
                                String strName = interfaceC11468o.name();
                                if (!"\u0000".equals(strName)) {
                                    name = strName;
                                }
                            }
                            C11464k c11464k = (C11464k) treeMap.put(name, new C11464k(name, field, abstractC11471rM12850b));
                            if (c11464k != null) {
                                throw new IllegalArgumentException("Conflicting fields:\n    " + c11464k.f34673b + "\n    " + field);
                            }
                        }
                        i11++;
                        clsM12855d4 = clsM12855d4;
                    }
                    Class clsM12855d5 = AbstractC11452Q.m12855d(typeM14834h);
                    typeM14834h = AbstractC13178c.m14834h(typeM14834h, clsM12855d5, clsM12855d5.getGenericSuperclass(), new LinkedHashSet());
                    i10 = 0;
                }
                return new C11465l(c11461h, treeMap).nullSafe();
            case 2:
                Class clsM12855d6 = AbstractC11452Q.m12855d(type);
                if (!set.isEmpty()) {
                    return null;
                }
                if (clsM12855d6 == List.class || clsM12855d6 == Collection.class) {
                    Type typeM12852a = AbstractC11452Q.m12852a(type);
                    c11447l.getClass();
                    return new C11466m(c11447l.m12850b(typeM12852a, AbstractC13178c.f41820a, null), 0).nullSafe();
                }
                if (clsM12855d6 != Set.class) {
                    return null;
                }
                Type typeM12852a2 = AbstractC11452Q.m12852a(type);
                c11447l.getClass();
                return new C11466m(c11447l.m12850b(typeM12852a2, AbstractC13178c.f41820a, null), 1).nullSafe();
            case 3:
                if (!set.isEmpty() || (clsM12855d = AbstractC11452Q.m12855d(type)) != Map.class) {
                    return null;
                }
                if (typeM14834h == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (!Map.class.isAssignableFrom(clsM12855d)) {
                        throw new IllegalArgumentException();
                    }
                    Type typeM14834h3 = AbstractC13178c.m14834h(typeM14834h, clsM12855d, AbstractC13178c.m14829c(typeM14834h, clsM12855d, Map.class), new LinkedHashSet());
                    actualTypeArguments = typeM14834h3 instanceof ParameterizedType ? ((ParameterizedType) typeM14834h3).getActualTypeArguments() : new Type[]{Object.class, Object.class};
                }
                return new C11460g(c11447l, actualTypeArguments[0], actualTypeArguments[1]).nullSafe();
            case 4:
                return null;
            default:
                if (!set.isEmpty()) {
                    return null;
                }
                Class cls4 = Boolean.TYPE;
                C11449N c11449n = AbstractC11452Q.f34626b;
                if (typeM14834h == cls4) {
                    return c11449n;
                }
                Class cls5 = Byte.TYPE;
                C11449N c11449n2 = AbstractC11452Q.f34627c;
                if (typeM14834h == cls5) {
                    return c11449n2;
                }
                Class cls6 = Character.TYPE;
                C11449N c11449n3 = AbstractC11452Q.f34628d;
                if (typeM14834h == cls6) {
                    return c11449n3;
                }
                Class cls7 = Double.TYPE;
                C11449N c11449n4 = AbstractC11452Q.f34629e;
                if (typeM14834h == cls7) {
                    return c11449n4;
                }
                Class cls8 = Float.TYPE;
                C11449N c11449n5 = AbstractC11452Q.f34630f;
                if (typeM14834h == cls8) {
                    return c11449n5;
                }
                Class cls9 = Integer.TYPE;
                C11449N c11449n6 = AbstractC11452Q.f34631g;
                if (typeM14834h == cls9) {
                    return c11449n6;
                }
                Class cls10 = Long.TYPE;
                C11449N c11449n7 = AbstractC11452Q.f34632h;
                if (typeM14834h == cls10) {
                    return c11449n7;
                }
                Class cls11 = Short.TYPE;
                C11449N c11449n8 = AbstractC11452Q.f34633i;
                if (typeM14834h == cls11) {
                    return c11449n8;
                }
                if (typeM14834h == Boolean.class) {
                    return c11449n.nullSafe();
                }
                if (typeM14834h == Byte.class) {
                    return c11449n2.nullSafe();
                }
                if (typeM14834h == Character.class) {
                    return c11449n3.nullSafe();
                }
                if (typeM14834h == Double.class) {
                    return c11449n4.nullSafe();
                }
                if (typeM14834h == Float.class) {
                    return c11449n5.nullSafe();
                }
                if (typeM14834h == Integer.class) {
                    return c11449n6.nullSafe();
                }
                if (typeM14834h == Long.class) {
                    return c11449n7.nullSafe();
                }
                if (typeM14834h == Short.class) {
                    return c11449n8.nullSafe();
                }
                if (typeM14834h == String.class) {
                    return AbstractC11452Q.f34634j.nullSafe();
                }
                if (typeM14834h == Object.class) {
                    return new C11451P(c11447l).nullSafe();
                }
                Class clsM12855d7 = AbstractC11452Q.m12855d(type);
                Set set2 = AbstractC13178c.f41820a;
                InterfaceC11472s interfaceC11472s = (InterfaceC11472s) clsM12855d7.getAnnotation(InterfaceC11472s.class);
                if (interfaceC11472s != null && interfaceC11472s.generateAdapter()) {
                    try {
                        try {
                            Class<?> cls12 = Class.forName(clsM12855d7.getName().replace("$", "_") + "JsonAdapter", true, clsM12855d7.getClassLoader());
                            try {
                                if (typeM14834h instanceof ParameterizedType) {
                                    Type[] actualTypeArguments2 = ((ParameterizedType) typeM14834h).getActualTypeArguments();
                                    try {
                                        declaredConstructor = cls12.getDeclaredConstructor(C11447L.class, Type[].class);
                                        objArr = new Object[]{c11447l, actualTypeArguments2};
                                    } catch (NoSuchMethodException unused7) {
                                        declaredConstructor = cls12.getDeclaredConstructor(Type[].class);
                                        objArr = new Object[]{actualTypeArguments2};
                                    }
                                } else {
                                    try {
                                        declaredConstructor = cls12.getDeclaredConstructor(C11447L.class);
                                        objArr = new Object[]{c11447l};
                                    } catch (NoSuchMethodException unused8) {
                                        declaredConstructor = cls12.getDeclaredConstructor(null);
                                        objArr = new Object[0];
                                    }
                                }
                                declaredConstructor.setAccessible(true);
                                abstractC11471rNullSafe = ((AbstractC11471r) declaredConstructor.newInstance(objArr)).nullSafe();
                            } catch (NoSuchMethodException e11) {
                                e = e11;
                                cls = cls12;
                                if ((typeM14834h instanceof ParameterizedType) || cls.getTypeParameters().length == 0) {
                                    throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + typeM14834h, e);
                                }
                                throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + typeM14834h + "'. Suspiciously, the type was not parameterized but the target class '" + cls.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e);
                            }
                        } catch (NoSuchMethodException e12) {
                            e = e12;
                        }
                    } catch (ClassNotFoundException e13) {
                        throw new RuntimeException("Failed to find the generated JsonAdapter class for " + typeM14834h, e13);
                    } catch (IllegalAccessException e14) {
                        throw new RuntimeException("Failed to access the generated JsonAdapter for " + typeM14834h, e14);
                    } catch (InstantiationException e15) {
                        throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + typeM14834h, e15);
                    } catch (InvocationTargetException e16) {
                        AbstractC13178c.m14835i(e16);
                        throw null;
                    }
                    break;
                } else {
                    abstractC11471rNullSafe = null;
                }
                if (abstractC11471rNullSafe != null) {
                    return abstractC11471rNullSafe;
                }
                if (clsM12855d7.isEnum()) {
                    return new C11450O(clsM12855d7).nullSafe();
                }
                return null;
        }
    }
}

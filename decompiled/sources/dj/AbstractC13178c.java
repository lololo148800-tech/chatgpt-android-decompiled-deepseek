package dj;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import bj.AbstractC11477x;
import bj.C11473t;
import bj.InterfaceC11474u;
import com.squareup.moshi.internal.Util$GenericArrayTypeImpl;
import com.squareup.moshi.internal.Util$ParameterizedTypeImpl;
import com.squareup.moshi.internal.Util$WildcardTypeImpl;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p571X9.AbstractC9306j0;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: dj.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13178c {

    /* JADX INFO: renamed from: a */
    public static final Set f41820a = Collections.emptySet();

    /* JADX INFO: renamed from: b */
    public static final Type[] f41821b = new Type[0];

    /* JADX INFO: renamed from: c */
    public static final Class f41822c;

    /* JADX INFO: renamed from: d */
    public static final Class f41823d;

    /* JADX INFO: renamed from: e */
    public static final Map f41824e;

    static {
        Class<?> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f41823d = cls;
        f41822c = DefaultConstructorMarker.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        f41824e = DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: a */
    public static Type m14827a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new Util$GenericArrayTypeImpl(m14827a(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof Util$ParameterizedTypeImpl) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new Util$ParameterizedTypeImpl(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return type instanceof Util$GenericArrayTypeImpl ? type : new Util$GenericArrayTypeImpl(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType) || (type instanceof Util$WildcardTypeImpl)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new Util$WildcardTypeImpl(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    /* JADX INFO: renamed from: b */
    public static void m14828b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    /* JADX INFO: renamed from: c */
    public static Type m14829c(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                Class<?> cls3 = interfaces[i10];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m14829c(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m14829c(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m14830d(Class cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    /* JADX INFO: renamed from: e */
    public static Set m14831e(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(InterfaceC11474u.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? DesugarCollections.unmodifiableSet(linkedHashSet) : f41820a;
    }

    /* JADX INFO: renamed from: f */
    public static C11473t m14832f(String str, String str2, AbstractC11477x abstractC11477x) {
        String string;
        String strM12867E = abstractC11477x.m12867E();
        if (str2.equals(str)) {
            string = AbstractC10763a.m11055m("Required value '", str, "' missing at ", strM12867E);
        } else {
            StringBuilder sbM9896o = AbstractC9306j0.m9896o("Required value '", str, "' (JSON name '", str2, "') missing at ");
            sbM9896o.append(strM12867E);
            string = sbM9896o.toString();
        }
        return new C11473t(string);
    }

    /* JADX INFO: renamed from: g */
    public static Type m14833g(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        if (wildcardType.getLowerBounds().length != 0) {
            return type;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return upperBounds[0];
        }
        throw new IllegalArgumentException();
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    /* JADX INFO: renamed from: h */
    public static Type m14834h(Type type, Class cls, Type type2, LinkedHashSet linkedHashSet) {
        Type type3;
        WildcardType wildcardType;
        Type[] lowerBounds;
        while (type2 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type2;
            if (linkedHashSet.contains(typeVariable)) {
                return type2;
            }
            linkedHashSet.add(typeVariable);
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls2 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls2 == null) {
                type2 = typeVariable;
            } else {
                Type typeM14829c = m14829c(type, cls, cls2);
                if (typeM14829c instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls2.getTypeParameters();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= typeParameters.length) {
                            throw new NoSuchElementException();
                        }
                        if (typeVariable.equals(typeParameters[i10])) {
                            type2 = ((ParameterizedType) typeM14829c).getActualTypeArguments()[i10];
                            break;
                        }
                        i10++;
                    }
                } else {
                    type2 = typeVariable;
                }
            }
            if (type2 == typeVariable) {
                return type2;
            }
        }
        if (type2 instanceof Class) {
            Class cls3 = (Class) type2;
            if (cls3.isArray()) {
                Class<?> componentType = cls3.getComponentType();
                Type typeM14834h = m14834h(type, cls, componentType, linkedHashSet);
                return componentType == typeM14834h ? cls3 : new Util$GenericArrayTypeImpl(typeM14834h);
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeM14834h2 = m14834h(type, cls, genericComponentType, linkedHashSet);
            return genericComponentType == typeM14834h2 ? genericArrayType : new Util$GenericArrayTypeImpl(typeM14834h2);
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeM14834h3 = m14834h(type, cls, ownerType, linkedHashSet);
            boolean z6 = typeM14834h3 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i11 = 0; i11 < length; i11++) {
                Type typeM14834h4 = m14834h(type, cls, actualTypeArguments[i11], linkedHashSet);
                if (typeM14834h4 != actualTypeArguments[i11]) {
                    if (!z6) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z6 = true;
                    }
                    actualTypeArguments[i11] = typeM14834h4;
                }
            }
            return z6 ? new Util$ParameterizedTypeImpl(typeM14834h3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        if (type2 instanceof WildcardType) {
            wildcardType = (WildcardType) type2;
            Type[] lowerBounds2 = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds2.length == 1) {
                Type typeM14834h5 = m14834h(type, cls, lowerBounds2[0], linkedHashSet);
                if (typeM14834h5 != lowerBounds2[0]) {
                    if (typeM14834h5 instanceof WildcardType) {
                        type3 = type2;
                        type3 = wildcardType;
                        lowerBounds = ((WildcardType) typeM14834h5).getLowerBounds();
                    } else {
                        type3 = type2;
                        type3 = wildcardType;
                        lowerBounds = new Type[]{typeM14834h5};
                    }
                    return new Util$WildcardTypeImpl(new Type[]{Object.class}, lowerBounds);
                }
            } else if (upperBounds.length == 1) {
                type3 = type2;
                type3 = wildcardType;
                Type typeM14834h6 = m14834h(type, cls, upperBounds[0], linkedHashSet);
                type3 = wildcardType;
                if (typeM14834h6 != upperBounds[0]) {
                    return new Util$WildcardTypeImpl(typeM14834h6 instanceof WildcardType ? ((WildcardType) typeM14834h6).getUpperBounds() : new Type[]{typeM14834h6}, f41821b);
                }
            }
        }
        type3 = type2;
        type3 = wildcardType;
        type3 = type2;
        type3 = wildcardType;
        type3 = type2;
        return type3;
    }

    /* JADX INFO: renamed from: i */
    public static void m14835i(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        }
        if (!(targetException instanceof Error)) {
            throw new RuntimeException(targetException);
        }
        throw ((Error) targetException);
    }

    /* JADX INFO: renamed from: j */
    public static String m14836j(Type type, Set set) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: k */
    public static String m14837k(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX INFO: renamed from: l */
    public static C11473t m14838l(String str, String str2, AbstractC11477x abstractC11477x) {
        String string;
        String strM12867E = abstractC11477x.m12867E();
        if (str2.equals(str)) {
            string = AbstractC10763a.m11055m("Non-null value '", str, "' was null at ", strM12867E);
        } else {
            StringBuilder sbM9896o = AbstractC9306j0.m9896o("Non-null value '", str, "' (JSON name '", str2, "') was null at ");
            sbM9896o.append(strM12867E);
            string = sbM9896o.toString();
        }
        return new C11473t(string);
    }
}

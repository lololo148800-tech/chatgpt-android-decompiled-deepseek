package p1027tp;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import io.sentry.android.core.RunnableC15195M;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;
import mm.C17296C;
import p025An.AbstractC0593T;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9306j0;
import p817j$.util.Objects;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: tp.V */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC20056V {

    /* JADX INFO: renamed from: a */
    public static final Type[] f63545a = new Type[0];

    /* JADX INFO: renamed from: b */
    public static void m20876b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m20877c(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m20877c(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* JADX INFO: renamed from: d */
    public static Type m20878d(Type type, Class cls, Class cls2) {
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
                    return m20878d(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
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
                    return m20878d(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX INFO: renamed from: e */
    public static Type m20879e(int i10, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i10 >= 0 && i10 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i10];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Index ", " not in range [0,");
        sbM11057o.append(actualTypeArguments.length);
        sbM11057o.append(") for ");
        sbM11057o.append(parameterizedType);
        throw new IllegalArgumentException(sbM11057o.toString());
    }

    /* JADX INFO: renamed from: f */
    public static Class m20880f(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) m20880f(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m20880f(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    /* JADX INFO: renamed from: g */
    public static Type m20881g(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return m20887m(type, cls, m20878d(type, cls, Map.class));
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m20882h(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m20882h(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return m20882h(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m20883i(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static IllegalArgumentException m20884j(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder sbM9895n = AbstractC9306j0.m9895n(String.format(str, objArr), "\n    for method ");
        sbM9895n.append(method.getDeclaringClass().getSimpleName());
        sbM9895n.append(Separators.DOT);
        sbM9895n.append(method.getName());
        return new IllegalArgumentException(sbM9895n.toString(), exc);
    }

    /* JADX INFO: renamed from: k */
    public static IllegalArgumentException m20885k(Method method, int i10, String str, Object... objArr) {
        StringBuilder sbM9895n = AbstractC9306j0.m9895n(str, " (parameter #");
        sbM9895n.append(i10 + 1);
        sbM9895n.append(Separators.RPAREN);
        return m20884j(method, null, sbM9895n.toString(), objArr);
    }

    /* JADX INFO: renamed from: l */
    public static IllegalArgumentException m20886l(Method method, Exception exc, int i10, String str, Object... objArr) {
        StringBuilder sbM9895n = AbstractC9306j0.m9895n(str, " (parameter #");
        sbM9895n.append(i10 + 1);
        sbM9895n.append(Separators.RPAREN);
        return m20884j(method, exc, sbM9895n.toString(), objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0016  */
    /* JADX INFO: renamed from: m */
    public static Type m20887m(Type type, Class cls, Type type2) {
        Type type3;
        WildcardType wildcardType;
        Type type4;
        Type type5 = type2;
        while (type5 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type5;
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls2 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls2 == null) {
                type4 = typeVariable;
            } else {
                Type typeM20878d = m20878d(type, cls, cls2);
                if (typeM20878d instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls2.getTypeParameters();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= typeParameters.length) {
                            throw new NoSuchElementException();
                        }
                        if (typeVariable.equals(typeParameters[i10])) {
                            type4 = ((ParameterizedType) typeM20878d).getActualTypeArguments()[i10];
                            break;
                        }
                        i10++;
                    }
                } else {
                    type4 = typeVariable;
                }
            }
            if (type4 == typeVariable) {
                return type4;
            }
            type5 = type4;
        }
        if (type5 instanceof Class) {
            Class cls3 = (Class) type5;
            if (cls3.isArray()) {
                Class<?> componentType = cls3.getComponentType();
                Type typeM20887m = m20887m(type, cls, componentType);
                return componentType == typeM20887m ? cls3 : new C20053S(typeM20887m);
            }
        }
        if (type5 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type5;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeM20887m2 = m20887m(type, cls, genericComponentType);
            return genericComponentType == typeM20887m2 ? genericArrayType : new C20053S(typeM20887m2);
        }
        if (type5 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type5;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeM20887m3 = m20887m(type, cls, ownerType);
            boolean z6 = typeM20887m3 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i11 = 0; i11 < length; i11++) {
                Type typeM20887m4 = m20887m(type, cls, actualTypeArguments[i11]);
                if (typeM20887m4 != actualTypeArguments[i11]) {
                    if (!z6) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z6 = true;
                    }
                    actualTypeArguments[i11] = typeM20887m4;
                }
            }
            return z6 ? new C20054T(typeM20887m3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        if (type5 instanceof WildcardType) {
            wildcardType = (WildcardType) type5;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeM20887m5 = m20887m(type, cls, lowerBounds[0]);
                if (typeM20887m5 != lowerBounds[0]) {
                    type3 = type5;
                    type3 = wildcardType;
                    return new C20055U(new Type[]{Object.class}, new Type[]{typeM20887m5});
                }
            } else if (upperBounds.length == 1) {
                type3 = type5;
                type3 = wildcardType;
                Type typeM20887m6 = m20887m(type, cls, upperBounds[0]);
                type3 = wildcardType;
                if (typeM20887m6 != upperBounds[0]) {
                    return new C20055U(new Type[]{typeM20887m6}, f63545a);
                }
            }
        }
        type3 = type5;
        type3 = wildcardType;
        type3 = type5;
        type3 = wildcardType;
        type3 = type5;
        return type3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public static final Object m20888n(Exception exc, InterfaceC18770c interfaceC18770c) {
        C20074r c20074r;
        if (interfaceC18770c instanceof C20074r) {
            c20074r = (C20074r) interfaceC18770c;
            int i10 = c20074r.f63573Z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c20074r.f63573Z = i10 - Integer.MIN_VALUE;
            } else {
                c20074r = new C20074r(interfaceC18770c);
            }
        } else {
            c20074r = new C20074r(interfaceC18770c);
        }
        Object obj = c20074r.f63572Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c20074r.f63573Z;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        c20074r.f63573Z = 1;
        AbstractC0593T.f1824a.mo872V0(c20074r.getContext(), new RunnableC15195M(c20074r, exc, false, 15));
        return enumC19250a;
    }

    /* JADX INFO: renamed from: o */
    public static void m20889o(Throwable th2) {
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }

    /* JADX INFO: renamed from: p */
    public static String m20890p(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo20858a(C20045J c20045j, Object obj);
}

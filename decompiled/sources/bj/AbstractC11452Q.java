package bj;

import com.squareup.moshi.internal.Util$ParameterizedTypeImpl;
import dj.AbstractC13178c;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: bj.Q */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11452Q {

    /* JADX INFO: renamed from: a */
    public static final C11459f f34625a = new C11459f(5);

    /* JADX INFO: renamed from: b */
    public static final C11449N f34626b = new C11449N(1);

    /* JADX INFO: renamed from: c */
    public static final C11449N f34627c = new C11449N(2);

    /* JADX INFO: renamed from: d */
    public static final C11449N f34628d = new C11449N(3);

    /* JADX INFO: renamed from: e */
    public static final C11449N f34629e = new C11449N(4);

    /* JADX INFO: renamed from: f */
    public static final C11449N f34630f = new C11449N(5);

    /* JADX INFO: renamed from: g */
    public static final C11449N f34631g = new C11449N(6);

    /* JADX INFO: renamed from: h */
    public static final C11449N f34632h = new C11449N(7);

    /* JADX INFO: renamed from: i */
    public static final C11449N f34633i = new C11449N(8);

    /* JADX INFO: renamed from: j */
    public static final C11449N f34634j = new C11449N(0);

    /* JADX INFO: renamed from: a */
    public static Type m12852a(Type type) {
        if (!Collection.class.isAssignableFrom(Collection.class)) {
            throw new IllegalArgumentException();
        }
        Type typeM14834h = AbstractC13178c.m14834h(type, Collection.class, AbstractC13178c.m14829c(type, Collection.class, Collection.class), new LinkedHashSet());
        if (typeM14834h instanceof WildcardType) {
            typeM14834h = ((WildcardType) typeM14834h).getUpperBounds()[0];
        }
        return typeM14834h instanceof ParameterizedType ? ((ParameterizedType) typeM14834h).getActualTypeArguments()[0] : Object.class;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m12853b(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type2 instanceof GenericArrayType ? m12853b(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType()) : type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return m12853b(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof Util$ParameterizedTypeImpl ? ((Util$ParameterizedTypeImpl) parameterizedType).f40520o0 : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof Util$ParameterizedTypeImpl ? ((Util$ParameterizedTypeImpl) parameterizedType2).f40520o0 : parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return m12853b(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (type2 instanceof GenericArrayType) {
                return m12853b(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    /* JADX INFO: renamed from: c */
    public static String m12854c(int i10, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb2 = new StringBuilder("$");
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 == 1 || i12 == 2) {
                sb2.append('[');
                sb2.append(iArr2[i11]);
                sb2.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append('.');
                String str = strArr[i11];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: d */
    public static Class m12855d(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) m12855d(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m12855d(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* JADX INFO: renamed from: f */
    public static Util$ParameterizedTypeImpl m12856f(Class cls, Type... typeArr) {
        if (typeArr.length != 0) {
            return new Util$ParameterizedTypeImpl(null, cls, typeArr);
        }
        throw new IllegalArgumentException("Missing type arguments for " + cls);
    }

    /* JADX INFO: renamed from: g */
    public static int m12857g(AbstractC11477x abstractC11477x, String str, int i10, int i11) {
        int iMo12816g0 = abstractC11477x.mo12816g0();
        if (iMo12816g0 >= i10 && iMo12816g0 <= i11) {
            return iMo12816g0;
        }
        throw new C11473t("Expected " + str + " but was " + iMo12816g0 + " at path " + abstractC11477x.m12867E());
    }

    /* JADX INFO: renamed from: e */
    public abstract Object mo12858e();
}

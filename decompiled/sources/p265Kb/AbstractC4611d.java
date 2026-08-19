package p265Kb;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import p214Ib.AbstractC3673p;
import p214Ib.C3674q;
import p214Ib.C3675r;
import p214Ib.C3679v;
import p228J.AbstractC3794B0;
import p288Lb.AbstractC4992y;
import p379Pb.C6381b;
import p379Pb.C6383d;
import p817j$.util.Objects;

/* JADX INFO: renamed from: Kb.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4611d {

    /* JADX INFO: renamed from: a */
    public static final Type[] f15032a = new Type[0];

    /* JADX INFO: renamed from: a */
    public static Type m5342a(Type type) {
        Type c4608a;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                c4608a = cls;
                c4608a = new C4608a(m5342a(cls.getComponentType()));
            }
            c4608a = cls;
            return c4608a;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C4609b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new C4608a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new C4610c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    /* JADX INFO: renamed from: b */
    public static void m5343b(boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m5344c(Type type) {
        m5343b(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m5345d(Type type, Type type2) {
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
            return Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m5345d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    /* JADX INFO: renamed from: e */
    public static void m5346e(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw AbstractC3794B0.m4497v(it);
        }
    }

    /* JADX INFO: renamed from: f */
    public static Type m5347f(Type type, Class cls, Class cls2) {
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
                    return m5347f(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
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
                    return m5347f(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX INFO: renamed from: g */
    public static Class m5348g(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            m5343b(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) m5348g(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m5348g(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* JADX INFO: renamed from: h */
    public static SimpleDateFormat m5349h(int i10, int i11) {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (i10 == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i10 == 1) {
            str = "MMMM d, yyyy";
        } else if (i10 == 2) {
            str = "MMM d, yyyy";
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "Unknown DateFormat style: "));
            }
            str = "M/d/yy";
        }
        sb2.append(str);
        sb2.append(Separators.f31991SP);
        if (i11 == 0 || i11 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i11 == 2) {
            str2 = "h:mm:ss a";
        } else {
            if (i11 != 3) {
                throw new IllegalArgumentException(AbstractC10763a.m11048f(i11, "Unknown DateFormat style: "));
            }
            str2 = "h:mm a";
        }
        sb2.append(str2);
        return new SimpleDateFormat(sb2.toString(), Locale.US);
    }

    /* JADX INFO: renamed from: i */
    public static AbstractC3673p m5350i(C6381b c6381b) {
        boolean z6;
        try {
            try {
                c6381b.mo5616N0();
                z6 = false;
                try {
                    return (AbstractC3673p) AbstractC4992y.f16297z.mo4358a(c6381b);
                } catch (EOFException e10) {
                    e = e10;
                    if (z6) {
                        return C3675r.f11173Y;
                    }
                    throw new C3679v(e);
                }
            } catch (EOFException e11) {
                e = e11;
                z6 = true;
            }
        } catch (C6383d e12) {
            throw new C3679v(e12);
        } catch (IOException e13) {
            throw new C3674q(e13);
        } catch (NumberFormatException e14) {
            throw new C3679v(e14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x009b  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:68:0x0102  */
    /* JADX WARN: Code duplicated, block: B:69:0x0109  */
    /* JADX WARN: Code duplicated, block: B:71:0x011a  */
    /* JADX WARN: Code duplicated, block: B:73:0x011d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0127  */
    /* JADX WARN: Code duplicated, block: B:79:0x012b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0132  */
    /* JADX WARN: Code duplicated, block: B:99:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v3, types: [Kb.c] */
    /* JADX WARN: Type inference failed for: r11v4, types: [Kb.c] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX INFO: renamed from: j */
    public static Type m5351j(Type type, Class cls, Type type2, HashMap map) {
        Type[] lowerBounds;
        Type[] upperBounds;
        Type typeM5351j;
        Type[] upperBounds2;
        Type typeM5351j2;
        Type[] lowerBounds2;
        Type typeM5351j3;
        boolean z6;
        Type[] actualTypeArguments;
        int length;
        Type c4609b;
        Type typeM5351j4;
        Type genericComponentType;
        Type typeM5351j5;
        TypeVariable typeVariable;
        TypeVariable typeVariable2 = null;
        do {
            if (!(type2 instanceof TypeVariable)) {
                if (!(type2 instanceof Class)) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            type2 = (WildcardType) type2;
                            lowerBounds = type2.getLowerBounds();
                            upperBounds = type2.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length == 1) {
                                    break;
                                }
                                typeM5351j = m5351j(type, cls, upperBounds[0], map);
                                if (typeM5351j != upperBounds[0]) {
                                    break;
                                }
                                if (typeM5351j instanceof WildcardType) {
                                    upperBounds2 = ((WildcardType) typeM5351j).getUpperBounds();
                                } else {
                                    upperBounds2 = new Type[]{typeM5351j};
                                }
                                type2 = new C4610c(upperBounds2, f15032a);
                                break;
                            }
                            typeM5351j2 = m5351j(type, cls, lowerBounds[0], map);
                            if (typeM5351j2 != lowerBounds[0]) {
                                break;
                            }
                            if (typeM5351j2 instanceof WildcardType) {
                                lowerBounds2 = ((WildcardType) typeM5351j2).getLowerBounds();
                            } else {
                                lowerBounds2 = new Type[]{typeM5351j2};
                            }
                            type2 = new C4610c(new Type[]{Object.class}, lowerBounds2);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType = type2.getOwnerType();
                        typeM5351j3 = m5351j(type, cls, ownerType, map);
                        z6 = !Objects.equals(typeM5351j3, ownerType);
                        actualTypeArguments = type2.getActualTypeArguments();
                        length = actualTypeArguments.length;
                        for (int i10 = 0; i10 < length; i10++) {
                            typeM5351j4 = m5351j(type, cls, actualTypeArguments[i10], map);
                            if (Objects.equals(typeM5351j4, actualTypeArguments[i10])) {
                                if (!z6) {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z6 = true;
                                }
                                actualTypeArguments[i10] = typeM5351j4;
                            }
                        }
                        if (z6) {
                            break;
                        }
                        c4609b = new C4609b(typeM5351j3, type2.getRawType(), actualTypeArguments);
                        type2 = c4609b;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeM5351j5 = m5351j(type, cls, genericComponentType, map);
                    if (Objects.equals(genericComponentType, typeM5351j5)) {
                        c4609b = new C4608a(typeM5351j5);
                        type2 = c4609b;
                        break;
                    }
                    break;
                }
                Class cls2 = (Class) type2;
                if (!cls2.isArray()) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            type2 = (WildcardType) type2;
                            lowerBounds = type2.getLowerBounds();
                            upperBounds = type2.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length == 1) {
                                    break;
                                }
                                typeM5351j = m5351j(type, cls, upperBounds[0], map);
                                if (typeM5351j != upperBounds[0]) {
                                    break;
                                }
                                if (typeM5351j instanceof WildcardType) {
                                    upperBounds2 = ((WildcardType) typeM5351j).getUpperBounds();
                                } else {
                                    upperBounds2 = new Type[]{typeM5351j};
                                }
                                type2 = new C4610c(upperBounds2, f15032a);
                                break;
                            }
                            typeM5351j2 = m5351j(type, cls, lowerBounds[0], map);
                            if (typeM5351j2 != lowerBounds[0]) {
                                break;
                            }
                            if (typeM5351j2 instanceof WildcardType) {
                                lowerBounds2 = ((WildcardType) typeM5351j2).getLowerBounds();
                            } else {
                                lowerBounds2 = new Type[]{typeM5351j2};
                            }
                            type2 = new C4610c(new Type[]{Object.class}, lowerBounds2);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType2 = type2.getOwnerType();
                        typeM5351j3 = m5351j(type, cls, ownerType2, map);
                        z6 = !Objects.equals(typeM5351j3, ownerType2);
                        actualTypeArguments = type2.getActualTypeArguments();
                        length = actualTypeArguments.length;
                        while (i10 < length) {
                            typeM5351j4 = m5351j(type, cls, actualTypeArguments[i10], map);
                            if (Objects.equals(typeM5351j4, actualTypeArguments[i10])) {
                                if (!z6) {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z6 = true;
                                }
                                actualTypeArguments[i10] = typeM5351j4;
                            }
                        }
                        if (z6) {
                            break;
                        }
                        c4609b = new C4609b(typeM5351j3, type2.getRawType(), actualTypeArguments);
                        type2 = c4609b;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeM5351j5 = m5351j(type, cls, genericComponentType, map);
                    if (Objects.equals(genericComponentType, typeM5351j5)) {
                        break;
                    }
                    c4609b = new C4608a(typeM5351j5);
                    type2 = c4609b;
                    break;
                }
                Class<?> componentType = cls2.getComponentType();
                Type typeM5351j6 = m5351j(type, cls, componentType, map);
                if (!Objects.equals(componentType, typeM5351j6)) {
                    c4609b = new C4608a(typeM5351j6);
                    type2 = c4609b;
                    break;
                }
                type2 = cls2;
                break;
            }
            typeVariable = (TypeVariable) type2;
            Type type3 = (Type) map.get(typeVariable);
            if (type3 != null) {
                return type3 == Void.TYPE ? type2 : type3;
            }
            map.put(typeVariable, Void.TYPE);
            if (typeVariable2 == null) {
                typeVariable2 = typeVariable;
            }
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 == null) {
                type2 = typeVariable;
            } else {
                Type typeM5347f = m5347f(type, cls, cls3);
                if (typeM5347f instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    int length2 = typeParameters.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length2) {
                            throw new NoSuchElementException();
                        }
                        if (typeVariable.equals(typeParameters[i11])) {
                            type2 = ((ParameterizedType) typeM5347f).getActualTypeArguments()[i11];
                            break;
                        }
                        i11++;
                    }
                } else {
                    type2 = typeVariable;
                }
            }
        } while (type2 != typeVariable);
        if (typeVariable2 != null) {
            map.put(typeVariable2, type2);
        }
        return type2;
    }

    /* JADX INFO: renamed from: k */
    public static String m5352k(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX INFO: renamed from: l */
    public static Class m5353l(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        return cls == Void.TYPE ? Void.class : cls;
    }
}

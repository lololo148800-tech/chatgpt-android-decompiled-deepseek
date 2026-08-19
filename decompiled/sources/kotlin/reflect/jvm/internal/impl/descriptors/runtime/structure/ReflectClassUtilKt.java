package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import mm.C17309l;
import p046Bk.p047Ep.QzvfuIgrngtl;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1427b;
import p049Bm.InterfaceC1428c;
import p049Bm.InterfaceC1429d;
import p049Bm.InterfaceC1430e;
import p049Bm.InterfaceC1431f;
import p049Bm.InterfaceC1432g;
import p049Bm.InterfaceC1433h;
import p049Bm.InterfaceC1434i;
import p049Bm.InterfaceC1435j;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1437l;
import p049Bm.InterfaceC1438m;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p049Bm.InterfaceC1441p;
import p049Bm.InterfaceC1442q;
import p049Bm.InterfaceC1443r;
import p049Bm.InterfaceC1444s;
import p049Bm.InterfaceC1445t;
import p049Bm.InterfaceC1446u;
import p1091wn.AbstractC21031l;
import p1091wn.C21028i;
import p1091wn.C21034o;
import p1113xn.AbstractC21329w;
import p225Im.InterfaceC3756d;
import p298Lm.InterfaceC5174f;
import p487Tm.C7512b;
import p523V9.AbstractC8138m0;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectClassUtilKt {

    /* JADX INFO: renamed from: a */
    public static final List f51680a;

    /* JADX INFO: renamed from: b */
    public static final Map f51681b;

    /* JADX INFO: renamed from: c */
    public static final Map f51682c;

    /* JADX INFO: renamed from: d */
    public static final Map f51683d;

    static {
        int i10 = 0;
        Class cls = Boolean.TYPE;
        C16527D c16527d = AbstractC16526C.f51263a;
        List listM19382k = AbstractC17681o.m19382k(c16527d.mo5693b(cls), c16527d.mo5693b(Byte.TYPE), c16527d.mo5693b(Character.TYPE), c16527d.mo5693b(Double.TYPE), c16527d.mo5693b(Float.TYPE), c16527d.mo5693b(Integer.TYPE), c16527d.mo5693b(Long.TYPE), c16527d.mo5693b(Short.TYPE));
        f51680a = listM19382k;
        List<InterfaceC3756d> list = listM19382k;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        for (InterfaceC3756d interfaceC3756d : list) {
            arrayList.add(new C17309l(AbstractC8138m0.m8668c(interfaceC3756d), AbstractC8138m0.m8669d(interfaceC3756d)));
        }
        f51681b = AbstractC17659D.m19253o(arrayList);
        List<InterfaceC3756d> list2 = f51680a;
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list2, 10));
        for (InterfaceC3756d interfaceC3756d2 : list2) {
            arrayList2.add(new C17309l(AbstractC8138m0.m8669d(interfaceC3756d2), AbstractC8138m0.m8668c(interfaceC3756d2)));
        }
        f51682c = AbstractC17659D.m19253o(arrayList2);
        List listM19382k2 = AbstractC17681o.m19382k(InterfaceC1426a.class, InterfaceC1436k.class, InterfaceC1439n.class, InterfaceC1440o.class, InterfaceC1441p.class, InterfaceC1442q.class, InterfaceC1443r.class, InterfaceC1444s.class, InterfaceC1445t.class, InterfaceC1446u.class, InterfaceC1427b.class, InterfaceC1428c.class, InterfaceC5174f.class, InterfaceC1429d.class, InterfaceC1430e.class, InterfaceC1431f.class, InterfaceC1432g.class, InterfaceC1433h.class, InterfaceC1434i.class, InterfaceC1435j.class, InterfaceC1437l.class, InterfaceC1438m.class, InterfaceC5174f.class);
        ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(listM19382k2, 10));
        for (Object obj : listM19382k2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            arrayList3.add(new C17309l((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f51683d = AbstractC17659D.m19253o(arrayList3);
    }

    public static final ClassId getClassId(Class<?> cls) {
        ClassId classId;
        AbstractC16544l.m18094g(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() != null || cls.getEnclosingConstructor() != null || cls.getSimpleName().length() == 0) {
            FqName fqName = new FqName(cls.getName());
            return new ClassId(fqName.parent(), FqName.Companion.topLevel(fqName.shortName()), true);
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null && (classId = getClassId(declaringClass)) != null) {
            Name nameIdentifier = Name.identifier(cls.getSimpleName());
            AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
            ClassId classIdCreateNestedClassId = classId.createNestedClassId(nameIdentifier);
            if (classIdCreateNestedClassId != null) {
                return classIdCreateNestedClassId;
            }
        }
        return ClassId.Companion.topLevel(new FqName(cls.getName()));
    }

    public static final Integer getFunctionClassArity(Class<?> cls) {
        AbstractC16544l.m18094g(cls, "<this>");
        return (Integer) f51683d.get(cls);
    }

    public static final List<Type> getParameterizedTypeArguments(Type type) {
        AbstractC16544l.m18094g(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return C17689w.f56480Y;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return AbstractC21031l.m21499w(new C21028i(AbstractC21031l.m21492p(C7512b.f23829Z, type), C7512b.f23830o0, C21034o.f66913Y));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        AbstractC16544l.m18093f(actualTypeArguments, "getActualTypeArguments(...)");
        return AbstractC17678l.m19291N(actualTypeArguments);
    }

    public static final Class<?> getPrimitiveByWrapper(Class<?> cls) {
        AbstractC16544l.m18094g(cls, "<this>");
        return (Class) f51681b.get(cls);
    }

    public static final ClassLoader getSafeClassLoader(Class<?> cls) {
        AbstractC16544l.m18094g(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        AbstractC16544l.m18093f(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }

    public static final Class<?> getWrapperByPrimitive(Class<?> cls) {
        AbstractC16544l.m18094g(cls, "<this>");
        return (Class) f51682c.get(cls);
    }

    public static final boolean isEnumClassOrSpecializedEnumEntryClass(Class<?> cls) {
        AbstractC16544l.m18094g(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String getDesc(Class<?> cls) {
        AbstractC16544l.m18094g(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return AbstractC21329w.m21730q(cls.getName(), '.', '/');
            }
            return TokenNames.f32014L + AbstractC21329w.m21730q(cls.getName(), '.', '/') + ';';
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return TokenNames.f32012I;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return TokenNames.f32009C;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return TokenNames.f32021V;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return TokenNames.f32011F;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return TokenNames.f32018S;
                }
                break;
        }
        throw new IllegalArgumentException(QzvfuIgrngtl.RqjYJPHTk + cls);
    }
}

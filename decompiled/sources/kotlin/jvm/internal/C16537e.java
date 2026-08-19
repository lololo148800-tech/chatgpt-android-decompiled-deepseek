package kotlin.jvm.internal;

import com.google.android.datatransport.cct.NwaZ.lZYtIbClQJm;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mm.C17309l;
import p024Am.C0560a;
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
import p1113xn.AbstractC21322p;
import p225Im.InterfaceC3756d;
import p298Lm.InterfaceC5174f;
import p523V9.AbstractC8138m0;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: kotlin.jvm.internal.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C16537e implements InterfaceC3756d, InterfaceC16536d {

    /* JADX INFO: renamed from: Z */
    public static final Map f51278Z;

    /* JADX INFO: renamed from: o0 */
    public static final HashMap f51279o0;

    /* JADX INFO: renamed from: p0 */
    public static final LinkedHashMap f51280p0;

    /* JADX INFO: renamed from: Y */
    public final Class f51281Y;

    public C16537e(Class jClass) {
        AbstractC16544l.m18094g(jClass, "jClass");
        this.f51281Y = jClass;
    }

    @Override // p225Im.InterfaceC3756d
    /* JADX INFO: renamed from: a */
    public final String mo4447a() {
        String str;
        Class jClass = this.f51281Y;
        AbstractC16544l.m18094g(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        boolean zIsArray = jClass.isArray();
        HashMap map = f51279o0;
        if (!zIsArray) {
            String str2 = (String) map.get(jClass.getName());
            return str2 == null ? jClass.getCanonicalName() : str2;
        }
        Class<?> componentType = jClass.getComponentType();
        if (componentType.isPrimitive() && (str = (String) map.get(componentType.getName())) != null) {
            strConcat = str.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    @Override // p225Im.InterfaceC3756d
    /* JADX INFO: renamed from: c */
    public final String mo4448c() {
        String str;
        Class jClass = this.f51281Y;
        AbstractC16544l.m18094g(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            boolean zIsArray = jClass.isArray();
            LinkedHashMap linkedHashMap = f51280p0;
            if (!zIsArray) {
                String str2 = (String) linkedHashMap.get(jClass.getName());
                return str2 == null ? jClass.getSimpleName() : str2;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            return AbstractC21322p.m21702j0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return AbstractC21322p.m21701i0('$', simpleName, simpleName);
        }
        return AbstractC21322p.m21702j0(simpleName, enclosingConstructor.getName() + '$');
    }

    @Override // kotlin.jvm.internal.InterfaceC16536d
    /* JADX INFO: renamed from: d */
    public final Class mo5684d() {
        return this.f51281Y;
    }

    @Override // p225Im.InterfaceC3756d
    /* JADX INFO: renamed from: e */
    public final boolean mo4449e(Object obj) {
        Class jClass = this.f51281Y;
        AbstractC16544l.m18094g(jClass, "jClass");
        Map map = f51278Z;
        AbstractC16544l.m18092e(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            return AbstractC16529F.m18082f(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            jClass = AbstractC8138m0.m8668c(AbstractC8138m0.m8670e(jClass));
        }
        return jClass.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C16537e) && AbstractC8138m0.m8668c(this).equals(AbstractC8138m0.m8668c((InterfaceC3756d) obj));
    }

    @Override // p225Im.InterfaceC3756d
    public final List getTypeParameters() {
        throw new C0560a();
    }

    @Override // p225Im.InterfaceC3756d
    public final int hashCode() {
        return AbstractC8138m0.m8668c(this).hashCode();
    }

    @Override // p225Im.InterfaceC3756d
    public final boolean isValue() {
        throw new C0560a();
    }

    public final String toString() {
        return this.f51281Y + " (Kotlin reflection is not available)";
    }

    static {
        int i10 = 0;
        List listM19382k = AbstractC17681o.m19382k(InterfaceC1426a.class, InterfaceC1436k.class, InterfaceC1439n.class, InterfaceC1440o.class, InterfaceC1441p.class, InterfaceC1442q.class, InterfaceC1443r.class, InterfaceC1444s.class, InterfaceC1445t.class, InterfaceC1446u.class, InterfaceC1427b.class, InterfaceC1428c.class, InterfaceC5174f.class, InterfaceC1429d.class, InterfaceC1430e.class, InterfaceC1431f.class, InterfaceC1432g.class, InterfaceC1433h.class, InterfaceC1434i.class, InterfaceC1435j.class, InterfaceC1437l.class, InterfaceC1438m.class, InterfaceC5174f.class);
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(listM19382k, 10));
        for (Object obj : listM19382k) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            arrayList.add(new C17309l((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f51278Z = AbstractC17659D.m19253o(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", lZYtIbClQJm.BDRo);
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put(lZYtIbClQJm.cMNihCvKyuer, "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        AbstractC16544l.m18093f(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb2 = new StringBuilder("kotlin.jvm.internal.");
            AbstractC16544l.m18091d(str);
            sb2.append(AbstractC21322p.m21703k0('.', str, str));
            sb2.append("CompanionObject");
            map3.put(sb2.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f51278Z.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        f51279o0 = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC17660E.m19257b(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            AbstractC16544l.m18091d(str2);
            linkedHashMap.put(key, AbstractC21322p.m21703k0('.', str2, str2));
        }
        f51280p0 = linkedHashMap;
    }
}

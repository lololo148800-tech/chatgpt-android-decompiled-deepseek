package p646aj;

import ao.C11123A;
import ao.C11125B;
import ao.C11126B0;
import ao.C11128C0;
import ao.C11134H;
import ao.C11135I;
import ao.C11140N;
import ao.C11141O;
import ao.C11162f;
import ao.C11164g;
import ao.C11168i;
import ao.C11170j;
import ao.C11177m0;
import ao.C11179n0;
import ao.C11180o;
import ao.C11181o0;
import ao.C11182p;
import ao.C11189s0;
import ao.C11190t;
import ao.C11192u;
import ao.C11195v0;
import ao.C11201y0;
import bo.AbstractC11516d;
import bo.AbstractC11523k;
import bo.C11515c;
import bo.C11527o;
import bo.C11534v;
import co.AbstractC11809J;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.InlineClassDescriptor;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.AbstractC16645d;
import kotlinx.serialization.json.C16642a;
import kotlinx.serialization.json.C16644c;
import kotlinx.serialization.json.JsonNull;
import mm.C17294A;
import mm.C17296C;
import mm.C17309l;
import mm.C17315r;
import mm.C17317t;
import mm.C17319v;
import mm.C17321x;
import p523V9.AbstractC8024X3;
import p909nm.AbstractC17659D;

/* JADX INFO: renamed from: aj.h */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10628h {

    /* JADX INFO: renamed from: a */
    public static final C11527o f31539a;

    /* JADX INFO: renamed from: b */
    public static final C11527o f31540b;

    /* JADX INFO: renamed from: c */
    public static final Object f31541c;

    static {
        C10622b c10622b = C10622b.f31521p0;
        C11515c c11515c = AbstractC11516d.f34842d;
        f31539a = AbstractC8024X3.m8363a(c11515c, c10622b);
        f31540b = AbstractC8024X3.m8363a(c11515c, C10622b.f31522q0);
        C16527D c16527d = AbstractC16526C.f51263a;
        f31541c = AbstractC17659D.m19244f(new C17309l(c16527d.mo5693b(String.class), C11181o0.f33827a), new C17309l(c16527d.mo5693b(Character.TYPE), C11182p.f33829a), new C17309l(c16527d.mo5693b(char[].class), C11180o.f33826c), new C17309l(c16527d.mo5693b(Double.TYPE), C11192u.f33846a), new C17309l(c16527d.mo5693b(double[].class), C11190t.f33843c), new C17309l(c16527d.mo5693b(Float.TYPE), C11125B.f33744a), new C17309l(c16527d.mo5693b(float[].class), C11123A.f33742c), new C17309l(c16527d.mo5693b(Long.TYPE), C11141O.f33773a), new C17309l(c16527d.mo5693b(long[].class), C11140N.f33772c), new C17309l(c16527d.mo5693b(Integer.TYPE), C11135I.f33763a), new C17309l(c16527d.mo5693b(int[].class), C11134H.f33762c), new C17309l(c16527d.mo5693b(Short.TYPE), C11179n0.f33824a), new C17309l(c16527d.mo5693b(short[].class), C11177m0.f33821c), new C17309l(c16527d.mo5693b(Byte.TYPE), C11170j.f33815a), new C17309l(c16527d.mo5693b(byte[].class), C11168i.f33811c), new C17309l(c16527d.mo5693b(Boolean.TYPE), C11164g.f33804a), new C17309l(c16527d.mo5693b(boolean[].class), C11162f.f33801c), new C17309l(c16527d.mo5693b(C17296C.class), C11128C0.f33748b), new C17309l(c16527d.mo5693b(C17319v.class), C11195v0.f33851a), new C17309l(c16527d.mo5693b(C17321x.class), C11201y0.f33867a), new C17309l(c16527d.mo5693b(C17317t.class), C11189s0.f33841a), new C17309l(c16527d.mo5693b(C17294A.class), C11126B0.f33746a));
    }

    /* JADX INFO: renamed from: a */
    public static final Boolean m10999a(String key, C16644c c16644c) {
        AbstractC16544l.m18094g(c16644c, "<this>");
        AbstractC16544l.m18094g(key, "key");
        AbstractC16643b abstractC16643b = (AbstractC16643b) c16644c.get(key);
        if (abstractC16643b == null) {
            return null;
        }
        AbstractC16645d abstractC16645d = abstractC16643b instanceof AbstractC16645d ? (AbstractC16645d) abstractC16643b : null;
        if (abstractC16645d == null) {
            return null;
        }
        InlineClassDescriptor inlineClassDescriptor = AbstractC11523k.f34886a;
        String strMo12922f = abstractC16645d.mo12922f();
        String[] strArr = AbstractC11809J.f35796a;
        AbstractC16544l.m18094g(strMo12922f, "<this>");
        if (strMo12922f.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (strMo12922f.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final void m11000b(C11534v c11534v, C16644c obj) {
        AbstractC16544l.m18094g(obj, "obj");
        for (Map.Entry entry : obj.f53331Y.entrySet()) {
            c11534v.m12927c((String) entry.getKey(), (AbstractC16643b) entry.getValue());
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m11001c(C11534v c11534v, String str, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            c11534v.m12927c(str, AbstractC11523k.m12910c("undefined"));
        } else {
            c11534v.m12927c(str, AbstractC11523k.m12910c(charSequence.toString()));
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: d */
    public static final AbstractC16643b m11002d(Object obj) {
        AbstractC16544l.m18094g(obj, "<this>");
        if (obj instanceof Map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                String key = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof AbstractC16643b) {
                    AbstractC16643b element = (AbstractC16643b) value;
                    AbstractC16544l.m18094g(key, "key");
                    AbstractC16544l.m18094g(element, "element");
                } else {
                    AbstractC16643b element2 = m11002d(value);
                    AbstractC16544l.m18094g(key, "key");
                    AbstractC16544l.m18094g(element2, "element");
                }
            }
            return new C16644c(linkedHashMap);
        }
        if (obj instanceof Object[]) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Object[]) obj) {
                if (obj2 instanceof AbstractC16643b) {
                    AbstractC16643b element3 = (AbstractC16643b) obj2;
                    AbstractC16544l.m18094g(element3, "element");
                    arrayList.add(element3);
                } else {
                    AbstractC16643b element4 = m11002d(obj2);
                    AbstractC16544l.m18094g(element4, "element");
                    arrayList.add(element4);
                }
            }
            return new C16642a(arrayList);
        }
        if (obj instanceof Collection) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : (Collection) obj) {
                if (obj3 instanceof AbstractC16643b) {
                    AbstractC16643b element5 = (AbstractC16643b) obj3;
                    AbstractC16544l.m18094g(element5, "element");
                    arrayList2.add(element5);
                } else {
                    AbstractC16643b element6 = m11002d(obj3);
                    AbstractC16544l.m18094g(element6, "element");
                    arrayList2.add(element6);
                }
            }
            return new C16642a(arrayList2);
        }
        if (obj instanceof C17309l) {
            C17309l c17309l = (C17309l) obj;
            AbstractC16643b element7 = m11002d(c17309l.f55136Y);
            AbstractC16643b element8 = m11002d(c17309l.f55137Z);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            AbstractC16544l.m18094g(element7, "element");
            AbstractC16544l.m18094g(element8, "element");
            return new C16644c(linkedHashMap2);
        }
        if (obj instanceof C17315r) {
            C17315r c17315r = (C17315r) obj;
            AbstractC16643b element9 = m11002d(c17315r.f55146Y);
            AbstractC16643b element10 = m11002d(c17315r.f55147Z);
            AbstractC16643b element11 = m11002d(c17315r.f55148o0);
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            AbstractC16544l.m18094g(element9, "element");
            AbstractC16544l.m18094g(element10, "element");
            AbstractC16544l.m18094g(element11, "element");
            return new C16644c(linkedHashMap3);
        }
        if (!(obj instanceof Map.Entry)) {
            KSerializer kSerializer = (KSerializer) f31541c.get(AbstractC16526C.f51263a.mo5693b(obj.getClass()));
            if (kSerializer == null) {
                kSerializer = null;
            }
            return kSerializer != null ? AbstractC11516d.f34842d.m12904c(kSerializer, obj) : JsonNull.INSTANCE;
        }
        Map.Entry entry2 = (Map.Entry) obj;
        AbstractC16643b element12 = m11002d(entry2.getKey());
        AbstractC16643b element13 = m11002d(entry2.getValue());
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        AbstractC16544l.m18094g(element12, "element");
        AbstractC16544l.m18094g(element13, "element");
        return new C16644c(linkedHashMap4);
    }
}

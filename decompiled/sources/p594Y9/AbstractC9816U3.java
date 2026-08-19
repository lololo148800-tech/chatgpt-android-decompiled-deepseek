package p594Y9;

import ao.AbstractC11153a0;
import ao.AbstractC11165g0;
import ao.C11131E;
import ao.C11144S;
import ao.C11158d;
import ao.C11167h0;
import ao.C11183p0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlinx.serialization.KSerializer;
import mm.C17309l;
import mm.C17315r;
import p001A.C0042V0;
import p049Bm.InterfaceC1426a;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p523V9.AbstractC8138m0;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p919o8.C17890D1;

/* JADX INFO: renamed from: Y9.U3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9816U3 {
    /* JADX INFO: renamed from: a */
    public static C17890D1 m10450a(C3676s c3676s) {
        try {
            return new C17890D1(c3676s.m4395w("count").mo4382p());
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Error", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Error", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Error", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final KSerializer m10451b(C0042V0 module, InterfaceC3756d kClass) {
        AbstractC16544l.m18094g(module, "module");
        AbstractC16544l.m18094g(kClass, "kClass");
        KSerializer kSerializerM213g = module.m213g(kClass, C17689w.f56480Y);
        if (kSerializerM213g != null) {
            return kSerializerM213g;
        }
        AbstractC11153a0.m12388k(kClass);
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static final KSerializer m10452c(InterfaceC3756d interfaceC3756d, ArrayList arrayList, InterfaceC1426a interfaceC1426a) {
        KSerializer c11158d;
        KSerializer c11167h0;
        AbstractC16544l.m18094g(interfaceC3756d, "<this>");
        C16527D c16527d = AbstractC16526C.f51263a;
        if (interfaceC3756d.equals(c16527d.mo5693b(Collection.class)) || interfaceC3756d.equals(c16527d.mo5693b(List.class)) || interfaceC3756d.equals(c16527d.mo5693b(List.class)) || interfaceC3756d.equals(c16527d.mo5693b(ArrayList.class))) {
            c11158d = new C11158d((KSerializer) arrayList.get(0), 0);
        } else if (interfaceC3756d.equals(c16527d.mo5693b(HashSet.class))) {
            c11158d = new C11158d((KSerializer) arrayList.get(0), 1);
        } else if (interfaceC3756d.equals(c16527d.mo5693b(Set.class)) || interfaceC3756d.equals(c16527d.mo5693b(Set.class)) || interfaceC3756d.equals(c16527d.mo5693b(LinkedHashSet.class))) {
            c11158d = new C11158d((KSerializer) arrayList.get(0), 2);
        } else if (interfaceC3756d.equals(c16527d.mo5693b(HashMap.class))) {
            c11158d = new C11131E((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), 0);
        } else if (interfaceC3756d.equals(c16527d.mo5693b(Map.class)) || interfaceC3756d.equals(c16527d.mo5693b(Map.class)) || interfaceC3756d.equals(c16527d.mo5693b(LinkedHashMap.class))) {
            c11158d = new C11131E((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), 1);
        } else {
            if (interfaceC3756d.equals(c16527d.mo5693b(Map.Entry.class))) {
                KSerializer keySerializer = (KSerializer) arrayList.get(0);
                KSerializer valueSerializer = (KSerializer) arrayList.get(1);
                AbstractC16544l.m18094g(keySerializer, "keySerializer");
                AbstractC16544l.m18094g(valueSerializer, "valueSerializer");
                c11167h0 = new C11144S(keySerializer, valueSerializer, 0);
            } else if (interfaceC3756d.equals(c16527d.mo5693b(C17309l.class))) {
                KSerializer keySerializer2 = (KSerializer) arrayList.get(0);
                KSerializer valueSerializer2 = (KSerializer) arrayList.get(1);
                AbstractC16544l.m18094g(keySerializer2, "keySerializer");
                AbstractC16544l.m18094g(valueSerializer2, "valueSerializer");
                c11167h0 = new C11144S(keySerializer2, valueSerializer2, 1);
            } else if (interfaceC3756d.equals(c16527d.mo5693b(C17315r.class))) {
                KSerializer aSerializer = (KSerializer) arrayList.get(0);
                KSerializer bSerializer = (KSerializer) arrayList.get(1);
                KSerializer cSerializer = (KSerializer) arrayList.get(2);
                AbstractC16544l.m18094g(aSerializer, "aSerializer");
                AbstractC16544l.m18094g(bSerializer, "bSerializer");
                AbstractC16544l.m18094g(cSerializer, "cSerializer");
                c11158d = new C11183p0(aSerializer, bSerializer, cSerializer);
            } else if (AbstractC8138m0.m8667b(interfaceC3756d).isArray()) {
                Object objInvoke = interfaceC1426a.invoke();
                AbstractC16544l.m18092e(objInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                KSerializer elementSerializer = (KSerializer) arrayList.get(0);
                AbstractC16544l.m18094g(elementSerializer, "elementSerializer");
                c11167h0 = new C11167h0((InterfaceC3756d) objInvoke, elementSerializer);
            } else {
                c11158d = null;
            }
            c11158d = c11167h0;
        }
        if (c11158d != null) {
            return c11158d;
        }
        KSerializer[] kSerializerArr = (KSerializer[]) arrayList.toArray(new KSerializer[0]);
        return AbstractC11153a0.m12381d(interfaceC3756d, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    /* JADX INFO: renamed from: d */
    public static final KSerializer m10453d(C0042V0 c0042v0, InterfaceC3777y type) {
        AbstractC16544l.m18094g(c0042v0, "<this>");
        AbstractC16544l.m18094g(type, "type");
        return AbstractC9822V3.m10465b(c0042v0, type, false);
    }

    /* JADX INFO: renamed from: e */
    public static final KSerializer m10454e(InterfaceC3756d interfaceC3756d) {
        AbstractC16544l.m18094g(interfaceC3756d, "<this>");
        KSerializer kSerializerM12381d = AbstractC11153a0.m12381d(interfaceC3756d, new KSerializer[0]);
        return kSerializerM12381d == null ? (KSerializer) AbstractC11165g0.f33806a.get(interfaceC3756d) : kSerializerM12381d;
    }

    /* JADX INFO: renamed from: f */
    public static final ArrayList m10455f(C0042V0 c0042v0, List typeArguments, boolean z6) {
        ArrayList arrayList;
        AbstractC16544l.m18094g(c0042v0, "<this>");
        AbstractC16544l.m18094g(typeArguments, "typeArguments");
        if (z6) {
            List<InterfaceC3777y> list = typeArguments;
            arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
            for (InterfaceC3777y type : list) {
                AbstractC16544l.m18094g(type, "type");
                KSerializer kSerializerM10465b = AbstractC9822V3.m10465b(c0042v0, type, true);
                if (kSerializerM10465b == null) {
                    InterfaceC3756d interfaceC3756dM12387j = AbstractC11153a0.m12387j(type);
                    AbstractC16544l.m18094g(interfaceC3756dM12387j, "<this>");
                    AbstractC11153a0.m12388k(interfaceC3756dM12387j);
                    throw null;
                }
                arrayList.add(kSerializerM10465b);
            }
        } else {
            List list2 = typeArguments;
            arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                KSerializer kSerializerM10453d = m10453d(c0042v0, (InterfaceC3777y) it.next());
                if (kSerializerM10453d == null) {
                    return null;
                }
                arrayList.add(kSerializerM10453d);
            }
        }
        return arrayList;
    }
}

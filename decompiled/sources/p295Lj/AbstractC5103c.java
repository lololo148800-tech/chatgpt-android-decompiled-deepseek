package p295Lj;

import android.content.Context;
import androidx.lifecycle.EnumC11104m;
import ao.AbstractC11153a0;
import ao.C11131E;
import ao.C11158d;
import ao.C11181o0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Encoder;
import p001A.C0042V0;
import p003A1.AbstractC0233b1;
import p003A1.C0178J0;
import p003A1.C0257i0;
import p003A1.C0286s;
import p006A4.C0350k;
import p006A4.C0351l;
import p006A4.C0353n;
import p006A4.C0354o;
import p006A4.C0355p;
import p049Bm.InterfaceC1439n;
import p1111xl.C21296a;
import p1143z4.AbstractC21790t;
import p1143z4.C21778h;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p537W0.AbstractC8411c;
import p562X0.C9013h;
import p586Y0.C9566r;
import p586Y0.C9572x;
import p594Y9.AbstractC9816U3;
import p594Y9.AbstractC9840Y3;
import p594Y9.AbstractC9961r4;
import p594Y9.AbstractC9973t4;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: renamed from: Lj.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5103c {

    /* JADX INFO: renamed from: a */
    public static C5102b f16680a;

    /* JADX INFO: renamed from: a */
    public static final void m5665a(C0355p c0355p, C6021p c6021p, int i10) {
        c6021p.m6526U(294589392);
        if ((((i10 & 14) == 0 ? (c6021p.m6542f(c0355p) ? 4 : 2) | i10 : i10) & 11) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C9013h c9013hM10488b = AbstractC9840Y3.m10488b(c6021p);
            InterfaceC5985X interfaceC5985XM6469y = C5997d.m6469y(c0355p.m22258b().f69093e, c6021p);
            Object obj = (Collection) ((List) interfaceC5985XM6469y.getValue());
            c6021p.m6525T(467378629);
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            c6021p.m6525T(1157296644);
            boolean zM6542f = c6021p.m6542f(obj);
            Object objM6514H = c6021p.m6514H();
            Object obj2 = C6013l.f19514a;
            Object obj3 = objM6514H;
            if (zM6542f || objM6514H == obj2) {
                C9566r c9566r = new C9566r();
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : (Iterable) obj) {
                    C21778h c21778h = (C21778h) obj4;
                    if (zBooleanValue || c21778h.f69080t0.f33504d.compareTo(EnumC11104m.f33477p0) >= 0) {
                        arrayList.add(obj4);
                    }
                }
                c9566r.addAll(arrayList);
                c6021p.m6537c0(c9566r);
                obj3 = c9566r;
            }
            boolean z6 = false;
            c6021p.m6553p(false);
            C9566r c9566r2 = (C9566r) obj3;
            c6021p.m6553p(false);
            m5666b(c9566r2, (List) interfaceC5985XM6469y.getValue(), c6021p, 64);
            InterfaceC5985X interfaceC5985XM6469y2 = C5997d.m6469y(c0355p.m22258b().f69094f, c6021p);
            c6021p.m6525T(-492369756);
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == obj2) {
                objM6514H2 = new C9566r();
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            C9566r c9566r3 = (C9566r) objM6514H2;
            c6021p.m6525T(875188318);
            ListIterator listIterator = c9566r2.listIterator();
            while (true) {
                C9572x c9572x = (C9572x) listIterator;
                if (!c9572x.hasNext()) {
                    break;
                }
                C21778h c21778h2 = (C21778h) c9572x.next();
                AbstractC21790t abstractC21790t = c21778h2.f69074Z;
                AbstractC16544l.m18092e(abstractC21790t, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                C0354o c0354o = (C0354o) abstractC21790t;
                AbstractC9973t4.m10617b(new C0286s(c0355p, 3, c21778h2), c0354o.f1227u0, AbstractC8411c.m8968b(1129586364, c6021p, new C0350k(c21778h2, c9013hM10488b, c9566r3, c0355p, c0354o, 0)), c6021p, 384, 0);
                c9013hM10488b = c9013hM10488b;
                z6 = false;
            }
            c6021p.m6553p(z6);
            Set set = (Set) interfaceC5985XM6469y2.getValue();
            c6021p.m6525T(1618982084);
            boolean zM6542f2 = c6021p.m6542f(interfaceC5985XM6469y2) | c6021p.m6542f(c0355p) | c6021p.m6542f(c9566r3);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f2 || objM6514H3 == obj2) {
                objM6514H3 = new C0351l(interfaceC5985XM6469y2, c0355p, c9566r3, null);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            C5997d.m6451g(set, c9566r3, (InterfaceC1439n) objM6514H3, c6021p);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r == null) {
            return;
        }
        c6018n0M6555r.f19536d = new C0178J0(c0355p, i10, 1);
    }

    /* JADX INFO: renamed from: b */
    public static final void m5666b(C9566r c9566r, Collection collection, C6021p c6021p, int i10) {
        c6021p.m6526U(1537894851);
        boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C21778h c21778h = (C21778h) it.next();
            C5997d.m6444c(c21778h.f69080t0, new C0353n(c21778h, zBooleanValue, c9566r, 0), c6021p);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r == null) {
            return;
        }
        c6018n0M6555r.f19536d = new C0257i0(c9566r, collection, i10, 1);
    }

    /* JADX INFO: renamed from: c */
    public static final KSerializer m5667c(Collection collection, C0042V0 c0042v0) {
        Collection collection2 = collection;
        ArrayList arrayListM19339O = AbstractC17680n.m19339O(collection2);
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(arrayListM19339O, 10));
        Iterator it = arrayListM19339O.iterator();
        while (it.hasNext()) {
            arrayList.add(m5670f(it.next(), c0042v0));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((KSerializer) obj).getDescriptor().mo10679a())) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.size() > 1) {
            StringBuilder sb2 = new StringBuilder("Serializing collections of different element types is not yet supported. Selected serializers: ");
            ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((KSerializer) it2.next()).getDescriptor().mo10679a());
            }
            sb2.append(arrayList3);
            throw new IllegalStateException(sb2.toString().toString());
        }
        KSerializer kSerializer = (KSerializer) AbstractC17680n.m19367q0(arrayList2);
        if (kSerializer == null) {
            kSerializer = C11181o0.f33827a;
        }
        if (kSerializer.getDescriptor().mo10680c()) {
            return kSerializer;
        }
        if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
            Iterator it3 = collection2.iterator();
            while (it3.hasNext()) {
                if (it3.next() == null) {
                    return AbstractC9961r4.m10615b(kSerializer);
                }
            }
        }
        return kSerializer;
    }

    /* JADX INFO: renamed from: d */
    public static void m5668d(Encoder encoder, KSerializer serializer, Object obj) {
        AbstractC16544l.m18094g(serializer, "serializer");
        if (serializer.getDescriptor().mo10680c()) {
            encoder.mo5560A(serializer, obj);
        } else if (obj == null) {
            encoder.mo5572f();
        } else {
            encoder.mo5560A(serializer, obj);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final C5102b m5669e(Context context) {
        C5102b c5102b = f16680a;
        if (c5102b == null) {
            synchronized (AbstractC5103c.class) {
                c5102b = f16680a;
                if (c5102b == null) {
                    c5102b = new C5102b(context);
                    f16680a = c5102b;
                }
            }
        }
        return c5102b;
    }

    /* JADX INFO: renamed from: f */
    public static final KSerializer m5670f(Object obj, C0042V0 module) {
        KSerializer kSerializerM213g;
        InterfaceC3756d interfaceC3756dMo5693b;
        AbstractC16544l.m18094g(module, "module");
        if (obj == null) {
            return AbstractC9961r4.m10615b(C11181o0.f33827a);
        }
        if (obj instanceof List) {
            return AbstractC9961r4.m10614a(m5667c((Collection) obj, module));
        }
        if (obj instanceof Object[]) {
            Object objM19317x = AbstractC17678l.m19317x((Object[]) obj);
            return objM19317x != null ? m5670f(objM19317x, module) : AbstractC9961r4.m10614a(C11181o0.f33827a);
        }
        if (obj instanceof Set) {
            kSerializerM213g = new C11158d(m5667c((Collection) obj, module), 2);
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            kSerializerM213g = new C11131E(m5667c(map.keySet(), module), m5667c(map.values(), module), 1);
        } else {
            Class<?> cls = obj.getClass();
            C16527D c16527d = AbstractC16526C.f51263a;
            kSerializerM213g = module.m213g(c16527d.mo5693b(cls), C17689w.f56480Y);
            if (kSerializerM213g == null && (kSerializerM213g = AbstractC9816U3.m10454e((interfaceC3756dMo5693b = c16527d.mo5693b(obj.getClass())))) == null) {
                AbstractC11153a0.m12388k(interfaceC3756dMo5693b);
                throw null;
            }
        }
        return kSerializerM213g;
    }

    /* JADX INFO: renamed from: g */
    public static final KSerializer m5671g(C0042V0 c0042v0, C21296a typeInfo) {
        AbstractC16544l.m18094g(c0042v0, "<this>");
        AbstractC16544l.m18094g(typeInfo, "typeInfo");
        InterfaceC3777y interfaceC3777y = typeInfo.f67701b;
        if (interfaceC3777y != null) {
            KSerializer kSerializerM10453d = interfaceC3777y.getArguments().isEmpty() ? null : AbstractC9816U3.m10453d(c0042v0, interfaceC3777y);
            if (kSerializerM10453d != null) {
                return kSerializerM10453d;
            }
        }
        C17689w c17689w = C17689w.f56480Y;
        InterfaceC3756d interfaceC3756d = typeInfo.f67700a;
        KSerializer kSerializerM213g = c0042v0.m213g(interfaceC3756d, c17689w);
        if (kSerializerM213g == null) {
            kSerializerM213g = AbstractC9816U3.m10454e(interfaceC3756d);
            if (kSerializerM213g == null) {
                AbstractC11153a0.m12388k(interfaceC3756d);
                throw null;
            }
            if (interfaceC3777y != null && interfaceC3777y.mo4452b()) {
                kSerializerM213g = AbstractC9961r4.m10615b(kSerializerM213g);
            }
        } else if (interfaceC3777y != null && interfaceC3777y.mo4452b()) {
            kSerializerM213g = AbstractC9961r4.m10615b(kSerializerM213g);
        }
        return kSerializerM213g;
    }
}

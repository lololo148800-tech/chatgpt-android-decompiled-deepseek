package p594Y9;

import ao.AbstractC11153a0;
import ao.InterfaceC11173k0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import mm.C17311n;
import p001A.C0042V0;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p225Im.C3743B;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p559Wn.AbstractC8978j;
import p559Wn.C8972d;
import p559Wn.C8979k;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p919o8.C17893E1;

/* JADX INFO: renamed from: Y9.V3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9822V3 {
    /* JADX INFO: renamed from: a */
    public static C17893E1 m10464a(C3676s c3676s) {
        try {
            Number min = c3676s.m4395w("min").mo4383q();
            Number max = c3676s.m4395w("max").mo4383q();
            Number average = c3676s.m4395w("average").mo4383q();
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("metric_max");
            Number numberMo4383q = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4383q() : null;
            AbstractC16544l.m18093f(min, "min");
            AbstractC16544l.m18093f(max, "max");
            AbstractC16544l.m18093f(average, "average");
            return new C17893E1(min, max, average, numberMo4383q);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type FlutterBuildTime", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type FlutterBuildTime", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type FlutterBuildTime", e12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0063  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX INFO: renamed from: b */
    public static final KSerializer m10465b(C0042V0 c0042v0, InterfaceC3777y interfaceC3777y, boolean z6) {
        KSerializer kSerializerMo12393a;
        KSerializer kSerializerM213g;
        KSerializer c8972d;
        InterfaceC3756d clazz = AbstractC11153a0.m12387j(interfaceC3777y);
        boolean zMo4452b = interfaceC3777y.mo4452b();
        List<C3743B> arguments = interfaceC3777y.getArguments();
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(arguments, 10));
        for (C3743B c3743b : arguments) {
            AbstractC16544l.m18094g(c3743b, "<this>");
            InterfaceC3777y interfaceC3777y2 = c3743b.f11393b;
            if (interfaceC3777y2 == null) {
                throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + interfaceC3777y2).toString());
            }
            arrayList.add(interfaceC3777y2);
        }
        boolean zIsEmpty = arrayList.isEmpty();
        List list = C17689w.f56480Y;
        if (zIsEmpty) {
            if (!AbstractC11153a0.m12386i(clazz) || c0042v0.m213g(clazz, list) == null) {
                InterfaceC11173k0 interfaceC11173k0 = AbstractC8978j.f27418a;
                if (zMo4452b) {
                    kSerializerMo12393a = AbstractC8978j.f27419b.mo12393a(clazz);
                } else {
                    kSerializerMo12393a = AbstractC8978j.f27418a.mo12393a(clazz);
                    if (kSerializerMo12393a == null) {
                        kSerializerMo12393a = null;
                    }
                }
            } else {
                kSerializerMo12393a = null;
            }
        } else if (c0042v0.f204Y) {
            kSerializerMo12393a = null;
        } else {
            InterfaceC11173k0 interfaceC11173k1 = AbstractC8978j.f27418a;
            AbstractC16544l.m18094g(clazz, "clazz");
            Object objMo12376c = !zMo4452b ? AbstractC8978j.f27420c.mo12376c(clazz, arrayList) : AbstractC8978j.f27421d.mo12376c(clazz, arrayList);
            if (objMo12376c instanceof C17311n) {
                objMo12376c = null;
            }
            kSerializerMo12393a = (KSerializer) objMo12376c;
        }
        if (kSerializerMo12393a != null) {
            return kSerializerMo12393a;
        }
        if (arrayList.isEmpty()) {
            kSerializerM213g = AbstractC9816U3.m10454e(clazz);
            if (kSerializerM213g == null && (kSerializerM213g = c0042v0.m213g(clazz, list)) == null) {
                if (AbstractC11153a0.m12386i(clazz)) {
                    c8972d = new C8972d(clazz);
                    kSerializerM213g = c8972d;
                } else {
                    kSerializerM213g = null;
                }
            }
        } else {
            ArrayList arrayListM10455f = AbstractC9816U3.m10455f(c0042v0, arrayList, z6);
            if (arrayListM10455f == null) {
                return null;
            }
            KSerializer kSerializerM10452c = AbstractC9816U3.m10452c(clazz, arrayListM10455f, new C8979k(0, arrayList));
            if (kSerializerM10452c == null) {
                kSerializerM213g = c0042v0.m213g(clazz, arrayListM10455f);
                if (kSerializerM213g == null) {
                    if (AbstractC11153a0.m12386i(clazz)) {
                        c8972d = new C8972d(clazz);
                        kSerializerM213g = c8972d;
                    } else {
                        kSerializerM213g = null;
                    }
                }
            } else {
                kSerializerM213g = kSerializerM10452c;
            }
        }
        if (kSerializerM213g != null) {
            return zMo4452b ? AbstractC9961r4.m10615b(kSerializerM213g) : kSerializerM213g;
        }
        return null;
    }
}

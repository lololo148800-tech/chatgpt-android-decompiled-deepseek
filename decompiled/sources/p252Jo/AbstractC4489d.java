package p252Jo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import livekit.org.webrtc.WebrtcBuildVersion;
import mm.C17309l;
import p300Lo.C5218a;
import p571X9.AbstractC9393x3;
import p588Y2.C9642z;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: renamed from: Jo.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4489d {

    /* JADX INFO: renamed from: a */
    public static final Object f14644a;

    static {
        Boolean bool = Boolean.TRUE;
        C9642z c9642z = new C9642z(2);
        c9642z.m10200L(bool);
        c9642z.m10201M(m5215a(1));
        ArrayList arrayList = (ArrayList) c9642z.f29064Z;
        C17309l c17309l = new C17309l(bool, AbstractC17681o.m19382k(arrayList.toArray(new Object[arrayList.size()])));
        Boolean bool2 = Boolean.FALSE;
        C9642z c9642z2 = new C9642z(7);
        c9642z2.m10200L(bool2);
        c9642z2.m10201M(m5215a(0));
        c9642z2.m10200L("");
        C17689w c17689w = C17689w.f56480Y;
        c9642z2.m10200L(c17689w);
        c9642z2.m10200L(new C5218a(c17689w));
        c9642z2.m10200L(new C5218a(""));
        c9642z2.m10200L(new C5218a(null));
        ArrayList arrayList2 = (ArrayList) c9642z2.f29064Z;
        C17309l c17309l2 = new C17309l(bool2, AbstractC17681o.m19382k(arrayList2.toArray(new Object[arrayList2.size()])));
        C9642z c9642z3 = new C9642z(2);
        c9642z3.m10200L(bool);
        c9642z3.m10201M(m5215a(1));
        ArrayList arrayList3 = (ArrayList) c9642z3.f29064Z;
        C17309l c17309l3 = new C17309l(1, AbstractC17681o.m19382k(arrayList3.toArray(new Object[arrayList3.size()])));
        C9642z c9642z4 = new C9642z(7);
        c9642z4.m10200L(bool2);
        c9642z4.m10201M(m5215a(0));
        c9642z4.m10200L("");
        c9642z4.m10200L(c17689w);
        c9642z4.m10200L(new C5218a(c17689w));
        c9642z4.m10200L(new C5218a(""));
        c9642z4.m10200L(new C5218a(null));
        ArrayList arrayList4 = (ArrayList) c9642z4.f29064Z;
        C17309l c17309l4 = new C17309l(0, AbstractC17681o.m19382k(arrayList4.toArray(new Object[arrayList4.size()])));
        C17309l c17309l5 = new C17309l("true", AbstractC9393x3.m9974d("true"));
        C17309l c17309l6 = new C17309l("false", AbstractC9393x3.m9974d("false"));
        C17309l c17309l7 = new C17309l("1", AbstractC17681o.m19382k(bool, 1, Double.valueOf(1.0d), "1", new C5218a(1), new C5218a(Double.valueOf(1.0d)), new C5218a("1")));
        C17309l c17309l8 = new C17309l(WebrtcBuildVersion.maint_version, AbstractC17681o.m19382k(bool2, 0, Double.valueOf(0.0d), WebrtcBuildVersion.maint_version, new C5218a(0), new C5218a(Double.valueOf(0.0d)), new C5218a(WebrtcBuildVersion.maint_version)));
        C17309l c17309l9 = new C17309l("", AbstractC17681o.m19382k(bool2, 0, "", c17689w, new C5218a(c17689w), new C5218a(""), new C5218a(null)));
        C17309l c17309l10 = new C17309l(null, AbstractC9393x3.m9974d(null));
        C17309l c17309l11 = new C17309l(c17689w, AbstractC17681o.m19382k(bool2, 0, Double.valueOf(0.0d), ""));
        C17309l c17309l12 = new C17309l(new C5218a(null), AbstractC17681o.m19382k(bool2, 0, Double.valueOf(0.0d), ""));
        C17309l c17309l13 = new C17309l(new C5218a(""), AbstractC17681o.m19382k(bool2, 0, Double.valueOf(0.0d), ""));
        C17309l c17309l14 = new C17309l(new C5218a(c17689w), AbstractC17681o.m19382k(bool2, 0, Double.valueOf(0.0d), ""));
        C17309l c17309l15 = new C17309l(new C5218a(0), AbstractC17681o.m19382k(bool2, 0, Double.valueOf(0.0d), WebrtcBuildVersion.maint_version));
        C17309l c17309l16 = new C17309l(new C5218a(1), AbstractC17681o.m19382k(bool, 1, Double.valueOf(1.0d), "1"));
        C17309l c17309l17 = new C17309l(new C5218a("1"), AbstractC17681o.m19382k(bool, 1, Double.valueOf(1.0d), "1"));
        C17309l c17309l18 = new C17309l(new C5218a(WebrtcBuildVersion.maint_version), AbstractC17681o.m19382k(bool2, 0, Double.valueOf(0.0d), WebrtcBuildVersion.maint_version));
        C17309l c17309l19 = new C17309l(new C5218a(Double.valueOf(0.0d)), AbstractC17681o.m19382k(bool2, 0, Double.valueOf(0.0d), WebrtcBuildVersion.maint_version));
        C17309l c17309l20 = new C17309l(new C5218a(Double.valueOf(1.0d)), AbstractC17681o.m19382k(bool, 1, Double.valueOf(1.0d), "1"));
        C17309l c17309l21 = new C17309l(new C5218a("1.0"), AbstractC17681o.m19382k(bool, 1, Double.valueOf(1.0d)));
        C17309l c17309l22 = new C17309l(new C5218a("0.0"), AbstractC17681o.m19382k(bool2, 0, Double.valueOf(0.0d)));
        C17309l c17309l23 = new C17309l(Double.valueOf(1.0d), AbstractC17681o.m19382k(Double.valueOf(1.0d), new C5218a(Double.valueOf(1.0d)), new C5218a(1), new C5218a("1.0"), "1", 1, bool, "1.0"));
        C17309l c17309l24 = new C17309l("1.0", AbstractC17681o.m19382k("1.0", Double.valueOf(1.0d), 1, bool));
        Double dValueOf = Double.valueOf(0.0d);
        C9642z c9642z5 = new C9642z(4);
        List listM9974d = AbstractC9393x3.m9974d(Double.valueOf(0.0d));
        List list = listM9974d;
        List list2 = listM9974d;
        ArrayList arrayList5 = new ArrayList(AbstractC17682p.m19389r(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList5.add(Integer.valueOf(((Number) it.next()).intValue()));
        }
        c9642z5.m10201M(m5216b(m5217c(AbstractC17680n.m19361k0(arrayList5, list))).toArray(new Object[0]));
        Boolean bool3 = Boolean.FALSE;
        c9642z5.m10200L(bool3);
        c9642z5.m10200L(c17689w);
        c9642z5.m10200L(new C5218a(c17689w));
        ArrayList arrayList6 = (ArrayList) c9642z5.f29064Z;
        f14644a = AbstractC17659D.m19244f(c17309l, c17309l2, c17309l3, c17309l4, c17309l5, c17309l6, c17309l7, c17309l8, c17309l9, c17309l10, c17309l11, c17309l12, c17309l13, c17309l14, c17309l15, c17309l16, c17309l17, c17309l18, c17309l19, c17309l20, c17309l21, c17309l22, c17309l23, c17309l24, new C17309l(dValueOf, AbstractC17681o.m19382k(arrayList6.toArray(new Object[arrayList6.size()]))), new C17309l("0.0", AbstractC17681o.m19382k("0.0", Double.valueOf(0.0d), 0, bool3)));
    }

    /* JADX INFO: renamed from: a */
    public static Object[] m5215a(int i10) {
        List listM9974d = AbstractC9393x3.m9974d(Integer.valueOf(i10));
        List list = listM9974d;
        List list2 = listM9974d;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(((Number) it.next()).doubleValue()));
        }
        return m5216b(m5217c(AbstractC17680n.m19361k0(arrayList, list))).toArray(new Object[0]);
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m5216b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C5218a(it.next()));
        }
        return AbstractC17680n.m19361k0(arrayList2, arrayList);
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList m5217c(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Number) it.next()).toString());
        }
        return AbstractC17680n.m19361k0(arrayList2, arrayList);
    }
}

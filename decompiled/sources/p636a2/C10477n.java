package p636a2;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p594Y9.C9895g4;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: a2.n */
/* JADX INFO: loaded from: classes.dex */
public final class C10477n {

    /* JADX INFO: renamed from: b */
    public int f31029b;

    /* JADX INFO: renamed from: e */
    public C9895g4 f31032e;

    /* JADX INFO: renamed from: a */
    public final ArrayList f31028a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final int f31030c = 1000;

    /* JADX INFO: renamed from: d */
    public int f31031d = 1000;

    /* JADX INFO: renamed from: f */
    public int f31033f = 0;

    /* JADX INFO: renamed from: g */
    public final ArrayList f31034g = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static InterfaceC10459q m10941a(InterfaceC10459q interfaceC10459q, C10469f c10469f, InterfaceC1436k constrainBlock) {
        AbstractC16544l.m18094g(interfaceC10459q, "<this>");
        AbstractC16544l.m18094g(constrainBlock, "constrainBlock");
        return interfaceC10459q.mo428M(new C10476m(c10469f, constrainBlock));
    }

    /* JADX INFO: renamed from: c */
    public static C10472i m10942c(C10477n c10477n, C10469f[] c10469fArr) {
        float f10 = 0;
        int i10 = c10477n.f31031d;
        c10477n.f31031d = i10 + 1;
        c10477n.f31028a.add(new C10473j(i10, f10, c10469fArr));
        c10477n.f31029b = ((c10477n.f31029b * 1009) + 10) % 1000000007;
        for (C10469f c10469f : c10469fArr) {
            c10477n.f31029b = ((c10477n.f31029b * 1009) + c10469f.hashCode()) % 1000000007;
        }
        c10477n.f31029b = ((c10477n.f31029b * 1009) + Float.floatToIntBits(f10)) % 1000000007;
        return new C10472i(0, Integer.valueOf(i10));
    }

    /* JADX INFO: renamed from: b */
    public final C10469f m10943b() {
        ArrayList arrayList = this.f31034g;
        int i10 = this.f31033f;
        this.f31033f = i10 + 1;
        C10469f c10469f = (C10469f) AbstractC17680n.m19344T(i10, arrayList);
        if (c10469f != null) {
            return c10469f;
        }
        C10469f c10469f2 = new C10469f(Integer.valueOf(this.f31033f));
        arrayList.add(c10469f2);
        return c10469f2;
    }
}

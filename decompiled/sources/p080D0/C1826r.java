package p080D0;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: D0.r */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1826r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5262a;

    /* JADX INFO: renamed from: a */
    public final C1824q m2654a(InterfaceC1784S interfaceC1784S) {
        C1822p c1822pM2627p;
        C1822p c1822p;
        C1822p c1822p2;
        switch (this.f5262a) {
            case 0:
                return new C1824q(interfaceC1784S.mo2584l().m2646a(interfaceC1784S.mo2584l().f5237c), interfaceC1784S.mo2581i().m2646a(interfaceC1784S.mo2581i().f5238d), interfaceC1784S.mo2582j() == 1);
            case 1:
                return AbstractC1807h0.m2634w(new C1824q(interfaceC1784S.mo2584l().m2646a(interfaceC1784S.mo2584l().f5237c), interfaceC1784S.mo2581i().m2646a(interfaceC1784S.mo2581i().f5238d), interfaceC1784S.mo2582j() == 1), interfaceC1784S);
            case 2:
                return AbstractC1807h0.m2620i(interfaceC1784S, C1828s.f5265c);
            case 3:
                return AbstractC1807h0.m2620i(interfaceC1784S, C1828s.f5264b);
            default:
                C1824q c1824qMo2576d = interfaceC1784S.mo2576d();
                if (c1824qMo2576d == null) {
                    return AbstractC1807h0.m2620i(interfaceC1784S, C1828s.f5265c);
                }
                boolean zMo2573a = interfaceC1784S.mo2573a();
                C1822p c1822p3 = c1824qMo2576d.f5258b;
                C1822p c1822p4 = c1824qMo2576d.f5257a;
                if (zMo2573a) {
                    c1822pM2627p = AbstractC1807h0.m2627p(interfaceC1784S, interfaceC1784S.mo2584l(), c1822p4);
                    c1822p = c1822pM2627p;
                    c1822p2 = c1822p3;
                    c1822p3 = c1822p4;
                } else {
                    c1822pM2627p = AbstractC1807h0.m2627p(interfaceC1784S, interfaceC1784S.mo2581i(), c1822p3);
                    c1822p = c1822p4;
                    c1822p2 = c1822pM2627p;
                }
                if (!AbstractC16544l.m18089b(c1822pM2627p, c1822p3)) {
                    boolean z6 = true;
                    if (interfaceC1784S.mo2582j() != 1 && (interfaceC1784S.mo2582j() != 3 || c1822p.f5254b <= c1822p2.f5254b)) {
                        z6 = false;
                    }
                    c1824qMo2576d = AbstractC1807h0.m2634w(new C1824q(c1822p, c1822p2, z6), interfaceC1784S);
                }
                return c1824qMo2576d;
        }
    }
}

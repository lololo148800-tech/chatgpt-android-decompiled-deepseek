package p1095x1;

import kotlin.jvm.internal.AbstractC16544l;
import p1140z1.AbstractC21669O;
import p1140z1.AbstractC21678Y;
import p492U1.C7543h;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8111i5;
import p571X9.AbstractC9101A4;
import p571X9.AbstractC9113C4;
import p759g1.C13800b;
import p759g1.C13801c;

/* JADX INFO: renamed from: x1.I */
/* JADX INFO: loaded from: classes.dex */
public final class C21055I implements InterfaceC21098s {

    /* JADX INFO: renamed from: Y */
    public final AbstractC21669O f66971Y;

    public C21055I(AbstractC21669O abstractC21669O) {
        this.f66971Y = abstractC21669O;
    }

    @Override // p1095x1.InterfaceC21098s
    /* JADX INFO: renamed from: B */
    public final long mo21516B(long j10) {
        return C13800b.m15311l(this.f66971Y.f68765x0.mo21516B(j10), m21518a());
    }

    @Override // p1095x1.InterfaceC21098s
    /* JADX INFO: renamed from: D */
    public final long mo21517D(long j10) {
        return this.f66971Y.f68765x0.mo21517D(C13800b.m15311l(j10, m21518a()));
    }

    /* JADX INFO: renamed from: a */
    public final long m21518a() {
        AbstractC21669O abstractC21669O = this.f66971Y;
        AbstractC21669O abstractC21669OM21569j = AbstractC21075b0.m21569j(abstractC21669O);
        return C13800b.m15310k(m21519b(abstractC21669OM21569j.f68762A0, 0L), abstractC21669O.f68765x0.m22167R0(abstractC21669OM21569j.f68765x0, 0L));
    }

    /* JADX INFO: renamed from: b */
    public final long m21519b(InterfaceC21098s interfaceC21098s, long j10) {
        boolean z6 = interfaceC21098s instanceof C21055I;
        AbstractC21669O abstractC21669O = this.f66971Y;
        if (!z6) {
            AbstractC21669O abstractC21669OM21569j = AbstractC21075b0.m21569j(abstractC21669O);
            long jM21519b = m21519b(abstractC21669OM21569j.f68762A0, j10);
            AbstractC21678Y abstractC21678Y = abstractC21669OM21569j.f68765x0;
            abstractC21678Y.getClass();
            return C13800b.m15311l(jM21519b, abstractC21678Y.m22167R0(interfaceC21098s, 0L));
        }
        AbstractC21669O abstractC21669O2 = ((C21055I) interfaceC21098s).f66971Y;
        abstractC21669O2.f68765x0.m22168S0();
        AbstractC21669O abstractC21669OMo22157H0 = abstractC21669O.f68765x0.m22155F0(abstractC21669O2.f68765x0).mo22157H0();
        if (abstractC21669OMo22157H0 != null) {
            long jM7881c = C7543h.m7881c(C7543h.m7882d(abstractC21669O2.m22129A0(abstractC21669OMo22157H0, false), AbstractC9101A4.m9633c(j10)), abstractC21669O.m22129A0(abstractC21669OMo22157H0, false));
            return AbstractC8088f6.m8536b((int) (jM7881c >> 32), (int) (jM7881c & 4294967295L));
        }
        AbstractC21669O abstractC21669OM21569j2 = AbstractC21075b0.m21569j(abstractC21669O2);
        long jM7882d = C7543h.m7882d(C7543h.m7882d(abstractC21669O2.m22129A0(abstractC21669OM21569j2, false), abstractC21669OM21569j2.f68766y0), AbstractC9101A4.m9633c(j10));
        AbstractC21669O abstractC21669OM21569j3 = AbstractC21075b0.m21569j(abstractC21669O);
        long jM7881c2 = C7543h.m7881c(jM7882d, C7543h.m7882d(abstractC21669O.m22129A0(abstractC21669OM21569j3, false), abstractC21669OM21569j3.f68766y0));
        long jM8536b = AbstractC8088f6.m8536b((int) (jM7881c2 >> 32), (int) (jM7881c2 & 4294967295L));
        AbstractC21678Y abstractC21678Y2 = abstractC21669OM21569j3.f68765x0.f68821z0;
        AbstractC16544l.m18091d(abstractC21678Y2);
        AbstractC21678Y abstractC21678Y3 = abstractC21669OM21569j2.f68765x0.f68821z0;
        AbstractC16544l.m18091d(abstractC21678Y3);
        return abstractC21678Y2.m22167R0(abstractC21678Y3, jM8536b);
    }

    @Override // p1095x1.InterfaceC21098s
    /* JADX INFO: renamed from: d */
    public final long mo21520d(long j10) {
        return this.f66971Y.f68765x0.mo21520d(C13800b.m15311l(j10, m21518a()));
    }

    @Override // p1095x1.InterfaceC21098s
    /* JADX INFO: renamed from: e */
    public final long mo21521e(InterfaceC21098s interfaceC21098s, long j10) {
        return m21519b(interfaceC21098s, j10);
    }

    @Override // p1095x1.InterfaceC21098s
    /* JADX INFO: renamed from: h */
    public final boolean mo21522h() {
        return this.f66971Y.f68765x0.mo22159J0().f30972y0;
    }

    @Override // p1095x1.InterfaceC21098s
    /* JADX INFO: renamed from: j */
    public final void mo21523j(float[] fArr) {
        this.f66971Y.f68765x0.mo21523j(fArr);
    }

    @Override // p1095x1.InterfaceC21098s
    /* JADX INFO: renamed from: k */
    public final long mo21524k() {
        AbstractC21669O abstractC21669O = this.f66971Y;
        return AbstractC9113C4.m9643a(abstractC21669O.f66981Y, abstractC21669O.f66982Z);
    }

    @Override // p1095x1.InterfaceC21098s
    /* JADX INFO: renamed from: n */
    public final void mo21525n(InterfaceC21098s interfaceC21098s, float[] fArr) {
        this.f66971Y.f68765x0.mo21525n(interfaceC21098s, fArr);
    }

    @Override // p1095x1.InterfaceC21098s
    /* JADX INFO: renamed from: q */
    public final long mo21526q(long j10) {
        return C13800b.m15311l(this.f66971Y.f68765x0.mo21526q(j10), m21518a());
    }

    @Override // p1095x1.InterfaceC21098s
    /* JADX INFO: renamed from: x */
    public final InterfaceC21098s mo21527x() {
        AbstractC21669O abstractC21669OMo22157H0;
        if (!mo21522h()) {
            AbstractC8111i5.m8592c("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        AbstractC21678Y abstractC21678Y = ((AbstractC21678Y) this.f66971Y.f68765x0.f68819x0.f68638I0.f3469d).f68821z0;
        if (abstractC21678Y == null || (abstractC21669OMo22157H0 = abstractC21678Y.mo22157H0()) == null) {
            return null;
        }
        return abstractC21669OMo22157H0.f68762A0;
    }

    @Override // p1095x1.InterfaceC21098s
    /* JADX INFO: renamed from: y */
    public final C13801c mo21528y(InterfaceC21098s interfaceC21098s, boolean z6) {
        return this.f66971Y.f68765x0.mo21528y(interfaceC21098s, z6);
    }
}

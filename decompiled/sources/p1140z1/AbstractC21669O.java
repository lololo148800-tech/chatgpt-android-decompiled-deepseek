package p1140z1;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1095x1.C21055I;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21098s;
import p492U1.C7543h;
import p492U1.EnumC7546k;
import p571X9.AbstractC9113C4;

/* JADX INFO: renamed from: z1.O */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21669O extends AbstractC21668N implements InterfaceC21056J {

    /* JADX INFO: renamed from: B0 */
    public InterfaceC21058L f68763B0;

    /* JADX INFO: renamed from: x0 */
    public final AbstractC21678Y f68765x0;

    /* JADX INFO: renamed from: z0 */
    public LinkedHashMap f68767z0;

    /* JADX INFO: renamed from: y0 */
    public long f68766y0 = 0;

    /* JADX INFO: renamed from: A0 */
    public final C21055I f68762A0 = new C21055I(this);

    /* JADX INFO: renamed from: C0 */
    public final LinkedHashMap f68764C0 = new LinkedHashMap();

    public AbstractC21669O(AbstractC21678Y abstractC21678Y) {
        this.f68765x0 = abstractC21678Y;
    }

    /* JADX INFO: renamed from: w0 */
    public static final void m22128w0(AbstractC21669O abstractC21669O, InterfaceC21058L interfaceC21058L) {
        C17296C c17296c;
        LinkedHashMap linkedHashMap;
        if (interfaceC21058L != null) {
            abstractC21669O.m21553S(AbstractC9113C4.m9643a(interfaceC21058L.getWidth(), interfaceC21058L.getHeight()));
            c17296c = C17296C.f55119a;
        } else {
            c17296c = null;
        }
        if (c17296c == null) {
            abstractC21669O.m21553S(0L);
        }
        if (!AbstractC16544l.m18089b(abstractC21669O.f68763B0, interfaceC21058L) && interfaceC21058L != null && ((((linkedHashMap = abstractC21669O.f68767z0) != null && !linkedHashMap.isEmpty()) || !interfaceC21058L.mo19805a().isEmpty()) && !AbstractC16544l.m18089b(interfaceC21058L.mo19805a(), abstractC21669O.f68767z0))) {
            C21663I c21663i = abstractC21669O.f68765x0.f68819x0.m22060t().f68747s;
            AbstractC16544l.m18091d(c21663i);
            c21663i.f68683D0.m22077f();
            LinkedHashMap linkedHashMap2 = abstractC21669O.f68767z0;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                abstractC21669O.f68767z0 = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(interfaceC21058L.mo19805a());
        }
        abstractC21669O.f68763B0 = interfaceC21058L;
    }

    /* JADX INFO: renamed from: A0 */
    public final long m22129A0(AbstractC21669O abstractC21669O, boolean z6) {
        long jM7882d = 0;
        AbstractC21669O abstractC21669OMo22157H0 = this;
        while (!abstractC21669OMo22157H0.equals(abstractC21669O)) {
            if (!abstractC21669OMo22157H0.f68756r0 || !z6) {
                jM7882d = C7543h.m7882d(jM7882d, abstractC21669OMo22157H0.f68766y0);
            }
            AbstractC21678Y abstractC21678Y = abstractC21669OMo22157H0.f68765x0.f68821z0;
            AbstractC16544l.m18091d(abstractC21678Y);
            abstractC21669OMo22157H0 = abstractC21678Y.mo22157H0();
            AbstractC16544l.m18091d(abstractC21669OMo22157H0);
        }
        return jM7882d;
    }

    @Override // p1095x1.AbstractC21069X
    /* JADX INFO: renamed from: N */
    public final void mo21551N(long j10, float f10, InterfaceC1436k interfaceC1436k) {
        m22131z0(j10);
        if (this.f68757s0) {
            return;
        }
        mo22130y0();
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: X */
    public final float mo7863X() {
        return this.f68765x0.mo7863X();
    }

    @Override // p1140z1.AbstractC21668N, p1095x1.InterfaceC21095p
    /* JADX INFO: renamed from: Z */
    public final boolean mo19937Z() {
        return true;
    }

    @Override // p1140z1.AbstractC21668N
    /* JADX INFO: renamed from: g0 */
    public final AbstractC21668N mo22119g0() {
        AbstractC21678Y abstractC21678Y = this.f68765x0.f68820y0;
        if (abstractC21678Y != null) {
            return abstractC21678Y.mo22157H0();
        }
        return null;
    }

    @Override // p492U1.InterfaceC7537b
    public final float getDensity() {
        return this.f68765x0.getDensity();
    }

    @Override // p1095x1.InterfaceC21095p
    public final EnumC7546k getLayoutDirection() {
        return this.f68765x0.f68819x0.f68634E0;
    }

    @Override // p1140z1.AbstractC21668N
    /* JADX INFO: renamed from: h0 */
    public final InterfaceC21098s mo22120h0() {
        return this.f68762A0;
    }

    @Override // p1140z1.AbstractC21668N
    /* JADX INFO: renamed from: j0 */
    public final boolean mo22121j0() {
        return this.f68763B0 != null;
    }

    @Override // p1140z1.AbstractC21668N
    /* JADX INFO: renamed from: l0 */
    public final C21658D mo22122l0() {
        return this.f68765x0.f68819x0;
    }

    @Override // p1140z1.AbstractC21668N
    /* JADX INFO: renamed from: n0 */
    public final InterfaceC21058L mo22123n0() {
        InterfaceC21058L interfaceC21058L = this.f68763B0;
        if (interfaceC21058L != null) {
            return interfaceC21058L;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // p1140z1.AbstractC21668N
    /* JADX INFO: renamed from: p0 */
    public final AbstractC21668N mo22124p0() {
        AbstractC21678Y abstractC21678Y = this.f68765x0.f68821z0;
        if (abstractC21678Y != null) {
            return abstractC21678Y.mo22157H0();
        }
        return null;
    }

    @Override // p1140z1.AbstractC21668N
    /* JADX INFO: renamed from: q0 */
    public final long mo22125q0() {
        return this.f68766y0;
    }

    @Override // p1095x1.AbstractC21069X, p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: t */
    public final Object mo21534t() {
        return this.f68765x0.mo21534t();
    }

    @Override // p1140z1.AbstractC21668N
    /* JADX INFO: renamed from: u0 */
    public final void mo22126u0() {
        mo21551N(this.f68766y0, 0.0f, null);
    }

    /* JADX INFO: renamed from: y0 */
    public void mo22130y0() {
        mo22123n0().mo19806b();
    }

    /* JADX INFO: renamed from: z0 */
    public final void m22131z0(long j10) {
        if (!C7543h.m7880b(this.f68766y0, j10)) {
            this.f68766y0 = j10;
            AbstractC21678Y abstractC21678Y = this.f68765x0;
            C21663I c21663i = abstractC21678Y.f68819x0.m22060t().f68747s;
            if (c21663i != null) {
                c21663i.m22092g0();
            }
            AbstractC21668N.m22116s0(abstractC21678Y);
        }
        if (this.f68758t0) {
            return;
        }
        m22118e0(new C21695h0(mo22123n0(), this));
    }
}

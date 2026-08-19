package p860l0;

import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p025An.EnumC0573G;
import p1095x1.InterfaceC21098s;
import p1140z1.AbstractC21678Y;
import p1140z1.AbstractC21690f;
import p1140z1.InterfaceC21702l;
import p1140z1.InterfaceC21717v;
import p392Q0.C6546d;
import p492U1.C7545j;
import p523V9.AbstractC8088f6;
import p571X9.AbstractC9113C4;
import p635a1.AbstractC10458p;
import p759g1.C13800b;
import p759g1.C13801c;
import p759g1.C13803e;
import p784hb.C14437f;

/* JADX INFO: renamed from: l0.F */
/* JADX INFO: loaded from: classes.dex */
public final class C16672F extends AbstractC10458p implements InterfaceC21717v, InterfaceC21702l {

    /* JADX INFO: renamed from: A0 */
    public final C16757l1 f53391A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f53392B0;

    /* JADX INFO: renamed from: C0 */
    public InterfaceC16794y f53393C0;

    /* JADX INFO: renamed from: E0 */
    public InterfaceC21098s f53395E0;

    /* JADX INFO: renamed from: F0 */
    public C13801c f53396F0;

    /* JADX INFO: renamed from: G0 */
    public boolean f53397G0;

    /* JADX INFO: renamed from: I0 */
    public boolean f53399I0;

    /* JADX INFO: renamed from: z0 */
    public EnumC16673F0 f53400z0;

    /* JADX INFO: renamed from: D0 */
    public final C14437f f53394D0 = new C14437f(4);

    /* JADX INFO: renamed from: H0 */
    public long f53398H0 = 0;

    public C16672F(EnumC16673F0 enumC16673F0, C16757l1 c16757l1, boolean z6, InterfaceC16794y interfaceC16794y) {
        this.f53400z0 = enumC16673F0;
        this.f53391A0 = c16757l1;
        this.f53392B0 = z6;
        this.f53393C0 = interfaceC16794y;
    }

    /* JADX INFO: renamed from: K0 */
    public static final float m18496K0(C16672F c16672f, InterfaceC16794y interfaceC16794y) {
        C13801c c13801c;
        float fMo18556a;
        int iCompare;
        if (C7545j.m7886a(c16672f.f53398H0, 0L)) {
            return 0.0f;
        }
        C6546d c6546d = (C6546d) c16672f.f53394D0.f45413Y;
        int i10 = c6546d.f21184o0;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = c6546d.f21182Y;
            c13801c = null;
            do {
                C13801c c13801c2 = (C13801c) ((C16660B) objArr[i11]).f53358a.invoke();
                if (c13801c2 != null) {
                    long jM15319f = c13801c2.m15319f();
                    long jM9645c = AbstractC9113C4.m9645c(c16672f.f53398H0);
                    int iOrdinal = c16672f.f53400z0.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(C13803e.m15331c(jM15319f), C13803e.m15331c(jM9645c));
                    } else {
                        if (iOrdinal != 1) {
                            throw new C0644w();
                        }
                        iCompare = Float.compare(C13803e.m15333e(jM15319f), C13803e.m15333e(jM9645c));
                    }
                    if (iCompare > 0) {
                        if (c13801c != null) {
                            break;
                        }
                        c13801c = c13801c2;
                        break;
                    }
                    c13801c = c13801c2;
                    i11--;
                } else {
                    i11--;
                }
            } while (i11 >= 0);
        } else {
            c13801c = null;
        }
        if (c13801c == null) {
            C13801c c13801cM18497L0 = c16672f.f53397G0 ? c16672f.m18497L0() : null;
            if (c13801cM18497L0 == null) {
                return 0.0f;
            }
            c13801c = c13801cM18497L0;
        }
        long jM9645c2 = AbstractC9113C4.m9645c(c16672f.f53398H0);
        int iOrdinal2 = c16672f.f53400z0.ordinal();
        if (iOrdinal2 == 0) {
            float f10 = c13801c.f43589d;
            float f11 = c13801c.f43587b;
            fMo18556a = interfaceC16794y.mo18556a(f11, f10 - f11, C13803e.m15331c(jM9645c2));
        } else {
            if (iOrdinal2 != 1) {
                throw new C0644w();
            }
            float f12 = c13801c.f43588c;
            float f13 = c13801c.f43586a;
            fMo18556a = interfaceC16794y.mo18556a(f13, f12 - f13, C13803e.m15333e(jM9645c2));
        }
        return fMo18556a;
    }

    /* JADX INFO: renamed from: L0 */
    public final C13801c m18497L0() {
        if (!this.f30972y0) {
            return null;
        }
        AbstractC21678Y abstractC21678YM22216u = AbstractC21690f.m22216u(this);
        InterfaceC21098s interfaceC21098s = this.f53395E0;
        if (interfaceC21098s != null) {
            if (!interfaceC21098s.mo21522h()) {
                interfaceC21098s = null;
            }
            if (interfaceC21098s != null) {
                return abstractC21678YM22216u.mo21528y(interfaceC21098s, false);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: M0 */
    public final boolean m18498M0(long j10, C13801c c13801c) {
        long jM18500O0 = m18500O0(j10, c13801c);
        return Math.abs(C13800b.m15306g(jM18500O0)) <= 0.5f && Math.abs(C13800b.m15307h(jM18500O0)) <= 0.5f;
    }

    /* JADX INFO: renamed from: N0 */
    public final void m18499N0() {
        InterfaceC16794y interfaceC16794y = this.f53393C0;
        if (interfaceC16794y == null) {
            interfaceC16794y = (InterfaceC16794y) AbstractC21690f.m22204i(this, AbstractC16657A.f53355a);
        }
        if (this.f53399I0) {
            throw new IllegalStateException("launchAnimation called when previous animation was running");
        }
        AbstractC0575H.m1156D(m10935y0(), null, EnumC0573G.f1793p0, new C16669E(this, new C16698N1(interfaceC16794y.mo18557b()), interfaceC16794y, null), 1);
    }

    /* JADX INFO: renamed from: O0 */
    public final long m18500O0(long j10, C13801c c13801c) {
        long jM9645c = AbstractC9113C4.m9645c(j10);
        int iOrdinal = this.f53400z0.ordinal();
        if (iOrdinal == 0) {
            InterfaceC16794y interfaceC16794y = this.f53393C0;
            if (interfaceC16794y == null) {
                interfaceC16794y = (InterfaceC16794y) AbstractC21690f.m22204i(this, AbstractC16657A.f53355a);
            }
            float f10 = c13801c.f43589d;
            float f11 = c13801c.f43587b;
            return AbstractC8088f6.m8536b(0.0f, interfaceC16794y.mo18556a(f11, f10 - f11, C13803e.m15331c(jM9645c)));
        }
        if (iOrdinal != 1) {
            throw new C0644w();
        }
        InterfaceC16794y interfaceC16794y2 = this.f53393C0;
        if (interfaceC16794y2 == null) {
            interfaceC16794y2 = (InterfaceC16794y) AbstractC21690f.m22204i(this, AbstractC16657A.f53355a);
        }
        float f12 = c13801c.f43588c;
        float f13 = c13801c.f43586a;
        return AbstractC8088f6.m8536b(interfaceC16794y2.mo18556a(f13, f12 - f13, C13803e.m15333e(jM9645c)), 0.0f);
    }

    @Override // p1140z1.InterfaceC21717v
    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void mo11280l0(InterfaceC21098s interfaceC21098s) {
    }

    @Override // p1140z1.InterfaceC21717v
    /* JADX INFO: renamed from: q */
    public final void mo11281q(long j10) {
        int iM18096i;
        C13801c c13801cM18497L0;
        long j11 = this.f53398H0;
        this.f53398H0 = j10;
        int iOrdinal = this.f53400z0.ordinal();
        if (iOrdinal == 0) {
            iM18096i = AbstractC16544l.m18096i((int) (j10 & 4294967295L), (int) (4294967295L & j11));
        } else {
            if (iOrdinal != 1) {
                throw new C0644w();
            }
            iM18096i = AbstractC16544l.m18096i((int) (j10 >> 32), (int) (j11 >> 32));
        }
        if (iM18096i < 0 && (c13801cM18497L0 = m18497L0()) != null) {
            C13801c c13801c = this.f53396F0;
            if (c13801c == null) {
                c13801c = c13801cM18497L0;
            }
            if (!this.f53399I0 && !this.f53397G0 && m18498M0(j11, c13801c) && !m18498M0(j10, c13801cM18497L0)) {
                this.f53397G0 = true;
                m18499N0();
            }
            this.f53396F0 = c13801cM18497L0;
        }
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: z0 */
    public final boolean mo4774z0() {
        return false;
    }
}

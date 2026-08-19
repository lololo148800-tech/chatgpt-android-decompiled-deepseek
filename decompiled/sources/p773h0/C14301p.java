package p773h0;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import p025An.C0644w;
import p1140z1.AbstractC21690f;
import p1140z1.C21660F;
import p1140z1.InterfaceC21681a0;
import p1140z1.InterfaceC21708o;
import p437Rn.C6959q;
import p492U1.EnumC7546k;
import p523V9.AbstractC8072d6;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8112i6;
import p635a1.AbstractC10458p;
import p759g1.AbstractC13799a;
import p759g1.C13801c;
import p759g1.C13802d;
import p759g1.C13803e;
import p774h1.AbstractC14332J;
import p774h1.AbstractC14334L;
import p774h1.AbstractC14360p;
import p774h1.C14329G;
import p774h1.C14330H;
import p774h1.C14331I;
import p774h1.C14353i;
import p774h1.C14365u;
import p774h1.InterfaceC14339Q;
import p775h2.AbstractC14376f;
import p821j1.C16037b;
import p821j1.C16042g;

/* JADX INFO: renamed from: h0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C14301p extends AbstractC10458p implements InterfaceC21708o, InterfaceC21681a0 {

    /* JADX INFO: renamed from: A0 */
    public AbstractC14360p f44895A0;

    /* JADX INFO: renamed from: B0 */
    public float f44896B0;

    /* JADX INFO: renamed from: C0 */
    public InterfaceC14339Q f44897C0;

    /* JADX INFO: renamed from: D0 */
    public long f44898D0;

    /* JADX INFO: renamed from: E0 */
    public EnumC7546k f44899E0;

    /* JADX INFO: renamed from: F0 */
    public AbstractC14332J f44900F0;

    /* JADX INFO: renamed from: G0 */
    public InterfaceC14339Q f44901G0;

    /* JADX INFO: renamed from: z0 */
    public long f44902z0;

    @Override // p1140z1.InterfaceC21708o
    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void mo427L() {
    }

    @Override // p1140z1.InterfaceC21708o
    /* JADX INFO: renamed from: e */
    public final void mo430e(C21660F c21660f) {
        C14353i c14353i;
        if (this.f44897C0 == AbstractC14334L.f44973a) {
            if (!C14365u.m15775c(this.f44902z0, C14365u.f45060j)) {
                AbstractC14376f.m15850p(c21660f, this.f44902z0, 0L, 0L, 0.0f, 126);
            }
            AbstractC14360p abstractC14360p = this.f44895A0;
            if (abstractC14360p != null) {
                AbstractC14376f.m15849o(c21660f, abstractC14360p, 0L, 0L, this.f44896B0, null, 0, 118);
            }
        } else {
            C16525B c16525b = new C16525B();
            C16037b c16037b = c21660f.f68674Y;
            if (C13803e.m15330b(c16037b.f49479Z.m15202x(), this.f44898D0) && c21660f.getLayoutDirection() == this.f44899E0 && AbstractC16544l.m18089b(this.f44901G0, this.f44897C0)) {
                AbstractC14332J abstractC14332J = this.f44900F0;
                AbstractC16544l.m18091d(abstractC14332J);
                c16525b.f51262Y = abstractC14332J;
            } else {
                AbstractC21690f.m22214s(this, new C6959q(c16525b, this, c21660f, 23));
            }
            this.f44900F0 = (AbstractC14332J) c16525b.f51262Y;
            this.f44898D0 = c16037b.f49479Z.m15202x();
            this.f44899E0 = c21660f.getLayoutDirection();
            this.f44901G0 = this.f44897C0;
            Object obj = c16525b.f51262Y;
            AbstractC16544l.m18091d(obj);
            AbstractC14332J abstractC14332J2 = (AbstractC14332J) obj;
            if (!C14365u.m15775c(this.f44902z0, C14365u.f45060j)) {
                AbstractC14334L.m15637o(c21660f, abstractC14332J2, this.f44902z0);
            }
            AbstractC14360p abstractC14360p2 = this.f44895A0;
            if (abstractC14360p2 != null) {
                float f10 = this.f44896B0;
                C16042g c16042g = C16042g.f49483a;
                if (abstractC14332J2 instanceof C14330H) {
                    C13801c c13801c = ((C14330H) abstractC14332J2).f44970a;
                    c21660f.mo17599d0(abstractC14360p2, AbstractC8088f6.m8536b(c13801c.f43586a, c13801c.f43587b), AbstractC8112i6.m8603a(c13801c.m15321h(), c13801c.m15318e()), f10, c16042g, null, 3);
                } else {
                    if (abstractC14332J2 instanceof C14331I) {
                        C14331I c14331i = (C14331I) abstractC14332J2;
                        c14353i = c14331i.f44972b;
                        if (c14353i == null) {
                            C13802d c13802d = c14331i.f44971a;
                            float fM15297b = AbstractC13799a.m15297b(c13802d.f43597h);
                            c21660f.mo17592W(abstractC14360p2, AbstractC8088f6.m8536b(c13802d.f43590a, c13802d.f43591b), AbstractC8112i6.m8603a(c13802d.m15328b(), c13802d.m15327a()), AbstractC8072d6.m8484a(fM15297b, fM15297b), f10, c16042g, null, 3);
                        }
                    } else {
                        if (!(abstractC14332J2 instanceof C14329G)) {
                            throw new C0644w();
                        }
                        c14353i = ((C14329G) abstractC14332J2).f44969a;
                    }
                    c21660f.mo17603m(c14353i, abstractC14360p2, f10, c16042g, null, 3);
                }
            }
        }
        c21660f.m22080a();
    }

    @Override // p1140z1.InterfaceC21681a0
    /* JADX INFO: renamed from: j0 */
    public final void mo2488j0() {
        this.f44898D0 = 9205357640488583168L;
        this.f44899E0 = null;
        this.f44900F0 = null;
        this.f44901G0 = null;
        AbstractC21690f.m22209n(this);
    }
}

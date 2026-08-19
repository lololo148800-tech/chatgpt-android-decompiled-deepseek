package p773h0;

import mm.C17296C;
import p025An.AbstractC0575H;
import p1014t1.AbstractC19736m;
import p1014t1.C19729f;
import p1014t1.EnumC19730g;
import p1140z1.InterfaceC21697i0;
import p571X9.AbstractC9233X;
import p635a1.AbstractC10458p;
import p894n0.C17402h;
import p894n0.C17403i;
import p894n0.InterfaceC17406l;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: h0.U */
/* JADX INFO: loaded from: classes.dex */
public final class C14265U extends AbstractC10458p implements InterfaceC21697i0 {

    /* JADX INFO: renamed from: A0 */
    public C17402h f44765A0;

    /* JADX INFO: renamed from: z0 */
    public InterfaceC17406l f44766z0;

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: K0 */
    public static final Object m15558K0(C14265U c14265u, AbstractC19687c abstractC19687c) {
        C14261P c14261p;
        C17402h c17402h;
        c14265u.getClass();
        if (abstractC19687c instanceof C14261P) {
            c14261p = (C14261P) abstractC19687c;
            int i10 = c14261p.f44756q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c14261p.f44756q0 = i10 - Integer.MIN_VALUE;
            } else {
                c14261p = new C14261P(c14265u, abstractC19687c);
            }
        } else {
            c14261p = new C14261P(c14265u, abstractC19687c);
        }
        Object obj = c14261p.f44754o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c14261p.f44756q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            if (c14265u.f44765A0 == null) {
                c17402h = new C17402h();
                InterfaceC17406l interfaceC17406l = c14265u.f44766z0;
                c14261p.f44752Y = c14265u;
                c14261p.f44753Z = c17402h;
                c14261p.f44756q0 = 1;
                if (interfaceC17406l.mo7769c(c17402h, c14261p) == enumC19250a) {
                    return enumC19250a;
                }
            }
            return C17296C.f55119a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C17402h c17402h2 = c14261p.f44753Z;
        C14265U c14265u2 = c14261p.f44752Y;
        AbstractC9233X.m9807c(obj);
        c17402h = c17402h2;
        c14265u = c14265u2;
        c14265u.f44765A0 = c17402h;
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: L0 */
    public static final Object m15559L0(C14265U c14265u, AbstractC19687c abstractC19687c) {
        C14262Q c14262q;
        c14265u.getClass();
        if (abstractC19687c instanceof C14262Q) {
            c14262q = (C14262Q) abstractC19687c;
            int i10 = c14262q.f44760p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c14262q.f44760p0 = i10 - Integer.MIN_VALUE;
            } else {
                c14262q = new C14262Q(c14265u, abstractC19687c);
            }
        } else {
            c14262q = new C14262Q(c14265u, abstractC19687c);
        }
        Object obj = c14262q.f44758Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c14262q.f44760p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C17402h c17402h = c14265u.f44765A0;
            if (c17402h != null) {
                C17403i c17403i = new C17403i(c17402h);
                InterfaceC17406l interfaceC17406l = c14265u.f44766z0;
                c14262q.f44757Y = c14265u;
                c14262q.f44760p0 = 1;
                if (interfaceC17406l.mo7769c(c17403i, c14262q) == enumC19250a) {
                    return enumC19250a;
                }
            }
            return C17296C.f55119a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c14265u = c14262q.f44757Y;
        AbstractC9233X.m9807c(obj);
        c14265u.f44765A0 = null;
        return C17296C.f55119a;
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: C */
    public final void mo15560C(C19729f c19729f, EnumC19730g enumC19730g, long j10) {
        if (enumC19730g == EnumC19730g.f62466Z) {
            int i10 = c19729f.f62464e;
            if (AbstractC19736m.m20682d(i10, 4)) {
                AbstractC0575H.m1156D(m10935y0(), null, null, new C14263S(this, null), 3);
            } else if (AbstractC19736m.m20682d(i10, 5)) {
                AbstractC0575H.m1156D(m10935y0(), null, null, new C14264T(this, null), 3);
            }
        }
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: D */
    public final void mo15561D() {
        m15562M0();
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: D0 */
    public final void mo4226D0() {
        m15562M0();
    }

    /* JADX INFO: renamed from: M0 */
    public final void m15562M0() {
        C17402h c17402h = this.f44765A0;
        if (c17402h != null) {
            this.f44766z0.mo7767a(new C17403i(c17402h));
            this.f44765A0 = null;
        }
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void mo15563N() {
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: T */
    public final void mo15564T() {
        mo15561D();
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ boolean mo15565q0() {
        return false;
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: s0 */
    public final void mo15566s0() {
        mo15561D();
    }
}

package p860l0;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p077Cn.C1743k;
import p1014t1.AbstractC19744u;
import p1014t1.C19723A;
import p1014t1.C19729f;
import p1014t1.EnumC19730g;
import p1140z1.AbstractC21706n;
import p1140z1.InterfaceC21697i0;
import p1140z1.InterfaceC21702l;
import p571X9.AbstractC9233X;
import p894n0.C17395a;
import p894n0.C17396b;
import p894n0.C17397c;
import p894n0.InterfaceC17406l;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: l0.s0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16777s0 extends AbstractC21706n implements InterfaceC21697i0, InterfaceC21702l {

    /* JADX INFO: renamed from: B0 */
    public EnumC16673F0 f53839B0;

    /* JADX INFO: renamed from: C0 */
    public InterfaceC1436k f53840C0;

    /* JADX INFO: renamed from: D0 */
    public boolean f53841D0;

    /* JADX INFO: renamed from: E0 */
    public InterfaceC17406l f53842E0;

    /* JADX INFO: renamed from: F0 */
    public C1743k f53843F0;

    /* JADX INFO: renamed from: G0 */
    public C17396b f53844G0;

    /* JADX INFO: renamed from: H0 */
    public boolean f53845H0;

    /* JADX INFO: renamed from: I0 */
    public C19723A f53846I0;

    public AbstractC16777s0(InterfaceC1436k interfaceC1436k, boolean z6, InterfaceC17406l interfaceC17406l, EnumC16673F0 enumC16673F0) {
        this.f53839B0 = enumC16673F0;
        this.f53840C0 = interfaceC1436k;
        this.f53841D0 = z6;
        this.f53842E0 = interfaceC17406l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: N0 */
    public static final Object m18539N0(AbstractC16777s0 abstractC16777s0, AbstractC19687c abstractC19687c) {
        C16762n0 c16762n0;
        abstractC16777s0.getClass();
        if (abstractC19687c instanceof C16762n0) {
            c16762n0 = (C16762n0) abstractC19687c;
            int i10 = c16762n0.f53784p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16762n0.f53784p0 = i10 - Integer.MIN_VALUE;
            } else {
                c16762n0 = new C16762n0(abstractC16777s0, abstractC19687c);
            }
        } else {
            c16762n0 = new C16762n0(abstractC16777s0, abstractC19687c);
        }
        Object obj = c16762n0.f53782Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c16762n0.f53784p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C17396b c17396b = abstractC16777s0.f53844G0;
            if (c17396b != null) {
                InterfaceC17406l interfaceC17406l = abstractC16777s0.f53842E0;
                if (interfaceC17406l != null) {
                    C17395a c17395a = new C17395a(c17396b);
                    c16762n0.f53781Y = abstractC16777s0;
                    c16762n0.f53784p0 = 1;
                    if (interfaceC17406l.mo7769c(c17395a, c16762n0) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            }
            abstractC16777s0.mo18515T0(0L);
            return C17296C.f55119a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        abstractC16777s0 = c16762n0.f53781Y;
        AbstractC9233X.m9807c(obj);
        abstractC16777s0.f53844G0 = null;
        abstractC16777s0.mo18515T0(0L);
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: O0 */
    public static final Object m18540O0(AbstractC16777s0 abstractC16777s0, C16703Q c16703q, AbstractC19687c abstractC19687c) {
        C16765o0 c16765o0;
        InterfaceC17406l interfaceC17406l;
        C17396b c17396b;
        AbstractC16777s0 abstractC16777s1;
        C17396b c17396b2;
        abstractC16777s0.getClass();
        if (abstractC19687c instanceof C16765o0) {
            c16765o0 = (C16765o0) abstractC19687c;
            int i10 = c16765o0.f53798r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16765o0.f53798r0 = i10 - Integer.MIN_VALUE;
            } else {
                c16765o0 = new C16765o0(abstractC16777s0, abstractC19687c);
            }
        } else {
            c16765o0 = new C16765o0(abstractC16777s0, abstractC19687c);
        }
        Object obj = c16765o0.f53796p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c16765o0.f53798r0;
        if (i11 != 0) {
            if (i11 == 1) {
                c16703q = c16765o0.f53794Z;
                abstractC16777s0 = c16765o0.f53793Y;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c17396b2 = c16765o0.f53795o0;
                c16703q = c16765o0.f53794Z;
                abstractC16777s1 = c16765o0.f53793Y;
                AbstractC9233X.m9807c(obj);
            }
            c17396b = c17396b2;
            abstractC16777s0 = abstractC16777s1;
            abstractC16777s0.f53844G0 = c17396b;
            abstractC16777s0.mo18514S0(c16703q.f53515a);
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C17396b c17396b3 = abstractC16777s0.f53844G0;
        if (c17396b3 != null && (interfaceC17406l = abstractC16777s0.f53842E0) != null) {
            C17395a c17395a = new C17395a(c17396b3);
            c16765o0.f53793Y = abstractC16777s0;
            c16765o0.f53794Z = c16703q;
            c16765o0.f53798r0 = 1;
            if (interfaceC17406l.mo7769c(c17395a, c16765o0) == enumC19250a) {
                return enumC19250a;
            }
        }
        c17396b = new C17396b();
        InterfaceC17406l interfaceC17406l2 = abstractC16777s0.f53842E0;
        if (interfaceC17406l2 != null) {
            c16765o0.f53793Y = abstractC16777s0;
            c16765o0.f53794Z = c16703q;
            c16765o0.f53795o0 = c17396b;
            c16765o0.f53798r0 = 2;
            if (interfaceC17406l2.mo7769c(c17396b, c16765o0) == enumC19250a) {
                return enumC19250a;
            }
            abstractC16777s1 = abstractC16777s0;
            c17396b2 = c17396b;
            c17396b = c17396b2;
            abstractC16777s0 = abstractC16777s1;
        }
        abstractC16777s0.f53844G0 = c17396b;
        abstractC16777s0.mo18514S0(c16703q.f53515a);
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: P0 */
    public static final Object m18541P0(AbstractC16777s0 abstractC16777s0, C16706S c16706s, AbstractC19687c abstractC19687c) {
        C16768p0 c16768p0;
        abstractC16777s0.getClass();
        if (abstractC19687c instanceof C16768p0) {
            c16768p0 = (C16768p0) abstractC19687c;
            int i10 = c16768p0.f53809q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16768p0.f53809q0 = i10 - Integer.MIN_VALUE;
            } else {
                c16768p0 = new C16768p0(abstractC16777s0, abstractC19687c);
            }
        } else {
            c16768p0 = new C16768p0(abstractC16777s0, abstractC19687c);
        }
        Object obj = c16768p0.f53807o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c16768p0.f53809q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C17396b c17396b = abstractC16777s0.f53844G0;
            if (c17396b != null) {
                InterfaceC17406l interfaceC17406l = abstractC16777s0.f53842E0;
                if (interfaceC17406l != null) {
                    C17397c c17397c = new C17397c(c17396b);
                    c16768p0.f53805Y = abstractC16777s0;
                    c16768p0.f53806Z = c16706s;
                    c16768p0.f53809q0 = 1;
                    if (interfaceC17406l.mo7769c(c17397c, c16768p0) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            }
            abstractC16777s0.mo18515T0(c16706s.f53520a);
            return C17296C.f55119a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c16706s = c16768p0.f53806Z;
        abstractC16777s0 = c16768p0.f53805Y;
        AbstractC9233X.m9807c(obj);
        abstractC16777s0.f53844G0 = null;
        abstractC16777s0.mo18515T0(c16706s.f53520a);
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: C */
    public void mo15560C(C19729f c19729f, EnumC19730g enumC19730g, long j10) {
        if (this.f53841D0 && this.f53846I0 == null) {
            C19723A c19723aM20693a = AbstractC19744u.m20693a(new C16759m0(this, null));
            m22223K0(c19723aM20693a);
            this.f53846I0 = c19723aM20693a;
        }
        C19723A c19723a = this.f53846I0;
        if (c19723a != null) {
            c19723a.mo15560C(c19729f, enumC19730g, j10);
        }
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: D */
    public final void mo15561D() {
        C19723A c19723a = this.f53846I0;
        if (c19723a != null) {
            c19723a.mo15561D();
        }
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: D0 */
    public final void mo4226D0() {
        this.f53845H0 = false;
        m18542Q0();
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void mo15563N() {
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m18542Q0() {
        C17396b c17396b = this.f53844G0;
        if (c17396b != null) {
            InterfaceC17406l interfaceC17406l = this.f53842E0;
            if (interfaceC17406l != null) {
                interfaceC17406l.mo7767a(new C17395a(c17396b));
            }
            this.f53844G0 = null;
        }
    }

    /* JADX INFO: renamed from: R0 */
    public abstract Object mo18513R0(C16771q0 c16771q0, C16774r0 c16774r0);

    /* JADX INFO: renamed from: S0 */
    public abstract void mo18514S0(long j10);

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: T */
    public final void mo15564T() {
        mo15561D();
    }

    /* JADX INFO: renamed from: T0 */
    public abstract void mo18515T0(long j10);

    /* JADX INFO: renamed from: U0 */
    public abstract boolean mo18516U0();

    /* JADX INFO: renamed from: V0 */
    public final void m18543V0(InterfaceC1436k interfaceC1436k, boolean z6, InterfaceC17406l interfaceC17406l, EnumC16673F0 enumC16673F0, boolean z10) {
        C19723A c19723a;
        this.f53840C0 = interfaceC1436k;
        boolean z11 = true;
        if (this.f53841D0 != z6) {
            this.f53841D0 = z6;
            if (!z6) {
                m18542Q0();
                C19723A c19723a2 = this.f53846I0;
                if (c19723a2 != null) {
                    m22224L0(c19723a2);
                }
                this.f53846I0 = null;
            }
            z10 = true;
        }
        if (!AbstractC16544l.m18089b(this.f53842E0, interfaceC17406l)) {
            m18542Q0();
            this.f53842E0 = interfaceC17406l;
        }
        if (this.f53839B0 != enumC16673F0) {
            this.f53839B0 = enumC16673F0;
        } else {
            z11 = z10;
        }
        if (!z11 || (c19723a = this.f53846I0) == null) {
            return;
        }
        c19723a.m20669M0();
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

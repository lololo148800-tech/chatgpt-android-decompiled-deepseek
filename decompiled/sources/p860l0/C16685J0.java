package p860l0;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p275Kn.C4816c;
import p349O0.C5972Q;
import p492U1.InterfaceC7537b;
import p571X9.AbstractC9233X;
import p996rm.EnumC19250a;
import sc.C19531m;
import sc.C19532n;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: l0.J0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16685J0 implements InterfaceC7537b {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f53457Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC7537b f53458Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f53459o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f53460p0;

    /* JADX INFO: renamed from: q0 */
    public final C4816c f53461q0;

    public C16685J0(int i10, InterfaceC7537b density) {
        this.f53457Y = i10;
        switch (i10) {
            case 1:
                AbstractC16544l.m18094g(density, "density");
                this.f53458Z = density;
                this.f53461q0 = new C4816c(false);
                break;
            default:
                this.f53458Z = density;
                this.f53461q0 = new C4816c(false);
                break;
        }
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: F */
    public final long mo7859F(int i10) {
        switch (this.f53457Y) {
            case 0:
                break;
        }
        return this.f53458Z.mo7859F(i10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: J */
    public final long mo7860J(float f10) {
        switch (this.f53457Y) {
            case 0:
                break;
        }
        return this.f53458Z.mo7860J(f10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: O */
    public final float mo7861O(int i10) {
        switch (this.f53457Y) {
            case 0:
                break;
        }
        return this.f53458Z.mo7861O(i10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: P */
    public final float mo7862P(float f10) {
        switch (this.f53457Y) {
            case 0:
                break;
        }
        return this.f53458Z.mo7862P(f10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: X */
    public final float mo7863X() {
        switch (this.f53457Y) {
            case 0:
                break;
        }
        return this.f53458Z.mo7863X();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0067  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX INFO: renamed from: a */
    public final Object m18501a(AbstractC19687c abstractC19687c) {
        C16676G0 c16676g0;
        C19531m c19531m;
        switch (this.f53457Y) {
            case 0:
                if (abstractC19687c instanceof C16676G0) {
                    c16676g0 = (C16676G0) abstractC19687c;
                    int i10 = c16676g0.f53411o0;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c16676g0.f53411o0 = i10 - Integer.MIN_VALUE;
                    } else {
                        c16676g0 = new C16676G0(this, abstractC19687c);
                    }
                } else {
                    c16676g0 = new C16676G0(this, abstractC19687c);
                }
                Object objM18503c = c16676g0.f53409Y;
                Object obj = EnumC19250a.f61036Y;
                int i11 = c16676g0.f53411o0;
                if (i11 == 0) {
                    AbstractC9233X.m9807c(objM18503c);
                    c16676g0.f53411o0 = 1;
                    objM18503c = m18503c(c16676g0);
                    if (objM18503c == obj) {
                        return obj;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(objM18503c);
                }
                if (((Boolean) objM18503c).booleanValue()) {
                    return C17296C.f55119a;
                }
                throw new C5972Q("The press gesture was canceled.", 5);
            default:
                if (abstractC19687c instanceof C19531m) {
                    c19531m = (C19531m) abstractC19687c;
                    int i12 = c19531m.f62046o0;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c19531m.f62046o0 = i12 - Integer.MIN_VALUE;
                    } else {
                        c19531m = new C19531m(this, abstractC19687c);
                    }
                } else {
                    c19531m = new C19531m(this, abstractC19687c);
                }
                Object objM18503c2 = c19531m.f62044Y;
                Object obj2 = EnumC19250a.f61036Y;
                int i13 = c19531m.f62046o0;
                if (i13 == 0) {
                    AbstractC9233X.m9807c(objM18503c2);
                    c19531m.f62046o0 = 1;
                    objM18503c2 = m18503c(c19531m);
                    if (objM18503c2 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(objM18503c2);
                }
                if (((Boolean) objM18503c2).booleanValue()) {
                    return C17296C.f55119a;
                }
                throw new C5972Q("The press gesture was canceled.", 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m18502b(AbstractC19687c abstractC19687c) {
        C16679H0 c16679h0;
        C16685J0 c16685j0;
        if (abstractC19687c instanceof C16679H0) {
            c16679h0 = (C16679H0) abstractC19687c;
            int i10 = c16679h0.f53425p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16679h0.f53425p0 = i10 - Integer.MIN_VALUE;
            } else {
                c16679h0 = new C16679H0(this, abstractC19687c);
            }
        } else {
            c16679h0 = new C16679H0(this, abstractC19687c);
        }
        Object obj = c16679h0.f53423Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c16679h0.f53425p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            c16679h0.f53422Y = this;
            c16679h0.f53425p0 = 1;
            if (this.f53461q0.m5448e(null, c16679h0) == enumC19250a) {
                return enumC19250a;
            }
            c16685j0 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c16685j0 = c16679h0.f53422Y;
            AbstractC9233X.m9807c(obj);
        }
        c16685j0.f53459o0 = false;
        c16685j0.f53460p0 = false;
        return C17296C.f55119a;
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: b0 */
    public final float mo7864b0(float f10) {
        switch (this.f53457Y) {
            case 0:
                break;
        }
        return this.f53458Z.mo7864b0(f10);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX INFO: renamed from: c */
    public final Object m18503c(AbstractC19687c abstractC19687c) {
        C16682I0 c16682i0;
        C16685J0 c16685j0;
        C19532n c19532n;
        C16685J0 c16685j1;
        switch (this.f53457Y) {
            case 0:
                if (abstractC19687c instanceof C16682I0) {
                    c16682i0 = (C16682I0) abstractC19687c;
                    int i10 = c16682i0.f53447p0;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c16682i0.f53447p0 = i10 - Integer.MIN_VALUE;
                    } else {
                        c16682i0 = new C16682I0(this, abstractC19687c);
                    }
                } else {
                    c16682i0 = new C16682I0(this, abstractC19687c);
                }
                Object obj = c16682i0.f53445Z;
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i11 = c16682i0.f53447p0;
                if (i11 == 0) {
                    AbstractC9233X.m9807c(obj);
                    if (this.f53459o0 || this.f53460p0) {
                        c16685j0 = this;
                    } else {
                        c16682i0.f53444Y = this;
                        c16682i0.f53447p0 = 1;
                        if (this.f53461q0.m5448e(null, c16682i0) == enumC19250a) {
                            return enumC19250a;
                        }
                        c16685j0 = this;
                    }
                    return Boolean.valueOf(c16685j0.f53459o0);
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c16685j0 = c16682i0.f53444Y;
                AbstractC9233X.m9807c(obj);
                c16685j0.f53461q0.m5450g(null);
                return Boolean.valueOf(c16685j0.f53459o0);
            default:
                if (abstractC19687c instanceof C19532n) {
                    c19532n = (C19532n) abstractC19687c;
                    int i12 = c19532n.f62050p0;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c19532n.f62050p0 = i12 - Integer.MIN_VALUE;
                    } else {
                        c19532n = new C19532n(this, abstractC19687c);
                    }
                } else {
                    c19532n = new C19532n(this, abstractC19687c);
                }
                Object obj2 = c19532n.f62048Z;
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                int i13 = c19532n.f62050p0;
                if (i13 == 0) {
                    AbstractC9233X.m9807c(obj2);
                    if (!this.f53459o0 && !this.f53460p0) {
                        c19532n.f62047Y = this;
                        c19532n.f62050p0 = 1;
                        if (this.f53461q0.m5448e(null, c19532n) == enumC19250a2) {
                            return enumC19250a2;
                        }
                    }
                    c16685j1 = this;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c16685j1 = c19532n.f62047Y;
                    AbstractC9233X.m9807c(obj2);
                }
                return Boolean.valueOf(c16685j1.f53459o0);
        }
    }

    @Override // p492U1.InterfaceC7537b
    public final float getDensity() {
        switch (this.f53457Y) {
            case 0:
                break;
        }
        return this.f53458Z.getDensity();
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: i0 */
    public final int mo7865i0(long j10) {
        switch (this.f53457Y) {
            case 0:
                break;
        }
        return this.f53458Z.mo7865i0(j10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: k0 */
    public final int mo7866k0(float f10) {
        switch (this.f53457Y) {
            case 0:
                break;
        }
        return this.f53458Z.mo7866k0(f10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: r0 */
    public final long mo7867r0(long j10) {
        switch (this.f53457Y) {
            case 0:
                break;
        }
        return this.f53458Z.mo7867r0(j10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: s */
    public final long mo7868s(long j10) {
        switch (this.f53457Y) {
            case 0:
                break;
        }
        return this.f53458Z.mo7868s(j10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: t0 */
    public final float mo7869t0(long j10) {
        switch (this.f53457Y) {
            case 0:
                break;
        }
        return this.f53458Z.mo7869t0(j10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: w */
    public final float mo7870w(long j10) {
        switch (this.f53457Y) {
            case 0:
                break;
        }
        return this.f53458Z.mo7870w(j10);
    }
}

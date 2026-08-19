package p278L0;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.EnumC0573G;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1014t1.AbstractC19736m;
import p1014t1.C19731h;
import p1014t1.C19738o;
import p1014t1.C19748y;
import p1014t1.EnumC19730g;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p103Dn.InterfaceC2213w0;
import p229J0.C3899D4;
import p571X9.AbstractC9233X;
import p860l0.AbstractC16689K1;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: L0.C */
/* JADX INFO: loaded from: classes.dex */
public final class C4839C extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public InterfaceC2213w0 f15749Z;

    /* JADX INFO: renamed from: o0 */
    public EnumC19730g f15750o0;

    /* JADX INFO: renamed from: p0 */
    public long f15751p0;

    /* JADX INFO: renamed from: q0 */
    public int f15752q0;

    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ Object f15753r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC0571F f15754s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C3899D4 f15755t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4839C(InterfaceC0571F interfaceC0571F, C3899D4 c3899d4, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15754s0 = interfaceC0571F;
        this.f15755t0 = c3899d4;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4839C c4839c = new C4839C(this.f15754s0, this.f15755t0, interfaceC18770c);
        c4839c.f15753r0 = obj;
        return c4839c;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4839C) create((C19748y) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ca A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #3 {all -> 0x0019, blocks: (B:8:0x0014, B:41:0x00c6, B:43:0x00ca), top: B:52:0x0014 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [Dn.v0] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [Dn.v0] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9, types: [Dn.w0] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5, types: [Dn.w0] */
    /* JADX WARN: Type inference failed for: r1v6, types: [Dn.w0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3, types: [Dn.v0] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r6;
        EnumC19730g enumC19730g;
        C19748y c19748y;
        long j10;
        ?? r10;
        C19738o c19738o;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        ?? r11 = this.f15752q0;
        try {
            if (r11 == 0) {
                AbstractC9233X.m9807c(obj);
                C19748y c19748y2 = (C19748y) this.f15753r0;
                C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(Boolean.FALSE);
                long jMo499b = c19748y2.m20697d().mo499b();
                enumC19730g = EnumC19730g.f62465Y;
                this.f15753r0 = c19748y2;
                this.f15749Z = c2153q0M3204c;
                this.f15750o0 = enumC19730g;
                this.f15751p0 = jMo499b;
                this.f15752q0 = 1;
                Object objM18506c = AbstractC16689K1.m18506c(c19748y2, enumC19730g, this, 1);
                if (objM18506c == enumC19250a) {
                    return enumC19250a;
                }
                c19748y = c19748y2;
                obj = objM18506c;
                j10 = jMo499b;
                r11 = c2153q0M3204c;
            } else {
                if (r11 != 1) {
                    if (r11 != 2) {
                        if (r11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r6 = (InterfaceC2213w0) this.f15753r0;
                        try {
                            AbstractC9233X.m9807c(obj);
                            r6 = r6;
                            c19738o = (C19738o) obj;
                            if (c19738o != null) {
                                c19738o.m20691a();
                            }
                            r6.mo3231f(Boolean.FALSE);
                            return C17296C.f55119a;
                        } catch (Throwable th2) {
                            th = th2;
                            r6.mo3231f(Boolean.FALSE);
                            throw th;
                        }
                    }
                    EnumC19730g enumC19730g2 = this.f15750o0;
                    InterfaceC2213w0 interfaceC2213w0 = this.f15749Z;
                    c19748y = (C19748y) this.f15753r0;
                    try {
                        AbstractC9233X.m9807c(obj);
                        r10 = interfaceC2213w0;
                        r10.mo3231f(Boolean.FALSE);
                    } catch (C19731h unused) {
                        enumC19730g = enumC19730g2;
                        r11 = interfaceC2213w0;
                        AbstractC0575H.m1156D(this.f15754s0, null, EnumC0573G.f1793p0, new C4838B(r11, this.f15755t0, null), 1);
                        this.f15753r0 = r11;
                        this.f15749Z = null;
                        this.f15750o0 = null;
                        this.f15752q0 = 3;
                        obj = AbstractC16689K1.m18509f(c19748y, enumC19730g, this);
                        if (obj == enumC19250a) {
                            return enumC19250a;
                        }
                        r6 = r11;
                        c19738o = (C19738o) obj;
                        if (c19738o != null) {
                            c19738o.m20691a();
                        }
                        r6.mo3231f(Boolean.FALSE);
                    } catch (Throwable th3) {
                        th = th3;
                        r6 = interfaceC2213w0;
                        r6.mo3231f(Boolean.FALSE);
                        throw th;
                    }
                    return C17296C.f55119a;
                }
                long j11 = this.f15751p0;
                EnumC19730g enumC19730g3 = this.f15750o0;
                InterfaceC2213w0 interfaceC2213w1 = this.f15749Z;
                C19748y c19748y3 = (C19748y) this.f15753r0;
                AbstractC9233X.m9807c(obj);
                enumC19730g = enumC19730g3;
                r11 = interfaceC2213w1;
                c19748y = c19748y3;
                j10 = j11;
            }
            int i10 = ((C19738o) obj).f62486i;
            if (AbstractC19736m.m20683e(i10, 1) || AbstractC19736m.m20683e(i10, 3)) {
                try {
                    C4899z c4899z = new C4899z(enumC19730g, null);
                    this.f15753r0 = c19748y;
                    this.f15749Z = r11;
                    this.f15750o0 = enumC19730g;
                    this.f15752q0 = 2;
                    if (c19748y.m20698e(j10, c4899z, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    r10 = r11;
                    r10.mo3231f(Boolean.FALSE);
                } catch (C19731h unused2) {
                    AbstractC0575H.m1156D(this.f15754s0, null, EnumC0573G.f1793p0, new C4838B(r11, this.f15755t0, null), 1);
                    this.f15753r0 = r11;
                    this.f15749Z = null;
                    this.f15750o0 = null;
                    this.f15752q0 = 3;
                    obj = AbstractC16689K1.m18509f(c19748y, enumC19730g, this);
                    if (obj == enumC19250a) {
                        return enumC19250a;
                    }
                    r6 = r11;
                    c19738o = (C19738o) obj;
                    if (c19738o != null) {
                        c19738o.m20691a();
                    }
                    r6.mo3231f(Boolean.FALSE);
                }
            }
            return C17296C.f55119a;
        } catch (Throwable th4) {
            th = th4;
            r6 = r11;
        }
    }
}

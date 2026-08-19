package p080D0;

import mm.C17296C;
import p002A0.C0138o;
import p002A0.C0139p;
import p013Ab.C0420b;
import p049Bm.InterfaceC1439n;
import p1014t1.C19729f;
import p1014t1.C19738o;
import p1014t1.C19748y;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: D0.H */
/* JADX INFO: loaded from: classes.dex */
public final class C1774H extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public int f5066Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f5067o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C0420b f5068p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C0138o f5069q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C0139p f5070r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1774H(C0420b c0420b, C0138o c0138o, C0139p c0139p, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f5068p0 = c0420b;
        this.f5069q0 = c0138o;
        this.f5070r0 = c0139p;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C1774H c1774h = new C1774H(this.f5068p0, this.f5069q0, this.f5070r0, interfaceC18770c);
        c1774h.f5067o0 = obj;
        return c1774h;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1774H) create((C19748y) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:37:0x0092 A[RETURN] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.List] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C19748y c19748y;
        int i10;
        C0139p c0139p;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = this.f5066Z;
        if (i11 != 0) {
            if (i11 == 1) {
                c19748y = (C19748y) this.f5067o0;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i11 != 2 && i11 != 3 && i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        c19748y = (C19748y) this.f5067o0;
        this.f5067o0 = c19748y;
        this.f5066Z = 1;
        obj = AbstractC1807h0.m2621j(c19748y, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        C19729f c19729f = (C19729f) obj;
        C0420b c0420b = this.f5068p0;
        c0420b.m1043F(c19729f);
        boolean zM2608C = AbstractC1807h0.m2608C(c19729f);
        if (zM2608C && (c19729f.f62462c & 33) != 0) {
            ?? r10 = c19729f.f62460a;
            int size = r10.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    this.f5067o0 = null;
                    this.f5066Z = 2;
                    if (AbstractC1807h0.m2623l(c19748y, this.f5069q0, c0420b, c19729f, this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    if (((C19738o) r10.get(i12)).m20692b()) {
                        break;
                    }
                    i12++;
                }
            }
            if (!zM2608C) {
                i10 = c0420b.f1381Z;
                c0139p = this.f5070r0;
                if (i10 == 1) {
                    this.f5067o0 = null;
                    this.f5066Z = 3;
                    if (AbstractC1807h0.m2625n(c19748y, c0139p, c19729f, this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    this.f5067o0 = null;
                    this.f5066Z = 4;
                    if (AbstractC1807h0.m2626o(c19748y, c0139p, c19729f, this) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            }
        } else if (!zM2608C) {
            i10 = c0420b.f1381Z;
            c0139p = this.f5070r0;
            if (i10 == 1) {
                this.f5067o0 = null;
                this.f5066Z = 3;
                if (AbstractC1807h0.m2625n(c19748y, c0139p, c19729f, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                this.f5067o0 = null;
                this.f5066Z = 4;
                if (AbstractC1807h0.m2626o(c19748y, c0139p, c19729f, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
        }
        return C17296C.f55119a;
    }
}

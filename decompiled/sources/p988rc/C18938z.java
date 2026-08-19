package p988rc;

import kotlin.jvm.internal.C16556x;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p204I1.C3590f;
import p229J0.C4041e;
import p349O0.InterfaceC5985X;
import p530Vi.AbstractC8301I;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9306j0;
import p586Y0.C9569u;
import p758g0.AbstractC13758e;
import p758g0.C13756d;
import p758g0.C13781p0;
import p909nm.AbstractC17680n;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sc.C19530l;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: rc.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C18938z extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f60446Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f60447Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f60448o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f60449p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC5985X f60450q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C18918f f60451r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C9569u f60452s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ int f60453t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18938z(InterfaceC5985X interfaceC5985X, InterfaceC5985X interfaceC5985X2, boolean z6, InterfaceC5985X interfaceC5985X3, C18918f c18918f, C9569u c9569u, int i10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f60447Z = interfaceC5985X;
        this.f60448o0 = interfaceC5985X2;
        this.f60449p0 = z6;
        this.f60450q0 = interfaceC5985X3;
        this.f60451r0 = c18918f;
        this.f60452s0 = c9569u;
        this.f60453t0 = i10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C18938z(this.f60447Z, this.f60448o0, this.f60449p0, this.f60450q0, this.f60451r0, this.f60452s0, this.f60453t0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C18938z) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f60446Y;
        int i11 = this.f60453t0;
        C9569u c9569u = this.f60452s0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19530l c19530l = (C19530l) this.f60448o0.getValue();
            C3590f c3590fSubSequence = c19530l.f62041a;
            if (this.f60449p0) {
                int length = c3590fSubSequence.f10934Y.length();
                Integer num = (Integer) AbstractC17680n.m19353c0(c19530l.f62042b);
                int iIntValue = num != null ? num.intValue() : c3590fSubSequence.f10934Y.length();
                if (length > iIntValue) {
                    length = iIntValue;
                }
                c3590fSubSequence = c3590fSubSequence.subSequence(0, length);
            }
            this.f60447Z.setValue(c3590fSubSequence);
            InterfaceC5985X interfaceC5985X = this.f60450q0;
            C18916d c18916d = (C18916d) interfaceC5985X.getValue();
            c18916d.getClass();
            C18918f c18918f = this.f60451r0;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = c18916d.f60358a;
            long j11 = j10 - jCurrentTimeMillis;
            long jPow = 0;
            if (j10 > 0) {
                int i12 = c18918f.f60367d;
                if (j11 < (-i12)) {
                    jPow = 0;
                } else if (j11 <= 0) {
                    jPow = ((long) i12) - j11;
                } else {
                    double d10 = i12;
                    jPow = ((long) (Math.pow(d10 / j11, c18918f.f60368e) * d10)) + j11;
                }
            }
            StringBuilder sbM9894m = AbstractC9306j0.m9894m("Calculated delay: ", jPow, " now: ");
            sbM9894m.append(jCurrentTimeMillis);
            sbM9894m.append(" last: ");
            sbM9894m.append(j10);
            sbM9894m.append(" diff: ");
            sbM9894m.append(j11);
            System.out.println((Object) sbM9894m.toString());
            interfaceC5985X.setValue(new C18916d(System.currentTimeMillis() + jPow));
            C16556x c16556x = new C16556x();
            C13756d c13756dM15236a = AbstractC13758e.m15236a(0.0f);
            Float f10 = new Float(1.0f);
            C13781p0 c13781p0M15255t = AbstractC13758e.m15255t(c18918f.f60365b, (int) AbstractC8301I.m8916g(((C18916d) interfaceC5985X.getValue()).f60358a - System.currentTimeMillis(), 0L), null, 4);
            C4041e c4041e = new C4041e(c16556x, c18918f, c9569u, i11, 6);
            this.f60446Y = 1;
            if (C13756d.m15222c(c13756dM15236a, f10, c13781p0M15255t, c4041e, this, 4) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            i11 = i11;
        }
        c9569u.remove(new Integer(i11));
        return C17296C.f55119a;
    }
}

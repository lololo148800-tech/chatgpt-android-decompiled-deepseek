package p1000s0;

import kotlin.jvm.internal.C16557y;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p482Tg.C7443a0;
import p571X9.AbstractC9233X;
import p594Y9.C9895g4;
import p758g0.AbstractC13758e;
import p758g0.InterfaceC13772l;
import p860l0.InterfaceC16694M0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import ph.C18416d;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: s0.I */
/* JADX INFO: loaded from: classes.dex */
public final class C19400I extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f61464Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f61465Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C7443a0 f61466o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f61467p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C9895g4 f61468q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ float f61469r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC13772l f61470s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19400I(C7443a0 c7443a0, int i10, C9895g4 c9895g4, float f10, InterfaceC13772l interfaceC13772l, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f61466o0 = c7443a0;
        this.f61467p0 = i10;
        this.f61468q0 = c9895g4;
        this.f61469r0 = f10;
        this.f61470s0 = interfaceC13772l;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C19400I c19400i = new C19400I(this.f61466o0, this.f61467p0, this.f61468q0, this.f61469r0, this.f61470s0, interfaceC18770c);
        c19400i.f61465Z = obj;
        return c19400i;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C19400I) create((InterfaceC16694M0) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        int i10;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = this.f61464Y;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC16694M0 interfaceC16694M0 = (InterfaceC16694M0) this.f61465Z;
            int i12 = this.f61467p0;
            this.f61466o0.invoke(interfaceC16694M0, new Integer(i12));
            C9895g4 c9895g4 = this.f61468q0;
            boolean z6 = i12 > ((AbstractC19397F) c9895g4.f29409Y).f61441d;
            int iMo10218n = c9895g4.mo10218n();
            AbstractC19397F abstractC19397F = (AbstractC19397F) c9895g4.f29409Y;
            int i13 = (iMo10218n - abstractC19397F.f61441d) + 1;
            if (((z6 && i12 > c9895g4.mo10218n()) || (!z6 && i12 < abstractC19397F.f61441d)) && Math.abs(i12 - abstractC19397F.f61441d) >= 3) {
                int i14 = z6 ? i10 : i10;
                c9895g4.mo10222w(i14, 0);
            }
            float fMo10196G = c9895g4.mo10196G(i12) + this.f61469r0;
            C18416d c18416d = new C18416d(new C16557y(), 8, interfaceC16694M0);
            this.f61464Y = 1;
            if (AbstractC13758e.m15240e(0.0f, fMo10196G, this.f61470s0, c18416d, this, 4) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}

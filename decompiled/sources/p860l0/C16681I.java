package p860l0;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C16557y;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p045Bj.C1307e;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p758g0.AbstractC13758e;
import p758g0.C13774m;
import p758g0.C13796x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.I */
/* JADX INFO: loaded from: classes.dex */
public final class C16681I extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C16557y f53438Y;

    /* JADX INFO: renamed from: Z */
    public C13774m f53439Z;

    /* JADX INFO: renamed from: o0 */
    public int f53440o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ float f53441p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C16684J f53442q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC16694M0 f53443r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16681I(float f10, C16684J c16684j, InterfaceC16694M0 interfaceC16694M0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53441p0 = f10;
        this.f53442q0 = c16684j;
        this.f53443r0 = interfaceC16694M0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16681I(this.f53441p0, this.f53442q0, this.f53443r0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16681I) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        float f10;
        C16557y c16557y;
        C13774m c13774m;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53440o0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            f10 = this.f53441p0;
            if (Math.abs(f10) > 1.0f) {
                c16557y = new C16557y();
                c16557y.f51286Y = f10;
                C16557y c16557y2 = new C16557y();
                C13774m c13774mM15237b = AbstractC13758e.m15237b(0.0f, f10, 28);
                try {
                    C16684J c16684j = this.f53442q0;
                    C13796x c13796x = c16684j.f53455a;
                    C1307e c1307e = new C1307e(c16557y2, this.f53443r0, c16557y, c16684j, 27);
                    this.f53438Y = c16557y;
                    this.f53439Z = c13774mM15237b;
                    this.f53440o0 = 1;
                    if (AbstractC13758e.m15241f(c13774mM15237b, c13796x, false, c1307e, this) == enumC19250a) {
                        return enumC19250a;
                    }
                } catch (CancellationException unused) {
                    c13774m = c13774mM15237b;
                    c16557y.f51286Y = ((Number) c13774m.m15282c()).floatValue();
                }
                f10 = c16557y.f51286Y;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c13774m = this.f53439Z;
            c16557y = this.f53438Y;
            try {
                AbstractC9233X.m9807c(obj);
            } catch (CancellationException unused2) {
                c16557y.f51286Y = ((Number) c13774m.m15282c()).floatValue();
            }
            f10 = c16557y.f51286Y;
        }
        return new Float(f10);
    }
}

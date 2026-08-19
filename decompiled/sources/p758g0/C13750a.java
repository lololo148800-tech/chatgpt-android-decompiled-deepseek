package p758g0;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C16556x;
import mm.C17296C;
import p045Bj.C1307e;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: g0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13750a extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public C13774m f43365Y;

    /* JADX INFO: renamed from: Z */
    public C16556x f43366Z;

    /* JADX INFO: renamed from: o0 */
    public int f43367o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13756d f43368p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f43369q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC13766i f43370r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ long f43371s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ InterfaceC1436k f43372t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13750a(C13756d c13756d, Object obj, InterfaceC13766i interfaceC13766i, long j10, InterfaceC1436k interfaceC1436k, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f43368p0 = c13756d;
        this.f43369q0 = obj;
        this.f43370r0 = interfaceC13766i;
        this.f43371s0 = j10;
        this.f43372t0 = interfaceC1436k;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C13750a(this.f43368p0, this.f43369q0, this.f43370r0, this.f43371s0, this.f43372t0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C13750a) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C16556x c16556x;
        C13774m c13774m;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f43367o0;
        int i11 = 1;
        C13756d c13756d = this.f43368p0;
        try {
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                c13756d.f43411c.f43503o0 = (AbstractC13784r) c13756d.f43409a.f43526a.invoke(this.f43369q0);
                InterfaceC13766i interfaceC13766i = this.f43370r0;
                c13756d.f43413e.setValue(interfaceC13766i.mo15235j());
                c13756d.f43412d.setValue(Boolean.TRUE);
                C13774m c13774m2 = c13756d.f43411c;
                C13774m c13774m3 = new C13774m(c13774m2.f43501Y, c13774m2.f43502Z.getValue(), AbstractC13758e.m15247l(c13774m2.f43503o0), c13774m2.f43504p0, Long.MIN_VALUE, c13774m2.f43506r0);
                C16556x c16556x2 = new C16556x();
                long j10 = this.f43371s0;
                C1307e c1307e = new C1307e(c13756d, c13774m3, this.f43372t0, c16556x2, 21);
                this.f43365Y = c13774m3;
                this.f43366Z = c16556x2;
                this.f43367o0 = 1;
                if (AbstractC13758e.m15239d(c13774m3, interfaceC13766i, j10, c1307e, this) == enumC19250a) {
                    return enumC19250a;
                }
                c16556x = c16556x2;
                c13774m = c13774m3;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c16556x = this.f43366Z;
                c13774m = this.f43365Y;
                AbstractC9233X.m9807c(obj);
            }
            if (!c16556x.f51285Y) {
                i11 = 2;
            }
            C13756d.m15220a(c13756d);
            return new C13768j(i11, c13774m);
        } catch (CancellationException e10) {
            C13756d.m15220a(c13756d);
            throw e10;
        }
    }
}

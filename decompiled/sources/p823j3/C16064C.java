package p823j3;

import android.content.Context;
import java.util.concurrent.CancellationException;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p349O0.C6029t;
import p349O0.C6032u0;
import p537W0.C8410b;
import p571X9.AbstractC9233X;
import p672c3.C11613k;
import p672c3.C11617m;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: j3.C */
/* JADX INFO: loaded from: classes.dex */
public final class C16064C extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public Throwable f49729Y;

    /* JADX INFO: renamed from: Z */
    public int f49730Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6029t f49731o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C11617m f49732p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Context f49733q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C6032u0 f49734r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C16075N f49735s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16064C(C6029t c6029t, C11617m c11617m, Context context, C6032u0 c6032u0, C16075N c16075n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f49731o0 = c6029t;
        this.f49732p0 = c11617m;
        this.f49733q0 = context;
        this.f49734r0 = c6032u0;
        this.f49735s0 = c16075n;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16064C(this.f49731o0, this.f49732p0, this.f49733q0, this.f49734r0, this.f49735s0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16064C) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f49730Z;
        C17296C c17296c = C17296C.f55119a;
        Context context = this.f49733q0;
        C11617m c11617m = this.f49732p0;
        try {
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C6029t c6029t = this.f49731o0;
                c11617m.getClass();
                c6029t.m6573j(new C8410b(new C11613k(context, c11617m), true, -1784282257));
                C6032u0 c6032u0 = this.f49734r0;
                this.f49730Z = 1;
                if (c6032u0.m6606J(this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th2 = this.f49729Y;
                    AbstractC9233X.m9807c(obj);
                    AbstractC0575H.m1180i(this.f49735s0, AbstractC0575H.m1172a("Error in recomposition coroutine", th2));
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj);
            }
        } catch (CancellationException unused) {
        } catch (Throwable th3) {
            this.f49729Y = th3;
            this.f49730Z = 2;
            c11617m.m12990a(context, th3);
            if (c17296c == enumC19250a) {
                return enumC19250a;
            }
            th2 = th3;
        }
        return c17296c;
    }
}

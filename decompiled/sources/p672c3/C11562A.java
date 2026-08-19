package p672c3;

import android.content.BroadcastReceiver;
import io.sentry.android.core.AbstractC15256t;
import java.util.concurrent.CancellationException;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p153Fn.C2925c;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: c3.A */
/* JADX INFO: loaded from: classes.dex */
public final class C11562A extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f34959Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f34960Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC19694j f34961o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C2925c f34962p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ BroadcastReceiver.PendingResult f34963q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C11562A(InterfaceC1439n interfaceC1439n, C2925c c2925c, BroadcastReceiver.PendingResult pendingResult, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f34961o0 = (AbstractC19694j) interfaceC1439n;
        this.f34962p0 = c2925c;
        this.f34963q0 = pendingResult;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C11562A c11562a = new C11562A(this.f34961o0, this.f34962p0, this.f34963q0, interfaceC18770c);
        c11562a.f34960Z = obj;
        return c11562a;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11562A) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f34959Y;
        C2925c c2925c = this.f34962p0;
        BroadcastReceiver.PendingResult pendingResult = this.f34963q0;
        try {
            try {
                if (i10 != 0) {
                    try {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9233X.m9807c(obj);
                    } catch (Throwable th2) {
                        AbstractC0575H.m1180i(c2925c, null);
                        throw th2;
                    }
                } else {
                    AbstractC9233X.m9807c(obj);
                    InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f34960Z;
                    ?? r6 = this.f34961o0;
                    this.f34959Y = 1;
                    if (r6.invoke(interfaceC0571F, this) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            } catch (Throwable th3) {
                try {
                    pendingResult.finish();
                } catch (IllegalStateException e10) {
                    AbstractC15256t.m16466d("GlanceAppWidget", "Error thrown when trying to finish broadcast", e10);
                }
                throw th3;
            }
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th4) {
            AbstractC15256t.m16466d("GlanceAppWidget", "BroadcastReceiver execution failed", th4);
        }
        AbstractC0575H.m1180i(c2925c, null);
        try {
            pendingResult.finish();
        } catch (IllegalStateException e12) {
            AbstractC15256t.m16466d("GlanceAppWidget", "Error thrown when trying to finish broadcast", e12);
        }
        return C17296C.f55119a;
    }
}

package p823j3;

import android.content.Context;
import androidx.glance.session.SessionWorker;
import io.sentry.android.core.AbstractC15256t;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0647x0;
import p049Bm.InterfaceC1436k;
import p444S4.C7001g;
import p444S4.C7008n;
import p544W9.AbstractC8513L3;
import p571X9.AbstractC9233X;
import p672c3.C11617m;
import p722e8.C13298H;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: j3.y */
/* JADX INFO: loaded from: classes.dex */
public final class C16103y extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public Object f49876Y;

    /* JADX INFO: renamed from: Z */
    public int f49877Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ SessionWorker f49878o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16075N f49879p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16103y(SessionWorker sessionWorker, C16075N c16075n, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f49878o0 = sessionWorker;
        this.f49879p0 = c16075n;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C16103y(this.f49878o0, this.f49879p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C16103y) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00bb A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v8, types: [c3.m] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v3, types: [Bm.n, j3.w] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C11617m c11617m;
        C0647x0 c0647x0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        C11617m c11617m2 = this.f49877Z;
        int c16101w = 4;
        SessionWorker sessionWorker = this.f49878o0;
        try {
            if (c11617m2 != 0) {
                if (c11617m2 == 1) {
                    AbstractC9233X.m9807c(obj);
                } else if (c11617m2 == 2) {
                    C11617m c11617m3 = (C11617m) this.f49876Y;
                    AbstractC9233X.m9807c(obj);
                    c11617m2 = c11617m3;
                    c11617m2 = c11617m;
                    c0647x0 = C0647x0.f1902Y;
                    c16101w = new C16101w(sessionWorker, c11617m2, null);
                    this.f49876Y = null;
                    this.f49877Z = 3;
                    if (AbstractC0575H.m1168P(c0647x0, c16101w, this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    if (c11617m2 != 3) {
                        if (c11617m2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th2 = (Throwable) this.f49876Y;
                        AbstractC9233X.m9807c(obj);
                        throw th2;
                    }
                    AbstractC9233X.m9807c(obj);
                }
                return new C7008n(C7001g.f22407c);
            }
            AbstractC9233X.m9807c(obj);
            InterfaceC16091m interfaceC16091m = sessionWorker.f33346u0;
            C16102x c16102x = new C16102x(sessionWorker, null);
            this.f49877Z = 1;
            obj = ((C16096r) interfaceC16091m).m17652a(c16102x, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            c11617m = (C11617m) obj;
            if (c11617m == null) {
                int i10 = sessionWorker.f33345t0.f33698c;
                String str = sessionWorker.f33349x0;
                if (i10 == 0) {
                    throw new IllegalStateException(("No session available for key " + str).toString());
                }
                AbstractC15256t.m16482t("GlanceSessionWorker", "SessionWorker attempted restart but Session is not available for " + str);
                return new C7008n(C7001g.f22407c);
            }
            C16075N c16075n = this.f49879p0;
            Context context = sessionWorker.f22416Y;
            C16073L c16073l = sessionWorker.f33347v0;
            C13298H c13298h = new C13298H(sessionWorker, 21);
            this.f49876Y = c11617m;
            this.f49877Z = 2;
            if (AbstractC8513L3.m9173a(c16075n, context, c11617m, c16073l, c13298h, this) == enumC19250a) {
                c11617m2 = c11617m;
                return enumC19250a;
            }
            c11617m2 = c11617m;
            c0647x0 = C0647x0.f1902Y;
            c16101w = new C16101w(sessionWorker, c11617m2, null);
            this.f49876Y = null;
            this.f49877Z = 3;
            if (AbstractC0575H.m1168P(c0647x0, c16101w, this) == enumC19250a) {
                return enumC19250a;
            }
            return new C7008n(C7001g.f22407c);
        } catch (Throwable th3) {
            C0647x0 c0647x1 = C0647x0.f1902Y;
            C16101w c16101w2 = new C16101w(sessionWorker, c11617m2, null);
            this.f49876Y = th3;
            this.f49877Z = c16101w;
            if (AbstractC0575H.m1168P(c0647x1, c16101w2, this) == enumC19250a) {
                return enumC19250a;
            }
            throw th3;
        }
    }
}

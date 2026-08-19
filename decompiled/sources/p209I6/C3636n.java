package p209I6;

import java.io.Closeable;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p112E6.C2343b;
import p509Uk.lpqL.SfpOlmlMATQ;
import p571X9.AbstractC9221V;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: I6.n */
/* JADX INFO: loaded from: classes.dex */
public final class C3636n extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f11083Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f11084Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3645w f11085o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3636n(C3645w c3645w, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f11085o0 = c3645w;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C3636n c3636n = new C3636n(this.f11085o0, interfaceC18770c);
        c3636n.f11084Z = obj;
        return c3636n;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3636n) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Closeable closeable;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f11083Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f11084Z;
            C3645w c3645w = this.f11085o0;
            C2343b c2343b = c3645w.f11127j;
            try {
                this.f11084Z = c2343b;
                this.f11083Y = 1;
                if (C3645w.m4354b(c3645w, interfaceC0571F, this) == enumC19250a) {
                    return enumC19250a;
                }
                closeable = c2343b;
                if (closeable != null) {
                    closeable.close();
                }
                th = null;
            } catch (Throwable th2) {
                th = th2;
                closeable = c2343b;
                if (closeable != null) {
                    closeable.close();
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException(SfpOlmlMATQ.tXC);
            }
            closeable = (Closeable) this.f11084Z;
            try {
                AbstractC9233X.m9807c(obj);
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                th = null;
            } catch (Throwable th4) {
                th = th4;
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (Throwable th5) {
                        AbstractC9221V.m9789a(th, th5);
                    }
                }
            }
        }
        if (th == null) {
            return C17296C.f55119a;
        }
        throw th;
    }
}

package p025An;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p153Fn.C2939q;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: An.H0 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0576H0 extends C2939q implements Runnable {

    /* JADX INFO: renamed from: q0 */
    public final long f1806q0;

    public RunnableC0576H0(long j10, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c, interfaceC18770c.getContext());
        this.f1806q0 = j10;
    }

    @Override // p025An.C0641u0
    /* JADX INFO: renamed from: R */
    public final String mo1198R() {
        return super.mo1198R() + "(timeMillis=" + this.f1806q0 + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0575H.m1190s(this.f1833o0);
        m1310v(new C0574G0(AbstractC10763a.m11050h(this.f1806q0, " ms", new StringBuilder("Timed out waiting for ")), this));
    }
}

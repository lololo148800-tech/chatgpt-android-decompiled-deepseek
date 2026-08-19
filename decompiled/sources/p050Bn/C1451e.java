package p050Bn;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.RunnableC0074m;
import p025An.AbstractC0563B;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0624m;
import p025An.C0649y0;
import p025An.InterfaceC0585M;
import p025An.InterfaceC0595V;
import p153Fn.AbstractC2935m;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p530Vi.AbstractC8301I;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: Bn.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C1451e extends AbstractC0563B implements InterfaceC0585M {

    /* JADX INFO: renamed from: Z */
    public final Handler f3816Z;

    /* JADX INFO: renamed from: o0 */
    public final String f3817o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f3818p0;

    /* JADX INFO: renamed from: q0 */
    public final C1451e f3819q0;

    public C1451e(Handler handler, String str, boolean z6) {
        this.f3816Z = handler;
        this.f3817o0 = str;
        this.f3818p0 = z6;
        this.f3819q0 = z6 ? this : new C1451e(handler, str, true);
    }

    @Override // p025An.InterfaceC0585M
    /* JADX INFO: renamed from: S */
    public final InterfaceC0595V mo1199S(long j10, final Runnable runnable, InterfaceC18776i interfaceC18776i) {
        if (this.f3816Z.postDelayed(runnable, AbstractC8301I.m8918i(j10, 4611686018427387903L))) {
            return new InterfaceC0595V() { // from class: Bn.c
                @Override // p025An.InterfaceC0595V
                public final void dispose() {
                    this.f3811Y.f3816Z.removeCallbacks(runnable);
                }
            };
        }
        m2054Z0(interfaceC18776i, runnable);
        return C0649y0.f1903Y;
    }

    @Override // p025An.AbstractC0563B
    /* JADX INFO: renamed from: V0 */
    public final void mo872V0(InterfaceC18776i interfaceC18776i, Runnable runnable) {
        if (this.f3816Z.post(runnable)) {
            return;
        }
        m2054Z0(interfaceC18776i, runnable);
    }

    @Override // p025An.AbstractC0563B
    /* JADX INFO: renamed from: X0 */
    public final boolean mo1143X0(InterfaceC18776i interfaceC18776i) {
        return (this.f3818p0 && AbstractC16544l.m18089b(Looper.myLooper(), this.f3816Z.getLooper())) ? false : true;
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m2054Z0(InterfaceC18776i interfaceC18776i, Runnable runnable) {
        AbstractC0575H.m1181j(interfaceC18776i, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C3516e c3516e = AbstractC0593T.f1824a;
        ExecutorC3515d.f10633Z.mo872V0(interfaceC18776i, runnable);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1451e) {
            C1451e c1451e = (C1451e) obj;
            if (c1451e.f3816Z == this.f3816Z && c1451e.f3818p0 == this.f3818p0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3816Z) ^ (this.f3818p0 ? 1231 : 1237);
    }

    @Override // p025An.InterfaceC0585M
    /* JADX INFO: renamed from: k */
    public final void mo1211k(long j10, C0624m c0624m) {
        RunnableC0074m runnableC0074m = new RunnableC0074m(c0624m, 9, this);
        if (this.f3816Z.postDelayed(runnableC0074m, AbstractC8301I.m8918i(j10, 4611686018427387903L))) {
            c0624m.m1264u(new C1450d(this, 0, runnableC0074m));
        } else {
            m2054Z0(c0624m.f1874q0, runnableC0074m);
        }
    }

    @Override // p025An.AbstractC0563B
    public final String toString() {
        C1451e c1451e;
        String str;
        C3516e c3516e = AbstractC0593T.f1824a;
        C1451e c1451e2 = AbstractC2935m.f8797a;
        if (this == c1451e2) {
            str = "Dispatchers.Main";
        } else {
            try {
                c1451e = c1451e2.f3819q0;
            } catch (UnsupportedOperationException unused) {
                c1451e = null;
            }
            str = this == c1451e ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f3817o0;
        if (string == null) {
            string = this.f3816Z.toString();
        }
        return this.f3818p0 ? AbstractC10763a.m11052j(string, ".immediate") : string;
    }

    public C1451e(Handler handler) {
        this(handler, null, false);
    }
}

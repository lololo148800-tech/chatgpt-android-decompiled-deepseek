package p425Ra;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import p572Xa.AbstractC9421o;
import p572Xa.C9423q;
import p572Xa.InterfaceC9425s;
import p746fa.C13599h;

/* JADX INFO: renamed from: Ra.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6832e extends AbstractC6835h {

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13599h f21916o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C6836i f21917p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6832e(C6836i c6836i, C13599h c13599h, C13599h c13599h2) {
        super(c6836i, c13599h);
        this.f21916o0 = c13599h2;
        this.f21917p0 = c6836i;
    }

    @Override // p572Xa.AbstractRunnableC9428v
    /* JADX INFO: renamed from: b */
    public final void mo7271b() {
        C13599h c13599h = this.f21916o0;
        C6836i c6836i = this.f21917p0;
        if (C6836i.m7280d(c6836i)) {
            mo7276a(new C6828a(-2, null));
            return;
        }
        if (C6836i.m7279c(c6836i)) {
            mo7276a(new C6828a(-14, null));
            return;
        }
        try {
            InterfaceC9425s interfaceC9425s = c6836i.f21932e.f28380n;
            Bundle bundleM7278b = C6836i.m7278b(c6836i);
            BinderC6834g binderC6834g = new BinderC6834g(c6836i, c13599h, 1);
            C9423q c9423q = (C9423q) interfaceC9425s;
            c9423q.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
            int i10 = AbstractC9421o.f28401a;
            parcelObtain.writeInt(1);
            bundleM7278b.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(binderC6834g);
            try {
                c9423q.f28404a.transact(2, parcelObtain, null, 1);
            } finally {
                parcelObtain.recycle();
            }
        } catch (RemoteException e10) {
            c6836i.f21928a.m9999a(e10, "warmUpIntegrityToken(%s)", 4906872596L);
            c13599h.m15115c(new C6828a(-100, e10));
        }
    }
}

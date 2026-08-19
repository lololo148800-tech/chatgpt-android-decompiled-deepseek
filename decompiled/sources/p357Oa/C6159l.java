package p357Oa;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import io.sentry.android.core.AbstractC15256t;
import java.util.Iterator;
import p477Tb.C7296c;

/* JADX INFO: renamed from: Oa.l */
/* JADX INFO: loaded from: classes.dex */
public final class C6159l extends AbstractRunnableC6156i {

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ IBinder f20045Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ ServiceConnectionC6160m f20046o0;

    public C6159l(ServiceConnectionC6160m serviceConnectionC6160m, IBinder iBinder) {
        this.f20046o0 = serviceConnectionC6160m;
        this.f20045Z = iBinder;
    }

    @Override // p357Oa.AbstractRunnableC6156i
    /* JADX INFO: renamed from: a */
    public final void mo6140a() {
        InterfaceC6154g c6152e;
        ServiceConnectionC6160m serviceConnectionC6160m = this.f20046o0;
        C6161n c6161n = (C6161n) serviceConnectionC6160m.f20048b;
        int i10 = AbstractBinderC6153f.f20038b;
        IBinder iBinder = this.f20045Z;
        if (iBinder == null) {
            c6152e = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            c6152e = iInterfaceQueryLocalInterface instanceof InterfaceC6154g ? (InterfaceC6154g) iInterfaceQueryLocalInterface : new C6152e(iBinder);
        }
        c6161n.f20062m = c6152e;
        C6161n c6161n2 = (C6161n) serviceConnectionC6160m.f20048b;
        c6161n2.f20051b.m7758K("linkToDeath", new Object[0]);
        try {
            c6161n2.f20062m.asBinder().linkToDeath(c6161n2.f20059j, 0);
        } catch (RemoteException e10) {
            Object[] objArr = new Object[0];
            C7296c c7296c = c6161n2.f20051b;
            c7296c.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                AbstractC15256t.m16466d("PlayCore", C7296c.m7748L((String) c7296c.f23104Z, "linkToDeath failed", objArr), e10);
            }
        }
        c6161n2.f20056g = false;
        Iterator it = c6161n2.f20053d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        c6161n2.f20053d.clear();
    }
}

package p1060v9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.AbstractC11852a;

/* JADX INFO: renamed from: v9.w */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC20505w implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final int f65105a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC11852a f65106b;

    public ServiceConnectionC20505w(AbstractC11852a abstractC11852a, int i10) {
        this.f65106b = abstractC11852a;
        this.f65105a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC11852a abstractC11852a = this.f65106b;
        if (iBinder == null) {
            AbstractC11852a.m13195w(abstractC11852a);
            return;
        }
        synchronized (abstractC11852a.f36074g) {
            try {
                AbstractC11852a abstractC11852a2 = this.f65106b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC11852a2.f36075h = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof C20501s)) ? new C20501s(iBinder) : (C20501s) iInterfaceQueryLocalInterface;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        AbstractC11852a abstractC11852a3 = this.f65106b;
        int i10 = this.f65105a;
        abstractC11852a3.getClass();
        C20507y c20507y = new C20507y(abstractC11852a3, 0);
        HandlerC20503u handlerC20503u = abstractC11852a3.f36072e;
        handlerC20503u.sendMessage(handlerC20503u.obtainMessage(7, i10, -1, c20507y));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC11852a abstractC11852a;
        synchronized (this.f65106b.f36074g) {
            abstractC11852a = this.f65106b;
            abstractC11852a.f36075h = null;
        }
        int i10 = this.f65105a;
        HandlerC20503u handlerC20503u = abstractC11852a.f36072e;
        handlerC20503u.sendMessage(handlerC20503u.obtainMessage(6, i10, 1));
    }
}

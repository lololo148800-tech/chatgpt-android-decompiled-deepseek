package p865l6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import p1068vo.C20659i;
import p1081wc.C20873T;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9138H;
import p829j9.AbstractBinderC16178b;
import p829j9.C16177a;
import p829j9.InterfaceC16179c;
import p972qm.C18778k;
import p985r9.C18903m;

/* JADX INFO: renamed from: l6.a */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC16827a implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final C20659i f53998a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C18903m f53999b;

    public ServiceConnectionC16827a(C18903m c18903m, C20659i c20659i) {
        this.f53999b = c18903m;
        this.f53998a = c20659i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object c16177a;
        AbstractC9138H.m9682a("Install Referrer service connected.");
        int i10 = AbstractBinderC16178b.f50221a;
        if (iBinder == null) {
            c16177a = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            c16177a = iInterfaceQueryLocalInterface instanceof InterfaceC16179c ? (InterfaceC16179c) iInterfaceQueryLocalInterface : new C16177a(iBinder);
        }
        C18903m c18903m = this.f53999b;
        c18903m.f60269c = c16177a;
        c18903m.f60267a = 2;
        this.f53998a.m21207a(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC9138H.m9683b("Install Referrer service disconnected.");
        C18903m c18903m = this.f53999b;
        c18903m.f60269c = null;
        c18903m.f60267a = 0;
        C20659i c20659i = this.f53998a;
        AbstractC8160o6.m8731f(((C20873T) c20659i.f65543c).f66453p0, "Install referrer service disconnected", null, null, 6);
        ((C18778k) c20659i.f65542b).resumeWith(null);
    }
}

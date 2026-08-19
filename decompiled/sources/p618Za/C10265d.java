package p618Za;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import io.sentry.android.core.AbstractC15256t;
import java.util.List;
import p1070w.AbstractServiceConnectionC20695d;
import p1070w.C20694c;
import p1070w.C20696e;
import p757g.C13722a;
import p757g.InterfaceC13724c;

/* JADX INFO: renamed from: Za.d */
/* JADX INFO: loaded from: classes.dex */
public final class C10265d extends AbstractServiceConnectionC20695d {

    /* JADX INFO: renamed from: b */
    public RunnableC10264c f30485b;

    /* JADX INFO: renamed from: c */
    public RunnableC10264c f30486c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C10266e f30487d;

    public C10265d(C10266e c10266e) {
        this.f30487d = c10266e;
    }

    @Override // p1070w.AbstractServiceConnectionC20695d
    /* JADX INFO: renamed from: a */
    public final void mo8079a(C20694c c20694c) {
        RunnableC10264c runnableC10264c;
        RunnableC10264c runnableC10264c2;
        C10266e c10266e = this.f30487d;
        PackageManager packageManager = c10266e.f30489a.getPackageManager();
        List list = AbstractC10262a.f30478a;
        String str = c10266e.f30490b;
        if (!(!list.contains(str) ? true : AbstractC10262a.m10860a(packageManager, str, 368300000))) {
            try {
                ((C13722a) ((InterfaceC13724c) c20694c.f65551b)).m15209k();
            } catch (RemoteException unused) {
            }
        }
        try {
            C20696e c20696eM21213a = c20694c.m21213a(PendingIntent.getActivity((Context) c20694c.f65553d, c10266e.f30492d, new Intent(), 67108864));
            c10266e.f30494f = c20696eM21213a;
            if (c20696eM21213a != null && (runnableC10264c2 = this.f30485b) != null) {
                runnableC10264c2.run();
            } else if (c20696eM21213a == null && (runnableC10264c = this.f30486c) != null) {
                runnableC10264c.run();
            }
        } catch (RuntimeException e10) {
            AbstractC15256t.m16484v("TwaLauncher", e10);
            this.f30486c.run();
        }
        this.f30485b = null;
        this.f30486c = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f30487d.f30494f = null;
    }
}

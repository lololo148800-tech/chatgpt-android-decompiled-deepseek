package p1070w;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import p757g.AbstractBinderC13723b;
import p757g.C13722a;
import p757g.InterfaceC13724c;

/* JADX INFO: renamed from: w.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceConnectionC20695d implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public Context f65554a;

    /* JADX INFO: renamed from: a */
    public abstract void mo8079a(C20694c c20694c);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC13724c interfaceC13724c;
        if (this.f65554a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i10 = AbstractBinderC13723b.f43287a;
        if (iBinder == null) {
            interfaceC13724c = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC13724c)) {
                C13722a c13722a = new C13722a();
                c13722a.f43286a = iBinder;
                interfaceC13724c = c13722a;
            } else {
                interfaceC13724c = (InterfaceC13724c) iInterfaceQueryLocalInterface;
            }
        }
        mo8079a(new C20694c(interfaceC13724c, componentName, this.f65554a, 0));
    }
}

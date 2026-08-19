package p999s;

import android.view.View;
import p976r.InterfaceC18812j;
import p976r.MenuC18814l;

/* JADX INFO: renamed from: s.g */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC19351g implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final C19345e f61281Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19356i f61282Z;

    public RunnableC19351g(C19356i c19356i, C19345e c19345e) {
        this.f61282Z = c19356i;
        this.f61281Y = c19345e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC18812j interfaceC18812j;
        C19356i c19356i = this.f61282Z;
        MenuC18814l menuC18814l = c19356i.f61298o0;
        if (menuC18814l != null && (interfaceC18812j = menuC18814l.f59849e) != null) {
            interfaceC18812j.mo10224y(menuC18814l);
        }
        View view = (View) c19356i.f61303t0;
        if (view != null && view.getWindowToken() != null) {
            C19345e c19345e = this.f61281Y;
            if (c19345e.m20143b()) {
                c19356i.f61291E0 = c19345e;
            } else if (c19345e.f59917e != null) {
                c19345e.m20145d(0, 0, false, false);
                c19356i.f61291E0 = c19345e;
            }
        }
        c19356i.f61293G0 = null;
    }
}

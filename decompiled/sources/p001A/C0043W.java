package p001A;

import android.hardware.camera2.TotalCaptureResult;
import java.util.ArrayList;
import java.util.Iterator;
import p301M.AbstractC5229k;
import p301M.C5233o;
import p477Tb.C7296c;
import p544W9.AbstractC8577W2;
import p747fb.InterfaceFutureC13608b;

/* JADX INFO: renamed from: A.W */
/* JADX INFO: loaded from: classes.dex */
public final class C0043W implements InterfaceC0049Z {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0047Y f210a;

    public C0043W(C0047Y c0047y) {
        this.f210a = c0047y;
    }

    @Override // p001A.InterfaceC0049Z
    /* JADX INFO: renamed from: a */
    public final InterfaceFutureC13608b mo170a(TotalCaptureResult totalCaptureResult) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f210a.f228h.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC0049Z) it.next()).mo170a(totalCaptureResult));
        }
        C5233o c5233o = new C5233o(new ArrayList(arrayList), true, AbstractC8577W2.m9240b());
        C0030P c0030p = new C0030P(3);
        return AbstractC5229k.m5782f(c5233o, new C7296c(c0030p, 18), AbstractC8577W2.m9240b());
    }

    @Override // p001A.InterfaceC0049Z
    /* JADX INFO: renamed from: b */
    public final boolean mo171b() {
        Iterator it = this.f210a.f228h.iterator();
        while (it.hasNext()) {
            if (((InterfaceC0049Z) it.next()).mo171b()) {
                return true;
            }
        }
        return false;
    }

    @Override // p001A.InterfaceC0049Z
    /* JADX INFO: renamed from: c */
    public final void mo172c() {
        Iterator it = this.f210a.f228h.iterator();
        while (it.hasNext()) {
            ((InterfaceC0049Z) it.next()).mo172c();
        }
    }
}

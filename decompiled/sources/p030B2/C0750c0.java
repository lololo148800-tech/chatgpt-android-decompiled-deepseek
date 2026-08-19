package p030B2;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: B2.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0750c0 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f2123a;

    public C0750c0(View view) {
        this.f2123a = new WeakReference(view);
    }

    /* JADX INFO: renamed from: a */
    public final void m1599a(float f10) {
        View view = (View) this.f2123a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1600b() {
        View view = (View) this.f2123a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1601c(long j10) {
        View view = (View) this.f2123a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1602d(InterfaceC0752d0 interfaceC0752d0) {
        View view = (View) this.f2123a.get();
        if (view != null) {
            if (interfaceC0752d0 != null) {
                view.animate().setListener(new C0748b0(interfaceC0752d0, view, 0));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1603e(float f10) {
        View view = (View) this.f2123a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
    }
}

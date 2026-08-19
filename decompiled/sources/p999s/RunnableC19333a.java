package p999s;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: s.a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC19333a implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f61238Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ActionBarOverlayLayout f61239Z;

    public /* synthetic */ RunnableC19333a(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.f61238Y = i10;
        this.f61239Z = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f61238Y) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f61239Z;
                actionBarOverlayLayout.m11141b();
                actionBarOverlayLayout.f32216K0 = actionBarOverlayLayout.f32225r0.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f32217L0);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f61239Z;
                actionBarOverlayLayout2.m11141b();
                actionBarOverlayLayout2.f32216K0 = actionBarOverlayLayout2.f32225r0.animate().translationY(-actionBarOverlayLayout2.f32225r0.getHeight()).setListener(actionBarOverlayLayout2.f32217L0);
                break;
        }
    }
}

package p329N3;

import android.hardware.display.DisplayManager;

/* JADX INFO: renamed from: N3.q */
/* JADX INFO: loaded from: classes.dex */
public final class C5627q implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a */
    public final DisplayManager f18262a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C5629s f18263b;

    public C5627q(C5629s c5629s, DisplayManager displayManager) {
        this.f18263b = c5629s;
        this.f18262a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        if (i10 == 0) {
            C5629s.m6036a(this.f18263b, this.f18262a.getDisplay(0));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }
}

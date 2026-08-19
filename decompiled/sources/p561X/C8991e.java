package p561X;

import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.camera.view.PreviewView;

/* JADX INFO: renamed from: X.e */
/* JADX INFO: loaded from: classes.dex */
public final class C8991e implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PreviewView f27436a;

    public C8991e(PreviewView previewView) {
        this.f27436a = previewView;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        PreviewView previewView = this.f27436a;
        Display display = previewView.getDisplay();
        if (display == null || display.getDisplayId() != i10) {
            return;
        }
        previewView.m11194a();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }
}

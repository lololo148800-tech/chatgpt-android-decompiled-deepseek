package p561X;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import p178H.InterfaceC3122O;
import p523V9.AbstractC8072d6;
import p544W9.AbstractC8488H2;

/* JADX INFO: renamed from: X.n */
/* JADX INFO: loaded from: classes.dex */
public final class C9000n extends View {

    /* JADX INFO: renamed from: o0 */
    public Window f27460o0;

    /* JADX INFO: renamed from: p0 */
    public C8998l f27461p0;

    /* JADX INFO: Access modifiers changed from: private */
    public float getBrightness() {
        Window window = this.f27460o0;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        AbstractC8072d6.m8487d("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
        return Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f10) {
        if (this.f27460o0 == null) {
            AbstractC8072d6.m8487d("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
            return;
        }
        if (Float.isNaN(f10)) {
            AbstractC8072d6.m8487d("ScreenFlashView", "setBrightness: value is NaN!");
            return;
        }
        WindowManager.LayoutParams attributes = this.f27460o0.getAttributes();
        attributes.screenBrightness = f10;
        this.f27460o0.setAttributes(attributes);
        AbstractC8072d6.m8486c("ScreenFlashView", "Brightness set to " + attributes.screenBrightness);
    }

    private void setScreenFlashUiInfo(InterfaceC3122O interfaceC3122O) {
        AbstractC8072d6.m8486c("ScreenFlashView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    public InterfaceC3122O getScreenFlash() {
        return this.f27461p0;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(AbstractC8987a abstractC8987a) {
        AbstractC8488H2.m9140a();
    }

    public void setScreenFlashWindow(Window window) {
        AbstractC8488H2.m9140a();
        if (this.f27460o0 != window) {
            this.f27461p0 = window == null ? null : new C8998l(this);
        }
        this.f27460o0 = window;
        setScreenFlashUiInfo(getScreenFlash());
    }
}

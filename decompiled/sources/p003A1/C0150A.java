package p003A1;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.p650ui.platform.AndroidComposeView;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: A1.A */
/* JADX INFO: loaded from: classes.dex */
public final class C0150A extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f624Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AndroidComposeView f625Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0150A(AndroidComposeView androidComposeView, int i10) {
        super(0);
        this.f624Y = i10;
        this.f625Z = androidComposeView;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        int actionMasked;
        switch (this.f624Y) {
            case 0:
                AndroidComposeView androidComposeView = this.f625Z;
                MotionEvent motionEvent = androidComposeView.f32821y1;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    androidComposeView.f32823z1 = SystemClock.uptimeMillis();
                    androidComposeView.post(androidComposeView.f32755C1);
                }
                return C17296C.f55119a;
            default:
                return this.f625Z.get_viewTreeOwners();
        }
    }
}

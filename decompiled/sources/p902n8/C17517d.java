package p902n8;

import android.view.Window;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: n8.d */
/* JADX INFO: loaded from: classes.dex */
public final class C17517d extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f56029Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Window f56030Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17517d(Window window, int i10) {
        super(0);
        this.f56029Y = i10;
        this.f56030Z = window;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f56029Y) {
            case 0:
                return "Disabling jankStats for window " + this.f56030Z;
            case 1:
                return "Resuming jankStats for window " + this.f56030Z;
            default:
                return "Starting jankStats for window " + this.f56030Z;
        }
    }
}

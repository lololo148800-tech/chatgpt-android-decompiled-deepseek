package p229J0;

import android.window.OnBackInvokedCallback;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: J0.U1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3989U1 implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12517a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC1426a f12518b;

    public /* synthetic */ C3989U1(int i10, InterfaceC1426a interfaceC1426a) {
        this.f12517a = i10;
        this.f12518b = interfaceC1426a;
    }

    public final void onBackInvoked() {
        switch (this.f12517a) {
            case 0:
                this.f12518b.invoke();
                break;
            case 1:
                InterfaceC1426a interfaceC1426a = this.f12518b;
                if (interfaceC1426a != null) {
                    interfaceC1426a.invoke();
                }
                break;
            default:
                InterfaceC1426a onBackInvoked = this.f12518b;
                AbstractC16544l.m18094g(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                break;
        }
    }
}

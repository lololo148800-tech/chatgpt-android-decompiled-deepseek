package p893n;

import android.window.OnBackInvokedCallback;

/* JADX INFO: renamed from: n.p */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17384p implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55497a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f55498b;

    public /* synthetic */ C17384p(Object obj, int i10) {
        this.f55497a = i10;
        this.f55498b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f55497a) {
            case 0:
                ((LayoutInflaterFactory2C17390v) this.f55498b).m19092H();
                break;
            default:
                ((Runnable) this.f55498b).run();
                break;
        }
    }
}

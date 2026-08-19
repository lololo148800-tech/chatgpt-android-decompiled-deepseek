package p448S8;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: S8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7030a extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public static final C7030a f22485Y = new C7030a(0);

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        return new Handler(Looper.getMainLooper());
    }
}

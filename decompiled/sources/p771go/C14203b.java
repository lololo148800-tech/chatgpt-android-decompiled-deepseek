package p771go;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17316s;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: go.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C14203b extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C14203b f44614Z = new C14203b(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C14203b f44615o0 = new C14203b(0, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44616Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14203b(int i10, int i11) {
        super(i10);
        this.f44616Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f44616Y) {
            case 0:
                return new Handler(Looper.getMainLooper());
            default:
                try {
                    Object obj = Class.forName("leakcanary.internal.InternalLeakCanary").getDeclaredField("INSTANCE").get(null);
                    if (obj == null) {
                        throw new C17316s("null cannot be cast to non-null type (android.app.Application) -> kotlin.Unit");
                    }
                    AbstractC16529F.m18081e(1, obj);
                    return (InterfaceC1436k) obj;
                } catch (Throwable unused) {
                    return C14205d.f44618Y;
                }
        }
    }
}

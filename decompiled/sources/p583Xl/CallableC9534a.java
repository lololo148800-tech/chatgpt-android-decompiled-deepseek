package p583Xl;

import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Xl.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC9534a implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f28684a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC16546n f28685b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ CallableC9534a(int i10, InterfaceC1426a interfaceC1426a) {
        this.f28684a = i10;
        this.f28685b = (AbstractC16546n) interfaceC1426a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r0v3, types: [Bm.a, kotlin.jvm.internal.n] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f28684a) {
            case 0:
                break;
        }
        return this.f28685b.invoke();
    }
}

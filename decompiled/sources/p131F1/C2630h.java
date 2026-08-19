package p131F1;

import android.os.CancellationSignal;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: F1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2630h extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f8142Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ CancellationSignal f8143Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2630h(CancellationSignal cancellationSignal, int i10) {
        super(1);
        this.f8142Y = i10;
        this.f8143Z = cancellationSignal;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f8142Y) {
            case 0:
                if (((Throwable) obj) != null) {
                    this.f8143Z.cancel();
                }
                break;
            default:
                this.f8143Z.cancel();
                break;
        }
        return C17296C.f55119a;
    }
}

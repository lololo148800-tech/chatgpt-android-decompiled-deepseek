package p672c3;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p492U1.C7542g;

/* JADX INFO: renamed from: c3.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11636v0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f35261Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f35262Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11636v0(long j10, int i10) {
        super(0);
        this.f35261Y = i10;
        this.f35262Z = j10;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        long j10 = this.f35262Z;
        switch (this.f35261Y) {
            case 0:
                return new C7542g(j10);
            case 1:
                return String.format(Locale.US, "[Mobile Metric] Gap between views", Arrays.copyOf(new Object[]{Long.valueOf(j10)}, 1));
            default:
                return String.format(Locale.US, "[Mobile Metric] Negative gap between views", Arrays.copyOf(new Object[]{Long.valueOf(j10)}, 1));
        }
    }
}

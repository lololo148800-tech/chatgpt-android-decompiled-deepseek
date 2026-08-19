package p557Wl;

import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC16544l;
import p628Zk.GwZB.tpXhEMGxfXFVSh;

/* JADX INFO: renamed from: Wl.q */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC8961q implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f27389a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8964t f27390b;

    public /* synthetic */ CallableC8961q(C8964t c8964t, int i10) {
        this.f27389a = i10;
        this.f27390b = c8964t;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f27389a) {
            case 0:
                C8964t this$0 = this.f27390b;
                AbstractC16544l.m18094g(this$0, "this$0");
                return this$0.f27396a.getScalingSettings();
            case 1:
                C8964t this$1 = this.f27390b;
                AbstractC16544l.m18094g(this$1, "this$0");
                return this$1.f27396a.getImplementationName();
            case 2:
                C8964t this$2 = this.f27390b;
                AbstractC16544l.m18094g(this$2, "this$0");
                return this$2.f27396a.getResolutionBitrateLimits();
            case 3:
                String str = tpXhEMGxfXFVSh.iCHkfGmSKs;
                C8964t c8964t = this.f27390b;
                AbstractC16544l.m18094g(c8964t, str);
                return c8964t.f27396a.getEncoderInfo();
            case 4:
                C8964t this$3 = this.f27390b;
                AbstractC16544l.m18094g(this$3, "this$0");
                return Boolean.valueOf(this$3.f27396a.isHardwareEncoder());
            default:
                C8964t this$4 = this.f27390b;
                AbstractC16544l.m18094g(this$4, "this$0");
                return this$4.f27396a.release();
        }
    }
}

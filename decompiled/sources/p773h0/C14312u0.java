package p773h0;

import android.view.View;
import android.widget.Magnifier;
import p102Dm.AbstractC2119a;
import p492U1.InterfaceC7537b;
import p759g1.C13803e;

/* JADX INFO: renamed from: h0.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C14312u0 implements InterfaceC14304q0 {

    /* JADX INFO: renamed from: a */
    public static final C14312u0 f44930a = new C14312u0();

    @Override // p773h0.InterfaceC14304q0
    /* JADX INFO: renamed from: a */
    public final boolean mo15595a() {
        return true;
    }

    @Override // p773h0.InterfaceC14304q0
    /* JADX INFO: renamed from: b */
    public final InterfaceC14302p0 mo15596b(View view, boolean z6, long j10, float f10, float f11, boolean z10, InterfaceC7537b interfaceC7537b, float f12) {
        if (z6) {
            return new C14310t0(new Magnifier(view));
        }
        long jMo7867r0 = interfaceC7537b.mo7867r0(j10);
        float fMo7864b0 = interfaceC7537b.mo7864b0(f10);
        float fMo7864b1 = interfaceC7537b.mo7864b0(f11);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jMo7867r0 != 9205357640488583168L) {
            builder.setSize(AbstractC2119a.m3195i(C13803e.m15333e(jMo7867r0)), AbstractC2119a.m3195i(C13803e.m15331c(jMo7867r0)));
        }
        if (!Float.isNaN(fMo7864b0)) {
            builder.setCornerRadius(fMo7864b0);
        }
        if (!Float.isNaN(fMo7864b1)) {
            builder.setElevation(fMo7864b1);
        }
        if (!Float.isNaN(f12)) {
            builder.setInitialZoom(f12);
        }
        builder.setClippingEnabled(z10);
        return new C14310t0(builder.build());
    }
}

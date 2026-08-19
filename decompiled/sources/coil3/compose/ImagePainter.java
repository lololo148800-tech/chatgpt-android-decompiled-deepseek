package coil3.compose;

import com.google.protobuf.AbstractC12107L1;
import fo.C13711h;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p033B5.InterfaceC0829m;
import p523V9.AbstractC8112i6;
import p604Yk.C10077b;
import p759g1.C13803e;
import p774h1.AbstractC14348d;
import p821j1.InterfaceC16039d;
import p882m1.AbstractC17140a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcoil3/compose/ImagePainter;", "Lm1/a;", "coil-compose-core_release"}, m18068k = 1, m18069mv = {2, 0, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ImagePainter extends AbstractC17140a {

    /* JADX INFO: renamed from: r0 */
    public final InterfaceC0829m f35918r0;

    public ImagePainter(InterfaceC0829m interfaceC0829m) {
        this.f35918r0 = interfaceC0829m;
    }

    @Override // p882m1.AbstractC17140a
    /* JADX INFO: renamed from: h */
    public final long getF38830r0() {
        InterfaceC0829m interfaceC0829m = this.f35918r0;
        int width = interfaceC0829m.getWidth();
        float f10 = width > 0 ? width : Float.NaN;
        int height = interfaceC0829m.getHeight();
        return AbstractC8112i6.m8603a(f10, height > 0 ? height : Float.NaN);
    }

    @Override // p882m1.AbstractC17140a
    /* JADX INFO: renamed from: i */
    public final void mo11310i(InterfaceC16039d interfaceC16039d) {
        InterfaceC0829m interfaceC0829m = this.f35918r0;
        int width = interfaceC0829m.getWidth();
        float fM15333e = width > 0 ? C13803e.m15333e(interfaceC16039d.mo17602i()) / width : 1.0f;
        int height = interfaceC0829m.getHeight();
        float fM15331c = height > 0 ? C13803e.m15331c(interfaceC16039d.mo17602i()) / height : 1.0f;
        C13711h c13711hMo17601f0 = interfaceC16039d.mo17601f0();
        long jM15202x = c13711hMo17601f0.m15202x();
        c13711hMo17601f0.m15196m().mo15706e();
        try {
            ((C10077b) c13711hMo17601f0.f43259Z).m10664L(fM15333e, fM15331c, 0L);
            interfaceC0829m.mo1878d(AbstractC14348d.m15725a(interfaceC16039d.mo17601f0().m15196m()));
        } finally {
            AbstractC12107L1.m13830u(c13711hMo17601f0, jM15202x);
        }
    }
}

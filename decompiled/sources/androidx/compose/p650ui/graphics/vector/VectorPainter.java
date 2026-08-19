package androidx.compose.p650ui.graphics.vector;

import com.google.protobuf.AbstractC12107L1;
import fo.C13711h;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p349O0.C5975S;
import p349O0.C5996c0;
import p349O0.C5997d;
import p349O0.C6002f0;
import p492U1.EnumC7546k;
import p604Yk.C10077b;
import p759g1.C13803e;
import p774h1.C14356l;
import p821j1.InterfaceC16039d;
import p882m1.AbstractC17140a;
import p887m7.C17176b;
import p895n1.C17416D;
import p895n1.C17422b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Landroidx/compose/ui/graphics/vector/VectorPainter;", "Lm1/a;", "ui_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class VectorPainter extends AbstractC17140a {

    /* JADX INFO: renamed from: r0 */
    public final C6002f0 f32727r0;

    /* JADX INFO: renamed from: s0 */
    public final C6002f0 f32728s0;

    /* JADX INFO: renamed from: t0 */
    public final C17416D f32729t0;

    /* JADX INFO: renamed from: u0 */
    public final C5996c0 f32730u0;

    /* JADX INFO: renamed from: v0 */
    public float f32731v0;

    /* JADX INFO: renamed from: w0 */
    public C14356l f32732w0;

    /* JADX INFO: renamed from: x0 */
    public int f32733x0;

    public VectorPainter(C17422b c17422b) {
        C13803e c13803e = new C13803e(0L);
        C5975S c5975s = C5975S.f19448r0;
        this.f32727r0 = C5997d.m6430Q(c13803e, c5975s);
        this.f32728s0 = C5997d.m6430Q(Boolean.FALSE, c5975s);
        C17416D c17416d = new C17416D(c17422b);
        c17416d.f55618f = new C17176b(this, 2);
        this.f32729t0 = c17416d;
        this.f32730u0 = C5997d.m6429P(0);
        this.f32731v0 = 1.0f;
        this.f32733x0 = -1;
    }

    @Override // p882m1.AbstractC17140a
    /* JADX INFO: renamed from: b */
    public final boolean mo11307b(float f10) {
        this.f32731v0 = f10;
        return true;
    }

    @Override // p882m1.AbstractC17140a
    /* JADX INFO: renamed from: e */
    public final boolean mo11308e(C14356l c14356l) {
        this.f32732w0 = c14356l;
        return true;
    }

    @Override // p882m1.AbstractC17140a
    /* JADX INFO: renamed from: h */
    public final long getF38830r0() {
        return ((C13803e) this.f32727r0.getValue()).f43598a;
    }

    @Override // p882m1.AbstractC17140a
    /* JADX INFO: renamed from: i */
    public final void mo11310i(InterfaceC16039d interfaceC16039d) {
        C14356l c14356l = this.f32732w0;
        C17416D c17416d = this.f32729t0;
        if (c14356l == null) {
            c14356l = (C14356l) c17416d.f55619g.getValue();
        }
        if (((Boolean) this.f32728s0.getValue()).booleanValue() && interfaceC16039d.getLayoutDirection() == EnumC7546k.f23905Z) {
            long jMo17604o0 = interfaceC16039d.mo17604o0();
            C13711h c13711hMo17601f0 = interfaceC16039d.mo17601f0();
            long jM15202x = c13711hMo17601f0.m15202x();
            c13711hMo17601f0.m15196m().mo15706e();
            try {
                ((C10077b) c13711hMo17601f0.f43259Z).m10664L(-1.0f, 1.0f, jMo17604o0);
                c17416d.m19112e(interfaceC16039d, this.f32731v0, c14356l);
                AbstractC12107L1.m13830u(c13711hMo17601f0, jM15202x);
            } catch (Throwable th2) {
                AbstractC12107L1.m13830u(c13711hMo17601f0, jM15202x);
                throw th2;
            }
        } else {
            c17416d.m19112e(interfaceC16039d, this.f32731v0, c14356l);
        }
        this.f32733x0 = this.f32730u0.m6412g();
    }
}

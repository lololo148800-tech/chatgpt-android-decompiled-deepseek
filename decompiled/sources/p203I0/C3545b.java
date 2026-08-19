package p203I0;

import android.view.View;
import androidx.compose.material.ripple.RippleNode;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p102Dm.AbstractC2119a;
import p1140z1.AbstractC21690f;
import p1140z1.C21660F;
import p197Hj.C3457c;
import p774h1.AbstractC14348d;
import p774h1.InterfaceC14362r;
import p813ij.C15026j;
import p894n0.C17409o;

/* JADX INFO: renamed from: I0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3545b extends RippleNode implements InterfaceC3562s {

    /* JADX INFO: renamed from: I0 */
    public C3561r f10744I0;

    /* JADX INFO: renamed from: J0 */
    public C3563t f10745J0;

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: D0 */
    public final void mo4226D0() {
        C3561r c3561r = this.f10744I0;
        if (c3561r != null) {
            mo4224H();
            C15026j c15026j = c3561r.f10794r0;
            C3563t c3563t = (C3563t) ((LinkedHashMap) c15026j.f46724Y).get(this);
            if (c3563t != null) {
                c3563t.m4238c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) c15026j.f46724Y;
                C3563t c3563t2 = (C3563t) linkedHashMap.get(this);
                if (c3563t2 != null) {
                }
                linkedHashMap.remove(this);
                c3561r.f10793q0.add(c3563t);
            }
        }
    }

    @Override // p203I0.InterfaceC3562s
    /* JADX INFO: renamed from: H */
    public final void mo4224H() {
        this.f10745J0 = null;
        AbstractC21690f.m22209n(this);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    /* JADX INFO: renamed from: K0 */
    public final void mo4227K0(C17409o c17409o, long j10, float f10) {
        C3561r c3561rM4241a = this.f10744I0;
        if (c3561rM4241a == null) {
            c3561rM4241a = AbstractC3569z.m4241a(AbstractC3569z.m4242b((View) AbstractC21690f.m22204i(this, AndroidCompositionLocals_androidKt.f32829f)));
            this.f10744I0 = c3561rM4241a;
            AbstractC16544l.m18091d(c3561rM4241a);
        }
        C3563t c3563tM4235a = c3561rM4241a.m4235a(this);
        int iM3195i = AbstractC2119a.m3195i(f10);
        long jM11278M0 = m11278M0();
        C3551h c3551h = (C3551h) this.f32640C0.invoke();
        c3563tM4235a.m4237b(c17409o, this.f32638A0, j10, iM3195i, jM11278M0, c3551h.f10762d, new C3457c(this, 2));
        this.f10745J0 = c3563tM4235a;
        AbstractC21690f.m22209n(this);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    /* JADX INFO: renamed from: L0 */
    public final void mo4228L0(C21660F c21660f) {
        InterfaceC14362r interfaceC14362rM15196m = c21660f.f68674Y.f49479Z.m15196m();
        C3563t c3563t = this.f10745J0;
        if (c3563t != null) {
            c3563t.m4240e(((C3551h) this.f32640C0.invoke()).f10762d, this.f32643F0, m11278M0());
            c3563t.draw(AbstractC14348d.m15725a(interfaceC14362rM15196m));
        }
    }

    @Override // androidx.compose.material.ripple.RippleNode
    /* JADX INFO: renamed from: O0 */
    public final void mo4229O0(C17409o c17409o) {
        C3563t c3563t = this.f10745J0;
        if (c3563t != null) {
            c3563t.m4239d();
        }
    }
}

package p178H;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: renamed from: H.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3152j0 extends AbstractC3182z {

    /* JADX INFO: renamed from: p0 */
    public final Object f9488p0;

    /* JADX INFO: renamed from: q0 */
    public final InterfaceC3125S f9489q0;

    /* JADX INFO: renamed from: r0 */
    public final int f9490r0;

    /* JADX INFO: renamed from: s0 */
    public final int f9491s0;

    public C3152j0(InterfaceC3127U interfaceC3127U, Size size, InterfaceC3125S interfaceC3125S) {
        super(interfaceC3127U);
        this.f9488p0 = new Object();
        if (size == null) {
            this.f9490r0 = this.f9591Z.getWidth();
            this.f9491s0 = this.f9591Z.getHeight();
        } else {
            this.f9490r0 = size.getWidth();
            this.f9491s0 = size.getHeight();
        }
        this.f9489q0 = interfaceC3125S;
    }

    /* JADX INFO: renamed from: e */
    public final void m3988e(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, this.f9490r0, this.f9491s0)) {
                rect2.setEmpty();
            }
        }
        synchronized (this.f9488p0) {
        }
    }

    @Override // p178H.AbstractC3182z, p178H.InterfaceC3127U
    public final int getHeight() {
        return this.f9491s0;
    }

    @Override // p178H.AbstractC3182z, p178H.InterfaceC3127U
    public final int getWidth() {
        return this.f9490r0;
    }

    @Override // p178H.AbstractC3182z, p178H.InterfaceC3127U
    /* JADX INFO: renamed from: k0 */
    public final InterfaceC3125S mo3968k0() {
        return this.f9489q0;
    }
}

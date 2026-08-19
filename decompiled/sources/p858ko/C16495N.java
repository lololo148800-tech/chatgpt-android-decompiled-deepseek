package p858ko;

import io.sentry.util.C15504i;
import me.saket.telephoto.zoomable.internal.TappableAndQuickZoomableElement;
import me.saket.telephoto.zoomable.internal.TransformableElement;
import p049Bm.InterfaceC1436k;
import p1140z1.AbstractC21706n;
import p1140z1.InterfaceC21702l;
import p482Tg.C7445b0;
import p658b5.C11238i;
import p722e8.C13298H;
import p878lo.C17087J;
import p878lo.C17116y;

/* JADX INFO: renamed from: ko.N */
/* JADX INFO: loaded from: classes2.dex */
public final class C16495N extends AbstractC21706n implements InterfaceC21702l {

    /* JADX INFO: renamed from: B0 */
    public C16484C f51169B0;

    /* JADX INFO: renamed from: C0 */
    public C16500c f51170C0;

    /* JADX INFO: renamed from: D0 */
    public final C15504i f51171D0 = new C15504i(this, 5);

    /* JADX INFO: renamed from: E0 */
    public final C16491J f51172E0;

    /* JADX INFO: renamed from: F0 */
    public final C16491J f51173F0;

    /* JADX INFO: renamed from: G0 */
    public final C13298H f51174G0;

    /* JADX INFO: renamed from: H0 */
    public final C16491J f51175H0;

    /* JADX INFO: renamed from: I0 */
    public final C17116y f51176I0;

    /* JADX INFO: renamed from: J0 */
    public final C17087J f51177J0;

    public C16495N(InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, C16500c c16500c, C16484C c16484c, boolean z6) {
        this.f51169B0 = c16484c;
        this.f51170C0 = c16500c;
        C16491J c16491j = new C16491J(this, 1);
        this.f51172E0 = c16491j;
        C16491J c16491j2 = new C16491J(this, 0);
        this.f51173F0 = c16491j2;
        C13298H c13298h = new C13298H(this, 26);
        this.f51174G0 = c13298h;
        C16491J c16491j3 = new C16491J(this, 2);
        this.f51175H0 = c16491j3;
        C11238i c11238i = c16484c.f51149p;
        new TappableAndQuickZoomableElement(c16491j, interfaceC1436k, interfaceC1436k2, c16491j2, c13298h, c11238i, z6);
        C17116y c17116y = new C17116y(c16491j, interfaceC1436k, interfaceC1436k2, c16491j2, c13298h, c11238i, z6);
        this.f51176I0 = c17116y;
        C11238i c11238i2 = this.f51169B0.f51149p;
        C7445b0 c7445b0 = new C7445b0(1, this.f51169B0, C16484C.class, "canConsumePanChange", "canConsumePanChange-k-4lQ0M$zoomable_release(J)Z", 0, 26);
        new TransformableElement(c11238i2, c7445b0, z6, c16491j3);
        C17087J c17087j = new C17087J(c11238i2, c7445b0, z6, c16491j3);
        this.f51177J0 = c17087j;
        m22223K0(c17116y);
        m22223K0(c17087j);
    }
}

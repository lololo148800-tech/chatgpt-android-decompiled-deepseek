package p878lo;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p077Cn.C1743k;
import p1014t1.AbstractC19744u;
import p1014t1.C19723A;
import p1140z1.AbstractC21706n;
import p523V9.AbstractC8017W3;
import p658b5.C11238i;
import p722e8.C13298H;
import p858ko.C16491J;

/* JADX INFO: renamed from: lo.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C17116y extends AbstractC21706n {

    /* JADX INFO: renamed from: B0 */
    public C16491J f54704B0;

    /* JADX INFO: renamed from: C0 */
    public InterfaceC1436k f54705C0;

    /* JADX INFO: renamed from: D0 */
    public InterfaceC1436k f54706D0;

    /* JADX INFO: renamed from: E0 */
    public C16491J f54707E0;

    /* JADX INFO: renamed from: F0 */
    public C13298H f54708F0;

    /* JADX INFO: renamed from: G0 */
    public C11238i f54709G0;

    /* JADX INFO: renamed from: H0 */
    public boolean f54710H0;

    /* JADX INFO: renamed from: I0 */
    public final C1743k f54711I0;

    /* JADX INFO: renamed from: J0 */
    public final C19723A f54712J0;

    public C17116y(C16491J c16491j, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, C16491J c16491j2, C13298H c13298h, C11238i transformableState, boolean z6) {
        AbstractC16544l.m18094g(transformableState, "transformableState");
        this.f54704B0 = c16491j;
        this.f54705C0 = interfaceC1436k;
        this.f54706D0 = interfaceC1436k2;
        this.f54707E0 = c16491j2;
        this.f54708F0 = c13298h;
        this.f54709G0 = transformableState;
        this.f54710H0 = z6;
        this.f54711I0 = AbstractC8017W3.m8337a(Integer.MAX_VALUE, 6, null);
        C19723A c19723aM20693a = AbstractC19744u.m20693a(new C17115x(this, null));
        m22223K0(c19723aM20693a);
        this.f54712J0 = c19723aM20693a;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX INFO: renamed from: N0 */
    public final void m18894N0(C16491J onPress, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, C16491J onDoubleTap, C13298H onQuickZoomStopped, C11238i transformableState, boolean z6) {
        boolean z10;
        AbstractC16544l.m18094g(onPress, "onPress");
        AbstractC16544l.m18094g(onDoubleTap, "onDoubleTap");
        AbstractC16544l.m18094g(onQuickZoomStopped, "onQuickZoomStopped");
        AbstractC16544l.m18094g(transformableState, "transformableState");
        if ((this.f54705C0 == null) == (interfaceC1436k == null)) {
            z10 = ((this.f54706D0 == null) == (interfaceC1436k2 == null) && AbstractC16544l.m18089b(this.f54709G0, transformableState)) ? false : true;
        }
        this.f54704B0 = onPress;
        this.f54707E0 = onDoubleTap;
        this.f54710H0 = z6;
        this.f54708F0 = onQuickZoomStopped;
        if (z10) {
            this.f54705C0 = interfaceC1436k;
            this.f54706D0 = interfaceC1436k2;
            this.f54709G0 = transformableState;
            this.f54712J0.m20669M0();
        }
    }
}

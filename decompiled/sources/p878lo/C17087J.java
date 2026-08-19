package p878lo;

import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p077Cn.C1743k;
import p1014t1.AbstractC19744u;
import p1014t1.C19723A;
import p1140z1.AbstractC21706n;
import p1140z1.InterfaceC21702l;
import p482Tg.C7445b0;
import p523V9.AbstractC8017W3;
import p658b5.C11238i;
import p858ko.C16491J;

/* JADX INFO: renamed from: lo.J */
/* JADX INFO: loaded from: classes2.dex */
public final class C17087J extends AbstractC21706n implements InterfaceC21702l {

    /* JADX INFO: renamed from: B0 */
    public C11238i f54609B0;

    /* JADX INFO: renamed from: C0 */
    public AbstractC16541i f54610C0;

    /* JADX INFO: renamed from: D0 */
    public boolean f54611D0;

    /* JADX INFO: renamed from: E0 */
    public C16491J f54612E0;

    /* JADX INFO: renamed from: F0 */
    public final C17086I f54613F0;

    /* JADX INFO: renamed from: G0 */
    public final C17086I f54614G0;

    /* JADX INFO: renamed from: H0 */
    public final C1743k f54615H0;

    /* JADX INFO: renamed from: I0 */
    public final C19723A f54616I0;

    public C17087J(C11238i state, C7445b0 c7445b0, boolean z6, C16491J c16491j) {
        AbstractC16544l.m18094g(state, "state");
        this.f54609B0 = state;
        this.f54610C0 = c7445b0;
        this.f54611D0 = z6;
        this.f54612E0 = c16491j;
        this.f54613F0 = new C17086I(this, 0);
        this.f54614G0 = new C17086I(this, 1);
        this.f54615H0 = AbstractC8017W3.m8337a(Integer.MAX_VALUE, 6, null);
        C19723A c19723aM20693a = AbstractC19744u.m20693a(new C17085H(this, null));
        m22223K0(c19723aM20693a);
        this.f54616I0 = c19723aM20693a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N0 */
    public final void m18892N0(C11238i state, InterfaceC1436k interfaceC1436k, boolean z6, C16491J onTransformStopped) {
        AbstractC16544l.m18094g(state, "state");
        AbstractC16544l.m18094g(onTransformStopped, "onTransformStopped");
        this.f54610C0 = (AbstractC16541i) interfaceC1436k;
        this.f54612E0 = onTransformStopped;
        if (AbstractC16544l.m18089b(this.f54609B0, state) && this.f54611D0 == z6) {
            return;
        }
        this.f54609B0 = state;
        this.f54611D0 = z6;
        this.f54616I0.m20669M0();
    }
}

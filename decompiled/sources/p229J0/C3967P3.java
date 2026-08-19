package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p204I1.C3582M;
import p349O0.C6021p;
import p537W0.C8410b;

/* JADX INFO: renamed from: J0.P3 */
/* JADX INFO: loaded from: classes.dex */
public final class C3967P3 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ boolean f12362Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1439n f12363Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C8410b f12364o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1439n f12365p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C3582M f12366q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ long f12367r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ long f12368s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3967P3(boolean z6, InterfaceC1439n interfaceC1439n, C8410b c8410b, InterfaceC1439n interfaceC1439n2, C3582M c3582m, long j10, long j11) {
        super(2);
        this.f12362Y = z6;
        this.f12363Z = interfaceC1439n;
        this.f12364o0 = c8410b;
        this.f12365p0 = interfaceC1439n2;
        this.f12366q0 = c3582m;
        this.f12367r0 = j10;
        this.f12368s0 = j11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C6021p c6021p = (C6021p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C8410b c8410b = this.f12364o0;
            if (!this.f12362Y || this.f12363Z == null) {
                c6021p.m6524S(-810701708);
                AbstractC3996V3.m4715d(c8410b, this.f12363Z, this.f12365p0, this.f12366q0, this.f12367r0, this.f12368s0, c6021p, 0);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(-810715387);
                AbstractC3996V3.m4714c(c8410b, this.f12363Z, this.f12365p0, this.f12366q0, this.f12367r0, this.f12368s0, c6021p, 0);
                c6021p.m6553p(false);
            }
        }
        return C17296C.f55119a;
    }
}

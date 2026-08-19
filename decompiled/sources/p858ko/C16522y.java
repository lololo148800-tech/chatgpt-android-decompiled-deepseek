package p858ko;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p523V9.AbstractC8088f6;
import p544W9.AbstractC8753z4;
import p759g1.C13800b;

/* JADX INFO: renamed from: ko.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C16522y extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ long f51251Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16499b f51252Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16499b f51253o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f51254p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C16484C f51255q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16522y(long j10, C16499b c16499b, C16499b c16499b2, long j11, C16484C c16484c) {
        super(1);
        this.f51251Y = j10;
        this.f51252Z = c16499b;
        this.f51253o0 = c16499b2;
        this.f51254p0 = j11;
        this.f51255q0 = c16484c;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        long j10 = ((C13800b) obj).f43584a;
        C16499b c16499b = this.f51252Z;
        long jM18063a = c16499b.m18063a();
        long j11 = this.f51251Y;
        long jM15311l = C13800b.m15311l(j10, AbstractC8753z4.m9513a(j11, jM18063a));
        C16499b c16499b2 = this.f51253o0;
        long jM9513a = AbstractC8753z4.m9513a(j11, c16499b2.m18063a());
        long jM18063a2 = c16499b.m18063a();
        long j12 = this.f51254p0;
        long jM15310k = C13800b.m15310k(jM15311l, C13800b.m15311l(jM9513a, AbstractC8753z4.m9513a(j12, jM18063a2)));
        if (AbstractC8088f6.m8537c(jM15310k)) {
            return new C13800b(jM15310k);
        }
        throw new IllegalStateException("retainCentroidPositionAfterZoom() generated an infinite value. ".concat(this.f51255q0.m18053f(new C17309l("centroid", new C13800b(j11)), new C17309l("panDelta", new C13800b(j12)), new C17309l("oldZoom", c16499b), new C17309l("newZoom", c16499b2))).toString());
    }
}

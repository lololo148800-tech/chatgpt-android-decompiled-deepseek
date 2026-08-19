package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;

/* JADX INFO: renamed from: J0.u2 */
/* JADX INFO: loaded from: classes.dex */
public final class C4140u2 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ long f13413Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1426a f13414Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f13415o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f13416p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4140u2(long j10, InterfaceC1426a interfaceC1426a, boolean z6, int i10) {
        super(2);
        this.f13413Y = j10;
        this.f13414Z = interfaceC1426a;
        this.f13415o0 = z6;
        this.f13416p0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM6447d0 = C5997d.m6447d0(this.f13416p0 | 1);
        InterfaceC1426a interfaceC1426a = this.f13414Z;
        boolean z6 = this.f13415o0;
        AbstractC4152w2.m4782c(this.f13413Y, interfaceC1426a, z6, (C6021p) obj, iM6447d0);
        return C17296C.f55119a;
    }
}

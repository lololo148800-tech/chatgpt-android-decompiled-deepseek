package af;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8090g0;

/* JADX INFO: renamed from: af.M */
/* JADX INFO: loaded from: classes3.dex */
public final class C10557M extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31337Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C10575c0 f31338Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f31339o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f31340p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10557M(C10575c0 c10575c0, InterfaceC1436k interfaceC1436k, int i10, int i11) {
        super(2);
        this.f31337Y = i11;
        this.f31338Z = c10575c0;
        this.f31339o0 = interfaceC1436k;
        this.f31340p0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f31337Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC8090g0.m8555n(this.f31338Z, this.f31339o0, c6021p, C5997d.m6447d0(this.f31340p0 | 1));
                break;
            default:
                AbstractC8090g0.m8555n(this.f31338Z, this.f31339o0, c6021p, C5997d.m6447d0(this.f31340p0 | 1));
                break;
        }
        return C17296C.f55119a;
    }
}

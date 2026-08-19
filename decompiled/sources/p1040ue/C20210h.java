package p1040ue;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;

/* JADX INFO: renamed from: ue.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C20210h extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f63981Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f63982Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f63983o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C20206d f63984p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1436k f63985q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f63986r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20210h(boolean z6, boolean z10, C20206d c20206d, InterfaceC1436k interfaceC1436k, int i10, int i11) {
        super(2);
        this.f63981Y = i11;
        this.f63982Z = z6;
        this.f63983o0 = z10;
        this.f63984p0 = c20206d;
        this.f63985q0 = interfaceC1436k;
        this.f63986r0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f63981Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f63986r0 | 1);
                C20206d c20206d = this.f63984p0;
                InterfaceC1436k interfaceC1436k = this.f63985q0;
                AbstractC20211i.m21011a(this.f63982Z, this.f63983o0, c20206d, interfaceC1436k, (C6021p) obj, iM6447d0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f63986r0 | 1);
                C20206d c20206d2 = this.f63984p0;
                InterfaceC1436k interfaceC1436k2 = this.f63985q0;
                AbstractC20211i.m21012b(this.f63982Z, this.f63983o0, c20206d2, interfaceC1436k2, (C6021p) obj, iM6447d1);
                break;
        }
        return C17296C.f55119a;
    }
}

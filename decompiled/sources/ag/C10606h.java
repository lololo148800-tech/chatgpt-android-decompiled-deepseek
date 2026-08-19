package ag;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8114j0;

/* JADX INFO: renamed from: ag.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C10606h extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ String f31476Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f31477Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f31478o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1426a f31479p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f31480q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f31481r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10606h(String str, boolean z6, boolean z10, InterfaceC1426a interfaceC1426a, int i10, int i11) {
        super(2);
        this.f31476Y = str;
        this.f31477Z = z6;
        this.f31478o0 = z10;
        this.f31479p0 = interfaceC1426a;
        this.f31480q0 = i10;
        this.f31481r0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM6447d0 = C5997d.m6447d0(this.f31480q0 | 1);
        boolean z6 = this.f31477Z;
        AbstractC8114j0.m8611b(this.f31476Y, z6, this.f31478o0, this.f31479p0, (C6021p) obj, iM6447d0, this.f31481r0);
        return C17296C.f55119a;
    }
}

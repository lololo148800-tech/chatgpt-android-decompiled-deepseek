package p294Li;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p544W9.AbstractC8686o3;

/* JADX INFO: renamed from: Li.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C5079a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16630Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f16631Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f16632o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f16633p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1436k f16634q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f16635r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5079a(String str, boolean z6, boolean z10, InterfaceC1436k interfaceC1436k, int i10, int i11) {
        super(2);
        this.f16630Y = i11;
        this.f16631Z = str;
        this.f16632o0 = z6;
        this.f16633p0 = z10;
        this.f16634q0 = interfaceC1436k;
        this.f16635r0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16630Y) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC8686o3.m9382a(this.f16631Z, this.f16632o0, this.f16633p0, this.f16634q0, (C6021p) obj, C5997d.m6447d0(this.f16635r0 | 1));
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC8686o3.m9382a(this.f16631Z, this.f16632o0, this.f16633p0, this.f16634q0, (C6021p) obj, C5997d.m6447d0(this.f16635r0 | 1));
                break;
        }
        return C17296C.f55119a;
    }
}

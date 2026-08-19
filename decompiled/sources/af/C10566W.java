package af;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8090g0;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: af.W */
/* JADX INFO: loaded from: classes3.dex */
public final class C10566W extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC10459q f31365Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ float f31366Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f31367o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f31368p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f31369q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10566W(InterfaceC10459q interfaceC10459q, float f10, boolean z6, int i10, int i11) {
        super(2);
        this.f31365Y = interfaceC10459q;
        this.f31366Z = f10;
        this.f31367o0 = z6;
        this.f31368p0 = i10;
        this.f31369q0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC8090g0.m8549h(this.f31365Y, this.f31366Z, this.f31367o0, (C6021p) obj, C5997d.m6447d0(this.f31368p0 | 1), this.f31369q0);
        return C17296C.f55119a;
    }
}

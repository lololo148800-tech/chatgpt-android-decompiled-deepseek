package p169Gf;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p403Qd.C6600F;
import p523V9.AbstractC7966P5;
import p523V9.AbstractC7974Q5;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Gf.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C3037a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9134Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6600F f9135Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC10459q f9136o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f9137p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3037a(C6600F c6600f, InterfaceC10459q interfaceC10459q, int i10, int i11) {
        super(2);
        this.f9134Y = i11;
        this.f9135Z = c6600f;
        this.f9136o0 = interfaceC10459q;
        this.f9137p0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f9134Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC7966P5.m8253a(this.f9135Z, this.f9136o0, c6021p, C5997d.m6447d0(this.f9137p0 | 1));
                break;
            case 1:
                AbstractC7974Q5.m8274a(this.f9135Z, this.f9136o0, c6021p, C5997d.m6447d0(this.f9137p0 | 1));
                break;
            default:
                AbstractC7974Q5.m8274a(this.f9135Z, this.f9136o0, c6021p, C5997d.m6447d0(this.f9137p0 | 1));
                break;
        }
        return C17296C.f55119a;
    }
}

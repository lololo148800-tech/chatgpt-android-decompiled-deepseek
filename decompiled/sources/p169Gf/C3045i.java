package p169Gf;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p403Qd.C6639j0;
import p403Qd.EnumC6606L;
import p523V9.AbstractC7989S5;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Gf.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C3045i extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9181Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6639j0 f9182Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ EnumC6606L f9183o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1436k f9184p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC10459q f9185q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f9186r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3045i(C6639j0 c6639j0, EnumC6606L enumC6606L, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, int i10, int i11) {
        super(2);
        this.f9181Y = i11;
        this.f9182Z = c6639j0;
        this.f9183o0 = enumC6606L;
        this.f9184p0 = interfaceC1436k;
        this.f9185q0 = interfaceC10459q;
        this.f9186r0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9181Y) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC7989S5.m8292a(this.f9182Z, this.f9183o0, this.f9184p0, this.f9185q0, (C6021p) obj, C5997d.m6447d0(this.f9186r0 | 1));
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC7989S5.m8292a(this.f9182Z, this.f9183o0, this.f9184p0, this.f9185q0, (C6021p) obj, C5997d.m6447d0(this.f9186r0 | 1));
                break;
        }
        return C17296C.f55119a;
    }
}

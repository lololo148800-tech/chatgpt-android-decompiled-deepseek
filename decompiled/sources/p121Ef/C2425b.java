package p121Ef;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p040Bd.C1092h0;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC7877E4;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Ef.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2425b extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7540Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1092h0 f7541Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC10459q f7542o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f7543p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2425b(C1092h0 c1092h0, InterfaceC10459q interfaceC10459q, int i10, int i11) {
        super(2);
        this.f7540Y = i11;
        this.f7541Z = c1092h0;
        this.f7542o0 = interfaceC10459q;
        this.f7543p0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f7540Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC7877E4.m8152a(this.f7541Z, this.f7542o0, c6021p, C5997d.m6447d0(this.f7543p0 | 1));
                break;
            default:
                AbstractC7877E4.m8152a(this.f7541Z, this.f7542o0, c6021p, C5997d.m6447d0(this.f7543p0 | 1));
                break;
        }
        return C17296C.f55119a;
    }
}

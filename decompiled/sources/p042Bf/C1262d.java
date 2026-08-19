package p042Bf;

import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8050b0;
import p594Y9.AbstractC9997x4;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Bf.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C1262d extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3344Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ List f3345Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC10459q f3346o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f3347p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1262d(InterfaceC10459q interfaceC10459q, List list, int i10) {
        super(2);
        this.f3344Y = 2;
        this.f3346o0 = interfaceC10459q;
        this.f3345Z = list;
        this.f3347p0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f3344Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC1270l.m1983b(C5997d.m6447d0(this.f3347p0 | 1), c6021p, this.f3346o0, this.f3345Z);
                break;
            case 1:
                AbstractC8050b0.m8443d(C5997d.m6447d0(this.f3347p0 | 1), c6021p, this.f3346o0, this.f3345Z);
                break;
            default:
                AbstractC9997x4.m10639b(C5997d.m6447d0(this.f3347p0 | 1), c6021p, this.f3346o0, this.f3345Z);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1262d(List list, InterfaceC10459q interfaceC10459q, int i10, int i11) {
        super(2);
        this.f3344Y = i11;
        this.f3345Z = list;
        this.f3346o0 = interfaceC10459q;
        this.f3347p0 = i10;
    }
}

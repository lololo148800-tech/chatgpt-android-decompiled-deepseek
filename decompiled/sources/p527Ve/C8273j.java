package p527Ve;

import bf.C11349D;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8039Z4;
import p594Y9.AbstractC9809T2;
import p594Y9.AbstractC9815U2;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Ve.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C8273j extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f25788Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11349D f25789Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC10459q f25790o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f25791p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8273j(C11349D c11349d, InterfaceC10459q interfaceC10459q, int i10, int i11) {
        super(2);
        this.f25788Y = i11;
        this.f25789Z = c11349d;
        this.f25790o0 = interfaceC10459q;
        this.f25791p0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f25788Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC9809T2.m10434b(this.f25789Z, this.f25790o0, c6021p, C5997d.m6447d0(this.f25791p0 | 1));
                break;
            case 1:
                AbstractC9815U2.m10443b(this.f25789Z, this.f25790o0, c6021p, C5997d.m6447d0(this.f25791p0 | 1));
                break;
            case 2:
                AbstractC9815U2.m10444c(this.f25789Z, this.f25790o0, c6021p, C5997d.m6447d0(this.f25791p0 | 1));
                break;
            default:
                AbstractC8039Z4.m8399a(this.f25789Z, this.f25790o0, c6021p, C5997d.m6447d0(this.f25791p0 | 1));
                break;
        }
        return C17296C.f55119a;
    }
}

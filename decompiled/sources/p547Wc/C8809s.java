package p547Wc;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p324Mn.C5554x;
import p349O0.C5997d;
import p349O0.C6021p;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Wc.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C8809s extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f26970Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C5554x f26971Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f26972o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC10459q f26973p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f26974q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8809s(C5554x c5554x, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, int i10, int i11) {
        super(2);
        this.f26970Y = i11;
        this.f26971Z = c5554x;
        this.f26972o0 = interfaceC1436k;
        this.f26973p0 = interfaceC10459q;
        this.f26974q0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f26970Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                int iM6447d0 = C5997d.m6447d0(this.f26974q0 | 1);
                AbstractC8815y.m9537a(this.f26971Z, this.f26972o0, this.f26973p0, c6021p, iM6447d0);
                break;
            case 1:
                AbstractC8815y.m9538b(this.f26971Z, this.f26972o0, this.f26973p0, c6021p, C5997d.m6447d0(this.f26974q0 | 1));
                break;
            case 2:
                AbstractC8815y.m9539c(this.f26971Z, this.f26972o0, this.f26973p0, c6021p, C5997d.m6447d0(this.f26974q0 | 1));
                break;
            default:
                AbstractC8815y.m9541e(this.f26971Z, this.f26972o0, this.f26973p0, c6021p, C5997d.m6447d0(this.f26974q0 | 1));
                break;
        }
        return C17296C.f55119a;
    }
}

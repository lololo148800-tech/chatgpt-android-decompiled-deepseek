package p926of;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p040Bd.C0937I1;
import p049Bm.InterfaceC1439n;
import p1113xn.AbstractC21322p;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: of.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C18165b extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f57937Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18162Z f57938Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18165b(C18162Z c18162z, int i10) {
        super(2);
        this.f57937Y = i10;
        this.f57938Z = c18162z;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f57937Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C0937I1 c0937i1 = this.f57938Z.f57927b;
                    String host = Uri.parse(c0937i1.f2687c).getHost();
                    AbstractC4124r4.m4768b(AbstractC17680n.m19349Y(AbstractC17678l.m19315v(new String[]{host != null ? AbstractC21322p.m21688V(host, "www.") : null, c0937i1.f2688d}), " · ", null, null, 0, null, null, 62), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, null, c6021p, 0, 3120, 120830);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC4124r4.m4768b(this.f57938Z.f57927b.f2687c, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 8, 0, null, null, c6021p2, 0, 3120, 120830);
                }
                break;
        }
        return C17296C.f55119a;
    }
}

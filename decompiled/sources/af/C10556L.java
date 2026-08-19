package af;

import androidx.compose.foundation.lazy.C10845a;
import bf.C11349D;
import bf.C11363S;
import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1441p;
import p349O0.C6021p;
import p523V9.AbstractC8090g0;

/* JADX INFO: renamed from: af.L */
/* JADX INFO: loaded from: classes3.dex */
public final class C10556L extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ List f31333Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11363S f31334Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f31335o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f31336p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10556L(List list, C11363S c11363s, InterfaceC1436k interfaceC1436k, boolean z6) {
        super(4);
        this.f31333Y = list;
        this.f31334Z = c11363s;
        this.f31335o0 = interfaceC1436k;
        this.f31336p0 = z6;
    }

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        C10845a c10845a = (C10845a) obj;
        int iIntValue = ((Number) obj2).intValue();
        C6021p c6021p = (C6021p) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i10 = (c6021p.m6542f(c10845a) ? 4 : 2) | iIntValue2;
        } else {
            i10 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i10 |= c6021p.m6538d(iIntValue) ? 32 : 16;
        }
        if ((i10 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C11349D c11349d = (C11349D) this.f31333Y.get(iIntValue);
            c6021p.m6524S(1552186675);
            C11363S c11363s = this.f31334Z;
            AbstractC8090g0.m8542a(c11363s.f34359a, c11349d, this.f31335o0, c11363s, iIntValue, this.f31336p0, c6021p, ((i10 & 126) << 9) & 57344);
            c6021p.m6553p(false);
        }
        return C17296C.f55119a;
    }
}

package p547Wc;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.lazy.C10845a;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1441p;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p349O0.C5996c0;
import p349O0.C6021p;
import p467T1.C7199i;
import p478Tc.AbstractC7313q;
import p571X9.AbstractC9262b4;
import p635a1.C10456n;
import p909nm.AbstractC17680n;
import p936p0.C18273m;
import p936p0.C18280t;

/* JADX INFO: renamed from: Wc.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C8813w extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f26984Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ List f26985Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C18280t f26986o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1436k f26987p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8813w(int i10, List list, C18280t c18280t, InterfaceC1436k interfaceC1436k) {
        super(4);
        this.f26984Y = i10;
        this.f26985Z = list;
        this.f26986o0 = c18280t;
        this.f26987p0 = interfaceC1436k;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        C10845a items = (C10845a) obj;
        int iIntValue = ((Number) obj2).intValue();
        C6021p c6021p = (C6021p) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        AbstractC16544l.m18094g(items, "$this$items");
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= c6021p.m6538d(iIntValue) ? 32 : 16;
        }
        if ((iIntValue2 & 145) == 144 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            int i10 = this.f26984Y;
            int i11 = iIntValue + i10;
            List list = this.f26985Z;
            int size = i11 % list.size();
            int i12 = AbstractC8815y.f26995a;
            C18280t c18280t = this.f26986o0;
            C18273m c18273m = (C18273m) AbstractC17680n.m19353c0(c18280t.m19824g().f58296j);
            boolean z6 = i11 == ((int) (((((long) ((C5996c0) c18280t.f58348d.f1140b).m6412g()) + ((long) i10)) + ((long) (c18273m != null ? c18273m.f58304a + i10 : 0))) / ((long) 2)));
            if (z6 && c18280t.f58353i.mo5255a()) {
                this.f26987p0.invoke(list.get(size));
            }
            AbstractC4124r4.m4768b((String) list.get(size), AbstractC9262b4.m9836a(AbstractC10842a.m11235m(C10456n.f30959Y, 0.0f, AbstractC7313q.f23199d, 1), !z6), 0L, 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12154j, c6021p, 0, 0, 65020);
        }
        return C17296C.f55119a;
    }
}

package p339Nf;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p040Bd.C0928G4;
import p049Bm.InterfaceC1436k;
import p1081wc.InterfaceC20904w;
import p1155zi.C21965U0;
import p337Nd.C5711d;
import p406Qg.C6702M;
import p537W0.C8410b;
import p909nm.AbstractC17681o;
import p977r0.C18831c;
import p977r0.C18833e;

/* JADX INFO: renamed from: Nf.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C5728j extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ List f18574Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ List f18575Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Map f18576o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC20904w f18577p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ String f18578q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ String f18579r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC1436k f18580s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ long f18581t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5728j(List list, List list2, Map map, InterfaceC20904w interfaceC20904w, String str, String str2, InterfaceC1436k interfaceC1436k, long j10) {
        super(1);
        this.f18574Y = list;
        this.f18575Z = list2;
        this.f18576o0 = map;
        this.f18577p0 = interfaceC20904w;
        this.f18578q0 = str;
        this.f18579r0 = str2;
        this.f18580s0 = interfaceC1436k;
        this.f18581t0 = j10;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C5728j c5728j = this;
        C18833e LazyVerticalStaggeredGrid = (C18833e) obj;
        AbstractC16544l.m18094g(LazyVerticalStaggeredGrid, "$this$LazyVerticalStaggeredGrid");
        List list = c5728j.f18574Y;
        int i10 = 0;
        for (Object obj2 : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            C21965U0 c21965u0 = (C21965U0) obj2;
            List list2 = c5728j.f18575Z;
            String str = ((C0928G4) list2.get(i10)).f2674a;
            String str2 = ((C0928G4) list2.get(i10)).f2676c;
            String strM6157a = (String) c5728j.f18576o0.get(((C0928G4) list2.get(i10)).f2678e);
            if (strM6157a == null) {
                strM6157a = AbstractC5722d.m6157a(str);
            }
            C18833e c18833e = LazyVerticalStaggeredGrid;
            List list3 = list;
            c18833e.f59938b.m1047b(1, new C18831c(null, new C6702M(null, 5), null, new C8410b(new C5711d(new C8410b(new C5727i(c5728j.f18577p0, c5728j.f18578q0, c5728j.f18579r0, i10, list2, str, str2, c21965u0, list3, strM6157a, c5728j.f18580s0, c5728j.f18581t0), true, 1383164678), 1), true, 657818596)));
            LazyVerticalStaggeredGrid = c18833e;
            i10 = i11;
            list = list3;
            c5728j = this;
        }
        return C17296C.f55119a;
    }
}

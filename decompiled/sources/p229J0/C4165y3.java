package p229J0;

import af.AbstractC10578f;
import af.C10555K;
import af.C10556L;
import bf.C11363S;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p017Af.C0468O;
import p042Bf.C1278t;
import p049Bm.InterfaceC1436k;
import p1071w0.C20709G;
import p1071w0.C20750g0;
import p1113xn.AbstractC21322p;
import p1155zi.C22011h0;
import p124Ei.C2474R0;
import p156G1.C2963j;
import p204I1.C3581L;
import p204I1.C3590f;
import p318Mh.C5387a;
import p318Mh.C5431w;
import p318Mh.EnumC5421r;
import p350O1.C6045C;
import p350O1.C6049G;
import p350O1.C6052a;
import p350O1.C6062k;
import p492U1.InterfaceC7537b;
import p537W0.C8410b;
import p544W9.AbstractC8676n;
import p909nm.AbstractC17681o;
import p911o0.AbstractC17792x;
import p936p0.C18265e;

/* JADX INFO: renamed from: J0.y3 */
/* JADX INFO: loaded from: classes.dex */
public final class C4165y3 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f13530Y = 2;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f13531Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f13532o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f13533p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f13534q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4165y3(C11363S c11363s, boolean z6, InterfaceC1436k interfaceC1436k, boolean z10) {
        super(1);
        this.f13533p0 = c11363s;
        this.f13531Z = z6;
        this.f13534q0 = interfaceC1436k;
        this.f13532o0 = z10;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        int i10 = 4;
        C17296C c17296c = null;
        C17296C c17296c2 = C17296C.f55119a;
        int i11 = 0;
        boolean z6 = this.f13532o0;
        boolean z10 = this.f13531Z;
        Object obj2 = this.f13534q0;
        Object obj3 = this.f13533p0;
        switch (this.f13530Y) {
            case 0:
                return new C3880A3(this.f13531Z, (InterfaceC7537b) obj3, (EnumC3886B3) obj, (InterfaceC1436k) obj2, this.f13532o0);
            case 1:
                C5387a buildRoute = (C5387a) obj;
                AbstractC16544l.m18094g(buildRoute, "$this$buildRoute");
                C5431w.f17746g.getClass();
                buildRoute.m5900a(C5431w.f17747h, new C22011h0((String) obj3));
                buildRoute.m5900a(C5431w.f17758s, (EnumC5421r) obj2);
                buildRoute.m5900a(C5431w.f17756q, Boolean.valueOf(z10));
                buildRoute.m5900a(C5431w.f17754o, Boolean.valueOf(z6));
                return c17296c2;
            case 2:
                C18265e LazyColumn = (C18265e) obj;
                AbstractC16544l.m18094g(LazyColumn, "$this$LazyColumn");
                C11363S c11363s = (C11363S) obj3;
                AbstractC17792x.m19528k(LazyColumn, null, new C8410b(new C0468O(c11363s, 22), true, -961983080), 3);
                boolean z11 = c11363s.f34359a.f34367d;
                List list = c11363s.f34360b;
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) obj2;
                if (z11) {
                    LazyColumn.m19803p(list.size(), null, new C1278t(13, list), new C8410b(new C2474R0(list, c11363s, interfaceC1436k, i10), true, -632812321));
                } else {
                    LazyColumn.m19803p(list.size(), null, new C1278t(14, list), new C8410b(new C10556L(list, c11363s, interfaceC1436k, z6), true, -1091073711));
                }
                if (z10) {
                    for (int i12 = 0; i12 < 3; i12++) {
                        AbstractC17792x.m19528k(LazyColumn, null, AbstractC10578f.f31416a, 3);
                    }
                }
                AbstractC17792x.m19528k(LazyColumn, null, new C8410b(new C10555K(interfaceC1436k, c11363s, i11), true, 2101333327), 3);
                return c17296c2;
            default:
                C3590f c3590f = (C3590f) obj;
                if (z10 || !z6) {
                    return Boolean.FALSE;
                }
                C20750g0 c20750g0 = (C20750g0) obj3;
                C6049G c6049g = c20750g0.f65814e;
                C20709G c20709g = c20750g0.f65829t;
                if (c6049g != null) {
                    C6045C c6045cM16144b = c20750g0.f65813d.m16144b(AbstractC17681o.m19382k(new C6062k(), new C6052a(c3590f, 1)));
                    c6049g.m6623a(null, c6045cM16144b);
                    c20709g.invoke(c6045cM16144b);
                    c17296c = c17296c2;
                }
                if (c17296c == null) {
                    C6045C c6045c = (C6045C) obj2;
                    String str = c6045c.f19682a.f10934Y;
                    int i13 = C3581L.f10907c;
                    long j10 = c6045c.f19683b;
                    int i14 = (int) (j10 >> 32);
                    String string = AbstractC21322p.m21692Z(str, i14, (int) (j10 & 4294967295L), c3590f).toString();
                    int length = c3590f.f10934Y.length() + i14;
                    c20709g.invoke(new C6045C(AbstractC8676n.m9365b(length, length), string, 4));
                }
                return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4165y3(String str, EnumC5421r enumC5421r, boolean z6, boolean z10) {
        super(1);
        this.f13533p0 = str;
        this.f13534q0 = enumC5421r;
        this.f13531Z = z6;
        this.f13532o0 = z10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4165y3(boolean z6, InterfaceC7537b interfaceC7537b, InterfaceC1436k interfaceC1436k, boolean z10) {
        super(1);
        this.f13531Z = z6;
        this.f13533p0 = interfaceC7537b;
        this.f13534q0 = interfaceC1436k;
        this.f13532o0 = z10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4165y3(boolean z6, boolean z10, C20750g0 c20750g0, C2963j c2963j, C6045C c6045c) {
        super(1);
        this.f13531Z = z6;
        this.f13532o0 = z10;
        this.f13533p0 = c20750g0;
        this.f13534q0 = c6045c;
    }
}

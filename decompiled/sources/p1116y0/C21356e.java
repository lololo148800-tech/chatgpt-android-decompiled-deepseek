package p1116y0;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import om.C18235b;
import p029B0.C0714a;
import p029B0.C0715b;
import p1139z0.C21585H;
import p140Fa.C2685e;
import p204I1.C3581L;
import p349O0.C6002f0;
import p544W9.AbstractC8676n;
import p562X0.C9008c;
import p562X0.InterfaceC9019n;
import p571X9.AbstractC9393x3;
import p586Y0.C9566r;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: y0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C21356e implements InterfaceC21357f, InterfaceC9019n {

    /* JADX INFO: renamed from: Z */
    public static final C21356e f67823Z = new C21356e(0);

    /* JADX INFO: renamed from: o0 */
    public static final C21356e f67824o0 = new C21356e(1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f67825Y;

    public /* synthetic */ C21356e(int i10) {
        this.f67825Y = i10;
    }

    @Override // p562X0.InterfaceC9019n
    /* JADX INFO: renamed from: a */
    public Object mo3664a(C9008c c9008c, Object obj) {
        List listM19382k;
        switch (this.f67825Y) {
            case 1:
                C21358g c21358g = (C21358g) obj;
                String string = c21358g.m21750b().f67817Y.toString();
                long j10 = c21358g.m21750b().f67818Z;
                int i10 = C3581L.f10907c;
                Integer numValueOf = Integer.valueOf((int) (j10 >> 32));
                Integer numValueOf2 = Integer.valueOf((int) (c21358g.m21750b().f67818Z & 4294967295L));
                C21585H c21585h = c21358g.f67826a;
                C0714a c0714a = (C0714a) ((C6002f0) c21585h.f68345o0).getValue();
                if (c0714a != null) {
                    Integer numValueOf3 = Integer.valueOf(c0714a.f2061a);
                    int i11 = C3581L.f10907c;
                    long j11 = c0714a.f2064d;
                    Integer numValueOf4 = Integer.valueOf((int) (j11 >> 32));
                    Integer numValueOf5 = Integer.valueOf((int) (j11 & 4294967295L));
                    long j12 = c0714a.f2065e;
                    listM19382k = AbstractC17681o.m19382k(numValueOf3, c0714a.f2062b, c0714a.f2063c, numValueOf4, numValueOf5, Integer.valueOf((int) (j12 >> 32)), Integer.valueOf((int) (4294967295L & j12)), Long.valueOf(c0714a.f2066f));
                } else {
                    listM19382k = null;
                }
                return AbstractC17681o.m19382k(string, numValueOf, numValueOf2, AbstractC17681o.m19382k(listM19382k, AbstractC21360i.f67833Y.mo3664a(c9008c, (C0715b) c21585h.f68344Z)));
            default:
                C0715b c0715b = (C0715b) obj;
                C2685e c2685e = C0714a.f2060i;
                C18235b c18235bM9972b = AbstractC9393x3.m9972b();
                c18235bM9972b.add(Integer.valueOf(c0715b.f2069a));
                C9566r c9566r = c0715b.f2070b;
                c18235bM9972b.add(Integer.valueOf(c9566r.size()));
                C9566r c9566r2 = c0715b.f2071c;
                c18235bM9972b.add(Integer.valueOf(c9566r2.size()));
                int size = c9566r.size();
                for (int i12 = 0; i12 < size; i12++) {
                    c18235bM9972b.add(c2685e.mo3664a(c9008c, c9566r.get(i12)));
                }
                int size2 = c9566r2.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    c18235bM9972b.add(c2685e.mo3664a(c9008c, c9566r2.get(i13)));
                }
                return AbstractC9393x3.m9971a(c18235bM9972b);
        }
    }

    @Override // p562X0.InterfaceC9019n
    /* JADX INFO: renamed from: b */
    public Object mo3665b(Object obj) {
        switch (this.f67825Y) {
            case 1:
                List list = (List) obj;
                Object obj2 = list.get(0);
                Object obj3 = list.get(1);
                Object obj4 = list.get(2);
                Object obj5 = list.get(3);
                AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj2;
                AbstractC16544l.m18092e(obj3, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj3).intValue();
                AbstractC16544l.m18092e(obj4, "null cannot be cast to non-null type kotlin.Int");
                long jM9365b = AbstractC8676n.m9365b(iIntValue, ((Integer) obj4).intValue());
                AbstractC16544l.m18091d(obj5);
                List list2 = (List) obj5;
                Object obj6 = list2.get(0);
                Object obj7 = list2.get(1);
                C0714a c0714a = obj6 != null ? (C0714a) C0714a.f2060i.mo3665b(obj6) : null;
                C21356e c21356e = AbstractC21360i.f67833Y;
                AbstractC16544l.m18091d(obj7);
                return new C21358g(str, jM9365b, new C21585H(c0714a, (C0715b) c21356e.mo3665b(obj7)));
            default:
                List list3 = (List) obj;
                int iIntValue2 = ((Number) list3.get(0)).intValue();
                int iIntValue3 = ((Number) list3.get(1)).intValue();
                int iIntValue4 = ((Number) list3.get(2)).intValue();
                C2685e c2685e = C0714a.f2060i;
                C18235b c18235bM9972b = AbstractC9393x3.m9972b();
                int i10 = 3;
                while (i10 < iIntValue3 + 3) {
                    c18235bM9972b.add(c2685e.mo3665b(list3.get(i10)));
                    i10++;
                }
                C18235b c18235bM9971a = AbstractC9393x3.m9971a(c18235bM9972b);
                C18235b c18235bM9972b2 = AbstractC9393x3.m9972b();
                while (i10 < iIntValue3 + iIntValue4 + 3) {
                    c18235bM9972b2.add(c2685e.mo3665b(list3.get(i10)));
                    i10++;
                }
                return new C0715b(c18235bM9971a, AbstractC9393x3.m9971a(c18235bM9972b2), iIntValue2);
        }
    }

    public String toString() {
        switch (this.f67825Y) {
            case 0:
                return "TextFieldLineLimits.SingleLine";
            default:
                return super.toString();
        }
    }
}

package p748fc;

import android.graphics.Rect;
import ec.C13359a;
import ec.C13360b;
import ec.C13362d;
import java.util.Arrays;
import java.util.List;
import p501Ub.C7602d;
import p501Ub.C7604f;
import p523V9.AbstractC7862C5;
import p594Y9.AbstractC10009z4;
import p594Y9.AbstractC9710C4;
import p594Y9.AbstractC9950q;
import p594Y9.C10002y3;
import p594Y9.C9875d5;
import p594Y9.C9938o;
import p594Y9.C9998y;
import p594Y9.InterfaceC9882e5;
import p658b5.C11238i;
import p890mb.InterfaceC17207d;

/* JADX INFO: renamed from: fc.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13611c implements InterfaceC9882e5, InterfaceC17207d {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ C13611c f42997Z = new C13611c(0);

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ C13611c f42998o0 = new C13611c(1);

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ C13611c f42999p0 = new C13611c(2);

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ C13611c f43000q0 = new C13611c(3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f43001Y;

    public /* synthetic */ C13611c(int i10) {
        this.f43001Y = i10;
    }

    @Override // p890mb.InterfaceC17207d
    /* JADX INFO: renamed from: g */
    public Object mo391g(C11238i c11238i) {
        switch (this.f43001Y) {
            case 2:
                return new C13615g((C7604f) c11238i.mo12555a(C7604f.class));
            default:
                return new C13614f((C13615g) c11238i.mo12555a(C13615g.class), (C7602d) c11238i.mo12555a(C7602d.class));
        }
    }

    @Override // p594Y9.InterfaceC9882e5
    /* JADX INFO: renamed from: t */
    public Object mo3670t(Object obj) {
        String str;
        String str2;
        switch (this.f43001Y) {
            case 0:
                String str3 = ((C13360b) obj).f42400a;
                return str3 == null ? "" : str3;
            case 1:
                String str4 = ((C13362d) obj).f42400a;
                return str4 == null ? "" : str4;
            case 2:
            case 3:
            default:
                C9875d5 c9875d5 = (C9875d5) obj;
                List listM8139d = AbstractC7862C5.m8139d(c9875d5.f29383Z);
                String str5 = c9875d5.f29385p0;
                str = AbstractC10009z4.m10651d(str5) ? "" : str5;
                Rect rectM8138c = AbstractC7862C5.m8138c(listM8139d);
                String str6 = c9875d5.f29387r0;
                str2 = AbstractC10009z4.m10651d(str6) ? "und" : str6;
                float f10 = c9875d5.f29383Z.f29232q0;
                C9938o c9938o = AbstractC9950q.f29506Z;
                C9998y c9998y = C9998y.f29584q0;
                return new C13359a(str, rectM8138c, listM8139d, str2);
            case 4:
                C10002y3 c10002y3 = (C10002y3) obj;
                List listM8139d2 = AbstractC7862C5.m8139d(c10002y3.f29668Z);
                String str7 = c10002y3.f29671q0;
                str = AbstractC10009z4.m10651d(str7) ? "" : str7;
                Rect rectM8138c2 = AbstractC7862C5.m8138c(listM8139d2);
                String str8 = c10002y3.f29673s0;
                str2 = AbstractC10009z4.m10651d(str8) ? "und" : str8;
                AbstractC9710C4.m10304b(Arrays.asList(c10002y3.f29667Y), new C13611c(5));
                float f11 = c10002y3.f29668Z.f29232q0;
                return new C13360b(str, rectM8138c2, listM8139d2, str2);
        }
    }
}

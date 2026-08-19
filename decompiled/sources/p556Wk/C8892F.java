package p556Wk;

import java.nio.charset.Charset;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import ml.C17293k;
import mm.C17296C;
import ne.C17600b;
import np.InterfaceC17710b;
import p049Bm.InterfaceC1440o;
import p103Dn.C2153Q0;
import p1082wd.C20909b;
import p1155zi.C22020j1;
import p220Ih.InterfaceC3721c;
import p269Kh.C4676c;
import p269Kh.C4684k;
import p269Kh.C4688o;
import p405Qf.C6687b;
import p523V9.AbstractC8112i6;
import p544W9.AbstractC8627e4;
import p544W9.AbstractC8651i4;
import p571X9.AbstractC9233X;
import p754fl.C13693c;
import p857kl.AbstractC16435B;
import p857kl.AbstractC16459g;
import p857kl.C16447N;
import p857kl.C16460h;
import p857kl.C16477y;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Wk.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C8892F extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f27212Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f27213Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f27214o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f27215p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f27216q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8892F(Object obj, Object obj2, InterfaceC18770c interfaceC18770c, int i10) {
        super(3, interfaceC18770c);
        this.f27212Y = i10;
        this.f27215p0 = obj;
        this.f27216q0 = obj2;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f27212Y) {
            case 0:
                C8892F c8892f = new C8892F((String) this.f27215p0, (Charset) this.f27216q0, (InterfaceC18770c) obj3, 0);
                c8892f.f27213Z = (C13693c) obj;
                c8892f.f27214o0 = obj2;
                return c8892f.invokeSuspend(C17296C.f55119a);
            default:
                C4676c c4676c = (C4676c) obj;
                C22020j1 c22020j1 = (C22020j1) obj2;
                String str = c22020j1 != null ? c22020j1.f69665a : null;
                C8892F c8892f2 = new C8892F((C17600b) this.f27215p0, (InterfaceC3721c) this.f27216q0, (InterfaceC18770c) obj3, 1);
                c8892f2.f27213Z = c4676c;
                c8892f2.f27214o0 = str != null ? new C22020j1(str) : null;
                return c8892f2.invokeSuspend(C17296C.f55119a);
        }
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Charset charset;
        String str;
        Object obj2 = this.f27216q0;
        Object obj3 = this.f27215p0;
        switch (this.f27212Y) {
            case 0:
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                AbstractC9233X.m9807c(obj);
                C13693c c13693c = (C13693c) this.f27213Z;
                Object obj4 = this.f27214o0;
                InterfaceC17710b interfaceC17710b = AbstractC8895I.f27223a;
                C16477y c16477y = c13693c.f43197c;
                List list = AbstractC16435B.f50983a;
                String strM4540z = c16477y.m4540z("Accept-Charset");
                C16447N c16447n = c13693c.f43195a;
                if (strM4540z == null) {
                    StringBuilder sb2 = new StringBuilder("Adding Accept-Charset=");
                    String str2 = (String) obj3;
                    sb2.append(str2);
                    sb2.append(" to ");
                    sb2.append(c16447n);
                    AbstractC8895I.f27223a.mo19442g(sb2.toString());
                    c13693c.f43197c.m4522M("Accept-Charset", str2);
                }
                if (!(obj4 instanceof String)) {
                    return null;
                }
                C16460h c16460hM9326d = AbstractC8651i4.m9326d(c13693c);
                if (c16460hM9326d != null) {
                    if (!AbstractC16544l.m18089b(c16460hM9326d.f51066d, AbstractC16459g.f51063a.f51066d)) {
                        return null;
                    }
                }
                String str3 = (String) obj4;
                C16460h c16460h = c16460hM9326d == null ? AbstractC16459g.f51063a : c16460hM9326d;
                if (c16460hM9326d == null || (charset = AbstractC8627e4.m9277a(c16460hM9326d)) == null) {
                    charset = (Charset) obj2;
                }
                AbstractC8895I.f27223a.mo19442g("Sending request body to " + c16447n + " as text/plain with charset " + charset);
                AbstractC16544l.m18094g(c16460h, "<this>");
                AbstractC16544l.m18094g(charset, "charset");
                return new C17293k(str3, c16460h.m18037q("charset", AbstractC8112i6.m8606d(charset)));
            default:
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                AbstractC9233X.m9807c(obj);
                C4676c c4676c = (C4676c) this.f27213Z;
                C22020j1 c22020j1 = (C22020j1) this.f27214o0;
                String str4 = c22020j1 != null ? c22020j1.f69665a : null;
                C4688o c4688oM5394a = c4676c.m5394a(c4676c.f15225b);
                if (c4688oM5394a == null) {
                    c4688oM5394a = ((C17600b) obj3).f56348a;
                }
                C4688o c4688o = c4688oM5394a;
                C4688o c4688oM5395b = str4 != null ? c4676c.m5395b(str4) : null;
                if (c4688oM5395b != null) {
                    C4684k c4684kM5397d = c4676c.m5397d(c4688oM5395b.f15253b);
                    str = c4684kM5397d != null ? c4684kM5397d.f15238c : null;
                } else {
                    str = null;
                }
                if (c4688oM5395b != null) {
                    C2153Q0 c2153q0 = ((C6687b) ((InterfaceC3721c) obj2)).f21505e;
                    c2153q0.getClass();
                    c2153q0.m3251l(null, c4688oM5395b);
                }
                return new C20909b(null, c4688o, str, c4688oM5395b, 9);
        }
    }
}

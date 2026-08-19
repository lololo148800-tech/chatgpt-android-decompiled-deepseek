package p346Nn;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p003A1.C0292u;
import p389Pn.AbstractC6516a;
import p389Pn.C6528m;
import p389Pn.C6534s;
import p389Pn.InterfaceC6526k;
import p412Qn.C6760a;
import p412Qn.InterfaceC6762c;
import p437Rn.C6951i;
import p437Rn.C6960r;
import p437Rn.C6962t;
import p437Rn.C6968z;
import p571X9.AbstractC9333n3;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17681o;
import p909nm.C17689w;

/* JADX INFO: renamed from: Nn.x0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5933x0 implements InterfaceC6526k {

    /* JADX INFO: renamed from: a */
    public final C6528m f19306a;

    /* JADX INFO: renamed from: b */
    public final Integer f19307b;

    /* JADX INFO: renamed from: c */
    public final Integer f19308c;

    /* JADX INFO: renamed from: d */
    public final Integer f19309d;

    /* JADX INFO: renamed from: e */
    public final EnumC5897f0 f19310e;

    /* JADX INFO: renamed from: f */
    public final boolean f19311f;

    public C5933x0(EnumC5897f0 padding) {
        AbstractC16544l.m18094g(padding, "padding");
        C6528m field = AbstractC5908l.f19238a;
        int i10 = padding == EnumC5897f0.f19227Z ? 4 : 1;
        Integer numValueOf = Integer.valueOf(i10);
        Integer num = padding == EnumC5897f0.f19228o0 ? 4 : null;
        AbstractC16544l.m18094g(field, "field");
        this.f19306a = field;
        this.f19307b = numValueOf;
        this.f19308c = num;
        this.f19309d = 4;
        if (i10 >= 0) {
            this.f19310e = padding;
            this.f19311f = false;
        } else {
            throw new IllegalArgumentException(("The minimum number of digits (" + numValueOf + ") is negative").toString());
        }
    }

    @Override // p389Pn.InterfaceC6526k
    /* JADX INFO: renamed from: a */
    public final InterfaceC6762c mo6320a() {
        new C0292u(1, this.f19306a.f21138a, C6534s.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0, 21);
        Integer num = this.f19307b;
        int iIntValue = num != null ? num.intValue() : 0;
        C6760a c6760a = new C6760a();
        if (iIntValue < 0) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(iIntValue, "The minimum number of digits (", ") is negative").toString());
        }
        if (iIntValue <= 9) {
            return this.f19308c != null ? new C6760a() : c6760a;
        }
        throw new IllegalArgumentException(AbstractC0010F.m19c(iIntValue, "The minimum number of digits (", ") exceeds the length of an Int").toString());
    }

    @Override // p389Pn.InterfaceC6526k
    /* JADX INFO: renamed from: b */
    public final C6960r mo6321b() {
        C6528m c6528m = this.f19306a;
        C6534s setter = c6528m.f21138a;
        AbstractC16544l.m18094g(setter, "setter");
        String name = c6528m.f21139b;
        AbstractC16544l.m18094g(name, "name");
        Integer num = this.f19307b;
        Integer num2 = this.f19308c;
        ArrayList arrayListM19384m = AbstractC17681o.m19384m(AbstractC9333n3.m9930a(num, null, num2, setter, name, true));
        C17689w c17689w = C17689w.f56480Y;
        Integer num3 = this.f19309d;
        if (num3 != null) {
            arrayListM19384m.add(AbstractC9333n3.m9930a(num, num3, num2, setter, name, false));
            arrayListM19384m.add(new C6960r(AbstractC17681o.m19382k(new C6962t("+"), new C6951i(AbstractC9393x3.m9974d(new C6968z(Integer.valueOf(num3.intValue() + 1), null, setter, name, false)))), c17689w));
        } else {
            arrayListM19384m.add(AbstractC9333n3.m9930a(num, null, num2, setter, name, false));
        }
        return new C6960r(c17689w, arrayListM19384m);
    }

    @Override // p389Pn.InterfaceC6526k
    /* JADX INFO: renamed from: c */
    public final AbstractC6516a mo6322c() {
        return this.f19306a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5933x0) {
            C5933x0 c5933x0 = (C5933x0) obj;
            if (this.f19310e == c5933x0.f19310e && this.f19311f == c5933x0.f19311f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f19310e.hashCode() * 31) + (this.f19311f ? 1231 : 1237);
    }
}

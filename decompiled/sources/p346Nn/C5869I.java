package p346Nn;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p009A7.FlM.nkFZpTrMPpn;
import p324Mn.AbstractC5530K;
import p324Mn.C5527H;
import p437Rn.InterfaceC6945c;

/* JADX INFO: renamed from: Nn.I */
/* JADX INFO: loaded from: classes2.dex */
public final class C5869I implements InterfaceC5917p0, InterfaceC6945c {

    /* JADX INFO: renamed from: a */
    public Boolean f19185a;

    /* JADX INFO: renamed from: b */
    public Integer f19186b;

    /* JADX INFO: renamed from: c */
    public Integer f19187c;

    /* JADX INFO: renamed from: d */
    public Integer f19188d;

    public C5869I(Boolean bool, Integer num, Integer num2, Integer num3) {
        this.f19185a = bool;
        this.f19186b = num;
        this.f19187c = num2;
        this.f19188d = num3;
    }

    @Override // p346Nn.InterfaceC5917p0
    /* JADX INFO: renamed from: A */
    public final void mo6282A(Integer num) {
        this.f19186b = num;
    }

    @Override // p346Nn.InterfaceC5917p0
    /* JADX INFO: renamed from: C */
    public final void mo6283C(Integer num) {
        this.f19188d = num;
    }

    @Override // p437Rn.InterfaceC6945c
    /* JADX INFO: renamed from: a */
    public final Object mo6257a() {
        return new C5869I(this.f19185a, this.f19186b, this.f19187c, this.f19188d);
    }

    /* JADX INFO: renamed from: b */
    public final C5527H m6284b() {
        int i10 = AbstractC16544l.m18089b(this.f19185a, Boolean.TRUE) ? -1 : 1;
        Integer num = this.f19186b;
        Integer numValueOf = num != null ? Integer.valueOf(num.intValue() * i10) : null;
        Integer num2 = this.f19187c;
        Integer numValueOf2 = num2 != null ? Integer.valueOf(num2.intValue() * i10) : null;
        Integer num3 = this.f19188d;
        return AbstractC5530K.m5927a(numValueOf, numValueOf2, num3 != null ? Integer.valueOf(num3.intValue() * i10) : null);
    }

    @Override // p346Nn.InterfaceC5917p0
    /* JADX INFO: renamed from: c */
    public final Integer mo6285c() {
        return this.f19186b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5869I) {
            C5869I c5869i = (C5869I) obj;
            if (AbstractC16544l.m18089b(this.f19185a, c5869i.f19185a) && AbstractC16544l.m18089b(this.f19186b, c5869i.f19186b) && AbstractC16544l.m18089b(this.f19187c, c5869i.f19187c) && AbstractC16544l.m18089b(this.f19188d, c5869i.f19188d)) {
                return true;
            }
        }
        return false;
    }

    @Override // p346Nn.InterfaceC5917p0
    /* JADX INFO: renamed from: g */
    public final Integer mo6286g() {
        return this.f19188d;
    }

    public final int hashCode() {
        Boolean bool = this.f19185a;
        int iHashCode = bool != null ? bool.hashCode() : 0;
        Integer num = this.f19186b;
        int iHashCode2 = iHashCode + (num != null ? num.hashCode() : 0);
        Integer num2 = this.f19187c;
        int iHashCode3 = iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        Integer num3 = this.f19188d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // p346Nn.InterfaceC5917p0
    /* JADX INFO: renamed from: p */
    public final Integer mo6287p() {
        return this.f19187c;
    }

    @Override // p346Nn.InterfaceC5917p0
    /* JADX INFO: renamed from: v */
    public final Boolean mo6288v() {
        return this.f19185a;
    }

    @Override // p346Nn.InterfaceC5917p0
    /* JADX INFO: renamed from: w */
    public final void mo6289w(Boolean bool) {
        this.f19185a = bool;
    }

    @Override // p346Nn.InterfaceC5917p0
    /* JADX INFO: renamed from: y */
    public final void mo6290y(Integer num) {
        this.f19187c = num;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        Boolean bool = this.f19185a;
        if (bool != null) {
            str = bool.booleanValue() ? nkFZpTrMPpn.MJDp : "+";
        } else {
            str = Separators.f31991SP;
        }
        sb2.append(str);
        Object obj = this.f19186b;
        if (obj == null) {
            obj = "??";
        }
        sb2.append(obj);
        sb2.append(':');
        Object obj2 = this.f19187c;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb2.append(obj2);
        sb2.append(':');
        Integer num = this.f19188d;
        sb2.append(num != null ? num : "??");
        return sb2.toString();
    }
}

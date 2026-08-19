package p1126yd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p324Mn.C5551u;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: yd.u */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21500u {
    public static final C21498t Companion = new C21498t();

    /* JADX INFO: renamed from: a */
    public final String f68112a;

    /* JADX INFO: renamed from: b */
    public final String f68113b;

    /* JADX INFO: renamed from: c */
    public final String f68114c;

    /* JADX INFO: renamed from: d */
    public final boolean f68115d;

    /* JADX INFO: renamed from: e */
    public final C5551u f68116e;

    /* JADX INFO: renamed from: f */
    public final AbstractC21504w f68117f;

    public C21500u(int i10, String str, String str2, String str3, boolean z6, C5551u c5551u, AbstractC21504w abstractC21504w) {
        if (55 != (i10 & 55)) {
            AbstractC11153a0.m12389l(i10, 55, C21496s.f68110a.getDescriptor());
            throw null;
        }
        this.f68112a = str;
        this.f68113b = str2;
        this.f68114c = str3;
        if ((i10 & 8) == 0) {
            this.f68115d = false;
        } else {
            this.f68115d = z6;
        }
        this.f68116e = c5551u;
        this.f68117f = abstractC21504w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21500u)) {
            return false;
        }
        C21500u c21500u = (C21500u) obj;
        return AbstractC16544l.m18089b(this.f68112a, c21500u.f68112a) && AbstractC16544l.m18089b(this.f68113b, c21500u.f68113b) && AbstractC16544l.m18089b(this.f68114c, c21500u.f68114c) && this.f68115d == c21500u.f68115d && AbstractC16544l.m18089b(this.f68116e, c21500u.f68116e) && AbstractC16544l.m18089b(this.f68117f, c21500u.f68117f);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f68112a.hashCode() * 31, 31, this.f68113b);
        String str = this.f68114c;
        return this.f68117f.hashCode() + ((this.f68116e.f18004Y.hashCode() + ((((iM527p + (str == null ? 0 : str.hashCode())) * 31) + (this.f68115d ? 1231 : 1237)) * 31)) * 31);
    }

    public final String toString() {
        return "█";
    }
}

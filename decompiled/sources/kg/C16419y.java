package kg;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p098Di.InterfaceC2062k;
import p1155zi.InterfaceC21925I1;

/* JADX INFO: renamed from: kg.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C16419y implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final String f50945a;

    /* JADX INFO: renamed from: b */
    public final String f50946b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC21925I1 f50947c;

    /* JADX INFO: renamed from: d */
    public final boolean f50948d;

    public C16419y(String str, String code, InterfaceC21925I1 interfaceC21925I1, boolean z6) {
        AbstractC16544l.m18094g(code, "code");
        this.f50945a = str;
        this.f50946b = code;
        this.f50947c = interfaceC21925I1;
        this.f50948d = z6;
    }

    /* JADX INFO: renamed from: e */
    public static C16419y m18007e(C16419y c16419y, String str, String code, InterfaceC21925I1 interfaceC21925I1, boolean z6, int i10) {
        if ((i10 & 1) != 0) {
            str = c16419y.f50945a;
        }
        if ((i10 & 2) != 0) {
            code = c16419y.f50946b;
        }
        if ((i10 & 4) != 0) {
            interfaceC21925I1 = c16419y.f50947c;
        }
        if ((i10 & 8) != 0) {
            z6 = c16419y.f50948d;
        }
        c16419y.getClass();
        AbstractC16544l.m18094g(code, "code");
        return new C16419y(str, code, interfaceC21925I1, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16419y)) {
            return false;
        }
        C16419y c16419y = (C16419y) obj;
        return AbstractC16544l.m18089b(this.f50945a, c16419y.f50945a) && AbstractC16544l.m18089b(this.f50946b, c16419y.f50946b) && AbstractC16544l.m18089b(this.f50947c, c16419y.f50947c) && this.f50948d == c16419y.f50948d;
    }

    public final int hashCode() {
        String str = this.f50945a;
        int iM527p = AbstractC0168G.m527p((str == null ? 0 : str.hashCode()) * 31, 31, this.f50946b);
        InterfaceC21925I1 interfaceC21925I1 = this.f50947c;
        return ((iM527p + (interfaceC21925I1 != null ? interfaceC21925I1.hashCode() : 0)) * 31) + (this.f50948d ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}

package ng;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p098Di.InterfaceC2062k;
import p1155zi.InterfaceC21925I1;

/* JADX INFO: renamed from: ng.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C17618i implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final String f56375a;

    /* JADX INFO: renamed from: b */
    public final String f56376b;

    /* JADX INFO: renamed from: c */
    public final boolean f56377c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC21925I1 f56378d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC21925I1 f56379e;

    public /* synthetic */ C17618i(String str, int i10) {
        this((i10 & 1) != 0 ? null : str, "", false, null, null);
    }

    /* JADX INFO: renamed from: e */
    public static C17618i m19228e(C17618i c17618i, String str, String str2, boolean z6, InterfaceC21925I1 interfaceC21925I1, InterfaceC21925I1 interfaceC21925I2, int i10) {
        if ((i10 & 1) != 0) {
            str = c17618i.f56375a;
        }
        String str3 = str;
        if ((i10 & 2) != 0) {
            str2 = c17618i.f56376b;
        }
        String code = str2;
        if ((i10 & 4) != 0) {
            z6 = c17618i.f56377c;
        }
        boolean z10 = z6;
        if ((i10 & 8) != 0) {
            interfaceC21925I1 = c17618i.f56378d;
        }
        InterfaceC21925I1 interfaceC21925I3 = interfaceC21925I1;
        if ((i10 & 16) != 0) {
            interfaceC21925I2 = c17618i.f56379e;
        }
        c17618i.getClass();
        AbstractC16544l.m18094g(code, "code");
        return new C17618i(str3, code, z10, interfaceC21925I3, interfaceC21925I2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17618i)) {
            return false;
        }
        C17618i c17618i = (C17618i) obj;
        return AbstractC16544l.m18089b(this.f56375a, c17618i.f56375a) && AbstractC16544l.m18089b(this.f56376b, c17618i.f56376b) && this.f56377c == c17618i.f56377c && AbstractC16544l.m18089b(this.f56378d, c17618i.f56378d) && AbstractC16544l.m18089b(this.f56379e, c17618i.f56379e);
    }

    public final int hashCode() {
        String str = this.f56375a;
        int iM527p = (AbstractC0168G.m527p((str == null ? 0 : str.hashCode()) * 31, 31, this.f56376b) + (this.f56377c ? 1231 : 1237)) * 31;
        InterfaceC21925I1 interfaceC21925I1 = this.f56378d;
        int iHashCode = (iM527p + (interfaceC21925I1 == null ? 0 : interfaceC21925I1.hashCode())) * 31;
        InterfaceC21925I1 interfaceC21925I2 = this.f56379e;
        return iHashCode + (interfaceC21925I2 != null ? interfaceC21925I2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C17618i(String str, String code, boolean z6, InterfaceC21925I1 interfaceC21925I1, InterfaceC21925I1 interfaceC21925I2) {
        AbstractC16544l.m18094g(code, "code");
        this.f56375a = str;
        this.f56376b = code;
        this.f56377c = z6;
        this.f56378d = interfaceC21925I1;
        this.f56379e = interfaceC21925I2;
    }
}

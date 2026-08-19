package ng;

import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;
import p1155zi.InterfaceC21925I1;

/* JADX INFO: renamed from: ng.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C17613d implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final String f56369a;

    /* JADX INFO: renamed from: b */
    public final boolean f56370b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC21925I1 f56371c;

    public /* synthetic */ C17613d() {
        this("", false, null);
    }

    /* JADX INFO: renamed from: e */
    public static C17613d m19227e(C17613d c17613d, String email, boolean z6, InterfaceC21925I1 interfaceC21925I1, int i10) {
        if ((i10 & 1) != 0) {
            email = c17613d.f56369a;
        }
        if ((i10 & 2) != 0) {
            z6 = c17613d.f56370b;
        }
        if ((i10 & 4) != 0) {
            interfaceC21925I1 = c17613d.f56371c;
        }
        c17613d.getClass();
        AbstractC16544l.m18094g(email, "email");
        return new C17613d(email, z6, interfaceC21925I1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17613d)) {
            return false;
        }
        C17613d c17613d = (C17613d) obj;
        return AbstractC16544l.m18089b(this.f56369a, c17613d.f56369a) && this.f56370b == c17613d.f56370b && AbstractC16544l.m18089b(this.f56371c, c17613d.f56371c);
    }

    public final int hashCode() {
        int iHashCode = ((this.f56369a.hashCode() * 31) + (this.f56370b ? 1231 : 1237)) * 31;
        InterfaceC21925I1 interfaceC21925I1 = this.f56371c;
        return iHashCode + (interfaceC21925I1 == null ? 0 : interfaceC21925I1.hashCode());
    }

    public final String toString() {
        return "█";
    }

    public C17613d(String email, boolean z6, InterfaceC21925I1 interfaceC21925I1) {
        AbstractC16544l.m18094g(email, "email");
        this.f56369a = email;
        this.f56370b = z6;
        this.f56371c = interfaceC21925I1;
    }
}

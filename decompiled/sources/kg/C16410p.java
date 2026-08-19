package kg;

import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;
import p1155zi.InterfaceC21925I1;

/* JADX INFO: renamed from: kg.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C16410p implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final String f50934a;

    /* JADX INFO: renamed from: b */
    public final boolean f50935b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC21925I1 f50936c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC21925I1 f50937d;

    public C16410p(String str, boolean z6, InterfaceC21925I1 interfaceC21925I1, InterfaceC21925I1 interfaceC21925I2) {
        this.f50934a = str;
        this.f50935b = z6;
        this.f50936c = interfaceC21925I1;
        this.f50937d = interfaceC21925I2;
    }

    /* JADX INFO: renamed from: e */
    public static C16410p m18006e(C16410p c16410p, String str, InterfaceC21925I1 interfaceC21925I1, InterfaceC21925I1 interfaceC21925I2, int i10) {
        if ((i10 & 1) != 0) {
            str = c16410p.f50934a;
        }
        boolean z6 = (i10 & 2) != 0 ? c16410p.f50935b : false;
        if ((i10 & 4) != 0) {
            interfaceC21925I1 = c16410p.f50936c;
        }
        if ((i10 & 8) != 0) {
            interfaceC21925I2 = c16410p.f50937d;
        }
        c16410p.getClass();
        return new C16410p(str, z6, interfaceC21925I1, interfaceC21925I2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16410p)) {
            return false;
        }
        C16410p c16410p = (C16410p) obj;
        return AbstractC16544l.m18089b(this.f50934a, c16410p.f50934a) && this.f50935b == c16410p.f50935b && AbstractC16544l.m18089b(this.f50936c, c16410p.f50936c) && AbstractC16544l.m18089b(this.f50937d, c16410p.f50937d);
    }

    public final int hashCode() {
        String str = this.f50934a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + (this.f50935b ? 1231 : 1237)) * 31;
        InterfaceC21925I1 interfaceC21925I1 = this.f50936c;
        int iHashCode2 = (iHashCode + (interfaceC21925I1 == null ? 0 : interfaceC21925I1.hashCode())) * 31;
        InterfaceC21925I1 interfaceC21925I2 = this.f50937d;
        return iHashCode2 + (interfaceC21925I2 != null ? interfaceC21925I2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}

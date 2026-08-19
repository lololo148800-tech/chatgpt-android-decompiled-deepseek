package p1108xi;

import ao.AbstractC11153a0;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17321x;
import p559Wn.InterfaceC8975g;
import p774h1.C14365u;

/* JADX INFO: renamed from: xi.f */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21269f {
    public static final C21268e Companion = new C21268e();

    /* JADX INFO: renamed from: a */
    public final String f67639a;

    /* JADX INFO: renamed from: b */
    public final C14365u f67640b;

    /* JADX INFO: renamed from: c */
    public final Integer f67641c;

    /* JADX INFO: renamed from: d */
    public final List f67642d;

    public C21269f(int i10, String str, C14365u c14365u, Integer num, List list) {
        if (9 != (i10 & 9)) {
            AbstractC11153a0.m12389l(i10, 9, C21267d.f67638a.getDescriptor());
            throw null;
        }
        this.f67639a = str;
        if ((i10 & 2) == 0) {
            this.f67640b = null;
        } else {
            this.f67640b = c14365u;
        }
        if ((i10 & 4) == 0) {
            this.f67641c = null;
        } else {
            this.f67641c = num;
        }
        this.f67642d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21269f)) {
            return false;
        }
        C21269f c21269f = (C21269f) obj;
        return AbstractC16544l.m18089b(this.f67639a, c21269f.f67639a) && AbstractC16544l.m18089b(this.f67640b, c21269f.f67640b) && AbstractC16544l.m18089b(this.f67641c, c21269f.f67641c) && AbstractC16544l.m18089b(this.f67642d, c21269f.f67642d);
    }

    public final int hashCode() {
        int iHashCode = this.f67639a.hashCode() * 31;
        C14365u c14365u = this.f67640b;
        int iM18981a = (iHashCode + (c14365u == null ? 0 : C17321x.m18981a(c14365u.f45062a))) * 31;
        Integer num = this.f67641c;
        return this.f67642d.hashCode() + ((iM18981a + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "█";
    }
}

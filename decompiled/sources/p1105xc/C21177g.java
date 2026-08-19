package p1105xc;

import java.util.List;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: xc.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C21177g {

    /* JADX INFO: renamed from: a */
    public final String f67319a;

    /* JADX INFO: renamed from: b */
    public final List f67320b;

    public C21177g(String str, List list) {
        C21179i c21179i = EnumC21180j.Companion;
        this.f67319a = str;
        this.f67320b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21177g)) {
            return false;
        }
        C21177g c21177g = (C21177g) obj;
        c21177g.getClass();
        C21179i c21179i = EnumC21180j.Companion;
        return this.f67319a.equals(c21177g.f67319a) && this.f67320b.equals(c21177g.f67320b);
    }

    public final int hashCode() {
        return this.f67320b.hashCode() + AbstractC0168G.m527p(EnumC21180j.f67323Z.hashCode() * 31, 31, this.f67319a);
    }

    public final String toString() {
        return "█";
    }
}

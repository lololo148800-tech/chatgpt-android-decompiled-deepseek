package p1042uh;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: uh.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C20279o {

    /* JADX INFO: renamed from: a */
    public final String f64120a;

    /* JADX INFO: renamed from: b */
    public final String f64121b;

    /* JADX INFO: renamed from: c */
    public final Boolean f64122c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f64123d;

    public C20279o(String str, String str2, Boolean bool, ArrayList arrayList) {
        this.f64120a = str;
        this.f64121b = str2;
        this.f64122c = bool;
        this.f64123d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20279o)) {
            return false;
        }
        C20279o c20279o = (C20279o) obj;
        return AbstractC16544l.m18089b(this.f64120a, c20279o.f64120a) && AbstractC16544l.m18089b(this.f64121b, c20279o.f64121b) && AbstractC16544l.m18089b(this.f64122c, c20279o.f64122c) && this.f64123d.equals(c20279o.f64123d);
    }

    public final int hashCode() {
        String str = this.f64120a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f64121b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f64122c;
        return this.f64123d.hashCode() + ((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "█";
    }
}

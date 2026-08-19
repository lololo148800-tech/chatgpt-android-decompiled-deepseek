package p204I1;

import com.google.protobuf.AbstractC12107L1;
import p393Q1.C6551c;
import p548Wd.p549VF.zakks;

/* JADX INFO: renamed from: I1.r */
/* JADX INFO: loaded from: classes.dex */
public final class C3602r {

    /* JADX INFO: renamed from: a */
    public final C6551c f10975a;

    /* JADX INFO: renamed from: b */
    public final int f10976b;

    /* JADX INFO: renamed from: c */
    public final int f10977c;

    public C3602r(C6551c c6551c, int i10, int i11) {
        this.f10975a = c6551c;
        this.f10976b = i10;
        this.f10977c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3602r)) {
            return false;
        }
        C3602r c3602r = (C3602r) obj;
        return this.f10975a.equals(c3602r.f10975a) && this.f10976b == c3602r.f10976b && this.f10977c == c3602r.f10977c;
    }

    public final int hashCode() {
        return (((this.f10975a.hashCode() * 31) + this.f10976b) * 31) + this.f10977c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb2.append(this.f10975a);
        sb2.append(", startIndex=");
        sb2.append(this.f10976b);
        sb2.append(zakks.QqY);
        return AbstractC12107L1.m13826q(sb2, this.f10977c, ')');
    }
}

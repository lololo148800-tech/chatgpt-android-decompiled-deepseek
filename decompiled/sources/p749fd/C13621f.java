package p749fd;

import com.google.protobuf.AbstractC12107L1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p774h1.C14365u;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: fd.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C13621f {

    /* JADX INFO: renamed from: a */
    public final List f43031a;

    /* JADX INFO: renamed from: b */
    public final float f43032b;

    /* JADX INFO: renamed from: c */
    public final long f43033c;

    /* JADX INFO: renamed from: d */
    public final float f43034d;

    public C13621f(List list, float f10, long j10, float f11) {
        this.f43031a = list;
        this.f43032b = f10;
        this.f43033c = j10;
        this.f43034d = f11;
    }

    /* JADX INFO: renamed from: a */
    public static C13621f m15145a(C13621f c13621f, ArrayList arrayList, float f10, int i10) {
        if ((i10 & 2) != 0) {
            f10 = c13621f.f43032b;
        }
        return new C13621f(arrayList, f10, c13621f.f43033c, c13621f.f43034d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13621f)) {
            return false;
        }
        C13621f c13621f = (C13621f) obj;
        return AbstractC16544l.m18089b(this.f43031a, c13621f.f43031a) && Float.compare(this.f43032b, c13621f.f43032b) == 0 && C14365u.m15775c(this.f43033c, c13621f.f43033c) && Float.compare(this.f43034d, c13621f.f43034d) == 0;
    }

    public final int hashCode() {
        int iM13819j = AbstractC12107L1.m13819j(this.f43032b, this.f43031a.hashCode() * 31, 31);
        int i10 = C14365u.f45061k;
        return Float.floatToIntBits(this.f43034d) + AbstractC14376f.m15857w(this.f43033c, iM13819j, 31);
    }

    public final String toString() {
        return "█";
    }
}

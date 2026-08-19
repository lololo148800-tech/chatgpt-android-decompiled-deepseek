package p752fg;

import kotlin.jvm.internal.AbstractC16544l;
import p1135yn.C21555b;
import p774h1.C14365u;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: fg.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C13642a {

    /* JADX INFO: renamed from: a */
    public final String f43093a;

    /* JADX INFO: renamed from: b */
    public final long f43094b;

    /* JADX INFO: renamed from: c */
    public final long f43095c;

    /* JADX INFO: renamed from: d */
    public final long f43096d;

    public C13642a(String text, long j10, long j11, long j12) {
        AbstractC16544l.m18094g(text, "text");
        this.f43093a = text;
        this.f43094b = j10;
        this.f43095c = j11;
        this.f43096d = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13642a)) {
            return false;
        }
        C13642a c13642a = (C13642a) obj;
        return AbstractC16544l.m18089b(this.f43093a, c13642a.f43093a) && C14365u.m15775c(this.f43094b, c13642a.f43094b) && C14365u.m15775c(this.f43095c, c13642a.f43095c) && C21555b.m21834d(this.f43096d, c13642a.f43096d);
    }

    public final int hashCode() {
        int iHashCode = this.f43093a.hashCode() * 31;
        int i10 = C14365u.f45061k;
        return C21555b.m21837g(this.f43096d) + AbstractC14376f.m15857w(this.f43095c, AbstractC14376f.m15857w(this.f43094b, iHashCode, 31), 31);
    }

    public final String toString() {
        return "█";
    }
}

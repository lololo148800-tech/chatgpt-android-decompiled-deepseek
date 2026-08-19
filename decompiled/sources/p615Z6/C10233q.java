package p615Z6;

import android.gov.nist.core.Separators;

/* JADX INFO: renamed from: Z6.q */
/* JADX INFO: loaded from: classes.dex */
public final class C10233q {

    /* JADX INFO: renamed from: c */
    public static final C10233q f30385c = new C10233q(EnumC10231p.f30369Y, 0);

    /* JADX INFO: renamed from: d */
    public static final C10233q f30386d = new C10233q(EnumC10231p.f30374r0, 1);

    /* JADX INFO: renamed from: a */
    public final EnumC10231p f30387a;

    /* JADX INFO: renamed from: b */
    public final int f30388b;

    public C10233q(EnumC10231p enumC10231p, int i10) {
        this.f30387a = enumC10231p;
        this.f30388b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10233q.class != obj.getClass()) {
            return false;
        }
        C10233q c10233q = (C10233q) obj;
        return this.f30387a == c10233q.f30387a && this.f30388b == c10233q.f30388b;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30387a);
        sb2.append(Separators.f31991SP);
        int i10 = this.f30388b;
        if (i10 != 1) {
            str = i10 != 2 ? "null" : "slice";
        } else {
            str = "meet";
        }
        sb2.append(str);
        return sb2.toString();
    }
}

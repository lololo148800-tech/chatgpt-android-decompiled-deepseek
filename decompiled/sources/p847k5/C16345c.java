package p847k5;

import android.gov.nist.core.Separators;
import p003A1.AbstractC0168G;
import p027Ap.C0693a;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: k5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C16345c {

    /* JADX INFO: renamed from: a */
    public final C0693a f50721a;

    /* JADX INFO: renamed from: b */
    public final String f50722b;

    /* JADX INFO: renamed from: c */
    public final String f50723c;

    /* JADX INFO: renamed from: d */
    public final String f50724d;

    /* JADX INFO: renamed from: e */
    public final int f50725e;

    /* JADX INFO: renamed from: f */
    public final String f50726f;

    public C16345c(C0693a c0693a, String str, String str2, String str3, int i10, String str4) {
        this.f50721a = c0693a;
        this.f50722b = str;
        this.f50723c = str2;
        this.f50724d = str3;
        this.f50725e = i10;
        this.f50726f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16345c)) {
            return false;
        }
        C16345c c16345c = (C16345c) obj;
        return this.f50721a.equals(c16345c.f50721a) && this.f50722b.equals(c16345c.f50722b) && this.f50723c.equals(c16345c.f50723c) && this.f50724d.equals(c16345c.f50724d) && this.f50725e == c16345c.f50725e && this.f50726f.equals(c16345c.f50726f);
    }

    public final int hashCode() {
        return this.f50726f.hashCode() + ((AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(this.f50721a.hashCode() * 31, 31, this.f50722b), 31, this.f50723c), 31, this.f50724d) + this.f50725e) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JoinToStringArguments(elementsToJoin=");
        sb2.append(this.f50721a);
        sb2.append(", separator=");
        sb2.append(this.f50722b);
        sb2.append(", prefix=");
        sb2.append(this.f50723c);
        sb2.append(", postfix=");
        sb2.append(this.f50724d);
        sb2.append(", limit=");
        sb2.append(this.f50725e);
        sb2.append(", truncated=");
        return AbstractC9306j0.m9891j(this.f50726f, Separators.RPAREN, sb2);
    }
}

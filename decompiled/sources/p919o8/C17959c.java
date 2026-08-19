package p919o8;

import android.gov.nist.core.Separators;
import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: o8.c */
/* JADX INFO: loaded from: classes.dex */
public final class C17959c {

    /* JADX INFO: renamed from: a */
    public final String f57326a;

    /* JADX INFO: renamed from: b */
    public final int f57327b;

    /* JADX INFO: renamed from: c */
    public final Boolean f57328c;

    public C17959c(int i10, Boolean bool, String id2) {
        AbstractC16544l.m18094g(id2, "id");
        AbstractC14376f.m15825D(i10, "type");
        this.f57326a = id2;
        this.f57327b = i10;
        this.f57328c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17959c)) {
            return false;
        }
        C17959c c17959c = (C17959c) obj;
        return AbstractC16544l.m18089b(this.f57326a, c17959c.f57326a) && this.f57327b == c17959c.f57327b && AbstractC16544l.m18089b(this.f57328c, c17959c.f57328c);
    }

    public final int hashCode() {
        int iM13820k = AbstractC12107L1.m13820k(this.f57327b, this.f57326a.hashCode() * 31, 31);
        Boolean bool = this.f57328c;
        return iM13820k + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "ActionEventSession(id=" + this.f57326a + ", type=" + AbstractC17962d.m19633X(this.f57327b) + ", hasReplay=" + this.f57328c + Separators.RPAREN;
    }
}

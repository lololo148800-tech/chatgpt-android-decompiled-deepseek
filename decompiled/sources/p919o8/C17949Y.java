package p919o8;

import android.gov.nist.core.Separators;
import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: o8.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C17949Y {

    /* JADX INFO: renamed from: a */
    public final String f57275a;

    /* JADX INFO: renamed from: b */
    public final int f57276b;

    /* JADX INFO: renamed from: c */
    public final Boolean f57277c;

    public C17949Y(int i10, Boolean bool, String id2) {
        AbstractC16544l.m18094g(id2, "id");
        AbstractC14376f.m15825D(i10, "type");
        this.f57275a = id2;
        this.f57276b = i10;
        this.f57277c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17949Y)) {
            return false;
        }
        C17949Y c17949y = (C17949Y) obj;
        return AbstractC16544l.m18089b(this.f57275a, c17949y.f57275a) && this.f57276b == c17949y.f57276b && AbstractC16544l.m18089b(this.f57277c, c17949y.f57277c);
    }

    public final int hashCode() {
        int iM13820k = AbstractC12107L1.m13820k(this.f57276b, this.f57275a.hashCode() * 31, 31);
        Boolean bool = this.f57277c;
        return iM13820k + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "ErrorEventSession(id=" + this.f57275a + ", type=" + AbstractC17962d.m19616G(this.f57276b) + ", hasReplay=" + this.f57277c + Separators.RPAREN;
    }
}

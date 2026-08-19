package p919o8;

import android.gov.nist.core.Separators;
import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: o8.A0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17880A0 {

    /* JADX INFO: renamed from: a */
    public final String f56985a;

    /* JADX INFO: renamed from: b */
    public final int f56986b;

    /* JADX INFO: renamed from: c */
    public final Boolean f56987c;

    public C17880A0(int i10, Boolean bool, String id2) {
        AbstractC16544l.m18094g(id2, "id");
        AbstractC14376f.m15825D(i10, "type");
        this.f56985a = id2;
        this.f56986b = i10;
        this.f56987c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17880A0)) {
            return false;
        }
        C17880A0 c17880a0 = (C17880A0) obj;
        return AbstractC16544l.m18089b(this.f56985a, c17880a0.f56985a) && this.f56986b == c17880a0.f56986b && AbstractC16544l.m18089b(this.f56987c, c17880a0.f56987c);
    }

    public final int hashCode() {
        int iM13820k = AbstractC12107L1.m13820k(this.f56986b, this.f56985a.hashCode() * 31, 31);
        Boolean bool = this.f56987c;
        return iM13820k + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "LongTaskEventSession(id=" + this.f56985a + ", type=" + AbstractC17962d.m19624O(this.f56986b) + ", hasReplay=" + this.f56987c + Separators.RPAREN;
    }
}

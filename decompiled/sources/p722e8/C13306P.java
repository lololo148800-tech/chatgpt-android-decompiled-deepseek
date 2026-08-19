package p722e8;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p1071w0.AbstractC20734X;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: e8.P */
/* JADX INFO: loaded from: classes.dex */
public final class C13306P {

    /* JADX INFO: renamed from: a */
    public final C13304N f42099a;

    /* JADX INFO: renamed from: b */
    public final Map f42100b;

    /* JADX INFO: renamed from: c */
    public final boolean f42101c;

    public C13306P(C13304N c13304n, Map attributes, boolean z6) {
        AbstractC16544l.m18094g(attributes, "attributes");
        this.f42099a = c13304n;
        this.f42100b = attributes;
        this.f42101c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13306P)) {
            return false;
        }
        C13306P c13306p = (C13306P) obj;
        return AbstractC16544l.m18089b(this.f42099a, c13306p.f42099a) && AbstractC16544l.m18089b(this.f42100b, c13306p.f42100b) && this.f42101c == c13306p.f42101c;
    }

    public final int hashCode() {
        return AbstractC20734X.m21250u(this.f42099a.hashCode() * 31, 31, this.f42100b) + (this.f42101c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RumViewInfo(key=");
        sb2.append(this.f42099a);
        sb2.append(", attributes=");
        sb2.append(this.f42100b);
        sb2.append(", isActive=");
        return AbstractC14376f.m15823B(sb2, this.f42101c, Separators.RPAREN);
    }
}

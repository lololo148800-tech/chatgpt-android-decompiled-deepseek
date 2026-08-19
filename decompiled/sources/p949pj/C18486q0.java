package p949pj;

import android.gov.nist.core.Separators;
import android.graphics.Rect;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: pj.q0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C18486q0 {

    /* JADX INFO: renamed from: a */
    public final Rect f58931a;

    /* JADX INFO: renamed from: b */
    public final Rect f58932b;

    public C18486q0(Rect rect, Rect rect2) {
        this.f58931a = rect;
        this.f58932b = rect2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18486q0)) {
            return false;
        }
        C18486q0 c18486q0 = (C18486q0) obj;
        return AbstractC16544l.m18089b(this.f58931a, c18486q0.f58931a) && AbstractC16544l.m18089b(this.f58932b, c18486q0.f58932b);
    }

    public final int hashCode() {
        return this.f58932b.hashCode() + (this.f58931a.hashCode() * 31);
    }

    public final String toString() {
        return "ViewfinderInfo(region=" + this.f58931a + ", viewport=" + this.f58932b + Separators.RPAREN;
    }
}

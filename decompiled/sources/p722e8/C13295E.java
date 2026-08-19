package p722e8;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p1071w0.AbstractC20734X;
import p523V9.AbstractC8119j5;
import p677c8.C11691c;

/* JADX INFO: renamed from: e8.E */
/* JADX INFO: loaded from: classes.dex */
public final class C13295E extends AbstractC8119j5 {

    /* JADX INFO: renamed from: b */
    public final C13304N f42027b;

    /* JADX INFO: renamed from: c */
    public final Map f42028c;

    /* JADX INFO: renamed from: d */
    public final C11691c f42029d;

    public C13295E(C13304N c13304n, Map map, C11691c c11691c) {
        this.f42027b = c13304n;
        this.f42028c = map;
        this.f42029d = c11691c;
    }

    @Override // p523V9.AbstractC8119j5
    /* JADX INFO: renamed from: a */
    public final C11691c mo8622a() {
        return this.f42029d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13295E)) {
            return false;
        }
        C13295E c13295e = (C13295E) obj;
        return AbstractC16544l.m18089b(this.f42027b, c13295e.f42027b) && AbstractC16544l.m18089b(this.f42028c, c13295e.f42028c) && AbstractC16544l.m18089b(this.f42029d, c13295e.f42029d);
    }

    public final int hashCode() {
        return this.f42029d.hashCode() + AbstractC20734X.m21250u(this.f42027b.hashCode() * 31, 31, this.f42028c);
    }

    public final String toString() {
        return "StopView(key=" + this.f42027b + ", attributes=" + this.f42028c + ", eventTime=" + this.f42029d + Separators.RPAREN;
    }
}

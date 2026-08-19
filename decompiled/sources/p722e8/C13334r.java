package p722e8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC8119j5;
import p677c8.C11691c;

/* JADX INFO: renamed from: e8.r */
/* JADX INFO: loaded from: classes.dex */
public final class C13334r extends AbstractC8119j5 {

    /* JADX INFO: renamed from: b */
    public final String f42305b;

    /* JADX INFO: renamed from: c */
    public final boolean f42306c;

    /* JADX INFO: renamed from: d */
    public final C11691c f42307d;

    public C13334r(String str, boolean z6) {
        C11691c c11691c = new C11691c();
        this.f42305b = str;
        this.f42306c = z6;
        this.f42307d = c11691c;
    }

    @Override // p523V9.AbstractC8119j5
    /* JADX INFO: renamed from: a */
    public final C11691c mo8622a() {
        return this.f42307d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13334r)) {
            return false;
        }
        C13334r c13334r = (C13334r) obj;
        return AbstractC16544l.m18089b(this.f42305b, c13334r.f42305b) && this.f42306c == c13334r.f42306c && AbstractC16544l.m18089b(this.f42307d, c13334r.f42307d);
    }

    public final int hashCode() {
        return this.f42307d.hashCode() + (((this.f42305b.hashCode() * 31) + (this.f42306c ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "LongTaskSent(viewId=" + this.f42305b + ", isFrozenFrame=" + this.f42306c + ", eventTime=" + this.f42307d + Separators.RPAREN;
    }
}

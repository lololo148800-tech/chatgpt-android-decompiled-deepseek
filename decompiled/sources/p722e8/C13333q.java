package p722e8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC8119j5;
import p677c8.C11691c;

/* JADX INFO: renamed from: e8.q */
/* JADX INFO: loaded from: classes.dex */
public final class C13333q extends AbstractC8119j5 {

    /* JADX INFO: renamed from: b */
    public final String f42302b;

    /* JADX INFO: renamed from: c */
    public final boolean f42303c;

    /* JADX INFO: renamed from: d */
    public final C11691c f42304d;

    public C13333q(String str, boolean z6) {
        C11691c c11691c = new C11691c();
        this.f42302b = str;
        this.f42303c = z6;
        this.f42304d = c11691c;
    }

    @Override // p523V9.AbstractC8119j5
    /* JADX INFO: renamed from: a */
    public final C11691c mo8622a() {
        return this.f42304d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13333q)) {
            return false;
        }
        C13333q c13333q = (C13333q) obj;
        return AbstractC16544l.m18089b(this.f42302b, c13333q.f42302b) && this.f42303c == c13333q.f42303c && AbstractC16544l.m18089b(this.f42304d, c13333q.f42304d);
    }

    public final int hashCode() {
        return this.f42304d.hashCode() + (((this.f42302b.hashCode() * 31) + (this.f42303c ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "LongTaskDropped(viewId=" + this.f42302b + ", isFrozenFrame=" + this.f42303c + ", eventTime=" + this.f42304d + Separators.RPAREN;
    }
}

package p722e8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC8119j5;
import p677c8.C11691c;

/* JADX INFO: renamed from: e8.o */
/* JADX INFO: loaded from: classes.dex */
public final class C13331o extends AbstractC8119j5 {

    /* JADX INFO: renamed from: b */
    public final String f42299b;

    /* JADX INFO: renamed from: c */
    public final C11691c f42300c;

    public C13331o(String str) {
        C11691c c11691c = new C11691c();
        this.f42299b = str;
        this.f42300c = c11691c;
    }

    @Override // p523V9.AbstractC8119j5
    /* JADX INFO: renamed from: a */
    public final C11691c mo8622a() {
        return this.f42300c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13331o)) {
            return false;
        }
        C13331o c13331o = (C13331o) obj;
        return AbstractC16544l.m18089b(this.f42299b, c13331o.f42299b) && AbstractC16544l.m18089b(this.f42300c, c13331o.f42300c);
    }

    public final int hashCode() {
        return this.f42300c.hashCode() + (this.f42299b.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorSent(viewId=" + this.f42299b + ", eventTime=" + this.f42300c + Separators.RPAREN;
    }
}

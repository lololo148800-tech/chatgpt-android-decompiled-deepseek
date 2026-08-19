package p722e8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC8119j5;
import p677c8.C11691c;

/* JADX INFO: renamed from: e8.n */
/* JADX INFO: loaded from: classes.dex */
public final class C13330n extends AbstractC8119j5 {

    /* JADX INFO: renamed from: b */
    public final String f42297b;

    /* JADX INFO: renamed from: c */
    public final C11691c f42298c;

    public C13330n(String str) {
        C11691c c11691c = new C11691c();
        this.f42297b = str;
        this.f42298c = c11691c;
    }

    @Override // p523V9.AbstractC8119j5
    /* JADX INFO: renamed from: a */
    public final C11691c mo8622a() {
        return this.f42298c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13330n)) {
            return false;
        }
        C13330n c13330n = (C13330n) obj;
        return AbstractC16544l.m18089b(this.f42297b, c13330n.f42297b) && AbstractC16544l.m18089b(this.f42298c, c13330n.f42298c);
    }

    public final int hashCode() {
        return this.f42298c.hashCode() + (this.f42297b.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorDropped(viewId=" + this.f42297b + ", eventTime=" + this.f42298c + Separators.RPAREN;
    }
}

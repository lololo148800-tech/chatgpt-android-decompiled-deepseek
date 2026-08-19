package p722e8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC8119j5;
import p677c8.C11691c;

/* JADX INFO: renamed from: e8.t */
/* JADX INFO: loaded from: classes.dex */
public final class C13336t extends AbstractC8119j5 {

    /* JADX INFO: renamed from: b */
    public final String f42308b;

    /* JADX INFO: renamed from: c */
    public final C11691c f42309c;

    public C13336t(String str) {
        C11691c c11691c = new C11691c();
        this.f42308b = str;
        this.f42309c = c11691c;
    }

    @Override // p523V9.AbstractC8119j5
    /* JADX INFO: renamed from: a */
    public final C11691c mo8622a() {
        return this.f42309c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13336t)) {
            return false;
        }
        C13336t c13336t = (C13336t) obj;
        return AbstractC16544l.m18089b(this.f42308b, c13336t.f42308b) && AbstractC16544l.m18089b(this.f42309c, c13336t.f42309c);
    }

    public final int hashCode() {
        return this.f42309c.hashCode() + (this.f42308b.hashCode() * 31);
    }

    public final String toString() {
        return "ResourceDropped(viewId=" + this.f42308b + ", eventTime=" + this.f42309c + Separators.RPAREN;
    }
}

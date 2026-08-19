package p722e8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC8119j5;
import p677c8.C11691c;

/* JADX INFO: renamed from: e8.G */
/* JADX INFO: loaded from: classes.dex */
public final class C13297G extends AbstractC8119j5 {

    /* JADX INFO: renamed from: b */
    public final C11691c f42032b = new C11691c();

    @Override // p523V9.AbstractC8119j5
    /* JADX INFO: renamed from: a */
    public final C11691c mo8622a() {
        return this.f42032b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13297G) && AbstractC16544l.m18089b(this.f42032b, ((C13297G) obj).f42032b);
    }

    public final int hashCode() {
        return this.f42032b.hashCode();
    }

    public final String toString() {
        return "WebViewEvent(eventTime=" + this.f42032b + Separators.RPAREN;
    }
}

package p722e8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC8119j5;
import p677c8.C11691c;

/* JADX INFO: renamed from: e8.h */
/* JADX INFO: loaded from: classes.dex */
public final class C13324h extends AbstractC8119j5 {

    /* JADX INFO: renamed from: b */
    public final String f42273b;

    /* JADX INFO: renamed from: c */
    public final C11691c f42274c;

    public C13324h(String str) {
        C11691c c11691c = new C11691c();
        this.f42273b = str;
        this.f42274c = c11691c;
    }

    @Override // p523V9.AbstractC8119j5
    /* JADX INFO: renamed from: a */
    public final C11691c mo8622a() {
        return this.f42274c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13324h)) {
            return false;
        }
        C13324h c13324h = (C13324h) obj;
        return AbstractC16544l.m18089b(this.f42273b, c13324h.f42273b) && AbstractC16544l.m18089b(this.f42274c, c13324h.f42274c);
    }

    public final int hashCode() {
        return this.f42274c.hashCode() + (this.f42273b.hashCode() * 31);
    }

    public final String toString() {
        return "ActionDropped(viewId=" + this.f42273b + ", eventTime=" + this.f42274c + Separators.RPAREN;
    }
}

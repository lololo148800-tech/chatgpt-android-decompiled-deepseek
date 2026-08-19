package p722e8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC8119j5;
import p582Xk.HXHG.TfazcFv;
import p677c8.C11691c;

/* JADX INFO: renamed from: e8.u */
/* JADX INFO: loaded from: classes.dex */
public final class C13337u extends AbstractC8119j5 {

    /* JADX INFO: renamed from: b */
    public final String f42310b;

    /* JADX INFO: renamed from: c */
    public final C11691c f42311c;

    public C13337u(String str) {
        C11691c c11691c = new C11691c();
        this.f42310b = str;
        this.f42311c = c11691c;
    }

    @Override // p523V9.AbstractC8119j5
    /* JADX INFO: renamed from: a */
    public final C11691c mo8622a() {
        return this.f42311c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13337u)) {
            return false;
        }
        C13337u c13337u = (C13337u) obj;
        return AbstractC16544l.m18089b(this.f42310b, c13337u.f42310b) && AbstractC16544l.m18089b(this.f42311c, c13337u.f42311c);
    }

    public final int hashCode() {
        return this.f42311c.hashCode() + (this.f42310b.hashCode() * 31);
    }

    public final String toString() {
        return "ResourceSent(viewId=" + this.f42310b + TfazcFv.CTXTy + this.f42311c + Separators.RPAREN;
    }
}

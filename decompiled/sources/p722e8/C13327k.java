package p722e8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC8119j5;
import p677c8.C11691c;

/* JADX INFO: renamed from: e8.k */
/* JADX INFO: loaded from: classes.dex */
public final class C13327k extends AbstractC8119j5 {

    /* JADX INFO: renamed from: b */
    public final String f42289b;

    /* JADX INFO: renamed from: c */
    public final Object f42290c;

    /* JADX INFO: renamed from: d */
    public final C11691c f42291d;

    public C13327k(String name, Object value) {
        C11691c c11691c = new C11691c();
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(value, "value");
        this.f42289b = name;
        this.f42290c = value;
        this.f42291d = c11691c;
    }

    @Override // p523V9.AbstractC8119j5
    /* JADX INFO: renamed from: a */
    public final C11691c mo8622a() {
        return this.f42291d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13327k)) {
            return false;
        }
        C13327k c13327k = (C13327k) obj;
        return AbstractC16544l.m18089b(this.f42289b, c13327k.f42289b) && AbstractC16544l.m18089b(this.f42290c, c13327k.f42290c) && AbstractC16544l.m18089b(this.f42291d, c13327k.f42291d);
    }

    public final int hashCode() {
        return this.f42291d.hashCode() + ((this.f42290c.hashCode() + (this.f42289b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AddFeatureFlagEvaluation(name=" + this.f42289b + ", value=" + this.f42290c + ", eventTime=" + this.f42291d + Separators.RPAREN;
    }
}

package p988rc;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p204I1.C3590f;

/* JADX INFO: renamed from: rc.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C18929q {

    /* JADX INFO: renamed from: a */
    public final C3590f f60394a;

    /* JADX INFO: renamed from: b */
    public final Map f60395b;

    public C18929q(C3590f c3590f, Map map) {
        this.f60394a = c3590f;
        this.f60395b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18929q)) {
            return false;
        }
        C18929q c18929q = (C18929q) obj;
        return AbstractC16544l.m18089b(this.f60394a, c18929q.f60394a) && AbstractC16544l.m18089b(this.f60395b, c18929q.f60395b);
    }

    public final int hashCode() {
        return this.f60395b.hashCode() + (this.f60394a.hashCode() * 31);
    }

    public final String toString() {
        return "RichTextString(taggedString=" + ((Object) this.f60394a) + ", formatObjects=" + this.f60395b + Separators.RPAREN;
    }
}

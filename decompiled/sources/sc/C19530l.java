package sc;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p204I1.C3590f;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: sc.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C19530l {

    /* JADX INFO: renamed from: a */
    public final C3590f f62041a;

    /* JADX INFO: renamed from: b */
    public final List f62042b;

    /* JADX INFO: renamed from: c */
    public final boolean f62043c;

    public C19530l(C3590f annotatedString, List phraseSegments, boolean z6) {
        AbstractC16544l.m18094g(annotatedString, "annotatedString");
        AbstractC16544l.m18094g(phraseSegments, "phraseSegments");
        this.f62041a = annotatedString;
        this.f62042b = phraseSegments;
        this.f62043c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19530l)) {
            return false;
        }
        C19530l c19530l = (C19530l) obj;
        return AbstractC16544l.m18089b(this.f62041a, c19530l.f62041a) && AbstractC16544l.m18089b(this.f62042b, c19530l.f62042b) && this.f62043c == c19530l.f62043c;
    }

    public final int hashCode() {
        return AbstractC14376f.m15858x(this.f62042b, this.f62041a.hashCode() * 31, 31) + (this.f62043c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhraseAnnotatedString(annotatedString=");
        sb2.append((Object) this.f62041a);
        sb2.append(", phraseSegments=");
        sb2.append(this.f62042b);
        sb2.append(", isComplete=");
        return AbstractC14376f.m15823B(sb2, this.f62043c, Separators.RPAREN);
    }
}

package p923oc;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p594Y9.AbstractC9961r4;

/* JADX INFO: renamed from: oc.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C18064t {

    /* JADX INFO: renamed from: a */
    public final AbstractC9961r4 f57620a;

    /* JADX INFO: renamed from: b */
    public final C18065u f57621b;

    public C18064t(AbstractC9961r4 abstractC9961r4, C18065u c18065u) {
        this.f57620a = abstractC9961r4;
        this.f57621b = c18065u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18064t)) {
            return false;
        }
        C18064t c18064t = (C18064t) obj;
        return AbstractC16544l.m18089b(this.f57620a, c18064t.f57620a) && AbstractC16544l.m18089b(this.f57621b, c18064t.f57621b);
    }

    public final int hashCode() {
        return this.f57621b.hashCode() + (this.f57620a.hashCode() * 31);
    }

    public final String toString() {
        return "AstNode(type=" + this.f57620a + Separators.RPAREN;
    }
}

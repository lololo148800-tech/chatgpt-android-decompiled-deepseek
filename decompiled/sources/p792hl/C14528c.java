package p792hl;

import kotlin.jvm.internal.AbstractC16544l;
import p1111xl.C21296a;

/* JADX INFO: renamed from: hl.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C14528c {

    /* JADX INFO: renamed from: a */
    public final C21296a f45789a;

    /* JADX INFO: renamed from: b */
    public final Object f45790b;

    public C14528c(C21296a expectedType, Object response) {
        AbstractC16544l.m18094g(expectedType, "expectedType");
        AbstractC16544l.m18094g(response, "response");
        this.f45789a = expectedType;
        this.f45790b = response;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14528c)) {
            return false;
        }
        C14528c c14528c = (C14528c) obj;
        return AbstractC16544l.m18089b(this.f45789a, c14528c.f45789a) && AbstractC16544l.m18089b(this.f45790b, c14528c.f45790b);
    }

    public final int hashCode() {
        return this.f45790b.hashCode() + (this.f45789a.hashCode() * 31);
    }

    public final String toString() {
        return "HttpResponseContainer(expectedType=" + this.f45789a + ", response=" + this.f45790b + ')';
    }
}

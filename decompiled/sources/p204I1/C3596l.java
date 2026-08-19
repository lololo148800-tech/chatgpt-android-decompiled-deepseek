package p204I1;

import kotlin.jvm.internal.AbstractC16544l;
import p239Ja.C4307j;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: I1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C3596l extends AbstractC3597m {

    /* JADX INFO: renamed from: a */
    public final String f10951a;

    /* JADX INFO: renamed from: b */
    public final C3579J f10952b;

    /* JADX INFO: renamed from: c */
    public final C4307j f10953c = null;

    public C3596l(String str, C3579J c3579j) {
        this.f10951a = str;
        this.f10952b = c3579j;
    }

    @Override // p204I1.AbstractC3597m
    /* JADX INFO: renamed from: a */
    public final C4307j mo4305a() {
        return this.f10953c;
    }

    @Override // p204I1.AbstractC3597m
    /* JADX INFO: renamed from: b */
    public final C3579J mo4306b() {
        return this.f10952b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3596l)) {
            return false;
        }
        C3596l c3596l = (C3596l) obj;
        if (!AbstractC16544l.m18089b(this.f10951a, c3596l.f10951a)) {
            return false;
        }
        if (AbstractC16544l.m18089b(this.f10952b, c3596l.f10952b)) {
            return AbstractC16544l.m18089b(this.f10953c, c3596l.f10953c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f10951a.hashCode() * 31;
        C3579J c3579j = this.f10952b;
        int iHashCode2 = (iHashCode + (c3579j != null ? c3579j.hashCode() : 0)) * 31;
        C4307j c4307j = this.f10953c;
        return iHashCode2 + (c4307j != null ? c4307j.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC9306j0.m9892k(new StringBuilder("LinkAnnotation.Url(url="), this.f10951a, ')');
    }
}

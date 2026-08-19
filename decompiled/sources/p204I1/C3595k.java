package p204I1;

import kotlin.jvm.internal.AbstractC16544l;
import p239Ja.C4307j;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: I1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C3595k extends AbstractC3597m {

    /* JADX INFO: renamed from: a */
    public final String f10948a;

    /* JADX INFO: renamed from: b */
    public final C3579J f10949b;

    /* JADX INFO: renamed from: c */
    public final C4307j f10950c;

    public C3595k(String str, C3579J c3579j, C4307j c4307j) {
        this.f10948a = str;
        this.f10949b = c3579j;
        this.f10950c = c4307j;
    }

    @Override // p204I1.AbstractC3597m
    /* JADX INFO: renamed from: a */
    public final C4307j mo4305a() {
        return this.f10950c;
    }

    @Override // p204I1.AbstractC3597m
    /* JADX INFO: renamed from: b */
    public final C3579J mo4306b() {
        return this.f10949b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3595k)) {
            return false;
        }
        C3595k c3595k = (C3595k) obj;
        if (!AbstractC16544l.m18089b(this.f10948a, c3595k.f10948a)) {
            return false;
        }
        if (AbstractC16544l.m18089b(this.f10949b, c3595k.f10949b)) {
            return AbstractC16544l.m18089b(this.f10950c, c3595k.f10950c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f10948a.hashCode() * 31;
        C3579J c3579j = this.f10949b;
        int iHashCode2 = (iHashCode + (c3579j != null ? c3579j.hashCode() : 0)) * 31;
        C4307j c4307j = this.f10950c;
        return iHashCode2 + (c4307j != null ? c4307j.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC9306j0.m9892k(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f10948a, ')');
    }
}

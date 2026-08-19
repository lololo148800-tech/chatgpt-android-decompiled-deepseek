package p449S9;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p263K9.C4605y;

/* JADX INFO: renamed from: S9.e */
/* JADX INFO: loaded from: classes.dex */
public final class C7065e extends AbstractC7063d {

    /* JADX INFO: renamed from: Y */
    public final C4605y f22539Y;

    public C7065e(C4605y c4605y) {
        this.f22539Y = c4605y;
    }

    @Override // p449S9.AbstractC7063d
    /* JADX INFO: renamed from: a */
    public final Object mo7470a() {
        return this.f22539Y;
    }

    @Override // p449S9.AbstractC7063d
    /* JADX INFO: renamed from: b */
    public final boolean mo7471b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7065e) {
            return this.f22539Y.equals(((C7065e) obj).f22539Y);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22539Y.hashCode() + 1502476572;
    }

    public final String toString() {
        return AbstractC10763a.m11054l("Optional.of(", this.f22539Y.toString(), Separators.RPAREN);
    }
}

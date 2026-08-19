package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.P */
/* JADX INFO: loaded from: classes.dex */
public final class C11899P extends AbstractC11902Q {

    /* JADX INFO: renamed from: o0 */
    public static final C11899P f36168o0 = new C11899P(C12011u.f36334o0, C12011u.f36333Z);

    /* JADX INFO: renamed from: Y */
    public final AbstractC12015v f36169Y;

    /* JADX INFO: renamed from: Z */
    public final AbstractC12015v f36170Z;

    public C11899P(AbstractC12015v abstractC12015v, AbstractC12015v abstractC12015v2) {
        this.f36169Y = abstractC12015v;
        this.f36170Z = abstractC12015v2;
        if (abstractC12015v.mo13527a(abstractC12015v2) > 0 || abstractC12015v == C12011u.f36333Z || abstractC12015v2 == C12011u.f36334o0) {
            StringBuilder sb2 = new StringBuilder(16);
            abstractC12015v.mo13528b(sb2);
            sb2.append("..");
            abstractC12015v2.mo13529c(sb2);
            throw new IllegalArgumentException("Invalid range: ".concat(sb2.toString()));
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11899P) {
            C11899P c11899p = (C11899P) obj;
            if (this.f36169Y.equals(c11899p.f36169Y) && this.f36170Z.equals(c11899p.f36170Z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f36170Z.hashCode() + (this.f36169Y.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(16);
        this.f36169Y.mo13528b(sb2);
        sb2.append("..");
        this.f36170Z.mo13529c(sb2);
        return sb2.toString();
    }
}

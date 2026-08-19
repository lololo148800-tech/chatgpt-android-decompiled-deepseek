package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.u */
/* JADX INFO: loaded from: classes.dex */
public final class C12011u extends AbstractC12015v {

    /* JADX INFO: renamed from: Z */
    public static final C12011u f36333Z = new C12011u(0);

    /* JADX INFO: renamed from: o0 */
    public static final C12011u f36334o0 = new C12011u(1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f36335Y;

    public /* synthetic */ C12011u(int i10) {
        this.f36335Y = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC12015v
    /* JADX INFO: renamed from: a */
    public final int mo13527a(AbstractC12015v abstractC12015v) {
        switch (this.f36335Y) {
            case 0:
                return abstractC12015v == this ? 0 : 1;
            default:
                return abstractC12015v == this ? 0 : -1;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC12015v
    /* JADX INFO: renamed from: b */
    public final void mo13528b(StringBuilder sb2) {
        switch (this.f36335Y) {
            case 0:
                throw new AssertionError();
            default:
                sb2.append("(-∞");
                return;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC12015v
    /* JADX INFO: renamed from: c */
    public final void mo13529c(StringBuilder sb2) {
        switch (this.f36335Y) {
            case 0:
                sb2.append("+∞)");
                return;
            default:
                throw new AssertionError();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        switch (this.f36335Y) {
            case 0:
                return ((AbstractC12015v) obj) == this ? 0 : 1;
            default:
                return ((AbstractC12015v) obj) == this ? 0 : -1;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC12015v
    public final int hashCode() {
        switch (this.f36335Y) {
            case 0:
                break;
        }
        return System.identityHashCode(this);
    }

    public final String toString() {
        switch (this.f36335Y) {
            case 0:
                return "+∞";
            default:
                return "-∞";
        }
    }
}

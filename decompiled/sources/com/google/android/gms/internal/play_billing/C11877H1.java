package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.H1 */
/* JADX INFO: loaded from: classes.dex */
public final class C11877H1 {

    /* JADX INFO: renamed from: a */
    public final AbstractC11908S0 f36137a;

    /* JADX INFO: renamed from: b */
    public final String f36138b;

    /* JADX INFO: renamed from: c */
    public final Object[] f36139c;

    /* JADX INFO: renamed from: d */
    public final int f36140d;

    public C11877H1(AbstractC11908S0 abstractC11908S0, String str, Object[] objArr) {
        this.f36137a = abstractC11908S0;
        this.f36138b = str;
        this.f36139c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f36140d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f36140d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC11908S0 m13269a() {
        return this.f36137a;
    }

    /* JADX INFO: renamed from: b */
    public final int m13270b() {
        int i10 = this.f36140d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }

    /* JADX INFO: renamed from: c */
    public final String m13271c() {
        return this.f36138b;
    }

    /* JADX INFO: renamed from: d */
    public final Object[] m13272d() {
        return this.f36139c;
    }
}

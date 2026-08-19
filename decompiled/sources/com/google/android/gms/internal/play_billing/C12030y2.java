package com.google.android.gms.internal.play_billing;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.y2 */
/* JADX INFO: loaded from: classes.dex */
public final class C12030y2 extends C12022w2 {

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C12034z2 f36365t0;

    public C12030y2(C12034z2 c12034z2) {
        this.f36365t0 = c12034z2;
    }

    @Override // com.google.android.gms.internal.play_billing.C12022w2
    /* JADX INFO: renamed from: c */
    public final String mo13553c() {
        C12026x2 c12026x2 = (C12026x2) this.f36365t0.f36367Y.get();
        return c12026x2 == null ? "Completer object has been garbage collected, future will fail soon" : AbstractC10763a.m11054l("tag=[", String.valueOf(c12026x2.f36357a), "]");
    }
}

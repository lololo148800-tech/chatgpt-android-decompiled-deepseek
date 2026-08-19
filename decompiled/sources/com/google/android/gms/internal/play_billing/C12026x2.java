package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import p610Z1.C10135b;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.x2 */
/* JADX INFO: loaded from: classes.dex */
public final class C12026x2 {

    /* JADX INFO: renamed from: a */
    public Serializable f36357a;

    /* JADX INFO: renamed from: b */
    public C12034z2 f36358b;

    /* JADX INFO: renamed from: c */
    public C11856A2 f36359c;

    /* JADX INFO: renamed from: d */
    public boolean f36360d;

    public final void finalize() {
        C11856A2 c11856a2;
        C12034z2 c12034z2 = this.f36358b;
        if (c12034z2 != null) {
            C12030y2 c12030y2 = c12034z2.f36368Z;
            if (!c12030y2.isDone()) {
                if (C12022w2.f36347r0.mo13462D(c12030y2, null, new C12009t1(new C10135b("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f36357a)), 4)))) {
                    C12022w2.m13550d(c12030y2);
                }
            }
        }
        if (this.f36360d || (c11856a2 = this.f36359c) == null) {
            return;
        }
        c11856a2.m13220i(null);
    }
}

package com.google.android.gms.internal.play_billing;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.S0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11908S0 {
    protected int zza;

    /* JADX INFO: renamed from: a */
    public abstract int mo13345a(InterfaceC11880I1 interfaceC11880I1);

    /* JADX INFO: renamed from: b */
    public final byte[] m13346b() {
        try {
            AbstractC11969j1 abstractC11969j1 = (AbstractC11969j1) this;
            int iM13479e = abstractC11969j1.m13479e();
            byte[] bArr = new byte[iM13479e];
            C11933a1 c11933a1 = new C11933a1(iM13479e, bArr);
            InterfaceC11880I1 interfaceC11880I1M13262a = C11871F1.f36125c.m13262a(abstractC11969j1.getClass());
            C12021w1 c12021w1 = c11933a1.f36234Z;
            if (c12021w1 == null) {
                c12021w1 = new C12021w1(c11933a1);
            }
            interfaceC11880I1M13262a.mo13245i(abstractC11969j1, c12021w1);
            if (iM13479e - c11933a1.f36237q0 == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(AbstractC10763a.m11054l("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }
}

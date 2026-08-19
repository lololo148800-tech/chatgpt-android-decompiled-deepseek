package com.google.android.gms.internal.play_billing;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.Serializable;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.E */
/* JADX INFO: loaded from: classes.dex */
public final class C11866E extends AbstractC11971k implements Serializable {

    /* JADX INFO: renamed from: Z */
    public static final C11866E f36120Z;

    /* JADX INFO: renamed from: o0 */
    public static final C11866E f36121o0;

    /* JADX INFO: renamed from: Y */
    public final transient C11907S f36122Y;

    static {
        C12027y c12027y = AbstractC11857B.f36097Z;
        f36120Z = new C11866E(C11907S.f36188q0);
        Object[] objArr = {C11899P.f36168o0};
        for (int i10 = 0; i10 < 1; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(AbstractC10763a.m11048f(i10, "at index "));
            }
        }
        f36121o0 = new C11866E(AbstractC11857B.m13221t(1, objArr));
    }

    public C11866E(C11907S c11907s) {
        this.f36122Y = c11907s;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11971k
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC11872G mo13261a() {
        C11907S c11907s = this.f36122Y;
        return c11907s.isEmpty() ? C11925Y.f36218u0 : new C11928Z(c11907s, C11896O.f36167Y);
    }
}

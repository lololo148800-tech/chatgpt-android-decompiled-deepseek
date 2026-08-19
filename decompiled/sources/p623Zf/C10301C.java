package p623Zf;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Zf.C */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C10301C {
    public static final C10300B Companion = new C10300B();

    /* JADX INFO: renamed from: a */
    public final String f30587a;

    public /* synthetic */ C10301C(String str) {
        this.f30587a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10301C) {
            return AbstractC16544l.m18089b(this.f30587a, ((C10301C) obj).f30587a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30587a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f30587a, Separators.RPAREN, new StringBuilder("PhoneVerificationId(value="));
    }
}

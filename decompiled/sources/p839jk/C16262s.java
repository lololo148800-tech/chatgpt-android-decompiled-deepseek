package p839jk;

import kotlin.jvm.internal.AbstractC16544l;
import p544W9.AbstractC8548R3;

/* JADX INFO: renamed from: jk.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C16262s extends AbstractC8548R3 {

    /* JADX INFO: renamed from: a */
    public final String f50389a;

    public C16262s(String stepName) {
        AbstractC16544l.m18094g(stepName, "stepName");
        this.f50389a = stepName;
    }

    @Override // p544W9.AbstractC8548R3
    /* JADX INFO: renamed from: b */
    public final String mo9209b() {
        return this.f50389a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16262s) && AbstractC16544l.m18089b(this.f50389a, ((C16262s) obj).f50389a);
    }

    public final int hashCode() {
        return this.f50389a.hashCode();
    }

    public final String toString() {
        return "/inquiry/verify-with-persona/passkey-registration";
    }
}

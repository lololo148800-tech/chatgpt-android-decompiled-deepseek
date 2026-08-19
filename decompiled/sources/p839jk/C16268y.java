package p839jk;

import kotlin.jvm.internal.AbstractC16544l;
import p544W9.AbstractC8548R3;

/* JADX INFO: renamed from: jk.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C16268y extends AbstractC8548R3 {

    /* JADX INFO: renamed from: a */
    public final String f50398a;

    public C16268y(String stepName) {
        AbstractC16544l.m18094g(stepName, "stepName");
        this.f50398a = stepName;
    }

    @Override // p544W9.AbstractC8548R3
    /* JADX INFO: renamed from: b */
    public final String mo9209b() {
        return this.f50398a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16268y) && AbstractC16544l.m18089b(this.f50398a, ((C16268y) obj).f50398a);
    }

    public final int hashCode() {
        return this.f50398a.hashCode();
    }

    public final String toString() {
        return "/inquiry/verify-with-persona/passkey-authentication";
    }
}

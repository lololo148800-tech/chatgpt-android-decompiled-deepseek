package p839jk;

import kotlin.jvm.internal.AbstractC16544l;
import p544W9.AbstractC8548R3;

/* JADX INFO: renamed from: jk.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C16265v extends AbstractC8548R3 {

    /* JADX INFO: renamed from: a */
    public final String f50394a;

    public C16265v(String stepName) {
        AbstractC16544l.m18094g(stepName, "stepName");
        this.f50394a = stepName;
    }

    @Override // p544W9.AbstractC8548R3
    /* JADX INFO: renamed from: b */
    public final String mo9209b() {
        return this.f50394a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16265v) && AbstractC16544l.m18089b(this.f50394a, ((C16265v) obj).f50394a);
    }

    public final int hashCode() {
        return this.f50394a.hashCode();
    }

    public final String toString() {
        return "/inquiry/scan-nfc";
    }
}

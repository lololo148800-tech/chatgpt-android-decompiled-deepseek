package p839jk;

import kotlin.jvm.internal.AbstractC16544l;
import p544W9.AbstractC8548R3;

/* JADX INFO: renamed from: jk.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C16267x extends AbstractC8548R3 {

    /* JADX INFO: renamed from: a */
    public final String f50397a;

    public C16267x(String stepName) {
        AbstractC16544l.m18094g(stepName, "stepName");
        this.f50397a = stepName;
    }

    @Override // p544W9.AbstractC8548R3
    /* JADX INFO: renamed from: b */
    public final String mo9209b() {
        return this.f50397a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16267x) && AbstractC16544l.m18089b(this.f50397a, ((C16267x) obj).f50397a);
    }

    public final int hashCode() {
        return this.f50397a.hashCode();
    }

    public final String toString() {
        return "/inquiry/ui";
    }
}

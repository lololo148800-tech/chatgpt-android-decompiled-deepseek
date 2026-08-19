package p098Di;

import android.content.Intent;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Di.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C2055d implements InterfaceC2061j {

    /* JADX INFO: renamed from: a */
    public final Intent f6276a;

    public C2055d(Intent intent) {
        AbstractC16544l.m18094g(intent, "intent");
        this.f6276a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2055d) && AbstractC16544l.m18089b(this.f6276a, ((C2055d) obj).f6276a);
    }

    public final int hashCode() {
        return this.f6276a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}

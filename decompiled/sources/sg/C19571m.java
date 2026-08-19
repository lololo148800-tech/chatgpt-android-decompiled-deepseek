package sg;

import android.content.Intent;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: sg.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C19571m implements InterfaceC19572n {

    /* JADX INFO: renamed from: a */
    public final Intent f62160a;

    public C19571m(Intent intent) {
        this.f62160a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19571m) && AbstractC16544l.m18089b(this.f62160a, ((C19571m) obj).f62160a);
    }

    public final int hashCode() {
        Intent intent = this.f62160a;
        if (intent == null) {
            return 0;
        }
        return intent.hashCode();
    }

    public final String toString() {
        return "█";
    }
}

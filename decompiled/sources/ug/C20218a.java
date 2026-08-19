package ug;

import android.content.Intent;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ug.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C20218a implements InterfaceC20220c {

    /* JADX INFO: renamed from: a */
    public final Intent f64011a;

    public C20218a(Intent intent) {
        this.f64011a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20218a) && AbstractC16544l.m18089b(this.f64011a, ((C20218a) obj).f64011a);
    }

    public final int hashCode() {
        Intent intent = this.f64011a;
        if (intent == null) {
            return 0;
        }
        return intent.hashCode();
    }

    public final String toString() {
        return "█";
    }
}

package ug;

import android.content.Intent;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ug.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C20221d implements InterfaceC20224g {

    /* JADX INFO: renamed from: a */
    public final Intent f64013a;

    public C20221d(Intent intent) {
        this.f64013a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20221d) && AbstractC16544l.m18089b(this.f64013a, ((C20221d) obj).f64013a);
    }

    public final int hashCode() {
        Intent intent = this.f64013a;
        if (intent == null) {
            return 0;
        }
        return intent.hashCode();
    }

    public final String toString() {
        return "█";
    }
}

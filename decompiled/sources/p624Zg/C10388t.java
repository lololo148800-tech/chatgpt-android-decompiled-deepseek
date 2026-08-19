package p624Zg;

import android.content.Intent;
import kotlin.jvm.internal.AbstractC16544l;
import p165G9.AbstractC3021g;

/* JADX INFO: renamed from: Zg.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C10388t extends AbstractC3021g {

    /* JADX INFO: renamed from: c */
    public final Intent f30789c;

    public C10388t(Intent intent) {
        AbstractC16544l.m18094g(intent, "intent");
        this.f30789c = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10388t) && AbstractC16544l.m18089b(this.f30789c, ((C10388t) obj).f30789c);
    }

    public final int hashCode() {
        return this.f30789c.hashCode();
    }

    public final String toString() {
        return "█";
    }
}

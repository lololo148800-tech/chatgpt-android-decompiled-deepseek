package p722e8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC8119j5;
import p677c8.C11691c;

/* JADX INFO: renamed from: e8.w */
/* JADX INFO: loaded from: classes.dex */
public final class C13339w extends AbstractC8119j5 {

    /* JADX INFO: renamed from: b */
    public final C11691c f42314b = new C11691c();

    @Override // p523V9.AbstractC8119j5
    /* JADX INFO: renamed from: a */
    public final C11691c mo8622a() {
        return this.f42314b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13339w) && AbstractC16544l.m18089b(this.f42314b, ((C13339w) obj).f42314b);
    }

    public final int hashCode() {
        return this.f42314b.hashCode();
    }

    public final String toString() {
        return "SendCustomActionNow(eventTime=" + this.f42314b + Separators.RPAREN;
    }
}

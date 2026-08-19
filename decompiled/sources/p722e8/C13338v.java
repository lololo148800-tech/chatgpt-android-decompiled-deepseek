package p722e8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC8119j5;
import p677c8.C11691c;

/* JADX INFO: renamed from: e8.v */
/* JADX INFO: loaded from: classes.dex */
public final class C13338v extends AbstractC8119j5 {

    /* JADX INFO: renamed from: b */
    public final boolean f42312b;

    /* JADX INFO: renamed from: c */
    public final C11691c f42313c;

    public C13338v(boolean z6) {
        C11691c c11691c = new C11691c();
        this.f42312b = z6;
        this.f42313c = c11691c;
    }

    @Override // p523V9.AbstractC8119j5
    /* JADX INFO: renamed from: a */
    public final C11691c mo8622a() {
        return this.f42313c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13338v)) {
            return false;
        }
        C13338v c13338v = (C13338v) obj;
        return this.f42312b == c13338v.f42312b && AbstractC16544l.m18089b(this.f42313c, c13338v.f42313c);
    }

    public final int hashCode() {
        return this.f42313c.hashCode() + ((this.f42312b ? 1231 : 1237) * 31);
    }

    public final String toString() {
        return "SdkInit(isAppInForeground=" + this.f42312b + ", eventTime=" + this.f42313c + Separators.RPAREN;
    }
}

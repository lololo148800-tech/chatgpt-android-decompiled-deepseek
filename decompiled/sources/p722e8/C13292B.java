package p722e8;

import android.gov.nist.core.Separators;
import java.util.Map;
import p1071w0.AbstractC20734X;
import p523V9.AbstractC8119j5;
import p592Y7.EnumC9668c;
import p677c8.C11691c;

/* JADX INFO: renamed from: e8.B */
/* JADX INFO: loaded from: classes.dex */
public final class C13292B extends AbstractC8119j5 {

    /* JADX INFO: renamed from: b */
    public final EnumC9668c f42011b;

    /* JADX INFO: renamed from: c */
    public final Map f42012c;

    /* JADX INFO: renamed from: d */
    public final C11691c f42013d;

    public C13292B(EnumC9668c enumC9668c, Map map, C11691c c11691c) {
        this.f42011b = enumC9668c;
        this.f42012c = map;
        this.f42013d = c11691c;
    }

    @Override // p523V9.AbstractC8119j5
    /* JADX INFO: renamed from: a */
    public final C11691c mo8622a() {
        return this.f42013d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13292B)) {
            return false;
        }
        C13292B c13292b = (C13292B) obj;
        return this.f42011b == c13292b.f42011b && this.f42012c.equals(c13292b.f42012c) && this.f42013d.equals(c13292b.f42013d);
    }

    public final int hashCode() {
        EnumC9668c enumC9668c = this.f42011b;
        return this.f42013d.hashCode() + AbstractC20734X.m21250u((enumC9668c == null ? 0 : enumC9668c.hashCode()) * 961, 31, this.f42012c);
    }

    public final String toString() {
        return "StopAction(type=" + this.f42011b + ", name=, attributes=" + this.f42012c + ", eventTime=" + this.f42013d + Separators.RPAREN;
    }
}

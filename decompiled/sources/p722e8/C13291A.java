package p722e8;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p1071w0.AbstractC20734X;
import p279L1.VOxZ.sVoFrD;
import p523V9.AbstractC8119j5;
import p677c8.C11691c;

/* JADX INFO: renamed from: e8.A */
/* JADX INFO: loaded from: classes.dex */
public final class C13291A extends AbstractC8119j5 {

    /* JADX INFO: renamed from: b */
    public final C13304N f42008b;

    /* JADX INFO: renamed from: c */
    public final Map f42009c;

    /* JADX INFO: renamed from: d */
    public final C11691c f42010d;

    @Override // p523V9.AbstractC8119j5
    /* JADX INFO: renamed from: a */
    public final C11691c mo8622a() {
        return this.f42010d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13291A)) {
            return false;
        }
        C13291A c13291a = (C13291A) obj;
        return AbstractC16544l.m18089b(this.f42008b, c13291a.f42008b) && AbstractC16544l.m18089b(this.f42009c, c13291a.f42009c) && AbstractC16544l.m18089b(this.f42010d, c13291a.f42010d);
    }

    public final int hashCode() {
        return this.f42010d.hashCode() + AbstractC20734X.m21250u(this.f42008b.hashCode() * 31, 31, this.f42009c);
    }

    public final String toString() {
        return "StartView(key=" + this.f42008b + ", attributes=" + this.f42009c + ", eventTime=" + this.f42010d + Separators.RPAREN;
    }

    public C13291A(C13304N c13304n, Map map, C11691c eventTime) {
        AbstractC16544l.m18094g(map, sVoFrD.bsANH);
        AbstractC16544l.m18094g(eventTime, "eventTime");
        this.f42008b = c13304n;
        this.f42009c = map;
        this.f42010d = eventTime;
    }
}

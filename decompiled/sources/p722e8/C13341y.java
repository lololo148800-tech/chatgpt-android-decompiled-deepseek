package p722e8;

import android.gov.nist.core.Separators;
import java.util.Map;
import p003A1.AbstractC0168G;
import p1071w0.AbstractC20734X;
import p523V9.AbstractC8119j5;
import p592Y7.EnumC9668c;
import p677c8.C11691c;

/* JADX INFO: renamed from: e8.y */
/* JADX INFO: loaded from: classes.dex */
public final class C13341y extends AbstractC8119j5 {

    /* JADX INFO: renamed from: b */
    public final EnumC9668c f42318b;

    /* JADX INFO: renamed from: c */
    public final String f42319c;

    /* JADX INFO: renamed from: d */
    public final boolean f42320d;

    /* JADX INFO: renamed from: e */
    public final Map f42321e;

    /* JADX INFO: renamed from: f */
    public final C11691c f42322f;

    public C13341y(EnumC9668c enumC9668c, String str, boolean z6, Map map, C11691c c11691c) {
        this.f42318b = enumC9668c;
        this.f42319c = str;
        this.f42320d = z6;
        this.f42321e = map;
        this.f42322f = c11691c;
    }

    @Override // p523V9.AbstractC8119j5
    /* JADX INFO: renamed from: a */
    public final C11691c mo8622a() {
        return this.f42322f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13341y)) {
            return false;
        }
        C13341y c13341y = (C13341y) obj;
        return this.f42318b == c13341y.f42318b && this.f42319c.equals(c13341y.f42319c) && this.f42320d == c13341y.f42320d && this.f42321e.equals(c13341y.f42321e) && this.f42322f.equals(c13341y.f42322f);
    }

    public final int hashCode() {
        return this.f42322f.hashCode() + AbstractC20734X.m21250u((AbstractC0168G.m527p(this.f42318b.hashCode() * 31, 31, this.f42319c) + (this.f42320d ? 1231 : 1237)) * 31, 31, this.f42321e);
    }

    public final String toString() {
        return "StartAction(type=" + this.f42318b + ", name=" + this.f42319c + ", waitForStop=" + this.f42320d + ", attributes=" + this.f42321e + ", eventTime=" + this.f42322f + Separators.RPAREN;
    }
}

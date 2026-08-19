package p722e8;

import android.gov.nist.core.Separators;
import com.google.protobuf.AbstractC12107L1;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p009A7.FlM.nkFZpTrMPpn;
import p1071w0.AbstractC20734X;
import p523V9.AbstractC8119j5;
import p677c8.C11691c;
import p775h2.AbstractC14376f;
import p944p8.C18309a;

/* JADX INFO: renamed from: e8.C */
/* JADX INFO: loaded from: classes.dex */
public final class C13293C extends AbstractC8119j5 {

    /* JADX INFO: renamed from: b */
    public final C18309a f42014b;

    /* JADX INFO: renamed from: c */
    public final Long f42015c;

    /* JADX INFO: renamed from: d */
    public final Long f42016d;

    /* JADX INFO: renamed from: e */
    public final int f42017e;

    /* JADX INFO: renamed from: f */
    public final Map f42018f;

    /* JADX INFO: renamed from: g */
    public final C11691c f42019g;

    public C13293C(C18309a c18309a, Long l4, Long l10, int i10, Map map, C11691c c11691c) {
        AbstractC14376f.m15825D(i10, "kind");
        this.f42014b = c18309a;
        this.f42015c = l4;
        this.f42016d = l10;
        this.f42017e = i10;
        this.f42018f = map;
        this.f42019g = c11691c;
    }

    @Override // p523V9.AbstractC8119j5
    /* JADX INFO: renamed from: a */
    public final C11691c mo8622a() {
        return this.f42019g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13293C)) {
            return false;
        }
        C13293C c13293c = (C13293C) obj;
        return this.f42014b.equals(c13293c.f42014b) && AbstractC16544l.m18089b(this.f42015c, c13293c.f42015c) && AbstractC16544l.m18089b(this.f42016d, c13293c.f42016d) && this.f42017e == c13293c.f42017e && this.f42018f.equals(c13293c.f42018f) && this.f42019g.equals(c13293c.f42019g);
    }

    public final int hashCode() {
        int iHashCode = this.f42014b.f58438a.hashCode() * 31;
        Long l4 = this.f42015c;
        int iHashCode2 = (iHashCode + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l10 = this.f42016d;
        return this.f42019g.hashCode() + AbstractC20734X.m21250u(AbstractC12107L1.m13820k(this.f42017e, (iHashCode2 + (l10 != null ? l10.hashCode() : 0)) * 31, 31), 31, this.f42018f);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder(nkFZpTrMPpn.iVhWiLTyegX);
        sb2.append(this.f42014b);
        sb2.append(", statusCode=");
        sb2.append(this.f42015c);
        sb2.append(", size=");
        sb2.append(this.f42016d);
        sb2.append(", kind=");
        switch (this.f42017e) {
            case 1:
                str = "BEACON";
                break;
            case 2:
                str = "FETCH";
                break;
            case 3:
                str = "XHR";
                break;
            case 4:
                str = "DOCUMENT";
                break;
            case 5:
                str = "NATIVE";
                break;
            case 6:
                str = "UNKNOWN";
                break;
            case 7:
                str = "IMAGE";
                break;
            case 8:
                str = "JS";
                break;
            case 9:
                str = "FONT";
                break;
            case 10:
                str = "CSS";
                break;
            case 11:
                str = "MEDIA";
                break;
            case 12:
                str = "OTHER";
                break;
            default:
                str = "null";
                break;
        }
        sb2.append(str);
        sb2.append(", attributes=");
        sb2.append(this.f42018f);
        sb2.append(", eventTime=");
        sb2.append(this.f42019g);
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}

package p722e8;

import android.gov.nist.core.Separators;
import com.google.protobuf.AbstractC12107L1;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p1071w0.AbstractC20734X;
import p523V9.AbstractC8119j5;
import p571X9.AbstractC9306j0;
import p677c8.C11691c;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: e8.j */
/* JADX INFO: loaded from: classes.dex */
public final class C13326j extends AbstractC8119j5 {

    /* JADX INFO: renamed from: b */
    public final String f42278b;

    /* JADX INFO: renamed from: c */
    public final int f42279c;

    /* JADX INFO: renamed from: d */
    public final Throwable f42280d;

    /* JADX INFO: renamed from: e */
    public final String f42281e;

    /* JADX INFO: renamed from: f */
    public final boolean f42282f;

    /* JADX INFO: renamed from: g */
    public final Map f42283g;

    /* JADX INFO: renamed from: h */
    public final C11691c f42284h;

    /* JADX INFO: renamed from: i */
    public final String f42285i;

    /* JADX INFO: renamed from: j */
    public final int f42286j;

    /* JADX INFO: renamed from: k */
    public final List f42287k;

    /* JADX INFO: renamed from: l */
    public final Long f42288l;

    public C13326j(String message, int i10, Throwable th2, String str, boolean z6, Map map, C11691c c11691c, String str2, int i11, List list, Long l4, int i12) {
        str2 = (i12 & 128) != 0 ? null : str2;
        i11 = (i12 & 256) != 0 ? 1 : i11;
        l4 = (i12 & 1024) != 0 ? null : l4;
        AbstractC16544l.m18094g(message, "message");
        AbstractC14376f.m15825D(i10, "source");
        AbstractC14376f.m15825D(i11, "sourceType");
        this.f42278b = message;
        this.f42279c = i10;
        this.f42280d = th2;
        this.f42281e = str;
        this.f42282f = z6;
        this.f42283g = map;
        this.f42284h = c11691c;
        this.f42285i = str2;
        this.f42286j = i11;
        this.f42287k = list;
        this.f42288l = l4;
    }

    @Override // p523V9.AbstractC8119j5
    /* JADX INFO: renamed from: a */
    public final C11691c mo8622a() {
        return this.f42284h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13326j)) {
            return false;
        }
        C13326j c13326j = (C13326j) obj;
        return AbstractC16544l.m18089b(this.f42278b, c13326j.f42278b) && this.f42279c == c13326j.f42279c && AbstractC16544l.m18089b(this.f42280d, c13326j.f42280d) && AbstractC16544l.m18089b(this.f42281e, c13326j.f42281e) && this.f42282f == c13326j.f42282f && AbstractC16544l.m18089b(this.f42283g, c13326j.f42283g) && AbstractC16544l.m18089b(this.f42284h, c13326j.f42284h) && AbstractC16544l.m18089b(this.f42285i, c13326j.f42285i) && this.f42286j == c13326j.f42286j && AbstractC16544l.m18089b(this.f42287k, c13326j.f42287k) && AbstractC16544l.m18089b(this.f42288l, c13326j.f42288l);
    }

    public final int hashCode() {
        int iM13820k = AbstractC12107L1.m13820k(this.f42279c, this.f42278b.hashCode() * 31, 31);
        Throwable th2 = this.f42280d;
        int iHashCode = (iM13820k + (th2 == null ? 0 : th2.hashCode())) * 31;
        String str = this.f42281e;
        int iHashCode2 = (this.f42284h.hashCode() + AbstractC20734X.m21250u((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f42282f ? 1231 : 1237)) * 31, 31, this.f42283g)) * 31;
        String str2 = this.f42285i;
        int iM15858x = AbstractC14376f.m15858x(this.f42287k, AbstractC12107L1.m13820k(this.f42286j, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        Long l4 = this.f42288l;
        return iM15858x + (l4 != null ? l4.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("AddError(message=");
        sb2.append(this.f42278b);
        sb2.append(", source=");
        sb2.append(AbstractC9306j0.m9902u(this.f42279c));
        sb2.append(", throwable=");
        sb2.append(this.f42280d);
        sb2.append(", stacktrace=");
        sb2.append(this.f42281e);
        sb2.append(", isFatal=");
        sb2.append(this.f42282f);
        sb2.append(", attributes=");
        sb2.append(this.f42283g);
        sb2.append(", eventTime=");
        sb2.append(this.f42284h);
        sb2.append(", type=");
        sb2.append(this.f42285i);
        sb2.append(", sourceType=");
        switch (this.f42286j) {
            case 1:
                str = "ANDROID";
                break;
            case 2:
                str = "BROWSER";
                break;
            case 3:
                str = "REACT_NATIVE";
                break;
            case 4:
                str = "FLUTTER";
                break;
            case 5:
                str = "NDK";
                break;
            case 6:
                str = "NDK_IL2CPP";
                break;
            default:
                str = "null";
                break;
        }
        sb2.append(str);
        sb2.append(", threads=");
        sb2.append(this.f42287k);
        sb2.append(", timeSinceAppStartNs=");
        sb2.append(this.f42288l);
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}

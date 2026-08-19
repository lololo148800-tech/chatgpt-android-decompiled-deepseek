package p722e8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.AbstractC12107L1;
import java.util.Map;
import p003A1.AbstractC0168G;
import p1071w0.AbstractC20734X;
import p523V9.AbstractC8119j5;
import p677c8.C11691c;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: e8.z */
/* JADX INFO: loaded from: classes.dex */
public final class C13342z extends AbstractC8119j5 {

    /* JADX INFO: renamed from: b */
    public final Object f42323b;

    /* JADX INFO: renamed from: c */
    public final String f42324c;

    /* JADX INFO: renamed from: d */
    public final int f42325d;

    /* JADX INFO: renamed from: e */
    public final Map f42326e;

    /* JADX INFO: renamed from: f */
    public final C11691c f42327f;

    public C13342z(Object obj, String str, int i10, Map map, C11691c c11691c) {
        AbstractC14376f.m15825D(i10, "method");
        this.f42323b = obj;
        this.f42324c = str;
        this.f42325d = i10;
        this.f42326e = map;
        this.f42327f = c11691c;
    }

    @Override // p523V9.AbstractC8119j5
    /* JADX INFO: renamed from: a */
    public final C11691c mo8622a() {
        return this.f42327f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13342z)) {
            return false;
        }
        C13342z c13342z = (C13342z) obj;
        return this.f42323b.equals(c13342z.f42323b) && this.f42324c.equals(c13342z.f42324c) && this.f42325d == c13342z.f42325d && this.f42326e.equals(c13342z.f42326e) && this.f42327f.equals(c13342z.f42327f);
    }

    public final int hashCode() {
        return this.f42327f.hashCode() + AbstractC20734X.m21250u(AbstractC12107L1.m13820k(this.f42325d, AbstractC0168G.m527p(this.f42323b.hashCode() * 31, 31, this.f42324c), 31), 31, this.f42326e);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("StartResource(key=");
        sb2.append(this.f42323b);
        sb2.append(", url=");
        sb2.append(this.f42324c);
        sb2.append(", method=");
        switch (this.f42325d) {
            case 1:
                str = "POST";
                break;
            case 2:
                str = "GET";
                break;
            case 3:
                str = "HEAD";
                break;
            case 4:
                str = "PUT";
                break;
            case 5:
                str = "DELETE";
                break;
            case 6:
                str = "PATCH";
                break;
            case 7:
                str = "TRACE";
                break;
            case 8:
                str = TokenNames.OPTIONS;
                break;
            case 9:
                str = "CONNECT";
                break;
            default:
                str = "null";
                break;
        }
        sb2.append(str);
        sb2.append(", attributes=");
        sb2.append(this.f42326e);
        sb2.append(", eventTime=");
        sb2.append(this.f42327f);
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}

package p721e7;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: e7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13289a {

    /* JADX INFO: renamed from: a */
    public final String f42002a;

    /* JADX INFO: renamed from: b */
    public final String f42003b;

    /* JADX INFO: renamed from: c */
    public final String f42004c;

    /* JADX INFO: renamed from: d */
    public final Object f42005d;

    /* JADX INFO: renamed from: e */
    public final byte[] f42006e;

    /* JADX INFO: renamed from: f */
    public final String f42007f;

    public C13289a(String str, String str2, String url, Map map, byte[] bArr, String str3) {
        AbstractC16544l.m18094g(url, "url");
        this.f42002a = str;
        this.f42003b = str2;
        this.f42004c = url;
        this.f42005d = map;
        this.f42006e = bArr;
        this.f42007f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13289a)) {
            return false;
        }
        C13289a c13289a = (C13289a) obj;
        return this.f42002a.equals(c13289a.f42002a) && this.f42003b.equals(c13289a.f42003b) && AbstractC16544l.m18089b(this.f42004c, c13289a.f42004c) && this.f42005d.equals(c13289a.f42005d) && this.f42006e.equals(c13289a.f42006e) && this.f42007f.equals(c13289a.f42007f);
    }

    public final int hashCode() {
        return this.f42007f.hashCode() + ((Arrays.hashCode(this.f42006e) + ((this.f42005d.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p(this.f42002a.hashCode() * 31, 31, this.f42003b), 31, this.f42004c)) * 31)) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.f42006e);
        StringBuilder sb2 = new StringBuilder("Request(id=");
        sb2.append(this.f42002a);
        sb2.append(", description=");
        sb2.append(this.f42003b);
        sb2.append(", url=");
        sb2.append(this.f42004c);
        sb2.append(", headers=");
        sb2.append(this.f42005d);
        sb2.append(", body=");
        sb2.append(string);
        sb2.append(", contentType=");
        return AbstractC9306j0.m9891j(this.f42007f, Separators.RPAREN, sb2);
    }
}

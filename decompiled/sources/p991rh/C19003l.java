package p991rh;

import android.net.Uri;
import ao.AbstractC11153a0;
import java.net.URLDecoder;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p1113xn.AbstractC21322p;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9156K;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: rh.l */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C19003l {
    public static final C19002k Companion = new C19002k();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f60580e = {EnumC18986A.Companion.serializer(), null, null, null};

    /* JADX INFO: renamed from: a */
    public final EnumC18986A f60581a;

    /* JADX INFO: renamed from: b */
    public final String f60582b;

    /* JADX INFO: renamed from: c */
    public final String f60583c;

    /* JADX INFO: renamed from: d */
    public final String f60584d;

    public /* synthetic */ C19003l(int i10, EnumC18986A enumC18986A, String str, String str2, String str3) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C19001j.f60579a.getDescriptor());
            throw null;
        }
        this.f60581a = enumC18986A;
        this.f60582b = str;
        if ((i10 & 4) == 0) {
            this.f60583c = null;
        } else {
            this.f60583c = str2;
        }
        if ((i10 & 8) == 0) {
            this.f60584d = null;
        } else {
            this.f60584d = str3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m20278a(Locale locale) {
        String str;
        String queryParameter = Uri.parse(URLDecoder.decode(this.f60582b, "UTF-8")).getQueryParameter("rscd");
        String strM9706b = (queryParameter == null || (str = (String) AbstractC17680n.m19353c0(AbstractC21322p.m21697e0(queryParameter, new String[]{"filename="}, 0, 6))) == null) ? null : AbstractC9156K.m9706b(str, locale);
        return strM9706b == null ? "" : strM9706b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19003l)) {
            return false;
        }
        C19003l c19003l = (C19003l) obj;
        return this.f60581a == c19003l.f60581a && AbstractC16544l.m18089b(this.f60582b, c19003l.f60582b) && AbstractC16544l.m18089b(this.f60583c, c19003l.f60583c) && AbstractC16544l.m18089b(this.f60584d, c19003l.f60584d);
    }

    public final int hashCode() {
        int iHashCode = this.f60581a.hashCode() * 31;
        String str = this.f60582b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f60583c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f60584d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}

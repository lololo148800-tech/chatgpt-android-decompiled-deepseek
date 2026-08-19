package p543W8;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p522V8.C7836c;
import p593Y8.InterfaceC9684k;
import p594Y9.AbstractC9948p3;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: W8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8440a implements InterfaceC9684k {

    /* JADX INFO: renamed from: c */
    public static final String f26275c;

    /* JADX INFO: renamed from: d */
    public static final Set f26276d;

    /* JADX INFO: renamed from: e */
    public static final C8440a f26277e;

    /* JADX INFO: renamed from: f */
    public static final C8440a f26278f;

    /* JADX INFO: renamed from: a */
    public final String f26279a;

    /* JADX INFO: renamed from: b */
    public final String f26280b;

    static {
        String strM10606b = AbstractC9948p3.m10606b("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f26275c = strM10606b;
        String strM10606b2 = AbstractC9948p3.m10606b("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strM10606b3 = AbstractC9948p3.m10606b("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f26276d = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new C7836c("proto"), new C7836c("json"))));
        f26277e = new C8440a(strM10606b, null);
        f26278f = new C8440a(strM10606b2, strM10606b3);
    }

    public C8440a(String str, String str2) {
        this.f26279a = str;
        this.f26280b = str2;
    }

    /* JADX INFO: renamed from: a */
    public static C8440a m9042a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new C8440a(str2, str3);
    }
}

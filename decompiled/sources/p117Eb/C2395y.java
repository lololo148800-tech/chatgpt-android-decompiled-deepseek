package p117Eb;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import io.sentry.android.core.AbstractC15256t;
import java.util.Arrays;
import java.util.regex.Pattern;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Eb.y */
/* JADX INFO: loaded from: classes.dex */
public final class C2395y {

    /* JADX INFO: renamed from: d */
    public static final Pattern f7450d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a */
    public final String f7451a;

    /* JADX INFO: renamed from: b */
    public final String f7452b;

    /* JADX INFO: renamed from: c */
    public final String f7453c;

    public C2395y(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            AbstractC15256t.m16482t("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + Separators.DOT);
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !f7450d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(AbstractC10763a.m11054l("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f7451a = strSubstring;
        this.f7452b = str;
        this.f7453c = AbstractC9306j0.m9890i(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2395y)) {
            return false;
        }
        C2395y c2395y = (C2395y) obj;
        return this.f7451a.equals(c2395y.f7451a) && this.f7452b.equals(c2395y.f7452b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7452b, this.f7451a});
    }
}

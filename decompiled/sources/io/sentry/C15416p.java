package io.sentry;

import android.gov.nist.core.Separators;
import java.net.URI;
import p544W9.AbstractC8483G3;

/* JADX INFO: renamed from: io.sentry.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C15416p {

    /* JADX INFO: renamed from: a */
    public final String f48042a;

    /* JADX INFO: renamed from: b */
    public final String f48043b;

    /* JADX INFO: renamed from: c */
    public final URI f48044c;

    public C15416p(String str) {
        try {
            AbstractC8483G3.m9133c(str, "The DSN is required.");
            URI uriNormalize = new URI(str).normalize();
            String scheme = uriNormalize.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                throw new IllegalArgumentException("Invalid DSN scheme: " + scheme);
            }
            String userInfo = uriNormalize.getUserInfo();
            if (userInfo == null || userInfo.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            String[] strArrSplit = userInfo.split(":", -1);
            String str2 = strArrSplit[0];
            this.f48043b = str2;
            if (str2 == null || str2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            this.f48042a = strArrSplit.length > 1 ? strArrSplit[1] : null;
            String path = uriNormalize.getPath();
            path = path.endsWith(Separators.SLASH) ? path.substring(0, path.length() - 1) : path;
            int iLastIndexOf = path.lastIndexOf(Separators.SLASH) + 1;
            String strSubstring = path.substring(0, iLastIndexOf);
            strSubstring = strSubstring.endsWith(Separators.SLASH) ? strSubstring : strSubstring.concat(Separators.SLASH);
            String strSubstring2 = path.substring(iLastIndexOf);
            if (strSubstring2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");
            }
            this.f48044c = new URI(scheme, null, uriNormalize.getHost(), uriNormalize.getPort(), strSubstring + "api/" + strSubstring2, null, null);
        } catch (Throwable th2) {
            throw new IllegalArgumentException(th2);
        }
    }
}

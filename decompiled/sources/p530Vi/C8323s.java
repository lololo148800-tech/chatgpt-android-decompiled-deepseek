package p530Vi;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import java.io.IOException;
import java.net.HttpURLConnection;
import kotlin.jvm.internal.AbstractC16544l;
import p451Sb.C7102a;

/* JADX INFO: renamed from: Vi.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C8323s extends C7102a {
    @Override // p451Sb.C7102a
    /* JADX INFO: renamed from: z */
    public final HttpURLConnection mo7517z(String apiHost) throws IOException {
        AbstractC16544l.m18094g(apiHost, "apiHost");
        HttpURLConnection httpURLConnectionM7514y = C7102a.m7514y("https://" + apiHost + "/m");
        httpURLConnectionM7514y.setRequestProperty(SIPHeaderNames.CONTENT_TYPE, "text/plain");
        httpURLConnectionM7514y.setDoOutput(true);
        httpURLConnectionM7514y.setChunkedStreamingMode(0);
        return httpURLConnectionM7514y;
    }
}

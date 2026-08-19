package io.sentry;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import java.io.Closeable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import p784hb.C14438g;

/* JADX INFO: loaded from: classes3.dex */
public final class SpotlightIntegration implements InterfaceC15171W, InterfaceC15418p1, Closeable {

    /* JADX INFO: renamed from: Y */
    public C15524y1 f47216Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC15127H f47217Z = C15473s0.f48339Y;

    /* JADX INFO: renamed from: o0 */
    public InterfaceC15148O f47218o0 = C15476t0.f48343p0;

    /* JADX INFO: renamed from: a */
    public static void m16344a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    /* JADX INFO: renamed from: e */
    public static HttpURLConnection m16345e(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) URI.create(str).toURL().openConnection();
        httpURLConnection.setReadTimeout(1000);
        httpURLConnection.setConnectTimeout(1000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty(SIPHeaderNames.CONTENT_ENCODING, "gzip");
        httpURLConnection.setRequestProperty(SIPHeaderNames.CONTENT_TYPE, "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty(SIPHeaderNames.ACCEPT, "application/json");
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    @Override // io.sentry.InterfaceC15171W
    /* JADX INFO: renamed from: E */
    public final void mo16343E(C15524y1 c15524y1) {
        this.f47216Y = c15524y1;
        this.f47217Z = c15524y1.getLogger();
        if (c15524y1.getBeforeEnvelopeCallback() != null || !c15524y1.isEnableSpotlight()) {
            this.f47217Z.mo16298o(EnumC15375i1.DEBUG, "SpotlightIntegration is not enabled. BeforeEnvelopeCallback is already set or spotlight is not enabled.", new Object[0]);
            return;
        }
        this.f47218o0 = new C14438g(1);
        c15524y1.setBeforeEnvelopeCallback(this);
        this.f47217Z.mo16298o(EnumC15375i1.DEBUG, "SpotlightIntegration enabled.", new Object[0]);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f47218o0.mo15965d(0L);
        C15524y1 c15524y1 = this.f47216Y;
        if (c15524y1 == null || c15524y1.getBeforeEnvelopeCallback() != this) {
            return;
        }
        this.f47216Y.setBeforeEnvelopeCallback(null);
    }
}

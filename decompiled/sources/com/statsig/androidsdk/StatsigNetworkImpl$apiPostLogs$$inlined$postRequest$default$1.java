package com.statsig.androidsdk;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1113xn.C21307a;
import p214Ib.C3669l;
import p265Kb.AbstractC4611d;
import p523V9.AbstractC7942M5;
import p523V9.AbstractC7958O5;
import p571X9.AbstractC9233X;
import p817j$.util.DesugarCollections;
import p882m1.clb.WGTYqNchEpHca;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigNetworkImpl$apiPostLogs$$inlined$postRequest$default$1", m20656f = "StatsigNetwork.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u008a@¨\u0006\u0003"}, m18067d2 = {"", TokenNames.f32019T, "LAn/F;", "com/statsig/androidsdk/StatsigNetworkImpl$postRequest$3", "<anonymous>"}, m18068k = 3, m18069mv = {1, 5, 1})
public final class StatsigNetworkImpl$apiPostLogs$$inlined$postRequest$default$1 extends AbstractC19694j implements InterfaceC1439n {
    final /* synthetic */ String $api;
    final /* synthetic */ String $bodyString;
    final /* synthetic */ ContextType $contextType;
    final /* synthetic */ Diagnostics $diagnostics;
    final /* synthetic */ String $endpoint;
    final /* synthetic */ String $eventsCount;
    final /* synthetic */ String $requestCacheKey;
    final /* synthetic */ int $retries;
    final /* synthetic */ C16525B $statusCode$inlined;
    final /* synthetic */ Integer $timeout;
    int label;
    final /* synthetic */ StatsigNetworkImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigNetworkImpl$apiPostLogs$$inlined$postRequest$default$1(String str, String str2, String str3, StatsigNetworkImpl statsigNetworkImpl, Integer num, String str4, Diagnostics diagnostics, int i10, ContextType contextType, String str5, InterfaceC18770c interfaceC18770c, C16525B c16525b) {
        super(2, interfaceC18770c);
        this.$api = str;
        this.$endpoint = str2;
        this.$requestCacheKey = str3;
        this.this$0 = statsigNetworkImpl;
        this.$timeout = num;
        this.$eventsCount = str4;
        this.$diagnostics = diagnostics;
        this.$retries = i10;
        this.$contextType = contextType;
        this.$bodyString = str5;
        this.$statusCode$inlined = c16525b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
        return new StatsigNetworkImpl$apiPostLogs$$inlined$postRequest$default$1(this.$api, this.$endpoint, this.$requestCacheKey, this.this$0, this.$timeout, this.$eventsCount, this.$diagnostics, this.$retries, this.$contextType, this.$bodyString, interfaceC18770c, this.$statusCode$inlined);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super LogEventResponse> interfaceC18770c) {
        return ((StatsigNetworkImpl$apiPostLogs$$inlined$postRequest$default$1) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strM18100m;
        Marker.ErrorMessage errorMessage;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(obj);
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                if (AbstractC21329w.m21725l(this.$api, Separators.SLASH, false)) {
                    strM18100m = AbstractC16544l.m18100m(this.$endpoint, this.$api);
                } else {
                    strM18100m = this.$api + '/' + this.$endpoint;
                }
                URL url = new URL(strM18100m);
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                if (uRLConnectionOpenConnection == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                }
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
                try {
                    if (this.$requestCacheKey != null && !AbstractC21322p.m21667A(this.$endpoint, "log_event", false)) {
                        if (this.this$0.initializeRequestsMap.size() > 50) {
                            Iterator it = this.this$0.initializeRequestsMap.values().iterator();
                            while (it.hasNext()) {
                                ((HttpURLConnection) it.next()).disconnect();
                            }
                            this.this$0.initializeRequestsMap = DesugarCollections.synchronizedMap(new LinkedHashMap());
                        }
                        Map initializeRequestsMap = this.this$0.initializeRequestsMap;
                        AbstractC16544l.m18093f(initializeRequestsMap, "initializeRequestsMap");
                        initializeRequestsMap.put(this.$requestCacheKey, httpURLConnection2);
                    }
                    if (AbstractC16544l.m18089b(url.getProtocol(), "http")) {
                        httpURLConnection2.setDoOutput(true);
                    }
                    httpURLConnection2.setRequestMethod("POST");
                    Integer num = this.$timeout;
                    if (num != null) {
                        httpURLConnection2.setConnectTimeout(num.intValue());
                        httpURLConnection2.setReadTimeout(this.$timeout.intValue());
                    }
                    httpURLConnection2.setRequestProperty(SIPHeaderNames.CONTENT_TYPE, "application/json; charset=UTF-8");
                    httpURLConnection2.setRequestProperty("STATSIG-API-KEY", this.this$0.sdkKey);
                    httpURLConnection2.setRequestProperty("STATSIG-SDK-TYPE", "android-client");
                    httpURLConnection2.setRequestProperty("STATSIG-SDK-VERSION", BuildConfig.VERSION_NAME);
                    httpURLConnection2.setRequestProperty("STATSIG-CLIENT-TIME", String.valueOf(System.currentTimeMillis()));
                    String str = this.$eventsCount;
                    if (str != null) {
                        httpURLConnection2.setRequestProperty("STATSIG-EVENT-COUNT", str);
                    }
                    httpURLConnection2.setRequestProperty(WGTYqNchEpHca.WUjNvZfGmpA, "application/json");
                    httpURLConnection2.setRequestProperty(SIPHeaderNames.ACCEPT_ENCODING, "gzip");
                    Diagnostics diagnostics = this.$diagnostics;
                    if (diagnostics != null) {
                        diagnostics.markStart(KeyType.INITIALIZE, StepType.NETWORK_REQUEST, new Marker(null, null, null, null, null, null, null, null, null, null, null, new Integer(this.$retries), null, null, null, null, null, null, null, null, 1046527, null), this.$contextType);
                    }
                    OutputStream outputStream = httpURLConnection2.getOutputStream();
                    AbstractC16544l.m18093f(outputStream, "connection.outputStream");
                    Charset charset = C21307a.f67720a;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, charset), 8192);
                    try {
                        bufferedWriter.write(this.$bodyString);
                        AbstractC7942M5.m8232a(bufferedWriter, null);
                        int responseCode = httpURLConnection2.getResponseCode();
                        InputStream stream = responseCode < 400 ? httpURLConnection2.getInputStream() : httpURLConnection2.getErrorStream();
                        if (responseCode >= 400) {
                            AbstractC16544l.m18093f(stream, "inputStream");
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream, charset), 8192);
                            try {
                                String strM8249b = AbstractC7958O5.m8249b(bufferedReader);
                                AbstractC7942M5.m8232a(bufferedReader, null);
                                errorMessage = new Marker.ErrorMessage(strM8249b, String.valueOf(responseCode), null);
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    AbstractC7942M5.m8232a(bufferedReader, th2);
                                    throw th3;
                                }
                            }
                        } else {
                            errorMessage = null;
                        }
                        StatsigNetworkImpl statsigNetworkImpl = this.this$0;
                        Diagnostics diagnostics2 = this.$diagnostics;
                        ContextType contextType = this.$contextType;
                        KeyType keyType = KeyType.INITIALIZE;
                        Integer num2 = new Integer(responseCode);
                        List<String> list = httpURLConnection2.getHeaderFields().get("x-statsig-region");
                        statsigNetworkImpl.endDiagnostics(diagnostics2, contextType, keyType, num2, list == null ? null : list.get(0), new Integer(this.$retries), errorMessage, this.$timeout);
                        this.$statusCode$inlined.f51262Y = new Integer(responseCode);
                        if (200 > responseCode || responseCode > 299) {
                            httpURLConnection2.disconnect();
                            return null;
                        }
                        if (responseCode == 204 && AbstractC16544l.m18089b(this.$endpoint, "initialize")) {
                            Object objM4371e = this.this$0.gson.m4371e(LogEventResponse.class, "{has_updates: false}");
                            httpURLConnection2.disconnect();
                            return objM4371e;
                        }
                        String headerField = httpURLConnection2.getHeaderField(SIPHeaderNames.CONTENT_ENCODING);
                        if (headerField != null && headerField.equals("gzip")) {
                            stream = new GZIPInputStream(stream);
                        }
                        AbstractC16544l.m18093f(stream, "stream");
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(stream, charset), 8192);
                        try {
                            C3669l c3669l = this.this$0.gson;
                            c3669l.getClass();
                            Object objCast = AbstractC4611d.m5353l(LogEventResponse.class).cast(c3669l.m4370d(bufferedReader2, TypeToken.get(LogEventResponse.class)));
                            AbstractC7942M5.m8232a(bufferedReader2, null);
                            httpURLConnection2.disconnect();
                            return objCast;
                        } catch (Throwable th4) {
                            try {
                                throw th4;
                            } catch (Throwable th5) {
                                AbstractC7942M5.m8232a(bufferedReader2, th4);
                                throw th5;
                            }
                        }
                    } catch (Throwable th6) {
                        try {
                            throw th6;
                        } catch (Throwable th7) {
                            AbstractC7942M5.m8232a(bufferedWriter, th6);
                            throw th7;
                        }
                    }
                } catch (Exception e10) {
                    throw e10;
                } catch (Throwable th8) {
                    th = th8;
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (Exception e11) {
            throw e11;
        }
    }
}

package com.revenuecat.purchases.common;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.os.Build;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.networking.ETagManager;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPRequest;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.networking.MapConverter;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.common.verification.SignatureVerificationException;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.interfaces.StorefrontProvider;
import com.revenuecat.purchases.strings.NetworkStrings;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import org.json.JSONObject;
import p1053v3.p1054lN.IGDwkYw;
import p1113xn.AbstractC21322p;
import p1135yn.C21555b;
import p523V9.AbstractC7958O5;
import p571X9.AbstractC9306j0;
import p909nm.AbstractC17659D;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u0000 _2\u00020\u0001:\u0001_BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0015\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0015\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u001bH\u0002¢\u0006\u0004\b%\u0010&Jq\u00103\u001a\u0004\u0018\u0001022\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0016\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010+2\u001a\u0010.\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0-\u0018\u00010,2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0+2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b3\u00104J1\u00109\u001a\u00020$2\u0006\u0010*\u001a\u00020)2\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u0002002\b\u00108\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\b9\u0010:J[\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0+2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0+2\u0006\u0010<\u001a\u00020\u001b2\u0006\u00101\u001a\u0002002\b\u0010=\u001a\u0004\u0018\u00010\u001b2\u0006\u0010>\u001a\u0002002\b\u0010?\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020\u001e2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u001bH\u0002¢\u0006\u0004\bF\u0010GJ=\u0010K\u001a\u00020J2\u0006\u0010<\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u001b2\b\u0010=\u001a\u0004\u0018\u00010\u001b2\b\u0010?\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\bK\u0010LJ\u001f\u0010N\u001a\n M*\u0004\u0018\u00010\u001b0\u001b2\u0006\u0010\u001f\u001a\u00020HH\u0002¢\u0006\u0004\bN\u0010OJ\u0019\u0010P\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001f\u001a\u00020HH\u0002¢\u0006\u0004\bP\u0010OJ\u0019\u0010Q\u001a\u0004\u0018\u0001052\u0006\u0010\u001f\u001a\u00020HH\u0002¢\u0006\u0004\bQ\u0010RJo\u0010S\u001a\u0002022\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0016\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010+2\u001a\u0010.\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0-\u0018\u00010,2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0+2\b\b\u0002\u00101\u001a\u000200¢\u0006\u0004\bS\u00104J\r\u0010T\u001a\u00020$¢\u0006\u0004\bT\u0010UR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010VR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010WR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010XR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010Y\u001a\u0004\bZ\u0010[R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\\R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010]R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010^¨\u0006`"}, m18067d2 = {"Lcom/revenuecat/purchases/common/HTTPClient;", "", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/networking/ETagManager;", "eTagManager", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/common/verification/SigningManager;", "signingManager", "Lcom/revenuecat/purchases/interfaces/StorefrontProvider;", "storefrontProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "Lcom/revenuecat/purchases/common/networking/MapConverter;", "mapConverter", "<init>", "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/networking/ETagManager;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/common/verification/SigningManager;Lcom/revenuecat/purchases/interfaces/StorefrontProvider;Lcom/revenuecat/purchases/common/DateProvider;Lcom/revenuecat/purchases/common/networking/MapConverter;)V", "Ljava/io/InputStream;", "inputStream", "Ljava/io/BufferedReader;", "buffer", "(Ljava/io/InputStream;)Ljava/io/BufferedReader;", "Ljava/io/OutputStream;", "outputStream", "Ljava/io/BufferedWriter;", "(Ljava/io/OutputStream;)Ljava/io/BufferedWriter;", "", "readFully", "(Ljava/io/InputStream;)Ljava/lang/String;", "Ljava/net/HttpURLConnection;", "connection", "getInputStream", "(Ljava/net/HttpURLConnection;)Ljava/io/InputStream;", "writer", "body", "Lmm/C;", "writeFully", "(Ljava/io/BufferedWriter;Ljava/lang/String;)V", "Ljava/net/URL;", "baseURL", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "endpoint", "", "", "Lmm/l;", "postFieldsToSign", "requestHeaders", "", "refreshETag", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "performCall", "(Ljava/net/URL;Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Z)Lcom/revenuecat/purchases/common/networking/HTTPResult;", "Ljava/util/Date;", "requestStartTime", "callSuccessful", "callResult", "trackHttpRequestPerformedIfNeeded", "(Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/Date;ZLcom/revenuecat/purchases/common/networking/HTTPResult;)V", "authenticationHeaders", "urlPath", "nonce", "shouldSignResponse", "postFieldsToSignHeader", "getHeaders", "(Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;)Ljava/util/Map;", "Lcom/revenuecat/purchases/common/networking/HTTPRequest;", "request", "getConnection", "(Lcom/revenuecat/purchases/common/networking/HTTPRequest;)Ljava/net/HttpURLConnection;", "getXPlatformHeader", "()Ljava/lang/String;", "Ljava/net/URLConnection;", "payload", "Lcom/revenuecat/purchases/VerificationResult;", "verifyResponse", "(Ljava/lang/String;Ljava/net/URLConnection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/VerificationResult;", "kotlin.jvm.PlatformType", "getETagHeader", "(Ljava/net/URLConnection;)Ljava/lang/String;", "getRequestTimeHeader", "getRequestDateHeader", "(Ljava/net/URLConnection;)Ljava/util/Date;", "performRequest", "clearCaches", "()V", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/networking/ETagManager;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Lcom/revenuecat/purchases/common/verification/SigningManager;", "getSigningManager", "()Lcom/revenuecat/purchases/common/verification/SigningManager;", "Lcom/revenuecat/purchases/interfaces/StorefrontProvider;", "Lcom/revenuecat/purchases/common/DateProvider;", "Lcom/revenuecat/purchases/common/networking/MapConverter;", "Companion", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class HTTPClient {
    public static final int NO_STATUS_CODE = -1;
    private final AppConfig appConfig;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final ETagManager eTagManager;
    private final MapConverter mapConverter;
    private final SigningManager signingManager;
    private final StorefrontProvider storefrontProvider;

    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Store.values().length];
            try {
                iArr[Store.AMAZON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HTTPClient(AppConfig appConfig, ETagManager eTagManager, DiagnosticsTracker diagnosticsTracker, SigningManager signingManager, StorefrontProvider storefrontProvider, DateProvider dateProvider, MapConverter mapConverter) {
        AbstractC16544l.m18094g(appConfig, "appConfig");
        AbstractC16544l.m18094g(eTagManager, "eTagManager");
        AbstractC16544l.m18094g(signingManager, "signingManager");
        AbstractC16544l.m18094g(storefrontProvider, "storefrontProvider");
        AbstractC16544l.m18094g(dateProvider, "dateProvider");
        AbstractC16544l.m18094g(mapConverter, "mapConverter");
        this.appConfig = appConfig;
        this.eTagManager = eTagManager;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.signingManager = signingManager;
        this.storefrontProvider = storefrontProvider;
        this.dateProvider = dateProvider;
        this.mapConverter = mapConverter;
    }

    private final BufferedReader buffer(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream));
    }

    private final HttpURLConnection getConnection(HTTPRequest request) throws IOException {
        URLConnection uRLConnectionOpenConnection = request.getFullURL().openConnection();
        AbstractC16544l.m18092e(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        for (Map.Entry<String, String> entry : request.getHeaders().entrySet()) {
            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
        }
        JSONObject body = request.getBody();
        if (body != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            OutputStream os = httpURLConnection.getOutputStream();
            AbstractC16544l.m18093f(os, "os");
            BufferedWriter bufferedWriterBuffer = buffer(os);
            String string = body.toString();
            AbstractC16544l.m18093f(string, "body.toString()");
            writeFully(bufferedWriterBuffer, string);
        }
        return httpURLConnection;
    }

    private final String getETagHeader(URLConnection connection) {
        return connection.getHeaderField("X-RevenueCat-ETag");
    }

    private final Map<String, String> getHeaders(Map<String, String> authenticationHeaders, String urlPath, boolean refreshETag, String nonce, boolean shouldSignResponse, String postFieldsToSignHeader) {
        return MapExtensionsKt.filterNotNullValues(AbstractC17659D.m19248j(AbstractC17659D.m19248j(AbstractC17659D.m19244f(new C17309l(SIPHeaderNames.CONTENT_TYPE, "application/json"), new C17309l("X-Platform", getXPlatformHeader()), new C17309l("X-Platform-Flavor", this.appConfig.getPlatformInfo().getFlavor()), new C17309l("X-Platform-Flavor-Version", this.appConfig.getPlatformInfo().getVersion()), new C17309l("X-Platform-Version", String.valueOf(Build.VERSION.SDK_INT)), new C17309l("X-Version", "8.6.0"), new C17309l("X-Client-Locale", this.appConfig.getLanguageTag()), new C17309l("X-Client-Version", this.appConfig.getVersionName()), new C17309l("X-Client-Bundle-ID", this.appConfig.getPackageName()), new C17309l("X-Observer-Mode-Enabled", this.appConfig.getFinishTransactions() ? "false" : "true"), new C17309l("X-Nonce", nonce), new C17309l(HTTPRequest.POST_PARAMS_HASH, postFieldsToSignHeader), new C17309l("X-Custom-Entitlements-Computation", this.appConfig.getCustomEntitlementComputation() ? "true" : null), new C17309l("X-Storefront", this.storefrontProvider.getStorefront())), authenticationHeaders), this.eTagManager.getETagHeaders$purchases_customEntitlementComputationRelease(urlPath, shouldSignResponse, refreshETag)));
    }

    private final InputStream getInputStream(HttpURLConnection connection) throws Exception {
        try {
            return connection.getInputStream();
        } catch (Exception e10) {
            if (!(e10 instanceof IllegalArgumentException ? true : e10 instanceof IOException)) {
                throw e10;
            }
            LogWrapperKt.log(LogIntent.WARNING, String.format(NetworkStrings.PROBLEM_CONNECTING, Arrays.copyOf(new Object[]{e10.getMessage()}, 1)));
            return connection.getErrorStream();
        }
    }

    private final Date getRequestDateHeader(URLConnection connection) {
        String requestTimeHeader = getRequestTimeHeader(connection);
        if (requestTimeHeader != null) {
            return new Date(Long.parseLong(requestTimeHeader));
        }
        return null;
    }

    private final String getRequestTimeHeader(URLConnection connection) {
        String headerField = connection.getHeaderField(HTTPResult.REQUEST_TIME_HEADER_NAME);
        if (headerField == null || AbstractC21322p.m21681O(headerField)) {
            return null;
        }
        return headerField;
    }

    private final String getXPlatformHeader() {
        return WhenMappings.$EnumSwitchMapping$0[this.appConfig.getStore().ordinal()] == 1 ? "amazon" : "android";
    }

    public static /* synthetic */ HTTPResult performRequest$default(HTTPClient hTTPClient, URL url, Endpoint endpoint, Map map, List list, Map map2, boolean z6, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            z6 = false;
        }
        return hTTPClient.performRequest(url, endpoint, map, list, map2, z6);
    }

    private final String readFully(InputStream inputStream) {
        return AbstractC7958O5.m8249b(buffer(inputStream));
    }

    private final void trackHttpRequestPerformedIfNeeded(Endpoint endpoint, Date requestStartTime, boolean callSuccessful, HTTPResult callResult) {
        int responseCode;
        VerificationResult verificationResult;
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            long jBetween = DurationExtensionsKt.between(C21555b.f68260Z, requestStartTime, this.dateProvider.getNow());
            if (callSuccessful) {
                responseCode = callResult != null ? callResult.getResponseCode() : RCHTTPStatusCodes.NOT_MODIFIED;
            } else {
                responseCode = -1;
            }
            int i10 = responseCode;
            HTTPResult.Origin origin = callResult != null ? callResult.getOrigin() : null;
            if (callResult == null || (verificationResult = callResult.getVerificationResult()) == null) {
                verificationResult = VerificationResult.NOT_REQUESTED;
            }
            diagnosticsTracker.m22509trackHttpRequestPerformedNcHsxvU(endpoint, jBetween, callSuccessful && RCHTTPStatusCodes.INSTANCE.isSuccessful(i10), i10, origin, verificationResult);
        }
    }

    private final VerificationResult verifyResponse(String urlPath, URLConnection connection, String payload, String nonce, String postFieldsToSignHeader) {
        return this.signingManager.verifyResponse(urlPath, connection.getHeaderField(HTTPResult.SIGNATURE_HEADER_NAME), nonce, payload, getRequestTimeHeader(connection), getETagHeader(connection), postFieldsToSignHeader);
    }

    private final void writeFully(BufferedWriter writer, String body) throws IOException {
        writer.write(body);
        writer.flush();
    }

    public final void clearCaches() {
        this.eTagManager.clearCaches$purchases_customEntitlementComputationRelease();
    }

    public final SigningManager getSigningManager() {
        return this.signingManager;
    }

    public final HTTPResult performRequest(URL baseURL, Endpoint endpoint, Map<String, ? extends Object> body, List<C17309l> postFieldsToSign, Map<String, String> requestHeaders, boolean refreshETag) {
        AbstractC16544l.m18094g(baseURL, "baseURL");
        AbstractC16544l.m18094g(endpoint, "endpoint");
        AbstractC16544l.m18094g(requestHeaders, "requestHeaders");
        if (this.appConfig.getForceServerErrors()) {
            LogUtilsKt.warnLog("Forcing server error for request to " + endpoint.getPath());
            return new HTTPResult(500, "", HTTPResult.Origin.BACKEND, null, VerificationResult.NOT_REQUESTED);
        }
        Date now = this.dateProvider.getNow();
        try {
            HTTPResult hTTPResultPerformCall = performCall(baseURL, endpoint, body, postFieldsToSign, requestHeaders, refreshETag);
            trackHttpRequestPerformedIfNeeded(endpoint, now, true, hTTPResultPerformCall);
            if (hTTPResultPerformCall != null) {
                return hTTPResultPerformCall;
            }
            LogWrapperKt.log(LogIntent.WARNING, NetworkStrings.ETAG_RETRYING_CALL);
            return performRequest(baseURL, endpoint, body, postFieldsToSign, requestHeaders, true);
        } catch (Throwable th2) {
            trackHttpRequestPerformedIfNeeded(endpoint, now, false, null);
            throw th2;
        }
    }

    private final BufferedWriter buffer(OutputStream outputStream) {
        return new BufferedWriter(new OutputStreamWriter(outputStream));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    private final HTTPResult performCall(URL baseURL, Endpoint endpoint, Map<String, ? extends Object> body, List<C17309l> postFieldsToSign, Map<String, String> requestHeaders, boolean refreshETag) throws Exception {
        String postParamsForSigningHeaderIfNeeded;
        JSONObject jSONObjectConvertToJSON$purchases_customEntitlementComputationRelease = body != null ? this.mapConverter.convertToJSON$purchases_customEntitlementComputationRelease(body) : null;
        String path = endpoint.getPath();
        String strM9889h = AbstractC9306j0.m9889h("/v1", path);
        boolean zShouldVerifyEndpoint = this.signingManager.shouldVerifyEndpoint(endpoint);
        boolean z6 = zShouldVerifyEndpoint && endpoint.getNeedsNonceToPerformSigning();
        try {
            URL url = new URL(baseURL, strM9889h);
            String strCreateRandomNonce = z6 ? this.signingManager.createRandomNonce() : null;
            if (postFieldsToSign == null) {
                postParamsForSigningHeaderIfNeeded = null;
            } else {
                if ((zShouldVerifyEndpoint ? postFieldsToSign : null) != null) {
                    postParamsForSigningHeaderIfNeeded = this.signingManager.getPostParamsForSigningHeaderIfNeeded(endpoint, postFieldsToSign);
                } else {
                    postParamsForSigningHeaderIfNeeded = null;
                }
            }
            HttpURLConnection connection = getConnection(new HTTPRequest(url, getHeaders(requestHeaders, strM9889h, refreshETag, strCreateRandomNonce, zShouldVerifyEndpoint, postParamsForSigningHeaderIfNeeded), jSONObjectConvertToJSON$purchases_customEntitlementComputationRelease));
            InputStream inputStream = getInputStream(connection);
            try {
                LogUtilsKt.debugLog(String.format(NetworkStrings.API_REQUEST_STARTED, Arrays.copyOf(new Object[]{connection.getRequestMethod(), path}, 2)));
                int responseCode = connection.getResponseCode();
                String fully = inputStream != null ? readFully(inputStream) : null;
                if (inputStream != null) {
                    inputStream.close();
                }
                connection.disconnect();
                LogUtilsKt.debugLog(String.format(NetworkStrings.API_REQUEST_COMPLETED, Arrays.copyOf(new Object[]{connection.getRequestMethod(), path, Integer.valueOf(responseCode)}, 3)));
                if (fully == null) {
                    throw new IOException(IGDwkYw.hiXCGOqxV);
                }
                VerificationResult verificationResultVerifyResponse = (zShouldVerifyEndpoint && RCHTTPStatusCodes.INSTANCE.isSuccessful(responseCode)) ? verifyResponse(strM9889h, connection, fully, strCreateRandomNonce, postParamsForSigningHeaderIfNeeded) : VerificationResult.NOT_REQUESTED;
                if (verificationResultVerifyResponse == VerificationResult.FAILED && (this.signingManager.getSignatureVerificationMode() instanceof SignatureVerificationMode.Enforced)) {
                    throw new SignatureVerificationException(path);
                }
                return this.eTagManager.m14462x4bec99f(responseCode, fully, getETagHeader(connection), strM9889h, refreshETag, getRequestDateHeader(connection), verificationResultVerifyResponse);
            } catch (Throwable th2) {
                if (inputStream != null) {
                    inputStream.close();
                }
                connection.disconnect();
                throw th2;
            }
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public /* synthetic */ HTTPClient(AppConfig appConfig, ETagManager eTagManager, DiagnosticsTracker diagnosticsTracker, SigningManager signingManager, StorefrontProvider storefrontProvider, DateProvider dateProvider, MapConverter mapConverter, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(appConfig, eTagManager, diagnosticsTracker, signingManager, storefrontProvider, (i10 & 32) != 0 ? new DefaultDateProvider() : dateProvider, (i10 & 64) != 0 ? new MapConverter() : mapConverter);
    }
}

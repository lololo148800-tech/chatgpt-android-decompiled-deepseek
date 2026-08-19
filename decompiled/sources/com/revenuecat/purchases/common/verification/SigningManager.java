package com.revenuecat.purchases.common.verification;

import android.gov.nist.core.Separators;
import android.util.Base64;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.strings.NetworkStrings;
import com.revenuecat.purchases.utils.Result;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17309l;
import p003A1.AbstractC0168G;
import p025An.C0644w;
import p1113xn.AbstractC21322p;
import p1113xn.C21307a;
import p571X9.AbstractC9306j0;
import p582Xk.HXHG.bQBnquXS;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 %2\u00020\u0001:\u0002%&B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\u001a\u0010\u0013\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015JQ\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$¨\u0006'"}, m18067d2 = {"Lcom/revenuecat/purchases/common/verification/SigningManager;", "", "Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "signatureVerificationMode", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "", "apiKey", "<init>", "(Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;Lcom/revenuecat/purchases/common/AppConfig;Ljava/lang/String;)V", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "endpoint", "", "shouldVerifyEndpoint", "(Lcom/revenuecat/purchases/common/networking/Endpoint;)Z", "createRandomNonce", "()Ljava/lang/String;", "", "Lmm/l;", "postFieldsToSign", "getPostParamsForSigningHeaderIfNeeded", "(Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/List;)Ljava/lang/String;", "urlPath", "signatureString", "nonce", "body", "requestTime", "eTag", "postFieldsToSignHeader", "Lcom/revenuecat/purchases/VerificationResult;", "verifyResponse", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/VerificationResult;", "Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "getSignatureVerificationMode", "()Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "Lcom/revenuecat/purchases/common/AppConfig;", "Ljava/lang/String;", "Companion", "Parameters", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SigningManager {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int NONCE_BYTES_SIZE = 12;

    @Deprecated
    public static final String POST_PARAMS_ALGORITHM = "sha256";

    @Deprecated
    public static final byte POST_PARAMS_SEPARATOR = 0;
    private final String apiKey;
    private final AppConfig appConfig;
    private final SignatureVerificationMode signatureVerificationMode;

    @Metadata(m18066d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m18067d2 = {"Lcom/revenuecat/purchases/common/verification/SigningManager$Companion;", "", "()V", "NONCE_BYTES_SIZE", "", "POST_PARAMS_ALGORITHM", "", "POST_PARAMS_SEPARATOR", "", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003Ja\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\u0006\u0010%\u001a\u00020\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006'"}, m18067d2 = {"Lcom/revenuecat/purchases/common/verification/SigningManager$Parameters;", "", "salt", "", "apiKey", "", "nonce", "urlPath", "postParamsHashHeader", "requestTime", "eTag", "body", "([BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApiKey", "()Ljava/lang/String;", "getBody", "getETag", "getNonce", "getPostParamsHashHeader", "getRequestTime", "getSalt", "()[B", "getUrlPath", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toSignatureToVerify", "toString", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class Parameters {
        private final String apiKey;
        private final String body;
        private final String eTag;
        private final String nonce;
        private final String postParamsHashHeader;
        private final String requestTime;
        private final byte[] salt;
        private final String urlPath;

        public Parameters(byte[] salt, String apiKey, String str, String urlPath, String str2, String requestTime, String str3, String str4) {
            AbstractC16544l.m18094g(salt, "salt");
            AbstractC16544l.m18094g(apiKey, "apiKey");
            AbstractC16544l.m18094g(urlPath, "urlPath");
            AbstractC16544l.m18094g(requestTime, "requestTime");
            this.salt = salt;
            this.apiKey = apiKey;
            this.nonce = str;
            this.urlPath = urlPath;
            this.postParamsHashHeader = str2;
            this.requestTime = requestTime;
            this.eTag = str3;
            this.body = str4;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final byte[] getSalt() {
            return this.salt;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getApiKey() {
            return this.apiKey;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getNonce() {
            return this.nonce;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getUrlPath() {
            return this.urlPath;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getPostParamsHashHeader() {
            return this.postParamsHashHeader;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getRequestTime() {
            return this.requestTime;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getETag() {
            return this.eTag;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        public final Parameters copy(byte[] salt, String apiKey, String nonce, String urlPath, String postParamsHashHeader, String requestTime, String eTag, String body) {
            AbstractC16544l.m18094g(salt, "salt");
            AbstractC16544l.m18094g(apiKey, "apiKey");
            AbstractC16544l.m18094g(urlPath, "urlPath");
            AbstractC16544l.m18094g(requestTime, "requestTime");
            return new Parameters(salt, apiKey, nonce, urlPath, postParamsHashHeader, requestTime, eTag, body);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!Parameters.class.equals(other != null ? other.getClass() : null)) {
                return false;
            }
            AbstractC16544l.m18092e(other, "null cannot be cast to non-null type com.revenuecat.purchases.common.verification.SigningManager.Parameters");
            Parameters parameters = (Parameters) other;
            return Arrays.equals(this.salt, parameters.salt) && AbstractC16544l.m18089b(this.apiKey, parameters.apiKey) && AbstractC16544l.m18089b(this.nonce, parameters.nonce) && AbstractC16544l.m18089b(this.urlPath, parameters.urlPath) && AbstractC16544l.m18089b(this.postParamsHashHeader, parameters.postParamsHashHeader) && AbstractC16544l.m18089b(this.requestTime, parameters.requestTime) && AbstractC16544l.m18089b(this.eTag, parameters.eTag) && AbstractC16544l.m18089b(this.body, parameters.body);
        }

        public final String getApiKey() {
            return this.apiKey;
        }

        public final String getBody() {
            return this.body;
        }

        public final String getETag() {
            return this.eTag;
        }

        public final String getNonce() {
            return this.nonce;
        }

        public final String getPostParamsHashHeader() {
            return this.postParamsHashHeader;
        }

        public final String getRequestTime() {
            return this.requestTime;
        }

        public final byte[] getSalt() {
            return this.salt;
        }

        public final String getUrlPath() {
            return this.urlPath;
        }

        public int hashCode() {
            int iM527p = AbstractC0168G.m527p(Arrays.hashCode(this.salt) * 31, 31, this.apiKey);
            String str = this.nonce;
            int iM527p2 = AbstractC0168G.m527p((iM527p + (str != null ? str.hashCode() : 0)) * 31, 31, this.urlPath);
            String str2 = this.postParamsHashHeader;
            int iM527p3 = AbstractC0168G.m527p((iM527p2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.requestTime);
            String str3 = this.eTag;
            int iHashCode = (iM527p3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.body;
            return iHashCode + (str4 != null ? str4.hashCode() : 0);
        }

        public final byte[] toSignatureToVerify() {
            byte[] bytes;
            byte[] bytes2;
            byte[] bytes3;
            byte[] bArr = this.salt;
            String str = this.apiKey;
            Charset charset = C21307a.f67720a;
            byte[] bytes4 = str.getBytes(charset);
            AbstractC16544l.m18093f(bytes4, "this as java.lang.String).getBytes(charset)");
            byte[] bArrM19286I = AbstractC17678l.m19286I(bArr, bytes4);
            String str2 = this.nonce;
            byte[] bArrDecode = str2 != null ? Base64.decode(str2, 0) : null;
            if (bArrDecode == null) {
                bArrDecode = new byte[0];
            }
            byte[] bArrM19286I2 = AbstractC17678l.m19286I(bArrM19286I, bArrDecode);
            byte[] bytes5 = this.urlPath.getBytes(charset);
            AbstractC16544l.m18093f(bytes5, "this as java.lang.String).getBytes(charset)");
            byte[] bArrM19286I3 = AbstractC17678l.m19286I(bArrM19286I2, bytes5);
            String str3 = this.postParamsHashHeader;
            if (str3 != null) {
                bytes = str3.getBytes(charset);
                AbstractC16544l.m18093f(bytes, "this as java.lang.String).getBytes(charset)");
            } else {
                bytes = new byte[0];
            }
            byte[] bArrM19286I4 = AbstractC17678l.m19286I(bArrM19286I3, bytes);
            byte[] bytes6 = this.requestTime.getBytes(charset);
            AbstractC16544l.m18093f(bytes6, "this as java.lang.String).getBytes(charset)");
            byte[] bArrM19286I5 = AbstractC17678l.m19286I(bArrM19286I4, bytes6);
            String str4 = this.eTag;
            if (str4 != null) {
                bytes2 = str4.getBytes(charset);
                AbstractC16544l.m18093f(bytes2, "this as java.lang.String).getBytes(charset)");
            } else {
                bytes2 = new byte[0];
            }
            byte[] bArrM19286I6 = AbstractC17678l.m19286I(bArrM19286I5, bytes2);
            String str5 = this.body;
            if (str5 != null) {
                bytes3 = str5.getBytes(charset);
                AbstractC16544l.m18093f(bytes3, "this as java.lang.String).getBytes(charset)");
            } else {
                bytes3 = new byte[0];
            }
            return AbstractC17678l.m19286I(bArrM19286I6, bytes3);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Parameters(salt=");
            sb2.append(Arrays.toString(this.salt));
            sb2.append(", apiKey=");
            sb2.append(this.apiKey);
            sb2.append(", nonce=");
            sb2.append(this.nonce);
            sb2.append(", urlPath=");
            sb2.append(this.urlPath);
            sb2.append(", postParamsHashHeader=");
            sb2.append(this.postParamsHashHeader);
            sb2.append(", requestTime=");
            sb2.append(this.requestTime);
            sb2.append(", eTag=");
            sb2.append(this.eTag);
            sb2.append(", body=");
            return AbstractC9306j0.m9892k(sb2, this.body, ')');
        }
    }

    public SigningManager(SignatureVerificationMode signatureVerificationMode, AppConfig appConfig, String apiKey) {
        AbstractC16544l.m18094g(signatureVerificationMode, "signatureVerificationMode");
        AbstractC16544l.m18094g(appConfig, "appConfig");
        AbstractC16544l.m18094g(apiKey, "apiKey");
        this.signatureVerificationMode = signatureVerificationMode;
        this.appConfig = appConfig;
        this.apiKey = apiKey;
    }

    public final String createRandomNonce() {
        byte[] bArr = new byte[12];
        new SecureRandom().nextBytes(bArr);
        byte[] bArrEncode = Base64.encode(bArr, 0);
        AbstractC16544l.m18093f(bArrEncode, "encode(bytes, Base64.DEFAULT)");
        return AbstractC21322p.m21711s0(new String(bArrEncode, C21307a.f67720a)).toString();
    }

    public final String getPostParamsForSigningHeaderIfNeeded(Endpoint endpoint, List<C17309l> postFieldsToSign) {
        AbstractC16544l.m18094g(endpoint, "endpoint");
        List<C17309l> list = postFieldsToSign;
        if (list == null || list.isEmpty() || !shouldVerifyEndpoint(endpoint)) {
            return null;
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        List<C17309l> list2 = postFieldsToSign;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
        int i10 = 0;
        for (Object obj : list2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            C17309l c17309l = (C17309l) obj;
            if (i10 > 0) {
                messageDigest.update((byte) 0);
            }
            byte[] bytes = ((String) c17309l.f55137Z).getBytes(C21307a.f67720a);
            AbstractC16544l.m18093f(bytes, "this as java.lang.String).getBytes(charset)");
            messageDigest.update(bytes);
            arrayList.add(C17296C.f55119a);
            i10 = i11;
        }
        byte[] bArrDigest = messageDigest.digest();
        AbstractC16544l.m18093f(bArrDigest, "sha256Digest.digest()");
        String string = "";
        for (byte b : bArrDigest) {
            StringBuilder sbM9893l = AbstractC9306j0.m9893l(string);
            sbM9893l.append(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
            string = sbM9893l.toString();
        }
        return AbstractC17680n.m19349Y(AbstractC17681o.m19382k(AbstractC17680n.m19349Y(list2, Separators.COMMA, null, null, 0, null, SigningManager$getPostParamsForSigningHeaderIfNeeded$header$1.INSTANCE, 30), POST_PARAMS_ALGORITHM, string), ":", null, null, 0, null, null, 62);
    }

    public final SignatureVerificationMode getSignatureVerificationMode() {
        return this.signatureVerificationMode;
    }

    public final boolean shouldVerifyEndpoint(Endpoint endpoint) {
        AbstractC16544l.m18094g(endpoint, "endpoint");
        return endpoint.getSupportsSignatureVerification() && this.signatureVerificationMode.getShouldVerify();
    }

    public final VerificationResult verifyResponse(String urlPath, String signatureString, String nonce, String body, String requestTime, String eTag, String postFieldsToSignHeader) {
        AbstractC16544l.m18094g(urlPath, "urlPath");
        if (this.appConfig.getForceSigningErrors()) {
            LogUtilsKt.warnLog("Forcing signing error for request with path: ".concat(urlPath));
            return VerificationResult.FAILED;
        }
        IntermediateSignatureHelper intermediateSignatureHelper = this.signatureVerificationMode.getIntermediateSignatureHelper();
        if (intermediateSignatureHelper == null) {
            return VerificationResult.NOT_REQUESTED;
        }
        if (signatureString == null) {
            LogUtilsKt.errorLog$default(String.format(NetworkStrings.VERIFICATION_MISSING_SIGNATURE, Arrays.copyOf(new Object[]{urlPath}, 1)), null, 2, null);
            return VerificationResult.FAILED;
        }
        if (requestTime == null) {
            LogUtilsKt.errorLog$default(String.format(NetworkStrings.VERIFICATION_MISSING_REQUEST_TIME, Arrays.copyOf(new Object[]{urlPath}, 1)), null, 2, null);
            return VerificationResult.FAILED;
        }
        if (body == null && eTag == null) {
            LogUtilsKt.errorLog$default(String.format(NetworkStrings.VERIFICATION_MISSING_BODY_OR_ETAG, Arrays.copyOf(new Object[]{urlPath}, 1)), null, 2, null);
            return VerificationResult.FAILED;
        }
        try {
            Signature signatureFromString$purchases_customEntitlementComputationRelease = Signature.INSTANCE.fromString$purchases_customEntitlementComputationRelease(signatureString);
            Result<SignatureVerifier, PurchasesError> resultCreateIntermediateKeyVerifierIfVerified = intermediateSignatureHelper.createIntermediateKeyVerifierIfVerified(signatureFromString$purchases_customEntitlementComputationRelease);
            if (resultCreateIntermediateKeyVerifierIfVerified instanceof Result.Error) {
                LogUtilsKt.errorLog$default(String.format(bQBnquXS.nRdwoufaYH, Arrays.copyOf(new Object[]{urlPath, ((PurchasesError) ((Result.Error) resultCreateIntermediateKeyVerifierIfVerified).getValue()).getUnderlyingErrorMessage()}, 2)), null, 2, null);
                return VerificationResult.FAILED;
            }
            if (!(resultCreateIntermediateKeyVerifierIfVerified instanceof Result.Success)) {
                throw new C0644w();
            }
            if (((SignatureVerifier) ((Result.Success) resultCreateIntermediateKeyVerifierIfVerified).getValue()).verify(signatureFromString$purchases_customEntitlementComputationRelease.getPayload(), new Parameters(signatureFromString$purchases_customEntitlementComputationRelease.getSalt(), this.apiKey, nonce, urlPath, postFieldsToSignHeader, requestTime, eTag, body).toSignatureToVerify())) {
                LogUtilsKt.verboseLog(String.format(NetworkStrings.VERIFICATION_SUCCESS, Arrays.copyOf(new Object[]{urlPath}, 1)));
                return VerificationResult.VERIFIED;
            }
            LogUtilsKt.errorLog$default(String.format(NetworkStrings.VERIFICATION_ERROR, Arrays.copyOf(new Object[]{urlPath}, 1)), null, 2, null);
            return VerificationResult.FAILED;
        } catch (InvalidSignatureSizeException e10) {
            LogUtilsKt.errorLog$default(String.format(NetworkStrings.VERIFICATION_INVALID_SIZE, Arrays.copyOf(new Object[]{urlPath, e10.getMessage()}, 2)), null, 2, null);
            return VerificationResult.FAILED;
        }
    }
}

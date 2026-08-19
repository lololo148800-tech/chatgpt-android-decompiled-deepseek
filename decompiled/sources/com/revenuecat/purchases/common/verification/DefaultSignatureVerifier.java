package com.revenuecat.purchases.common.verification;

import android.util.Base64;
import java.security.GeneralSecurityException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p658b5.p659zh.MMVKXkcLpuHFDi;
import p784hb.C14436e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m18067d2 = {"Lcom/revenuecat/purchases/common/verification/DefaultSignatureVerifier;", "Lcom/revenuecat/purchases/common/verification/SignatureVerifier;", "", "publicKeyBytes", "<init>", "([B)V", "", "publicKey", "(Ljava/lang/String;)V", "signatureToVerify", "messageToVerify", "", "verify", "([B[B)Z", "Lhb/e;", "verifier", "Lhb/e;", "Companion", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class DefaultSignatureVerifier implements SignatureVerifier {
    private static final String DEFAULT_PUBLIC_KEY = "UC1upXWg5QVmyOSwozp755xLqquBKjjU+di6U8QhMlM=";
    private final C14436e verifier;

    public DefaultSignatureVerifier(byte[] bArr) {
        AbstractC16544l.m18094g(bArr, MMVKXkcLpuHFDi.dqEdpzOXX);
        this.verifier = new C14436e(bArr);
    }

    @Override // com.revenuecat.purchases.common.verification.SignatureVerifier
    public boolean verify(byte[] signatureToVerify, byte[] messageToVerify) {
        AbstractC16544l.m18094g(signatureToVerify, "signatureToVerify");
        AbstractC16544l.m18094g(messageToVerify, "messageToVerify");
        try {
            this.verifier.m15953a(signatureToVerify, messageToVerify);
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DefaultSignatureVerifier(String publicKey) {
        AbstractC16544l.m18094g(publicKey, "publicKey");
        byte[] bArrDecode = Base64.decode(publicKey, 0);
        AbstractC16544l.m18093f(bArrDecode, "decode(publicKey, Base64.DEFAULT)");
        this(bArrDecode);
    }

    public /* synthetic */ DefaultSignatureVerifier(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? DEFAULT_PUBLIC_KEY : str);
    }
}

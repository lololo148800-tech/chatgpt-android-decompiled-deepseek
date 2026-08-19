package com.auth0.android.result;

import com.auth0.android.request.internal.AbstractC11847f;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p240Jb.InterfaceC4325b;
import p523V9.AbstractC7853B4;
import p568X6.C9071a;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0016\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0015\u0010\u000eR.\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@@X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m18067d2 = {"Lcom/auth0/android/result/Credentials;", "", "", "idToken", "accessToken", "type", "refreshToken", "Ljava/util/Date;", "expiresAt", "scope", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "a", "f", "d", "Ljava/util/Date;", "b", "()Ljava/util/Date;", "e", "<set-?>", "recoveryCode", "getRecoveryCode", "h", "(Ljava/lang/String;)V", "auth0_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public class Credentials {

    @InterfaceC4325b("access_token")
    private final String accessToken;

    @InterfaceC4325b("expires_at")
    private final Date expiresAt;

    @InterfaceC4325b("id_token")
    private final String idToken;

    @InterfaceC4325b("recovery_code")
    private String recoveryCode;

    @InterfaceC4325b("refresh_token")
    private final String refreshToken;

    @InterfaceC4325b("scope")
    private final String scope;

    @InterfaceC4325b("token_type")
    private final String type;

    public Credentials(String idToken, String accessToken, String type, String str, Date expiresAt, String str2) {
        AbstractC16544l.m18094g(idToken, "idToken");
        AbstractC16544l.m18094g(accessToken, "accessToken");
        AbstractC16544l.m18094g(type, "type");
        AbstractC16544l.m18094g(expiresAt, "expiresAt");
        this.idToken = idToken;
        this.accessToken = accessToken;
        this.type = type;
        this.refreshToken = str;
        this.expiresAt = expiresAt;
        this.scope = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Date getExpiresAt() {
        return this.expiresAt;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getIdToken() {
        return this.idToken;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: g */
    public final C9071a m13175g() {
        Object objM4371e = AbstractC11847f.f35979a.m4371e(C9071a.class, AbstractC7853B4.m8110b(AbstractC7853B4.m8112d(this.idToken)[1]));
        AbstractC16544l.m18093f(objM4371e, "gson.fromJson(Jwt.decode… UserProfile::class.java)");
        return (C9071a) objM4371e;
    }

    /* JADX INFO: renamed from: h */
    public final void m13176h(String str) {
        this.recoveryCode = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Credentials(idToken='xxxxx', accessToken='xxxxx', type='");
        sb2.append(this.type);
        sb2.append("', refreshToken='xxxxx', expiresAt='");
        sb2.append(this.expiresAt);
        sb2.append("', scope='");
        return AbstractC9306j0.m9891j(this.scope, "')", sb2);
    }
}

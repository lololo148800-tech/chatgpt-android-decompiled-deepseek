package com.statsig.androidsdk;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.InterfaceC17300c;
import p240Jb.InterfaceC4325b;
import p909nm.AbstractC17659D;
import p909nm.C17690x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010.\u001a\u00020\u0003J\r\u0010/\u001a\u00020\u0003H\u0001¢\u0006\u0002\b0J\r\u00101\u001a\u00020\u0000H\u0000¢\u0006\u0002\b2J\r\u00103\u001a\u00020\u0000H\u0000¢\u0006\u0002\b4J\t\u00105\u001a\u000206HÖ\u0001J\r\u00107\u001a\u00020\u0003H\u0000¢\u0006\u0002\b8J\t\u00109\u001a\u00020\u0003HÖ\u0001R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\u0004R,\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R,\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R \u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\u0004R \u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\u0004R \u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\u0004R,\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R,\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r8\u0000@\u0000X\u0081\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011R \u0010$\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0007\"\u0004\b&\u0010\u0004R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0007\"\u0004\b(\u0010\u0004¨\u0006:"}, m18067d2 = {"Lcom/statsig/androidsdk/StatsigUser;", "", "userID", "", "(Ljava/lang/String;)V", "appVersion", "getAppVersion", "()Ljava/lang/String;", "setAppVersion", "country", "getCountry", "setCountry", "custom", "", "getCustom", "()Ljava/util/Map;", "setCustom", "(Ljava/util/Map;)V", "customIDs", "getCustomIDs", "setCustomIDs", "email", "getEmail", "setEmail", "ip", "getIp", "setIp", "locale", "getLocale", "setLocale", "privateAttributes", "getPrivateAttributes", "setPrivateAttributes", "statsigEnvironment", "getStatsigEnvironment$build_release", "setStatsigEnvironment$build_release", "userAgent", "getUserAgent", "setUserAgent", "getUserID", "setUserID", "component1", "copy", "equals", "", "other", "getCacheKey", "getCacheKeyDEPRECATED", "getCacheKeyDEPRECATED$build_release", "getCopyForEvaluation", "getCopyForEvaluation$build_release", "getCopyForLogging", "getCopyForLogging$build_release", "hashCode", "", "toHashString", "toHashString$build_release", "toString", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class StatsigUser {

    @InterfaceC4325b("appVersion")
    private String appVersion;

    @InterfaceC4325b("country")
    private String country;

    @InterfaceC4325b("custom")
    private Map<String, ? extends Object> custom;

    @InterfaceC4325b("customIDs")
    private Map<String, String> customIDs;

    @InterfaceC4325b("email")
    private String email;

    @InterfaceC4325b("ip")
    private String ip;

    @InterfaceC4325b("locale")
    private String locale;

    @InterfaceC4325b("privateAttributes")
    private Map<String, ? extends Object> privateAttributes;

    @InterfaceC4325b("statsigEnvironment")
    private Map<String, String> statsigEnvironment;

    @InterfaceC4325b("userAgent")
    private String userAgent;

    @InterfaceC4325b("userID")
    private String userID;

    /* JADX WARN: Multi-variable type inference failed */
    public StatsigUser() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ StatsigUser copy$default(StatsigUser statsigUser, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = statsigUser.userID;
        }
        return statsigUser.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserID() {
        return this.userID;
    }

    public final StatsigUser copy(String userID) {
        return new StatsigUser(userID);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StatsigUser) && AbstractC16544l.m18089b(this.userID, ((StatsigUser) other).userID);
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getCacheKey() {
        String str = this.userID;
        if (str == null) {
            str = StatsigUserKt.STATSIG_NULL_USER;
        }
        Map map = this.customIDs;
        if (map == null) {
            map = C17690x.f56481Y;
        }
        for (Map.Entry entry : map.entrySet()) {
            str = str + ((String) entry.getKey()) + ':' + ((String) entry.getValue());
        }
        return str;
    }

    @InterfaceC17300c
    public final String getCacheKeyDEPRECATED$build_release() {
        String str = this.userID;
        if (str == null) {
            str = StatsigUserKt.STATSIG_NULL_USER;
        }
        Map<String, String> map = this.customIDs;
        if (map == null) {
            return str;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            str = str + entry.getKey() + ':' + entry.getValue();
        }
        return str;
    }

    public final StatsigUser getCopyForEvaluation$build_release() {
        StatsigUser statsigUser = new StatsigUser(this.userID);
        statsigUser.email = this.email;
        statsigUser.ip = this.ip;
        statsigUser.userAgent = this.userAgent;
        statsigUser.country = this.country;
        statsigUser.locale = this.locale;
        statsigUser.appVersion = this.appVersion;
        Map<String, ? extends Object> map = this.custom;
        statsigUser.custom = map == null ? null : AbstractC17659D.m19254p(map);
        Map<String, String> map2 = this.statsigEnvironment;
        statsigUser.statsigEnvironment = map2 == null ? null : AbstractC17659D.m19254p(map2);
        Map<String, String> map3 = this.customIDs;
        statsigUser.customIDs = map3 == null ? null : AbstractC17659D.m19254p(map3);
        Map<String, ? extends Object> map4 = this.privateAttributes;
        statsigUser.privateAttributes = map4 != null ? AbstractC17659D.m19254p(map4) : null;
        return statsigUser;
    }

    public final StatsigUser getCopyForLogging$build_release() {
        StatsigUser statsigUser = new StatsigUser(this.userID);
        statsigUser.email = this.email;
        statsigUser.ip = this.ip;
        statsigUser.userAgent = this.userAgent;
        statsigUser.country = this.country;
        statsigUser.locale = this.locale;
        statsigUser.appVersion = this.appVersion;
        statsigUser.custom = this.custom;
        statsigUser.statsigEnvironment = this.statsigEnvironment;
        statsigUser.customIDs = this.customIDs;
        statsigUser.privateAttributes = null;
        return statsigUser;
    }

    public final String getCountry() {
        return this.country;
    }

    public final Map<String, Object> getCustom() {
        return this.custom;
    }

    public final Map<String, String> getCustomIDs() {
        return this.customIDs;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getIp() {
        return this.ip;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final Map<String, Object> getPrivateAttributes() {
        return this.privateAttributes;
    }

    public final Map<String, String> getStatsigEnvironment$build_release() {
        return this.statsigEnvironment;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public final String getUserID() {
        return this.userID;
    }

    public int hashCode() {
        String str = this.userID;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setAppVersion(String str) {
        this.appVersion = str;
    }

    public final void setCountry(String str) {
        this.country = str;
    }

    public final void setCustom(Map<String, ? extends Object> map) {
        this.custom = map;
    }

    public final void setCustomIDs(Map<String, String> map) {
        this.customIDs = map;
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public final void setIp(String str) {
        this.ip = str;
    }

    public final void setLocale(String str) {
        this.locale = str;
    }

    public final void setPrivateAttributes(Map<String, ? extends Object> map) {
        this.privateAttributes = map;
    }

    public final void setStatsigEnvironment$build_release(Map<String, String> map) {
        this.statsigEnvironment = map;
    }

    public final void setUserAgent(String str) {
        this.userAgent = str;
    }

    public final void setUserID(String str) {
        this.userID = str;
    }

    public final String toHashString$build_release() {
        Hashing hashing = Hashing.INSTANCE;
        String strM4375i = StatsigUtil.INSTANCE.getGson$build_release().m4375i(this);
        AbstractC16544l.m18093f(strM4375i, "StatsigUtil.getGson().toJson(this)");
        return hashing.getHashedString(strM4375i, HashAlgorithm.DJB2);
    }

    public String toString() {
        return "StatsigUser(userID=" + ((Object) this.userID) + ')';
    }

    public StatsigUser(String str) {
        this.userID = str;
    }

    public /* synthetic */ StatsigUser(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }
}

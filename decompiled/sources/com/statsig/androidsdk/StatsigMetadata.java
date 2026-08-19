package com.statsig.androidsdk;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p003A1.AbstractC0168G;
import p228J.AbstractC3794B0;
import p240Jb.InterfaceC4325b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0080\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0016J\u009e\u0001\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0016J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0016\"\u0004\b.\u0010\u0014R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010,\u001a\u0004\b/\u0010\u0016\"\u0004\b0\u0010\u0014R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010,\u001a\u0004\b1\u0010\u0016\"\u0004\b2\u0010\u0014R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010,\u001a\u0004\b3\u0010\u0016\"\u0004\b4\u0010\u0014R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010,\u001a\u0004\b5\u0010\u0016\"\u0004\b6\u0010\u0014R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010,\u001a\u0004\b7\u0010\u0016\"\u0004\b8\u0010\u0014R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010,\u001a\u0004\b9\u0010\u0016\"\u0004\b:\u0010\u0014R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010,\u001a\u0004\b;\u0010\u0016\"\u0004\b<\u0010\u0014R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010,\u001a\u0004\b=\u0010\u0016\"\u0004\b>\u0010\u0014R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010,\u001a\u0004\b?\u0010\u0016\"\u0004\b@\u0010\u0014R$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010,\u001a\u0004\bA\u0010\u0016\"\u0004\bB\u0010\u0014R$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010,\u001a\u0004\bC\u0010\u0016\"\u0004\bD\u0010\u0014¨\u0006E"}, m18067d2 = {"Lcom/statsig/androidsdk/StatsigMetadata;", "", "", "stableID", "sdkType", "sdkVersion", "sessionID", "appIdentifier", "appVersion", "deviceModel", "deviceOS", "locale", "language", "systemVersion", "systemName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "overrideStableID", "Lmm/C;", "overrideStableID$build_release", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/statsig/androidsdk/StatsigMetadata;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStableID", "setStableID", "getSdkType", "setSdkType", "getSdkVersion", "setSdkVersion", "getSessionID", "setSessionID", "getAppIdentifier", "setAppIdentifier", "getAppVersion", "setAppVersion", "getDeviceModel", "setDeviceModel", "getDeviceOS", "setDeviceOS", "getLocale", "setLocale", "getLanguage", "setLanguage", "getSystemVersion", "setSystemVersion", "getSystemName", "setSystemName", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class StatsigMetadata {

    @InterfaceC4325b("appIdentifier")
    private String appIdentifier;

    @InterfaceC4325b("appVersion")
    private String appVersion;

    @InterfaceC4325b("deviceModel")
    private String deviceModel;

    @InterfaceC4325b("deviceOS")
    private String deviceOS;

    @InterfaceC4325b("language")
    private String language;

    @InterfaceC4325b("locale")
    private String locale;

    @InterfaceC4325b("sdkType")
    private String sdkType;

    @InterfaceC4325b("sdkVersion")
    private String sdkVersion;

    @InterfaceC4325b("sessionID")
    private String sessionID;

    @InterfaceC4325b("stableID")
    private String stableID;

    @InterfaceC4325b("systemName")
    private String systemName;

    @InterfaceC4325b("systemVersion")
    private String systemVersion;

    public StatsigMetadata() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStableID() {
        return this.stableID;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSystemVersion() {
        return this.systemVersion;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSystemName() {
        return this.systemName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSdkType() {
        return this.sdkType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSessionID() {
        return this.sessionID;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAppIdentifier() {
        return this.appIdentifier;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDeviceOS() {
        return this.deviceOS;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    public final StatsigMetadata copy(String stableID, String sdkType, String sdkVersion, String sessionID, String appIdentifier, String appVersion, String deviceModel, String deviceOS, String locale, String language, String systemVersion, String systemName) {
        AbstractC16544l.m18094g(sessionID, "sessionID");
        return new StatsigMetadata(stableID, sdkType, sdkVersion, sessionID, appIdentifier, appVersion, deviceModel, deviceOS, locale, language, systemVersion, systemName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatsigMetadata)) {
            return false;
        }
        StatsigMetadata statsigMetadata = (StatsigMetadata) other;
        return AbstractC16544l.m18089b(this.stableID, statsigMetadata.stableID) && AbstractC16544l.m18089b(this.sdkType, statsigMetadata.sdkType) && AbstractC16544l.m18089b(this.sdkVersion, statsigMetadata.sdkVersion) && AbstractC16544l.m18089b(this.sessionID, statsigMetadata.sessionID) && AbstractC16544l.m18089b(this.appIdentifier, statsigMetadata.appIdentifier) && AbstractC16544l.m18089b(this.appVersion, statsigMetadata.appVersion) && AbstractC16544l.m18089b(this.deviceModel, statsigMetadata.deviceModel) && AbstractC16544l.m18089b(this.deviceOS, statsigMetadata.deviceOS) && AbstractC16544l.m18089b(this.locale, statsigMetadata.locale) && AbstractC16544l.m18089b(this.language, statsigMetadata.language) && AbstractC16544l.m18089b(this.systemVersion, statsigMetadata.systemVersion) && AbstractC16544l.m18089b(this.systemName, statsigMetadata.systemName);
    }

    public final String getAppIdentifier() {
        return this.appIdentifier;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getDeviceOS() {
        return this.deviceOS;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getSdkType() {
        return this.sdkType;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getSessionID() {
        return this.sessionID;
    }

    public final String getStableID() {
        return this.stableID;
    }

    public final String getSystemName() {
        return this.systemName;
    }

    public final String getSystemVersion() {
        return this.systemVersion;
    }

    public int hashCode() {
        String str = this.stableID;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sdkType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sdkVersion;
        int iM527p = AbstractC0168G.m527p((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.sessionID);
        String str4 = this.appIdentifier;
        int iHashCode3 = (iM527p + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.appVersion;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.deviceModel;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.deviceOS;
        int iHashCode6 = (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.locale;
        int iHashCode7 = (iHashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.language;
        int iHashCode8 = (iHashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.systemVersion;
        int iHashCode9 = (iHashCode8 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.systemName;
        return iHashCode9 + (str11 != null ? str11.hashCode() : 0);
    }

    public final void overrideStableID$build_release(String overrideStableID) {
        if (overrideStableID == null || overrideStableID.equals(this.stableID)) {
            return;
        }
        this.stableID = overrideStableID;
    }

    public final void setAppIdentifier(String str) {
        this.appIdentifier = str;
    }

    public final void setAppVersion(String str) {
        this.appVersion = str;
    }

    public final void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    public final void setDeviceOS(String str) {
        this.deviceOS = str;
    }

    public final void setLanguage(String str) {
        this.language = str;
    }

    public final void setLocale(String str) {
        this.locale = str;
    }

    public final void setSdkType(String str) {
        this.sdkType = str;
    }

    public final void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    public final void setSessionID(String str) {
        AbstractC16544l.m18094g(str, "<set-?>");
        this.sessionID = str;
    }

    public final void setStableID(String str) {
        this.stableID = str;
    }

    public final void setSystemName(String str) {
        this.systemName = str;
    }

    public final void setSystemVersion(String str) {
        this.systemVersion = str;
    }

    public String toString() {
        return "StatsigMetadata(stableID=" + ((Object) this.stableID) + ", sdkType=" + ((Object) this.sdkType) + ", sdkVersion=" + ((Object) this.sdkVersion) + ", sessionID=" + this.sessionID + ", appIdentifier=" + ((Object) this.appIdentifier) + ", appVersion=" + ((Object) this.appVersion) + ", deviceModel=" + ((Object) this.deviceModel) + ", deviceOS=" + ((Object) this.deviceOS) + ", locale=" + ((Object) this.locale) + ", language=" + ((Object) this.language) + ", systemVersion=" + ((Object) this.systemVersion) + ", systemName=" + ((Object) this.systemName) + ')';
    }

    public StatsigMetadata(String str, String str2, String str3, String sessionID, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        AbstractC16544l.m18094g(sessionID, "sessionID");
        this.stableID = str;
        this.sdkType = str2;
        this.sdkVersion = str3;
        this.sessionID = sessionID;
        this.appIdentifier = str4;
        this.appVersion = str5;
        this.deviceModel = str6;
        this.deviceOS = str7;
        this.locale = str8;
        this.language = str9;
        this.systemVersion = str10;
        this.systemName = str11;
    }

    public /* synthetic */ StatsigMetadata(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? "android-client" : str2, (i10 & 4) != 0 ? BuildConfig.VERSION_NAME : str3, (i10 & 8) != 0 ? AbstractC3794B0.m4498w("randomUUID().toString()") : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & 256) != 0 ? null : str9, (i10 & 512) != 0 ? null : str10, (i10 & 1024) != 0 ? null : str11, (i10 & 2048) == 0 ? str12 : null);
    }
}

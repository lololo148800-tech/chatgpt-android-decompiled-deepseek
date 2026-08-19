package com.withpersona.sdk2.inquiry.webrtc.networking;

import bj.InterfaceC11468o;
import bj.InterfaceC11472s;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;", "", "", "username", "credential", "serverUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "webrtc_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class AuthorizeWebRtcResponse {

    /* JADX INFO: renamed from: a */
    public final String f41061a;

    /* JADX INFO: renamed from: b */
    public final String f41062b;

    /* JADX INFO: renamed from: c */
    public final String f41063c;

    public AuthorizeWebRtcResponse(String str, String str2, @InterfaceC11468o(name = "server_url") String str3) {
        this.f41061a = str;
        this.f41062b = str2;
        this.f41063c = str3;
    }
}

package com.withpersona.sdk2.inquiry.network;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p200Hm.C3508g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\r¨\u0006\u0015"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/HttpStatusCode;", "", "<init>", "()V", "LHm/g;", "CLIENT_ERRORS", "LHm/g;", "getCLIENT_ERRORS", "()LHm/g;", "SERVER_ERRORS", "getSERVER_ERRORS", "", "NETWORK_ERROR_0", TokenNames.f32012I, "UNAUTHORIZED_401", "NOT_FOUND_404", "CONFLICT_409", "PAYLOAD_TOO_LARGE_413", "UNPROCESSABLE_ENTITY_422", "TOO_MANY_REQUESTS_429", "BAD_GATEWAY_502", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class HttpStatusCode {
    public static final int BAD_GATEWAY_502 = 502;
    public static final int CONFLICT_409 = 409;
    public static final int NETWORK_ERROR_0 = 0;
    public static final int NOT_FOUND_404 = 404;
    public static final int PAYLOAD_TOO_LARGE_413 = 413;
    public static final int TOO_MANY_REQUESTS_429 = 429;
    public static final int UNAUTHORIZED_401 = 401;
    public static final int UNPROCESSABLE_ENTITY_422 = 422;
    public static final HttpStatusCode INSTANCE = new HttpStatusCode();
    private static final C3508g CLIENT_ERRORS = new C3508g(RCHTTPStatusCodes.BAD_REQUEST, 499, 1);
    private static final C3508g SERVER_ERRORS = new C3508g(500, 599, 1);

    private HttpStatusCode() {
    }

    public final C3508g getCLIENT_ERRORS() {
        return CLIENT_ERRORS;
    }

    public final C3508g getSERVER_ERRORS() {
        return SERVER_ERRORS;
    }
}

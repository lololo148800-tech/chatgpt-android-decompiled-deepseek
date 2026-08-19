package com.withpersona.sdk2.inquiry.p689ui.network;

import bj.InterfaceC11472s;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/UiTransitionErrorResponse;", "", "Error", "ui_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class UiTransitionErrorResponse {

    /* JADX INFO: renamed from: b */
    public static final UiTransitionErrorResponse f41049b = new UiTransitionErrorResponse(C17689w.f56480Y);

    /* JADX INFO: renamed from: a */
    public final List f41050a;

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/UiTransitionErrorResponse$Error;", "", "ui_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Error {

        /* JADX INFO: renamed from: a */
        public final String f41051a;

        /* JADX INFO: renamed from: b */
        public final Map f41052b;

        public Error(String str, Map map) {
            this.f41051a = str;
            this.f41052b = map;
        }
    }

    public UiTransitionErrorResponse(List list) {
        this.f41050a = list;
    }
}

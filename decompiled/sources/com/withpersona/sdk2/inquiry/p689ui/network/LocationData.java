package com.withpersona.sdk2.inquiry.p689ui.network;

import bj.InterfaceC11472s;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;", "", "ui_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class LocationData {

    /* JADX INFO: renamed from: a */
    public final String f41016a;

    /* JADX INFO: renamed from: b */
    public final String f41017b;

    /* JADX INFO: renamed from: c */
    public final String f41018c;

    /* JADX INFO: renamed from: d */
    public final String f41019d;

    /* JADX INFO: renamed from: e */
    public final String f41020e;

    /* JADX INFO: renamed from: f */
    public final String f41021f;

    /* JADX INFO: renamed from: g */
    public final String f41022g;

    /* JADX INFO: renamed from: h */
    public final String f41023h;

    public LocationData(String id2, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC16544l.m18094g(id2, "id");
        this.f41016a = id2;
        this.f41017b = str;
        this.f41018c = str2;
        this.f41019d = str3;
        this.f41020e = str4;
        this.f41021f = str5;
        this.f41022g = str6;
        this.f41023h = str7;
    }

    public /* synthetic */ LocationData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) == 0 ? str8 : null);
    }
}

package com.withpersona.sdk2.inquiry.network;

import android.gov.nist.javax.sip.parser.TokenNames;
import bj.AbstractC11471r;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/JsonAdapterBinding;", TokenNames.f32019T, "", "Ljava/lang/Class;", "clazz", "Lbj/r;", "jsonAdapter", "<init>", "(Ljava/lang/Class;Lbj/r;)V", "Ljava/lang/Class;", "getClazz", "()Ljava/lang/Class;", "Lbj/r;", "getJsonAdapter", "()Lbj/r;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class JsonAdapterBinding<T> {
    private final Class<T> clazz;
    private final AbstractC11471r jsonAdapter;

    public JsonAdapterBinding(Class<T> cls, AbstractC11471r abstractC11471r) {
        this.clazz = cls;
        this.jsonAdapter = abstractC11471r;
    }

    public final Class<T> getClazz() {
        return this.clazz;
    }

    public final AbstractC11471r getJsonAdapter() {
        return this.jsonAdapter;
    }
}

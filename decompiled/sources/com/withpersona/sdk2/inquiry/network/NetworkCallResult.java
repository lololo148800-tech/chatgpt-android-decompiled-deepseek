package com.withpersona.sdk2.inquiry.network;

import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/NetworkCallResult;", TokenNames.f32019T, "", "()V", "Failure", "Success", "Lcom/withpersona/sdk2/inquiry/network/NetworkCallResult$Failure;", "Lcom/withpersona/sdk2/inquiry/network/NetworkCallResult$Success;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public abstract class NetworkCallResult<T> {

    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/NetworkCallResult$Failure;", TokenNames.f32019T, "Lcom/withpersona/sdk2/inquiry/network/NetworkCallResult;", "networkErrorInfo", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$NetworkErrorInfo;", "(Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$NetworkErrorInfo;)V", "getNetworkErrorInfo", "()Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$NetworkErrorInfo;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Failure<T> extends NetworkCallResult<T> {
        private final InternalErrorInfo.NetworkErrorInfo networkErrorInfo;

        public Failure(InternalErrorInfo.NetworkErrorInfo networkErrorInfo) {
            super(null);
            this.networkErrorInfo = networkErrorInfo;
        }

        public final InternalErrorInfo.NetworkErrorInfo getNetworkErrorInfo() {
            return this.networkErrorInfo;
        }
    }

    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010\u0004R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/NetworkCallResult$Success;", TokenNames.f32019T, "Lcom/withpersona/sdk2/inquiry/network/NetworkCallResult;", "response", "(Ljava/lang/Object;)V", "getResponse", "()Ljava/lang/Object;", "Ljava/lang/Object;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Success<T> extends NetworkCallResult<T> {
        private final T response;

        public Success(T t10) {
            super(null);
            this.response = t10;
        }

        public final T getResponse() {
            return this.response;
        }
    }

    public /* synthetic */ NetworkCallResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private NetworkCallResult() {
    }
}

package com.revenuecat.purchases.common;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.util.Log;
import com.revenuecat.purchases.LogHandler;
import io.sentry.android.core.AbstractC15256t;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p628Zk.GwZB.tpXhEMGxfXFVSh;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\tJ)\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m18067d2 = {"Lcom/revenuecat/purchases/common/DefaultLogHandler;", "Lcom/revenuecat/purchases/LogHandler;", "<init>", "()V", "", ParameterNames.TAG, "msg", "Lmm/C;", "v", "(Ljava/lang/String;Ljava/lang/String;)V", "d", "i", "w", "", "throwable", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class DefaultLogHandler implements LogHandler {
    @Override // com.revenuecat.purchases.LogHandler
    /* JADX INFO: renamed from: d */
    public void mo13045d(String tag, String msg) {
        AbstractC16544l.m18094g(tag, "tag");
        AbstractC16544l.m18094g(msg, "msg");
        Log.d(tag, msg);
    }

    @Override // com.revenuecat.purchases.LogHandler
    /* JADX INFO: renamed from: e */
    public void mo13046e(String tag, String msg, Throwable throwable) {
        AbstractC16544l.m18094g(tag, "tag");
        AbstractC16544l.m18094g(msg, "msg");
        if (throwable != null) {
            AbstractC15256t.m16466d(tag, msg, throwable);
        } else {
            AbstractC15256t.m16465c(tag, msg);
        }
    }

    @Override // com.revenuecat.purchases.LogHandler
    /* JADX INFO: renamed from: i */
    public void mo13047i(String tag, String msg) {
        AbstractC16544l.m18094g(tag, "tag");
        AbstractC16544l.m18094g(msg, "msg");
        Log.i(tag, msg);
    }

    @Override // com.revenuecat.purchases.LogHandler
    /* JADX INFO: renamed from: v */
    public void mo13048v(String tag, String msg) {
        AbstractC16544l.m18094g(tag, "tag");
        AbstractC16544l.m18094g(msg, "msg");
        Log.v(tag, msg);
    }

    @Override // com.revenuecat.purchases.LogHandler
    /* JADX INFO: renamed from: w */
    public void mo13049w(String tag, String msg) {
        AbstractC16544l.m18094g(tag, "tag");
        AbstractC16544l.m18094g(msg, tpXhEMGxfXFVSh.BdD);
        AbstractC15256t.m16482t(tag, msg);
    }
}

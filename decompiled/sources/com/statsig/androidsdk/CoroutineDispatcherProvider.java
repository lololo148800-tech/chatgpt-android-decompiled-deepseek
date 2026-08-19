package com.statsig.androidsdk;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p025An.AbstractC0563B;
import p025An.AbstractC0593T;
import p153Fn.AbstractC2935m;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\t¨\u0006\u001c"}, m18067d2 = {"Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "", "LAn/B;", "main", "default", "io", "<init>", "(LAn/B;LAn/B;LAn/B;)V", "component1", "()LAn/B;", "component2", "component3", "copy", "(LAn/B;LAn/B;LAn/B;)Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LAn/B;", "getMain", "getDefault", "getIo", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class CoroutineDispatcherProvider {
    private final AbstractC0563B default;
    private final AbstractC0563B io;
    private final AbstractC0563B main;

    public CoroutineDispatcherProvider() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ CoroutineDispatcherProvider copy$default(CoroutineDispatcherProvider coroutineDispatcherProvider, AbstractC0563B abstractC0563B, AbstractC0563B abstractC0563B2, AbstractC0563B abstractC0563B3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC0563B = coroutineDispatcherProvider.main;
        }
        if ((i10 & 2) != 0) {
            abstractC0563B2 = coroutineDispatcherProvider.default;
        }
        if ((i10 & 4) != 0) {
            abstractC0563B3 = coroutineDispatcherProvider.io;
        }
        return coroutineDispatcherProvider.copy(abstractC0563B, abstractC0563B2, abstractC0563B3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AbstractC0563B getMain() {
        return this.main;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AbstractC0563B getDefault() {
        return this.default;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AbstractC0563B getIo() {
        return this.io;
    }

    public final CoroutineDispatcherProvider copy(AbstractC0563B main, AbstractC0563B abstractC0563B, AbstractC0563B io2) {
        AbstractC16544l.m18094g(main, "main");
        AbstractC16544l.m18094g(abstractC0563B, "default");
        AbstractC16544l.m18094g(io2, "io");
        return new CoroutineDispatcherProvider(main, abstractC0563B, io2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoroutineDispatcherProvider)) {
            return false;
        }
        CoroutineDispatcherProvider coroutineDispatcherProvider = (CoroutineDispatcherProvider) other;
        return AbstractC16544l.m18089b(this.main, coroutineDispatcherProvider.main) && AbstractC16544l.m18089b(this.default, coroutineDispatcherProvider.default) && AbstractC16544l.m18089b(this.io, coroutineDispatcherProvider.io);
    }

    public final AbstractC0563B getDefault() {
        return this.default;
    }

    public final AbstractC0563B getIo() {
        return this.io;
    }

    public final AbstractC0563B getMain() {
        return this.main;
    }

    public int hashCode() {
        return this.io.hashCode() + ((this.default.hashCode() + (this.main.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "CoroutineDispatcherProvider(main=" + this.main + ", default=" + this.default + ", io=" + this.io + ')';
    }

    public CoroutineDispatcherProvider(AbstractC0563B main, AbstractC0563B abstractC0563B, AbstractC0563B io2) {
        AbstractC16544l.m18094g(main, "main");
        AbstractC16544l.m18094g(abstractC0563B, "default");
        AbstractC16544l.m18094g(io2, "io");
        this.main = main;
        this.default = abstractC0563B;
        this.io = io2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CoroutineDispatcherProvider(AbstractC0563B abstractC0563B, AbstractC0563B abstractC0563B2, AbstractC0563B abstractC0563B3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            C3516e c3516e = AbstractC0593T.f1824a;
            abstractC0563B = AbstractC2935m.f8797a;
        }
        abstractC0563B2 = (i10 & 2) != 0 ? AbstractC0593T.f1824a : abstractC0563B2;
        if ((i10 & 4) != 0) {
            C3516e c3516e2 = AbstractC0593T.f1824a;
            abstractC0563B3 = ExecutorC3515d.f10633Z;
        }
        this(abstractC0563B, abstractC0563B2, abstractC0563B3);
    }
}

package com.apollographql.apollo3.cache.normalized.sql;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p282L4.InterfaceC4934b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18067d2 = {"Lcom/apollographql/apollo3/cache/normalized/sql/ApolloInitializer;", "LL4/b;", "Lmm/C;", "<init>", "()V", "apollo-normalized-cache-sqlite_release"}, m18068k = 1, m18069mv = {2, 0, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ApolloInitializer implements InterfaceC4934b {

    /* JADX INFO: renamed from: a */
    public static Context f35956a;

    @Override // p282L4.InterfaceC4934b
    /* JADX INFO: renamed from: a */
    public final List mo5546a() {
        return new ArrayList();
    }

    @Override // p282L4.InterfaceC4934b
    /* JADX INFO: renamed from: b */
    public final Object mo5547b(Context context) {
        AbstractC16544l.m18094g(context, "context");
        f35956a = context;
        return C17296C.f55119a;
    }
}

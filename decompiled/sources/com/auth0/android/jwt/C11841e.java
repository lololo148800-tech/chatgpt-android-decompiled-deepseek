package com.auth0.android.jwt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: com.auth0.android.jwt.e */
/* JADX INFO: loaded from: classes.dex */
public final class C11841e {

    /* JADX INFO: renamed from: a */
    public final List f35961a;

    /* JADX INFO: renamed from: b */
    public final Map f35962b;

    public C11841e(List list, HashMap map) {
        this.f35961a = list;
        this.f35962b = DesugarCollections.unmodifiableMap(map);
    }
}

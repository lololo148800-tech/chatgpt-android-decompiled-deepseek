package io.sentry;

import io.sentry.protocol.C15426F;

/* JADX INFO: renamed from: io.sentry.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C15180a {

    /* JADX INFO: renamed from: a */
    public final byte[] f47254a;

    /* JADX INFO: renamed from: b */
    public final C15426F f47255b;

    /* JADX INFO: renamed from: c */
    public final String f47256c;

    /* JADX INFO: renamed from: d */
    public final String f47257d;

    /* JADX INFO: renamed from: e */
    public final String f47258e;

    public C15180a(String str, String str2, byte[] bArr) {
        this.f47254a = bArr;
        this.f47255b = null;
        this.f47256c = str;
        this.f47257d = str2;
        this.f47258e = "event.attachment";
    }

    public C15180a(C15426F c15426f) {
        this.f47254a = null;
        this.f47255b = c15426f;
        this.f47256c = "view-hierarchy.json";
        this.f47257d = "application/json";
        this.f47258e = "event.view_hierarchy";
    }
}

package com.auth0.android.request.internal;

import p001A.C0093v0;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: com.auth0.android.request.internal.a */
/* JADX INFO: loaded from: classes.dex */
public final class C11842a extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C0093v0 f35966Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f35967Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0093v0 f35968o0;

    /* JADX INFO: renamed from: p0 */
    public int f35969p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11842a(C0093v0 c0093v0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f35968o0 = c0093v0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f35967Z = obj;
        this.f35969p0 |= Integer.MIN_VALUE;
        return C0093v0.m331e(this.f35968o0, this);
    }
}

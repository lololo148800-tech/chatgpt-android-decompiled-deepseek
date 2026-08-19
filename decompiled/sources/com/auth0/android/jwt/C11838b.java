package com.auth0.android.jwt;

import com.google.gson.reflect.TypeToken;
import java.util.Map;
import p214Ib.AbstractC3673p;
import p214Ib.C3669l;
import p214Ib.C3675r;
import p214Ib.C3679v;
import p265Kb.AbstractC4611d;

/* JADX INFO: renamed from: com.auth0.android.jwt.b */
/* JADX INFO: loaded from: classes.dex */
public final class C11838b extends C11837a {

    /* JADX INFO: renamed from: a */
    public final AbstractC3673p f35957a;

    public C11838b(AbstractC3673p abstractC3673p) {
        this.f35957a = abstractC3673p;
    }

    @Override // com.auth0.android.jwt.C11837a
    /* JADX INFO: renamed from: a */
    public final Object mo13151a() {
        AbstractC3673p abstractC3673p = this.f35957a;
        try {
            abstractC3673p.getClass();
            if (abstractC3673p instanceof C3675r) {
                return null;
            }
            return AbstractC4611d.m5353l(Map.class).cast(new C3669l().m4368b(abstractC3673p, TypeToken.get(Map.class)));
        } catch (C3679v e10) {
            throw new C11839c("Failed to decode claim as ".concat("Map"), e10);
        }
    }
}

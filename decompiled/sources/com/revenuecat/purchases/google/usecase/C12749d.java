package com.revenuecat.purchases.google.usecase;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import p826j6.C16155i;

/* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12749d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicBoolean f40439a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ QueryPurchaseHistoryUseCase f40440b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Date f40441c;

    public /* synthetic */ C12749d(AtomicBoolean atomicBoolean, QueryPurchaseHistoryUseCase queryPurchaseHistoryUseCase, Date date) {
        this.f40439a = atomicBoolean;
        this.f40440b = queryPurchaseHistoryUseCase;
        this.f40441c = date;
    }

    /* JADX INFO: renamed from: a */
    public final void m14491a(C16155i c16155i, ArrayList arrayList) {
        QueryPurchaseHistoryUseCase.C127431.invoke$lambda$1$lambda$0(this.f40439a, this.f40440b, this.f40441c, c16155i, arrayList);
    }
}

package com.google.android.gms.internal.play_billing;

import p011A9.p012Ra.ahZQMZ;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.C */
/* JADX INFO: loaded from: classes.dex */
public final class C11860C {

    /* JADX INFO: renamed from: a */
    public final Object f36110a;

    /* JADX INFO: renamed from: b */
    public final Object f36111b;

    /* JADX INFO: renamed from: c */
    public final Object f36112c;

    public C11860C(Object obj, Object obj2, Object obj3) {
        this.f36110a = obj;
        this.f36111b = obj2;
        this.f36112c = obj3;
    }

    /* JADX INFO: renamed from: a */
    public final IllegalArgumentException m13258a() {
        Object obj = this.f36110a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f36111b);
        String strValueOf3 = String.valueOf(obj);
        String strValueOf4 = String.valueOf(this.f36112c);
        String str = ahZQMZ.kSUIOW;
        StringBuilder sbM9896o = AbstractC9306j0.m9896o("Multiple entries with same key: ", strValueOf, str, strValueOf2, " and ");
        sbM9896o.append(strValueOf3);
        sbM9896o.append(str);
        sbM9896o.append(strValueOf4);
        return new IllegalArgumentException(sbM9896o.toString());
    }
}

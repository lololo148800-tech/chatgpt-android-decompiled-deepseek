package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.M */
/* JADX INFO: loaded from: classes.dex */
public final class C11890M extends AbstractC11893N implements Serializable {

    /* JADX INFO: renamed from: Y */
    public static final C11890M f36160Y = new C11890M();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}

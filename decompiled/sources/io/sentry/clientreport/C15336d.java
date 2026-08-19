package io.sentry.clientreport;

import java.util.Arrays;
import p544W9.AbstractC8483G3;

/* JADX INFO: renamed from: io.sentry.clientreport.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C15336d {

    /* JADX INFO: renamed from: a */
    public final String f47890a;

    /* JADX INFO: renamed from: b */
    public final String f47891b;

    public C15336d(String str, String str2) {
        this.f47890a = str;
        this.f47891b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15336d)) {
            return false;
        }
        C15336d c15336d = (C15336d) obj;
        return AbstractC8483G3.m9132b(this.f47890a, c15336d.f47890a) && AbstractC8483G3.m9132b(this.f47891b, c15336d.f47891b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47890a, this.f47891b});
    }
}

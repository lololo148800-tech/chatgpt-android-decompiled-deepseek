package io.sentry.internal.gestures;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p544W9.AbstractC8483G3;

/* JADX INFO: renamed from: io.sentry.internal.gestures.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C15387c {

    /* JADX INFO: renamed from: a */
    public final WeakReference f47969a;

    /* JADX INFO: renamed from: b */
    public final String f47970b;

    /* JADX INFO: renamed from: c */
    public final String f47971c;

    /* JADX INFO: renamed from: d */
    public final String f47972d;

    /* JADX INFO: renamed from: e */
    public final String f47973e;

    public C15387c(View view, String str, String str2, String str3, String str4) {
        this.f47969a = new WeakReference(view);
        this.f47970b = str;
        this.f47971c = str2;
        this.f47972d = str3;
        this.f47973e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15387c.class != obj.getClass()) {
            return false;
        }
        C15387c c15387c = (C15387c) obj;
        return AbstractC8483G3.m9132b(this.f47970b, c15387c.f47970b) && AbstractC8483G3.m9132b(this.f47971c, c15387c.f47971c) && AbstractC8483G3.m9132b(this.f47972d, c15387c.f47972d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47969a, this.f47971c, this.f47972d});
    }
}

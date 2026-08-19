package p182H3;

import android.text.TextUtils;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: H3.w */
/* JADX INFO: loaded from: classes.dex */
public final class C3222w {

    /* JADX INFO: renamed from: a */
    public final String f9788a;

    /* JADX INFO: renamed from: b */
    public final boolean f9789b;

    /* JADX INFO: renamed from: c */
    public final boolean f9790c;

    public C3222w(String str, boolean z6, boolean z10) {
        this.f9788a = str;
        this.f9789b = z6;
        this.f9790c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != C3222w.class) {
            return false;
        }
        C3222w c3222w = (C3222w) obj;
        return TextUtils.equals(this.f9788a, c3222w.f9788a) && this.f9789b == c3222w.f9789b && this.f9790c == c3222w.f9790c;
    }

    public final int hashCode() {
        return ((AbstractC0168G.m527p(31, 31, this.f9788a) + (this.f9789b ? 1231 : 1237)) * 31) + (this.f9790c ? 1231 : 1237);
    }
}

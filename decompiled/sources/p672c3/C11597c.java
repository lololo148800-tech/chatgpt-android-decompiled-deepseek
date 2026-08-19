package p672c3;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: c3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C11597c {

    /* JADX INFO: renamed from: a */
    public final int f35088a;

    public C11597c(int i10) {
        this.f35088a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11597c) && this.f35088a == ((C11597c) obj).f35088a;
    }

    public final int hashCode() {
        return this.f35088a;
    }

    public final String toString() {
        return AbstractC12107L1.m13826q(new StringBuilder("AppWidgetId(appWidgetId="), this.f35088a, ')');
    }
}

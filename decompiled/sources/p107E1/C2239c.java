package p107E1;

import android.content.res.Resources;
import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: E1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2239c {

    /* JADX INFO: renamed from: a */
    public final Resources.Theme f6859a;

    /* JADX INFO: renamed from: b */
    public final int f6860b;

    public C2239c(Resources.Theme theme, int i10) {
        this.f6859a = theme;
        this.f6860b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2239c)) {
            return false;
        }
        C2239c c2239c = (C2239c) obj;
        return AbstractC16544l.m18089b(this.f6859a, c2239c.f6859a) && this.f6860b == c2239c.f6860b;
    }

    public final int hashCode() {
        return (this.f6859a.hashCode() * 31) + this.f6860b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Key(theme=");
        sb2.append(this.f6859a);
        sb2.append(", id=");
        return AbstractC12107L1.m13826q(sb2, this.f6860b, ')');
    }
}

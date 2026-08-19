package p204I1;

import p492U1.C7548m;
import p544W9.AbstractC8652j;
import p571X9.AbstractC9119D4;

/* JADX INFO: renamed from: I1.v */
/* JADX INFO: loaded from: classes.dex */
public final class C3606v {

    /* JADX INFO: renamed from: a */
    public final long f10989a;

    /* JADX INFO: renamed from: b */
    public final long f10990b;

    /* JADX INFO: renamed from: c */
    public final int f10991c;

    public C3606v(long j10, int i10, long j11) {
        this.f10989a = j10;
        this.f10990b = j11;
        this.f10991c = i10;
        if (AbstractC9119D4.m9651d(j10)) {
            throw new IllegalArgumentException("width cannot be TextUnit.Unspecified");
        }
        if (AbstractC9119D4.m9651d(j11)) {
            throw new IllegalArgumentException("height cannot be TextUnit.Unspecified");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3606v)) {
            return false;
        }
        C3606v c3606v = (C3606v) obj;
        return C7548m.m7893a(this.f10989a, c3606v.f10989a) && C7548m.m7893a(this.f10990b, c3606v.f10990b) && AbstractC8652j.m9331d(this.f10991c, c3606v.f10991c);
    }

    public final int hashCode() {
        return ((C7548m.m7896d(this.f10990b) + (C7548m.m7896d(this.f10989a) * 31)) * 31) + this.f10991c;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Placeholder(width=");
        sb2.append((Object) C7548m.m7897e(this.f10989a));
        sb2.append(", height=");
        sb2.append((Object) C7548m.m7897e(this.f10990b));
        sb2.append(", placeholderVerticalAlign=");
        int i10 = this.f10991c;
        if (AbstractC8652j.m9331d(i10, 1)) {
            str = "AboveBaseline";
        } else if (AbstractC8652j.m9331d(i10, 2)) {
            str = "Top";
        } else if (AbstractC8652j.m9331d(i10, 3)) {
            str = "Bottom";
        } else if (AbstractC8652j.m9331d(i10, 4)) {
            str = "Center";
        } else if (AbstractC8652j.m9331d(i10, 5)) {
            str = "TextTop";
        } else if (AbstractC8652j.m9331d(i10, 6)) {
            str = "TextBottom";
        } else {
            str = AbstractC8652j.m9331d(i10, 7) ? "TextCenter" : "Invalid";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}

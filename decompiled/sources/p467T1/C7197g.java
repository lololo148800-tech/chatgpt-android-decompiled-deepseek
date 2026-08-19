package p467T1;

/* JADX INFO: renamed from: T1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C7197g {

    /* JADX INFO: renamed from: c */
    public static final C7197g f22856c = new C7197g(17, AbstractC7196f.f22854b);

    /* JADX INFO: renamed from: a */
    public final float f22857a;

    /* JADX INFO: renamed from: b */
    public final int f22858b;

    public C7197g(int i10, float f10) {
        this.f22857a = f10;
        this.f22858b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7197g)) {
            return false;
        }
        C7197g c7197g = (C7197g) obj;
        float f10 = c7197g.f22857a;
        float f11 = AbstractC7196f.f22853a;
        return Float.compare(this.f22857a, f10) == 0 && this.f22858b == c7197g.f22858b;
    }

    public final int hashCode() {
        float f10 = AbstractC7196f.f22853a;
        return (Float.floatToIntBits(this.f22857a) * 31) + this.f22858b;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("LineHeightStyle(alignment=");
        float f10 = this.f22857a;
        if (f10 == 0.0f) {
            float f11 = AbstractC7196f.f22853a;
            str = "LineHeightStyle.Alignment.Top";
        } else if (f10 == AbstractC7196f.f22853a) {
            str = "LineHeightStyle.Alignment.Center";
        } else if (f10 == AbstractC7196f.f22854b) {
            str = "LineHeightStyle.Alignment.Proportional";
        } else if (f10 == AbstractC7196f.f22855c) {
            str = "LineHeightStyle.Alignment.Bottom";
        } else {
            str = "LineHeightStyle.Alignment(topPercentage = " + f10 + ')';
        }
        sb2.append((Object) str);
        sb2.append(", trim=");
        int i10 = this.f22858b;
        if (i10 == 1) {
            str2 = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i10 == 16) {
            str2 = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i10 == 17) {
            str2 = "LineHeightStyle.Trim.Both";
        } else {
            str2 = i10 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }
        sb2.append((Object) str2);
        sb2.append(')');
        return sb2.toString();
    }
}

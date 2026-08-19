package p758g0;

/* JADX INFO: renamed from: g0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C13768j {

    /* JADX INFO: renamed from: a */
    public final C13774m f43474a;

    /* JADX INFO: renamed from: b */
    public final int f43475b;

    public C13768j(int i10, C13774m c13774m) {
        this.f43474a = c13774m;
        this.f43475b = i10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("AnimationResult(endReason=");
        int i10 = this.f43475b;
        if (i10 != 1) {
            str = i10 != 2 ? "null" : "Finished";
        } else {
            str = "BoundReached";
        }
        sb2.append(str);
        sb2.append(", endState=");
        sb2.append(this.f43474a);
        sb2.append(')');
        return sb2.toString();
    }
}

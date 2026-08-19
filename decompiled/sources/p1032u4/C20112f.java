package p1032u4;

/* JADX INFO: renamed from: u4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C20112f implements Comparable {

    /* JADX INFO: renamed from: Y */
    public final int f63721Y;

    /* JADX INFO: renamed from: Z */
    public final C20108b f63722Z;

    public C20112f(int i10, C20108b c20108b) {
        this.f63721Y = i10;
        this.f63722Z = c20108b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f63721Y, ((C20112f) obj).f63721Y);
    }
}

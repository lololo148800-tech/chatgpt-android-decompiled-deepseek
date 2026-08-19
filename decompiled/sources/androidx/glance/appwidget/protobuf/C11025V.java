package androidx.glance.appwidget.protobuf;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.V */
/* JADX INFO: loaded from: classes.dex */
public final class C11025V {

    /* JADX INFO: renamed from: a */
    public final AbstractC11059u f33272a;

    /* JADX INFO: renamed from: b */
    public final String f33273b;

    /* JADX INFO: renamed from: c */
    public final Object[] f33274c;

    /* JADX INFO: renamed from: d */
    public final int f33275d;

    public C11025V(AbstractC11059u abstractC11059u, String str, Object[] objArr) {
        this.f33272a = abstractC11059u;
        this.f33273b = str;
        this.f33274c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f33275d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f33275d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC11030a m11922a() {
        return this.f33272a;
    }

    /* JADX INFO: renamed from: b */
    public final Object[] m11923b() {
        return this.f33274c;
    }

    /* JADX INFO: renamed from: c */
    public final String m11924c() {
        return this.f33273b;
    }

    /* JADX INFO: renamed from: d */
    public final int m11925d() {
        int i10 = this.f33275d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }
}

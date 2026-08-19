package p895n1;

import java.util.ArrayList;
import p523V9.AbstractC8111i5;
import p774h1.C14341T;
import p774h1.C14365u;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: n1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C17424d {

    /* JADX INFO: renamed from: a */
    public final String f55681a;

    /* JADX INFO: renamed from: b */
    public final float f55682b;

    /* JADX INFO: renamed from: c */
    public final float f55683c;

    /* JADX INFO: renamed from: d */
    public final float f55684d;

    /* JADX INFO: renamed from: e */
    public final float f55685e;

    /* JADX INFO: renamed from: f */
    public final long f55686f;

    /* JADX INFO: renamed from: g */
    public final int f55687g;

    /* JADX INFO: renamed from: h */
    public final boolean f55688h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f55689i;

    /* JADX INFO: renamed from: j */
    public final C17423c f55690j;

    /* JADX INFO: renamed from: k */
    public boolean f55691k;

    public C17424d(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z6, int i11) {
        String str2 = (i11 & 1) != 0 ? "" : str;
        long j11 = (i11 & 32) != 0 ? C14365u.f45060j : j10;
        int i12 = (i11 & 64) != 0 ? 5 : i10;
        boolean z10 = (i11 & 128) != 0 ? false : z6;
        this.f55681a = str2;
        this.f55682b = f10;
        this.f55683c = f11;
        this.f55684d = f12;
        this.f55685e = f13;
        this.f55686f = j11;
        this.f55687g = i12;
        this.f55688h = z10;
        ArrayList arrayList = new ArrayList();
        this.f55689i = arrayList;
        C17423c c17423c = new C17423c(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.f55690j = c17423c;
        arrayList.add(c17423c);
    }

    /* JADX INFO: renamed from: a */
    public static void m19121a(C17424d c17424d, ArrayList arrayList, int i10, C14341T c14341t, C14341T c14341t2, float f10, int i11, int i12, float f11) {
        if (c17424d.f55691k) {
            AbstractC8111i5.m8592c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            throw null;
        }
        ((C17423c) AbstractC17792x.m19532o(1, c17424d.f55689i)).f55680j.add(new C17420H("", arrayList, i10, c14341t, 1.0f, c14341t2, 1.0f, f10, i11, i12, f11, 0.0f, 1.0f, 0.0f));
    }

    /* JADX INFO: renamed from: b */
    public final C17425e m19122b() {
        if (this.f55691k) {
            AbstractC8111i5.m8592c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            throw null;
        }
        while (true) {
            ArrayList arrayList = this.f55689i;
            if (arrayList.size() <= 1) {
                C17423c c17423c = this.f55690j;
                C17425e c17425e = new C17425e(this.f55681a, this.f55682b, this.f55683c, this.f55684d, this.f55685e, new C17417E(c17423c.f55671a, c17423c.f55672b, c17423c.f55673c, c17423c.f55674d, c17423c.f55675e, c17423c.f55676f, c17423c.f55677g, c17423c.f55678h, c17423c.f55679i, c17423c.f55680j), this.f55686f, this.f55687g, this.f55688h);
                this.f55691k = true;
                return c17425e;
            }
            if (this.f55691k) {
                AbstractC8111i5.m8592c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                throw null;
            }
            C17423c c17423c2 = (C17423c) arrayList.remove(arrayList.size() - 1);
            ((C17423c) AbstractC17792x.m19532o(1, arrayList)).f55680j.add(new C17417E(c17423c2.f55671a, c17423c2.f55672b, c17423c2.f55673c, c17423c2.f55674d, c17423c2.f55675e, c17423c2.f55676f, c17423c2.f55677g, c17423c2.f55678h, c17423c2.f55679i, c17423c2.f55680j));
        }
    }
}

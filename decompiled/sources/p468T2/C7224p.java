package p468T2;

import ac.C10539a;
import android.media.Image;
import java.nio.ByteBuffer;
import mm.C17314q;
import p493U2.C7551a;
import p571X9.AbstractC9227W;
import p949pj.C18441N;

/* JADX INFO: renamed from: T2.p */
/* JADX INFO: loaded from: classes.dex */
public final class C7224p {

    /* JADX INFO: renamed from: a */
    public int f22911a;

    /* JADX INFO: renamed from: b */
    public int f22912b;

    /* JADX INFO: renamed from: c */
    public int f22913c;

    /* JADX INFO: renamed from: d */
    public final Object f22914d;

    /* JADX INFO: renamed from: e */
    public Object f22915e;

    /* JADX INFO: renamed from: f */
    public Object f22916f;

    public C7224p(Image image, int i10) {
        this.f22914d = image;
        this.f22915e = AbstractC9227W.m9800c(new C18441N(image, i10, 1));
        this.f22916f = AbstractC9227W.m9800c(new C18441N(image, i10, 0));
        this.f22911a = image.getWidth();
        this.f22912b = image.getHeight();
        this.f22913c = i10;
    }

    /* JADX INFO: renamed from: a */
    public C10539a m7619a() {
        return (C10539a) ((C17314q) this.f22915e).getValue();
    }

    /* JADX INFO: renamed from: b */
    public void m7620b() {
        this.f22911a = 1;
        this.f22915e = (C7227s) this.f22914d;
        this.f22913c = 0;
    }

    /* JADX INFO: renamed from: c */
    public boolean m7621c() {
        C7551a c7551aM7633c = ((C7227s) this.f22915e).f22927b.m7633c();
        int iM1537a = c7551aM7633c.m1537a(6);
        return !(iM1537a == 0 || ((ByteBuffer) c7551aM7633c.f2088p0).get(iM1537a + c7551aM7633c.f2085Y) == 0) || this.f22912b == 65039;
    }

    public C7224p(C7227s c7227s) {
        this.f22911a = 1;
        this.f22914d = c7227s;
        this.f22915e = c7227s;
    }
}

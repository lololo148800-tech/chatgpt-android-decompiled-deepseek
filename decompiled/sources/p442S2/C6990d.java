package p442S2;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
import p038Ba.C0860j;
import p038Ba.C0861k;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: S2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6990d {

    /* JADX INFO: renamed from: n */
    public static final C6989c f22344n = new C6989c();

    /* JADX INFO: renamed from: o */
    public static final C6989c f22345o = new C6989c();

    /* JADX INFO: renamed from: p */
    public static final C6989c f22346p = new C6989c();

    /* JADX INFO: renamed from: q */
    public static final C6989c f22347q = new C6989c();

    /* JADX INFO: renamed from: r */
    public static final C6989c f22348r = new C6989c();

    /* JADX INFO: renamed from: s */
    public static final C6989c f22349s = new C6989c();

    /* JADX INFO: renamed from: a */
    public float f22350a;

    /* JADX INFO: renamed from: b */
    public float f22351b;

    /* JADX INFO: renamed from: c */
    public boolean f22352c;

    /* JADX INFO: renamed from: d */
    public final C0861k f22353d;

    /* JADX INFO: renamed from: e */
    public final C0860j f22354e;

    /* JADX INFO: renamed from: f */
    public boolean f22355f;

    /* JADX INFO: renamed from: g */
    public long f22356g;

    /* JADX INFO: renamed from: h */
    public final float f22357h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f22358i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f22359j;

    /* JADX INFO: renamed from: k */
    public C6991e f22360k;

    /* JADX INFO: renamed from: l */
    public float f22361l;

    /* JADX INFO: renamed from: m */
    public boolean f22362m;

    public C6990d(C0861k c0861k) {
        C0860j c0860j = C0861k.f2410C0;
        this.f22350a = 0.0f;
        this.f22351b = Float.MAX_VALUE;
        this.f22352c = false;
        this.f22355f = false;
        this.f22356g = 0L;
        this.f22358i = new ArrayList();
        this.f22359j = new ArrayList();
        this.f22353d = c0861k;
        this.f22354e = c0860j;
        if (c0860j == f22346p || c0860j == f22347q || c0860j == f22348r) {
            this.f22357h = 0.1f;
        } else if (c0860j == f22349s || c0860j == f22344n || c0860j == f22345o) {
            this.f22357h = 0.00390625f;
        } else {
            this.f22357h = 1.0f;
        }
        this.f22360k = null;
        this.f22361l = Float.MAX_VALUE;
        this.f22362m = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m7389a(float f10) {
        this.f22354e.getClass();
        C0861k c0861k = this.f22353d;
        c0861k.f2411A0 = f10 / 10000.0f;
        c0861k.invalidateSelf();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f22359j;
            if (i10 >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i10) != null) {
                throw AbstractC14376f.m15860z(i10, arrayList);
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7390b() {
        if (this.f22360k.f22364b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f22355f) {
            this.f22362m = true;
        }
    }
}

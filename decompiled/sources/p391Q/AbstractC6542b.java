package p391Q;

import android.util.Size;

/* JADX INFO: renamed from: Q.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6542b {

    /* JADX INFO: renamed from: a */
    public static final Size f21170a = new Size(0, 0);

    /* JADX INFO: renamed from: b */
    public static final Size f21171b;

    /* JADX INFO: renamed from: c */
    public static final Size f21172c;

    /* JADX INFO: renamed from: d */
    public static final Size f21173d;

    /* JADX INFO: renamed from: e */
    public static final Size f21174e;

    /* JADX INFO: renamed from: f */
    public static final Size f21175f;

    static {
        new Size(320, 240);
        f21171b = new Size(640, 480);
        f21172c = new Size(720, 480);
        f21173d = new Size(1280, 720);
        f21174e = new Size(1920, 1080);
        f21175f = new Size(1920, 1440);
    }

    /* JADX INFO: renamed from: a */
    public static int m7097a(Size size) {
        return size.getHeight() * size.getWidth();
    }
}

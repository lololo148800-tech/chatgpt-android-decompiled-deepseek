package p523V9;

import android.content.pm.Signature;
import android.graphics.Point;
import android.graphics.Rect;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p257K3.C4535c;
import p594Y9.C9700B0;
import p774h1.C14341T;
import p774h1.C14365u;
import p895n1.AbstractC17418F;
import p895n1.C17424d;
import p895n1.C17425e;
import p895n1.C17441u;

/* JADX INFO: renamed from: V9.C5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7862C5 {

    /* JADX INFO: renamed from: a */
    public static C17425e f24764a;

    /* JADX INFO: renamed from: a */
    public static byte[] m8136a(Signature signature) {
        try {
            return MessageDigest.getInstance("SHA256").digest(signature.toByteArray());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C17425e m8137b() {
        C17425e c17425e = f24764a;
        if (c17425e != null) {
            return c17425e;
        }
        C17424d c17424d = new C17424d("Outlined.Person", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = AbstractC17418F.f55636a;
        C14341T c14341t = new C14341T(C14365u.f45052b);
        C4535c c4535c = new C4535c(3);
        c4535c.m5290p(12.0f, 6.0f);
        c4535c.m5284j(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        c4535c.m5292r(-0.9f, 2.0f, -2.0f, 2.0f);
        c4535c.m5292r(-2.0f, -0.9f, -2.0f, -2.0f);
        c4535c.m5292r(0.9f, -2.0f, 2.0f, -2.0f);
        ArrayList arrayList = c4535c.f14813Z;
        arrayList.add(new C17441u(0.0f, 10.0f));
        c4535c.m5284j(2.7f, 0.0f, 5.8f, 1.29f, 6.0f, 2.0f);
        c4535c.m5288n(6.0f, 18.0f);
        c4535c.m5284j(0.23f, -0.72f, 3.31f, -2.0f, 6.0f, -2.0f);
        arrayList.add(new C17441u(0.0f, -12.0f));
        c4535c.m5283i(9.79f, 4.0f, 8.0f, 5.79f, 8.0f, 8.0f);
        c4535c.m5292r(1.79f, 4.0f, 4.0f, 4.0f);
        c4535c.m5292r(4.0f, -1.79f, 4.0f, -4.0f);
        c4535c.m5292r(-1.79f, -4.0f, -4.0f, -4.0f);
        c4535c.m5282h();
        c4535c.m5290p(12.0f, 14.0f);
        c4535c.m5284j(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        c4535c.m5294t(2.0f);
        c4535c.m5287m(16.0f);
        c4535c.m5294t(-2.0f);
        c4535c.m5284j(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        c4535c.m5282h();
        C17424d.m19121a(c17424d, arrayList, 0, c14341t, null, 1.0f, 0, 2, 1.0f);
        C17425e c17425eM19122b = c17424d.m19122b();
        f24764a = c17425eM19122b;
        return c17425eM19122b;
    }

    /* JADX INFO: renamed from: c */
    public static Rect m8138c(List list) {
        Iterator it = list.iterator();
        int iMin = Integer.MAX_VALUE;
        int iMax = Integer.MIN_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
        }
        return new Rect(iMin, iMin2, iMax, iMax2);
    }

    /* JADX INFO: renamed from: d */
    public static List m8139d(C9700B0 c9700b0) {
        Point[] pointArr = new Point[4];
        double dSin = Math.sin(Math.toRadians(c9700b0.f29232q0));
        double dCos = Math.cos(Math.toRadians(c9700b0.f29232q0));
        int i10 = c9700b0.f29228Y;
        int i11 = c9700b0.f29229Z;
        pointArr[0] = new Point(i10, i11);
        double d10 = c9700b0.f29230o0;
        Point point = new Point((int) ((d10 * dCos) + ((double) i10)), (int) ((d10 * dSin) + ((double) i11)));
        pointArr[1] = point;
        double d11 = point.x;
        int i12 = c9700b0.f29231p0;
        pointArr[2] = new Point((int) (d11 - (((double) i12) * dSin)), (int) ((((double) i12) * dCos) + ((double) pointArr[1].y)));
        Point point2 = pointArr[0];
        int i13 = point2.x;
        Point point3 = pointArr[2];
        int i14 = point3.x;
        Point point4 = pointArr[1];
        pointArr[3] = new Point((i14 - point4.x) + i13, (point3.y - point4.y) + point2.y);
        return Arrays.asList(pointArr);
    }
}

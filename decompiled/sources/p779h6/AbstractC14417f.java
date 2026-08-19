package p779h6;

import android.graphics.Path;
import android.graphics.PointF;
import com.google.protobuf.AbstractC12107L1;
import java.util.ArrayList;
import p567X5.InterfaceC9061k;
import p640a6.C10506a;
import p640a6.C10510e;
import p675c6.C11676k;

/* JADX INFO: renamed from: h6.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14417f {

    /* JADX INFO: renamed from: a */
    public static final PointF f45307a = new PointF();

    /* JADX INFO: renamed from: a */
    public static PointF m15924a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* JADX INFO: renamed from: b */
    public static float m15925b(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    /* JADX INFO: renamed from: c */
    public static int m15926c(float f10, float f11) {
        int i10 = (int) f10;
        int i11 = (int) f11;
        int i12 = i10 / i11;
        int i13 = i10 % i11;
        if (!((i10 ^ i11) >= 0) && i13 != 0) {
            i12--;
        }
        return i10 - (i11 * i12);
    }

    /* JADX INFO: renamed from: d */
    public static void m15927d(C11676k c11676k, Path path) {
        path.reset();
        PointF pointF = c11676k.f35379b;
        path.moveTo(pointF.x, pointF.y);
        PointF pointF2 = f45307a;
        pointF2.set(pointF.x, pointF.y);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = c11676k.f35378a;
            if (i10 >= arrayList.size()) {
                break;
            }
            C10506a c10506a = (C10506a) arrayList.get(i10);
            PointF pointF3 = c10506a.f31125a;
            boolean zEquals = pointF3.equals(pointF2);
            PointF pointF4 = c10506a.f31126b;
            PointF pointF5 = c10506a.f31127c;
            if (zEquals && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
            } else {
                path.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i10++;
        }
        if (c11676k.f35380c) {
            path.close();
        }
    }

    /* JADX INFO: renamed from: e */
    public static float m15928e(float f10, float f11, float f12) {
        return AbstractC12107L1.m13818i(f11, f10, f12, f10);
    }

    /* JADX INFO: renamed from: f */
    public static void m15929f(C10510e c10510e, int i10, ArrayList arrayList, C10510e c10510e2, InterfaceC9061k interfaceC9061k) {
        if (c10510e.m10966a(i10, interfaceC9061k.getName())) {
            String name = interfaceC9061k.getName();
            c10510e2.getClass();
            C10510e c10510e3 = new C10510e(c10510e2);
            c10510e3.f31151a.add(name);
            C10510e c10510e4 = new C10510e(c10510e3);
            c10510e4.f31152b = interfaceC9061k;
            arrayList.add(c10510e4);
        }
    }
}

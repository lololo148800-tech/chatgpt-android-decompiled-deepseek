package ac;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.SystemClock;
import fo.C13711h;
import io.sentry.C15358g1;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p1007s7.C19465d;
import p1009s9.C19506i;
import p1060v9.AbstractC20502t;
import p1060v9.C20489g;
import p501Ub.EnumC7610l;
import p519V4.RunnableC7757e;
import p544W9.AbstractC8532O4;
import p544W9.C8502J4;
import p544W9.C8520M4;
import p544W9.C8544Q4;
import p544W9.C8638g3;
import p544W9.EnumC8602a3;
import p544W9.EnumC8632f3;
import p544W9.EnumC8668l3;
import p746fa.C13606o;
import p999s.C19341c1;

/* JADX INFO: renamed from: ac.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10539a {

    /* JADX INFO: renamed from: a */
    public volatile Bitmap f31254a;

    /* JADX INFO: renamed from: b */
    public volatile ByteBuffer f31255b;

    /* JADX INFO: renamed from: c */
    public volatile C19506i f31256c;

    /* JADX INFO: renamed from: d */
    public final int f31257d;

    /* JADX INFO: renamed from: e */
    public final int f31258e;

    /* JADX INFO: renamed from: f */
    public final int f31259f;

    /* JADX INFO: renamed from: g */
    public final int f31260g;

    public C10539a(Bitmap bitmap, int i10) {
        AbstractC20502t.m21157h(bitmap);
        this.f31254a = bitmap;
        this.f31257d = bitmap.getWidth();
        this.f31258e = bitmap.getHeight();
        m10978b(i10);
        this.f31259f = i10;
        this.f31260g = -1;
    }

    /* JADX INFO: renamed from: b */
    public static void m10978b(int i10) {
        boolean z6 = true;
        if (i10 != 0 && i10 != 90 && i10 != 180 && i10 != 270) {
            z6 = false;
        }
        AbstractC20502t.m21150a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z6);
    }

    /* JADX INFO: renamed from: c */
    public static void m10979c(int i10, int i11, long j10, int i12, int i13, int i14, int i15) {
        C8520M4 c8520m4M9197d;
        EnumC8602a3 enumC8602a3;
        EnumC8632f3 enumC8632f3;
        synchronized (AbstractC8532O4.class) {
            byte b = (byte) (((byte) 1) | 2);
            try {
                if (b != 3) {
                    StringBuilder sb2 = new StringBuilder();
                    if ((b & 1) == 0) {
                        sb2.append(" enableFirelog");
                    }
                    if ((b & 2) == 0) {
                        sb2.append(" firelogEventType");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                }
                c8520m4M9197d = AbstractC8532O4.m9197d(new C8502J4());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
        EnumC8668l3 enumC8668l3 = EnumC8668l3.INPUT_IMAGE_CONSTRUCTION;
        c8520m4M9197d.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        HashMap map = c8520m4M9197d.f26347i;
        if (map.get(enumC8668l3) != null && jElapsedRealtime2 - ((Long) map.get(enumC8668l3)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
            return;
        }
        map.put(enumC8668l3, Long.valueOf(jElapsedRealtime2));
        C19341c1 c19341c1 = new C19341c1();
        if (i10 == -1) {
            enumC8602a3 = EnumC8602a3.BITMAP;
        } else if (i10 == 35) {
            enumC8602a3 = EnumC8602a3.YUV_420_888;
        } else if (i10 == 842094169) {
            enumC8602a3 = EnumC8602a3.YV12;
        } else if (i10 != 16) {
            enumC8602a3 = i10 != 17 ? EnumC8602a3.UNKNOWN_FORMAT : EnumC8602a3.NV21;
        } else {
            enumC8602a3 = EnumC8602a3.NV16;
        }
        c19341c1.f61256o0 = enumC8602a3;
        if (i11 == 1) {
            enumC8632f3 = EnumC8632f3.BITMAP;
        } else if (i11 == 2) {
            enumC8632f3 = EnumC8632f3.BYTEARRAY;
        } else if (i11 != 3) {
            enumC8632f3 = i11 != 4 ? EnumC8632f3.ANDROID_MEDIA_IMAGE : EnumC8632f3.FILEPATH;
        } else {
            enumC8632f3 = EnumC8632f3.BYTEBUFFER;
        }
        c19341c1.f61255Z = enumC8632f3;
        c19341c1.f61257p0 = Integer.valueOf(i14 & Integer.MAX_VALUE);
        c19341c1.f61259r0 = Integer.valueOf(i12 & Integer.MAX_VALUE);
        c19341c1.f61258q0 = Integer.valueOf(i13 & Integer.MAX_VALUE);
        c19341c1.f61254Y = Long.valueOf(Long.MAX_VALUE & jElapsedRealtime);
        c19341c1.f61260s0 = Integer.valueOf(i15 & Integer.MAX_VALUE);
        C8638g3 c8638g3 = new C8638g3(c19341c1);
        C13711h c13711h = new C13711h(14, false);
        c13711h.f43261p0 = c8638g3;
        C15358g1 c15358g1 = new C15358g1();
        c15358g1.f47946Z = new C19465d();
        c15358g1.f47945Y = c13711h;
        C8544Q4.m9205b();
        C13606o c13606o = c8520m4M9197d.f26343e;
        EnumC7610l.f24056Y.execute(new RunnableC7757e(c8520m4M9197d, c15358g1, c13606o.m15132k() ? (String) c13606o.m15130i() : C20489g.f65055c.m21137a(c8520m4M9197d.f26345g)));
    }

    /* JADX INFO: renamed from: a */
    public final Image.Plane[] m10980a() {
        if (this.f31256c == null) {
            return null;
        }
        return ((Image) this.f31256c.f61960Z).getPlanes();
    }

    public C10539a(Image image, int i10, int i11, int i12) {
        AbstractC20502t.m21157h(image);
        this.f31256c = new C19506i(image, 24);
        this.f31257d = i10;
        this.f31258e = i11;
        m10978b(i12);
        this.f31259f = i12;
        this.f31260g = 35;
    }

    public C10539a(ByteBuffer byteBuffer, int i10, int i11, int i12) {
        AbstractC20502t.m21157h(byteBuffer);
        this.f31255b = byteBuffer;
        AbstractC20502t.m21150a("Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.", byteBuffer.limit() > i10 * i11);
        byteBuffer.rewind();
        this.f31257d = i10;
        this.f31258e = i11;
        m10978b(i12);
        this.f31259f = i12;
        this.f31260g = 17;
    }
}

package p523V9;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17309l;
import p1106xf.C21198f;
import p1106xf.C21199g;
import p1113xn.AbstractC21322p;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21945N1;
import p1155zi.C21952P1;
import p229J0.C4108p0;
import p291Lf.AbstractC5011h;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6014l0;
import p349O0.C6018n0;
import p349O0.C6021p;
import p403Qd.AbstractC6659u;
import p478Tc.AbstractC7308l;
import p479Td.C7351f0;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p586Y0.C9572x;
import p749fd.C13616a;
import p749fd.C13621f;
import p749fd.C13625j;
import p749fd.C13628m;
import p893n.AbstractActivityC17375g;
import p909nm.AbstractC17680n;
import td.C19843f;

/* JADX INFO: renamed from: V9.F5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7886F5 {
    /* JADX INFO: renamed from: a */
    public static final void m8178a(AbstractC6659u item, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(item, "item");
        c6021p.m6526U(-1964014581);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(item) : c6021p.m6545h(item) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C7351f0 c7351f0M7172d = item.m7172d();
            String str = c7351f0M7172d != null ? c7351f0M7172d.f23277M : null;
            c6021p.m6524S(229343358);
            if (str == null) {
                c8410b.invoke(c6021p, Integer.valueOf((i11 >> 3) & 14));
                c6021p.m6553p(false);
                C6018n0 c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C21198f(item, c8410b, i10, 0);
                    return;
                }
                return;
            }
            c6021p.m6553p(false);
            Map map = (Map) c6021p.m6548k(AbstractC5011h.f16350a);
            C17309l c17309l = (C17309l) map.get(str);
            c6021p.m6524S(229348637);
            if (c17309l != null) {
                m8179b((Configuration) c17309l.f55136Y, (Context) c17309l.f55137Z, c8410b, c6021p, (i11 << 3) & 896);
                c6021p.m6553p(false);
                C6018n0 c6018n0M6555r2 = c6021p.m6555r();
                if (c6018n0M6555r2 != null) {
                    c6018n0M6555r2.f19536d = new C21198f(item, c8410b, i10, 1);
                    return;
                }
                return;
            }
            c6021p.m6553p(false);
            AbstractActivityC17375g abstractActivityC17375g = (AbstractActivityC17375g) c6021p.m6548k(AbstractC7308l.f23151a);
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            List listM21697e0 = AbstractC21322p.m21697e0(str, new String[]{"-"}, 0, 6);
            String str2 = (String) listM21697e0.get(0);
            String str3 = (String) AbstractC17680n.m19344T(1, listM21697e0);
            if (str3 == null) {
                str3 = "";
            }
            Configuration configuration = (Configuration) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32824a);
            c6021p.m6524S(229365802);
            boolean zM6542f = c6021p.m6542f(configuration) | c6021p.m6542f(str2) | c6021p.m6542f(str3);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            Object obj2 = objM6514H;
            if (zM6542f || objM6514H == obj) {
                Configuration configuration2 = new Configuration(configuration);
                configuration2.setLocale(new Locale(str2, str3));
                c6021p.m6537c0(configuration2);
                obj2 = configuration2;
            }
            Configuration configuration3 = (Configuration) obj2;
            c6021p.m6553p(false);
            c6021p.m6524S(229372078);
            boolean zM6542f2 = c6021p.m6542f(context) | c6021p.m6542f(abstractActivityC17375g);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                objM6514H2 = new C21199g(abstractActivityC17375g, context.createConfigurationContext(configuration3));
                c6021p.m6537c0(objM6514H2);
            }
            C21199g c21199g = (C21199g) objM6514H2;
            c6021p.m6553p(false);
            map.put(str, new C17309l(configuration3, c21199g));
            m8179b(configuration3, c21199g, c8410b, c6021p, (i11 << 3) & 896);
        }
        C6018n0 c6018n0M6555r3 = c6021p.m6555r();
        if (c6018n0M6555r3 != null) {
            c6018n0M6555r3.f19536d = new C21198f(item, c8410b, i10, 2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8179b(Configuration configuration, Context context, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(876199110);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(configuration) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(context) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C5997d.m6442b(new C6014l0[]{AndroidCompositionLocals_androidKt.f32824a.mo6405a(configuration), AndroidCompositionLocals_androidKt.f32825b.mo6405a(context)}, AbstractC8411c.m8969c(950968710, c6021p, new C4108p0(c8410b, 20)), c6021p, 56);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C19843f(configuration, context, c8410b, i10, 7);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C13616a m8180c(C13625j c13625j, Bitmap bitmap) {
        AbstractC16544l.m18094g(c13625j, "<this>");
        long j10 = c13625j.f43056i;
        if (((int) (j10 >> 32)) / ((int) (j10 & 4294967295L)) <= bitmap.getWidth() / bitmap.getHeight()) {
            float width = bitmap.getWidth();
            long j11 = c13625j.f43056i;
            return new C13616a(width / ((int) (j11 >> 32)), 0.0f, (((int) (4294967295L & j11)) - ((((int) (c13625j.f43056i >> 32)) / bitmap.getWidth()) * bitmap.getHeight())) / 2, 2);
        }
        float height = bitmap.getHeight();
        long j12 = c13625j.f43056i;
        return new C13616a(height / ((int) (j12 & 4294967295L)), (((int) (j12 >> 32)) - ((((int) (4294967295L & c13625j.f43056i)) / bitmap.getHeight()) * bitmap.getWidth())) / 2, 0.0f, 4);
    }

    /* JADX INFO: renamed from: d */
    public static final AbstractC21955Q1 m8181d(C13625j c13625j, Context context, C13616a c13616a, Uri outputFile, Bitmap bitmap, int i10, Bitmap.CompressFormat format) {
        AbstractC16544l.m18094g(c13625j, "<this>");
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(outputFile, "outputFile");
        AbstractC16544l.m18094g(format, "format");
        Canvas canvas = new Canvas(bitmap);
        float fM6409g = c13625j.f43053f.m6409g();
        float f10 = c13616a.f43006a;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(fM6409g * f10);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(i10);
        ListIterator listIterator = c13625j.f43049b.listIterator();
        while (true) {
            C9572x c9572x = (C9572x) listIterator;
            if (!c9572x.hasNext()) {
                break;
            }
            C13621f c13621f = (C13621f) c9572x.next();
            paint.setStrokeWidth(c13621f.f43032b * f10);
            canvas.drawPath(AbstractC7878E5.m8161b(c13621f, new C13628m(c13616a, 0)), paint);
        }
        OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(outputFile);
        if (outputStreamOpenOutputStream == null) {
            return new C21945N1(new IOException("Failed to open output stream."));
        }
        try {
            bitmap.compress(format, 90, outputStreamOpenOutputStream);
            AbstractC7942M5.m8232a(outputStreamOpenOutputStream, null);
            return new C21952P1(C17296C.f55119a);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC7942M5.m8232a(outputStreamOpenOutputStream, th2);
                throw th3;
            }
        }
    }
}

package p523V9;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0233b1;
import p040Bd.C0937I1;
import p080D0.C1834v;
import p1016t3.C19755E;
import p1071w0.AbstractC20734X;
import p1073w3.AbstractC20800b;
import p1073w3.C20811m;
import p204I1.C3582M;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3950M1;
import p229J0.AbstractC3959O0;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p229J0.C4108p0;
import p302M0.AbstractC5251c;
import p305M3.C5289i;
import p328N1.C5609y;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6018n0;
import p349O0.C6021p;
import p372P3.C6330l;
import p478Tc.AbstractC7306j;
import p479Td.C7351f0;
import p492U1.C7540e;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p544W9.AbstractC8467E;
import p571X9.AbstractC9119D4;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: V9.o5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8159o5 {
    /* JADX INFO: renamed from: a */
    public static final void m8720a(C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-246919409);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(c8410b) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            c6021p.m6524S(1518916869);
            if (zBooleanValue) {
                c8410b.invoke(c6021p, Integer.valueOf(i11 & 14));
                c6021p.m6553p(false);
                C6018n0 c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C1834v(c8410b, i10, 3);
                    return;
                }
                return;
            }
            c6021p.m6553p(false);
            C5984W0 c5984w0 = AndroidCompositionLocals_androidKt.f32825b;
            Context context = (Context) c6021p.m6548k(c5984w0);
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            configuration.uiMode = (configuration.uiMode & (-49)) | 32;
            Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
            AbstractC16544l.m18091d(contextCreateConfigurationContext);
            C5997d.m6440a(c5984w0.mo6405a(contextCreateConfigurationContext), AbstractC8411c.m8969c(1945342927, c6021p, new C4108p0(c8410b, 11)), c6021p, 56);
        }
        C6018n0 c6018n0M6555r2 = c6021p.m6555r();
        if (c6018n0M6555r2 != null) {
            c6018n0M6555r2.f19536d = new C1834v(c8410b, i10, 4);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8721b(C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        C3949M0 c3949m0M4663e;
        c6021p.m6526U(1467521891);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(c8410b) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            if (AbstractC8467E.m9097b(c6021p)) {
                c6021p.m6524S(-1803349769);
                long jM8615a = AbstractC8118j4.m8615a(R.color.primary, c6021p);
                long jM8615a2 = AbstractC8118j4.m8615a(R.color.onPrimary, c6021p);
                long jM8615a3 = AbstractC8118j4.m8615a(R.color.primaryContainer, c6021p);
                long jM8615a4 = AbstractC8118j4.m8615a(R.color.onPrimaryContainer, c6021p);
                long jM8615a5 = AbstractC8118j4.m8615a(R.color.secondary, c6021p);
                long jM8615a6 = AbstractC8118j4.m8615a(R.color.onSecondary, c6021p);
                long jM8615a7 = AbstractC8118j4.m8615a(R.color.secondaryContainer, c6021p);
                long jM8615a8 = AbstractC8118j4.m8615a(R.color.onSecondaryContainer, c6021p);
                long jM8615a9 = AbstractC8118j4.m8615a(R.color.tertiary, c6021p);
                long jM8615a10 = AbstractC8118j4.m8615a(R.color.onTertiary, c6021p);
                long jM8615a11 = AbstractC8118j4.m8615a(R.color.tertiaryContainer, c6021p);
                long jM8615a12 = AbstractC8118j4.m8615a(R.color.onTertiaryContainer, c6021p);
                long jM8615a13 = AbstractC8118j4.m8615a(R.color.error, c6021p);
                long jM8615a14 = AbstractC8118j4.m8615a(R.color.onError, c6021p);
                long jM8615a15 = AbstractC8118j4.m8615a(R.color.errorContainer, c6021p);
                long jM8615a16 = AbstractC8118j4.m8615a(R.color.onErrorContainer, c6021p);
                long jM8615a17 = AbstractC8118j4.m8615a(R.color.background, c6021p);
                long jM8615a18 = AbstractC8118j4.m8615a(R.color.onBackground, c6021p);
                long jM8615a19 = AbstractC8118j4.m8615a(R.color.surface, c6021p);
                long jM8615a20 = AbstractC8118j4.m8615a(R.color.onSurface, c6021p);
                long jM8615a21 = AbstractC8118j4.m8615a(R.color.surfaceVariant, c6021p);
                long jM8615a22 = AbstractC8118j4.m8615a(R.color.onSurfaceVariant, c6021p);
                long jM8615a23 = AbstractC8118j4.m8615a(R.color.outline, c6021p);
                long jM8615a24 = AbstractC8118j4.m8615a(R.color.outlineVariant, c6021p);
                long jM8615a25 = AbstractC8118j4.m8615a(R.color.surface, c6021p);
                long jM8615a26 = AbstractC8118j4.m8615a(R.color.primary, c6021p);
                float f10 = AbstractC7306j.f23143a;
                long jM8723d = m8723d(f10, jM8615a25, jM8615a26);
                long jM8723d2 = m8723d(f10, AbstractC8118j4.m8615a(R.color.surface, c6021p), AbstractC8118j4.m8615a(R.color.primary, c6021p));
                long jM8723d3 = m8723d(AbstractC7306j.f23145c, AbstractC8118j4.m8615a(R.color.surface, c6021p), AbstractC8118j4.m8615a(R.color.primary, c6021p));
                long jM8615a27 = AbstractC8118j4.m8615a(R.color.surfaceVariant, c6021p);
                C5984W0 c5984w0 = AbstractC3959O0.f12302a;
                c3949m0M4663e = new C3949M0(jM8615a, jM8615a2, jM8615a3, jM8615a4, AbstractC5251c.f17154b, jM8615a5, jM8615a6, jM8615a7, jM8615a8, jM8615a9, jM8615a10, jM8615a11, jM8615a12, jM8615a17, jM8615a18, jM8615a19, jM8615a20, jM8615a21, jM8615a22, jM8615a, AbstractC5251c.f17155c, AbstractC5251c.f17153a, jM8615a13, jM8615a14, jM8615a15, jM8615a16, jM8615a23, jM8615a24, AbstractC5251c.f17156d, AbstractC5251c.f17157e, AbstractC5251c.f17159g, jM8723d, jM8723d3, jM8615a27, jM8723d2, AbstractC5251c.f17158f);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(-1801108810);
                long jM8615a28 = AbstractC8118j4.m8615a(R.color.primary, c6021p);
                long jM8615a29 = AbstractC8118j4.m8615a(R.color.onPrimary, c6021p);
                long jM8615a30 = AbstractC8118j4.m8615a(R.color.primaryContainer, c6021p);
                long jM8615a31 = AbstractC8118j4.m8615a(R.color.onPrimaryContainer, c6021p);
                long jM8615a32 = AbstractC8118j4.m8615a(R.color.secondary, c6021p);
                long jM8615a33 = AbstractC8118j4.m8615a(R.color.onSecondary, c6021p);
                long jM8615a34 = AbstractC8118j4.m8615a(R.color.secondaryContainer, c6021p);
                long jM8615a35 = AbstractC8118j4.m8615a(R.color.onSecondaryContainer, c6021p);
                long jM8615a36 = AbstractC8118j4.m8615a(R.color.tertiary, c6021p);
                long jM8615a37 = AbstractC8118j4.m8615a(R.color.onTertiary, c6021p);
                long jM8615a38 = AbstractC8118j4.m8615a(R.color.tertiaryContainer, c6021p);
                long jM8615a39 = AbstractC8118j4.m8615a(R.color.onTertiaryContainer, c6021p);
                long jM8615a40 = AbstractC8118j4.m8615a(R.color.error, c6021p);
                long jM8615a41 = AbstractC8118j4.m8615a(R.color.onError, c6021p);
                long jM8615a42 = AbstractC8118j4.m8615a(R.color.errorContainer, c6021p);
                long jM8615a43 = AbstractC8118j4.m8615a(R.color.onErrorContainer, c6021p);
                long jM8615a44 = AbstractC8118j4.m8615a(R.color.background, c6021p);
                long jM8615a45 = AbstractC8118j4.m8615a(R.color.onBackground, c6021p);
                long jM8615a46 = AbstractC8118j4.m8615a(R.color.surface, c6021p);
                long jM8615a47 = AbstractC8118j4.m8615a(R.color.onSurface, c6021p);
                long jM8615a48 = AbstractC8118j4.m8615a(R.color.surfaceVariant, c6021p);
                long jM8615a49 = AbstractC8118j4.m8615a(R.color.onSurfaceVariant, c6021p);
                long jM8615a50 = AbstractC8118j4.m8615a(R.color.outline, c6021p);
                long jM8615a51 = AbstractC8118j4.m8615a(R.color.outlineVariant, c6021p);
                long jM8615a52 = AbstractC8118j4.m8615a(R.color.surface, c6021p);
                long jM8615a53 = AbstractC8118j4.m8615a(R.color.primary, c6021p);
                float f11 = AbstractC7306j.f23143a;
                c3949m0M4663e = AbstractC3959O0.m4663e(jM8615a28, jM8615a29, jM8615a30, jM8615a31, jM8615a32, jM8615a33, jM8615a34, jM8615a35, jM8615a36, jM8615a37, jM8615a38, jM8615a39, jM8615a44, jM8615a45, jM8615a46, jM8615a47, jM8615a48, jM8615a49, jM8615a40, jM8615a41, jM8615a42, jM8615a43, jM8615a50, jM8615a51, m8723d(f11, jM8615a52, jM8615a53), m8723d(AbstractC7306j.f23145c, AbstractC8118j4.m8615a(R.color.surface, c6021p), AbstractC8118j4.m8615a(R.color.primary, c6021p)), AbstractC8118j4.m8615a(R.color.surfaceVariant, c6021p), m8723d(f11, AbstractC8118j4.m8615a(R.color.surface, c6021p), AbstractC8118j4.m8615a(R.color.primary, c6021p)), 808976400, 12);
                c6021p.m6553p(false);
            }
            C5984W0 c5984w1 = AbstractC3947L4.f12183a;
            C3941K4 c3941k4 = (C3941K4) c6021p.m6548k(c5984w1);
            C3582M c3582m = ((C3941K4) c6021p.m6548k(c5984w1)).f12151g;
            long jM9650c = AbstractC9119D4.m9650c(20);
            C5609y c5609y = C5609y.f18157t0;
            AbstractC3950M1.m4657a(c3949m0M4663e, null, new C3941K4(c3941k4.f12145a, c3941k4.f12146b, c3941k4.f12147c, c3941k4.f12148d, c3941k4.f12149e, c3941k4.f12150f, C3582M.m4274b(c3582m, 0L, jM9650c, c5609y, null, 0L, null, 0, 0, 0L, null, null, 16777209), C3582M.m4274b(((C3941K4) c6021p.m6548k(c5984w1)).f12152h, 0L, AbstractC9119D4.m9650c(18), c5609y, null, 0L, null, 0, 0, 0L, null, null, 16777209), C3582M.m4274b(((C3941K4) c6021p.m6548k(c5984w1)).f12153i, 0L, AbstractC9119D4.m9650c(16), C5609y.f18156s0, null, 0L, null, 0, 0, 0L, null, null, 16777209), c3941k4.f12154j, c3941k4.f12155k, c3941k4.f12156l, C3582M.m4274b(((C3941K4) c6021p.m6548k(c5984w1)).f12157m, 0L, 0L, c5609y, null, 0L, null, 0, 0, 0L, null, null, 16777211), C3582M.m4274b(((C3941K4) c6021p.m6548k(c5984w1)).f12158n, 0L, 0L, c5609y, null, 0L, null, 0, 0, 0L, null, null, 16777211), c3941k4.f12159o), c8410b, c6021p, (i11 << 9) & 7168);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1834v(c8410b, i10, 5);
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m8722c(C6330l c6330l) {
        C20811m c20811m = new C20811m(8);
        int i10 = C5289i.m5830b(c6330l, c20811m).f17430a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        c6330l.mo3047d(c20811m.f66092a, 0, 4, false);
        c20811m.m21344F(0);
        int iM21352g = c20811m.m21352g();
        if (iM21352g == 1463899717) {
            return true;
        }
        AbstractC20800b.m21324l("WavHeaderReader", "Unsupported form type: " + iM21352g);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static final long m8723d(float f10, long j10, long j11) {
        return C7540e.m7873a(f10, (float) 0) ? j10 : AbstractC14334L.m15636n(C14365u.m15774b(((((float) Math.log(f10 + 1)) * 4.5f) + 2.0f) / 100.0f, j11), j10);
    }

    /* JADX INFO: renamed from: e */
    public static final String m8724e(C7351f0 c7351f0) {
        List list = c7351f0.f23307v;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C0937I1) {
                arrayList.add(obj);
            }
        }
        C0937I1 c0937i1 = (C0937I1) AbstractC17680n.m19343S(arrayList);
        if (c0937i1 != null) {
            return c0937i1.f2687c;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static C5289i m8725f(int i10, C6330l c6330l, C20811m c20811m) {
        C5289i c5289iM5830b = C5289i.m5830b(c6330l, c20811m);
        while (true) {
            int i11 = c5289iM5830b.f17430a;
            if (i11 == i10) {
                return c5289iM5830b;
            }
            AbstractC20734X.m21224A(i11, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j10 = c5289iM5830b.f17431b;
            long j11 = 8 + j10;
            if (j10 % 2 != 0) {
                j11 = 9 + j10;
            }
            if (j11 > 2147483647L) {
                throw C19755E.m20713b("Chunk is too large (~2GB+) to skip; id: " + i11);
            }
            c6330l.mo3052j((int) j11);
            c5289iM5830b = C5289i.m5830b(c6330l, c20811m);
        }
    }
}

package p544W9;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.graphics.painter.BitmapPainter;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.chatgpt.R;
import com.openai.feature.settings.impl.instructions.CustomInstructionsIntroductionViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p003A1.C0257i0;
import p025An.C0644w;
import p039Bc.C0885s;
import p049Bm.InterfaceC1426a;
import p098Di.InterfaceC2062k;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p204I1.C3582M;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p229J0.C3991U3;
import p243Jf.C4334d;
import p257K3.C4535c;
import p328N1.C5609y;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p363Og.AbstractC6200d;
import p363Og.C6218v;
import p363Og.C6219w;
import p478Tc.AbstractC7313q;
import p499U9.C7588r;
import p523V9.AbstractC8142m4;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9113C4;
import p594Y9.AbstractC9739H3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.C14341T;
import p774h1.C14351g;
import p774h1.C14365u;
import p895n1.AbstractC17418F;
import p895n1.C17424d;
import p895n1.C17425e;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17788v;
import p911o0.C17756f;
import p911o0.C17790w;
import p911o0.C17794y;

/* JADX INFO: renamed from: W9.O4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8532O4 {

    /* JADX INFO: renamed from: a */
    public static C7588r f26358a;

    /* JADX INFO: renamed from: a */
    public static BitmapPainter m9194a(C14351g c14351g, int i10) {
        Bitmap bitmap = c14351g.f45036a;
        BitmapPainter bitmapPainter = new BitmapPainter(c14351g, 0L, AbstractC9113C4.m9643a(bitmap.getWidth(), bitmap.getHeight()));
        bitmapPainter.f32723u0 = i10;
        return bitmapPainter;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:69:0x011b  */
    /* JADX WARN: Code duplicated, block: B:70:0x011f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0132  */
    /* JADX WARN: Code duplicated, block: B:75:0x0140  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:84:0x0309  */
    /* JADX WARN: Code duplicated, block: B:85:0x030c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0422  */
    /* JADX WARN: Code duplicated, block: B:90:0x0434  */
    /* JADX WARN: Code duplicated, block: B:91:0x0438  */
    /* JADX WARN: Code duplicated, block: B:96:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m9195b(InterfaceC1426a onDismiss, InterfaceC10459q interfaceC10459q, String str, boolean z6, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        String str2;
        int i13;
        boolean z10;
        int i14;
        int i15;
        C10456n c10456n;
        String strM8676d;
        int i16;
        InterfaceC10459q interfaceC10459q3;
        boolean z11;
        String str3;
        int i17;
        C21696i c21696i;
        C21694h c21694h;
        C5984W0 c5984w0;
        C17425e c17425e;
        byte b;
        C17425e c17425e2;
        C17425e c17425e3;
        float f10;
        C17425e c17425e4;
        float f11;
        String str4;
        InterfaceC10459q interfaceC10459q4;
        C17425e c17425e5;
        C17425e c17425e6;
        C6018n0 c6018n0M6555r;
        AbstractC16544l.m18094g(onDismiss, "onDismiss");
        c6021p.m6526U(-1351185426);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6545h(onDismiss) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 48) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                if ((i11 & 4) == 0) {
                    str2 = str;
                    int i19 = c6021p.m6542f(str2) ? 256 : 128;
                    i12 |= i19;
                } else {
                    str2 = str;
                }
                i12 |= i19;
            } else {
                str2 = str;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    z10 = z6;
                    if (c6021p.m6544g(z10)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i12 & 1171) == 1170 || !c6021p.m6562y()) {
                    c6021p.m6519N();
                    i15 = i10 & 1;
                    c10456n = C10456n.f30959Y;
                    if (i15 != 0 || c6021p.m6561x()) {
                        if (i18 != 0) {
                            interfaceC10459q2 = c10456n;
                        }
                        if ((i11 & 4) != 0) {
                            strM8676d = AbstractC8142m4.m8676d(R.string.custom_instructions_done, c6021p);
                            i12 &= -897;
                        } else {
                            strM8676d = str2;
                        }
                        if (i13 != 0) {
                            str3 = strM8676d;
                            i16 = i12;
                            interfaceC10459q3 = interfaceC10459q2;
                            z11 = false;
                        } else {
                            i16 = i12;
                            interfaceC10459q3 = interfaceC10459q2;
                            z11 = z10;
                            str3 = strM8676d;
                        }
                    } else {
                        c6021p.m6517L();
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        i16 = i12;
                        interfaceC10459q3 = interfaceC10459q2;
                        z11 = z10;
                        str3 = str2;
                    }
                    c6021p.m6554q();
                    InterfaceC10459q interfaceC10459qMo428M = interfaceC10459q3.mo428M(AbstractC10844c.f32512c);
                    float f12 = AbstractC7313q.f23201f;
                    InterfaceC10459q interfaceC10459qM9126g = AbstractC8479G.m9126g(AbstractC10842a.m11237o(AbstractC10842a.m11235m(interfaceC10459qMo428M, f12, 0.0f, 2), 0.0f, 0.0f, 0.0f, f12, 7), AbstractC8479G.m9124e(c6021p), 14);
                    C17756f c17756f = AbstractC17770m.f56724a;
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.m19500g(AbstractC7313q.f23202g), C10444b.f30946y0, c6021p, 0);
                    i17 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM9126g);
                    InterfaceC21700k.f68875m0.getClass();
                    c21696i = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                    c21694h = C21698j.f68874g;
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i17))) {
                        AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                    C17794y c17794y = C17794y.f56777a;
                    String strM8676d2 = AbstractC8142m4.m8676d(R.string.custom_instructions_introduction_title, c6021p);
                    C5984W0 c5984w1 = AbstractC3947L4.f12183a;
                    AbstractC4124r4.m4768b(strM8676d2, null, 0L, 0L, null, C5609y.f18156s0, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(c5984w1)).f12146b, c6021p, 196608, 0, 65502);
                    String strM8676d3 = AbstractC8142m4.m8676d(R.string.custom_instructions_introduction_description, c6021p);
                    C3582M c3582m = ((C3941K4) c6021p.m6548k(c5984w1)).f12154j;
                    c5984w0 = AbstractC3959O0.f12302a;
                    String str5 = str3;
                    AbstractC4124r4.m4768b(strM8676d3, null, ((C3949M0) c6021p.m6548k(c5984w0)).f12231m, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c3582m, c6021p, 0, 0, 65530);
                    C8410b c8410b = AbstractC6200d.f20199b;
                    c17425e = AbstractC8488H2.f26310a;
                    InterfaceC10459q interfaceC10459q5 = interfaceC10459q3;
                    if (c17425e != null) {
                        c17425e2 = c17425e;
                        b = -1065353216;
                    } else {
                        C17424d c17424d = new C17424d("Outlined.AddComment", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i20 = AbstractC17418F.f55636a;
                        C14341T c14341t = new C14341T(C14365u.f45052b);
                        C4535c c4535c = new C4535c(3);
                        c4535c.m5290p(22.0f, 4.0f);
                        c4535c.m5284j(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        c4535c.m5288n(4.0f, 2.0f);
                        c4535c.m5284j(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        c4535c.m5294t(12.0f);
                        c4535c.m5284j(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        c4535c.m5287m(14.0f);
                        c4535c.m5289o(4.0f, 4.0f);
                        c4535c.m5288n(22.0f, 4.0f);
                        c4535c.m5282h();
                        c4535c.m5290p(20.0f, 17.17f);
                        c4535c.m5288n(18.83f, 16.0f);
                        c4535c.m5288n(4.0f, 16.0f);
                        c4535c.m5288n(4.0f, 4.0f);
                        c4535c.m5287m(16.0f);
                        c4535c.m5294t(13.17f);
                        c4535c.m5282h();
                        c4535c.m5290p(13.0f, 5.0f);
                        c4535c.m5287m(-2.0f);
                        c4535c.m5294t(4.0f);
                        c4535c.m5288n(7.0f, 9.0f);
                        c4535c.m5294t(2.0f);
                        c4535c.m5287m(4.0f);
                        c4535c.m5294t(4.0f);
                        c4535c.m5287m(2.0f);
                        b = -1065353216;
                        c4535c.m5294t(-4.0f);
                        c4535c.m5287m(4.0f);
                        c4535c.m5288n(17.0f, 9.0f);
                        c4535c.m5287m(-4.0f);
                        c4535c.m5282h();
                        C17424d.m19121a(c17424d, c4535c.f14813Z, 0, c14341t, null, 1.0f, 0, 2, 1.0f);
                        C17425e c17425eM19122b = c17424d.m19122b();
                        AbstractC8488H2.f26310a = c17425eM19122b;
                        c17425e2 = c17425eM19122b;
                    }
                    AbstractC9739H3.m10328c(R.string.custom_instructions_start_title, c8410b, c17425e2, null, ((C3949M0) c6021p.m6548k(c5984w0)).f12213a, c6021p, 48);
                    if (z11) {
                        c6021p.m6524S(-512075106);
                        C8410b c8410b2 = AbstractC6200d.f20200c;
                        c17425e5 = AbstractC8553S2.f26382a;
                        if (c17425e5 != null) {
                            c17425e6 = c17425e5;
                        } else {
                            C17424d c17424d2 = new C17424d("Outlined.WorkOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i21 = AbstractC17418F.f55636a;
                            C14341T c14341t2 = new C14341T(C14365u.f45052b);
                            C4535c c4535c2 = new C4535c(3);
                            c4535c2.m5290p(14.0f, 6.0f);
                            c4535c2.m5288n(14.0f, 4.0f);
                            c4535c2.m5287m(-4.0f);
                            c4535c2.m5294t(2.0f);
                            c4535c2.m5287m(4.0f);
                            c4535c2.m5282h();
                            c4535c2.m5290p(4.0f, 8.0f);
                            c4535c2.m5294t(11.0f);
                            c4535c2.m5287m(16.0f);
                            c4535c2.m5288n(20.0f, 8.0f);
                            c4535c2.m5288n(4.0f, 8.0f);
                            c4535c2.m5282h();
                            c4535c2.m5290p(20.0f, 6.0f);
                            c4535c2.m5284j(1.11f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f);
                            c4535c2.m5294t(11.0f);
                            c4535c2.m5284j(0.0f, 1.11f, -0.89f, 2.0f, -2.0f, 2.0f);
                            c4535c2.m5288n(4.0f, 21.0f);
                            c4535c2.m5284j(-1.11f, 0.0f, -2.0f, -0.89f, -2.0f, -2.0f);
                            c4535c2.m5289o(0.01f, -11.0f);
                            c4535c2.m5284j(0.0f, -1.11f, 0.88f, -2.0f, 1.99f, -2.0f);
                            c4535c2.m5287m(4.0f);
                            c4535c2.m5288n(8.0f, 4.0f);
                            c4535c2.m5284j(0.0f, -1.11f, 0.89f, -2.0f, 2.0f, -2.0f);
                            c4535c2.m5287m(4.0f);
                            c4535c2.m5284j(1.11f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f);
                            c4535c2.m5294t(2.0f);
                            c4535c2.m5287m(4.0f);
                            c4535c2.m5282h();
                            C17424d.m19121a(c17424d2, c4535c2.f14813Z, 0, c14341t2, null, 1.0f, 0, 2, 1.0f);
                            C17425e c17425eM19122b2 = c17424d2.m19122b();
                            AbstractC8553S2.f26382a = c17425eM19122b2;
                            c17425e6 = c17425eM19122b2;
                        }
                        f11 = 1.0f;
                        AbstractC9739H3.m10328c(R.string.custom_instructions_business_title, c8410b2, c17425e6, null, ((C3949M0) c6021p.m6548k(c5984w0)).f12223f, c6021p, 48);
                        c6021p.m6553p(false);
                    } else {
                        c6021p.m6524S(-511566086);
                        C8410b c8410b3 = AbstractC6200d.f20201d;
                        c17425e3 = AbstractC8494I2.f26314a;
                        if (c17425e3 != null) {
                            c17425e4 = c17425e3;
                            f10 = 1.0f;
                        } else {
                            C17424d c17424d3 = new C17424d("Outlined.AutoGraph", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i22 = AbstractC17418F.f55636a;
                            C14341T c14341t3 = new C14341T(C14365u.f45052b);
                            C4535c c4535c3 = new C4535c(3);
                            c4535c3.m5290p(14.06f, 9.94f);
                            c4535c3.m5288n(12.0f, 9.0f);
                            c4535c3.m5289o(2.06f, -0.94f);
                            c4535c3.m5288n(15.0f, 6.0f);
                            c4535c3.m5289o(0.94f, 2.06f);
                            c4535c3.m5288n(18.0f, 9.0f);
                            c4535c3.m5289o(-2.06f, 0.94f);
                            c4535c3.m5288n(15.0f, 12.0f);
                            c4535c3.m5288n(14.06f, 9.94f);
                            c4535c3.m5282h();
                            c4535c3.m5290p(4.0f, 14.0f);
                            c4535c3.m5289o(0.94f, -2.06f);
                            c4535c3.m5288n(7.0f, 11.0f);
                            c4535c3.m5289o(-2.06f, -0.94f);
                            c4535c3.m5288n(4.0f, 8.0f);
                            c4535c3.m5289o(-0.94f, 2.06f);
                            f10 = 1.0f;
                            c4535c3.m5288n(1.0f, 11.0f);
                            c4535c3.m5289o(2.06f, 0.94f);
                            c4535c3.m5288n(4.0f, 14.0f);
                            c4535c3.m5282h();
                            c4535c3.m5290p(8.5f, 9.0f);
                            c4535c3.m5289o(1.09f, -2.41f);
                            c4535c3.m5288n(12.0f, 5.5f);
                            c4535c3.m5288n(9.59f, 4.41f);
                            c4535c3.m5288n(8.5f, 2.0f);
                            c4535c3.m5288n(7.41f, 4.41f);
                            c4535c3.m5288n(5.0f, 5.5f);
                            c4535c3.m5289o(2.41f, 1.09f);
                            c4535c3.m5288n(8.5f, 9.0f);
                            c4535c3.m5282h();
                            c4535c3.m5290p(4.5f, 20.5f);
                            c4535c3.m5289o(6.0f, -6.01f);
                            c4535c3.m5289o(4.0f, 4.0f);
                            c4535c3.m5288n(23.0f, 8.93f);
                            c4535c3.m5289o(-1.41f, -1.41f);
                            c4535c3.m5289o(-7.09f, 7.97f);
                            c4535c3.m5289o(-4.0f, -4.0f);
                            c4535c3.m5288n(3.0f, 19.0f);
                            c4535c3.m5288n(4.5f, 20.5f);
                            c4535c3.m5282h();
                            C17424d.m19121a(c17424d3, c4535c3.f14813Z, 0, c14341t3, null, 1.0f, 0, 2, 1.0f);
                            C17425e c17425eM19122b3 = c17424d3.m19122b();
                            AbstractC8494I2.f26314a = c17425eM19122b3;
                            c17425e4 = c17425eM19122b3;
                        }
                        f11 = f10;
                        AbstractC9739H3.m10328c(R.string.custom_instructions_performance_title, c8410b3, c17425e4, null, ((C3949M0) c6021p.m6548k(c5984w0)).f12223f, c6021p, 48);
                        c6021p.m6553p(false);
                    }
                    AbstractC17758g.m19482b(c6021p, c17794y.m19544b(c10456n, true));
                    AbstractC3984T1.m4685d(onDismiss, AbstractC10844c.m11244d(AbstractC10842a.m11237o(c10456n, 0.0f, AbstractC7313q.f23199d, 0.0f, 0.0f, 13), f11), false, null, null, null, null, null, null, AbstractC8411c.m8969c(-1368808236, c6021p, new C3991U3(str5, 2)), c6021p, (i16 & 14) | 805306368, 508);
                    c6021p.m6553p(true);
                    str4 = str5;
                    interfaceC10459q4 = interfaceC10459q5;
                    z10 = z11;
                } else {
                    c6021p.m6517L();
                    str4 = str2;
                    interfaceC10459q4 = interfaceC10459q2;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C6218v(i10, i11, onDismiss, interfaceC10459q4, str4, z10);
                }
            }
            i12 |= 3072;
            z10 = z6;
            if ((i12 & 1171) == 1170) {
                c6021p.m6519N();
                i15 = i10 & 1;
                c10456n = C10456n.f30959Y;
                if (i15 != 0) {
                    if (i18 != 0) {
                        interfaceC10459q2 = c10456n;
                    }
                    if ((i11 & 4) != 0) {
                        strM8676d = AbstractC8142m4.m8676d(R.string.custom_instructions_done, c6021p);
                        i12 &= -897;
                    } else {
                        strM8676d = str2;
                    }
                    if (i13 != 0) {
                        str3 = strM8676d;
                        i16 = i12;
                        interfaceC10459q3 = interfaceC10459q2;
                        z11 = false;
                    } else {
                        i16 = i12;
                        interfaceC10459q3 = interfaceC10459q2;
                        z11 = z10;
                        str3 = strM8676d;
                    }
                } else {
                    if (i18 != 0) {
                        interfaceC10459q2 = c10456n;
                    }
                    if ((i11 & 4) != 0) {
                        strM8676d = AbstractC8142m4.m8676d(R.string.custom_instructions_done, c6021p);
                        i12 &= -897;
                    } else {
                        strM8676d = str2;
                    }
                    if (i13 != 0) {
                        str3 = strM8676d;
                        i16 = i12;
                        interfaceC10459q3 = interfaceC10459q2;
                        z11 = false;
                    } else {
                        i16 = i12;
                        interfaceC10459q3 = interfaceC10459q2;
                        z11 = z10;
                        str3 = strM8676d;
                    }
                }
                c6021p.m6554q();
                InterfaceC10459q interfaceC10459qMo428M2 = interfaceC10459q3.mo428M(AbstractC10844c.f32512c);
                float f13 = AbstractC7313q.f23201f;
                InterfaceC10459q interfaceC10459qM9126g2 = AbstractC8479G.m9126g(AbstractC10842a.m11237o(AbstractC10842a.m11235m(interfaceC10459qMo428M2, f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f13, 7), AbstractC8479G.m9124e(c6021p), 14);
                C17756f c17756f2 = AbstractC17770m.f56724a;
                C17790w c17790wM19515a2 = AbstractC17788v.m19515a(AbstractC17770m.m19500g(AbstractC7313q.f23202g), C10444b.f30946y0, c6021p, 0);
                i17 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM9126g2);
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a2);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m2);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                } else {
                    AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d2);
                C17794y c17794y2 = C17794y.f56777a;
                String strM8676d4 = AbstractC8142m4.m8676d(R.string.custom_instructions_introduction_title, c6021p);
                C5984W0 c5984w2 = AbstractC3947L4.f12183a;
                AbstractC4124r4.m4768b(strM8676d4, null, 0L, 0L, null, C5609y.f18156s0, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(c5984w2)).f12146b, c6021p, 196608, 0, 65502);
                String strM8676d5 = AbstractC8142m4.m8676d(R.string.custom_instructions_introduction_description, c6021p);
                C3582M c3582m2 = ((C3941K4) c6021p.m6548k(c5984w2)).f12154j;
                c5984w0 = AbstractC3959O0.f12302a;
                String str6 = str3;
                AbstractC4124r4.m4768b(strM8676d5, null, ((C3949M0) c6021p.m6548k(c5984w0)).f12231m, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c3582m2, c6021p, 0, 0, 65530);
                C8410b c8410b4 = AbstractC6200d.f20199b;
                c17425e = AbstractC8488H2.f26310a;
                InterfaceC10459q interfaceC10459q6 = interfaceC10459q3;
                if (c17425e != null) {
                    c17425e2 = c17425e;
                    b = -1065353216;
                } else {
                    C17424d c17424d4 = new C17424d("Outlined.AddComment", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i23 = AbstractC17418F.f55636a;
                    C14341T c14341t4 = new C14341T(C14365u.f45052b);
                    C4535c c4535c4 = new C4535c(3);
                    c4535c4.m5290p(22.0f, 4.0f);
                    c4535c4.m5284j(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                    c4535c4.m5288n(4.0f, 2.0f);
                    c4535c4.m5284j(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                    c4535c4.m5294t(12.0f);
                    c4535c4.m5284j(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                    c4535c4.m5287m(14.0f);
                    c4535c4.m5289o(4.0f, 4.0f);
                    c4535c4.m5288n(22.0f, 4.0f);
                    c4535c4.m5282h();
                    c4535c4.m5290p(20.0f, 17.17f);
                    c4535c4.m5288n(18.83f, 16.0f);
                    c4535c4.m5288n(4.0f, 16.0f);
                    c4535c4.m5288n(4.0f, 4.0f);
                    c4535c4.m5287m(16.0f);
                    c4535c4.m5294t(13.17f);
                    c4535c4.m5282h();
                    c4535c4.m5290p(13.0f, 5.0f);
                    c4535c4.m5287m(-2.0f);
                    c4535c4.m5294t(4.0f);
                    c4535c4.m5288n(7.0f, 9.0f);
                    c4535c4.m5294t(2.0f);
                    c4535c4.m5287m(4.0f);
                    c4535c4.m5294t(4.0f);
                    c4535c4.m5287m(2.0f);
                    b = -1065353216;
                    c4535c4.m5294t(-4.0f);
                    c4535c4.m5287m(4.0f);
                    c4535c4.m5288n(17.0f, 9.0f);
                    c4535c4.m5287m(-4.0f);
                    c4535c4.m5282h();
                    C17424d.m19121a(c17424d4, c4535c4.f14813Z, 0, c14341t4, null, 1.0f, 0, 2, 1.0f);
                    C17425e c17425eM19122b4 = c17424d4.m19122b();
                    AbstractC8488H2.f26310a = c17425eM19122b4;
                    c17425e2 = c17425eM19122b4;
                }
                AbstractC9739H3.m10328c(R.string.custom_instructions_start_title, c8410b4, c17425e2, null, ((C3949M0) c6021p.m6548k(c5984w0)).f12213a, c6021p, 48);
                if (z11) {
                    c6021p.m6524S(-512075106);
                    C8410b c8410b5 = AbstractC6200d.f20200c;
                    c17425e5 = AbstractC8553S2.f26382a;
                    if (c17425e5 != null) {
                        c17425e6 = c17425e5;
                    } else {
                        C17424d c17424d5 = new C17424d("Outlined.WorkOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i24 = AbstractC17418F.f55636a;
                        C14341T c14341t5 = new C14341T(C14365u.f45052b);
                        C4535c c4535c5 = new C4535c(3);
                        c4535c5.m5290p(14.0f, 6.0f);
                        c4535c5.m5288n(14.0f, 4.0f);
                        c4535c5.m5287m(-4.0f);
                        c4535c5.m5294t(2.0f);
                        c4535c5.m5287m(4.0f);
                        c4535c5.m5282h();
                        c4535c5.m5290p(4.0f, 8.0f);
                        c4535c5.m5294t(11.0f);
                        c4535c5.m5287m(16.0f);
                        c4535c5.m5288n(20.0f, 8.0f);
                        c4535c5.m5288n(4.0f, 8.0f);
                        c4535c5.m5282h();
                        c4535c5.m5290p(20.0f, 6.0f);
                        c4535c5.m5284j(1.11f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f);
                        c4535c5.m5294t(11.0f);
                        c4535c5.m5284j(0.0f, 1.11f, -0.89f, 2.0f, -2.0f, 2.0f);
                        c4535c5.m5288n(4.0f, 21.0f);
                        c4535c5.m5284j(-1.11f, 0.0f, -2.0f, -0.89f, -2.0f, -2.0f);
                        c4535c5.m5289o(0.01f, -11.0f);
                        c4535c5.m5284j(0.0f, -1.11f, 0.88f, -2.0f, 1.99f, -2.0f);
                        c4535c5.m5287m(4.0f);
                        c4535c5.m5288n(8.0f, 4.0f);
                        c4535c5.m5284j(0.0f, -1.11f, 0.89f, -2.0f, 2.0f, -2.0f);
                        c4535c5.m5287m(4.0f);
                        c4535c5.m5284j(1.11f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f);
                        c4535c5.m5294t(2.0f);
                        c4535c5.m5287m(4.0f);
                        c4535c5.m5282h();
                        C17424d.m19121a(c17424d5, c4535c5.f14813Z, 0, c14341t5, null, 1.0f, 0, 2, 1.0f);
                        C17425e c17425eM19122b5 = c17424d5.m19122b();
                        AbstractC8553S2.f26382a = c17425eM19122b5;
                        c17425e6 = c17425eM19122b5;
                    }
                    f11 = 1.0f;
                    AbstractC9739H3.m10328c(R.string.custom_instructions_business_title, c8410b5, c17425e6, null, ((C3949M0) c6021p.m6548k(c5984w0)).f12223f, c6021p, 48);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(-511566086);
                    C8410b c8410b6 = AbstractC6200d.f20201d;
                    c17425e3 = AbstractC8494I2.f26314a;
                    if (c17425e3 != null) {
                        c17425e4 = c17425e3;
                        f10 = 1.0f;
                    } else {
                        C17424d c17424d6 = new C17424d("Outlined.AutoGraph", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i25 = AbstractC17418F.f55636a;
                        C14341T c14341t6 = new C14341T(C14365u.f45052b);
                        C4535c c4535c6 = new C4535c(3);
                        c4535c6.m5290p(14.06f, 9.94f);
                        c4535c6.m5288n(12.0f, 9.0f);
                        c4535c6.m5289o(2.06f, -0.94f);
                        c4535c6.m5288n(15.0f, 6.0f);
                        c4535c6.m5289o(0.94f, 2.06f);
                        c4535c6.m5288n(18.0f, 9.0f);
                        c4535c6.m5289o(-2.06f, 0.94f);
                        c4535c6.m5288n(15.0f, 12.0f);
                        c4535c6.m5288n(14.06f, 9.94f);
                        c4535c6.m5282h();
                        c4535c6.m5290p(4.0f, 14.0f);
                        c4535c6.m5289o(0.94f, -2.06f);
                        c4535c6.m5288n(7.0f, 11.0f);
                        c4535c6.m5289o(-2.06f, -0.94f);
                        c4535c6.m5288n(4.0f, 8.0f);
                        c4535c6.m5289o(-0.94f, 2.06f);
                        f10 = 1.0f;
                        c4535c6.m5288n(1.0f, 11.0f);
                        c4535c6.m5289o(2.06f, 0.94f);
                        c4535c6.m5288n(4.0f, 14.0f);
                        c4535c6.m5282h();
                        c4535c6.m5290p(8.5f, 9.0f);
                        c4535c6.m5289o(1.09f, -2.41f);
                        c4535c6.m5288n(12.0f, 5.5f);
                        c4535c6.m5288n(9.59f, 4.41f);
                        c4535c6.m5288n(8.5f, 2.0f);
                        c4535c6.m5288n(7.41f, 4.41f);
                        c4535c6.m5288n(5.0f, 5.5f);
                        c4535c6.m5289o(2.41f, 1.09f);
                        c4535c6.m5288n(8.5f, 9.0f);
                        c4535c6.m5282h();
                        c4535c6.m5290p(4.5f, 20.5f);
                        c4535c6.m5289o(6.0f, -6.01f);
                        c4535c6.m5289o(4.0f, 4.0f);
                        c4535c6.m5288n(23.0f, 8.93f);
                        c4535c6.m5289o(-1.41f, -1.41f);
                        c4535c6.m5289o(-7.09f, 7.97f);
                        c4535c6.m5289o(-4.0f, -4.0f);
                        c4535c6.m5288n(3.0f, 19.0f);
                        c4535c6.m5288n(4.5f, 20.5f);
                        c4535c6.m5282h();
                        C17424d.m19121a(c17424d6, c4535c6.f14813Z, 0, c14341t6, null, 1.0f, 0, 2, 1.0f);
                        C17425e c17425eM19122b6 = c17424d6.m19122b();
                        AbstractC8494I2.f26314a = c17425eM19122b6;
                        c17425e4 = c17425eM19122b6;
                    }
                    f11 = f10;
                    AbstractC9739H3.m10328c(R.string.custom_instructions_performance_title, c8410b6, c17425e4, null, ((C3949M0) c6021p.m6548k(c5984w0)).f12223f, c6021p, 48);
                    c6021p.m6553p(false);
                }
                AbstractC17758g.m19482b(c6021p, c17794y2.m19544b(c10456n, true));
                AbstractC3984T1.m4685d(onDismiss, AbstractC10844c.m11244d(AbstractC10842a.m11237o(c10456n, 0.0f, AbstractC7313q.f23199d, 0.0f, 0.0f, 13), f11), false, null, null, null, null, null, null, AbstractC8411c.m8969c(-1368808236, c6021p, new C3991U3(str6, 2)), c6021p, (i16 & 14) | 805306368, 508);
                c6021p.m6553p(true);
                str4 = str6;
                interfaceC10459q4 = interfaceC10459q6;
                z10 = z11;
            } else {
                c6021p.m6519N();
                i15 = i10 & 1;
                c10456n = C10456n.f30959Y;
                if (i15 != 0) {
                    if (i18 != 0) {
                        interfaceC10459q2 = c10456n;
                    }
                    if ((i11 & 4) != 0) {
                        strM8676d = AbstractC8142m4.m8676d(R.string.custom_instructions_done, c6021p);
                        i12 &= -897;
                    } else {
                        strM8676d = str2;
                    }
                    if (i13 != 0) {
                        str3 = strM8676d;
                        i16 = i12;
                        interfaceC10459q3 = interfaceC10459q2;
                        z11 = false;
                    } else {
                        i16 = i12;
                        interfaceC10459q3 = interfaceC10459q2;
                        z11 = z10;
                        str3 = strM8676d;
                    }
                } else {
                    if (i18 != 0) {
                        interfaceC10459q2 = c10456n;
                    }
                    if ((i11 & 4) != 0) {
                        strM8676d = AbstractC8142m4.m8676d(R.string.custom_instructions_done, c6021p);
                        i12 &= -897;
                    } else {
                        strM8676d = str2;
                    }
                    if (i13 != 0) {
                        str3 = strM8676d;
                        i16 = i12;
                        interfaceC10459q3 = interfaceC10459q2;
                        z11 = false;
                    } else {
                        i16 = i12;
                        interfaceC10459q3 = interfaceC10459q2;
                        z11 = z10;
                        str3 = strM8676d;
                    }
                }
                c6021p.m6554q();
                InterfaceC10459q interfaceC10459qMo428M3 = interfaceC10459q3.mo428M(AbstractC10844c.f32512c);
                float f14 = AbstractC7313q.f23201f;
                InterfaceC10459q interfaceC10459qM9126g3 = AbstractC8479G.m9126g(AbstractC10842a.m11237o(AbstractC10842a.m11235m(interfaceC10459qMo428M3, f14, 0.0f, 2), 0.0f, 0.0f, 0.0f, f14, 7), AbstractC8479G.m9124e(c6021p), 14);
                C17756f c17756f3 = AbstractC17770m.f56724a;
                C17790w c17790wM19515a3 = AbstractC17788v.m19515a(AbstractC17770m.m19500g(AbstractC7313q.f23202g), C10444b.f30946y0, c6021p, 0);
                i17 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM9126g3);
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a3);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m3);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                } else {
                    AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d3);
                C17794y c17794y3 = C17794y.f56777a;
                String strM8676d6 = AbstractC8142m4.m8676d(R.string.custom_instructions_introduction_title, c6021p);
                C5984W0 c5984w3 = AbstractC3947L4.f12183a;
                AbstractC4124r4.m4768b(strM8676d6, null, 0L, 0L, null, C5609y.f18156s0, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(c5984w3)).f12146b, c6021p, 196608, 0, 65502);
                String strM8676d7 = AbstractC8142m4.m8676d(R.string.custom_instructions_introduction_description, c6021p);
                C3582M c3582m3 = ((C3941K4) c6021p.m6548k(c5984w3)).f12154j;
                c5984w0 = AbstractC3959O0.f12302a;
                String str7 = str3;
                AbstractC4124r4.m4768b(strM8676d7, null, ((C3949M0) c6021p.m6548k(c5984w0)).f12231m, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c3582m3, c6021p, 0, 0, 65530);
                C8410b c8410b7 = AbstractC6200d.f20199b;
                c17425e = AbstractC8488H2.f26310a;
                InterfaceC10459q interfaceC10459q7 = interfaceC10459q3;
                if (c17425e != null) {
                    c17425e2 = c17425e;
                    b = -1065353216;
                } else {
                    C17424d c17424d7 = new C17424d("Outlined.AddComment", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i26 = AbstractC17418F.f55636a;
                    C14341T c14341t7 = new C14341T(C14365u.f45052b);
                    C4535c c4535c7 = new C4535c(3);
                    c4535c7.m5290p(22.0f, 4.0f);
                    c4535c7.m5284j(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                    c4535c7.m5288n(4.0f, 2.0f);
                    c4535c7.m5284j(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                    c4535c7.m5294t(12.0f);
                    c4535c7.m5284j(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                    c4535c7.m5287m(14.0f);
                    c4535c7.m5289o(4.0f, 4.0f);
                    c4535c7.m5288n(22.0f, 4.0f);
                    c4535c7.m5282h();
                    c4535c7.m5290p(20.0f, 17.17f);
                    c4535c7.m5288n(18.83f, 16.0f);
                    c4535c7.m5288n(4.0f, 16.0f);
                    c4535c7.m5288n(4.0f, 4.0f);
                    c4535c7.m5287m(16.0f);
                    c4535c7.m5294t(13.17f);
                    c4535c7.m5282h();
                    c4535c7.m5290p(13.0f, 5.0f);
                    c4535c7.m5287m(-2.0f);
                    c4535c7.m5294t(4.0f);
                    c4535c7.m5288n(7.0f, 9.0f);
                    c4535c7.m5294t(2.0f);
                    c4535c7.m5287m(4.0f);
                    c4535c7.m5294t(4.0f);
                    c4535c7.m5287m(2.0f);
                    b = -1065353216;
                    c4535c7.m5294t(-4.0f);
                    c4535c7.m5287m(4.0f);
                    c4535c7.m5288n(17.0f, 9.0f);
                    c4535c7.m5287m(-4.0f);
                    c4535c7.m5282h();
                    C17424d.m19121a(c17424d7, c4535c7.f14813Z, 0, c14341t7, null, 1.0f, 0, 2, 1.0f);
                    C17425e c17425eM19122b7 = c17424d7.m19122b();
                    AbstractC8488H2.f26310a = c17425eM19122b7;
                    c17425e2 = c17425eM19122b7;
                }
                AbstractC9739H3.m10328c(R.string.custom_instructions_start_title, c8410b7, c17425e2, null, ((C3949M0) c6021p.m6548k(c5984w0)).f12213a, c6021p, 48);
                if (z11) {
                    c6021p.m6524S(-512075106);
                    C8410b c8410b8 = AbstractC6200d.f20200c;
                    c17425e5 = AbstractC8553S2.f26382a;
                    if (c17425e5 != null) {
                        c17425e6 = c17425e5;
                    } else {
                        C17424d c17424d8 = new C17424d("Outlined.WorkOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i27 = AbstractC17418F.f55636a;
                        C14341T c14341t8 = new C14341T(C14365u.f45052b);
                        C4535c c4535c8 = new C4535c(3);
                        c4535c8.m5290p(14.0f, 6.0f);
                        c4535c8.m5288n(14.0f, 4.0f);
                        c4535c8.m5287m(-4.0f);
                        c4535c8.m5294t(2.0f);
                        c4535c8.m5287m(4.0f);
                        c4535c8.m5282h();
                        c4535c8.m5290p(4.0f, 8.0f);
                        c4535c8.m5294t(11.0f);
                        c4535c8.m5287m(16.0f);
                        c4535c8.m5288n(20.0f, 8.0f);
                        c4535c8.m5288n(4.0f, 8.0f);
                        c4535c8.m5282h();
                        c4535c8.m5290p(20.0f, 6.0f);
                        c4535c8.m5284j(1.11f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f);
                        c4535c8.m5294t(11.0f);
                        c4535c8.m5284j(0.0f, 1.11f, -0.89f, 2.0f, -2.0f, 2.0f);
                        c4535c8.m5288n(4.0f, 21.0f);
                        c4535c8.m5284j(-1.11f, 0.0f, -2.0f, -0.89f, -2.0f, -2.0f);
                        c4535c8.m5289o(0.01f, -11.0f);
                        c4535c8.m5284j(0.0f, -1.11f, 0.88f, -2.0f, 1.99f, -2.0f);
                        c4535c8.m5287m(4.0f);
                        c4535c8.m5288n(8.0f, 4.0f);
                        c4535c8.m5284j(0.0f, -1.11f, 0.89f, -2.0f, 2.0f, -2.0f);
                        c4535c8.m5287m(4.0f);
                        c4535c8.m5284j(1.11f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f);
                        c4535c8.m5294t(2.0f);
                        c4535c8.m5287m(4.0f);
                        c4535c8.m5282h();
                        C17424d.m19121a(c17424d8, c4535c8.f14813Z, 0, c14341t8, null, 1.0f, 0, 2, 1.0f);
                        C17425e c17425eM19122b8 = c17424d8.m19122b();
                        AbstractC8553S2.f26382a = c17425eM19122b8;
                        c17425e6 = c17425eM19122b8;
                    }
                    f11 = 1.0f;
                    AbstractC9739H3.m10328c(R.string.custom_instructions_business_title, c8410b8, c17425e6, null, ((C3949M0) c6021p.m6548k(c5984w0)).f12223f, c6021p, 48);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(-511566086);
                    C8410b c8410b9 = AbstractC6200d.f20201d;
                    c17425e3 = AbstractC8494I2.f26314a;
                    if (c17425e3 != null) {
                        c17425e4 = c17425e3;
                        f10 = 1.0f;
                    } else {
                        C17424d c17424d9 = new C17424d("Outlined.AutoGraph", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i28 = AbstractC17418F.f55636a;
                        C14341T c14341t9 = new C14341T(C14365u.f45052b);
                        C4535c c4535c9 = new C4535c(3);
                        c4535c9.m5290p(14.06f, 9.94f);
                        c4535c9.m5288n(12.0f, 9.0f);
                        c4535c9.m5289o(2.06f, -0.94f);
                        c4535c9.m5288n(15.0f, 6.0f);
                        c4535c9.m5289o(0.94f, 2.06f);
                        c4535c9.m5288n(18.0f, 9.0f);
                        c4535c9.m5289o(-2.06f, 0.94f);
                        c4535c9.m5288n(15.0f, 12.0f);
                        c4535c9.m5288n(14.06f, 9.94f);
                        c4535c9.m5282h();
                        c4535c9.m5290p(4.0f, 14.0f);
                        c4535c9.m5289o(0.94f, -2.06f);
                        c4535c9.m5288n(7.0f, 11.0f);
                        c4535c9.m5289o(-2.06f, -0.94f);
                        c4535c9.m5288n(4.0f, 8.0f);
                        c4535c9.m5289o(-0.94f, 2.06f);
                        f10 = 1.0f;
                        c4535c9.m5288n(1.0f, 11.0f);
                        c4535c9.m5289o(2.06f, 0.94f);
                        c4535c9.m5288n(4.0f, 14.0f);
                        c4535c9.m5282h();
                        c4535c9.m5290p(8.5f, 9.0f);
                        c4535c9.m5289o(1.09f, -2.41f);
                        c4535c9.m5288n(12.0f, 5.5f);
                        c4535c9.m5288n(9.59f, 4.41f);
                        c4535c9.m5288n(8.5f, 2.0f);
                        c4535c9.m5288n(7.41f, 4.41f);
                        c4535c9.m5288n(5.0f, 5.5f);
                        c4535c9.m5289o(2.41f, 1.09f);
                        c4535c9.m5288n(8.5f, 9.0f);
                        c4535c9.m5282h();
                        c4535c9.m5290p(4.5f, 20.5f);
                        c4535c9.m5289o(6.0f, -6.01f);
                        c4535c9.m5289o(4.0f, 4.0f);
                        c4535c9.m5288n(23.0f, 8.93f);
                        c4535c9.m5289o(-1.41f, -1.41f);
                        c4535c9.m5289o(-7.09f, 7.97f);
                        c4535c9.m5289o(-4.0f, -4.0f);
                        c4535c9.m5288n(3.0f, 19.0f);
                        c4535c9.m5288n(4.5f, 20.5f);
                        c4535c9.m5282h();
                        C17424d.m19121a(c17424d9, c4535c9.f14813Z, 0, c14341t9, null, 1.0f, 0, 2, 1.0f);
                        C17425e c17425eM19122b9 = c17424d9.m19122b();
                        AbstractC8494I2.f26314a = c17425eM19122b9;
                        c17425e4 = c17425eM19122b9;
                    }
                    f11 = f10;
                    AbstractC9739H3.m10328c(R.string.custom_instructions_performance_title, c8410b9, c17425e4, null, ((C3949M0) c6021p.m6548k(c5984w0)).f12223f, c6021p, 48);
                    c6021p.m6553p(false);
                }
                AbstractC17758g.m19482b(c6021p, c17794y3.m19544b(c10456n, true));
                AbstractC3984T1.m4685d(onDismiss, AbstractC10844c.m11244d(AbstractC10842a.m11237o(c10456n, 0.0f, AbstractC7313q.f23199d, 0.0f, 0.0f, 13), f11), false, null, null, null, null, null, null, AbstractC8411c.m8969c(-1368808236, c6021p, new C3991U3(str7, 2)), c6021p, (i16 & 14) | 805306368, 508);
                c6021p.m6553p(true);
                str4 = str7;
                interfaceC10459q4 = interfaceC10459q7;
                z10 = z11;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C6218v(i10, i11, onDismiss, interfaceC10459q4, str4, z10);
            }
        }
        i12 |= 48;
        interfaceC10459q2 = interfaceC10459q;
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                str2 = str;
                if (c6021p.m6542f(str2)) {
                }
                i12 |= i19;
            } else {
                str2 = str;
            }
            i12 |= i19;
        } else {
            str2 = str;
        }
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                z10 = z6;
                if (c6021p.m6544g(z10)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i12 & 1171) == 1170) {
                c6021p.m6519N();
                i15 = i10 & 1;
                c10456n = C10456n.f30959Y;
                if (i15 != 0) {
                    if (i18 != 0) {
                        interfaceC10459q2 = c10456n;
                    }
                    if ((i11 & 4) != 0) {
                        strM8676d = AbstractC8142m4.m8676d(R.string.custom_instructions_done, c6021p);
                        i12 &= -897;
                    } else {
                        strM8676d = str2;
                    }
                    if (i13 != 0) {
                        str3 = strM8676d;
                        i16 = i12;
                        interfaceC10459q3 = interfaceC10459q2;
                        z11 = false;
                    } else {
                        i16 = i12;
                        interfaceC10459q3 = interfaceC10459q2;
                        z11 = z10;
                        str3 = strM8676d;
                    }
                } else {
                    if (i18 != 0) {
                        interfaceC10459q2 = c10456n;
                    }
                    if ((i11 & 4) != 0) {
                        strM8676d = AbstractC8142m4.m8676d(R.string.custom_instructions_done, c6021p);
                        i12 &= -897;
                    } else {
                        strM8676d = str2;
                    }
                    if (i13 != 0) {
                        str3 = strM8676d;
                        i16 = i12;
                        interfaceC10459q3 = interfaceC10459q2;
                        z11 = false;
                    } else {
                        i16 = i12;
                        interfaceC10459q3 = interfaceC10459q2;
                        z11 = z10;
                        str3 = strM8676d;
                    }
                }
                c6021p.m6554q();
                InterfaceC10459q interfaceC10459qMo428M4 = interfaceC10459q3.mo428M(AbstractC10844c.f32512c);
                float f15 = AbstractC7313q.f23201f;
                InterfaceC10459q interfaceC10459qM9126g4 = AbstractC8479G.m9126g(AbstractC10842a.m11237o(AbstractC10842a.m11235m(interfaceC10459qMo428M4, f15, 0.0f, 2), 0.0f, 0.0f, 0.0f, f15, 7), AbstractC8479G.m9124e(c6021p), 14);
                C17756f c17756f4 = AbstractC17770m.f56724a;
                C17790w c17790wM19515a4 = AbstractC17788v.m19515a(AbstractC17770m.m19500g(AbstractC7313q.f23202g), C10444b.f30946y0, c6021p, 0);
                i17 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m4 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d4 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM9126g4);
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a4);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m4);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                } else {
                    AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d4);
                C17794y c17794y4 = C17794y.f56777a;
                String strM8676d8 = AbstractC8142m4.m8676d(R.string.custom_instructions_introduction_title, c6021p);
                C5984W0 c5984w4 = AbstractC3947L4.f12183a;
                AbstractC4124r4.m4768b(strM8676d8, null, 0L, 0L, null, C5609y.f18156s0, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(c5984w4)).f12146b, c6021p, 196608, 0, 65502);
                String strM8676d9 = AbstractC8142m4.m8676d(R.string.custom_instructions_introduction_description, c6021p);
                C3582M c3582m4 = ((C3941K4) c6021p.m6548k(c5984w4)).f12154j;
                c5984w0 = AbstractC3959O0.f12302a;
                String str8 = str3;
                AbstractC4124r4.m4768b(strM8676d9, null, ((C3949M0) c6021p.m6548k(c5984w0)).f12231m, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c3582m4, c6021p, 0, 0, 65530);
                C8410b c8410b10 = AbstractC6200d.f20199b;
                c17425e = AbstractC8488H2.f26310a;
                InterfaceC10459q interfaceC10459q8 = interfaceC10459q3;
                if (c17425e != null) {
                    c17425e2 = c17425e;
                    b = -1065353216;
                } else {
                    C17424d c17424d10 = new C17424d("Outlined.AddComment", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i29 = AbstractC17418F.f55636a;
                    C14341T c14341t10 = new C14341T(C14365u.f45052b);
                    C4535c c4535c10 = new C4535c(3);
                    c4535c10.m5290p(22.0f, 4.0f);
                    c4535c10.m5284j(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                    c4535c10.m5288n(4.0f, 2.0f);
                    c4535c10.m5284j(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                    c4535c10.m5294t(12.0f);
                    c4535c10.m5284j(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                    c4535c10.m5287m(14.0f);
                    c4535c10.m5289o(4.0f, 4.0f);
                    c4535c10.m5288n(22.0f, 4.0f);
                    c4535c10.m5282h();
                    c4535c10.m5290p(20.0f, 17.17f);
                    c4535c10.m5288n(18.83f, 16.0f);
                    c4535c10.m5288n(4.0f, 16.0f);
                    c4535c10.m5288n(4.0f, 4.0f);
                    c4535c10.m5287m(16.0f);
                    c4535c10.m5294t(13.17f);
                    c4535c10.m5282h();
                    c4535c10.m5290p(13.0f, 5.0f);
                    c4535c10.m5287m(-2.0f);
                    c4535c10.m5294t(4.0f);
                    c4535c10.m5288n(7.0f, 9.0f);
                    c4535c10.m5294t(2.0f);
                    c4535c10.m5287m(4.0f);
                    c4535c10.m5294t(4.0f);
                    c4535c10.m5287m(2.0f);
                    b = -1065353216;
                    c4535c10.m5294t(-4.0f);
                    c4535c10.m5287m(4.0f);
                    c4535c10.m5288n(17.0f, 9.0f);
                    c4535c10.m5287m(-4.0f);
                    c4535c10.m5282h();
                    C17424d.m19121a(c17424d10, c4535c10.f14813Z, 0, c14341t10, null, 1.0f, 0, 2, 1.0f);
                    C17425e c17425eM19122b10 = c17424d10.m19122b();
                    AbstractC8488H2.f26310a = c17425eM19122b10;
                    c17425e2 = c17425eM19122b10;
                }
                AbstractC9739H3.m10328c(R.string.custom_instructions_start_title, c8410b10, c17425e2, null, ((C3949M0) c6021p.m6548k(c5984w0)).f12213a, c6021p, 48);
                if (z11) {
                    c6021p.m6524S(-512075106);
                    C8410b c8410b11 = AbstractC6200d.f20200c;
                    c17425e5 = AbstractC8553S2.f26382a;
                    if (c17425e5 != null) {
                        c17425e6 = c17425e5;
                    } else {
                        C17424d c17424d11 = new C17424d("Outlined.WorkOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i210 = AbstractC17418F.f55636a;
                        C14341T c14341t11 = new C14341T(C14365u.f45052b);
                        C4535c c4535c11 = new C4535c(3);
                        c4535c11.m5290p(14.0f, 6.0f);
                        c4535c11.m5288n(14.0f, 4.0f);
                        c4535c11.m5287m(-4.0f);
                        c4535c11.m5294t(2.0f);
                        c4535c11.m5287m(4.0f);
                        c4535c11.m5282h();
                        c4535c11.m5290p(4.0f, 8.0f);
                        c4535c11.m5294t(11.0f);
                        c4535c11.m5287m(16.0f);
                        c4535c11.m5288n(20.0f, 8.0f);
                        c4535c11.m5288n(4.0f, 8.0f);
                        c4535c11.m5282h();
                        c4535c11.m5290p(20.0f, 6.0f);
                        c4535c11.m5284j(1.11f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f);
                        c4535c11.m5294t(11.0f);
                        c4535c11.m5284j(0.0f, 1.11f, -0.89f, 2.0f, -2.0f, 2.0f);
                        c4535c11.m5288n(4.0f, 21.0f);
                        c4535c11.m5284j(-1.11f, 0.0f, -2.0f, -0.89f, -2.0f, -2.0f);
                        c4535c11.m5289o(0.01f, -11.0f);
                        c4535c11.m5284j(0.0f, -1.11f, 0.88f, -2.0f, 1.99f, -2.0f);
                        c4535c11.m5287m(4.0f);
                        c4535c11.m5288n(8.0f, 4.0f);
                        c4535c11.m5284j(0.0f, -1.11f, 0.89f, -2.0f, 2.0f, -2.0f);
                        c4535c11.m5287m(4.0f);
                        c4535c11.m5284j(1.11f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f);
                        c4535c11.m5294t(2.0f);
                        c4535c11.m5287m(4.0f);
                        c4535c11.m5282h();
                        C17424d.m19121a(c17424d11, c4535c11.f14813Z, 0, c14341t11, null, 1.0f, 0, 2, 1.0f);
                        C17425e c17425eM19122b11 = c17424d11.m19122b();
                        AbstractC8553S2.f26382a = c17425eM19122b11;
                        c17425e6 = c17425eM19122b11;
                    }
                    f11 = 1.0f;
                    AbstractC9739H3.m10328c(R.string.custom_instructions_business_title, c8410b11, c17425e6, null, ((C3949M0) c6021p.m6548k(c5984w0)).f12223f, c6021p, 48);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(-511566086);
                    C8410b c8410b12 = AbstractC6200d.f20201d;
                    c17425e3 = AbstractC8494I2.f26314a;
                    if (c17425e3 != null) {
                        c17425e4 = c17425e3;
                        f10 = 1.0f;
                    } else {
                        C17424d c17424d12 = new C17424d("Outlined.AutoGraph", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i211 = AbstractC17418F.f55636a;
                        C14341T c14341t12 = new C14341T(C14365u.f45052b);
                        C4535c c4535c12 = new C4535c(3);
                        c4535c12.m5290p(14.06f, 9.94f);
                        c4535c12.m5288n(12.0f, 9.0f);
                        c4535c12.m5289o(2.06f, -0.94f);
                        c4535c12.m5288n(15.0f, 6.0f);
                        c4535c12.m5289o(0.94f, 2.06f);
                        c4535c12.m5288n(18.0f, 9.0f);
                        c4535c12.m5289o(-2.06f, 0.94f);
                        c4535c12.m5288n(15.0f, 12.0f);
                        c4535c12.m5288n(14.06f, 9.94f);
                        c4535c12.m5282h();
                        c4535c12.m5290p(4.0f, 14.0f);
                        c4535c12.m5289o(0.94f, -2.06f);
                        c4535c12.m5288n(7.0f, 11.0f);
                        c4535c12.m5289o(-2.06f, -0.94f);
                        c4535c12.m5288n(4.0f, 8.0f);
                        c4535c12.m5289o(-0.94f, 2.06f);
                        f10 = 1.0f;
                        c4535c12.m5288n(1.0f, 11.0f);
                        c4535c12.m5289o(2.06f, 0.94f);
                        c4535c12.m5288n(4.0f, 14.0f);
                        c4535c12.m5282h();
                        c4535c12.m5290p(8.5f, 9.0f);
                        c4535c12.m5289o(1.09f, -2.41f);
                        c4535c12.m5288n(12.0f, 5.5f);
                        c4535c12.m5288n(9.59f, 4.41f);
                        c4535c12.m5288n(8.5f, 2.0f);
                        c4535c12.m5288n(7.41f, 4.41f);
                        c4535c12.m5288n(5.0f, 5.5f);
                        c4535c12.m5289o(2.41f, 1.09f);
                        c4535c12.m5288n(8.5f, 9.0f);
                        c4535c12.m5282h();
                        c4535c12.m5290p(4.5f, 20.5f);
                        c4535c12.m5289o(6.0f, -6.01f);
                        c4535c12.m5289o(4.0f, 4.0f);
                        c4535c12.m5288n(23.0f, 8.93f);
                        c4535c12.m5289o(-1.41f, -1.41f);
                        c4535c12.m5289o(-7.09f, 7.97f);
                        c4535c12.m5289o(-4.0f, -4.0f);
                        c4535c12.m5288n(3.0f, 19.0f);
                        c4535c12.m5288n(4.5f, 20.5f);
                        c4535c12.m5282h();
                        C17424d.m19121a(c17424d12, c4535c12.f14813Z, 0, c14341t12, null, 1.0f, 0, 2, 1.0f);
                        C17425e c17425eM19122b12 = c17424d12.m19122b();
                        AbstractC8494I2.f26314a = c17425eM19122b12;
                        c17425e4 = c17425eM19122b12;
                    }
                    f11 = f10;
                    AbstractC9739H3.m10328c(R.string.custom_instructions_performance_title, c8410b12, c17425e4, null, ((C3949M0) c6021p.m6548k(c5984w0)).f12223f, c6021p, 48);
                    c6021p.m6553p(false);
                }
                AbstractC17758g.m19482b(c6021p, c17794y4.m19544b(c10456n, true));
                AbstractC3984T1.m4685d(onDismiss, AbstractC10844c.m11244d(AbstractC10842a.m11237o(c10456n, 0.0f, AbstractC7313q.f23199d, 0.0f, 0.0f, 13), f11), false, null, null, null, null, null, null, AbstractC8411c.m8969c(-1368808236, c6021p, new C3991U3(str8, 2)), c6021p, (i16 & 14) | 805306368, 508);
                c6021p.m6553p(true);
                str4 = str8;
                interfaceC10459q4 = interfaceC10459q8;
                z10 = z11;
            } else {
                c6021p.m6519N();
                i15 = i10 & 1;
                c10456n = C10456n.f30959Y;
                if (i15 != 0) {
                    if (i18 != 0) {
                        interfaceC10459q2 = c10456n;
                    }
                    if ((i11 & 4) != 0) {
                        strM8676d = AbstractC8142m4.m8676d(R.string.custom_instructions_done, c6021p);
                        i12 &= -897;
                    } else {
                        strM8676d = str2;
                    }
                    if (i13 != 0) {
                        str3 = strM8676d;
                        i16 = i12;
                        interfaceC10459q3 = interfaceC10459q2;
                        z11 = false;
                    } else {
                        i16 = i12;
                        interfaceC10459q3 = interfaceC10459q2;
                        z11 = z10;
                        str3 = strM8676d;
                    }
                } else {
                    if (i18 != 0) {
                        interfaceC10459q2 = c10456n;
                    }
                    if ((i11 & 4) != 0) {
                        strM8676d = AbstractC8142m4.m8676d(R.string.custom_instructions_done, c6021p);
                        i12 &= -897;
                    } else {
                        strM8676d = str2;
                    }
                    if (i13 != 0) {
                        str3 = strM8676d;
                        i16 = i12;
                        interfaceC10459q3 = interfaceC10459q2;
                        z11 = false;
                    } else {
                        i16 = i12;
                        interfaceC10459q3 = interfaceC10459q2;
                        z11 = z10;
                        str3 = strM8676d;
                    }
                }
                c6021p.m6554q();
                InterfaceC10459q interfaceC10459qMo428M5 = interfaceC10459q3.mo428M(AbstractC10844c.f32512c);
                float f16 = AbstractC7313q.f23201f;
                InterfaceC10459q interfaceC10459qM9126g5 = AbstractC8479G.m9126g(AbstractC10842a.m11237o(AbstractC10842a.m11235m(interfaceC10459qMo428M5, f16, 0.0f, 2), 0.0f, 0.0f, 0.0f, f16, 7), AbstractC8479G.m9124e(c6021p), 14);
                C17756f c17756f5 = AbstractC17770m.f56724a;
                C17790w c17790wM19515a5 = AbstractC17788v.m19515a(AbstractC17770m.m19500g(AbstractC7313q.f23202g), C10444b.f30946y0, c6021p, 0);
                i17 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m5 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d5 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM9126g5);
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a5);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m5);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                } else {
                    AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d5);
                C17794y c17794y5 = C17794y.f56777a;
                String strM8676d10 = AbstractC8142m4.m8676d(R.string.custom_instructions_introduction_title, c6021p);
                C5984W0 c5984w5 = AbstractC3947L4.f12183a;
                AbstractC4124r4.m4768b(strM8676d10, null, 0L, 0L, null, C5609y.f18156s0, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(c5984w5)).f12146b, c6021p, 196608, 0, 65502);
                String strM8676d11 = AbstractC8142m4.m8676d(R.string.custom_instructions_introduction_description, c6021p);
                C3582M c3582m5 = ((C3941K4) c6021p.m6548k(c5984w5)).f12154j;
                c5984w0 = AbstractC3959O0.f12302a;
                String str9 = str3;
                AbstractC4124r4.m4768b(strM8676d11, null, ((C3949M0) c6021p.m6548k(c5984w0)).f12231m, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c3582m5, c6021p, 0, 0, 65530);
                C8410b c8410b13 = AbstractC6200d.f20199b;
                c17425e = AbstractC8488H2.f26310a;
                InterfaceC10459q interfaceC10459q9 = interfaceC10459q3;
                if (c17425e != null) {
                    c17425e2 = c17425e;
                    b = -1065353216;
                } else {
                    C17424d c17424d13 = new C17424d("Outlined.AddComment", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i212 = AbstractC17418F.f55636a;
                    C14341T c14341t13 = new C14341T(C14365u.f45052b);
                    C4535c c4535c13 = new C4535c(3);
                    c4535c13.m5290p(22.0f, 4.0f);
                    c4535c13.m5284j(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                    c4535c13.m5288n(4.0f, 2.0f);
                    c4535c13.m5284j(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                    c4535c13.m5294t(12.0f);
                    c4535c13.m5284j(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                    c4535c13.m5287m(14.0f);
                    c4535c13.m5289o(4.0f, 4.0f);
                    c4535c13.m5288n(22.0f, 4.0f);
                    c4535c13.m5282h();
                    c4535c13.m5290p(20.0f, 17.17f);
                    c4535c13.m5288n(18.83f, 16.0f);
                    c4535c13.m5288n(4.0f, 16.0f);
                    c4535c13.m5288n(4.0f, 4.0f);
                    c4535c13.m5287m(16.0f);
                    c4535c13.m5294t(13.17f);
                    c4535c13.m5282h();
                    c4535c13.m5290p(13.0f, 5.0f);
                    c4535c13.m5287m(-2.0f);
                    c4535c13.m5294t(4.0f);
                    c4535c13.m5288n(7.0f, 9.0f);
                    c4535c13.m5294t(2.0f);
                    c4535c13.m5287m(4.0f);
                    c4535c13.m5294t(4.0f);
                    c4535c13.m5287m(2.0f);
                    b = -1065353216;
                    c4535c13.m5294t(-4.0f);
                    c4535c13.m5287m(4.0f);
                    c4535c13.m5288n(17.0f, 9.0f);
                    c4535c13.m5287m(-4.0f);
                    c4535c13.m5282h();
                    C17424d.m19121a(c17424d13, c4535c13.f14813Z, 0, c14341t13, null, 1.0f, 0, 2, 1.0f);
                    C17425e c17425eM19122b13 = c17424d13.m19122b();
                    AbstractC8488H2.f26310a = c17425eM19122b13;
                    c17425e2 = c17425eM19122b13;
                }
                AbstractC9739H3.m10328c(R.string.custom_instructions_start_title, c8410b13, c17425e2, null, ((C3949M0) c6021p.m6548k(c5984w0)).f12213a, c6021p, 48);
                if (z11) {
                    c6021p.m6524S(-512075106);
                    C8410b c8410b14 = AbstractC6200d.f20200c;
                    c17425e5 = AbstractC8553S2.f26382a;
                    if (c17425e5 != null) {
                        c17425e6 = c17425e5;
                    } else {
                        C17424d c17424d14 = new C17424d("Outlined.WorkOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i213 = AbstractC17418F.f55636a;
                        C14341T c14341t14 = new C14341T(C14365u.f45052b);
                        C4535c c4535c14 = new C4535c(3);
                        c4535c14.m5290p(14.0f, 6.0f);
                        c4535c14.m5288n(14.0f, 4.0f);
                        c4535c14.m5287m(-4.0f);
                        c4535c14.m5294t(2.0f);
                        c4535c14.m5287m(4.0f);
                        c4535c14.m5282h();
                        c4535c14.m5290p(4.0f, 8.0f);
                        c4535c14.m5294t(11.0f);
                        c4535c14.m5287m(16.0f);
                        c4535c14.m5288n(20.0f, 8.0f);
                        c4535c14.m5288n(4.0f, 8.0f);
                        c4535c14.m5282h();
                        c4535c14.m5290p(20.0f, 6.0f);
                        c4535c14.m5284j(1.11f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f);
                        c4535c14.m5294t(11.0f);
                        c4535c14.m5284j(0.0f, 1.11f, -0.89f, 2.0f, -2.0f, 2.0f);
                        c4535c14.m5288n(4.0f, 21.0f);
                        c4535c14.m5284j(-1.11f, 0.0f, -2.0f, -0.89f, -2.0f, -2.0f);
                        c4535c14.m5289o(0.01f, -11.0f);
                        c4535c14.m5284j(0.0f, -1.11f, 0.88f, -2.0f, 1.99f, -2.0f);
                        c4535c14.m5287m(4.0f);
                        c4535c14.m5288n(8.0f, 4.0f);
                        c4535c14.m5284j(0.0f, -1.11f, 0.89f, -2.0f, 2.0f, -2.0f);
                        c4535c14.m5287m(4.0f);
                        c4535c14.m5284j(1.11f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f);
                        c4535c14.m5294t(2.0f);
                        c4535c14.m5287m(4.0f);
                        c4535c14.m5282h();
                        C17424d.m19121a(c17424d14, c4535c14.f14813Z, 0, c14341t14, null, 1.0f, 0, 2, 1.0f);
                        C17425e c17425eM19122b14 = c17424d14.m19122b();
                        AbstractC8553S2.f26382a = c17425eM19122b14;
                        c17425e6 = c17425eM19122b14;
                    }
                    f11 = 1.0f;
                    AbstractC9739H3.m10328c(R.string.custom_instructions_business_title, c8410b14, c17425e6, null, ((C3949M0) c6021p.m6548k(c5984w0)).f12223f, c6021p, 48);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(-511566086);
                    C8410b c8410b15 = AbstractC6200d.f20201d;
                    c17425e3 = AbstractC8494I2.f26314a;
                    if (c17425e3 != null) {
                        c17425e4 = c17425e3;
                        f10 = 1.0f;
                    } else {
                        C17424d c17424d15 = new C17424d("Outlined.AutoGraph", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i214 = AbstractC17418F.f55636a;
                        C14341T c14341t15 = new C14341T(C14365u.f45052b);
                        C4535c c4535c15 = new C4535c(3);
                        c4535c15.m5290p(14.06f, 9.94f);
                        c4535c15.m5288n(12.0f, 9.0f);
                        c4535c15.m5289o(2.06f, -0.94f);
                        c4535c15.m5288n(15.0f, 6.0f);
                        c4535c15.m5289o(0.94f, 2.06f);
                        c4535c15.m5288n(18.0f, 9.0f);
                        c4535c15.m5289o(-2.06f, 0.94f);
                        c4535c15.m5288n(15.0f, 12.0f);
                        c4535c15.m5288n(14.06f, 9.94f);
                        c4535c15.m5282h();
                        c4535c15.m5290p(4.0f, 14.0f);
                        c4535c15.m5289o(0.94f, -2.06f);
                        c4535c15.m5288n(7.0f, 11.0f);
                        c4535c15.m5289o(-2.06f, -0.94f);
                        c4535c15.m5288n(4.0f, 8.0f);
                        c4535c15.m5289o(-0.94f, 2.06f);
                        f10 = 1.0f;
                        c4535c15.m5288n(1.0f, 11.0f);
                        c4535c15.m5289o(2.06f, 0.94f);
                        c4535c15.m5288n(4.0f, 14.0f);
                        c4535c15.m5282h();
                        c4535c15.m5290p(8.5f, 9.0f);
                        c4535c15.m5289o(1.09f, -2.41f);
                        c4535c15.m5288n(12.0f, 5.5f);
                        c4535c15.m5288n(9.59f, 4.41f);
                        c4535c15.m5288n(8.5f, 2.0f);
                        c4535c15.m5288n(7.41f, 4.41f);
                        c4535c15.m5288n(5.0f, 5.5f);
                        c4535c15.m5289o(2.41f, 1.09f);
                        c4535c15.m5288n(8.5f, 9.0f);
                        c4535c15.m5282h();
                        c4535c15.m5290p(4.5f, 20.5f);
                        c4535c15.m5289o(6.0f, -6.01f);
                        c4535c15.m5289o(4.0f, 4.0f);
                        c4535c15.m5288n(23.0f, 8.93f);
                        c4535c15.m5289o(-1.41f, -1.41f);
                        c4535c15.m5289o(-7.09f, 7.97f);
                        c4535c15.m5289o(-4.0f, -4.0f);
                        c4535c15.m5288n(3.0f, 19.0f);
                        c4535c15.m5288n(4.5f, 20.5f);
                        c4535c15.m5282h();
                        C17424d.m19121a(c17424d15, c4535c15.f14813Z, 0, c14341t15, null, 1.0f, 0, 2, 1.0f);
                        C17425e c17425eM19122b15 = c17424d15.m19122b();
                        AbstractC8494I2.f26314a = c17425eM19122b15;
                        c17425e4 = c17425eM19122b15;
                    }
                    f11 = f10;
                    AbstractC9739H3.m10328c(R.string.custom_instructions_performance_title, c8410b15, c17425e4, null, ((C3949M0) c6021p.m6548k(c5984w0)).f12223f, c6021p, 48);
                    c6021p.m6553p(false);
                }
                AbstractC17758g.m19482b(c6021p, c17794y5.m19544b(c10456n, true));
                AbstractC3984T1.m4685d(onDismiss, AbstractC10844c.m11244d(AbstractC10842a.m11237o(c10456n, 0.0f, AbstractC7313q.f23199d, 0.0f, 0.0f, 13), f11), false, null, null, null, null, null, null, AbstractC8411c.m8969c(-1368808236, c6021p, new C3991U3(str9, 2)), c6021p, (i16 & 14) | 805306368, 508);
                c6021p.m6553p(true);
                str4 = str9;
                interfaceC10459q4 = interfaceC10459q9;
                z10 = z11;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C6218v(i10, i11, onDismiss, interfaceC10459q4, str4, z10);
            }
        }
        i12 |= 3072;
        z10 = z6;
        if ((i12 & 1171) == 1170) {
            c6021p.m6519N();
            i15 = i10 & 1;
            c10456n = C10456n.f30959Y;
            if (i15 != 0) {
                if (i18 != 0) {
                    interfaceC10459q2 = c10456n;
                }
                if ((i11 & 4) != 0) {
                    strM8676d = AbstractC8142m4.m8676d(R.string.custom_instructions_done, c6021p);
                    i12 &= -897;
                } else {
                    strM8676d = str2;
                }
                if (i13 != 0) {
                    str3 = strM8676d;
                    i16 = i12;
                    interfaceC10459q3 = interfaceC10459q2;
                    z11 = false;
                } else {
                    i16 = i12;
                    interfaceC10459q3 = interfaceC10459q2;
                    z11 = z10;
                    str3 = strM8676d;
                }
            } else {
                if (i18 != 0) {
                    interfaceC10459q2 = c10456n;
                }
                if ((i11 & 4) != 0) {
                    strM8676d = AbstractC8142m4.m8676d(R.string.custom_instructions_done, c6021p);
                    i12 &= -897;
                } else {
                    strM8676d = str2;
                }
                if (i13 != 0) {
                    str3 = strM8676d;
                    i16 = i12;
                    interfaceC10459q3 = interfaceC10459q2;
                    z11 = false;
                } else {
                    i16 = i12;
                    interfaceC10459q3 = interfaceC10459q2;
                    z11 = z10;
                    str3 = strM8676d;
                }
            }
            c6021p.m6554q();
            InterfaceC10459q interfaceC10459qMo428M6 = interfaceC10459q3.mo428M(AbstractC10844c.f32512c);
            float f17 = AbstractC7313q.f23201f;
            InterfaceC10459q interfaceC10459qM9126g6 = AbstractC8479G.m9126g(AbstractC10842a.m11237o(AbstractC10842a.m11235m(interfaceC10459qMo428M6, f17, 0.0f, 2), 0.0f, 0.0f, 0.0f, f17, 7), AbstractC8479G.m9124e(c6021p), 14);
            C17756f c17756f6 = AbstractC17770m.f56724a;
            C17790w c17790wM19515a6 = AbstractC17788v.m19515a(AbstractC17770m.m19500g(AbstractC7313q.f23202g), C10444b.f30946y0, c6021p, 0);
            i17 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m6 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d6 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM9126g6);
            InterfaceC21700k.f68875m0.getClass();
            c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a6);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m6);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
            } else {
                AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d6);
            C17794y c17794y6 = C17794y.f56777a;
            String strM8676d12 = AbstractC8142m4.m8676d(R.string.custom_instructions_introduction_title, c6021p);
            C5984W0 c5984w6 = AbstractC3947L4.f12183a;
            AbstractC4124r4.m4768b(strM8676d12, null, 0L, 0L, null, C5609y.f18156s0, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(c5984w6)).f12146b, c6021p, 196608, 0, 65502);
            String strM8676d13 = AbstractC8142m4.m8676d(R.string.custom_instructions_introduction_description, c6021p);
            C3582M c3582m6 = ((C3941K4) c6021p.m6548k(c5984w6)).f12154j;
            c5984w0 = AbstractC3959O0.f12302a;
            String str10 = str3;
            AbstractC4124r4.m4768b(strM8676d13, null, ((C3949M0) c6021p.m6548k(c5984w0)).f12231m, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c3582m6, c6021p, 0, 0, 65530);
            C8410b c8410b16 = AbstractC6200d.f20199b;
            c17425e = AbstractC8488H2.f26310a;
            InterfaceC10459q interfaceC10459q10 = interfaceC10459q3;
            if (c17425e != null) {
                c17425e2 = c17425e;
                b = -1065353216;
            } else {
                C17424d c17424d16 = new C17424d("Outlined.AddComment", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i215 = AbstractC17418F.f55636a;
                C14341T c14341t16 = new C14341T(C14365u.f45052b);
                C4535c c4535c16 = new C4535c(3);
                c4535c16.m5290p(22.0f, 4.0f);
                c4535c16.m5284j(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                c4535c16.m5288n(4.0f, 2.0f);
                c4535c16.m5284j(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                c4535c16.m5294t(12.0f);
                c4535c16.m5284j(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                c4535c16.m5287m(14.0f);
                c4535c16.m5289o(4.0f, 4.0f);
                c4535c16.m5288n(22.0f, 4.0f);
                c4535c16.m5282h();
                c4535c16.m5290p(20.0f, 17.17f);
                c4535c16.m5288n(18.83f, 16.0f);
                c4535c16.m5288n(4.0f, 16.0f);
                c4535c16.m5288n(4.0f, 4.0f);
                c4535c16.m5287m(16.0f);
                c4535c16.m5294t(13.17f);
                c4535c16.m5282h();
                c4535c16.m5290p(13.0f, 5.0f);
                c4535c16.m5287m(-2.0f);
                c4535c16.m5294t(4.0f);
                c4535c16.m5288n(7.0f, 9.0f);
                c4535c16.m5294t(2.0f);
                c4535c16.m5287m(4.0f);
                c4535c16.m5294t(4.0f);
                c4535c16.m5287m(2.0f);
                b = -1065353216;
                c4535c16.m5294t(-4.0f);
                c4535c16.m5287m(4.0f);
                c4535c16.m5288n(17.0f, 9.0f);
                c4535c16.m5287m(-4.0f);
                c4535c16.m5282h();
                C17424d.m19121a(c17424d16, c4535c16.f14813Z, 0, c14341t16, null, 1.0f, 0, 2, 1.0f);
                C17425e c17425eM19122b16 = c17424d16.m19122b();
                AbstractC8488H2.f26310a = c17425eM19122b16;
                c17425e2 = c17425eM19122b16;
            }
            AbstractC9739H3.m10328c(R.string.custom_instructions_start_title, c8410b16, c17425e2, null, ((C3949M0) c6021p.m6548k(c5984w0)).f12213a, c6021p, 48);
            if (z11) {
                c6021p.m6524S(-512075106);
                C8410b c8410b17 = AbstractC6200d.f20200c;
                c17425e5 = AbstractC8553S2.f26382a;
                if (c17425e5 != null) {
                    c17425e6 = c17425e5;
                } else {
                    C17424d c17424d17 = new C17424d("Outlined.WorkOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i216 = AbstractC17418F.f55636a;
                    C14341T c14341t17 = new C14341T(C14365u.f45052b);
                    C4535c c4535c17 = new C4535c(3);
                    c4535c17.m5290p(14.0f, 6.0f);
                    c4535c17.m5288n(14.0f, 4.0f);
                    c4535c17.m5287m(-4.0f);
                    c4535c17.m5294t(2.0f);
                    c4535c17.m5287m(4.0f);
                    c4535c17.m5282h();
                    c4535c17.m5290p(4.0f, 8.0f);
                    c4535c17.m5294t(11.0f);
                    c4535c17.m5287m(16.0f);
                    c4535c17.m5288n(20.0f, 8.0f);
                    c4535c17.m5288n(4.0f, 8.0f);
                    c4535c17.m5282h();
                    c4535c17.m5290p(20.0f, 6.0f);
                    c4535c17.m5284j(1.11f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f);
                    c4535c17.m5294t(11.0f);
                    c4535c17.m5284j(0.0f, 1.11f, -0.89f, 2.0f, -2.0f, 2.0f);
                    c4535c17.m5288n(4.0f, 21.0f);
                    c4535c17.m5284j(-1.11f, 0.0f, -2.0f, -0.89f, -2.0f, -2.0f);
                    c4535c17.m5289o(0.01f, -11.0f);
                    c4535c17.m5284j(0.0f, -1.11f, 0.88f, -2.0f, 1.99f, -2.0f);
                    c4535c17.m5287m(4.0f);
                    c4535c17.m5288n(8.0f, 4.0f);
                    c4535c17.m5284j(0.0f, -1.11f, 0.89f, -2.0f, 2.0f, -2.0f);
                    c4535c17.m5287m(4.0f);
                    c4535c17.m5284j(1.11f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f);
                    c4535c17.m5294t(2.0f);
                    c4535c17.m5287m(4.0f);
                    c4535c17.m5282h();
                    C17424d.m19121a(c17424d17, c4535c17.f14813Z, 0, c14341t17, null, 1.0f, 0, 2, 1.0f);
                    C17425e c17425eM19122b17 = c17424d17.m19122b();
                    AbstractC8553S2.f26382a = c17425eM19122b17;
                    c17425e6 = c17425eM19122b17;
                }
                f11 = 1.0f;
                AbstractC9739H3.m10328c(R.string.custom_instructions_business_title, c8410b17, c17425e6, null, ((C3949M0) c6021p.m6548k(c5984w0)).f12223f, c6021p, 48);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(-511566086);
                C8410b c8410b18 = AbstractC6200d.f20201d;
                c17425e3 = AbstractC8494I2.f26314a;
                if (c17425e3 != null) {
                    c17425e4 = c17425e3;
                    f10 = 1.0f;
                } else {
                    C17424d c17424d18 = new C17424d("Outlined.AutoGraph", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i217 = AbstractC17418F.f55636a;
                    C14341T c14341t18 = new C14341T(C14365u.f45052b);
                    C4535c c4535c18 = new C4535c(3);
                    c4535c18.m5290p(14.06f, 9.94f);
                    c4535c18.m5288n(12.0f, 9.0f);
                    c4535c18.m5289o(2.06f, -0.94f);
                    c4535c18.m5288n(15.0f, 6.0f);
                    c4535c18.m5289o(0.94f, 2.06f);
                    c4535c18.m5288n(18.0f, 9.0f);
                    c4535c18.m5289o(-2.06f, 0.94f);
                    c4535c18.m5288n(15.0f, 12.0f);
                    c4535c18.m5288n(14.06f, 9.94f);
                    c4535c18.m5282h();
                    c4535c18.m5290p(4.0f, 14.0f);
                    c4535c18.m5289o(0.94f, -2.06f);
                    c4535c18.m5288n(7.0f, 11.0f);
                    c4535c18.m5289o(-2.06f, -0.94f);
                    c4535c18.m5288n(4.0f, 8.0f);
                    c4535c18.m5289o(-0.94f, 2.06f);
                    f10 = 1.0f;
                    c4535c18.m5288n(1.0f, 11.0f);
                    c4535c18.m5289o(2.06f, 0.94f);
                    c4535c18.m5288n(4.0f, 14.0f);
                    c4535c18.m5282h();
                    c4535c18.m5290p(8.5f, 9.0f);
                    c4535c18.m5289o(1.09f, -2.41f);
                    c4535c18.m5288n(12.0f, 5.5f);
                    c4535c18.m5288n(9.59f, 4.41f);
                    c4535c18.m5288n(8.5f, 2.0f);
                    c4535c18.m5288n(7.41f, 4.41f);
                    c4535c18.m5288n(5.0f, 5.5f);
                    c4535c18.m5289o(2.41f, 1.09f);
                    c4535c18.m5288n(8.5f, 9.0f);
                    c4535c18.m5282h();
                    c4535c18.m5290p(4.5f, 20.5f);
                    c4535c18.m5289o(6.0f, -6.01f);
                    c4535c18.m5289o(4.0f, 4.0f);
                    c4535c18.m5288n(23.0f, 8.93f);
                    c4535c18.m5289o(-1.41f, -1.41f);
                    c4535c18.m5289o(-7.09f, 7.97f);
                    c4535c18.m5289o(-4.0f, -4.0f);
                    c4535c18.m5288n(3.0f, 19.0f);
                    c4535c18.m5288n(4.5f, 20.5f);
                    c4535c18.m5282h();
                    C17424d.m19121a(c17424d18, c4535c18.f14813Z, 0, c14341t18, null, 1.0f, 0, 2, 1.0f);
                    C17425e c17425eM19122b18 = c17424d18.m19122b();
                    AbstractC8494I2.f26314a = c17425eM19122b18;
                    c17425e4 = c17425eM19122b18;
                }
                f11 = f10;
                AbstractC9739H3.m10328c(R.string.custom_instructions_performance_title, c8410b18, c17425e4, null, ((C3949M0) c6021p.m6548k(c5984w0)).f12223f, c6021p, 48);
                c6021p.m6553p(false);
            }
            AbstractC17758g.m19482b(c6021p, c17794y6.m19544b(c10456n, true));
            AbstractC3984T1.m4685d(onDismiss, AbstractC10844c.m11244d(AbstractC10842a.m11237o(c10456n, 0.0f, AbstractC7313q.f23199d, 0.0f, 0.0f, 13), f11), false, null, null, null, null, null, null, AbstractC8411c.m8969c(-1368808236, c6021p, new C3991U3(str10, 2)), c6021p, (i16 & 14) | 805306368, 508);
            c6021p.m6553p(true);
            str4 = str10;
            interfaceC10459q4 = interfaceC10459q10;
            z10 = z11;
        } else {
            c6021p.m6519N();
            i15 = i10 & 1;
            c10456n = C10456n.f30959Y;
            if (i15 != 0) {
                if (i18 != 0) {
                    interfaceC10459q2 = c10456n;
                }
                if ((i11 & 4) != 0) {
                    strM8676d = AbstractC8142m4.m8676d(R.string.custom_instructions_done, c6021p);
                    i12 &= -897;
                } else {
                    strM8676d = str2;
                }
                if (i13 != 0) {
                    str3 = strM8676d;
                    i16 = i12;
                    interfaceC10459q3 = interfaceC10459q2;
                    z11 = false;
                } else {
                    i16 = i12;
                    interfaceC10459q3 = interfaceC10459q2;
                    z11 = z10;
                    str3 = strM8676d;
                }
            } else {
                if (i18 != 0) {
                    interfaceC10459q2 = c10456n;
                }
                if ((i11 & 4) != 0) {
                    strM8676d = AbstractC8142m4.m8676d(R.string.custom_instructions_done, c6021p);
                    i12 &= -897;
                } else {
                    strM8676d = str2;
                }
                if (i13 != 0) {
                    str3 = strM8676d;
                    i16 = i12;
                    interfaceC10459q3 = interfaceC10459q2;
                    z11 = false;
                } else {
                    i16 = i12;
                    interfaceC10459q3 = interfaceC10459q2;
                    z11 = z10;
                    str3 = strM8676d;
                }
            }
            c6021p.m6554q();
            InterfaceC10459q interfaceC10459qMo428M7 = interfaceC10459q3.mo428M(AbstractC10844c.f32512c);
            float f18 = AbstractC7313q.f23201f;
            InterfaceC10459q interfaceC10459qM9126g7 = AbstractC8479G.m9126g(AbstractC10842a.m11237o(AbstractC10842a.m11235m(interfaceC10459qMo428M7, f18, 0.0f, 2), 0.0f, 0.0f, 0.0f, f18, 7), AbstractC8479G.m9124e(c6021p), 14);
            C17756f c17756f7 = AbstractC17770m.f56724a;
            C17790w c17790wM19515a7 = AbstractC17788v.m19515a(AbstractC17770m.m19500g(AbstractC7313q.f23202g), C10444b.f30946y0, c6021p, 0);
            i17 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m7 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d7 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM9126g7);
            InterfaceC21700k.f68875m0.getClass();
            c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a7);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m7);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
            } else {
                AbstractC0168G.m537z(i17, c6021p, i17, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d7);
            C17794y c17794y7 = C17794y.f56777a;
            String strM8676d14 = AbstractC8142m4.m8676d(R.string.custom_instructions_introduction_title, c6021p);
            C5984W0 c5984w7 = AbstractC3947L4.f12183a;
            AbstractC4124r4.m4768b(strM8676d14, null, 0L, 0L, null, C5609y.f18156s0, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(c5984w7)).f12146b, c6021p, 196608, 0, 65502);
            String strM8676d15 = AbstractC8142m4.m8676d(R.string.custom_instructions_introduction_description, c6021p);
            C3582M c3582m7 = ((C3941K4) c6021p.m6548k(c5984w7)).f12154j;
            c5984w0 = AbstractC3959O0.f12302a;
            String str11 = str3;
            AbstractC4124r4.m4768b(strM8676d15, null, ((C3949M0) c6021p.m6548k(c5984w0)).f12231m, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c3582m7, c6021p, 0, 0, 65530);
            C8410b c8410b19 = AbstractC6200d.f20199b;
            c17425e = AbstractC8488H2.f26310a;
            InterfaceC10459q interfaceC10459q11 = interfaceC10459q3;
            if (c17425e != null) {
                c17425e2 = c17425e;
                b = -1065353216;
            } else {
                C17424d c17424d19 = new C17424d("Outlined.AddComment", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i218 = AbstractC17418F.f55636a;
                C14341T c14341t19 = new C14341T(C14365u.f45052b);
                C4535c c4535c19 = new C4535c(3);
                c4535c19.m5290p(22.0f, 4.0f);
                c4535c19.m5284j(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                c4535c19.m5288n(4.0f, 2.0f);
                c4535c19.m5284j(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                c4535c19.m5294t(12.0f);
                c4535c19.m5284j(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                c4535c19.m5287m(14.0f);
                c4535c19.m5289o(4.0f, 4.0f);
                c4535c19.m5288n(22.0f, 4.0f);
                c4535c19.m5282h();
                c4535c19.m5290p(20.0f, 17.17f);
                c4535c19.m5288n(18.83f, 16.0f);
                c4535c19.m5288n(4.0f, 16.0f);
                c4535c19.m5288n(4.0f, 4.0f);
                c4535c19.m5287m(16.0f);
                c4535c19.m5294t(13.17f);
                c4535c19.m5282h();
                c4535c19.m5290p(13.0f, 5.0f);
                c4535c19.m5287m(-2.0f);
                c4535c19.m5294t(4.0f);
                c4535c19.m5288n(7.0f, 9.0f);
                c4535c19.m5294t(2.0f);
                c4535c19.m5287m(4.0f);
                c4535c19.m5294t(4.0f);
                c4535c19.m5287m(2.0f);
                b = -1065353216;
                c4535c19.m5294t(-4.0f);
                c4535c19.m5287m(4.0f);
                c4535c19.m5288n(17.0f, 9.0f);
                c4535c19.m5287m(-4.0f);
                c4535c19.m5282h();
                C17424d.m19121a(c17424d19, c4535c19.f14813Z, 0, c14341t19, null, 1.0f, 0, 2, 1.0f);
                C17425e c17425eM19122b19 = c17424d19.m19122b();
                AbstractC8488H2.f26310a = c17425eM19122b19;
                c17425e2 = c17425eM19122b19;
            }
            AbstractC9739H3.m10328c(R.string.custom_instructions_start_title, c8410b19, c17425e2, null, ((C3949M0) c6021p.m6548k(c5984w0)).f12213a, c6021p, 48);
            if (z11) {
                c6021p.m6524S(-512075106);
                C8410b c8410b110 = AbstractC6200d.f20200c;
                c17425e5 = AbstractC8553S2.f26382a;
                if (c17425e5 != null) {
                    c17425e6 = c17425e5;
                } else {
                    C17424d c17424d110 = new C17424d("Outlined.WorkOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i219 = AbstractC17418F.f55636a;
                    C14341T c14341t110 = new C14341T(C14365u.f45052b);
                    C4535c c4535c110 = new C4535c(3);
                    c4535c110.m5290p(14.0f, 6.0f);
                    c4535c110.m5288n(14.0f, 4.0f);
                    c4535c110.m5287m(-4.0f);
                    c4535c110.m5294t(2.0f);
                    c4535c110.m5287m(4.0f);
                    c4535c110.m5282h();
                    c4535c110.m5290p(4.0f, 8.0f);
                    c4535c110.m5294t(11.0f);
                    c4535c110.m5287m(16.0f);
                    c4535c110.m5288n(20.0f, 8.0f);
                    c4535c110.m5288n(4.0f, 8.0f);
                    c4535c110.m5282h();
                    c4535c110.m5290p(20.0f, 6.0f);
                    c4535c110.m5284j(1.11f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f);
                    c4535c110.m5294t(11.0f);
                    c4535c110.m5284j(0.0f, 1.11f, -0.89f, 2.0f, -2.0f, 2.0f);
                    c4535c110.m5288n(4.0f, 21.0f);
                    c4535c110.m5284j(-1.11f, 0.0f, -2.0f, -0.89f, -2.0f, -2.0f);
                    c4535c110.m5289o(0.01f, -11.0f);
                    c4535c110.m5284j(0.0f, -1.11f, 0.88f, -2.0f, 1.99f, -2.0f);
                    c4535c110.m5287m(4.0f);
                    c4535c110.m5288n(8.0f, 4.0f);
                    c4535c110.m5284j(0.0f, -1.11f, 0.89f, -2.0f, 2.0f, -2.0f);
                    c4535c110.m5287m(4.0f);
                    c4535c110.m5284j(1.11f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f);
                    c4535c110.m5294t(2.0f);
                    c4535c110.m5287m(4.0f);
                    c4535c110.m5282h();
                    C17424d.m19121a(c17424d110, c4535c110.f14813Z, 0, c14341t110, null, 1.0f, 0, 2, 1.0f);
                    C17425e c17425eM19122b110 = c17424d110.m19122b();
                    AbstractC8553S2.f26382a = c17425eM19122b110;
                    c17425e6 = c17425eM19122b110;
                }
                f11 = 1.0f;
                AbstractC9739H3.m10328c(R.string.custom_instructions_business_title, c8410b110, c17425e6, null, ((C3949M0) c6021p.m6548k(c5984w0)).f12223f, c6021p, 48);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(-511566086);
                C8410b c8410b111 = AbstractC6200d.f20201d;
                c17425e3 = AbstractC8494I2.f26314a;
                if (c17425e3 != null) {
                    c17425e4 = c17425e3;
                    f10 = 1.0f;
                } else {
                    C17424d c17424d111 = new C17424d("Outlined.AutoGraph", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i2110 = AbstractC17418F.f55636a;
                    C14341T c14341t111 = new C14341T(C14365u.f45052b);
                    C4535c c4535c111 = new C4535c(3);
                    c4535c111.m5290p(14.06f, 9.94f);
                    c4535c111.m5288n(12.0f, 9.0f);
                    c4535c111.m5289o(2.06f, -0.94f);
                    c4535c111.m5288n(15.0f, 6.0f);
                    c4535c111.m5289o(0.94f, 2.06f);
                    c4535c111.m5288n(18.0f, 9.0f);
                    c4535c111.m5289o(-2.06f, 0.94f);
                    c4535c111.m5288n(15.0f, 12.0f);
                    c4535c111.m5288n(14.06f, 9.94f);
                    c4535c111.m5282h();
                    c4535c111.m5290p(4.0f, 14.0f);
                    c4535c111.m5289o(0.94f, -2.06f);
                    c4535c111.m5288n(7.0f, 11.0f);
                    c4535c111.m5289o(-2.06f, -0.94f);
                    c4535c111.m5288n(4.0f, 8.0f);
                    c4535c111.m5289o(-0.94f, 2.06f);
                    f10 = 1.0f;
                    c4535c111.m5288n(1.0f, 11.0f);
                    c4535c111.m5289o(2.06f, 0.94f);
                    c4535c111.m5288n(4.0f, 14.0f);
                    c4535c111.m5282h();
                    c4535c111.m5290p(8.5f, 9.0f);
                    c4535c111.m5289o(1.09f, -2.41f);
                    c4535c111.m5288n(12.0f, 5.5f);
                    c4535c111.m5288n(9.59f, 4.41f);
                    c4535c111.m5288n(8.5f, 2.0f);
                    c4535c111.m5288n(7.41f, 4.41f);
                    c4535c111.m5288n(5.0f, 5.5f);
                    c4535c111.m5289o(2.41f, 1.09f);
                    c4535c111.m5288n(8.5f, 9.0f);
                    c4535c111.m5282h();
                    c4535c111.m5290p(4.5f, 20.5f);
                    c4535c111.m5289o(6.0f, -6.01f);
                    c4535c111.m5289o(4.0f, 4.0f);
                    c4535c111.m5288n(23.0f, 8.93f);
                    c4535c111.m5289o(-1.41f, -1.41f);
                    c4535c111.m5289o(-7.09f, 7.97f);
                    c4535c111.m5289o(-4.0f, -4.0f);
                    c4535c111.m5288n(3.0f, 19.0f);
                    c4535c111.m5288n(4.5f, 20.5f);
                    c4535c111.m5282h();
                    C17424d.m19121a(c17424d111, c4535c111.f14813Z, 0, c14341t111, null, 1.0f, 0, 2, 1.0f);
                    C17425e c17425eM19122b111 = c17424d111.m19122b();
                    AbstractC8494I2.f26314a = c17425eM19122b111;
                    c17425e4 = c17425eM19122b111;
                }
                f11 = f10;
                AbstractC9739H3.m10328c(R.string.custom_instructions_performance_title, c8410b111, c17425e4, null, ((C3949M0) c6021p.m6548k(c5984w0)).f12223f, c6021p, 48);
                c6021p.m6553p(false);
            }
            AbstractC17758g.m19482b(c6021p, c17794y7.m19544b(c10456n, true));
            AbstractC3984T1.m4685d(onDismiss, AbstractC10844c.m11244d(AbstractC10842a.m11237o(c10456n, 0.0f, AbstractC7313q.f23199d, 0.0f, 0.0f, 13), f11), false, null, null, null, null, null, null, AbstractC8411c.m8969c(-1368808236, c6021p, new C3991U3(str11, 2)), c6021p, (i16 & 14) | 805306368, 508);
            c6021p.m6553p(true);
            str4 = str11;
            interfaceC10459q4 = interfaceC10459q11;
            z10 = z11;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6218v(i10, i11, onDismiss, interfaceC10459q4, str4, z10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9196c(InterfaceC10459q interfaceC10459q, CustomInstructionsIntroductionViewModel customInstructionsIntroductionViewModel, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        int i11;
        InterfaceC10459q interfaceC10459q2;
        CustomInstructionsIntroductionViewModel customInstructionsIntroductionViewModel2;
        c6021p.m6526U(392141514);
        int i12 = i10 | 6;
        if ((i10 & 48) == 0) {
            i12 = i10 | 22;
        }
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
            customInstructionsIntroductionViewModel2 = customInstructionsIntroductionViewModel;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) == 0 || c6021p.m6561x()) {
                C10456n c10456n = C10456n.f30959Y;
                c6021p.m6524S(-1020152108);
                Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C6219w.class));
                } else {
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    interfaceC2062k = null;
                }
                c6021p.m6553p(false);
                LocalViewModelStoreOwner.f33491a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
                if (viewModelStoreOwnerM12165a == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                C16527D c16527d = AbstractC16526C.f51263a;
                Object objMo5693b = c16527d.mo5693b(CustomInstructionsIntroductionViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C6219w.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == C6013l.f19514a) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C6219w.class), c16527d.mo5693b(CustomInstructionsIntroductionViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(CustomInstructionsIntroductionViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                i11 = i12 & (-113);
                interfaceC10459q2 = c10456n;
                customInstructionsIntroductionViewModel2 = (CustomInstructionsIntroductionViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
                i11 = i12 & (-113);
                interfaceC10459q2 = interfaceC10459q;
                customInstructionsIntroductionViewModel2 = customInstructionsIntroductionViewModel;
            }
            c6021p.m6554q();
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            int i13 = (i11 & 14) | 199680;
            AbstractC8662k3.m9350a(interfaceC10459q2, null, 0L, AbstractC8411c.m8969c(73482561, c6021p, new C4334d(c8870f, 6)), false, AbstractC8411c.m8969c(1421779974, c6021p, new C0885s(c8870f, 9, customInstructionsIntroductionViewModel2)), c6021p, i13, 22);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0257i0(interfaceC10459q2, customInstructionsIntroductionViewModel2, i10, 27);
        }
    }

    /* JADX INFO: renamed from: d */
    public static synchronized C8520M4 m9197d(C8502J4 c8502j4) {
        try {
            if (f26358a == null) {
                f26358a = new C7588r(2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (C8520M4) f26358a.m4539y(c8502j4);
    }
}

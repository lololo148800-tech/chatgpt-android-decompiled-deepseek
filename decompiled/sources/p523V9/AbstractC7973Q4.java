package p523V9;

import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.net.Uri;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import com.openai.chatgpt.R;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p000.C16280k;
import p1113xn.AbstractC21329w;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p1155zi.C21902C2;
import p1155zi.EnumC22033m2;
import p124Ei.C2441A0;
import p124Ei.C2532n1;
import p124Ei.C2551x;
import p148Fi.AbstractC2805a1;
import p148Fi.AbstractC2829i1;
import p148Fi.C2800Y0;
import p148Fi.C2808b1;
import p148Fi.C2811c1;
import p148Fi.C2814d1;
import p148Fi.C2823g1;
import p148Fi.C2826h1;
import p229J0.AbstractC4124r4;
import p349O0.C6018n0;
import p349O0.C6021p;
import p382Pf.C6401d;
import p502Uc.AbstractC7625i;
import p537W0.AbstractC8411c;
import p571X9.AbstractC9393x3;
import p594Y9.AbstractC9818V;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p705dd.EnumC13068a;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: V9.Q4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7973Q4 {
    /* JADX INFO: renamed from: a */
    public static final void m8271a(EnumC13068a enumC13068a, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(-605858429);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(enumC13068a) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (((i11 | 48) & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            AbstractC4124r4.m4768b(AbstractC21329w.m21729p(enumC13068a.f41515Y, Separators.f31991SP), AbstractC9818V.m10458b(c10456n, true, false, 0.0f, 14), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131068);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6401d(enumC13068a, interfaceC10459q2, i10, 12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8272b(C2532n1 c2532n1, InterfaceC10459q interfaceC10459q, long j10, C6021p c6021p, int i10) {
        int i11;
        C2551x c2551x;
        c6021p.m6526U(-352275159);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c2532n1) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6540e(j10) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(-399720594);
            AbstractC2829i1 abstractC2829i1 = c2532n1.f7895b;
            C21902C2 c21902c2 = c2532n1.f7897d;
            if ((c21902c2 == null || c21902c2.f69436a != EnumC22033m2.Standard) && !(abstractC2829i1 instanceof AbstractC2805a1)) {
                c2551x = new C2551x(AbstractC9393x3.m9974d(""));
            } else {
                Resources resources = ((Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b)).getResources();
                AbstractC16544l.m18093f(resources, "getResources(...)");
                if (c2532n1.f7906m) {
                    c2551x = new C2551x(AbstractC9393x3.m9974d(resources.getString(R.string.voice_state_hint_voice_indicator_pressed)));
                } else if (AbstractC16544l.m18089b(abstractC2829i1, C2800Y0.f8529a)) {
                    c2551x = new C2551x(AbstractC9393x3.m9974d(resources.getString(R.string.voice_state_hint_failed_to_connect)));
                } else if (AbstractC16544l.m18089b(abstractC2829i1, C2814d1.f8542a)) {
                    List listM19382k = AbstractC17681o.m19382k(resources.getString(R.string.voice_state_hint_listening), resources.getString(R.string.voice_state_hint_listening_2));
                    C21554a c21554a = C21555b.f68260Z;
                    EnumC21557d enumC21557d = EnumC21557d.SECONDS;
                    c2551x = new C2551x(listM19382k, AbstractC8128k6.m8644j(3, enumC21557d), AbstractC8128k6.m8644j(6, enumC21557d));
                } else if (AbstractC16544l.m18089b(abstractC2829i1, C2811c1.f8539a)) {
                    List listM19382k2 = AbstractC17681o.m19382k(resources.getString(R.string.voice_state_hint_listening_intently), resources.getString(R.string.voice_state_hint_listening_intently_2), resources.getString(R.string.voice_state_hint_listening_intently_3));
                    C21554a c21554a2 = C21555b.f68260Z;
                    EnumC21557d enumC21557d2 = EnumC21557d.SECONDS;
                    c2551x = new C2551x(listM19382k2, AbstractC8128k6.m8644j(3, enumC21557d2), AbstractC8128k6.m8644j(3, enumC21557d2));
                } else if (AbstractC16544l.m18089b(abstractC2829i1, C2826h1.f8565a)) {
                    c2551x = new C2551x(AbstractC9393x3.m9974d(resources.getString(R.string.voice_state_hint_thinking)));
                } else if (AbstractC16544l.m18089b(abstractC2829i1, C2823g1.f8561a)) {
                    c2551x = new C2551x(AbstractC9393x3.m9974d(resources.getString(R.string.voice_state_hint_speaking)));
                } else {
                    c2551x = AbstractC16544l.m18089b(abstractC2829i1, C2808b1.f8535a) ? new C2551x(AbstractC9393x3.m9974d(resources.getString(R.string.voice_state_hint_halted))) : new C2551x(AbstractC9393x3.m9974d(""));
                }
            }
            c6021p.m6553p(false);
            AbstractC7625i.m7963a(c2551x.f7965a, false, c2551x.f7966b, c2551x.f7967c, AbstractC8411c.m8969c(34698760, c6021p, new C16280k(interfaceC10459q, j10, 1)), c6021p, 24576, 2);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2441A0(c2532n1, interfaceC10459q, j10, i10, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final File m8273c(Uri uri) {
        if (!AbstractC16544l.m18089b(uri.getScheme(), "file")) {
            throw new IllegalArgumentException(("Uri lacks 'file' scheme: " + uri).toString());
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        throw new IllegalArgumentException(("Uri path is null: " + uri).toString());
    }
}

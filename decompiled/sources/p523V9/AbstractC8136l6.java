package p523V9;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p003A1.AbstractC0168G;
import p1135yn.EnumC21557d;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p193Hf.AbstractC3348a1;
import p193Hf.C3368h0;
import p193Hf.C3371i0;
import p193Hf.C3374j0;
import p228J.AbstractC3794B0;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4025b1;
import p229J0.C3949M0;
import p349O0.C5997d;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7313q;
import p537W0.AbstractC8411c;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10450h;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.C17756f;
import p911o0.C17781r0;

/* JADX INFO: renamed from: V9.l6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8136l6 {
    /* JADX INFO: renamed from: a */
    public static final void m8660a(String str, boolean z6, boolean z10, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(1852587269);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6544g(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            Locale localeM8334g = AbstractC8012V5.m8334g((Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b));
            C10450h c10450h = C10444b.f30944w0;
            C17756f c17756f = AbstractC17770m.f56724a;
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(AbstractC7313q.f23199d), c10450h, c6021p, 48);
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            C5997d.m6440a(AbstractC3794B0.m4494s(((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s, AbstractC4025b1.f12649a), AbstractC8411c.m8969c(1453548129, c6021p, new C3368h0(str, localeM8334g, z6, z10)), c6021p, 56);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3371i0(str, z6, z10, interfaceC10459q, i10, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8661b(boolean z6, boolean z10, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-45615820);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z10) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC8223w5.m8850b(new C17309l(Boolean.valueOf(z10), Boolean.valueOf(z6)), null, null, null, "Canmore icon", null, AbstractC3348a1.f10234a, c6021p, 1597440, 46);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3374j0(i10, z6, z10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final double m8662c(double d10, EnumC21557d sourceUnit, EnumC21557d targetUnit) {
        AbstractC16544l.m18094g(sourceUnit, "sourceUnit");
        AbstractC16544l.m18094g(targetUnit, "targetUnit");
        TimeUnit timeUnit = targetUnit.f68272Y;
        TimeUnit timeUnit2 = sourceUnit.f68272Y;
        long jConvert = timeUnit.convert(1L, timeUnit2);
        return jConvert > 0 ? d10 * jConvert : d10 / timeUnit2.convert(1L, timeUnit);
    }

    /* JADX INFO: renamed from: d */
    public static final long m8663d(long j10, EnumC21557d sourceUnit, EnumC21557d targetUnit) {
        AbstractC16544l.m18094g(sourceUnit, "sourceUnit");
        AbstractC16544l.m18094g(targetUnit, "targetUnit");
        return targetUnit.f68272Y.convert(j10, sourceUnit.f68272Y);
    }

    /* JADX INFO: renamed from: e */
    public static final long m8664e(long j10, EnumC21557d sourceUnit, EnumC21557d targetUnit) {
        AbstractC16544l.m18094g(sourceUnit, "sourceUnit");
        AbstractC16544l.m18094g(targetUnit, "targetUnit");
        return targetUnit.f68272Y.convert(j10, sourceUnit.f68272Y);
    }

    /* JADX INFO: renamed from: f */
    public static final Bundle m8665f(String serverClientId, String str) {
        AbstractC16544l.m18094g(serverClientId, "serverClientId");
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_SERVER_CLIENT_ID", serverClientId);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_NONCE", str);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FILTER_BY_AUTHORIZED_ACCOUNTS", false);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_LINKED_SERVICE_ID", null);
        bundle.putStringArrayList("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN_DEPOSITION_SCOPES", null);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_REQUEST_VERIFIED_PHONE_NUMBER", false);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_AUTO_SELECT_ENABLED", false);
        return bundle;
    }
}

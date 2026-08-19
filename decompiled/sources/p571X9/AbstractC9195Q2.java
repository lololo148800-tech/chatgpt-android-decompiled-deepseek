package p571X9;

import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import p102Dm.AbstractC2119a;
import p371P1.AbstractC6308d;
import p371P1.C6306b;
import p416R1.C6788a;
import p492U1.C7548m;
import p492U1.C7549n;
import p492U1.InterfaceC7537b;
import p774h1.AbstractC14334L;

/* JADX INFO: renamed from: X9.Q2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9195Q2 {
    /* JADX INFO: renamed from: a */
    public static final float m9755a(long j10, float f10, InterfaceC7537b interfaceC7537b) {
        float fM7895c;
        long jM7894b = C7548m.m7894b(j10);
        if (C7549n.m7898a(jM7894b, 4294967296L)) {
            if (interfaceC7537b.mo7863X() <= 1.05d) {
                return interfaceC7537b.mo7869t0(j10);
            }
            fM7895c = C7548m.m7895c(j10) / C7548m.m7895c(interfaceC7537b.mo7860J(f10));
        } else {
            if (!C7549n.m7898a(jM7894b, 8589934592L)) {
                return Float.NaN;
            }
            fM7895c = C7548m.m7895c(j10);
        }
        return fM7895c * f10;
    }

    /* JADX INFO: renamed from: b */
    public static final void m9756b(Spannable spannable, long j10, int i10, int i11) {
        if (j10 != 16) {
            spannable.setSpan(new ForegroundColorSpan(AbstractC14334L.m15617F(j10)), i10, i11, 33);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9757c(Spannable spannable, long j10, InterfaceC7537b interfaceC7537b, int i10, int i11) {
        long jM7894b = C7548m.m7894b(j10);
        if (C7549n.m7898a(jM7894b, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(AbstractC2119a.m3195i(interfaceC7537b.mo7869t0(j10)), false), i10, i11, 33);
        } else if (C7549n.m7898a(jM7894b, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(C7548m.m7895c(j10)), i10, i11, 33);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m9758d(Spannable spannable, C6306b c6306b, int i10, int i11) {
        Object localeSpan;
        if (c6306b != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                localeSpan = C6788a.f21793a.m7231a(c6306b);
            } else {
                localeSpan = new LocaleSpan((c6306b.f20438Y.isEmpty() ? AbstractC6308d.f20440a.mo5855i().m6852f() : c6306b.m6852f()).f20436a);
            }
            spannable.setSpan(localeSpan, i10, i11, 33);
        }
    }
}

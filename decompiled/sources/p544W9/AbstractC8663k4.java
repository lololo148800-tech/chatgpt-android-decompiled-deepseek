package p544W9;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.openai.voice.webrtc.VoiceModeForegroundService;
import io.sentry.AbstractC15152P0;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;
import p341Ni.EnumC5802v;
import p523V9.AbstractC7966P5;
import p523V9.AbstractC8160o6;
import p857kl.AbstractC16455c;
import p857kl.C16445L;
import p857kl.C16446M;
import p857kl.C16471s;
import p857kl.C16475w;
import p857kl.InterfaceC16443J;
import p909nm.C17689w;
import p913o2.AbstractC17801b;

/* JADX INFO: renamed from: W9.k4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8663k4 {
    /* JADX INFO: renamed from: a */
    public static final void m9355a(C16445L c16445l, String str, int i10, int i11, int i12, boolean z6) {
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        if (i11 == -1) {
            int iM9359e = m9359e(i10, i12, str);
            int iM9358d = m9358d(iM9359e, i12, str);
            if (iM9358d > iM9359e) {
                if (z6) {
                    strSubstring3 = AbstractC16455c.m18031d(str, iM9359e, iM9358d, false, 12);
                } else {
                    strSubstring3 = str.substring(iM9359e, iM9358d);
                    AbstractC16544l.m18093f(strSubstring3, "substring(...)");
                }
                c16445l.mo4533m(strSubstring3, C17689w.f56480Y);
                return;
            }
            return;
        }
        int iM9359e2 = m9359e(i10, i11, str);
        int iM9358d2 = m9358d(iM9359e2, i11, str);
        if (iM9358d2 > iM9359e2) {
            if (z6) {
                strSubstring = AbstractC16455c.m18031d(str, iM9359e2, iM9358d2, false, 12);
            } else {
                strSubstring = str.substring(iM9359e2, iM9358d2);
                AbstractC16544l.m18093f(strSubstring, "substring(...)");
            }
            int iM9359e3 = m9359e(i11 + 1, i12, str);
            int iM9358d3 = m9358d(iM9359e3, i12, str);
            if (z6) {
                strSubstring2 = AbstractC16455c.m18031d(str, iM9359e3, iM9358d3, true, 8);
            } else {
                strSubstring2 = str.substring(iM9359e3, iM9358d3);
                AbstractC16544l.m18093f(strSubstring2, "substring(...)");
            }
            c16445l.m4529e(strSubstring, strSubstring2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC16443J m9356b(String query) {
        int i10;
        AbstractC16544l.m18094g(query, "query");
        if (AbstractC21322p.m21674H(query) < 0) {
            InterfaceC16443J.f51016b.getClass();
            return C16471s.f51108c;
        }
        C16475w c16475w = InterfaceC16443J.f51016b;
        C16445L c16445lM9346b = AbstractC8657j4.m9346b();
        int iM21674H = AbstractC21322p.m21674H(query);
        int i11 = 0;
        int i12 = 0;
        if (iM21674H >= 0) {
            int i13 = 0;
            int i14 = 0;
            i10 = -1;
            while (true) {
                if (i13 != 1000) {
                    char cCharAt = query.charAt(i14);
                    if (cCharAt == '&') {
                        m9355a(c16445lM9346b, query, i12, i10, i14, false);
                        i12 = i14 + 1;
                        i13++;
                        i10 = -1;
                    } else if (cCharAt == '=' && i10 == -1) {
                        i10 = i14;
                    }
                    if (i14 == iM21674H) {
                        i11 = i13;
                        break;
                    }
                    i14++;
                }
                Map values = (Map) c16445lM9346b.f11539Z;
                AbstractC16544l.m18094g(values, "values");
                return new C16446M(values);
            }
        }
        i10 = -1;
        if (i11 != 1000) {
            m9355a(c16445lM9346b, query, i12, i10, query.length(), false);
        }
        Map values2 = (Map) c16445lM9346b.f11539Z;
        AbstractC16544l.m18094g(values2, "values");
        return new C16446M(values2);
    }

    /* JADX INFO: renamed from: c */
    public static void m9357c(Context context, EnumC5802v enumC5802v) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC15152P0.m16327a("VoiceModeForegroundService.startForegroundService");
        try {
            Intent intentPutExtra = new Intent(context, (Class<?>) VoiceModeForegroundService.class).putExtra("start_time", System.currentTimeMillis()).putExtra("mode", enumC5802v);
            AbstractC16544l.m18093f(intentPutExtra, "putExtra(...)");
            if (Build.VERSION.SDK_INT >= 26) {
                AbstractC17801b.m19552c(context, intentPutExtra);
            } else {
                context.startService(intentPutExtra);
            }
        } catch (IllegalStateException e10) {
            AbstractC8160o6.m8731f(VoiceModeForegroundService.f40396o0, "Failed to start foreground service", e10, null, 4);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final int m9358d(int i10, int i11, String str) {
        while (i11 > i10 && AbstractC7966P5.m8258f(str.charAt(i11 - 1))) {
            i11--;
        }
        return i11;
    }

    /* JADX INFO: renamed from: e */
    public static final int m9359e(int i10, int i11, String str) {
        while (i10 < i11 && AbstractC7966P5.m8258f(str.charAt(i10))) {
            i10++;
        }
        return i10;
    }
}

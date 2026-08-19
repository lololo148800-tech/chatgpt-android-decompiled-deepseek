package p265Kb;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import io.sentry.android.core.AbstractC15256t;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p1045ul.AbstractC20384a;
import p1045ul.C20387d;
import p1045ul.C20388e;
import p1045ul.EnumC20389f;
import p214Ib.C3674q;
import p571X9.AbstractC9306j0;
import p615Z6.C10252z0;

/* JADX INFO: renamed from: Kb.f */
/* JADX INFO: loaded from: classes.dex */
public final class C4613f implements InterfaceC4623p {

    /* JADX INFO: renamed from: Y */
    public String f15035Y;

    public C4613f(String serverUrl, int i10) {
        switch (i10) {
            case 1:
                this.f15035Y = AbstractC0168G.m532u("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat(serverUrl);
                return;
            case 2:
            default:
                this.f15035Y = serverUrl;
                return;
            case 3:
                AbstractC16544l.m18094g(serverUrl, "serverUrl");
                this.f15035Y = serverUrl;
                return;
            case 4:
                AbstractC16544l.m18094g(serverUrl, "pattern");
                this.f15035Y = serverUrl;
                if (serverUrl.length() <= 0) {
                    throw new IllegalStateException("Date parser pattern shouldn't be empty.");
                }
                return;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m5357a(C10252z0 c10252z0, char c9, String str) {
        Object next;
        if (c9 != '*') {
            if (c9 == 'M') {
                EnumC20389f.f64481Z.getClass();
                Iterator it = EnumC20389f.f64483p0.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((EnumC20389f) next).f64484Y.equals(str));
                EnumC20389f enumC20389f = (EnumC20389f) next;
                if (enumC20389f == null) {
                    throw new IllegalStateException("Invalid month: ".concat(str).toString());
                }
                c10252z0.f30458q0 = enumC20389f;
                return;
            }
            if (c9 == 'Y') {
                c10252z0.f30459r0 = Integer.valueOf(Integer.parseInt(str));
                return;
            }
            if (c9 == 'd') {
                c10252z0.f30457p0 = Integer.valueOf(Integer.parseInt(str));
                return;
            }
            if (c9 == 'h') {
                c10252z0.f30456o0 = Integer.valueOf(Integer.parseInt(str));
                return;
            }
            if (c9 == 'm') {
                c10252z0.f30455Z = Integer.valueOf(Integer.parseInt(str));
                return;
            }
            if (c9 == 's') {
                c10252z0.f30454Y = Integer.valueOf(Integer.parseInt(str));
                return;
            }
            if (c9 == 'z') {
                if (!str.equals("GMT")) {
                    throw new IllegalStateException("Check failed.");
                }
                return;
            }
            for (int i10 = 0; i10 < str.length(); i10++) {
                if (str.charAt(i10) != c9) {
                    throw new IllegalStateException("Check failed.");
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m5358e(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e10) {
                AbstractC15256t.m16466d("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e10);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return AbstractC9306j0.m9890i(str, " : ", str2);
    }

    @Override // p265Kb.InterfaceC4623p
    /* JADX INFO: renamed from: R */
    public Object mo3263R() {
        throw new C3674q(this.f15035Y);
    }

    /* JADX INFO: renamed from: b */
    public C20387d m5359b(String str) {
        C10252z0 c10252z0 = new C10252z0();
        String str2 = this.f15035Y;
        char cCharAt = str2.charAt(0);
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i11 < str2.length()) {
            try {
                if (str2.charAt(i11) == cCharAt) {
                    i11++;
                } else {
                    int i13 = (i10 + i11) - i12;
                    String strSubstring = str.substring(i10, i13);
                    AbstractC16544l.m18093f(strSubstring, "substring(...)");
                    m5357a(c10252z0, cCharAt, strSubstring);
                    try {
                        cCharAt = str2.charAt(i11);
                        i12 = i11;
                        i11++;
                        i10 = i13;
                    } catch (Throwable unused) {
                        i10 = i13;
                        StringBuilder sb2 = new StringBuilder("Failed to parse date string: \"");
                        sb2.append(str);
                        sb2.append("\" at index ");
                        sb2.append(i10);
                        sb2.append(". Pattern: \"");
                        throw new C20388e(AbstractC9306j0.m9892k(sb2, str2, '\"'));
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        if (i10 < str.length()) {
            String strSubstring2 = str.substring(i10);
            AbstractC16544l.m18093f(strSubstring2, "substring(...)");
            m5357a(c10252z0, cCharAt, strSubstring2);
        }
        Integer num = (Integer) c10252z0.f30454Y;
        AbstractC16544l.m18091d(num);
        int iIntValue = num.intValue();
        Integer num2 = (Integer) c10252z0.f30455Z;
        AbstractC16544l.m18091d(num2);
        int iIntValue2 = num2.intValue();
        Integer num3 = (Integer) c10252z0.f30456o0;
        AbstractC16544l.m18091d(num3);
        int iIntValue3 = num3.intValue();
        Integer num4 = (Integer) c10252z0.f30457p0;
        AbstractC16544l.m18091d(num4);
        int iIntValue4 = num4.intValue();
        EnumC20389f enumC20389f = (EnumC20389f) c10252z0.f30458q0;
        if (enumC20389f == null) {
            AbstractC16544l.m18103p("month");
            throw null;
        }
        Integer num5 = (Integer) c10252z0.f30459r0;
        AbstractC16544l.m18091d(num5);
        return AbstractC20384a.m21047a(iIntValue, iIntValue2, iIntValue3, iIntValue4, enumC20389f, num5.intValue());
    }

    /* JADX INFO: renamed from: c */
    public void m5360c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", m5358e(this.f15035Y, str, objArr));
        }
    }

    /* JADX INFO: renamed from: d */
    public void m5361d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            AbstractC15256t.m16482t("PlayCore", m5358e(this.f15035Y, str, objArr));
        }
    }
}

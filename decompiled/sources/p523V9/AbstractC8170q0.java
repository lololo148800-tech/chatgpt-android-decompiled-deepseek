package p523V9;

import android.os.Build;
import android.view.View;
import android.view.Window;
import java.net.ProtocolException;
import kotlin.jvm.internal.AbstractC16544l;
import mo.EnumC17357x;
import p013Ab.C0420b;
import p030B2.AbstractC0763j;
import p1113xn.AbstractC21329w;
import p647ak.EnumC10650J0;

/* JADX INFO: renamed from: V9.q0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8170q0 {
    /* JADX INFO: renamed from: b */
    public static C0420b m8753b(String statusLine) {
        int i10;
        String strSubstring;
        AbstractC16544l.m18094g(statusLine, "statusLine");
        boolean zM21734u = AbstractC21329w.m21734u(statusLine, "HTTP/1.", false);
        EnumC17357x enumC17357x = EnumC17357x.HTTP_1_0;
        if (zM21734u) {
            i10 = 9;
            if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            int iCharAt = statusLine.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                enumC17357x = EnumC17357x.HTTP_1_1;
            }
        } else {
            if (!AbstractC21329w.m21734u(statusLine, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            i10 = 4;
        }
        int i11 = i10 + 3;
        if (statusLine.length() < i11) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
        try {
            String strSubstring2 = statusLine.substring(i10, i11);
            AbstractC16544l.m18093f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            int i12 = Integer.parseInt(strSubstring2);
            if (statusLine.length() <= i11) {
                strSubstring = "";
            } else {
                if (statusLine.charAt(i11) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                strSubstring = statusLine.substring(i10 + 4);
                AbstractC16544l.m18093f(strSubstring, "this as java.lang.String).substring(startIndex)");
            }
            return new C0420b(enumC17357x, i12, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m8754c(Window window, boolean z6) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            AbstractC0763j.m1699h(window, z6);
        } else {
            if (i10 >= 30) {
                AbstractC0763j.m1698g(window, z6);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z6 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract EnumC10650J0 mo8755a();
}

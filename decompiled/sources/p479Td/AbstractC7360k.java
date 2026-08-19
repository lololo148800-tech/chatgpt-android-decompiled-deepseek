package p479Td;

import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.EnumC11104m;
import androidx.lifecycle.InterfaceC11111t;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p007A5.C0367b;
import p007A5.C0368c;
import p025An.C0624m;
import p523V9.AbstractC8154o0;
import p571X9.AbstractC9233X;
import p978r1.C18855a;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Td.k */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7360k {
    /* JADX INFO: renamed from: a */
    public static final long m7784a(int i10) {
        long j10 = (((long) i10) << 32) | (((long) 0) & 4294967295L);
        int i11 = C18855a.f60079r;
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m7785b(AbstractC11105n abstractC11105n, AbstractC19687c abstractC19687c) throws Throwable {
        C0367b c0367b;
        AbstractC11105n abstractC11105n2;
        C16525B c16525b;
        Throwable th2;
        InterfaceC11111t interfaceC11111t;
        InterfaceC11111t interfaceC11111t2;
        if (abstractC19687c instanceof C0367b) {
            c0367b = (C0367b) abstractC19687c;
            int i10 = c0367b.f1257p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0367b.f1257p0 = i10 - Integer.MIN_VALUE;
            } else {
                c0367b = new C0367b(abstractC19687c);
            }
        } else {
            c0367b = new C0367b(abstractC19687c);
        }
        Object obj = c0367b.f1256o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c0367b.f1257p0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c16525b = c0367b.f1255Z;
            abstractC11105n2 = c0367b.f1254Y;
            try {
                AbstractC9233X.m9807c(obj);
                interfaceC11111t2 = (InterfaceC11111t) c16525b.f51262Y;
                if (interfaceC11111t2 != null) {
                    abstractC11105n2.mo7808c(interfaceC11111t2);
                }
                return c17296c;
            } catch (Throwable th3) {
                th2 = th3;
                interfaceC11111t = (InterfaceC11111t) c16525b.f51262Y;
                if (interfaceC11111t != null) {
                    abstractC11105n2.mo7808c(interfaceC11111t);
                }
                throw th2;
            }
        }
        AbstractC9233X.m9807c(obj);
        if (abstractC11105n.mo7807b().compareTo(EnumC11104m.f33477p0) >= 0) {
            return c17296c;
        }
        C16525B c16525b2 = new C16525B();
        try {
            c0367b.f1254Y = abstractC11105n;
            c0367b.f1255Z = c16525b2;
            c0367b.f1257p0 = 1;
            C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(c0367b));
            c0624m.m1262r();
            C0368c c0368c = new C0368c(c0624m, 0);
            c16525b2.f51262Y = c0368c;
            abstractC11105n.mo7806a(c0368c);
            if (c0624m.m1261q() == enumC19250a) {
                return enumC19250a;
            }
            abstractC11105n2 = abstractC11105n;
            c16525b = c16525b2;
            interfaceC11111t2 = (InterfaceC11111t) c16525b.f51262Y;
            if (interfaceC11111t2 != null) {
                abstractC11105n2.mo7808c(interfaceC11111t2);
            }
            return c17296c;
        } catch (Throwable th4) {
            abstractC11105n2 = abstractC11105n;
            c16525b = c16525b2;
            th2 = th4;
            interfaceC11111t = (InterfaceC11111t) c16525b.f51262Y;
            if (interfaceC11111t != null) {
                abstractC11105n2.mo7808c(interfaceC11111t);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m7786c(String str, String str2) {
        char c9;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length != str2.length()) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            char cCharAt2 = str2.charAt(i10);
            if (cCharAt != cCharAt2 && ((c9 = (char) ((cCharAt | ' ') - 97)) >= 26 || c9 != ((char) ((cCharAt2 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static String m7787d(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c9 = charArray[i10];
                    if (c9 >= 'A' && c9 <= 'Z') {
                        charArray[i10] = (char) (c9 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static String m7788e(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c9 = charArray[i10];
                    if (c9 >= 'a' && c9 <= 'z') {
                        charArray[i10] = (char) (c9 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }
}

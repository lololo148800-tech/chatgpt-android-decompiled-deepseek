package p1027tp;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.lang.reflect.Method;
import p026Ao.C0675i;
import p817j$.util.Objects;

/* JADX INFO: renamed from: tp.D */
/* JADX INFO: loaded from: classes2.dex */
public final class C20039D extends AbstractC20056V {

    /* JADX INFO: renamed from: b */
    public final Method f63465b;

    /* JADX INFO: renamed from: c */
    public final int f63466c;

    /* JADX INFO: renamed from: d */
    public final String f63467d;

    /* JADX INFO: renamed from: e */
    public final C20057a f63468e;

    /* JADX INFO: renamed from: f */
    public final boolean f63469f;

    public C20039D(Method method, int i10, String str, boolean z6) {
        C20057a c20057a = C20057a.f63546Z;
        this.f63465b = method;
        this.f63466c = i10;
        Objects.requireNonNull(str, "name == null");
        this.f63467d = str;
        this.f63468e = c20057a;
        this.f63469f = z6;
    }

    @Override // p1027tp.AbstractC20056V
    /* JADX INFO: renamed from: a */
    public final void mo20858a(C20045J c20045j, Object obj) {
        String strM1428Z0;
        String str = this.f63467d;
        if (obj == null) {
            throw AbstractC20056V.m20885k(this.f63465b, this.f63466c, AbstractC10763a.m11054l("Path parameter \"", str, "\" value must not be null."), new Object[0]);
        }
        this.f63468e.getClass();
        String string = obj.toString();
        if (c20045j.f63480c == null) {
            throw new AssertionError();
        }
        int length = string.length();
        int iCharCount = 0;
        while (true) {
            if (iCharCount >= length) {
                strM1428Z0 = string;
                break;
            }
            int iCodePointAt = string.codePointAt(iCharCount);
            boolean z6 = this.f63469f;
            int i10 = 47;
            int i11 = -1;
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z6 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                C0675i c0675i = new C0675i();
                c0675i.m1443k1(0, iCharCount, string);
                C0675i c0675i2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = string.codePointAt(iCharCount);
                    if (!z6 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 < 32 || iCodePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != i11 || (!z6 && (iCodePointAt2 == i10 || iCodePointAt2 == 37))) {
                            if (c0675i2 == null) {
                                c0675i2 = new C0675i();
                            }
                            c0675i2.m1445m1(iCodePointAt2);
                            while (!c0675i2.mo1356g()) {
                                byte b = c0675i2.readByte();
                                c0675i.m1436f1(37);
                                char[] cArr = C20045J.f63476l;
                                c0675i.m1436f1(cArr[((b & 255) >> 4) & 15]);
                                c0675i.m1436f1(cArr[b & 15]);
                            }
                        } else {
                            c0675i.m1445m1(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i10 = 47;
                    i11 = -1;
                }
                strM1428Z0 = c0675i.m1428Z0();
                break;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strReplace = c20045j.f63480c.replace("{" + str + "}", strM1428Z0);
        if (C20045J.f63477m.matcher(strReplace).matches()) {
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(string));
        }
        c20045j.f63480c = strReplace;
    }
}

package p332N8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.GNuz.HJrCuD;
import mm.C17296C;
import p001A.AbstractC0010F;
import p002A0.C0138o;
import p025An.C0644w;
import p1009s9.C19506i;
import p1061vb.C20513d;
import p525Vb.C8258a;
import p909nm.AbstractC17680n;
import p960q9.C18655i;

/* JADX INFO: renamed from: N8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5678b {

    /* JADX INFO: renamed from: a */
    public final C20513d f18439a;

    /* JADX INFO: renamed from: b */
    public final C18655i f18440b;

    /* JADX INFO: renamed from: c */
    public long f18441c;

    /* JADX INFO: renamed from: d */
    public final C8258a f18442d = new C8258a();

    public C5678b(C20513d c20513d, C19506i c19506i) {
        this.f18439a = c20513d;
        this.f18440b = new C18655i(c19506i, 13);
    }

    /* JADX WARN: Code duplicated, block: B:75:0x012d  */
    /* JADX INFO: renamed from: a */
    public final List m6111a() throws IOException {
        String string;
        long jM459b;
        List list;
        List listM19322C0;
        String strConcat = "";
        while (true) {
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                BufferedReader bufferedReader = (BufferedReader) ((C19506i) this.f18440b.f59414Z).f61960Z;
                int i10 = bufferedReader.read();
                if (i10 == -1) {
                    if (sb2.length() != 0 && (sb2.length() != 1 || sb2.charAt(0) != 65279)) {
                        break;
                    }
                    string = null;
                    break;
                }
                char c9 = (char) i10;
                sb2.append(c9);
                if (c9 != '\n' && c9 != 8232 && c9 != 8233 && c9 != 133) {
                    if (c9 == '\r') {
                        bufferedReader.mark(1);
                        int i11 = bufferedReader.read();
                        if (i11 != -1) {
                            if (((char) i11) == '\n') {
                                sb2.append('\n');
                            } else {
                                bufferedReader.reset();
                            }
                        }
                    }
                }
                string = sb2.toString();
                break;
            }
            this.f18441c++;
            if (string == null) {
                if (strConcat.length() <= 0) {
                    return null;
                }
                throw new C0644w(AbstractC10763a.m11054l(Separators.DOUBLE_QUOTE, strConcat, "\" on the tail of file is left on the way of parsing row"), 8);
            }
            String strConcat2 = strConcat.length() == 0 ? string : strConcat.concat(string);
            long j10 = this.f18441c;
            this.f18442d.getClass();
            AbstractC16544l.m18094g(strConcat2, HJrCuD.KAoQpisCe);
            C0138o c0138o = new C0138o();
            Character chValueOf = strConcat2.length() == 0 ? null : Character.valueOf(strConcat2.charAt(0));
            int length = strConcat2.length() - 1;
            if (length < 1) {
                jM459b = 0;
            } else {
                ArrayList arrayList = new ArrayList(length);
                Character chValueOf2 = chValueOf;
                jM459b = 0;
                int i12 = 0;
                while (i12 < length) {
                    char cCharAt = strConcat2.charAt(i12);
                    i12++;
                    char cCharAt2 = strConcat2.charAt(i12);
                    jM459b = jM459b > 0 ? jM459b - 1 : c0138o.m459b(cCharAt, Character.valueOf(cCharAt2), j10) - 1;
                    chValueOf2 = Character.valueOf(cCharAt2);
                    arrayList.add(C17296C.f55119a);
                }
                chValueOf = chValueOf2;
            }
            if (chValueOf == null || jM459b != 0) {
                list = null;
            } else {
                list = null;
                c0138o.m459b(chValueOf.charValue(), null, j10);
            }
            int iM24h = AbstractC0010F.m24h(c0138o.f575Y);
            ArrayList arrayList2 = (ArrayList) c0138o.f577o0;
            if (iM24h == 1) {
                arrayList2.add(((StringBuilder) c0138o.f578p0).toString());
                listM19322C0 = AbstractC17680n.m19322C0(arrayList2);
            } else if (iM24h == 2) {
                arrayList2.add("");
                listM19322C0 = AbstractC17680n.m19322C0(arrayList2);
            } else if (iM24h != 5) {
                listM19322C0 = iM24h != 6 ? AbstractC17680n.m19322C0(arrayList2) : list;
            } else {
                arrayList2.add(((StringBuilder) c0138o.f578p0).toString());
                listM19322C0 = AbstractC17680n.m19322C0(arrayList2);
            }
            if (listM19322C0 != null) {
                return listM19322C0;
            }
            strConcat = strConcat.concat(string);
        }
    }
}

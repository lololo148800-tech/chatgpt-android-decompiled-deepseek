package p005A3;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.util.SparseArray;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p001A.C0017I0;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: A3.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0335v extends AbstractC0322i {

    /* JADX INFO: renamed from: s0 */
    public static final Pattern f1164s0 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: t0 */
    public static final Pattern f1165t0 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* JADX INFO: renamed from: u0 */
    public static final Pattern f1166u0 = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX WARN: Code duplicated, block: B:28:0x009d A[PHI: r2
      0x009d: PHI (r2v16 java.util.regex.Matcher) = (r2v10 java.util.regex.Matcher), (r2v8 java.util.regex.Matcher) binds: [B:26:0x0093, B:22:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a0  */
    /* JADX INFO: renamed from: b */
    public static C0335v m983b(File file, long j10, long j11, C0017I0 c0017i0) {
        File file2;
        long j12;
        String strGroup;
        File fileM984c;
        String name = file.getName();
        if (name.endsWith(".v3.exo")) {
            file2 = file;
        } else {
            String name2 = file.getName();
            Matcher matcher = f1165t0.matcher(name2);
            if (matcher.matches()) {
                strGroup = matcher.group(1);
                strGroup.getClass();
                int i10 = AbstractC20817s.f66106a;
                int length = strGroup.length();
                int iEnd = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < length; i12++) {
                    if (strGroup.charAt(i12) == '%') {
                        i11++;
                    }
                }
                if (i11 != 0) {
                    int i13 = length - (i11 * 2);
                    StringBuilder sb2 = new StringBuilder(i13);
                    Matcher matcher2 = AbstractC20817s.f66112g.matcher(strGroup);
                    while (i11 > 0 && matcher2.find()) {
                        String strGroup2 = matcher2.group(1);
                        strGroup2.getClass();
                        char c9 = (char) Integer.parseInt(strGroup2, 16);
                        sb2.append((CharSequence) strGroup, iEnd, matcher2.start());
                        sb2.append(c9);
                        iEnd = matcher2.end();
                        i11--;
                    }
                    if (iEnd < length) {
                        sb2.append((CharSequence) strGroup, iEnd, length);
                    }
                    if (sb2.length() != i13) {
                        strGroup = null;
                    } else {
                        strGroup = sb2.toString();
                    }
                }
            } else {
                matcher = f1164s0.matcher(name2);
                if (matcher.matches()) {
                    strGroup = matcher.group(1);
                    strGroup.getClass();
                } else {
                    strGroup = null;
                }
            }
            if (strGroup == null) {
                fileM984c = null;
            } else {
                File parentFile = file.getParentFile();
                AbstractC20800b.m21321i(parentFile);
                C0324k c0324kM81r = c0017i0.m81r(strGroup);
                String strGroup3 = matcher.group(2);
                strGroup3.getClass();
                long j13 = Long.parseLong(strGroup3);
                String strGroup4 = matcher.group(3);
                strGroup4.getClass();
                fileM984c = m984c(parentFile, c0324kM81r.f1129a, j13, Long.parseLong(strGroup4));
                if (!file.renameTo(fileM984c)) {
                    fileM984c = null;
                }
            }
            if (fileM984c == null) {
                return null;
            }
            file2 = fileM984c;
            name = fileM984c.getName();
        }
        Matcher matcher3 = f1166u0.matcher(name);
        if (!matcher3.matches()) {
            return null;
        }
        String strGroup5 = matcher3.group(1);
        strGroup5.getClass();
        String str = (String) ((SparseArray) c0017i0.f65Z).get(Integer.parseInt(strGroup5));
        if (str == null) {
            return null;
        }
        long length2 = j10 == -1 ? file2.length() : j10;
        if (length2 == 0) {
            return null;
        }
        String strGroup6 = matcher3.group(2);
        strGroup6.getClass();
        long j14 = Long.parseLong(strGroup6);
        if (j11 == -9223372036854775807L) {
            String strGroup7 = matcher3.group(3);
            strGroup7.getClass();
            j12 = Long.parseLong(strGroup7);
        } else {
            j12 = j11;
        }
        return new C0335v(str, j14, length2, j12, file2);
    }

    /* JADX INFO: renamed from: c */
    public static File m984c(File file, int i10, long j10, long j11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        sb2.append(Separators.DOT);
        sb2.append(j10);
        sb2.append(Separators.DOT);
        return new File(file, AbstractC10763a.m11050h(j11, ".v3.exo", sb2));
    }
}

package p372P3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p1016t3.C19753C;
import p1016t3.InterfaceC19752B;
import p1073w3.AbstractC20817s;
import p696d4.C13007e;
import p696d4.C13013k;

/* JADX INFO: renamed from: P3.w */
/* JADX INFO: loaded from: classes.dex */
public final class C6341w {

    /* JADX INFO: renamed from: c */
    public static final Pattern f20578c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a */
    public int f20579a = -1;

    /* JADX INFO: renamed from: b */
    public int f20580b = -1;

    /* JADX INFO: renamed from: a */
    public final boolean m6956a(String str) {
        Matcher matcher = f20578c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i10 = AbstractC20817s.f66106a;
            int i11 = Integer.parseInt(strGroup, 16);
            int i12 = Integer.parseInt(matcher.group(2), 16);
            if (i11 <= 0 && i12 <= 0) {
                return false;
            }
            this.f20579a = i11;
            this.f20580b = i12;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6957b(C19753C c19753c) {
        int i10 = 0;
        while (true) {
            InterfaceC19752B[] interfaceC19752BArr = c19753c.f62555Y;
            if (i10 >= interfaceC19752BArr.length) {
                return;
            }
            InterfaceC19752B interfaceC19752B = interfaceC19752BArr[i10];
            if (interfaceC19752B instanceof C13007e) {
                C13007e c13007e = (C13007e) interfaceC19752B;
                if ("iTunSMPB".equals(c13007e.f41275o0) && m6956a(c13007e.f41276p0)) {
                    return;
                }
            } else if (interfaceC19752B instanceof C13013k) {
                C13013k c13013k = (C13013k) interfaceC19752B;
                if ("com.apple.iTunes".equals(c13013k.f41288Z) && "iTunSMPB".equals(c13013k.f41289o0) && m6956a(c13013k.f41290p0)) {
                    return;
                }
            } else {
                continue;
            }
            i10++;
        }
    }
}

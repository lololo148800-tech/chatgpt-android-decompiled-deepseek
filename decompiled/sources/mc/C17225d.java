package mc;

import lc.C16842b;
import lc.EnumC16841a;
import p166Ga.C3029c;
import p808ic.C14960d;

/* JADX INFO: renamed from: mc.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C17225d {

    /* JADX INFO: renamed from: a */
    public final EnumC16841a f54968a;

    /* JADX INFO: renamed from: b */
    public final int f54969b;

    /* JADX INFO: renamed from: c */
    public final int f54970c;

    /* JADX INFO: renamed from: d */
    public final int f54971d;

    /* JADX INFO: renamed from: e */
    public final C17225d f54972e;

    /* JADX INFO: renamed from: f */
    public final int f54973f;

    public C17225d(C3029c c3029c, EnumC16841a enumC16841a, int i10, int i11, int i12, C17225d c17225d, C16842b c16842b) {
        this.f54968a = enumC16841a;
        this.f54969b = i10;
        EnumC16841a enumC16841a2 = EnumC16841a.BYTE;
        int i13 = (enumC16841a == enumC16841a2 || c17225d == null) ? i11 : c17225d.f54970c;
        this.f54970c = i13;
        this.f54971d = i12;
        this.f54972e = c17225d;
        boolean z6 = false;
        int iM18572a = c17225d != null ? c17225d.f54973f : 0;
        if ((enumC16841a == enumC16841a2 && c17225d == null && i13 != 0) || (c17225d != null && i13 != c17225d.f54970c)) {
            z6 = true;
        }
        iM18572a = (c17225d == null || enumC16841a != c17225d.f54968a || z6) ? iM18572a + enumC16841a.m18572a(c16842b) + 4 : iM18572a;
        int iOrdinal = enumC16841a.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                iM18572a += i12 != 1 ? 11 : 6;
            } else if (iOrdinal == 4) {
                iM18572a += ((String) c3029c.f9119d).substring(i10, i12 + i10).getBytes(((C14960d) c3029c.f9120e).f46597a[i11].charset()).length * 8;
                if (z6) {
                    iM18572a += 12;
                }
            } else if (iOrdinal == 6) {
                iM18572a += 13;
            }
        } else {
            iM18572a += i12 != 1 ? i12 == 2 ? 7 : 10 : 4;
        }
        this.f54973f = iM18572a;
    }
}

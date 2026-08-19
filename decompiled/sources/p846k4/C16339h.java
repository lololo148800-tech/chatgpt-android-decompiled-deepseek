package p846k4;

import bb.AbstractC11278C;
import io.sentry.C15358g1;
import java.util.ArrayList;
import java.util.Arrays;
import p1016t3.AbstractC19754D;
import p1016t3.C19753C;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1073w3.AbstractC20800b;
import p1073w3.C20811m;
import p372P3.AbstractC6320b;

/* JADX INFO: renamed from: k4.h */
/* JADX INFO: loaded from: classes.dex */
public final class C16339h extends AbstractC16341j {

    /* JADX INFO: renamed from: o */
    public static final byte[] f50694o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p */
    public static final byte[] f50695p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n */
    public boolean f50696n;

    /* JADX INFO: renamed from: e */
    public static boolean m17934e(C20811m c20811m, byte[] bArr) {
        if (c20811m.m21346a() < bArr.length) {
            return false;
        }
        int i10 = c20811m.f66093b;
        byte[] bArr2 = new byte[bArr.length];
        c20811m.m21350e(bArr2, 0, bArr.length);
        c20811m.m21344F(i10);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // p846k4.AbstractC16341j
    /* JADX INFO: renamed from: b */
    public final long mo17923b(C20811m c20811m) {
        byte[] bArr = c20811m.f66092a;
        return (((long) this.f50705i) * AbstractC6320b.m6894j(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // p846k4.AbstractC16341j
    /* JADX INFO: renamed from: c */
    public final boolean mo17924c(C20811m c20811m, long j10, C15358g1 c15358g1) {
        if (m17934e(c20811m, f50694o)) {
            byte[] bArrCopyOf = Arrays.copyOf(c20811m.f66092a, c20811m.f66094c);
            int i10 = bArrCopyOf[9] & 255;
            ArrayList arrayListM6885a = AbstractC6320b.m6885a(bArrCopyOf);
            if (((C19788o) c15358g1.f47945Y) != null) {
                return true;
            }
            C19787n c19787n = new C19787n();
            c19787n.f62714l = AbstractC19754D.m20711i("audio/opus");
            c19787n.f62728z = i10;
            c19787n.f62694A = 48000;
            c19787n.f62717o = arrayListM6885a;
            c15358g1.f47945Y = new C19788o(c19787n);
            return true;
        }
        if (!m17934e(c20811m, f50695p)) {
            AbstractC20800b.m21321i((C19788o) c15358g1.f47945Y);
            return false;
        }
        AbstractC20800b.m21321i((C19788o) c15358g1.f47945Y);
        if (this.f50696n) {
            return true;
        }
        this.f50696n = true;
        c20811m.m21345G(8);
        C19753C c19753cM6900p = AbstractC6320b.m6900p(AbstractC11278C.m12692u((String[]) AbstractC6320b.m6903s(c20811m, false, false).f9127Z));
        if (c19753cM6900p == null) {
            return true;
        }
        C19787n c19787nM20747a = ((C19788o) c15358g1.f47945Y).m20747a();
        c19787nM20747a.f62712j = c19753cM6900p.m20702b(((C19788o) c15358g1.f47945Y).f62750k);
        c15358g1.f47945Y = new C19788o(c19787nM20747a);
        return true;
    }

    @Override // p846k4.AbstractC16341j
    /* JADX INFO: renamed from: d */
    public final void mo17925d(boolean z6) {
        super.mo17925d(z6);
        if (z6) {
            this.f50696n = false;
        }
    }
}

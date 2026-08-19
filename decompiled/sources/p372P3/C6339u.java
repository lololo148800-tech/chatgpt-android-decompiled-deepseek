package p372P3;

import java.util.Collections;
import p1016t3.AbstractC19754D;
import p1016t3.C19753C;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1073w3.AbstractC20817s;
import p658b5.C11234e;

/* JADX INFO: renamed from: P3.u */
/* JADX INFO: loaded from: classes.dex */
public final class C6339u {

    /* JADX INFO: renamed from: a */
    public final int f20565a;

    /* JADX INFO: renamed from: b */
    public final int f20566b;

    /* JADX INFO: renamed from: c */
    public final int f20567c;

    /* JADX INFO: renamed from: d */
    public final int f20568d;

    /* JADX INFO: renamed from: e */
    public final int f20569e;

    /* JADX INFO: renamed from: f */
    public final int f20570f;

    /* JADX INFO: renamed from: g */
    public final int f20571g;

    /* JADX INFO: renamed from: h */
    public final int f20572h;

    /* JADX INFO: renamed from: i */
    public final int f20573i;

    /* JADX INFO: renamed from: j */
    public final long f20574j;

    /* JADX INFO: renamed from: k */
    public final C11234e f20575k;

    /* JADX INFO: renamed from: l */
    public final C19753C f20576l;

    public C6339u(int i10, byte[] bArr) {
        C6318J c6318j = new C6318J(bArr.length, bArr);
        c6318j.m6880q(i10 * 8);
        this.f20565a = c6318j.m6872i(16);
        this.f20566b = c6318j.m6872i(16);
        this.f20567c = c6318j.m6872i(24);
        this.f20568d = c6318j.m6872i(24);
        int iM6872i = c6318j.m6872i(20);
        this.f20569e = iM6872i;
        this.f20570f = m6953d(iM6872i);
        this.f20571g = c6318j.m6872i(3) + 1;
        int iM6872i2 = c6318j.m6872i(5) + 1;
        this.f20572h = iM6872i2;
        this.f20573i = m6952a(iM6872i2);
        this.f20574j = c6318j.m6874k(36);
        this.f20575k = null;
        this.f20576l = null;
    }

    /* JADX INFO: renamed from: a */
    public static int m6952a(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    /* JADX INFO: renamed from: d */
    public static int m6953d(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m6954b() {
        long j10 = this.f20574j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.f20569e);
    }

    /* JADX INFO: renamed from: c */
    public final C19788o m6955c(byte[] bArr, C19753C c19753c) {
        bArr[4] = -128;
        int i10 = this.f20568d;
        if (i10 <= 0) {
            i10 = -1;
        }
        C19753C c19753c2 = this.f20576l;
        if (c19753c2 != null) {
            c19753c = c19753c2.m20702b(c19753c);
        }
        C19787n c19787n = new C19787n();
        c19787n.f62714l = AbstractC19754D.m20711i("audio/flac");
        c19787n.f62715m = i10;
        c19787n.f62728z = this.f20571g;
        c19787n.f62694A = this.f20569e;
        c19787n.f62695B = AbstractC20817s.m21419t(this.f20572h);
        c19787n.f62717o = Collections.singletonList(bArr);
        c19787n.f62712j = c19753c;
        return new C19788o(c19787n);
    }

    public C6339u(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, C11234e c11234e, C19753C c19753c) {
        this.f20565a = i10;
        this.f20566b = i11;
        this.f20567c = i12;
        this.f20568d = i13;
        this.f20569e = i14;
        this.f20570f = m6953d(i14);
        this.f20571g = i15;
        this.f20572h = i16;
        this.f20573i = m6952a(i16);
        this.f20574j = j10;
        this.f20575k = c11234e;
        this.f20576l = c19753c;
    }
}

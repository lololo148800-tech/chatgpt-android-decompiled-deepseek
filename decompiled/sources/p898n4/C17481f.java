package p898n4;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import livekit.LivekitInternal$NodeStats;
import p1071w0.AbstractC20734X;
import p1073w3.AbstractC20800b;
import p1073w3.C20811m;
import p372P3.C6318J;
import p594Y9.C9895g4;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: n4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C17481f extends AbstractC17483h {

    /* JADX INFO: renamed from: h */
    public final C20811m f55922h = new C20811m();

    /* JADX INFO: renamed from: i */
    public final C6318J f55923i = new C6318J();

    /* JADX INFO: renamed from: j */
    public int f55924j = -1;

    /* JADX INFO: renamed from: k */
    public final int f55925k;

    /* JADX INFO: renamed from: l */
    public final C17480e[] f55926l;

    /* JADX INFO: renamed from: m */
    public C17480e f55927m;

    /* JADX INFO: renamed from: n */
    public List f55928n;

    /* JADX INFO: renamed from: o */
    public List f55929o;

    /* JADX INFO: renamed from: p */
    public C6318J f55930p;

    /* JADX INFO: renamed from: q */
    public int f55931q;

    public C17481f(int i10, List list) {
        this.f55925k = i10 == -1 ? 1 : i10;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b = ((byte[]) list.get(0))[0];
        }
        this.f55926l = new C17480e[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f55926l[i11] = new C17480e();
        }
        this.f55927m = this.f55926l[0];
    }

    @Override // p898n4.AbstractC17483h
    /* JADX INFO: renamed from: f */
    public final C9895g4 mo19179f() {
        List list = this.f55928n;
        this.f55929o = list;
        list.getClass();
        return new C9895g4(list);
    }

    @Override // p898n4.AbstractC17483h, p031B3.InterfaceC0800d
    public final void flush() {
        super.flush();
        this.f55928n = null;
        this.f55929o = null;
        this.f55931q = 0;
        this.f55927m = this.f55926l[0];
        m19194l();
        this.f55930p = null;
    }

    @Override // p898n4.AbstractC17483h
    /* JADX INFO: renamed from: g */
    public final void mo19180g(C17482g c17482g) {
        ByteBuffer byteBuffer = c17482g.f2226q0;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C20811m c20811m = this.f55922h;
        c20811m.m21342D(iLimit, bArrArray);
        while (c20811m.m21346a() >= 3) {
            int iM21365t = c20811m.m21365t();
            int i10 = iM21365t & 3;
            boolean z6 = (iM21365t & 4) == 4;
            byte bM21365t = (byte) c20811m.m21365t();
            byte bM21365t2 = (byte) c20811m.m21365t();
            if (i10 == 2 || i10 == 3) {
                if (z6) {
                    if (i10 == 3) {
                        m19192j();
                        int i11 = (bM21365t & 192) >> 6;
                        int i12 = this.f55924j;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            m19194l();
                            AbstractC20800b.m21332t("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f55924j + " current=" + i11);
                        }
                        this.f55924j = i11;
                        int i13 = bM21365t & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        C6318J c6318j = new C6318J(i11, i13);
                        this.f55930p = c6318j;
                        c6318j.f20468e = 1;
                        c6318j.f20467d[0] = bM21365t2;
                    } else {
                        AbstractC20800b.m21316d(i10 == 2);
                        C6318J c6318j2 = this.f55930p;
                        if (c6318j2 == null) {
                            AbstractC20800b.m21324l("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = c6318j2.f20467d;
                            int i14 = c6318j2.f20468e;
                            int i15 = i14 + 1;
                            c6318j2.f20468e = i15;
                            bArr[i14] = bM21365t;
                            c6318j2.f20468e = i14 + 2;
                            bArr[i15] = bM21365t2;
                        }
                    }
                    C6318J c6318j3 = this.f55930p;
                    if (c6318j3.f20468e == (c6318j3.f20466c * 2) - 1) {
                        m19192j();
                    }
                }
            }
        }
    }

    @Override // p898n4.AbstractC17483h
    /* JADX INFO: renamed from: i */
    public final boolean mo19182i() {
        return this.f55928n != this.f55929o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:228:0x055d  */
    /* JADX INFO: renamed from: j */
    public final void m19192j() {
        boolean z6;
        char c9;
        C6318J c6318j = this.f55930p;
        if (c6318j == null) {
            return;
        }
        int i10 = 2;
        if (c6318j.f20468e != (c6318j.f20466c * 2) - 1) {
            AbstractC20800b.m21323k("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f55930p.f20466c * 2) - 1) + ", but current index is " + this.f55930p.f20468e + " (sequence number " + this.f55930p.f20465b + ");");
        }
        C6318J c6318j2 = this.f55930p;
        byte[] bArr = c6318j2.f20467d;
        int i11 = c6318j2.f20468e;
        C6318J c6318j3 = this.f55923i;
        c6318j3.m6878o(i11, bArr);
        boolean z10 = false;
        while (c6318j3.m6865b() > 0) {
            int i12 = 3;
            int iM6872i = c6318j3.m6872i(3);
            int iM6872i2 = c6318j3.m6872i(5);
            if (iM6872i == 7) {
                c6318j3.m6883t(i10);
                iM6872i = c6318j3.m6872i(6);
                if (iM6872i < 7) {
                    AbstractC20734X.m21224A(iM6872i, "Invalid extended service number: ", "Cea708Decoder");
                }
            }
            if (iM6872i2 == 0) {
                if (iM6872i != 0) {
                    AbstractC20800b.m21332t("Cea708Decoder", "serviceNumber is non-zero (" + iM6872i + ") when blockSize is 0");
                }
                if (z10) {
                    this.f55928n = m19193k();
                }
                this.f55930p = null;
            }
            if (iM6872i != this.f55925k) {
                c6318j3.m6884u(iM6872i2);
            } else {
                int iM6870g = (iM6872i2 * 8) + c6318j3.m6870g();
                while (c6318j3.m6870g() < iM6870g) {
                    int iM6872i3 = c6318j3.m6872i(8);
                    if (iM6872i3 != 16) {
                        if (iM6872i3 > 31) {
                            if (iM6872i3 <= 127) {
                                if (iM6872i3 == 127) {
                                    this.f55927m.m19187a((char) 9835);
                                } else {
                                    this.f55927m.m19187a((char) (iM6872i3 & 255));
                                }
                                z10 = true;
                            } else {
                                if (iM6872i3 <= 159) {
                                    C17480e[] c17480eArr = this.f55926l;
                                    switch (iM6872i3) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            i12 = i12;
                                            iM6870g = iM6870g;
                                            z6 = true;
                                            int i13 = iM6872i3 - 128;
                                            if (this.f55931q != i13) {
                                                this.f55931q = i13;
                                                this.f55927m = c17480eArr[i13];
                                            }
                                            break;
                                        case 136:
                                            i12 = i12;
                                            iM6870g = iM6870g;
                                            z6 = true;
                                            for (int i14 = 1; i14 <= 8; i14++) {
                                                if (c6318j3.m6871h()) {
                                                    C17480e c17480e = c17480eArr[8 - i14];
                                                    c17480e.f55901a.clear();
                                                    c17480e.f55902b.clear();
                                                    c17480e.f55915o = -1;
                                                    c17480e.f55916p = -1;
                                                    c17480e.f55917q = -1;
                                                    c17480e.f55919s = -1;
                                                    c17480e.f55921u = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            i12 = i12;
                                            iM6870g = iM6870g;
                                            for (int i15 = 1; i15 <= 8; i15++) {
                                                if (c6318j3.m6871h()) {
                                                    c17480eArr[8 - i15].f55904d = true;
                                                }
                                            }
                                            z6 = true;
                                            break;
                                        case 138:
                                            i12 = i12;
                                            iM6870g = iM6870g;
                                            for (int i16 = 1; i16 <= 8; i16++) {
                                                if (c6318j3.m6871h()) {
                                                    c17480eArr[8 - i16].f55904d = false;
                                                }
                                            }
                                            z6 = true;
                                            break;
                                        case 139:
                                            i12 = i12;
                                            iM6870g = iM6870g;
                                            for (int i17 = 1; i17 <= 8; i17++) {
                                                if (c6318j3.m6871h()) {
                                                    C17480e c17480e2 = c17480eArr[8 - i17];
                                                    c17480e2.f55904d = !c17480e2.f55904d;
                                                }
                                            }
                                            z6 = true;
                                            break;
                                        case 140:
                                            i12 = i12;
                                            iM6870g = iM6870g;
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (c6318j3.m6871h()) {
                                                    c17480eArr[8 - i18].m19189d();
                                                }
                                            }
                                            z6 = true;
                                            break;
                                        case 141:
                                            i12 = i12;
                                            iM6870g = iM6870g;
                                            c6318j3.m6883t(8);
                                            z6 = true;
                                            break;
                                        case 142:
                                            i12 = i12;
                                            iM6870g = iM6870g;
                                            z6 = true;
                                            break;
                                        case 143:
                                            i12 = i12;
                                            iM6870g = iM6870g;
                                            m19194l();
                                            z6 = true;
                                            break;
                                        case 144:
                                            iM6870g = iM6870g;
                                            if (this.f55927m.f55903c) {
                                                c6318j3.m6872i(4);
                                                c6318j3.m6872i(2);
                                                c6318j3.m6872i(2);
                                                boolean zM6871h = c6318j3.m6871h();
                                                boolean zM6871h2 = c6318j3.m6871h();
                                                i12 = 3;
                                                c6318j3.m6872i(3);
                                                c6318j3.m6872i(3);
                                                this.f55927m.m19190e(zM6871h, zM6871h2);
                                            } else {
                                                c6318j3.m6883t(16);
                                                i12 = 3;
                                            }
                                            z6 = true;
                                            break;
                                        case 145:
                                            iM6870g = iM6870g;
                                            if (this.f55927m.f55903c) {
                                                int iM19186c = C17480e.m19186c(c6318j3.m6872i(2), c6318j3.m6872i(2), c6318j3.m6872i(2), c6318j3.m6872i(2));
                                                int iM19186c2 = C17480e.m19186c(c6318j3.m6872i(2), c6318j3.m6872i(2), c6318j3.m6872i(2), c6318j3.m6872i(2));
                                                c6318j3.m6883t(2);
                                                C17480e.m19186c(c6318j3.m6872i(2), c6318j3.m6872i(2), c6318j3.m6872i(2), 0);
                                                this.f55927m.m19191f(iM19186c, iM19186c2);
                                            } else {
                                                c6318j3.m6883t(24);
                                            }
                                            i12 = 3;
                                            z6 = true;
                                            break;
                                        case 146:
                                            iM6870g = iM6870g;
                                            if (this.f55927m.f55903c) {
                                                c6318j3.m6883t(4);
                                                int iM6872i4 = c6318j3.m6872i(4);
                                                c6318j3.m6883t(2);
                                                c6318j3.m6872i(6);
                                                C17480e c17480e3 = this.f55927m;
                                                if (c17480e3.f55921u != iM6872i4) {
                                                    c17480e3.m19187a('\n');
                                                }
                                                c17480e3.f55921u = iM6872i4;
                                            } else {
                                                c6318j3.m6883t(16);
                                            }
                                            i12 = 3;
                                            z6 = true;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            AbstractC20734X.m21224A(iM6872i3, "Invalid C1 command: ", "Cea708Decoder");
                                            i12 = i12;
                                            iM6870g = iM6870g;
                                            z6 = true;
                                            break;
                                        case 151:
                                            iM6870g = iM6870g;
                                            if (this.f55927m.f55903c) {
                                                int iM19186c3 = C17480e.m19186c(c6318j3.m6872i(2), c6318j3.m6872i(2), c6318j3.m6872i(2), c6318j3.m6872i(2));
                                                c6318j3.m6872i(2);
                                                C17480e.m19186c(c6318j3.m6872i(2), c6318j3.m6872i(2), c6318j3.m6872i(2), 0);
                                                c6318j3.m6871h();
                                                c6318j3.m6871h();
                                                c6318j3.m6872i(2);
                                                c6318j3.m6872i(2);
                                                int iM6872i5 = c6318j3.m6872i(2);
                                                c6318j3.m6883t(8);
                                                C17480e c17480e4 = this.f55927m;
                                                c17480e4.f55914n = iM19186c3;
                                                c17480e4.f55911k = iM6872i5;
                                            } else {
                                                c6318j3.m6883t(32);
                                            }
                                            i12 = 3;
                                            z6 = true;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i19 = iM6872i3 - 152;
                                            C17480e c17480e5 = c17480eArr[i19];
                                            c6318j3.m6883t(i10);
                                            boolean zM6871h3 = c6318j3.m6871h();
                                            c6318j3.m6883t(i10);
                                            int iM6872i6 = c6318j3.m6872i(i12);
                                            boolean zM6871h4 = c6318j3.m6871h();
                                            int iM6872i7 = c6318j3.m6872i(7);
                                            int iM6872i8 = c6318j3.m6872i(8);
                                            int iM6872i9 = c6318j3.m6872i(4);
                                            int iM6872i10 = c6318j3.m6872i(4);
                                            c6318j3.m6883t(i10);
                                            c6318j3.m6883t(6);
                                            c6318j3.m6883t(i10);
                                            int iM6872i11 = c6318j3.m6872i(3);
                                            iM6870g = iM6870g;
                                            int iM6872i12 = c6318j3.m6872i(3);
                                            c17480e5.f55903c = true;
                                            c17480e5.f55904d = zM6871h3;
                                            c17480e5.f55905e = iM6872i6;
                                            c17480e5.f55906f = zM6871h4;
                                            c17480e5.f55907g = iM6872i7;
                                            c17480e5.f55908h = iM6872i8;
                                            c17480e5.f55909i = iM6872i9;
                                            int i20 = iM6872i10 + 1;
                                            if (c17480e5.f55910j != i20) {
                                                c17480e5.f55910j = i20;
                                                while (true) {
                                                    ArrayList arrayList = c17480e5.f55901a;
                                                    if (arrayList.size() >= c17480e5.f55910j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (iM6872i11 != 0 && c17480e5.f55912l != iM6872i11) {
                                                c17480e5.f55912l = iM6872i11;
                                                int i21 = iM6872i11 - 1;
                                                int i22 = C17480e.f55892B[i21];
                                                boolean z11 = C17480e.f55891A[i21];
                                                int i23 = C17480e.f55899y[i21];
                                                int i24 = C17480e.f55900z[i21];
                                                int i25 = C17480e.f55898x[i21];
                                                c17480e5.f55914n = i22;
                                                c17480e5.f55911k = i25;
                                            }
                                            if (iM6872i12 != 0 && c17480e5.f55913m != iM6872i12) {
                                                c17480e5.f55913m = iM6872i12;
                                                int i26 = iM6872i12 - 1;
                                                int i27 = C17480e.f55894D[i26];
                                                int i28 = C17480e.f55893C[i26];
                                                c17480e5.m19190e(false, false);
                                                c17480e5.m19191f(C17480e.f55896v, C17480e.f55895E[i26]);
                                            }
                                            if (this.f55931q != i19) {
                                                this.f55931q = i19;
                                                this.f55927m = c17480eArr[i19];
                                            }
                                            i12 = 3;
                                            z6 = true;
                                            break;
                                    }
                                } else {
                                    i12 = i12;
                                    iM6870g = iM6870g;
                                    z6 = true;
                                    if (iM6872i3 <= 255) {
                                        this.f55927m.m19187a((char) (iM6872i3 & 255));
                                    } else {
                                        AbstractC20734X.m21224A(iM6872i3, "Invalid base command: ", "Cea708Decoder");
                                    }
                                    i10 = 2;
                                }
                                z10 = z6;
                                i10 = 2;
                            }
                            c9 = 7;
                        } else if (iM6872i3 != 0) {
                            if (iM6872i3 == i12) {
                                this.f55928n = m19193k();
                            } else if (iM6872i3 != 8) {
                                switch (iM6872i3) {
                                    case 12:
                                        m19194l();
                                        break;
                                    case 13:
                                        this.f55927m.m19187a('\n');
                                        break;
                                    case 14:
                                        break;
                                    default:
                                        if (iM6872i3 >= 17 && iM6872i3 <= 23) {
                                            AbstractC20800b.m21332t("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + iM6872i3);
                                            c6318j3.m6883t(8);
                                        } else if (iM6872i3 < 24 || iM6872i3 > 31) {
                                            AbstractC20734X.m21224A(iM6872i3, "Invalid C0 command: ", "Cea708Decoder");
                                        } else {
                                            AbstractC20800b.m21332t("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + iM6872i3);
                                            c6318j3.m6883t(16);
                                        }
                                        break;
                                }
                            } else {
                                SpannableStringBuilder spannableStringBuilder = this.f55927m.f55902b;
                                int length = spannableStringBuilder.length();
                                if (length > 0) {
                                    spannableStringBuilder.delete(length - 1, length);
                                }
                            }
                        }
                        z6 = true;
                        c9 = 7;
                    } else {
                        i12 = i12;
                        iM6870g = iM6870g;
                        z6 = true;
                        int iM6872i13 = c6318j3.m6872i(8);
                        if (iM6872i13 <= 31) {
                            c9 = 7;
                            if (iM6872i13 > 7) {
                                if (iM6872i13 <= 15) {
                                    c6318j3.m6883t(8);
                                } else if (iM6872i13 <= 23) {
                                    c6318j3.m6883t(16);
                                } else if (iM6872i13 <= 31) {
                                    c6318j3.m6883t(24);
                                }
                            }
                        } else {
                            c9 = 7;
                            if (iM6872i13 <= 127) {
                                if (iM6872i13 == 32) {
                                    this.f55927m.m19187a(' ');
                                } else if (iM6872i13 == 33) {
                                    this.f55927m.m19187a((char) 160);
                                } else if (iM6872i13 == 37) {
                                    this.f55927m.m19187a((char) 8230);
                                } else if (iM6872i13 == 42) {
                                    this.f55927m.m19187a((char) 352);
                                } else if (iM6872i13 == 44) {
                                    this.f55927m.m19187a((char) 338);
                                } else if (iM6872i13 == 63) {
                                    this.f55927m.m19187a((char) 376);
                                } else if (iM6872i13 == 57) {
                                    this.f55927m.m19187a((char) 8482);
                                } else if (iM6872i13 == 58) {
                                    this.f55927m.m19187a((char) 353);
                                } else if (iM6872i13 == 60) {
                                    this.f55927m.m19187a((char) 339);
                                } else if (iM6872i13 != 61) {
                                    switch (iM6872i13) {
                                        case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                                            this.f55927m.m19187a((char) 9608);
                                            break;
                                        case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                                            this.f55927m.m19187a((char) 8216);
                                            break;
                                        case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                                            this.f55927m.m19187a((char) 8217);
                                            break;
                                        case 51:
                                            this.f55927m.m19187a((char) 8220);
                                            break;
                                        case 52:
                                            this.f55927m.m19187a((char) 8221);
                                            break;
                                        case 53:
                                            this.f55927m.m19187a((char) 8226);
                                            break;
                                        default:
                                            switch (iM6872i13) {
                                                case 118:
                                                    this.f55927m.m19187a((char) 8539);
                                                    break;
                                                case 119:
                                                    this.f55927m.m19187a((char) 8540);
                                                    break;
                                                case 120:
                                                    this.f55927m.m19187a((char) 8541);
                                                    break;
                                                case 121:
                                                    this.f55927m.m19187a((char) 8542);
                                                    break;
                                                case 122:
                                                    this.f55927m.m19187a((char) 9474);
                                                    break;
                                                case 123:
                                                    this.f55927m.m19187a((char) 9488);
                                                    break;
                                                case 124:
                                                    this.f55927m.m19187a((char) 9492);
                                                    break;
                                                case 125:
                                                    this.f55927m.m19187a((char) 9472);
                                                    break;
                                                case 126:
                                                    this.f55927m.m19187a((char) 9496);
                                                    break;
                                                case 127:
                                                    this.f55927m.m19187a((char) 9484);
                                                    break;
                                                default:
                                                    AbstractC20734X.m21224A(iM6872i13, "Invalid G2 character: ", "Cea708Decoder");
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.f55927m.m19187a((char) 8480);
                                }
                                z10 = true;
                            } else if (iM6872i13 > 159) {
                                i10 = 2;
                                if (iM6872i13 <= 255) {
                                    if (iM6872i13 == 160) {
                                        this.f55927m.m19187a((char) 13252);
                                    } else {
                                        AbstractC20734X.m21224A(iM6872i13, "Invalid G3 character: ", "Cea708Decoder");
                                        this.f55927m.m19187a('_');
                                    }
                                    z10 = true;
                                } else {
                                    AbstractC20734X.m21224A(iM6872i13, "Invalid extended command: ", "Cea708Decoder");
                                }
                            } else if (iM6872i13 <= 135) {
                                c6318j3.m6883t(32);
                            } else if (iM6872i13 <= 143) {
                                c6318j3.m6883t(40);
                            } else if (iM6872i13 <= 159) {
                                i10 = 2;
                                c6318j3.m6883t(2);
                                c6318j3.m6883t(c6318j3.m6872i(6) * 8);
                            }
                        }
                        i10 = 2;
                    }
                    i12 = i12;
                    iM6870g = iM6870g;
                    i10 = i10;
                }
            }
        }
        if (z10) {
            this.f55928n = m19193k();
        }
        this.f55930p = null;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ea  */
    /* JADX INFO: renamed from: k */
    public final List m19193k() {
        C17479d c17479d;
        Layout.Alignment alignment;
        float f10;
        float f11;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            C17480e[] c17480eArr = this.f55926l;
            C17480e c17480e = c17480eArr[i10];
            if (c17480e.f55903c && (!c17480e.f55901a.isEmpty() || c17480e.f55902b.length() != 0)) {
                C17480e c17480e2 = c17480eArr[i10];
                if (c17480e2.f55904d) {
                    if (c17480e2.f55903c) {
                        ArrayList arrayList2 = c17480e2.f55901a;
                        if (arrayList2.isEmpty() && c17480e2.f55902b.length() == 0) {
                            c17479d = null;
                        } else {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                                spannableStringBuilder.append((CharSequence) arrayList2.get(i11));
                                spannableStringBuilder.append('\n');
                            }
                            spannableStringBuilder.append((CharSequence) c17480e2.m19188b());
                            int i12 = c17480e2.f55911k;
                            if (i12 == 0) {
                                alignment = Layout.Alignment.ALIGN_NORMAL;
                            } else if (i12 == 1) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else if (i12 != 2) {
                                if (i12 != 3) {
                                    throw new IllegalArgumentException("Unexpected justification value: " + c17480e2.f55911k);
                                }
                                alignment = Layout.Alignment.ALIGN_NORMAL;
                            } else {
                                alignment = Layout.Alignment.ALIGN_CENTER;
                            }
                            Layout.Alignment alignment2 = alignment;
                            if (c17480e2.f55906f) {
                                f10 = c17480e2.f55908h / 99.0f;
                                f11 = c17480e2.f55907g / 99.0f;
                            } else {
                                f10 = c17480e2.f55908h / 209.0f;
                                f11 = c17480e2.f55907g / 74.0f;
                            }
                            float f12 = (f10 * 0.9f) + 0.05f;
                            float f13 = (f11 * 0.9f) + 0.05f;
                            int i13 = c17480e2.f55909i;
                            int i14 = i13 / 3;
                            int i15 = i14 == 0 ? 0 : i14 == 1 ? 1 : 2;
                            int i16 = i13 % 3;
                            int i17 = i16 == 0 ? 0 : i16 == 1 ? 1 : 2;
                            int i18 = c17480e2.f55914n;
                            c17479d = new C17479d(spannableStringBuilder, alignment2, f13, i15, f12, i17, i18 != C17480e.f55897w, i18, c17480e2.f55905e);
                        }
                    } else {
                        c17479d = null;
                    }
                    if (c17479d != null) {
                        arrayList.add(c17479d);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, C17479d.f55888c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            arrayList3.add(((C17479d) arrayList.get(i19)).f55889a);
        }
        return DesugarCollections.unmodifiableList(arrayList3);
    }

    /* JADX INFO: renamed from: l */
    public final void m19194l() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f55926l[i10].m19189d();
        }
    }
}

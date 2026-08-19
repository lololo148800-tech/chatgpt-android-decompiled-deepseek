package p247Jj;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p263K9.C4554A;
import p263K9.C4556C;
import p263K9.C4558E;
import p263K9.C4561H;
import p263K9.C4562I;
import p263K9.C4563J;
import p263K9.C4565L;
import p263K9.C4566M;
import p263K9.C4567N;
import p263K9.C4568O;
import p263K9.C4569P;
import p263K9.C4570Q;
import p263K9.C4571S;
import p263K9.C4572T;
import p263K9.C4573U;
import p263K9.C4574V;
import p263K9.C4575W;
import p263K9.C4578Z;
import p263K9.C4580a0;
import p263K9.C4581b;
import p263K9.C4582b0;
import p263K9.C4584d;
import p263K9.C4586f;
import p263K9.C4587g;
import p263K9.C4588h;
import p263K9.C4589i;
import p263K9.C4590j;
import p263K9.C4591k;
import p263K9.C4593m;
import p263K9.C4599s;
import p263K9.C4600t;
import p263K9.C4601u;
import p263K9.C4603w;
import p263K9.C4604x;
import p263K9.C4605y;
import p263K9.C4606z;
import p263K9.EnumC4555B;
import p263K9.EnumC4559F;
import p263K9.EnumC4560G;
import p263K9.EnumC4564K;
import p263K9.EnumC4583c;
import p263K9.EnumC4585e;
import p449S9.C7054X;
import p523V9.AbstractC8191s5;

/* JADX INFO: renamed from: Jj.T0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4409T0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14308a;

    public /* synthetic */ C4409T0(int i10) {
        this.f14308a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f14308a) {
            case 0:
                AbstractC16544l.m18094g(parcel, "parcel");
                parcel.readInt();
                return C4411U0.f14312Y;
            case 1:
                try {
                    return EnumC4583c.m5333a(parcel.readString());
                } catch (C4581b e10) {
                    throw new RuntimeException(e10);
                }
            case 2:
                int iM8789q = AbstractC8191s5.m8789q(parcel);
                boolean zM8782j = false;
                while (parcel.dataPosition() < iM8789q) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        AbstractC8191s5.m8788p(parcel, i10);
                    } else {
                        zM8782j = AbstractC8191s5.m8782j(parcel, i10);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q);
                return new C4582b0(zM8782j);
            case 3:
                int iM8789q2 = AbstractC8191s5.m8789q(parcel);
                long jM8786n = 0;
                while (parcel.dataPosition() < iM8789q2) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        AbstractC8191s5.m8788p(parcel, i11);
                    } else {
                        jM8786n = AbstractC8191s5.m8786n(parcel, i11);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q2);
                return new C4567N(jM8786n);
            case 4:
                int iM8789q3 = AbstractC8191s5.m8789q(parcel);
                boolean zM8782j2 = false;
                while (parcel.dataPosition() < iM8789q3) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 1) {
                        AbstractC8191s5.m8788p(parcel, i12);
                    } else {
                        zM8782j2 = AbstractC8191s5.m8782j(parcel, i12);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q3);
                return new C4568O(zM8782j2);
            case 5:
                int iM8789q4 = AbstractC8191s5.m8789q(parcel);
                boolean zM8782j3 = false;
                while (parcel.dataPosition() < iM8789q4) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 1) {
                        AbstractC8191s5.m8788p(parcel, i13);
                    } else {
                        zM8782j3 = AbstractC8191s5.m8782j(parcel, i13);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q4);
                return new C4600t(zM8782j3);
            case 6:
                int iM8789q5 = AbstractC8191s5.m8789q(parcel);
                String strM8776d = null;
                while (parcel.dataPosition() < iM8789q5) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 1) {
                        AbstractC8191s5.m8788p(parcel, i14);
                    } else {
                        strM8776d = AbstractC8191s5.m8776d(parcel, i14);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q5);
                return new C4569P(strM8776d);
            case 7:
                int iM8789q6 = AbstractC8191s5.m8789q(parcel);
                int iM8785m = 0;
                byte[] bArrM8774b = null;
                byte[] bArrM8774b2 = null;
                byte[] bArrM8774b3 = null;
                while (parcel.dataPosition() < iM8789q6) {
                    int i15 = parcel.readInt();
                    char c9 = (char) i15;
                    if (c9 == 1) {
                        bArrM8774b = AbstractC8191s5.m8774b(parcel, i15);
                    } else if (c9 == 2) {
                        bArrM8774b2 = AbstractC8191s5.m8774b(parcel, i15);
                    } else if (c9 == 3) {
                        bArrM8774b3 = AbstractC8191s5.m8774b(parcel, i15);
                    } else if (c9 != 4) {
                        AbstractC8191s5.m8788p(parcel, i15);
                    } else {
                        iM8785m = AbstractC8191s5.m8785m(parcel, i15);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q6);
                return new C4570Q(bArrM8774b == null ? null : C7054X.m7451s(bArrM8774b.length, bArrM8774b), bArrM8774b2 == null ? null : C7054X.m7451s(bArrM8774b2.length, bArrM8774b2), bArrM8774b3 != null ? C7054X.m7451s(bArrM8774b3.length, bArrM8774b3) : null, iM8785m);
            case 8:
                int iM8789q7 = AbstractC8191s5.m8789q(parcel);
                while (true) {
                    byte[][] bArr = null;
                    while (true) {
                        if (parcel.dataPosition() >= iM8789q7) {
                            AbstractC8191s5.m8781i(parcel, iM8789q7);
                            return new C4571S(bArr);
                        }
                        int i16 = parcel.readInt();
                        if (((char) i16) != 1) {
                            AbstractC8191s5.m8788p(parcel, i16);
                        } else {
                            int iM8787o = AbstractC8191s5.m8787o(parcel, i16);
                            int iDataPosition = parcel.dataPosition();
                            if (iM8787o == 0) {
                            }
                            int i17 = parcel.readInt();
                            byte[][] bArr2 = new byte[i17][];
                            for (int i18 = 0; i18 < i17; i18++) {
                                bArr2[i18] = parcel.createByteArray();
                            }
                            parcel.setDataPosition(iDataPosition + iM8787o);
                            bArr = bArr2;
                        }
                        break;
                    }
                }
                break;
            case 9:
                int iM8789q8 = AbstractC8191s5.m8789q(parcel);
                C4606z c4606z = null;
                C4556C c4556c = null;
                byte[] bArrM8774b4 = null;
                ArrayList arrayListM8779g = null;
                Double dValueOf = null;
                ArrayList arrayListM8779g2 = null;
                C4593m c4593m = null;
                Integer numValueOf = null;
                C4562I c4562i = null;
                String strM8776d2 = null;
                C4586f c4586f = null;
                String strM8776d3 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < iM8789q8) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 2:
                            c4606z = (C4606z) AbstractC8191s5.m8775c(parcel, i19, C4606z.CREATOR);
                            break;
                        case 3:
                            c4556c = (C4556C) AbstractC8191s5.m8775c(parcel, i19, C4556C.CREATOR);
                            break;
                        case 4:
                            bArrM8774b4 = AbstractC8191s5.m8774b(parcel, i19);
                            break;
                        case 5:
                            arrayListM8779g = AbstractC8191s5.m8779g(parcel, i19, C4605y.CREATOR);
                            break;
                        case 6:
                            int iM8787o2 = AbstractC8191s5.m8787o(parcel, i19);
                            if (iM8787o2 == 0) {
                                dValueOf = null;
                            } else {
                                AbstractC8191s5.m8790r(parcel, iM8787o2, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                            }
                            break;
                        case 7:
                            arrayListM8779g2 = AbstractC8191s5.m8779g(parcel, i19, C4604x.CREATOR);
                            break;
                        case '\b':
                            c4593m = (C4593m) AbstractC8191s5.m8775c(parcel, i19, C4593m.CREATOR);
                            break;
                        case '\t':
                            int iM8787o3 = AbstractC8191s5.m8787o(parcel, i19);
                            if (iM8787o3 == 0) {
                                numValueOf = null;
                            } else {
                                AbstractC8191s5.m8790r(parcel, iM8787o3, 4);
                                numValueOf = Integer.valueOf(parcel.readInt());
                            }
                            break;
                        case '\n':
                            c4562i = (C4562I) AbstractC8191s5.m8775c(parcel, i19, C4562I.CREATOR);
                            break;
                        case 11:
                            strM8776d2 = AbstractC8191s5.m8776d(parcel, i19);
                            break;
                        case '\f':
                            c4586f = (C4586f) AbstractC8191s5.m8775c(parcel, i19, C4586f.CREATOR);
                            break;
                        case '\r':
                            strM8776d3 = AbstractC8191s5.m8776d(parcel, i19);
                            break;
                        case 14:
                            resultReceiver = (ResultReceiver) AbstractC8191s5.m8775c(parcel, i19, ResultReceiver.CREATOR);
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i19);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q8);
                return new C4603w(c4606z, c4556c, bArrM8774b4, arrayListM8779g, dValueOf, arrayListM8779g2, c4593m, numValueOf, c4562i, strM8776d2, c4586f, strM8776d3, resultReceiver);
            case 10:
                int iM8789q9 = AbstractC8191s5.m8789q(parcel);
                String strM8776d4 = null;
                String strM8776d5 = null;
                byte[] bArrM8774b5 = null;
                C4590j c4590j = null;
                C4589i c4589i = null;
                C4591k c4591k = null;
                C4587g c4587g = null;
                String strM8776d6 = null;
                while (parcel.dataPosition() < iM8789q9) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            strM8776d4 = AbstractC8191s5.m8776d(parcel, i20);
                            break;
                        case 2:
                            strM8776d5 = AbstractC8191s5.m8776d(parcel, i20);
                            break;
                        case 3:
                            bArrM8774b5 = AbstractC8191s5.m8774b(parcel, i20);
                            break;
                        case 4:
                            c4590j = (C4590j) AbstractC8191s5.m8775c(parcel, i20, C4590j.CREATOR);
                            break;
                        case 5:
                            c4589i = (C4589i) AbstractC8191s5.m8775c(parcel, i20, C4589i.CREATOR);
                            break;
                        case 6:
                            c4591k = (C4591k) AbstractC8191s5.m8775c(parcel, i20, C4591k.CREATOR);
                            break;
                        case 7:
                            c4587g = (C4587g) AbstractC8191s5.m8775c(parcel, i20, C4587g.CREATOR);
                            break;
                        case '\b':
                            strM8776d6 = AbstractC8191s5.m8776d(parcel, i20);
                            break;
                        case '\t':
                            AbstractC8191s5.m8776d(parcel, i20);
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i20);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q9);
                return new C4601u(strM8776d4, strM8776d5, bArrM8774b5, c4590j, c4589i, c4591k, c4587g, strM8776d6);
            case 11:
                int iM8789q10 = AbstractC8191s5.m8789q(parcel);
                String strM8776d7 = null;
                byte[] bArrM8774b6 = null;
                ArrayList arrayListM8779g3 = null;
                while (parcel.dataPosition() < iM8789q10) {
                    int i21 = parcel.readInt();
                    char c10 = (char) i21;
                    if (c10 == 2) {
                        strM8776d7 = AbstractC8191s5.m8776d(parcel, i21);
                    } else if (c10 == 3) {
                        bArrM8774b6 = AbstractC8191s5.m8774b(parcel, i21);
                    } else if (c10 != 4) {
                        AbstractC8191s5.m8788p(parcel, i21);
                    } else {
                        arrayListM8779g3 = AbstractC8191s5.m8779g(parcel, i21, Transport.CREATOR);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q10);
                return new C4604x(strM8776d7, bArrM8774b6, arrayListM8779g3);
            case 12:
                int iM8789q11 = AbstractC8191s5.m8789q(parcel);
                String strM8776d8 = null;
                Integer numValueOf2 = null;
                while (parcel.dataPosition() < iM8789q11) {
                    int i22 = parcel.readInt();
                    char c11 = (char) i22;
                    if (c11 == 2) {
                        strM8776d8 = AbstractC8191s5.m8776d(parcel, i22);
                    } else if (c11 != 3) {
                        AbstractC8191s5.m8788p(parcel, i22);
                    } else {
                        int iM8787o4 = AbstractC8191s5.m8787o(parcel, i22);
                        if (iM8787o4 == 0) {
                            numValueOf2 = null;
                        } else {
                            AbstractC8191s5.m8790r(parcel, iM8787o4, 4);
                            numValueOf2 = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q11);
                return new C4605y(strM8776d8, numValueOf2.intValue());
            case 13:
                int iM8789q12 = AbstractC8191s5.m8789q(parcel);
                String strM8776d9 = null;
                String strM8776d10 = null;
                String strM8776d11 = null;
                while (parcel.dataPosition() < iM8789q12) {
                    int i23 = parcel.readInt();
                    char c12 = (char) i23;
                    if (c12 == 2) {
                        strM8776d9 = AbstractC8191s5.m8776d(parcel, i23);
                    } else if (c12 == 3) {
                        strM8776d10 = AbstractC8191s5.m8776d(parcel, i23);
                    } else if (c12 != 4) {
                        AbstractC8191s5.m8788p(parcel, i23);
                    } else {
                        strM8776d11 = AbstractC8191s5.m8776d(parcel, i23);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q12);
                return new C4606z(strM8776d9, strM8776d10, strM8776d11);
            case 14:
                try {
                    return EnumC4555B.m5321a(parcel.readString());
                } catch (C4554A e11) {
                    throw new RuntimeException(e11);
                }
            case 15:
                int iM8789q13 = AbstractC8191s5.m8789q(parcel);
                byte[] bArrM8774b7 = null;
                String strM8776d12 = null;
                String strM8776d13 = null;
                String strM8776d14 = null;
                while (parcel.dataPosition() < iM8789q13) {
                    int i24 = parcel.readInt();
                    char c13 = (char) i24;
                    if (c13 == 2) {
                        bArrM8774b7 = AbstractC8191s5.m8774b(parcel, i24);
                    } else if (c13 == 3) {
                        strM8776d12 = AbstractC8191s5.m8776d(parcel, i24);
                    } else if (c13 == 4) {
                        strM8776d13 = AbstractC8191s5.m8776d(parcel, i24);
                    } else if (c13 != 5) {
                        AbstractC8191s5.m8788p(parcel, i24);
                    } else {
                        strM8776d14 = AbstractC8191s5.m8776d(parcel, i24);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q13);
                return new C4556C(strM8776d12, strM8776d13, strM8776d14, bArrM8774b7);
            case 16:
                String string = parcel.readString();
                if (string == null) {
                    string = "";
                }
                try {
                    return EnumC4559F.m5323a(string);
                } catch (C4558E e12) {
                    throw new RuntimeException(e12);
                }
            case 17:
                int iM8789q14 = AbstractC8191s5.m8789q(parcel);
                String strM8776d15 = null;
                while (parcel.dataPosition() < iM8789q14) {
                    int i25 = parcel.readInt();
                    if (((char) i25) != 1) {
                        AbstractC8191s5.m8788p(parcel, i25);
                    } else {
                        strM8776d15 = AbstractC8191s5.m8776d(parcel, i25);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q14);
                return new C4572T(strM8776d15);
            case 18:
                try {
                    return EnumC4560G.m5324a(parcel.readString());
                } catch (C4561H e13) {
                    throw new RuntimeException(e13);
                }
            case 19:
                int iM8789q15 = AbstractC8191s5.m8789q(parcel);
                String strM8776d16 = null;
                String strM8776d17 = null;
                while (parcel.dataPosition() < iM8789q15) {
                    int i26 = parcel.readInt();
                    char c14 = (char) i26;
                    if (c14 == 2) {
                        strM8776d16 = AbstractC8191s5.m8776d(parcel, i26);
                    } else if (c14 != 3) {
                        AbstractC8191s5.m8788p(parcel, i26);
                    } else {
                        strM8776d17 = AbstractC8191s5.m8776d(parcel, i26);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q15);
                return new C4562I(strM8776d16, strM8776d17);
            case 20:
                try {
                    return EnumC4585e.m5334a(parcel.readString());
                } catch (C4584d e14) {
                    throw new RuntimeException(e14);
                }
            case 21:
                int iM8789q16 = AbstractC8191s5.m8789q(parcel);
                boolean zM8782j4 = false;
                while (parcel.dataPosition() < iM8789q16) {
                    int i27 = parcel.readInt();
                    if (((char) i27) != 1) {
                        AbstractC8191s5.m8788p(parcel, i27);
                    } else {
                        zM8782j4 = AbstractC8191s5.m8782j(parcel, i27);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q16);
                return new C4563J(zM8782j4);
            case 22:
                try {
                    return EnumC4564K.m5325a(parcel.readString());
                } catch (C4573U e15) {
                    throw new RuntimeException(e15);
                }
            case 23:
                int iM8789q17 = AbstractC8191s5.m8789q(parcel);
                ArrayList arrayListM8779g4 = null;
                while (parcel.dataPosition() < iM8789q17) {
                    int i28 = parcel.readInt();
                    if (((char) i28) != 1) {
                        AbstractC8191s5.m8788p(parcel, i28);
                    } else {
                        arrayListM8779g4 = AbstractC8191s5.m8779g(parcel, i28, C4566M.CREATOR);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q17);
                return new C4565L(arrayListM8779g4);
            case 24:
                int iM8789q18 = AbstractC8191s5.m8789q(parcel);
                int iM8785m2 = 0;
                short s10 = 0;
                short s11 = 0;
                while (parcel.dataPosition() < iM8789q18) {
                    int i29 = parcel.readInt();
                    char c15 = (char) i29;
                    if (c15 == 1) {
                        iM8785m2 = AbstractC8191s5.m8785m(parcel, i29);
                    } else if (c15 == 2) {
                        AbstractC8191s5.m8791s(parcel, i29, 4);
                        s10 = (short) parcel.readInt();
                    } else if (c15 != 3) {
                        AbstractC8191s5.m8788p(parcel, i29);
                    } else {
                        AbstractC8191s5.m8791s(parcel, i29, 4);
                        s11 = (short) parcel.readInt();
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q18);
                return new C4566M(iM8785m2, s10, s11);
            case 25:
                int iM8789q19 = AbstractC8191s5.m8789q(parcel);
                C4565L c4565l = null;
                C4574V c4574v = null;
                C4588h c4588h = null;
                C4575W c4575w = null;
                String strM8776d18 = null;
                while (parcel.dataPosition() < iM8789q19) {
                    int i30 = parcel.readInt();
                    char c16 = (char) i30;
                    if (c16 == 1) {
                        c4565l = (C4565L) AbstractC8191s5.m8775c(parcel, i30, C4565L.CREATOR);
                    } else if (c16 == 2) {
                        c4574v = (C4574V) AbstractC8191s5.m8775c(parcel, i30, C4574V.CREATOR);
                    } else if (c16 == 3) {
                        c4588h = (C4588h) AbstractC8191s5.m8775c(parcel, i30, C4588h.CREATOR);
                    } else if (c16 == 4) {
                        c4575w = (C4575W) AbstractC8191s5.m8775c(parcel, i30, C4575W.CREATOR);
                    } else if (c16 != 5) {
                        AbstractC8191s5.m8788p(parcel, i30);
                    } else {
                        strM8776d18 = AbstractC8191s5.m8776d(parcel, i30);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q19);
                return new C4587g(c4565l, c4574v, c4588h, c4575w, strM8776d18);
            case 26:
                int iM8789q20 = AbstractC8191s5.m8789q(parcel);
                C4599s c4599s = null;
                C4578Z c4578z = null;
                C4563J c4563j = null;
                C4582b0 c4582b0 = null;
                C4567N c4567n = null;
                C4568O c4568o = null;
                C4580a0 c4580a0 = null;
                C4569P c4569p = null;
                C4600t c4600t = null;
                C4571S c4571s = null;
                C4572T c4572t = null;
                C4570Q c4570q = null;
                while (parcel.dataPosition() < iM8789q20) {
                    int i31 = parcel.readInt();
                    switch ((char) i31) {
                        case 2:
                            c4599s = (C4599s) AbstractC8191s5.m8775c(parcel, i31, C4599s.CREATOR);
                            break;
                        case 3:
                            c4578z = (C4578Z) AbstractC8191s5.m8775c(parcel, i31, C4578Z.CREATOR);
                            break;
                        case 4:
                            c4563j = (C4563J) AbstractC8191s5.m8775c(parcel, i31, C4563J.CREATOR);
                            break;
                        case 5:
                            c4582b0 = (C4582b0) AbstractC8191s5.m8775c(parcel, i31, C4582b0.CREATOR);
                            break;
                        case 6:
                            c4567n = (C4567N) AbstractC8191s5.m8775c(parcel, i31, C4567N.CREATOR);
                            break;
                        case 7:
                            c4568o = (C4568O) AbstractC8191s5.m8775c(parcel, i31, C4568O.CREATOR);
                            break;
                        case '\b':
                            c4580a0 = (C4580a0) AbstractC8191s5.m8775c(parcel, i31, C4580a0.CREATOR);
                            break;
                        case '\t':
                            c4569p = (C4569P) AbstractC8191s5.m8775c(parcel, i31, C4569P.CREATOR);
                            break;
                        case '\n':
                            c4600t = (C4600t) AbstractC8191s5.m8775c(parcel, i31, C4600t.CREATOR);
                            break;
                        case 11:
                            c4571s = (C4571S) AbstractC8191s5.m8775c(parcel, i31, C4571S.CREATOR);
                            break;
                        case '\f':
                            c4572t = (C4572T) AbstractC8191s5.m8775c(parcel, i31, C4572T.CREATOR);
                            break;
                        case '\r':
                            c4570q = (C4570Q) AbstractC8191s5.m8775c(parcel, i31, C4570Q.CREATOR);
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i31);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q20);
                return new C4586f(c4599s, c4578z, c4563j, c4582b0, c4567n, c4568o, c4580a0, c4569p, c4600t, c4571s, c4572t, c4570q);
            case 27:
                int iM8789q21 = AbstractC8191s5.m8789q(parcel);
                boolean zM8782j5 = false;
                while (parcel.dataPosition() < iM8789q21) {
                    int i32 = parcel.readInt();
                    if (((char) i32) != 1) {
                        AbstractC8191s5.m8788p(parcel, i32);
                    } else {
                        zM8782j5 = AbstractC8191s5.m8782j(parcel, i32);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q21);
                return new C4588h(zM8782j5);
            case 28:
                int iM8789q22 = AbstractC8191s5.m8789q(parcel);
                byte[] bArrM8774b8 = null;
                byte[] bArrM8774b9 = null;
                while (parcel.dataPosition() < iM8789q22) {
                    int i33 = parcel.readInt();
                    char c17 = (char) i33;
                    if (c17 == 1) {
                        bArrM8774b8 = AbstractC8191s5.m8774b(parcel, i33);
                    } else if (c17 != 2) {
                        AbstractC8191s5.m8788p(parcel, i33);
                    } else {
                        bArrM8774b9 = AbstractC8191s5.m8774b(parcel, i33);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q22);
                return new C4574V(bArrM8774b8 == null ? null : C7054X.m7451s(bArrM8774b8.length, bArrM8774b8), bArrM8774b9 != null ? C7054X.m7451s(bArrM8774b9.length, bArrM8774b9) : null);
            default:
                int iM8789q23 = AbstractC8191s5.m8789q(parcel);
                boolean zM8782j6 = false;
                byte[] bArrM8774b10 = null;
                while (parcel.dataPosition() < iM8789q23) {
                    int i34 = parcel.readInt();
                    char c18 = (char) i34;
                    if (c18 == 1) {
                        zM8782j6 = AbstractC8191s5.m8782j(parcel, i34);
                    } else if (c18 != 2) {
                        AbstractC8191s5.m8788p(parcel, i34);
                    } else {
                        bArrM8774b10 = AbstractC8191s5.m8774b(parcel, i34);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q23);
                return new C4575W(zM8782j6, bArrM8774b10 != null ? C7054X.m7451s(bArrM8774b10.length, bArrM8774b10) : null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f14308a) {
            case 0:
                return new C4411U0[i10];
            case 1:
                return new EnumC4583c[i10];
            case 2:
                return new C4582b0[i10];
            case 3:
                return new C4567N[i10];
            case 4:
                return new C4568O[i10];
            case 5:
                return new C4600t[i10];
            case 6:
                return new C4569P[i10];
            case 7:
                return new C4570Q[i10];
            case 8:
                return new C4571S[i10];
            case 9:
                return new C4603w[i10];
            case 10:
                return new C4601u[i10];
            case 11:
                return new C4604x[i10];
            case 12:
                return new C4605y[i10];
            case 13:
                return new C4606z[i10];
            case 14:
                return new EnumC4555B[i10];
            case 15:
                return new C4556C[i10];
            case 16:
                return new EnumC4559F[i10];
            case 17:
                return new C4572T[i10];
            case 18:
                return new EnumC4560G[i10];
            case 19:
                return new C4562I[i10];
            case 20:
                return new EnumC4585e[i10];
            case 21:
                return new C4563J[i10];
            case 22:
                return new EnumC4564K[i10];
            case 23:
                return new C4565L[i10];
            case 24:
                return new C4566M[i10];
            case 25:
                return new C4587g[i10];
            case 26:
                return new C4586f[i10];
            case 27:
                return new C4588h[i10];
            case 28:
                return new C4574V[i10];
            default:
                return new C4575W[i10];
        }
    }
}

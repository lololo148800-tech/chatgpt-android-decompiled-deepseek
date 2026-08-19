package p696d4;

import android.os.Parcel;
import android.os.Parcelable;
import bb.AbstractC11278C;
import bb.C11294T;
import java.util.ArrayList;
import p003A1.AbstractC0168G;
import p1016t3.C19799z;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p647ak.C10707i0;
import p725eb.AbstractC13358c;

/* JADX INFO: renamed from: d4.n */
/* JADX INFO: loaded from: classes.dex */
public final class C13016n extends AbstractC13011i {
    public static final Parcelable.Creator<C13016n> CREATOR = new C10707i0(24);

    /* JADX INFO: renamed from: Z */
    public final String f41298Z;

    /* JADX INFO: renamed from: o0 */
    public final AbstractC11278C f41299o0;

    public C13016n(String str, String str2, C11294T c11294t) {
        super(str);
        AbstractC20800b.m21316d(!c11294t.isEmpty());
        this.f41298Z = str2;
        AbstractC11278C abstractC11278CM12691t = AbstractC11278C.m12691t(c11294t);
        this.f41299o0 = abstractC11278CM12691t;
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList m14760a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:117:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:4:0x0019  */
    @Override // p696d4.AbstractC13011i, p1016t3.InterfaceC19752B
    /* JADX INFO: renamed from: S */
    public final void mo10752S(C19799z c19799z) {
        byte b;
        byte b10;
        Long lValueOf;
        byte b11;
        byte b12 = 10;
        String str = this.f41286Y;
        str.getClass();
        AbstractC11278C abstractC11278C = this.f41299o0;
        switch (str) {
            case "TAL":
                b = 0;
                break;
            case "TCM":
                b = 1;
                break;
            case "TDA":
                b = 2;
                break;
            case "TP1":
                b = 3;
                break;
            case "TP2":
                b = 4;
                break;
            case "TP3":
                b = 5;
                break;
            case "TRK":
                b = 6;
                break;
            case "TT2":
                b = 7;
                break;
            case "TXT":
                b = 8;
                break;
            case "TYE":
                b = 9;
                break;
            case "TALB":
                b = 10;
                break;
            case "TCOM":
                b = 11;
                break;
            case "TCON":
                b = 12;
                break;
            case "TDAT":
                b = 13;
                break;
            case "TDRC":
                b = 14;
                break;
            case "TDRL":
                b = 15;
                break;
            case "TEXT":
                b = 16;
                break;
            case "TIT2":
                b = 17;
                break;
            case "TPE1":
                b = 18;
                break;
            case "TPE2":
                b = 19;
                break;
            case "TPE3":
                b = 20;
                break;
            case "TRCK":
                b = 21;
                break;
            case "TYER":
                b = 22;
                break;
            default:
                b = -1;
                break;
        }
        try {
            switch (b) {
                case 0:
                case 10:
                    c19799z.f62795c = (CharSequence) abstractC11278C.get(0);
                    break;
                case 1:
                case 11:
                    c19799z.f62811s = (CharSequence) abstractC11278C.get(0);
                    break;
                case 2:
                case 13:
                    String str2 = (String) abstractC11278C.get(0);
                    int i10 = Integer.parseInt(str2.substring(2, 4));
                    int i11 = Integer.parseInt(str2.substring(0, 2));
                    c19799z.m20758d(Integer.valueOf(i10));
                    c19799z.m20757c(Integer.valueOf(i11));
                    break;
                case 3:
                case 18:
                    c19799z.f62794b = (CharSequence) abstractC11278C.get(0);
                    break;
                case 4:
                case 19:
                    c19799z.f62796d = (CharSequence) abstractC11278C.get(0);
                    break;
                case 5:
                case 20:
                    c19799z.f62812t = (CharSequence) abstractC11278C.get(0);
                    break;
                case 6:
                case 21:
                    String[] strArrM21398L = AbstractC20817s.m21398L((String) abstractC11278C.get(0));
                    int i12 = Integer.parseInt(strArrM21398L[0]);
                    Integer numValueOf = strArrM21398L.length > 1 ? Integer.valueOf(Integer.parseInt(strArrM21398L[1])) : null;
                    c19799z.f62800h = Integer.valueOf(i12);
                    c19799z.f62801i = numValueOf;
                    break;
                case 7:
                case 17:
                    c19799z.f62793a = (CharSequence) abstractC11278C.get(0);
                    break;
                case 8:
                case 16:
                    c19799z.f62810r = (CharSequence) abstractC11278C.get(0);
                    break;
                case 9:
                case 22:
                    c19799z.m20759e(Integer.valueOf(Integer.parseInt((String) abstractC11278C.get(0))));
                    break;
                case 12:
                    String str3 = (String) abstractC11278C.get(0);
                    str3.getClass();
                    if (str3.isEmpty()) {
                        lValueOf = null;
                    } else {
                        int i13 = str3.charAt(0) == '-' ? 1 : 0;
                        if (i13 == str3.length()) {
                            lValueOf = null;
                        } else {
                            int i14 = i13 + 1;
                            char cCharAt = str3.charAt(i13);
                            if (cCharAt < 128) {
                                b10 = AbstractC13358c.f42399a[cCharAt];
                            } else {
                                byte[] bArr = AbstractC13358c.f42399a;
                                b10 = -1;
                            }
                            if (b10 < 0 || b10 >= 10) {
                                lValueOf = null;
                            } else {
                                long j10 = -b10;
                                long j11 = 10;
                                long j12 = Long.MIN_VALUE / j11;
                                while (true) {
                                    if (i14 < str3.length()) {
                                        int i15 = i14 + 1;
                                        char cCharAt2 = str3.charAt(i14);
                                        if (cCharAt2 < 128) {
                                            b11 = AbstractC13358c.f42399a[cCharAt2];
                                        } else {
                                            byte[] bArr2 = AbstractC13358c.f42399a;
                                            b11 = -1;
                                        }
                                        if (b11 >= 0 && b11 < b12 && j10 >= j12) {
                                            long j13 = j10 * j11;
                                            long j14 = b11;
                                            if (j13 >= j14 - Long.MIN_VALUE) {
                                                j10 = j13 - j14;
                                                i14 = i15;
                                                b12 = 10;
                                            }
                                        }
                                    } else if (i13 != 0) {
                                        lValueOf = Long.valueOf(j10);
                                    } else if (j10 != Long.MIN_VALUE) {
                                        lValueOf = Long.valueOf(-j10);
                                    }
                                    lValueOf = null;
                                }
                            }
                        }
                    }
                    Integer numValueOf2 = (lValueOf == null || lValueOf.longValue() != ((long) lValueOf.intValue())) ? null : Integer.valueOf(lValueOf.intValue());
                    if (numValueOf2 != null) {
                        String strM14759a = AbstractC13012j.m14759a(numValueOf2.intValue());
                        if (strM14759a != null) {
                            c19799z.m20756b(strM14759a);
                        }
                    } else {
                        c19799z.m20756b((CharSequence) abstractC11278C.get(0));
                    }
                    break;
                case 14:
                    ArrayList arrayListM14760a = m14760a((String) abstractC11278C.get(0));
                    int size = arrayListM14760a.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                c19799z.m20757c((Integer) arrayListM14760a.get(2));
                            }
                        }
                        c19799z.m20758d((Integer) arrayListM14760a.get(1));
                    }
                    c19799z.m20759e((Integer) arrayListM14760a.get(0));
                    break;
                case 15:
                    ArrayList arrayListM14760a2 = m14760a((String) abstractC11278C.get(0));
                    int size2 = arrayListM14760a2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                c19799z.f62809q = (Integer) arrayListM14760a2.get(2);
                            }
                        }
                        c19799z.f62808p = (Integer) arrayListM14760a2.get(1);
                    }
                    c19799z.f62807o = (Integer) arrayListM14760a2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13016n.class != obj.getClass()) {
            return false;
        }
        C13016n c13016n = (C13016n) obj;
        return AbstractC20817s.m21400a(this.f41286Y, c13016n.f41286Y) && AbstractC20817s.m21400a(this.f41298Z, c13016n.f41298Z) && this.f41299o0.equals(c13016n.f41299o0);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(527, 31, this.f41286Y);
        String str = this.f41298Z;
        return this.f41299o0.hashCode() + ((iM527p + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // p696d4.AbstractC13011i
    public final String toString() {
        return this.f41286Y + ": description=" + this.f41298Z + ": values=" + this.f41299o0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f41286Y);
        parcel.writeString(this.f41298Z);
        parcel.writeStringArray((String[]) this.f41299o0.toArray(new String[0]));
    }
}

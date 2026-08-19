package p718e4;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ge.C14026F0;
import ge.EnumC14097q0;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import lk.C17062e;
import lk.EnumC17058a;
import lk.EnumC17061d;
import mk.C17280a;
import p263K9.C4601u;
import p523V9.AbstractC8191s5;
import p740f4.C13532a;
import p740f4.C13536e;
import p740f4.C13537f;
import p740f4.C13540i;
import p740f4.C13541j;
import p762g4.C13815a;
import p841k.C16281a;
import p841k.C16290j;
import p868l9.C16834b;
import p903n9.C17527a;
import p903n9.C17528b;
import p903n9.C17529c;
import p903n9.C17530d;
import p903n9.C17531e;
import p903n9.C17532f;
import p903n9.C17533g;
import p903n9.C17534h;
import p903n9.C17535i;
import p903n9.C17536j;
import p903n9.C17537k;
import p960q9.C18647a;

/* JADX INFO: renamed from: e4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13280a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41978a;

    public /* synthetic */ C13280a(int i10) {
        this.f41978a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f41978a) {
            case 0:
                return new C13281b(parcel);
            case 1:
                ArrayList arrayList = new ArrayList();
                parcel.readList(arrayList, C13282c.class.getClassLoader());
                return new C13283d(arrayList);
            case 2:
                return new C13282c(parcel.readLong(), parcel.readInt(), parcel.readLong());
            case 3:
                return new C13284e(parcel);
            case 4:
                return new C13532a(parcel);
            case 5:
                return new C13536e(parcel);
            case 6:
                return new C13537f();
            case 7:
                return new C13540i(parcel);
            case 8:
                return new C13541j(parcel.readLong(), parcel.readLong());
            case 9:
                return new C13815a(parcel);
            case 10:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C14026F0(parcel.readInt(), EnumC14097q0.valueOf(parcel.readString()));
            case 11:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C16281a(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
            case 12:
                AbstractC16544l.m18094g(parcel, "inParcel");
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                AbstractC16544l.m18091d(parcelable);
                return new C16290j((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 13:
                int iM8789q = AbstractC8191s5.m8789q(parcel);
                String strM8776d = null;
                int iM8785m = 0;
                while (parcel.dataPosition() < iM8789q) {
                    int i10 = parcel.readInt();
                    char c9 = (char) i10;
                    if (c9 == 1) {
                        strM8776d = AbstractC8191s5.m8776d(parcel, i10);
                    } else if (c9 != 2) {
                        AbstractC8191s5.m8788p(parcel, i10);
                    } else {
                        iM8785m = AbstractC8191s5.m8785m(parcel, i10);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q);
                return new C16834b(strM8776d, iM8785m);
            case 14:
                AbstractC16544l.m18094g(parcel, "parcel");
                return EnumC17058a.valueOf(parcel.readString());
            case 15:
                AbstractC16544l.m18094g(parcel, "parcel");
                return EnumC17061d.valueOf(parcel.readString());
            case 16:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C17062e(EnumC17058a.CREATOR.createFromParcel(parcel), EnumC17061d.CREATOR.createFromParcel(parcel));
            case 17:
                AbstractC16544l.m18094g(parcel, "parcel");
                return new C17280a(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 18:
                int iM8789q2 = AbstractC8191s5.m8789q(parcel);
                boolean zM8782j = false;
                int iM8785m2 = 0;
                boolean zM8782j2 = false;
                C17530d c17530d = null;
                C17527a c17527a = null;
                String strM8776d2 = null;
                C17529c c17529c = null;
                C17528b c17528b = null;
                while (parcel.dataPosition() < iM8789q2) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            c17530d = (C17530d) AbstractC8191s5.m8775c(parcel, i11, C17530d.CREATOR);
                            break;
                        case 2:
                            c17527a = (C17527a) AbstractC8191s5.m8775c(parcel, i11, C17527a.CREATOR);
                            break;
                        case 3:
                            strM8776d2 = AbstractC8191s5.m8776d(parcel, i11);
                            break;
                        case 4:
                            zM8782j = AbstractC8191s5.m8782j(parcel, i11);
                            break;
                        case 5:
                            iM8785m2 = AbstractC8191s5.m8785m(parcel, i11);
                            break;
                        case 6:
                            c17529c = (C17529c) AbstractC8191s5.m8775c(parcel, i11, C17529c.CREATOR);
                            break;
                        case 7:
                            c17528b = (C17528b) AbstractC8191s5.m8775c(parcel, i11, C17528b.CREATOR);
                            break;
                        case '\b':
                            zM8782j2 = AbstractC8191s5.m8782j(parcel, i11);
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i11);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q2);
                return new C17531e(c17530d, c17527a, strM8776d2, zM8782j, iM8785m2, c17529c, c17528b, zM8782j2);
            case 19:
                int iM8789q3 = AbstractC8191s5.m8789q(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iM8789q3) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 1) {
                        AbstractC8191s5.m8788p(parcel, i12);
                    } else {
                        pendingIntent = (PendingIntent) AbstractC8191s5.m8775c(parcel, i12, PendingIntent.CREATOR);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q3);
                return new C17532f(pendingIntent);
            case 20:
                int iM8789q4 = AbstractC8191s5.m8789q(parcel);
                int iM8785m3 = 0;
                boolean zM8782j3 = false;
                String strM8776d3 = null;
                String strM8776d4 = null;
                String strM8776d5 = null;
                String strM8776d6 = null;
                while (parcel.dataPosition() < iM8789q4) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            strM8776d3 = AbstractC8191s5.m8776d(parcel, i13);
                            break;
                        case 2:
                            strM8776d4 = AbstractC8191s5.m8776d(parcel, i13);
                            break;
                        case 3:
                            strM8776d5 = AbstractC8191s5.m8776d(parcel, i13);
                            break;
                        case 4:
                            strM8776d6 = AbstractC8191s5.m8776d(parcel, i13);
                            break;
                        case 5:
                            zM8782j3 = AbstractC8191s5.m8782j(parcel, i13);
                            break;
                        case 6:
                            iM8785m3 = AbstractC8191s5.m8785m(parcel, i13);
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i13);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q4);
                return new C17533g(strM8776d3, iM8785m3, strM8776d4, zM8782j3, strM8776d5, strM8776d6);
            case 21:
                int iM8789q5 = AbstractC8191s5.m8789q(parcel);
                boolean zM8782j4 = false;
                boolean zM8782j5 = false;
                boolean zM8782j6 = false;
                String strM8776d7 = null;
                String strM8776d8 = null;
                String strM8776d9 = null;
                ArrayList<String> arrayListCreateStringArrayList = null;
                while (parcel.dataPosition() < iM8789q5) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            zM8782j4 = AbstractC8191s5.m8782j(parcel, i14);
                            break;
                        case 2:
                            strM8776d7 = AbstractC8191s5.m8776d(parcel, i14);
                            break;
                        case 3:
                            strM8776d8 = AbstractC8191s5.m8776d(parcel, i14);
                            break;
                        case 4:
                            zM8782j5 = AbstractC8191s5.m8782j(parcel, i14);
                            break;
                        case 5:
                            strM8776d9 = AbstractC8191s5.m8776d(parcel, i14);
                            break;
                        case 6:
                            int iM8787o = AbstractC8191s5.m8787o(parcel, i14);
                            int iDataPosition = parcel.dataPosition();
                            if (iM8787o != 0) {
                                arrayListCreateStringArrayList = parcel.createStringArrayList();
                                parcel.setDataPosition(iDataPosition + iM8787o);
                            } else {
                                arrayListCreateStringArrayList = null;
                            }
                            break;
                        case 7:
                            zM8782j6 = AbstractC8191s5.m8782j(parcel, i14);
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i14);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q5);
                return new C17527a(zM8782j4, strM8776d7, strM8776d8, zM8782j5, strM8776d9, arrayListCreateStringArrayList, zM8782j6);
            case 22:
                int iM8789q6 = AbstractC8191s5.m8789q(parcel);
                String strM8776d10 = null;
                boolean zM8782j7 = false;
                while (parcel.dataPosition() < iM8789q6) {
                    int i15 = parcel.readInt();
                    char c10 = (char) i15;
                    if (c10 == 1) {
                        zM8782j7 = AbstractC8191s5.m8782j(parcel, i15);
                    } else if (c10 != 2) {
                        AbstractC8191s5.m8788p(parcel, i15);
                    } else {
                        strM8776d10 = AbstractC8191s5.m8776d(parcel, i15);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q6);
                return new C17528b(strM8776d10, zM8782j7);
            case 23:
                int iM8789q7 = AbstractC8191s5.m8789q(parcel);
                byte[] bArrM8774b = null;
                boolean zM8782j8 = false;
                String strM8776d11 = null;
                while (parcel.dataPosition() < iM8789q7) {
                    int i16 = parcel.readInt();
                    char c11 = (char) i16;
                    if (c11 == 1) {
                        zM8782j8 = AbstractC8191s5.m8782j(parcel, i16);
                    } else if (c11 == 2) {
                        bArrM8774b = AbstractC8191s5.m8774b(parcel, i16);
                    } else if (c11 != 3) {
                        AbstractC8191s5.m8788p(parcel, i16);
                    } else {
                        strM8776d11 = AbstractC8191s5.m8776d(parcel, i16);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q7);
                return new C17529c(zM8782j8, bArrM8774b, strM8776d11);
            case 24:
                int iM8789q8 = AbstractC8191s5.m8789q(parcel);
                boolean zM8782j9 = false;
                while (parcel.dataPosition() < iM8789q8) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 1) {
                        AbstractC8191s5.m8788p(parcel, i17);
                    } else {
                        zM8782j9 = AbstractC8191s5.m8782j(parcel, i17);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q8);
                return new C17530d(zM8782j9);
            case 25:
                int iM8789q9 = AbstractC8191s5.m8789q(parcel);
                int iM8785m4 = 0;
                C17537k c17537k = null;
                String strM8776d12 = null;
                while (parcel.dataPosition() < iM8789q9) {
                    int i18 = parcel.readInt();
                    char c12 = (char) i18;
                    if (c12 == 1) {
                        c17537k = (C17537k) AbstractC8191s5.m8775c(parcel, i18, C17537k.CREATOR);
                    } else if (c12 == 2) {
                        strM8776d12 = AbstractC8191s5.m8776d(parcel, i18);
                    } else if (c12 != 3) {
                        AbstractC8191s5.m8788p(parcel, i18);
                    } else {
                        iM8785m4 = AbstractC8191s5.m8785m(parcel, i18);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q9);
                return new C17534h(c17537k, strM8776d12, iM8785m4);
            case 26:
                int iM8789q10 = AbstractC8191s5.m8789q(parcel);
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < iM8789q10) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 1) {
                        AbstractC8191s5.m8788p(parcel, i19);
                    } else {
                        pendingIntent2 = (PendingIntent) AbstractC8191s5.m8775c(parcel, i19, PendingIntent.CREATOR);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q10);
                return new C17535i(pendingIntent2);
            case 27:
                int iM8789q11 = AbstractC8191s5.m8789q(parcel);
                String strM8776d13 = null;
                String strM8776d14 = null;
                String strM8776d15 = null;
                String strM8776d16 = null;
                Uri uri = null;
                String strM8776d17 = null;
                String strM8776d18 = null;
                String strM8776d19 = null;
                C4601u c4601u = null;
                while (parcel.dataPosition() < iM8789q11) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            strM8776d13 = AbstractC8191s5.m8776d(parcel, i20);
                            break;
                        case 2:
                            strM8776d14 = AbstractC8191s5.m8776d(parcel, i20);
                            break;
                        case 3:
                            strM8776d15 = AbstractC8191s5.m8776d(parcel, i20);
                            break;
                        case 4:
                            strM8776d16 = AbstractC8191s5.m8776d(parcel, i20);
                            break;
                        case 5:
                            uri = (Uri) AbstractC8191s5.m8775c(parcel, i20, Uri.CREATOR);
                            break;
                        case 6:
                            strM8776d17 = AbstractC8191s5.m8776d(parcel, i20);
                            break;
                        case 7:
                            strM8776d18 = AbstractC8191s5.m8776d(parcel, i20);
                            break;
                        case '\b':
                            strM8776d19 = AbstractC8191s5.m8776d(parcel, i20);
                            break;
                        case '\t':
                            c4601u = (C4601u) AbstractC8191s5.m8775c(parcel, i20, C4601u.CREATOR);
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i20);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q11);
                return new C17536j(strM8776d13, strM8776d14, strM8776d15, strM8776d16, uri, strM8776d17, strM8776d18, strM8776d19, c4601u);
            case 28:
                int iM8789q12 = AbstractC8191s5.m8789q(parcel);
                String strM8776d20 = null;
                String strM8776d21 = null;
                while (parcel.dataPosition() < iM8789q12) {
                    int i21 = parcel.readInt();
                    char c13 = (char) i21;
                    if (c13 == 1) {
                        strM8776d20 = AbstractC8191s5.m8776d(parcel, i21);
                    } else if (c13 != 2) {
                        AbstractC8191s5.m8788p(parcel, i21);
                    } else {
                        strM8776d21 = AbstractC8191s5.m8776d(parcel, i21);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q12);
                return new C17537k(strM8776d20, strM8776d21);
            default:
                int iM8789q13 = AbstractC8191s5.m8789q(parcel);
                Bundle bundleM8773a = null;
                int iM8785m5 = 0;
                int iM8785m6 = 0;
                while (parcel.dataPosition() < iM8789q13) {
                    int i22 = parcel.readInt();
                    char c14 = (char) i22;
                    if (c14 == 1) {
                        iM8785m5 = AbstractC8191s5.m8785m(parcel, i22);
                    } else if (c14 == 2) {
                        iM8785m6 = AbstractC8191s5.m8785m(parcel, i22);
                    } else if (c14 != 3) {
                        AbstractC8191s5.m8788p(parcel, i22);
                    } else {
                        bundleM8773a = AbstractC8191s5.m8773a(parcel, i22);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q13);
                return new C18647a(iM8785m5, iM8785m6, bundleM8773a);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f41978a) {
            case 0:
                return new C13281b[i10];
            case 1:
                return new C13283d[i10];
            case 2:
                return new C13282c[i10];
            case 3:
                return new C13284e[i10];
            case 4:
                return new C13532a[i10];
            case 5:
                return new C13536e[i10];
            case 6:
                return new C13537f[i10];
            case 7:
                return new C13540i[i10];
            case 8:
                return new C13541j[i10];
            case 9:
                return new C13815a[i10];
            case 10:
                return new C14026F0[i10];
            case 11:
                return new C16281a[i10];
            case 12:
                return new C16290j[i10];
            case 13:
                return new C16834b[i10];
            case 14:
                return new EnumC17058a[i10];
            case 15:
                return new EnumC17061d[i10];
            case 16:
                return new C17062e[i10];
            case 17:
                return new C17280a[i10];
            case 18:
                return new C17531e[i10];
            case 19:
                return new C17532f[i10];
            case 20:
                return new C17533g[i10];
            case 21:
                return new C17527a[i10];
            case 22:
                return new C17528b[i10];
            case 23:
                return new C17529c[i10];
            case 24:
                return new C17530d[i10];
            case 25:
                return new C17534h[i10];
            case 26:
                return new C17535i[i10];
            case 27:
                return new C17536j[i10];
            case 28:
                return new C17537k[i10];
            default:
                return new C18647a[i10];
        }
    }
}
